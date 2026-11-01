package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class h2 extends android.ext.c {
    private static a.e q;
    public java.lang.String l;
    public boolean m;
    public byte n;
    public long o;
    public long p;

    static {
            a.e r0 = new a.e
            r0.<init>()
            android.ext.h2.q = r0
            updateLocale()
            java.lang.Class<android.ext.h2> r0 = android.ext.h2.class
            android.ext.k.h(r0)
            return
    }

    public h2() {
            r0 = this;
            r0.<init>()
            return
    }

    public h2(long r1, long r3, int r5) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            return
    }

    public h2(long r1, long r3, int r5, java.lang.String r6) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            if (r6 == 0) goto L11
            java.lang.String r1 = r0.b0()
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L11
            r0.l = r6
        L11:
            return
    }

    public h2(long r1, long r3, int r5, java.lang.String r6, boolean r7, byte r8) {
            r0 = this;
            r0.<init>(r1, r3, r5, r6)
            r0.m = r7
            r0.d0(r8)
            return
    }

    public h2(long r1, long r3, int r5, java.lang.String r6, boolean r7, byte r8, long r9, long r11) {
            r0 = this;
            r0.<init>(r1, r3, r5, r6, r7, r8)
            r0.o = r9
            r0.p = r11
            return
    }

    public h2(android.ext.c r7) {
            r6 = this;
            long r1 = r7.f672a
            long r3 = r7.f673b
            int r5 = r7.f674c
            r0 = r6
            r0.<init>(r1, r3, r5)
            boolean r0 = r7 instanceof android.ext.h2
            if (r0 == 0) goto L27
            android.ext.h2 r7 = (android.ext.h2) r7
            java.lang.String r0 = r7.l
            if (r0 == 0) goto L16
            r6.l = r0
        L16:
            boolean r0 = r7.m
            r6.m = r0
            byte r0 = r7.n
            r6.d0(r0)
            long r0 = r7.o
            r6.o = r0
            long r0 = r7.p
            r6.p = r0
        L27:
            return
    }

    public static a.e a0() {
            a.e r0 = android.ext.h2.q
            return r0
    }

    public static void updateLocale() {
            java.lang.String r0 = "dqgurlg1frqwhqw1Frqwh{w"
            java.lang.String r1 = "g5g|qr/Hq|e|/Wudvg/Dtxd"
            java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)
            java.lang.String r2 = ","
            java.lang.String[] r1 = r1.split(r2)
            r3 = 2
            r4 = 1
            r5 = 0
            java.lang.String r6 = "dqgurlg1h{w1PdlqVhuylfh"
            java.lang.String r6 = android.ext.Tools.removeNewLinesChars(r6)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r7 = "frqwh{w"
            java.lang.String r7 = android.ext.Tools.removeNewLinesChars(r7)     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Field r6 = r6.getField(r7)     // Catch: java.lang.Throwable -> L2b4
            a.e r7 = android.ext.h2.q     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r7 = android.ext.Tools.removeNewLinesChars(r0)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r8 = "jhwSdfndjhQdph"
            java.lang.String r8 = android.ext.Tools.removeNewLinesChars(r8)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object r7 = r7.invoke(r6, r8)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r0 = android.ext.Tools.removeNewLinesChars(r0)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r8 = "jhwSdfndjhPdqdjhu"
            java.lang.String r8 = android.ext.Tools.removeNewLinesChars(r8)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Method r0 = r0.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object r0 = r0.invoke(r6, r8)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r8 = "dqgurlg1frqwhqw1sp1SdfndjhPdqdjhu"
            java.lang.String r8 = android.ext.Tools.removeNewLinesChars(r8)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r9 = "jhwSdfndjhLqir"
            java.lang.String r9 = android.ext.Tools.removeNewLinesChars(r9)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r11 = "mdyd1odqj1Vwulqj"
            java.lang.String r11 = android.ext.Tools.removeNewLinesChars(r11)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L2b4
            r10[r5] = r11     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r11 = "mdyd1odqj1Lqwhjhu"
            java.lang.String r11 = android.ext.Tools.removeNewLinesChars(r11)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r12 = "W\\SH"
            java.lang.String r12 = android.ext.Tools.removeNewLinesChars(r12)     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Field r11 = r11.getField(r12)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object r11 = r11.get(r6)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r11 = (java.lang.Class) r11     // Catch: java.lang.Throwable -> L2b4
            r10[r4] = r11     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2b4
            r9[r5] = r7     // Catch: java.lang.Throwable -> L2b4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2b4
            r9[r4] = r10     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object r0 = r8.invoke(r0, r9)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r8 = "mdyd1odqj1V|vwhp"
            java.lang.String r8 = android.ext.Tools.removeNewLinesChars(r8)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r9 = "fxuuhqwWlphPloolv"
            java.lang.String r9 = android.ext.Tools.removeNewLinesChars(r9)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2b4
            r10 = 0
            java.lang.Object r8 = r8.invoke(r10, r9)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L2b4
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r10 = "dqgurlg1frqwhqw1sp1SdfndjhLqir"
            java.lang.String r10 = android.ext.Tools.removeNewLinesChars(r10)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r11 = "odvwXsgdwhWlph"
            java.lang.String r11 = android.ext.Tools.removeNewLinesChars(r11)     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Field r10 = r10.getField(r11)     // Catch: java.lang.Throwable -> L2b4
            long r10 = r10.getLong(r0)     // Catch: java.lang.Throwable -> L2b4
            long r8 = r8 - r10
            r0 = 26
            long r8 = r8 >> r0
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L2b4
            android.content.Context r10 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r10 = r10.getPackageResourcePath()     // Catch: java.lang.Throwable -> L2b4
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r10 = "dvvhwv2/uhv2udz2/fodvvhv51gh{"
            java.lang.String r10 = android.ext.Tools.removeNewLinesChars(r10)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String[] r2 = r10.split(r2)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r10 = "uhv2udz2|gz"
            java.lang.String r10 = android.ext.Tools.removeNewLinesChars(r10)     // Catch: java.lang.Throwable -> L2b4
            java.util.Enumeration r11 = r0.entries()     // Catch: java.lang.Throwable -> L2b4
        L109:
            boolean r12 = r11.hasMoreElements()     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r13 = "e|whRughuPdvn"
            java.lang.String r14 = "dqgurlg1h{w1LqRxw"
            if (r12 == 0) goto L19a
            java.lang.Object r12 = r11.nextElement()     // Catch: java.lang.Throwable -> L2b4
            java.util.zip.ZipEntry r12 = (java.util.zip.ZipEntry) r12     // Catch: java.lang.Throwable -> L2b4
            r15 = 0
        L11a:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L2b4
            if (r15 >= r5) goto L197
            java.lang.String r5 = android.ext.Tools.removeNewLinesChars(r14)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r13)     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Field r3 = r5.getField(r3)     // Catch: java.lang.Throwable -> L2b4
            r5 = r2[r15]     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r16 = android.ext.Tools.removeNewLinesChars(r14)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r4 = java.lang.Class.forName(r16)     // Catch: java.lang.Throwable -> L2b4
            r16 = r11
            java.lang.String r11 = android.ext.Tools.removeNewLinesChars(r13)     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Field r4 = r4.getField(r11)     // Catch: java.lang.Throwable -> L2b4
            r11 = r2[r15]     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object r4 = r4.get(r11)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L2b4
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L2b4
            int r11 = r1.length     // Catch: java.lang.Throwable -> L2b4
            int r11 = r11 + r15
            r17 = 1
            int r11 = r17 << r11
            r18 = r1
            int r1 = (int) r8     // Catch: java.lang.Throwable -> L2b4
            int r11 = r11 * r1
            if (r12 == 0) goto L17e
            java.lang.String r1 = r12.getName()     // Catch: java.lang.Throwable -> L2b4
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L2b4
            if (r1 < 0) goto L17e
            java.lang.String r1 = r12.getName()     // Catch: java.lang.Throwable -> L2b4
            r19 = r0
            r0 = r2[r15]     // Catch: java.lang.Throwable -> L2b4
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L2b4
            if (r0 == 0) goto L180
            java.lang.String r0 = r12.getName()     // Catch: java.lang.Throwable -> L2b4
            boolean r0 = r0.startsWith(r10)     // Catch: java.lang.Throwable -> L2b4
            if (r0 != 0) goto L180
            r0 = 1
            goto L181
        L17e:
            r19 = r0
        L180:
            r0 = 0
        L181:
            int r11 = r11 * r0
            r0 = r4 ^ r11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2b4
            r3.set(r5, r0)     // Catch: java.lang.Throwable -> L2b4
            int r15 = r15 + 1
            r11 = r16
            r1 = r18
            r0 = r19
            r3 = 2
            r4 = 1
            goto L11a
        L197:
            r5 = 0
            goto L109
        L19a:
            r19 = r0
            r18 = r1
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r2 = "fodvvhv1gh{"
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r2 = "uhvrxufhv1duvf"
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.Throwable -> L2b4
            r2 = 0
            r3 = 0
        L1ad:
            if (r3 >= r0) goto L2b1
            r0 = r1[r3]     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = "dqgurlg1h{w1FrqiljOlvwDgdswhu"
            java.lang.String r4 = android.ext.Tools.removeNewLinesChars(r4)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r5 = "GHYV"
            java.lang.String r5 = android.ext.Tools.removeNewLinesChars(r5)     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Field r4 = r4.getField(r5)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r5 = "rxuf"
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L2b4
            if (r0 == 0) goto L21b
            java.lang.String r0 = "nlulq~w1ph2~VHQSDL~glvfrug1jj2~sd|sdo~&&&&&&~Uhyr"
            java.lang.String r0 = android.ext.Tools.removeNewLinesChars(r0)     // Catch: java.lang.Throwable -> L2b4
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r0 = r0.toLowerCase(r2)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = "\\{"
            java.lang.String[] r0 = r0.split(r4)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = "dqgurlg1h{w1Uh"
            java.lang.String r4 = android.ext.Tools.removeNewLinesChars(r4)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r5 = "v"
            java.lang.String r5 = android.ext.Tools.removeNewLinesChars(r5)     // Catch: java.lang.Throwable -> L2b4
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r15 = 0
            r11[r15] = r12     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Method r4 = r4.getMethod(r5, r11)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r10 = "&&&bbgrzqordgbb&&&bbiurqwbwh{wbb&&&bbkhosbidtb65btbb&&&bbkhosbidtb65bebb&&&bbuwipbb&&&bbkhosbiurqwbb&&&bbhpsw|bolvwbb&&&bbvhdufkbklqwbb&&&bbvshhgkdfnbklqwbb&&&bbqrwklqjbirxqgbb&&&bbwu|bpruhbudqjhvbb&&&bbwu|bix}}|bvhdufkbb&&&"
            java.lang.String r10 = android.ext.Tools.removeNewLinesChars(r10)     // Catch: java.lang.Throwable -> L2b4
            r5[r15] = r10     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object r4 = r4.invoke(r6, r5)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = r4.toLowerCase(r2)     // Catch: java.lang.Throwable -> L2b4
            r2 = 1
            goto L21d
        L21b:
            r0 = r18
        L21d:
            r5 = 0
        L21e:
            int r10 = r0.length     // Catch: java.lang.Throwable -> L2b4
            if (r5 >= r10) goto L2aa
            java.lang.String r10 = android.ext.Tools.removeNewLinesChars(r14)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r11 = android.ext.Tools.removeNewLinesChars(r13)     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Field r10 = r10.getField(r11)     // Catch: java.lang.Throwable -> L2b4
            if (r2 != 0) goto L26a
            java.lang.String r15 = android.ext.Tools.removeNewLinesChars(r14)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r11 = android.ext.Tools.removeNewLinesChars(r13)     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Field r11 = r15.getField(r11)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object r11 = r11.get(r7)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L2b4
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L2b4
            r12 = 1
            int r15 = r12 << r5
            r20 = 0
            int r12 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r12 == 0) goto L263
            if (r4 == 0) goto L263
            r12 = r0[r5]     // Catch: java.lang.Throwable -> L2b4
            boolean r12 = r4.contains(r12)     // Catch: java.lang.Throwable -> L2b4
            if (r12 == 0) goto L261
            goto L263
        L261:
            r12 = r2
            goto L265
        L263:
            int r12 = 1 - r2
        L265:
            int r15 = r15 * r12
            int r12 = ~r15     // Catch: java.lang.Throwable -> L2b4
            r11 = r11 & r12
            goto L29f
        L26a:
            java.lang.String r11 = android.ext.Tools.removeNewLinesChars(r14)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r12 = android.ext.Tools.removeNewLinesChars(r13)     // Catch: java.lang.Throwable -> L2b4
            java.lang.reflect.Field r11 = r11.getField(r12)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Object r11 = r11.get(r7)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L2b4
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L2b4
            r12 = 1
            int r15 = r12 << r5
            r20 = 0
            int r12 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r12 == 0) goto L29a
            if (r4 == 0) goto L29a
            r12 = r0[r5]     // Catch: java.lang.Throwable -> L2b4
            boolean r12 = r4.contains(r12)     // Catch: java.lang.Throwable -> L2b4
            if (r12 != 0) goto L298
            goto L29a
        L298:
            r12 = r2
            goto L29c
        L29a:
            int r12 = 1 - r2
        L29c:
            int r15 = r15 * r12
            r11 = r11 | r15
        L29f:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L2b4
            r10.set(r7, r11)     // Catch: java.lang.Throwable -> L2b4
            int r5 = r5 + 1
            goto L21e
        L2aa:
            int r3 = r3 + 1
            r18 = r0
            r0 = 2
            goto L1ad
        L2b1:
            r19.close()     // Catch: java.lang.Throwable -> L2b4
        L2b4:
            a.e r0 = android.ext.h2.q
            r1 = 2131296491(0x7f0900eb, float:1.82109E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            r0.put(r2, r1)
            a.e r0 = android.ext.h2.q
            r1 = 2131296490(0x7f0900ea, float:1.8210898E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 1
            r0.put(r2, r1)
            a.e r0 = android.ext.h2.q
            r1 = 2131296489(0x7f0900e9, float:1.8210896E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 2
            r0.put(r2, r1)
            a.e r0 = android.ext.h2.q
            r1 = 2131296484(0x7f0900e4, float:1.8210886E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 3
            r0.put(r2, r1)
            return
    }

    public android.ext.h2 Y() {
            r14 = this;
            android.ext.h2 r13 = new android.ext.h2
            long r1 = r14.f672a
            long r3 = r14.f673b
            int r5 = r14.f674c
            java.lang.String r6 = r14.l
            boolean r7 = r14.m
            byte r8 = r14.n
            long r9 = r14.o
            long r11 = r14.p
            r0 = r13
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r11)
            return r13
    }

    public int Z() {
            r2 = this;
            boolean r0 = r2.m
            if (r0 != 0) goto L8
            r0 = 2130968632(0x7f040038, float:1.7545923E38)
            goto L28
        L8:
            byte r0 = r2.n
            if (r0 == 0) goto L25
            r1 = 1
            if (r0 == r1) goto L21
            r1 = 2
            if (r0 == r1) goto L1d
            r1 = 3
            if (r0 == r1) goto L19
            r0 = 0
            r2.n = r0
            goto L25
        L19:
            r0 = 2130968591(0x7f04000f, float:1.754584E38)
            goto L28
        L1d:
            r0 = 2130968605(0x7f04001d, float:1.7545868E38)
            goto L28
        L21:
            r0 = 2130968663(0x7f040057, float:1.7545986E38)
            goto L28
        L25:
            r0 = 2130968608(0x7f040020, float:1.7545874E38)
        L28:
            return r0
    }

    public java.lang.String b0() {
            r2 = this;
            java.lang.String r0 = r2.l
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Var #"
            r0.append(r1)
            java.lang.String r1 = r2.F()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.ext.c
    public /* bridge */ /* synthetic */ android.ext.c c() {
            r1 = this;
            android.ext.h2 r0 = r1.Y()
            return r0
    }

    public java.lang.String c0(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L5
            long r0 = r3.o
            goto L7
        L5:
            long r0 = r3.p
        L7:
            int r4 = r3.f674c
            r2 = 16
            if (r4 != r2) goto L12
            java.lang.String r4 = android.ext.b0.e(r0)
            goto L1f
        L12:
            r2 = 64
            if (r4 != r2) goto L1b
            java.lang.String r4 = android.ext.b0.b(r0)
            goto L1f
        L1b:
            java.lang.String r4 = android.ext.i0.c(r0, r4)
        L1f:
            java.lang.String r4 = r4.trim()
            return r4
    }

    public void d0(int r2) {
            r1 = this;
            byte r2 = (byte) r2
            if (r2 == 0) goto Ld
            r0 = 1
            if (r2 == r0) goto Ld
            r0 = 2
            if (r2 == r0) goto Ld
            r0 = 3
            if (r2 == r0) goto Ld
            r2 = 0
        Ld:
            r1.n = r2
            return
    }

    public void e0(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            r0 = 0
            int r2 = r7.f674c
            r3 = 2131296829(0x7f09023d, float:1.8211586E38)
            r4 = 0
            r1 = r8
            android.ext.t1$b r0 = android.ext.c.W(r0, r1, r2, r3, r4)
            r1 = 0
            int r3 = r7.f674c
            r4 = 2131296829(0x7f09023d, float:1.8211586E38)
            r5 = 0
            r2 = r9
            android.ext.t1$b r1 = android.ext.c.W(r1, r2, r3, r4, r5)
            long r2 = r0.f1261a
            long r4 = r1.f1261a
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L33
            int r6 = r7.f674c
            boolean r2 = android.ext.i0.a(r4, r2, r6)
            if (r2 != 0) goto L33
            long r8 = r0.f1261a
            r7.o = r8
            long r8 = r1.f1261a
            r7.p = r8
            return
        L33:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            java.lang.String r9 = " ("
            r2.append(r9)
            long r3 = r1.f1261a
            int r1 = r7.f674c
            java.lang.String r1 = android.ext.i0.c(r3, r1)
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r9)
            long r8 = r0.f1261a
            int r0 = r7.f674c
            java.lang.String r8 = android.ext.i0.c(r8, r0)
            r3.append(r8)
            r3.append(r1)
            java.lang.String r8 = r3.toString()
            android.ext.t1$a r9 = new android.ext.t1$a
            r0 = 2131296882(0x7f090272, float:1.8211693E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r2
            r3 = 1
            r1[r3] = r8
            java.lang.String r0 = android.ext.Tools.L1(r0, r1)
            r9.<init>(r0)
            r9.c(r2)
            r9.c(r8)
            throw r9
    }

    @Override // android.ext.c
    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "; "
            r0.append(r1)
            java.lang.String r2 = r6.l
            r0.append(r2)
            boolean r2 = r6.m
            java.lang.String r3 = ""
            if (r2 != 0) goto L1d
            goto L62
        L1d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            a.e r4 = android.ext.h2.q
            byte r5 = r6.n
            java.lang.Object r4 = r4.get(r5)
            r2.append(r4)
            byte r4 = r6.n
            r5 = 3
            if (r4 != r5) goto L5b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " ["
            r3.append(r4)
            r4 = 1
            java.lang.String r4 = r6.c0(r4)
            r3.append(r4)
            r3.append(r1)
            r1 = 0
            java.lang.String r1 = r6.c0(r1)
            r3.append(r1)
            r1 = 93
            r3.append(r1)
            java.lang.String r3 = r3.toString()
        L5b:
            r2.append(r3)
            java.lang.String r3 = r2.toString()
        L62:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
