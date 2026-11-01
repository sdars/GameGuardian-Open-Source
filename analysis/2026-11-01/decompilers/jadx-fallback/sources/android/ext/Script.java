package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Script extends luaj.lib.TwoArgFunction implements luaj.lib.e {
    private static volatile int n0;
    private static java.lang.ref.WeakReference o0;
    static volatile java.util.ArrayList p0;
    static volatile int q0;
    static final java.util.Map r0 = null;
    static volatile long s0;
    static final luaj.LuaString[] t0 = null;
    static final int[] u0 = null;
    static final int[] v0 = null;
    static android.ext.Script.DebugLog w0;
    final luaj.Globals T;
    final java.lang.Object U;
    final java.lang.Thread V;
    final android.ext.Script.Logger W;
    final int X;
    final java.lang.String Y;
    private final byte Z;
    private volatile int a0;
    private volatile byte b0;
    volatile boolean c0;
    byte d0;
    boolean e0;
    volatile int f0;
    android.ext.Script.Consts g0;
    private java.lang.String h0;
    private java.lang.String i0;
    private java.lang.String j0;
    private java.lang.String k0;
    volatile java.lang.String l0;
    volatile android.ext.Script.SavedState m0;


    public static abstract class ApiFunction extends luaj.lib.VarArgFunction {
        static java.lang.ref.WeakReference Y;
        static java.lang.ref.WeakReference Z;
        private static java.util.Map a0;
        private static java.util.Map b0;
        private static java.util.Map c0;
        private static java.util.Map d0;
        private volatile luaj.Varargs T;
        private volatile java.lang.Throwable U;
        protected volatile java.lang.Object V;
        private final boolean W;
        private java.lang.String X;


        static {
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r1 = 0
                r0.<init>(r1)
                android.ext.Script.ApiFunction.Y = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r1)
                android.ext.Script.ApiFunction.Z = r0
                android.ext.Script.ApiFunction.a0 = r1
                android.ext.Script.ApiFunction.b0 = r1
                android.ext.Script.ApiFunction.c0 = r1
                android.ext.Script.ApiFunction.d0 = r1
                return
        }

        public ApiFunction() {
                r1 = this;
                r1.<init>()
                boolean r0 = r1 instanceof android.ext.Script.BusyApiFunction
                r1.W = r0
                r0 = 0
                r1.T = r0
                r1.U = r0
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.V = r0
                return
        }

        private static java.util.Map X2(int r4) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1 = 0
            L6:
                r2 = 8
                if (r1 >= r2) goto L1b
                r2 = 1
                int r2 = r2 << r1
                r2 = r2 & r4
                if (r2 == 0) goto L18
                luaj.LuaString[] r2 = android.ext.Script.t0
                r2 = r2[r1]
                luaj.LuaValue r3 = luaj.LuaValue.f1671c
                r0.put(r2, r3)
            L18:
                int r1 = r1 + 1
                goto L6
            L1b:
                return r0
        }

        static boolean e3(android.ext.Script.ApiFunction r2, java.io.Writer r3, int r4, luaj.LuaValue r5) {
                boolean r0 = r5 instanceof luaj.LuaString
                if (r0 == 0) goto Ld
                java.lang.String r2 = r5.g0()
                boolean r2 = android.ext.Script.Consts.d(r3, r2)
                return r2
            Ld:
                boolean r0 = r5 instanceof luaj.LuaTable
                r1 = 1
                if (r0 == 0) goto L6b
                if (r2 == 0) goto L64
                if (r4 != r1) goto L64
                boolean r4 = r2 instanceof android.ext.Script.removeResults
                if (r4 != 0) goto L58
                boolean r4 = r2 instanceof android.ext.Script.loadResults
                if (r4 != 0) goto L58
                boolean r4 = r2 instanceof android.ext.Script.getValues
                if (r4 == 0) goto L23
                goto L58
            L23:
                boolean r4 = r2 instanceof android.ext.Script.setValues
                if (r4 == 0) goto L33
                java.util.Map r2 = android.ext.Script.ApiFunction.b0
                if (r2 != 0) goto L65
                r2 = 7
                java.util.Map r2 = X2(r2)
                android.ext.Script.ApiFunction.b0 = r2
                goto L65
            L33:
                boolean r4 = r2 instanceof android.ext.Script.getValuesRange
                if (r4 != 0) goto L4d
                boolean r4 = r2 instanceof android.ext.Script.removeListItems
                if (r4 == 0) goto L3c
                goto L4d
            L3c:
                boolean r2 = r2 instanceof android.ext.Script.addListItems
                if (r2 == 0) goto L64
                java.util.Map r2 = android.ext.Script.ApiFunction.d0
                if (r2 != 0) goto L65
                r2 = 255(0xff, float:3.57E-43)
                java.util.Map r2 = X2(r2)
                android.ext.Script.ApiFunction.d0 = r2
                goto L65
            L4d:
                java.util.Map r2 = android.ext.Script.ApiFunction.c0
                if (r2 != 0) goto L65
                java.util.Map r2 = X2(r1)
                android.ext.Script.ApiFunction.c0 = r2
                goto L65
            L58:
                java.util.Map r2 = android.ext.Script.ApiFunction.a0
                if (r2 != 0) goto L65
                r2 = 5
                java.util.Map r2 = X2(r2)
                android.ext.Script.ApiFunction.a0 = r2
                goto L65
            L64:
                r2 = 0
            L65:
                luaj.LuaTable r5 = (luaj.LuaTable) r5
                r5.E3(r3, r2)
                goto L72
            L6b:
                java.lang.String r2 = r5.g0()
                r3.write(r2)
            L72:
                return r1
        }

        private void f3(java.io.Writer r5, luaj.Varargs r6) {
                r4 = this;
                int r0 = r6.U()
                int r1 = r4.Y2()
                if (r1 < 0) goto Ld
                if (r0 <= r1) goto Ld
                r0 = r1
            Ld:
                r1 = 1
                r2 = 1
            Lf:
                if (r2 > r0) goto L26
                if (r2 == r1) goto L18
                java.lang.String r3 = ", "
                r5.write(r3)
            L18:
                luaj.LuaValue r3 = r6.v(r2)
                boolean r3 = r4.d3(r5, r2, r3)
                if (r3 != 0) goto L23
                goto L26
            L23:
                int r2 = r2 + 1
                goto Lf
            L26:
                return
        }

        protected static boolean g3(java.io.Writer r0, android.ext.Script.Const[] r1, luaj.LuaValue r2) {
                int r2 = r2.y2()
                boolean r0 = android.ext.Script.Consts.a(r0, r1, r2)
                return r0
        }

        protected static boolean h3(java.io.Writer r2, luaj.LuaValue r3) {
                long r0 = r3.z2()
                boolean r2 = android.ext.Script.Consts.b(r2, r0)
                return r2
        }

        @Override // luaj.LuaFunction
        public java.lang.String T2() {
                r1 = this;
                java.lang.String r0 = r1.X
                if (r0 != 0) goto La
                java.lang.String r0 = super.T2()
                r1.X = r0
            La:
                return r0
        }

        protected abstract int Y2();

        protected java.lang.String Z2() {
                r1 = this;
                r0 = 0
                return r0
        }

        protected luaj.Varargs a3() {
                r1 = this;
                luaj.LuaBoolean r0 = luaj.LuaValue.f1672d
                return r0
        }

        public luaj.Varargs b3(luaj.Varargs r3) {
                r2 = this;
                r0 = 0
                r2.T = r0
                r2.U = r0
                android.ext.Script$ApiFunction$1 r1 = new android.ext.Script$ApiFunction$1
                r1.<init>(r2, r3)
                java.lang.Object r3 = r2.V
                monitor-enter(r3)
                android.ext.n2.i(r1)     // Catch: java.lang.Throwable -> L46
                java.lang.Object r1 = r2.V     // Catch: java.lang.Throwable -> L46
                android.ext.Script.W3(r1)     // Catch: java.lang.Throwable -> L46
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
                java.lang.Throwable r3 = r2.U
                r2.U = r0
                if (r3 == 0) goto L2b
                r2.T = r0
                boolean r0 = r3 instanceof java.lang.RuntimeException
                if (r0 == 0) goto L25
                java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
                throw r3
            L25:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r3)
                throw r0
            L2b:
                luaj.Varargs r3 = r2.T
                r2.T = r0
                boolean r0 = r2.W
                if (r0 == 0) goto L45
                if (r3 == 0) goto L36
                goto L45
            L36:
                java.lang.String r3 = r2.Z2()
                if (r3 != 0) goto L41
                luaj.Varargs r3 = r2.a3()
                goto L45
            L41:
                luaj.LuaString r3 = luaj.LuaValue.K2(r3)
            L45:
                return r3
            L46:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
                throw r0
        }

        public luaj.Varargs c3(luaj.Varargs r1) {
                r0 = this;
                luaj.LuaValue r1 = luaj.LuaValue.f1671c
                return r1
        }

        protected boolean d3(java.io.Writer r1, int r2, luaj.LuaValue r3) {
                r0 = this;
                boolean r1 = e3(r0, r1, r2, r3)
                return r1
        }

        @Override // luaj.lib.LibFunction, luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
        public java.lang.String g0() {
                r4 = this;
                java.lang.String r0 = r4.k3()
                java.lang.String r1 = "["
                java.lang.String r2 = ""
                java.lang.String r1 = r0.replace(r1, r2)
                java.lang.String r3 = "]"
                java.lang.String r1 = r1.replace(r3, r2)
                java.lang.String r2 = " ,"
                java.lang.String r3 = ","
                java.lang.String r1 = r1.replace(r2, r3)
                java.lang.ref.WeakReference r2 = android.ext.Script.ApiFunction.Y
                java.lang.Object r2 = r2.get()
                java.util.regex.Pattern r2 = (java.util.regex.Pattern) r2
                if (r2 != 0) goto L32
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                java.lang.String r3 = ".*(\\(.*\\)).*"
                java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
                r2.<init>(r3)
                android.ext.Script.ApiFunction.Y = r2
                r2 = r3
            L32:
                java.util.regex.Matcher r1 = r2.matcher(r1)
                java.lang.String r2 = "$1"
                java.lang.String r1 = r1.replaceAll(r2)
                java.lang.ref.WeakReference r2 = android.ext.Script.ApiFunction.Z
                java.lang.Object r2 = r2.get()
                java.util.regex.Pattern r2 = (java.util.regex.Pattern) r2
                if (r2 != 0) goto L54
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                java.lang.String r3 = "(?<=[\\(,])( ?)\\s*\\S*\\s*(\\S*)(\\s*=\\s*[^,\\)]*)?(?=[,\\)])"
                java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
                r2.<init>(r3)
                android.ext.Script.ApiFunction.Z = r2
                r2 = r3
            L54:
                java.util.regex.Matcher r1 = r2.matcher(r1)
                java.lang.String r2 = "$1$2"
                java.lang.String r1 = r1.replaceAll(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "function "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " end, -- "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
        }

        protected void i3(java.io.Writer r2, luaj.Varargs r3) {
                r1 = this;
                boolean r0 = r1 instanceof android.ext.Script.isVisible
                if (r0 != 0) goto L25
                boolean r0 = r1 instanceof android.ext.Script.internal1
                if (r0 != 0) goto L25
                boolean r0 = r1 instanceof android.ext.Script.internal2
                if (r0 != 0) goto L25
                boolean r0 = r1 instanceof android.ext.Script.sleep
                if (r0 == 0) goto L11
                goto L25
            L11:
                java.lang.String r0 = r1.T2()
                r2.write(r0)
                java.lang.String r0 = "("
                r2.write(r0)
                r1.f3(r2, r3)
                java.lang.String r3 = ")\n"
                r2.write(r3)
            L25:
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public final luaj.Varargs invoke(luaj.Varargs r15) {
                r14 = this;
                java.lang.ThreadLocal r0 = luaj.Varargs.f1676a
                java.lang.Object r1 = r0.get()
                luaj.lib.VarArgFunction r1 = (luaj.lib.VarArgFunction) r1
                r0.set(r14)
                luaj.LuaValue r2 = r15.w()     // Catch: java.lang.Throwable -> L2f
                boolean r3 = r2 instanceof luaj.LuaString     // Catch: java.lang.Throwable -> L2f
                if (r3 == 0) goto L32
                int r3 = r2.W1()     // Catch: java.lang.Throwable -> L2f
                r4 = 1000000(0xf4240, float:1.401298E-39)
                if (r3 <= r4) goto L32
                luaj.LuaString r2 = r2.G0()     // Catch: java.lang.Throwable -> L2f
                r3 = 0
                luaj.LuaString r2 = r2.j3(r3, r4)     // Catch: java.lang.Throwable -> L2f
                r3 = 2
                luaj.Varargs r15 = r15.e0(r3)     // Catch: java.lang.Throwable -> L2f
                luaj.Varargs r15 = luaj.LuaValue.N2(r2, r15)     // Catch: java.lang.Throwable -> L2f
                goto L32
            L2f:
                r15 = move-exception
                goto L176
            L32:
                android.ext.Script$DebugLog r2 = android.ext.Script.w0     // Catch: java.lang.Throwable -> L2f
                r3 = 1000000(0xf4240, double:4.940656E-318)
                if (r2 == 0) goto L6b
                long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
                java.io.Writer r7 = r2.f378a     // Catch: java.lang.Throwable -> L43
                r14.i3(r7, r15)     // Catch: java.lang.Throwable -> L43
                goto L5c
            L43:
                r7 = move-exception
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
                r8.<init>()     // Catch: java.lang.Throwable -> L2f
                java.lang.String r9 = "Failed write log for "
                r8.append(r9)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r9 = r14.T2()     // Catch: java.lang.Throwable -> L2f
                r8.append(r9)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2f
                android.ext.e1.s(r8, r7)     // Catch: java.lang.Throwable -> L2f
            L5c:
                luaj.Globals r7 = r2.f379b     // Catch: java.lang.Throwable -> L2f
                int r8 = r7.b0     // Catch: java.lang.Throwable -> L2f
                long r8 = (long) r8     // Catch: java.lang.Throwable -> L2f
                long r10 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
                long r10 = r10 - r5
                long r10 = r10 / r3
                long r8 = r8 + r10
                int r5 = (int) r8     // Catch: java.lang.Throwable -> L2f
                r7.b0 = r5     // Catch: java.lang.Throwable -> L2f
            L6b:
                luaj.Varargs r15 = r14.b3(r15)     // Catch: java.lang.Throwable -> L2f
                boolean r5 = r14 instanceof android.ext.Script.alert     // Catch: java.lang.Throwable -> L2f
                java.lang.String r6 = "Failed log for "
                java.lang.String r7 = " ]]\n"
                if (r5 != 0) goto L83
                boolean r5 = r14 instanceof android.ext.Script.prompt     // Catch: java.lang.Throwable -> L2f
                if (r5 != 0) goto L83
                boolean r5 = r14 instanceof android.ext.Script.choice     // Catch: java.lang.Throwable -> L2f
                if (r5 != 0) goto L83
                boolean r5 = r14 instanceof android.ext.Script.multiChoice     // Catch: java.lang.Throwable -> L2f
                if (r5 == 0) goto Lc7
            L83:
                if (r2 == 0) goto Lc7
                long r8 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
                java.io.Writer r5 = r2.f378a     // Catch: java.lang.Throwable -> L95
                java.lang.String r10 = "--[[ return: "
                r5.write(r10)     // Catch: java.lang.Throwable -> L95
                if (r15 != 0) goto L97
                java.lang.String r10 = "null"
                goto L9b
            L95:
                r5 = move-exception
                goto La2
            L97:
                java.lang.String r10 = r15.toString()     // Catch: java.lang.Throwable -> L95
            L9b:
                r5.write(r10)     // Catch: java.lang.Throwable -> L95
                r5.write(r7)     // Catch: java.lang.Throwable -> L95
                goto Lb8
            La2:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
                r10.<init>()     // Catch: java.lang.Throwable -> L2f
                r10.append(r6)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r11 = r14.T2()     // Catch: java.lang.Throwable -> L2f
                r10.append(r11)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L2f
                android.ext.e1.s(r10, r5)     // Catch: java.lang.Throwable -> L2f
            Lb8:
                luaj.Globals r5 = r2.f379b     // Catch: java.lang.Throwable -> L2f
                int r10 = r5.b0     // Catch: java.lang.Throwable -> L2f
                long r10 = (long) r10     // Catch: java.lang.Throwable -> L2f
                long r12 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
                long r12 = r12 - r8
                long r12 = r12 / r3
                long r10 = r10 + r12
                int r8 = (int) r10     // Catch: java.lang.Throwable -> L2f
                r5.b0 = r8     // Catch: java.lang.Throwable -> L2f
            Lc7:
                boolean r5 = r14 instanceof android.ext.Script.getResults     // Catch: java.lang.Throwable -> L2f
                if (r5 == 0) goto L114
                boolean r5 = r15 instanceof luaj.LuaTable     // Catch: java.lang.Throwable -> L2f
                if (r5 == 0) goto L114
                if (r2 == 0) goto L114
                long r8 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
                java.io.Writer r5 = r2.f378a     // Catch: java.lang.Throwable -> Lee
                java.lang.String r10 = "--[[ count: "
                r5.write(r10)     // Catch: java.lang.Throwable -> Lee
                r10 = r15
                luaj.LuaTable r10 = (luaj.LuaTable) r10     // Catch: java.lang.Throwable -> Lee
                int r10 = r10.W1()     // Catch: java.lang.Throwable -> Lee
                java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> Lee
                r5.write(r10)     // Catch: java.lang.Throwable -> Lee
                r5.write(r7)     // Catch: java.lang.Throwable -> Lee
                goto L105
            Lee:
                r5 = move-exception
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
                r10.<init>()     // Catch: java.lang.Throwable -> L2f
                r10.append(r6)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r11 = r14.T2()     // Catch: java.lang.Throwable -> L2f
                r10.append(r11)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L2f
                android.ext.e1.s(r10, r5)     // Catch: java.lang.Throwable -> L2f
            L105:
                luaj.Globals r5 = r2.f379b     // Catch: java.lang.Throwable -> L2f
                int r10 = r5.b0     // Catch: java.lang.Throwable -> L2f
                long r10 = (long) r10     // Catch: java.lang.Throwable -> L2f
                long r12 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
                long r12 = r12 - r8
                long r12 = r12 / r3
                long r10 = r10 + r12
                int r8 = (int) r10     // Catch: java.lang.Throwable -> L2f
                r5.b0 = r8     // Catch: java.lang.Throwable -> L2f
            L114:
                luaj.LuaBoolean r5 = luaj.LuaValue.f1672d     // Catch: java.lang.Throwable -> L2f
                if (r15 != r5) goto L172
                boolean r5 = r14 instanceof android.ext.Script.searchNumber     // Catch: java.lang.Throwable -> L2f
                if (r5 != 0) goto L130
                boolean r5 = r14 instanceof android.ext.Script.refineNumber     // Catch: java.lang.Throwable -> L2f
                if (r5 != 0) goto L130
                boolean r5 = r14 instanceof android.ext.Script.startFuzzy     // Catch: java.lang.Throwable -> L2f
                if (r5 != 0) goto L130
                boolean r5 = r14 instanceof android.ext.Script.searchFuzzy     // Catch: java.lang.Throwable -> L2f
                if (r5 != 0) goto L130
                boolean r5 = r14 instanceof android.ext.Script.searchAddress     // Catch: java.lang.Throwable -> L2f
                if (r5 != 0) goto L130
                boolean r5 = r14 instanceof android.ext.Script.refineAddress     // Catch: java.lang.Throwable -> L2f
                if (r5 == 0) goto L172
            L130:
                if (r2 == 0) goto L172
                long r8 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
                java.io.Writer r5 = r2.f378a     // Catch: java.lang.Throwable -> L14c
                java.lang.String r10 = "--[[ found: "
                r5.write(r10)     // Catch: java.lang.Throwable -> L14c
                android.ext.MainService r10 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L14c
                long r10 = r10.p0     // Catch: java.lang.Throwable -> L14c
                java.lang.String r10 = java.lang.Long.toString(r10)     // Catch: java.lang.Throwable -> L14c
                r5.write(r10)     // Catch: java.lang.Throwable -> L14c
                r5.write(r7)     // Catch: java.lang.Throwable -> L14c
                goto L163
            L14c:
                r5 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
                r7.<init>()     // Catch: java.lang.Throwable -> L2f
                r7.append(r6)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r6 = r14.T2()     // Catch: java.lang.Throwable -> L2f
                r7.append(r6)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L2f
                android.ext.e1.s(r6, r5)     // Catch: java.lang.Throwable -> L2f
            L163:
                luaj.Globals r2 = r2.f379b     // Catch: java.lang.Throwable -> L2f
                int r5 = r2.b0     // Catch: java.lang.Throwable -> L2f
                long r5 = (long) r5     // Catch: java.lang.Throwable -> L2f
                long r10 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
                long r10 = r10 - r8
                long r10 = r10 / r3
                long r5 = r5 + r10
                int r3 = (int) r5     // Catch: java.lang.Throwable -> L2f
                r2.b0 = r3     // Catch: java.lang.Throwable -> L2f
            L172:
                r0.set(r1)
                return r15
            L176:
                r0.set(r1)
                throw r15
        }

        public void j3(luaj.Varargs r4) {
                r3 = this;
                r0 = 0
                luaj.Varargs r4 = r3.c3(r4)     // Catch: java.lang.Throwable -> La
                r3.T = r4     // Catch: java.lang.Throwable -> L8
                goto L10
            L8:
                r0 = move-exception
                goto Le
            La:
                r4 = move-exception
                r2 = r0
                r0 = r4
                r4 = r2
            Le:
                r3.U = r0
            L10:
                boolean r1 = r3.W
                if (r1 == 0) goto L18
                if (r4 != 0) goto L18
                if (r0 == 0) goto L21
            L18:
                java.lang.Object r4 = r3.V
                monitor-enter(r4)
                java.lang.Object r0 = r3.V     // Catch: java.lang.Throwable -> L22
                r0.notifyAll()     // Catch: java.lang.Throwable -> L22
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
            L21:
                return
            L22:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
                throw r0
        }

        abstract java.lang.String k3();
    }

    abstract class BusyApiFunction extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        public BusyApiFunction(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                r0.V = r1
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected java.lang.String Z2() {
                r1 = this;
                android.ext.Script r0 = r1.e0
                java.lang.String r0 = r0.l0
                return r0
        }
    }

    static class Const {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f370b;

        public Const(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f369a = r1
                r0.f370b = r2
                return
        }
    }

    static class Consts {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.ext.Script.Const[] f371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.ext.Script.Const[] f372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.ext.Script.Const[] f373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        android.ext.Script.Const[] f374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        android.ext.Script.Const[] f375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        android.ext.Script.Const[] f376f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        android.ext.Script.Const[] f377g;
        android.ext.Script.Const[] h;
        android.ext.Script.Const[] i;
        android.ext.Script.Const[] j;

        Consts() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f371a = r0
                r1.f372b = r0
                r1.f373c = r0
                r1.f374d = r0
                r1.f375e = r0
                r1.f376f = r0
                r1.f377g = r0
                r1.h = r0
                r1.i = r0
                r1.j = r0
                return
        }

        static boolean a(java.io.Writer r8, android.ext.Script.Const[] r9, int r10) {
                r0 = 0
                int r1 = r9.length     // Catch: java.io.IOException -> L1e
                r2 = 1
                r3 = 0
                r4 = 1
            L5:
                if (r3 >= r1) goto L24
                r5 = r9[r3]     // Catch: java.io.IOException -> L1e
                int r6 = r5.f370b     // Catch: java.io.IOException -> L1e
                r7 = r10 & r6
                if (r7 != r6) goto L21
                java.lang.String r4 = r5.f369a     // Catch: java.io.IOException -> L1e
                r8.write(r4)     // Catch: java.io.IOException -> L1e
                int r4 = ~r6     // Catch: java.io.IOException -> L1e
                r10 = r10 & r4
                if (r10 == 0) goto L20
                java.lang.String r4 = " | "
                r8.write(r4)     // Catch: java.io.IOException -> L1e
                goto L20
            L1e:
                r8 = move-exception
                goto L30
            L20:
                r4 = 0
            L21:
                int r3 = r3 + 1
                goto L5
            L24:
                if (r4 != 0) goto L28
                if (r10 == 0) goto L2f
            L28:
                java.lang.String r9 = java.lang.Integer.toString(r10)     // Catch: java.io.IOException -> L1e
                r8.write(r9)     // Catch: java.io.IOException -> L1e
            L2f:
                return r2
            L30:
                java.lang.String r9 = "Writer fail"
                android.ext.e1.s(r9, r8)
                return r0
        }

        static boolean b(java.io.Writer r3, long r4) {
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto L1c
                r0 = -1
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto Ld
                goto L1c
            Ld:
                java.lang.String r0 = "0x"
                r3.write(r0)     // Catch: java.io.IOException -> L1a
                java.lang.String r4 = java.lang.Long.toHexString(r4)     // Catch: java.io.IOException -> L1a
            L16:
                r3.write(r4)     // Catch: java.io.IOException -> L1a
                goto L21
            L1a:
                r3 = move-exception
                goto L23
            L1c:
                java.lang.String r4 = java.lang.Long.toString(r4)     // Catch: java.io.IOException -> L1a
                goto L16
            L21:
                r3 = 1
                return r3
            L23:
                java.lang.String r4 = "Writer fail"
                android.ext.e1.s(r4, r3)
                r3 = 0
                return r3
        }

        static boolean c(java.io.Writer r0, java.lang.String r1) {
                java.lang.String r1 = android.ext.Script.E3(r1)
                boolean r0 = d(r0, r1)
                return r0
        }

        static boolean d(java.io.Writer r3, java.lang.String r4) {
                java.lang.String r0 = "\""
                r3.write(r0)     // Catch: java.io.IOException -> L1d
                int r1 = r4.length()     // Catch: java.io.IOException -> L1d
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 <= r2) goto Lf
                goto L15
            Lf:
                java.lang.String r1 = "\\\""
                java.lang.String r4 = r4.replace(r0, r1)     // Catch: java.io.IOException -> L1d
            L15:
                r3.write(r4)     // Catch: java.io.IOException -> L1d
                r3.write(r0)     // Catch: java.io.IOException -> L1d
                r3 = 1
                return r3
            L1d:
                r3 = move-exception
                java.lang.String r4 = "Writer fail"
                android.ext.e1.s(r4, r3)
                r3 = 0
                return r3
        }
    }

    public static abstract class DebugFunction extends android.ext.Script.ApiFunction {
        protected luaj.LuaClosure e0;

        public DebugFunction() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.e0 = r0
                return
        }

        public void l3(luaj.LuaClosure r1) {
                r0 = this;
                r0.e0 = r1
                return
        }
    }

    private static final class DebugLog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.io.Writer f378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final luaj.Globals f379b;

        DebugLog(java.io.Writer r1, luaj.Globals r2) {
                r0 = this;
                r0.<init>()
                r0.f378a = r1
                r0.f379b = r2
                return
        }
    }

    final class IoLibSafe extends luaj.lib.IoLib {
        private java.lang.String f0;
        final /* synthetic */ android.ext.Script g0;

        IoLibSafe(android.ext.Script r1) {
                r0 = this;
                r0.g0 = r1
                r0.<init>()
                r1 = 0
                r0.f0 = r1
                return
        }

        private luaj.lib.IoLib.File R3(char r4) {
                r3 = this;
                java.io.File r0 = new java.io.File
                java.io.File r1 = android.ext.Tools.q0()
                java.lang.String r2 = "empty.txt"
                r0.<init>(r1, r2)
                r0.createNewFile()
                java.lang.String r1 = r0.getAbsolutePath()
                luaj.lib.IoLib$File r4 = super.H3(r1, r4)
                r0.delete()
                return r4
        }

        private java.lang.String S3() {
                r3 = this;
                java.lang.String r0 = r3.f0
                if (r0 != 0) goto L15
                java.io.File r0 = new java.io.File
                java.io.File r1 = android.ext.Tools.q0()
                java.lang.String r2 = "empty.txt"
                r0.<init>(r1, r2)
                java.lang.String r0 = android.ext.Script.s3(r0)
                r3.f0 = r0
            L15:
                return r0
        }

        @Override // luaj.lib.IoLib
        protected luaj.lib.IoLib.File H3(java.lang.String r3, char r4) {
                r2 = this;
                luaj.Globals r0 = r2.Y
                java.io.File r3 = r0.R3(r3)
                java.lang.String r3 = android.ext.Script.s3(r3)
                android.ext.Script r0 = r2.g0
                r1 = 114(0x72, float:1.6E-43)
                if (r4 != r1) goto L12
                r1 = 1
                goto L13
            L12:
                r1 = 0
            L13:
                boolean r0 = r0.m(r3, r1)
                if (r0 == 0) goto L1e
                luaj.lib.IoLib$File r3 = r2.R3(r4)
                return r3
            L1e:
                luaj.lib.IoLib$File r3 = super.H3(r3, r4)     // Catch: luaj.lib.IoLib.c -> L23
                return r3
            L23:
                luaj.lib.IoLib$File r3 = r2.R3(r4)
                return r3
        }

        @Override // luaj.lib.IoLib
        protected boolean O3(java.io.File r3, java.io.FileDescriptor r4, boolean r5) {
                r2 = this;
                java.lang.String r0 = android.ext.Script.s3(r3)
                java.lang.String r1 = r2.S3()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L10
                r3 = 1
                return r3
            L10:
                boolean r3 = super.O3(r3, r4, r5)
                return r3
        }
    }

    public static class Logger {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.io.OutputStream f380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.io.FileInputStream f381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final java.lang.StringBuilder f382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f383d;

        Logger() {
                r6 = this;
                r6.<init>()
                r0 = 0
                java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3e
                java.io.File r2 = android.ext.Tools.p0()     // Catch: java.lang.Throwable -> L3e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
                r3.<init>()     // Catch: java.lang.Throwable -> L3e
                long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
                r3.append(r4)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r4 = ".tmp"
                r3.append(r4)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3e
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3e
                r1.createNewFile()     // Catch: java.lang.Throwable -> L3e
                java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L3e
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3e
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L3e
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L3e
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3a
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L3a
                r1.delete()     // Catch: java.lang.Throwable -> L38
                goto L4a
            L38:
                r0 = move-exception
                goto L42
            L3a:
                r1 = move-exception
                r3 = r0
            L3c:
                r0 = r1
                goto L42
            L3e:
                r1 = move-exception
                r2 = r0
                r3 = r2
                goto L3c
            L42:
                android.ext.e1.a(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
            L4a:
                r6.f382c = r0
                r6.f380a = r2
                r6.f381b = r3
                r0 = 0
                r6.f383d = r0
                return
        }

        public void a(java.lang.String r2) {
                r1 = this;
                java.lang.StringBuilder r0 = r1.f382c
                if (r0 != 0) goto L19
                byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L14
                java.io.OutputStream r0 = r1.f380a     // Catch: java.lang.Throwable -> L14
                r0.write(r2)     // Catch: java.lang.Throwable -> L14
                int r0 = r1.f383d     // Catch: java.lang.Throwable -> L14
                int r2 = r2.length     // Catch: java.lang.Throwable -> L14
                int r0 = r0 + r2
                r1.f383d = r0     // Catch: java.lang.Throwable -> L14
                goto L1c
            L14:
                r2 = move-exception
                android.ext.e1.a(r2)
                goto L1c
            L19:
                r0.append(r2)
            L1c:
                return
        }

        public java.lang.String toString() {
                r6 = this;
                int r0 = r6.f383d
                if (r0 >= 0) goto L7
                java.lang.String r0 = "must be called only once"
                return r0
            L7:
                java.lang.StringBuilder r1 = r6.f382c
                if (r1 != 0) goto L63
                r1 = -1
                r6.f383d = r1     // Catch: java.lang.Throwable -> L20
                java.io.OutputStream r1 = r6.f380a     // Catch: java.lang.Throwable -> L20
                r1.close()     // Catch: java.lang.Throwable -> L20
                r1 = 262144(0x40000, float:3.67342E-40)
                if (r0 <= r1) goto L22
                java.io.FileInputStream r2 = r6.f381b     // Catch: java.lang.Throwable -> L20
                int r3 = r0 - r1
                long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
                r2.skip(r3)     // Catch: java.lang.Throwable -> L20
                goto L23
            L20:
                r0 = move-exception
                goto L5d
            L22:
                r1 = r0
            L23:
                byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L20
                java.io.FileInputStream r3 = r6.f381b     // Catch: java.lang.Throwable -> L20
                int r3 = r3.read(r2)     // Catch: java.lang.Throwable -> L20
                java.io.FileInputStream r4 = r6.f381b     // Catch: java.lang.Throwable -> L20
                r4.close()     // Catch: java.lang.Throwable -> L20
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
                r4.<init>()     // Catch: java.lang.Throwable -> L20
                java.lang.String r5 = "Log script size: read = "
                r4.append(r5)     // Catch: java.lang.Throwable -> L20
                r4.append(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.String r5 = "; used = "
                r4.append(r5)     // Catch: java.lang.Throwable -> L20
                r4.append(r1)     // Catch: java.lang.Throwable -> L20
                java.lang.String r1 = "; full = "
                r4.append(r1)     // Catch: java.lang.Throwable -> L20
                r4.append(r0)     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L20
                android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L20
                if (r3 <= 0) goto L60
                java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L20
                r1 = 0
                r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> L20
                return r0
            L5d:
                android.ext.e1.a(r0)
            L60:
                java.lang.String r0 = ""
                return r0
            L63:
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    public static final class OsExit extends luaj.d {
        final int j;

        public OsExit(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "called os.exit("
                r0.append(r1)
                r0.append(r3)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.j = r3
                return
        }
    }

    final class OsLibSafe extends luaj.lib.OsLib {
        final /* synthetic */ android.ext.Script W;

        OsLibSafe(android.ext.Script r1) {
                r0 = this;
                r0.W = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.OsLib
        protected void r3(java.lang.String r3) {
                r2 = this;
                android.ext.Script r0 = r2.W
                r1 = 0
                boolean r0 = r0.m(r3, r1)
                if (r0 == 0) goto La
                return
            La:
                super.r3(r3)
                return
        }

        @Override // luaj.lib.OsLib
        protected void s3(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                android.ext.Script r0 = r2.W
                r1 = 0
                boolean r0 = r0.m(r3, r1)
                if (r0 != 0) goto L15
                android.ext.Script r0 = r2.W
                boolean r0 = r0.m(r4, r1)
                if (r0 == 0) goto L12
                goto L15
            L12:
                super.s3(r3, r4)
            L15:
                return
        }
    }

    private static final class PostWriteWorker extends java.lang.Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.io.OutputStream f384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.Throwable f388e;

        PostWriteWorker(java.io.OutputStream r1, byte[] r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f384a = r1
                r0.f385b = r2
                r0.f386c = r3
                r0.f387d = r4
                return
        }

        void a(boolean r3) {
                r2 = this;
                java.io.OutputStream r0 = r2.f384a     // Catch: java.lang.Throwable -> L5
                r0.close()     // Catch: java.lang.Throwable -> L5
            L5:
                r0 = 5000(0x1388, double:2.4703E-320)
                r2.join(r0)     // Catch: java.lang.InterruptedException -> Lb
                goto L12
            Lb:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L12:
                java.lang.Throwable r0 = r2.f388e
                if (r3 != 0) goto L25
                if (r0 == 0) goto L25
                boolean r3 = r0 instanceof java.lang.RuntimeException
                if (r3 == 0) goto L1f
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                throw r0
            L1f:
                java.io.IOException r3 = new java.io.IOException
                r3.<init>(r0)
                throw r3
            L25:
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r4 = this;
                java.io.OutputStream r0 = r4.f384a     // Catch: java.lang.Throwable -> L11
                byte[] r1 = r4.f385b     // Catch: java.lang.Throwable -> L11
                int r2 = r4.f386c     // Catch: java.lang.Throwable -> L11
                int r3 = r4.f387d     // Catch: java.lang.Throwable -> L11
                r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L11
                java.io.OutputStream r0 = r4.f384a     // Catch: java.lang.Throwable -> L11
                r0.flush()     // Catch: java.lang.Throwable -> L11
                goto L14
            L11:
                r0 = move-exception
                r4.f388e = r0
            L14:
                return
        }
    }

    private static class SavedState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f389a;

        private SavedState() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ SavedState(android.ext.Script.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    class ScriptPrintStream extends b.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.ext.Script f391g;

        public ScriptPrintStream(android.ext.Script r1, boolean r2) {
                r0 = this;
                r0.f391g = r1
                r0.<init>()
                r0.f390f = r2
                return
        }

        @Override // b.a
        protected void b(java.lang.String r3) {
                r2 = this;
                android.ext.Script r0 = r2.f391g
                boolean r1 = r2.f390f
                r0.a3(r1, r3)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "script: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                boolean r0 = r2.f390f
                if (r0 == 0) goto L20
                android.ext.e1.i(r3)
                goto L23
            L20:
                android.ext.e1.d(r3)
            L23:
                return
        }
    }

    class ScriptThread extends java.lang.Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.Script f392a;



        public ScriptThread(android.ext.Script r1) {
                r0 = this;
                r0.f392a = r1
                java.lang.String r1 = "Script thread"
                r0.<init>(r1)
                android.ext.n0.g(r0)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r12 = this;
                java.lang.String r0 = ": "
                android.ext.MainService r1 = android.ext.MainService.instance
                android.ext.Script r2 = r12.f392a     // Catch: java.lang.Throwable -> L73
                r1.n0(r2)     // Catch: java.lang.Throwable -> L73
                java.lang.Boolean r2 = android.ext.f1.f951a     // Catch: java.lang.Throwable -> L73
                r2.booleanValue()     // Catch: java.lang.Throwable -> L73
                android.ext.Script r2 = r12.f392a     // Catch: java.lang.Throwable -> L73
                r2.N3()     // Catch: java.lang.Throwable -> L73
                r2 = 0
                r3 = 0
                android.ext.Script r4 = r12.f392a     // Catch: java.lang.Throwable -> L1c luaj.d -> L1f android.ext.Script.OsExit -> L21
                r4.M3()     // Catch: java.lang.Throwable -> L1c luaj.d -> L1f android.ext.Script.OsExit -> L21
                goto Lcd
            L1c:
                r4 = move-exception
                goto Lce
            L1f:
                r4 = move-exception
                goto L23
            L21:
                r4 = move-exception
                goto L82
            L23:
                java.lang.Throwable r5 = r4.getCause()     // Catch: java.lang.Throwable -> L73
                boolean r6 = r5 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L73
                if (r6 == 0) goto L76
                android.ext.Script r6 = r12.f392a     // Catch: java.lang.Throwable -> L73
                int r6 = r6.f0     // Catch: java.lang.Throwable -> L73
                if (r6 == 0) goto L76
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
                r4.<init>()     // Catch: java.lang.Throwable -> L73
                java.lang.String r6 = "Script thread interrupted: "
                r4.append(r6)     // Catch: java.lang.Throwable -> L73
                android.ext.Script r6 = r12.f392a     // Catch: java.lang.Throwable -> L73
                int r6 = r6.f0     // Catch: java.lang.Throwable -> L73
                r4.append(r6)     // Catch: java.lang.Throwable -> L73
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L73
                android.ext.e1.l(r4, r5)     // Catch: java.lang.Throwable -> L73
                android.ext.Script r4 = r12.f392a     // Catch: java.lang.Throwable -> L73
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
                r5.<init>()     // Catch: java.lang.Throwable -> L73
                r6 = 2131296932(0x7f0902a4, float:1.8211795E38)
                java.lang.String r6 = android.ext.b2.f(r6)     // Catch: java.lang.Throwable -> L73
                r5.append(r6)     // Catch: java.lang.Throwable -> L73
                java.lang.String r6 = " ["
                r5.append(r6)     // Catch: java.lang.Throwable -> L73
                android.ext.Script r6 = r12.f392a     // Catch: java.lang.Throwable -> L73
                int r6 = r6.f0     // Catch: java.lang.Throwable -> L73
                r5.append(r6)     // Catch: java.lang.Throwable -> L73
                java.lang.String r6 = "]"
                r5.append(r6)     // Catch: java.lang.Throwable -> L73
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L73
                r4.Z2(r5)     // Catch: java.lang.Throwable -> L73
                goto Lcd
            L73:
                r0 = move-exception
                goto L275
            L76:
                boolean r5 = r4 instanceof luaj.d.a     // Catch: java.lang.Throwable -> L73
                if (r5 == 0) goto Lce
                java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L73
                android.ext.n0.h(r5, r4, r3)     // Catch: java.lang.Throwable -> L73
                goto Lce
            L82:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
                r5.<init>()     // Catch: java.lang.Throwable -> L73
                java.lang.String r6 = "Script interrupted by self: "
                r5.append(r6)     // Catch: java.lang.Throwable -> L73
                java.lang.String r6 = r4.getMessage()     // Catch: java.lang.Throwable -> L73
                r5.append(r6)     // Catch: java.lang.Throwable -> L73
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L73
                android.ext.e1.i(r5)     // Catch: java.lang.Throwable -> L73
                android.ext.Script r5 = r12.f392a     // Catch: java.lang.Throwable -> L73
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
                r6.<init>()     // Catch: java.lang.Throwable -> L73
                r7 = 2131296931(0x7f0902a3, float:1.8211793E38)
                java.lang.String r7 = android.ext.b2.f(r7)     // Catch: java.lang.Throwable -> L73
                r6.append(r7)     // Catch: java.lang.Throwable -> L73
                int r7 = r4.j     // Catch: java.lang.Throwable -> L73
                if (r7 != 0) goto Lb2
                java.lang.String r4 = "."
                goto Lc3
            Lb2:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
                r7.<init>()     // Catch: java.lang.Throwable -> L73
                r7.append(r0)     // Catch: java.lang.Throwable -> L73
                int r4 = r4.j     // Catch: java.lang.Throwable -> L73
                r7.append(r4)     // Catch: java.lang.Throwable -> L73
                java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L73
            Lc3:
                r6.append(r4)     // Catch: java.lang.Throwable -> L73
                java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L73
                r5.Z2(r4)     // Catch: java.lang.Throwable -> L73
            Lcd:
                r4 = r2
            Lce:
                r5 = 1
                if (r4 == 0) goto L1e1
                r6 = 10
                java.lang.String r7 = "Script error"
                android.ext.e1.l(r7, r4)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.String r7 = android.ext.e1.n(r4)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.String r8 = r4.getMessage()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                if (r8 == 0) goto Lfe
                boolean r9 = r7.contains(r8)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                if (r9 != 0) goto Lfe
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r9.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r9.append(r8)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r9.append(r6)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r9.append(r7)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                goto Lfe
            Lfb:
                r4 = move-exception
                goto L171
            Lfe:
                boolean r9 = r4 instanceof luaj.d     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                if (r9 == 0) goto L146
                if (r8 == 0) goto L118
                java.lang.String r9 = "<!DOCTYPE"
                boolean r9 = r8.contains(r9)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                if (r9 != 0) goto L114
                java.lang.String r9 = "<html"
                boolean r8 = r8.contains(r9)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                if (r8 == 0) goto L118
            L114:
                r8 = 2131296937(0x7f0902a9, float:1.8211805E38)
                goto L119
            L118:
                r8 = 0
            L119:
                android.ext.Script r9 = r12.f392a     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.Object r10 = r9.U     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                boolean r11 = r10 instanceof java.io.File     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                if (r11 == 0) goto L12c
                java.io.File r10 = (java.io.File) r10     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                boolean r9 = r9.z3(r10)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                if (r9 == 0) goto L12c
                r8 = 2131296936(0x7f0902a8, float:1.8211803E38)
            L12c:
                if (r8 == 0) goto L146
                android.ext.Script r9 = r12.f392a     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r10 = 2131296934(0x7f0902a6, float:1.8211799E38)
                java.lang.String r10 = android.ext.b2.f(r10)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.String r8 = android.ext.b2.f(r8)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r11[r3] = r8     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.String r8 = android.ext.Tools.L1(r10, r11)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r9.Z2(r8)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
            L146:
                android.ext.Script r8 = r12.f392a     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.Object r8 = r8.U     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                boolean r9 = r8 instanceof java.io.File     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                if (r9 == 0) goto L184
                java.io.File r8 = (java.io.File) r8     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.String r4 = lasm.LasmBase.c(r4, r8, r5)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                if (r4 == 0) goto L184
                int r8 = r4.length()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                if (r8 <= 0) goto L184
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r8.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r8.append(r4)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r8.append(r7)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> Lfb
                r4 = 4
                goto L185
            L171:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L1bc
                r7.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L1bc
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L1bc
                r7.append(r4)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L1bc
                r7.append(r6)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L1bc
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L1bc
            L184:
                r4 = 0
            L185:
                java.lang.Boolean r6 = android.ext.f1.f951a     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                if (r6 == 0) goto L19c
                android.ext.Script r6 = r12.f392a     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                r8 = 2131297022(0x7f0902fe, float:1.8211977E38)
                java.lang.String r8 = android.ext.b2.f(r8)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                r6.Z2(r8)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                goto L19c
            L19a:
                r6 = move-exception
                goto L1be
            L19c:
                android.ext.Script r6 = r12.f392a     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                r8.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                r9 = 2131296930(0x7f0902a2, float:1.821179E38)
                java.lang.String r9 = android.ext.Tools.N1(r9)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                r8.append(r9)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                r8.append(r0)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                r8.append(r7)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
                r6.Z2(r7)     // Catch: java.lang.Throwable -> L73 java.lang.OutOfMemoryError -> L19a
            L1ba:
                r0 = r4
                goto L1e2
            L1bc:
                r6 = move-exception
                r4 = 0
            L1be:
                android.ext.Script r7 = r12.f392a     // Catch: java.lang.Throwable -> L73
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
                r8.<init>()     // Catch: java.lang.Throwable -> L73
                r9 = 2131296933(0x7f0902a5, float:1.8211797E38)
                java.lang.String r9 = android.ext.Tools.N1(r9)     // Catch: java.lang.Throwable -> L73
                r8.append(r9)     // Catch: java.lang.Throwable -> L73
                r8.append(r0)     // Catch: java.lang.Throwable -> L73
                java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L73
                r8.append(r0)     // Catch: java.lang.Throwable -> L73
                java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L73
                r7.Z2(r0)     // Catch: java.lang.Throwable -> L73
                goto L1ba
            L1e1:
                r0 = 0
            L1e2:
                android.ext.Script r4 = r12.f392a     // Catch: java.lang.Throwable -> L73
                luaj.Globals r6 = r4.T     // Catch: java.lang.Throwable -> L73
                int r7 = r6.Y     // Catch: java.lang.Throwable -> L73
                if (r7 != 0) goto L1f2
                long r6 = r6.a0     // Catch: java.lang.Throwable -> L73
                r8 = 0
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 == 0) goto L21f
            L1f2:
                r6 = 2131296938(0x7f0902aa, float:1.8211807E38)
                java.lang.String r6 = android.ext.b2.f(r6)     // Catch: java.lang.Throwable -> L73
                r7 = 2
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L73
                android.content.Context r8 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L73
                android.ext.Script r9 = r12.f392a     // Catch: java.lang.Throwable -> L73
                luaj.Globals r9 = r9.T     // Catch: java.lang.Throwable -> L73
                long r9 = r9.a0     // Catch: java.lang.Throwable -> L73
                java.lang.String r8 = android.ext.Tools.U(r8, r9)     // Catch: java.lang.Throwable -> L73
                r7[r3] = r8     // Catch: java.lang.Throwable -> L73
                android.ext.Script r3 = r12.f392a     // Catch: java.lang.Throwable -> L73
                luaj.Globals r3 = r3.T     // Catch: java.lang.Throwable -> L73
                int r3 = r3.Y     // Catch: java.lang.Throwable -> L73
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L73
                r7[r5] = r3     // Catch: java.lang.Throwable -> L73
                java.lang.String r3 = android.ext.Tools.L1(r6, r7)     // Catch: java.lang.Throwable -> L73
                r4.Z2(r3)     // Catch: java.lang.Throwable -> L73
            L21f:
                android.ext.Script r3 = r12.f392a     // Catch: java.lang.Throwable -> L73
                r3.L3()     // Catch: java.lang.Throwable -> L73
                android.ext.Script r3 = r12.f392a     // Catch: java.lang.Throwable -> L73
                java.lang.Object r3 = r3.U     // Catch: java.lang.Throwable -> L73
                boolean r3 = r3 instanceof java.io.File     // Catch: java.lang.Throwable -> L73
                if (r3 == 0) goto L23b
                r2 = 2131296904(0x7f090288, float:1.8211738E38)
                java.lang.String r2 = android.ext.b2.f(r2)     // Catch: java.lang.Throwable -> L73
                android.ext.Script$ScriptThread$1 r3 = new android.ext.Script$ScriptThread$1     // Catch: java.lang.Throwable -> L73
                r3.<init>(r12)     // Catch: java.lang.Throwable -> L73
                r6 = r2
                r7 = r3
                goto L23d
            L23b:
                r6 = r2
                r7 = r6
            L23d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
                r2.<init>()     // Catch: java.lang.Throwable -> L73
                r3 = 2131296929(0x7f0902a1, float:1.8211789E38)
                java.lang.String r3 = android.ext.Tools.N1(r3)     // Catch: java.lang.Throwable -> L73
                r2.append(r3)     // Catch: java.lang.Throwable -> L73
                java.lang.String r3 = ":\n"
                r2.append(r3)     // Catch: java.lang.Throwable -> L73
                android.ext.Script r3 = r12.f392a     // Catch: java.lang.Throwable -> L73
                android.ext.Script$Logger r3 = r3.W     // Catch: java.lang.Throwable -> L73
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L73
                java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L73
                r2.append(r3)     // Catch: java.lang.Throwable -> L73
                java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L73
                android.ext.Script$ScriptThread$2 r8 = new android.ext.Script$ScriptThread$2     // Catch: java.lang.Throwable -> L73
                r2 = r8
                r3 = r12
                r5 = r0
                r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L73
                r1.d1(r8)     // Catch: java.lang.Throwable -> L73
            L26f:
                android.ext.Script r0 = r12.f392a
                r0.k3()
                goto L27b
            L275:
                java.lang.String r2 = "Script run exception"
                android.ext.e1.l(r2, r0)     // Catch: java.lang.Throwable -> L281
                goto L26f
            L27b:
                android.ext.Script r0 = r12.f392a
                r1.m0(r0)
                return
            L281:
                r0 = move-exception
                android.ext.Script r1 = r12.f392a
                r1.k3()
                throw r0
        }
    }

    final class addListItems extends android.ext.Script.ApiFunction {
        final java.util.ArrayList e0;
        luaj.LuaValue f0;
        final /* synthetic */ android.ext.Script g0;


        addListItems(android.ext.Script r1) {
                r0 = this;
                r0.g0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.e0 = r1
                r1 = 0
                r0.f0 = r1
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r6) {
                r5 = this;
                java.util.ArrayList r0 = r5.e0
                r1 = 0
                r0.clear()     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                r2 = 1
                luaj.LuaTable r6 = r6.I(r2)     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                android.ext.z1$d r2 = r2.v0     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                if (r2 == 0) goto L18
                boolean r2 = r2.n     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                goto L19
            L14:
                r6 = move-exception
                goto L5b
            L16:
                r6 = move-exception
                goto L76
            L18:
                r2 = 0
            L19:
                luaj.LuaTable$i r6 = r6.s3()     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
            L1d:
                boolean r3 = r6.c()     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                if (r3 == 0) goto L41
                luaj.LuaValue r3 = r6.d()     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                luaj.LuaTable r4 = r3.H0()     // Catch: java.lang.Throwable -> L14 luaj.d -> L35 java.lang.NumberFormatException -> L37
                android.ext.h2 r3 = android.ext.Script.U3(r4, r2)     // Catch: java.lang.Throwable -> L14 luaj.d -> L35 java.lang.NumberFormatException -> L37
                if (r3 == 0) goto L1d
                r0.add(r3)     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                goto L1d
            L35:
                r2 = move-exception
                goto L38
            L37:
                r2 = move-exception
            L38:
                luaj.LuaValue r6 = r6.b()     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                luaj.d r6 = android.ext.Script.m3(r6, r3, r2)     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                throw r6     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
            L41:
                r5.f0 = r1     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                java.lang.Object r6 = new java.lang.Object     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                r6.<init>()     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                monitor-enter(r6)     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                android.ext.Script$addListItems$1 r2 = new android.ext.Script$addListItems$1     // Catch: java.lang.Throwable -> L58
                r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L58
                android.ext.n2.i(r2)     // Catch: java.lang.Throwable -> L58
                android.ext.Script.W3(r6)     // Catch: java.lang.Throwable -> L58
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L58
                luaj.LuaValue r6 = r5.f0     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
                goto L68
            L58:
                r2 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L58
                throw r2     // Catch: java.lang.Throwable -> L14 luaj.d -> L16
            L5b:
                java.lang.String r2 = "Failed add list items"
                android.ext.e1.l(r2, r6)
                java.lang.String r6 = android.ext.Script.V3(r6)
                luaj.LuaString r6 = luaj.LuaValue.K2(r6)
            L68:
                r0.clear()     // Catch: java.lang.Throwable -> L6f
                r0.trimToSize()     // Catch: java.lang.Throwable -> L6f
                goto L73
            L6f:
                r0 = move-exception
                android.ext.e1.a(r0)
            L73:
                r5.f0 = r1
                return r6
            L76:
                throw r6
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.addListItems(table items) -> true || string with error"
                return r0
        }
    }

    static final class alert extends android.ext.Script.ApiFunction implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener {
        private volatile int e0;


        alert() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.e0 = r0
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 4
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r8) {
                r7 = this;
                r0 = 1
                java.lang.String r3 = r8.E(r0)
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r1 = 2
                java.lang.String r4 = r8.Z(r1, r0)
                r0 = 3
                r1 = 0
                java.lang.String r5 = r8.Z(r0, r1)
                r0 = 4
                java.lang.String r6 = r8.Z(r0, r1)
                r8 = 0
                r7.e0 = r8
                monitor-enter(r7)
                android.ext.Script$alert$1 r8 = new android.ext.Script$alert$1     // Catch: java.lang.Throwable -> L36
                r1 = r8
                r2 = r7
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L36
                android.ext.n2.i(r8)     // Catch: java.lang.Throwable -> L36
                android.ext.Script.W3(r7)     // Catch: java.lang.Throwable -> L36
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L36
                int r8 = r7.e0
                long r0 = (long) r8
                luaj.LuaLong r8 = luaj.LuaValue.I2(r0)
                return r8
            L36:
                r8 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L36
                throw r8
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.alert(string text [, string positive = 'ok' [, string negative = nil [, string neutral = nil]]]) -> int: 0 = cancel, 1 = positive, 2 = negative, 3 = neutral"
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                int r1 = -r2
                r0.e0 = r1
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r2) {
                r1 = this;
                monitor-enter(r1)
                r1.notify()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                android.ext.MainService r2 = android.ext.MainService.instance
                r0 = 0
                r2.y(r0)
                return
            Lc:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                throw r2
        }
    }

    final class allocatePage extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        allocatePage(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        protected luaj.Varargs a3() {
                r5 = this;
                long r0 = android.ext.Script.s0
                r2 = -1024(0xfffffffffffffc00, double:NaN)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 >= 0) goto L2f
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 > 0) goto L2f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 2131296269(0x7f09000d, float:1.821045E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r2.append(r3)
                r3 = 32
                r2.append(r3)
                long r0 = -r0
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                luaj.LuaString r0 = luaj.LuaValue.K2(r0)
                return r0
            L2f:
                long r0 = android.ext.Script.s0
                luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r7) {
                r6 = this;
                r0 = 1
                r1 = 6
                int r0 = r7.Y(r0, r1)
                r1 = 2
                r2 = 0
                long r4 = r7.a0(r1, r2)
                android.ext.Script.s0 = r2
                android.ext.MainService r7 = android.ext.MainService.instance
                android.ext.f0 r7 = r7.i
                android.ext.Script r1 = r6.f0
                byte r1 = r1.t3()
                r7.f(r1, r4, r0)
                r7 = 0
                return r7
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 1
                if (r3 == r0) goto L12
                r0 = 2
                if (r3 == r0) goto L7
                goto L23
            L7:
                boolean r0 = r4.j1()
                if (r0 == 0) goto L23
                boolean r2 = android.ext.Script.ApiFunction.h3(r2, r4)
                return r2
            L12:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L23
                android.ext.Script r3 = r1.f0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f377g
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L23:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.allocatePage([int mode = gg.PROT_READ | gg.PROT_EXEC [, long address = 0]) -> long || string with error"
                return r0
        }
    }

    final class bytes extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        bytes(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r7) {
                r6 = this;
                r0 = 1
                java.lang.String r0 = r7.E(r0)
                r1 = 2
                java.lang.String r2 = "UTF-8"
                java.lang.String r7 = r7.Z(r1, r2)
                byte[] r7 = r0.getBytes(r7)     // Catch: java.io.UnsupportedEncodingException -> L2c
                luaj.LuaTable r0 = new luaj.LuaTable     // Catch: java.io.UnsupportedEncodingException -> L2c
                r0.<init>()     // Catch: java.io.UnsupportedEncodingException -> L2c
                int r1 = r7.length     // Catch: java.io.UnsupportedEncodingException -> L2c
                r0.R1(r1)     // Catch: java.io.UnsupportedEncodingException -> L2c
                r2 = 0
            L1a:
                if (r2 >= r1) goto L2e
                int r3 = r2 + 1
                r2 = r7[r2]     // Catch: java.io.UnsupportedEncodingException -> L2c
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r4 = (long) r2     // Catch: java.io.UnsupportedEncodingException -> L2c
                luaj.LuaLong r2 = luaj.LuaValue.I2(r4)     // Catch: java.io.UnsupportedEncodingException -> L2c
                r0.Y1(r3, r2)     // Catch: java.io.UnsupportedEncodingException -> L2c
                r2 = r3
                goto L1a
            L2c:
                r7 = move-exception
                goto L2f
            L2e:
                return r0
            L2f:
                luaj.d r0 = new luaj.d
                r0.<init>(r7)
                throw r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.bytes(string text [, string encoding = 'UTF-8']) -> table"
                return r0
        }
    }

    static final class choice extends android.ext.Script.ApiFunction implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener {
        private volatile int e0;


        choice() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.e0 = r0
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 3
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r12) {
                r11 = this;
                r0 = 1
                luaj.LuaTable r1 = r12.I(r0)
                r2 = 2
                luaj.LuaValue r6 = r12.v(r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                luaj.LuaTable$i r1 = r1.s3()
                r4 = 0
                r5 = -1
                r8 = -1
            L1b:
                boolean r7 = r1.c()
                if (r7 == 0) goto L40
                luaj.LuaValue r7 = r1.b()
                luaj.LuaValue r9 = r1.d()
                boolean r10 = r7.P0(r6)
                if (r10 == 0) goto L30
                r8 = r4
            L30:
                java.lang.String r9 = r9.B0()
                java.lang.String r9 = android.ext.b2.g(r9)
                r3.add(r9)
                r2.add(r7)
                int r4 = r4 + r0
                goto L1b
            L40:
                r0 = 3
                java.lang.String r1 = ""
                java.lang.String r12 = r12.Z(r0, r1)
                java.lang.String r12 = android.ext.b2.g(r12)
                int r0 = r12.length()
                if (r0 <= 0) goto L63
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 10
                r0.append(r1)
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                goto L64
            L63:
                r12 = 0
            L64:
                int r0 = r3.size()
                java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
                java.lang.Object[] r0 = r3.toArray(r0)
                r7 = r0
                java.lang.CharSequence[] r7 = (java.lang.CharSequence[]) r7
                r11.e0 = r5
                monitor-enter(r11)
                android.ext.Script$choice$1 r0 = new android.ext.Script$choice$1     // Catch: java.lang.Throwable -> L93
                r3 = r0
                r4 = r11
                r5 = r12
                r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L93
                android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L93
                android.ext.Script.W3(r11)     // Catch: java.lang.Throwable -> L93
                monitor-exit(r11)     // Catch: java.lang.Throwable -> L93
                int r12 = r11.e0
                if (r12 >= 0) goto L8a
                luaj.LuaValue r12 = luaj.LuaValue.f1671c
                goto L92
            L8a:
                int r12 = r11.e0
                java.lang.Object r12 = r2.get(r12)
                luaj.Varargs r12 = (luaj.Varargs) r12
            L92:
                return r12
            L93:
                r12 = move-exception
                monitor-exit(r11)     // Catch: java.lang.Throwable -> L93
                throw r12
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.choice(table items [, string selected = nil [, string message = nil]]) -> string || nil"
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r0.e0 = r2
                android.ext.Tools.D(r1)
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r2) {
                r1 = this;
                monitor-enter(r1)
                r1.notify()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                android.ext.MainService r2 = android.ext.MainService.instance
                r0 = 0
                r2.y(r0)
                return
            Lc:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                throw r2
        }
    }

    final class clearList extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        clearList(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r2) {
                r1 = this;
                android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> La
                android.ext.SavedListAdapter r2 = r2.t0     // Catch: java.lang.Throwable -> La
                r2.c()     // Catch: java.lang.Throwable -> La
                luaj.LuaBoolean r2 = luaj.LuaValue.f1672d     // Catch: java.lang.Throwable -> La
                return r2
            La:
                r2 = move-exception
                java.lang.String r0 = "Failed clear list"
                android.ext.e1.l(r0, r2)
                java.lang.String r2 = android.ext.Script.V3(r2)
                luaj.LuaString r2 = luaj.LuaValue.K2(r2)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.clearList() -> true || string with error"
                return r0
        }
    }

    final class clearResults extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        clearResults(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r2) {
                r1 = this;
                android.ext.Script r2 = r1.e0
                byte r0 = r2.d0
                byte r0 = android.ext.Script.J3(r0)
                r2.d0 = r0
                android.ext.MainService r2 = android.ext.MainService.instance
                android.ext.Script r0 = r1.e0
                byte r0 = r0.t3()
                r2.n(r0)
                luaj.LuaValue r2 = luaj.LuaValue.f1671c
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.clearResults() -> nil"
                return r0
        }
    }

    final class copyMemory extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        copyMemory(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 3
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r9) {
                r8 = this;
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.f0 r1 = r0.i
                android.ext.Script r0 = r8.f0
                byte r2 = r0.t3()
                r0 = 1
                long r3 = r9.F(r0)
                r0 = 2
                long r5 = r9.F(r0)
                r0 = 3
                int r7 = r9.D(r0)
                r1.p(r2, r3, r5, r7)
                r9 = 0
                return r9
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 1
                if (r3 == r0) goto L7
                r0 = 2
                if (r3 == r0) goto L7
                goto L12
            L7:
                boolean r0 = r4.j1()
                if (r0 == 0) goto L12
                boolean r2 = android.ext.Script.ApiFunction.h3(r2, r4)
                return r2
            L12:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.copyMemory(long from, long to, int bytes) -> true || string with error"
                return r0
        }
    }

    static final class copyText extends android.ext.Script.ApiFunction {
        copyText() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r4) {
                r3 = this;
                r0 = 1
                java.lang.String r1 = r4.E(r0)
                r2 = 2
                boolean r4 = r4.V(r2, r0)
                if (r4 == 0) goto L10
                java.lang.String r1 = android.ext.Script.D3(r1)
            L10:
                java.lang.String r4 = android.ext.b2.g(r1)
                android.ext.Tools.z(r4)
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                return r4
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.copyText(string text [, bool fixLocale = true]) -> nil"
                return r0
        }
    }

    final class disasm extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        disasm(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 3
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r7) {
                r6 = this;
                r0 = 2
                long r0 = r7.F(r0)
                r2 = 3
                int r2 = r7.D(r2)
                r3 = 1
                int r4 = r7.D(r3)
                r5 = 4
                if (r4 == r5) goto L58
                r5 = 5
                if (r4 == r5) goto L49
                r5 = 6
                if (r4 == r5) goto L34
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "unknown type: "
                r0.append(r1)
                int r7 = r7.D(r3)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r0 = "gg.disasm"
                luaj.LuaValue r7 = luaj.LuaValue.l0(r3, r0, r7)
                return r7
            L34:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                int[] r3 = android.ext.m.d()
                android.ext.m.g(r3, r0, r2, r7)
                java.lang.String r7 = r7.toString()
                luaj.LuaString r7 = luaj.LuaString.K2(r7)
                return r7
            L49:
                android.ext.n r7 = new android.ext.n
                r7.<init>()
                long r2 = (long) r2
                java.lang.String r7 = android.ext.n.q(r7, r0, r2)
                luaj.LuaString r7 = luaj.LuaString.K2(r7)
                return r7
            L58:
                android.ext.n r7 = new android.ext.n
                r7.<init>()
                long r2 = (long) r2
                java.lang.String r7 = android.ext.n.o(r7, r0, r2)
                luaj.LuaString r7 = luaj.LuaString.K2(r7)
                return r7
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 1
                if (r3 == r0) goto L15
                r0 = 2
                if (r3 == r0) goto La
                r0 = 3
                if (r3 == r0) goto La
                goto L26
            La:
                boolean r0 = r4.j1()
                if (r0 == 0) goto L26
                boolean r2 = android.ext.Script.ApiFunction.h3(r2, r4)
                return r2
            L15:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L26
                android.ext.Script r3 = r1.e0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.j
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L26:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.disasm(int type, long address, int opcode) -> string"
                return r0
        }
    }

    final class dumpMemory extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        dumpMemory(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 4
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r12) {
                r11 = this;
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.z1$d r1 = r0.v0
                if (r1 != 0) goto La
                java.lang.String r1 = "unknown"
            L8:
                r10 = r1
                goto Ld
            La:
                java.lang.String r1 = r1.f1434c
                goto L8
            Ld:
                boolean r1 = r0.a1()
                if (r1 == 0) goto L35
                android.ext.f0 r2 = r0.i
                android.ext.Script r0 = r11.f0
                byte r3 = r0.t3()
                r0 = 1
                long r4 = r12.F(r0)
                r0 = 2
                long r6 = r12.F(r0)
                r0 = 4
                r1 = 0
                int r8 = r12.Y(r0, r1)
                r0 = 3
                java.lang.String r9 = r12.E(r0)
                r2.w(r3, r4, r6, r8, r9, r10)
                r12 = 0
                return r12
            L35:
                r12 = 2131296305(0x7f090031, float:1.8210523E38)
                java.lang.String r12 = android.ext.b2.f(r12)
                luaj.LuaString r12 = luaj.LuaValue.K2(r12)
                return r12
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 1
                if (r3 == r0) goto L1b
                r0 = 2
                if (r3 == r0) goto L1b
                r0 = 4
                if (r3 == r0) goto La
                goto L26
            La:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L26
                android.ext.Script r3 = r1.f0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.i
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L1b:
                boolean r0 = r4.j1()
                if (r0 == 0) goto L26
                boolean r2 = android.ext.Script.ApiFunction.h3(r2, r4)
                return r2
            L26:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.dumpMemory(long from, long to, string dir [, int flags = nil]) -> true || string with error"
                return r0
        }
    }

    final class editAll extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;


        editAll(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r35) {
                r34 = this;
                r1 = r34
                r0 = r35
                android.ext.Script r2 = r1.e0
                boolean r2 = r2.c0
                if (r2 == 0) goto L25b
                r2 = 1
                java.lang.String r3 = r0.E(r2)     // Catch: java.lang.NumberFormatException -> L27
                java.lang.String r3 = android.ext.Script.D3(r3)     // Catch: java.lang.NumberFormatException -> L27
                r4 = 2
                int r0 = r0.D(r4)     // Catch: java.lang.NumberFormatException -> L27
                int r0 = android.ext.Script.f3(r0)     // Catch: java.lang.NumberFormatException -> L27
                r11 = 0
                android.ext.i2$c r5 = android.ext.i2.x(r3, r11)     // Catch: java.lang.NumberFormatException -> L27
                if (r5 == 0) goto L2a
                int r6 = r5.f1018b     // Catch: java.lang.NumberFormatException -> L27
                r12 = r6
                goto L2b
            L27:
                r0 = move-exception
                goto L252
            L2a:
                r12 = 0
            L2b:
                if (r5 == 0) goto L2f
                java.lang.String r3 = r5.f1017a     // Catch: java.lang.NumberFormatException -> L27
            L2f:
                android.ext.MainService r13 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L27
                android.ext.Script r5 = r1.e0     // Catch: java.lang.NumberFormatException -> L27
                byte r5 = r5.d0     // Catch: java.lang.NumberFormatException -> L27
                java.util.ArrayList r14 = android.ext.Script.S3(r5)     // Catch: java.lang.NumberFormatException -> L27
                if (r14 != 0) goto L60
                android.ext.Script r5 = r1.e0     // Catch: java.lang.NumberFormatException -> L27
                boolean r6 = r5.e0     // Catch: java.lang.NumberFormatException -> L27
                if (r6 != 0) goto L60
                r5.e0 = r2     // Catch: java.lang.NumberFormatException -> L27
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L27
                r5.<init>()     // Catch: java.lang.NumberFormatException -> L27
                java.lang.String r6 = "editAll: no reply capture for seq "
                r5.append(r6)     // Catch: java.lang.NumberFormatException -> L27
                android.ext.Script r6 = r1.e0     // Catch: java.lang.NumberFormatException -> L27
                byte r6 = r6.d0     // Catch: java.lang.NumberFormatException -> L27
                r5.append(r6)     // Catch: java.lang.NumberFormatException -> L27
                java.lang.String r6 = "; using the shared result list"
                r5.append(r6)     // Catch: java.lang.NumberFormatException -> L27
                java.lang.String r5 = r5.toString()     // Catch: java.lang.NumberFormatException -> L27
                android.ext.e1.p(r5)     // Catch: java.lang.NumberFormatException -> L27
            L60:
                r5 = 0
                if (r14 != 0) goto L67
                d.a r6 = r13.s0     // Catch: java.lang.NumberFormatException -> L27
                r15 = r6
                goto L68
            L67:
                r15 = r5
            L68:
                if (r14 != 0) goto L70
                int r6 = r15.i()     // Catch: java.lang.NumberFormatException -> L27
            L6e:
                r9 = r6
                goto L75
            L70:
                int r6 = r14.size()     // Catch: java.lang.NumberFormatException -> L27
                goto L6e
            L75:
                if (r0 != r2) goto L85
                boolean r6 = android.ext.t1.m(r3)     // Catch: java.lang.NumberFormatException -> L27
                if (r6 == 0) goto L85
                byte[] r6 = android.ext.t1.h(r3)     // Catch: java.lang.NumberFormatException -> L27
                r7 = r5
                r10 = r7
                r8 = r6
                goto Lba
            L85:
                r6 = r0 & 6
                r7 = 59
                if (r6 == 0) goto La3
                boolean r6 = android.ext.t1.m(r3)     // Catch: java.lang.NumberFormatException -> L27
                if (r6 == 0) goto La3
                char r6 = r3.charAt(r11)     // Catch: java.lang.NumberFormatException -> L27
                if (r6 != r7) goto La3
                java.lang.String r6 = r3.substring(r2)     // Catch: java.lang.NumberFormatException -> L27
                char[] r6 = r6.toCharArray()     // Catch: java.lang.NumberFormatException -> L27
                r8 = r5
                r10 = r8
                r7 = r6
                goto Lba
            La3:
                int r6 = r3.indexOf(r7)     // Catch: java.lang.NumberFormatException -> L27
                r7 = -1
                if (r6 == r7) goto Lb3
                java.lang.String r6 = ";"
                java.lang.String[] r6 = r3.split(r6)     // Catch: java.lang.NumberFormatException -> L27
                int r7 = r6.length     // Catch: java.lang.NumberFormatException -> L27
                if (r7 != 0) goto Lb7
            Lb3:
                r7 = r5
                r8 = r7
                r10 = r8
                goto Lba
            Lb7:
                r7 = r5
                r8 = r7
                r10 = r6
            Lba:
                android.ext.c r6 = new android.ext.c     // Catch: java.lang.NumberFormatException -> L27
                r6.<init>()     // Catch: java.lang.NumberFormatException -> L27
                if (r10 != 0) goto Lc3
                r2 = r5
                goto Lc6
            Lc3:
                int r2 = r10.length     // Catch: java.lang.NumberFormatException -> L27
                android.ext.t1$b[] r2 = new android.ext.t1.b[r2]     // Catch: java.lang.NumberFormatException -> L27
            Lc6:
                r16 = 0
                r26 = r16
                r18 = 0
                r28 = 0
            Lce:
                if (r11 >= r9) goto L229
                if (r14 == 0) goto Lf7
                java.lang.Object r19 = r14.get(r11)     // Catch: java.lang.NumberFormatException -> L27 java.lang.IndexOutOfBoundsException -> Lf3
                r4 = r19
                android.ext.c r4 = (android.ext.c) r4     // Catch: java.lang.NumberFormatException -> L27 java.lang.IndexOutOfBoundsException -> Lf3
                if (r4 != 0) goto Le1
                r29 = r13
                r30 = r14
                goto L102
            Le1:
                r29 = r13
                r30 = r14
                long r13 = r4.f672a     // Catch: java.lang.NumberFormatException -> L27 java.lang.IndexOutOfBoundsException -> Lee
                r6.f672a = r13     // Catch: java.lang.NumberFormatException -> L27 java.lang.IndexOutOfBoundsException -> Lee
                int r4 = r4.f674c     // Catch: java.lang.NumberFormatException -> L27 java.lang.IndexOutOfBoundsException -> Lee
                r6.f674c = r4     // Catch: java.lang.NumberFormatException -> L27 java.lang.IndexOutOfBoundsException -> Lee
                goto Lfe
            Lee:
                r0 = move-exception
            Lef:
                r4 = r28
                goto L221
            Lf3:
                r0 = move-exception
                r29 = r13
                goto Lef
            Lf7:
                r29 = r13
                r30 = r14
                r15.f(r11, r6)     // Catch: java.lang.NumberFormatException -> L27 java.lang.IndexOutOfBoundsException -> Lee
            Lfe:
                int r4 = r6.f674c     // Catch: java.lang.NumberFormatException -> L27
                if (r4 == r0) goto L10c
            L102:
                r13 = r3
                r31 = r7
                r32 = r8
                r33 = r9
                r3 = r10
                goto L210
            L10c:
                if (r8 == 0) goto L146
                r13 = 1
                long r26 = r26 + r13
                long r13 = r6.f672a     // Catch: java.lang.NumberFormatException -> L27
                int r4 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
                r19 = r9
                if (r4 == 0) goto L11c
                r4 = 0
                goto L11e
            L11c:
                r4 = r18
            L11e:
                int r9 = r8.length     // Catch: java.lang.NumberFormatException -> L27
                if (r4 >= r9) goto L131
                int r9 = r4 + 1
                r4 = r8[r4]     // Catch: java.lang.NumberFormatException -> L27
                r20 = r8
                r18 = r9
                long r8 = (long) r4     // Catch: java.lang.NumberFormatException -> L27
                r21 = 255(0xff, double:1.26E-321)
                long r8 = r8 & r21
                r4 = r18
                goto L135
            L131:
                r20 = r8
                r8 = r16
            L135:
                r6.f673b = r8     // Catch: java.lang.NumberFormatException -> L27
                r18 = r4
                r4 = r6
                r31 = r7
                r26 = r13
                r33 = r19
                r32 = r20
                r13 = r3
                r3 = r10
                goto L203
            L146:
                r20 = r8
                r19 = r9
                if (r7 == 0) goto L1a2
                r13 = 2
                if (r4 != r13) goto L151
                r4 = 1
                goto L152
            L151:
                r4 = 0
            L152:
                if (r4 == 0) goto L156
                r8 = 2
                goto L157
            L156:
                r8 = 4
            L157:
                long r8 = (long) r8     // Catch: java.lang.NumberFormatException -> L27
                long r26 = r26 + r8
                long r8 = r6.f672a     // Catch: java.lang.NumberFormatException -> L27
                int r14 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
                if (r14 == 0) goto L162
                r14 = 0
                goto L164
            L162:
                r14 = r18
            L164:
                int r13 = r7.length     // Catch: java.lang.NumberFormatException -> L27
                r21 = 65535(0xffff, double:3.23786E-319)
                if (r14 >= r13) goto L175
                int r13 = r14 + 1
                char r14 = r7[r14]     // Catch: java.lang.NumberFormatException -> L27
                r23 = r8
                long r8 = (long) r14     // Catch: java.lang.NumberFormatException -> L27
                long r8 = r8 & r21
                r14 = r13
                goto L179
            L175:
                r23 = r8
                r8 = r16
            L179:
                r6.f673b = r8     // Catch: java.lang.NumberFormatException -> L27
                if (r4 != 0) goto L193
                int r4 = r7.length     // Catch: java.lang.NumberFormatException -> L27
                if (r14 >= r4) goto L18c
                int r4 = r14 + 1
                char r13 = r7[r14]     // Catch: java.lang.NumberFormatException -> L27
                long r13 = (long) r13     // Catch: java.lang.NumberFormatException -> L27
                long r13 = r13 & r21
                r18 = 16
                long r13 = r13 << r18
                goto L18f
            L18c:
                r4 = r14
                r13 = r16
            L18f:
                long r8 = r8 | r13
                r6.f673b = r8     // Catch: java.lang.NumberFormatException -> L27
                r14 = r4
            L193:
                r13 = r3
                r4 = r6
                r31 = r7
                r3 = r10
                r18 = r14
                r33 = r19
                r32 = r20
                r26 = r23
                goto L203
            L1a2:
                if (r10 != 0) goto L1cd
                if (r5 != 0) goto L1c2
                r5 = 0
                r8 = 2131296829(0x7f09023d, float:1.8211586E38)
                long r13 = r6.f672a     // Catch: java.lang.NumberFormatException -> L27
                r4 = r6
                r6 = r3
                r31 = r7
                r7 = r0
                r32 = r20
                r33 = r19
                r19 = r3
                r3 = r10
                r9 = r13
                android.ext.t1$b r5 = android.ext.c.W(r5, r6, r7, r8, r9)     // Catch: java.lang.NumberFormatException -> L27
            L1bd:
                r6 = r18
                r13 = r19
                goto L1ee
            L1c2:
                r4 = r6
                r31 = r7
                r33 = r19
                r32 = r20
                r19 = r3
                r3 = r10
                goto L1bd
            L1cd:
                r4 = r6
                r31 = r7
                r3 = r10
                r33 = r19
                r32 = r20
                int r5 = r3.length     // Catch: java.lang.NumberFormatException -> L27
                int r18 = r11 % r5
                r13 = r3[r18]     // Catch: java.lang.NumberFormatException -> L27
                r5 = r2[r18]     // Catch: java.lang.NumberFormatException -> L27
                if (r5 != 0) goto L1ec
                r5 = 0
                r8 = 2131296829(0x7f09023d, float:1.8211586E38)
                long r9 = r4.f672a     // Catch: java.lang.NumberFormatException -> L27
                r6 = r13
                r7 = r0
                android.ext.t1$b r5 = android.ext.c.W(r5, r6, r7, r8, r9)     // Catch: java.lang.NumberFormatException -> L27
                r2[r18] = r5     // Catch: java.lang.NumberFormatException -> L27
            L1ec:
                r6 = r18
            L1ee:
                r19 = 0
                long r7 = r4.f672a     // Catch: java.lang.NumberFormatException -> L27
                java.lang.String r24 = "0"
                r25 = 0
                r18 = r4
                r20 = r5
                r21 = r13
                r22 = r7
                r18.f(r19, r20, r21, r22, r24, r25)     // Catch: java.lang.NumberFormatException -> L27
                r18 = r6
            L203:
                r4.b(r12)     // Catch: java.lang.NumberFormatException -> L27
                r4 = r28
                int r28 = r4 + 1
                android.ext.c r4 = new android.ext.c     // Catch: java.lang.NumberFormatException -> L27
                r4.<init>()     // Catch: java.lang.NumberFormatException -> L27
                r6 = r4
            L210:
                int r11 = r11 + 1
                r10 = r3
                r3 = r13
                r13 = r29
                r14 = r30
                r7 = r31
                r8 = r32
                r9 = r33
                r4 = 2
                goto Lce
            L221:
                java.lang.String r2 = "List changed"
                android.ext.e1.s(r2, r0)     // Catch: java.lang.NumberFormatException -> L27
                r2 = r29
                goto L22c
            L229:
                r4 = r28
                r2 = r13
            L22c:
                android.ext.f0 r0 = r2.i     // Catch: java.lang.NumberFormatException -> L27
                android.ext.Script r2 = r1.e0     // Catch: java.lang.NumberFormatException -> L27
                byte r2 = r2.t3()     // Catch: java.lang.NumberFormatException -> L27
                r0.C(r2)     // Catch: java.lang.NumberFormatException -> L27
                java.lang.Object r2 = new java.lang.Object     // Catch: java.lang.NumberFormatException -> L27
                r2.<init>()     // Catch: java.lang.NumberFormatException -> L27
                monitor-enter(r2)     // Catch: java.lang.NumberFormatException -> L27
                android.ext.Script$editAll$1 r0 = new android.ext.Script$editAll$1     // Catch: java.lang.Throwable -> L24f
                r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L24f
                android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L24f
                android.ext.Script.W3(r2)     // Catch: java.lang.Throwable -> L24f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L24f
                long r2 = (long) r4
                luaj.LuaLong r0 = luaj.LuaValue.I2(r2)     // Catch: java.lang.NumberFormatException -> L27
                return r0
            L24f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L24f
                throw r0     // Catch: java.lang.NumberFormatException -> L27
            L252:
                java.lang.String r0 = android.ext.Script.V3(r0)
                luaj.LuaString r0 = luaj.LuaValue.K2(r0)
                return r0
            L25b:
                luaj.d r0 = new luaj.d
                java.lang.String r2 = "You must call gg.getResults before calling gg.editAll."
                r0.<init>(r2)
                throw r0
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 2
                if (r3 == r0) goto L4
                goto L15
            L4:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L15
                android.ext.Script r3 = r1.e0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f372b
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L15:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.editAll(string value, int type) -> count of changed || string with error"
                return r0
        }
    }

    static final class exit extends luaj.lib.VarArgFunction {
        exit() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r4) {
                r3 = this;
                android.ext.Script$OsExit r0 = new android.ext.Script$OsExit
                r1 = 1
                r2 = 0
                int r4 = r4.Y(r1, r2)
                r0.<init>(r4)
                throw r0
        }
    }

    static final class format extends luaj.lib.VarArgFunction {
        final luaj.LuaValue T;

        public format(luaj.LuaValue r1) {
                r0 = this;
                r0.<init>()
                r0.T = r1
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r4) {
                r3 = this;
                r0 = 1
                java.lang.String r0 = r4.E(r0)
                java.lang.String r0 = android.ext.b2.g(r0)
                java.lang.String r1 = "%,d"
                java.lang.String r2 = "%d"
                java.lang.String r0 = r0.replace(r1, r2)
                luaj.LuaValue r1 = r3.T
                luaj.LuaString r0 = luaj.LuaValue.K2(r0)
                r2 = 2
                luaj.Varargs r4 = r4.e0(r2)
                luaj.Varargs r4 = luaj.LuaValue.N2(r0, r4)
                luaj.Varargs r4 = r1.invoke(r4)
                return r4
        }
    }

    static final class getActiveTab extends android.ext.Script.ApiFunction {
        getActiveTab() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r3) {
                r2 = this;
                android.ext.MainService r3 = android.ext.MainService.instance
                int r3 = r3.H()
                long r0 = (long) r3
                luaj.LuaLong r3 = luaj.LuaValue.I2(r0)
                return r3
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getActiveTab() -> int"
                return r0
        }
    }

    final class getFile extends android.ext.Script.DebugFunction {
        final /* synthetic */ android.ext.Script f0;

        getFile(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r2) {
                r1 = this;
                luaj.LuaClosure r2 = r1.e0
                if (r2 != 0) goto L7
                java.lang.String r2 = "?"
                goto L1f
            L7:
                java.lang.String r0 = r2.U
                if (r0 == 0) goto Ld
                r2 = r0
                goto L1f
            Ld:
                luaj.h r2 = r2.R
                if (r2 == 0) goto L1d
                luaj.LuaString r2 = r2.f1727g
                if (r2 == 0) goto L1a
                java.lang.String r2 = r2.g0()
                goto L1f
            L1a:
                java.lang.String r2 = "??"
                goto L1f
            L1d:
                java.lang.String r2 = "???"
            L1f:
                java.lang.String r0 = "@"
                boolean r0 = r2.startsWith(r0)
                if (r0 == 0) goto L2c
                r0 = 1
                java.lang.String r2 = r2.substring(r0)
            L2c:
                luaj.LuaString r2 = luaj.LuaValue.K2(r2)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getFile() -> string"
                return r0
        }
    }

    final class getLine extends android.ext.Script.DebugFunction {
        final /* synthetic */ android.ext.Script f0;

        getLine(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r5) {
                r4 = this;
                luaj.LuaClosure r5 = r4.e0
                r0 = -1
                if (r5 == 0) goto L22
                luaj.h r1 = r5.R
                if (r1 == 0) goto L22
                int[] r1 = r1.f1724d
                if (r1 == 0) goto L22
                int r5 = r5.W
                if (r5 < 0) goto L22
                luaj.LuaClosure r5 = r4.e0
                int r5 = r5.W
                luaj.LuaClosure r1 = r4.e0
                luaj.h r2 = r1.R
                int[] r2 = r2.f1724d
                int r3 = r2.length
                if (r5 >= r3) goto L22
                int r5 = r1.W
                r0 = r2[r5]
            L22:
                long r0 = (long) r0
                luaj.LuaLong r5 = luaj.LuaValue.I2(r0)
                return r5
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getLine() -> int"
                return r0
        }
    }

    final class getListItems extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;


        getListItems(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r5) {
                r4 = this;
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                android.ext.SavedListAdapter r0 = r0.t0     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                int r0 = r0.getCount()     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                r5.<init>(r0)     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                java.lang.Object r0 = new java.lang.Object     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                r0.<init>()     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                android.ext.Script$getListItems$1 r1 = new android.ext.Script$getListItems$1     // Catch: java.lang.Throwable -> L4f
                r1.<init>(r4, r5, r0)     // Catch: java.lang.Throwable -> L4f
                android.ext.n2.i(r1)     // Catch: java.lang.Throwable -> L4f
                android.ext.Script.W3(r0)     // Catch: java.lang.Throwable -> L4f
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
                luaj.LuaTable r0 = new luaj.LuaTable     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                r0.<init>()     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                int r1 = r5.size()     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                r0.R1(r1)     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                r1 = 1
            L30:
                boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                if (r2 == 0) goto L4e
                java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                android.ext.h2 r2 = (android.ext.h2) r2     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                if (r2 != 0) goto L3f
                goto L30
            L3f:
                int r3 = r1 + 1
                luaj.LuaTable r2 = android.ext.Script.o3(r2)     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                r0.Y1(r1, r2)     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
                r1 = r3
                goto L30
            L4a:
                r5 = move-exception
                goto L52
            L4c:
                r5 = move-exception
                goto L60
            L4e:
                return r0
            L4f:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
                throw r5     // Catch: java.lang.Throwable -> L4a luaj.d -> L4c
            L52:
                java.lang.String r0 = "Failed get list items"
                android.ext.e1.l(r0, r5)
                java.lang.String r5 = android.ext.Script.V3(r5)
                luaj.LuaString r5 = luaj.LuaValue.K2(r5)
                return r5
            L60:
                throw r5
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getListItems() -> table || string with error"
                return r0
        }
    }

    final class getLocale extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        getLocale(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r3) {
                r2 = this;
                r3 = 2131296732(0x7f0901dc, float:1.8211389E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                java.lang.String r0 = "~"
                java.lang.String r1 = ""
                java.lang.String r3 = r3.replace(r0, r1)
                luaj.LuaString r3 = luaj.LuaValue.K2(r3)
                return r3
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getLocale() -> string"
                return r0
        }
    }

    static final class getRanges extends android.ext.Script.ApiFunction {
        getRanges() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r3) {
                r2 = this;
                int r3 = android.ext.Config.i
                long r0 = (long) r3
                luaj.LuaLong r3 = luaj.LuaValue.I2(r0)
                return r3
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getRanges() -> int"
                return r0
        }
    }

    final class getRangesList extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        getRangesList(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r15) {
                r14 = this;
                java.lang.String r0 = ""
                r1 = 1
                java.lang.String r15 = r15.Z(r1, r0)
                int r0 = r15.length()
                if (r0 <= 0) goto L11
                java.lang.String r15 = android.ext.Tools.k1(r15)
            L11:
                luaj.LuaTable r0 = new luaj.LuaTable
                r0.<init>()
                int r2 = r15.length()
                if (r2 <= 0) goto L25
                java.util.regex.Pattern r15 = java.util.regex.Pattern.compile(r15)     // Catch: java.lang.Throwable -> L21
                goto L26
            L21:
                r15 = move-exception
                android.ext.e1.a(r15)
            L25:
                r15 = 0
            L26:
                java.lang.String r2 = "state"
                luaj.LuaString r2 = luaj.LuaString.K2(r2)
                java.lang.String r3 = "start"
                luaj.LuaString r3 = luaj.LuaString.K2(r3)
                java.lang.String r4 = "end"
                luaj.LuaString r4 = luaj.LuaString.K2(r4)
                java.lang.String r5 = "type"
                luaj.LuaString r5 = luaj.LuaString.K2(r5)
                java.lang.String r6 = "name"
                luaj.LuaString r6 = luaj.LuaString.K2(r6)
                java.lang.String r7 = "internalName"
                luaj.LuaString r7 = luaj.LuaString.K2(r7)
                java.util.List r8 = android.ext.RegionList.getList()
                java.util.Iterator r8 = r8.iterator()
            L52:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto Lbb
                java.lang.Object r9 = r8.next()
                android.ext.RegionList$b r9 = (android.ext.RegionList.b) r9
                java.lang.String r10 = r9.a()
                if (r15 == 0) goto L6f
                java.util.regex.Matcher r11 = r15.matcher(r10)
                boolean r11 = r11.find()
                if (r11 != 0) goto L6f
                goto L52
            L6f:
                luaj.LuaTable r11 = new luaj.LuaTable
                r12 = 0
                r13 = 6
                r11.<init>(r12, r13)
                java.lang.CharSequence r12 = r9.e()
                java.lang.String r12 = r12.toString()
                luaj.LuaString r12 = luaj.LuaValue.K2(r12)
                r11.d2(r2, r12)
                long r12 = r9.f356b
                luaj.LuaLong r12 = luaj.LuaValue.I2(r12)
                r11.d2(r3, r12)
                long r12 = r9.f357c
                luaj.LuaLong r12 = luaj.LuaValue.I2(r12)
                r11.d2(r4, r12)
                java.lang.String r12 = r9.f()
                luaj.LuaString r12 = luaj.LuaValue.K2(r12)
                r11.d2(r5, r12)
                java.lang.String r9 = r9.b()
                luaj.LuaString r9 = luaj.LuaValue.K2(r9)
                r11.d2(r6, r9)
                luaj.LuaString r9 = luaj.LuaValue.K2(r10)
                r11.d2(r7, r9)
                int r9 = r1 + 1
                r0.e2(r1, r11)
                r1 = r9
                goto L52
            Lbb:
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getRangesList([string filter = '']) -> table"
                return r0
        }
    }

    final class getResults extends android.ext.Script.BusyApiFunction {
        private byte f0;
        final /* synthetic */ android.ext.Script g0;


        getResults(android.ext.Script r1) {
                r0 = this;
                r0.g0 = r1
                r0.<init>(r1)
                return
        }

        private java.util.ArrayList l3() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                android.ext.MainService r1 = android.ext.MainService.instance
                d.a r1 = r1.s0
                int r1 = r1.i()
                r0.<init>(r1)
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                monitor-enter(r1)
                android.ext.Script$getResults$1 r2 = new android.ext.Script$getResults$1     // Catch: java.lang.Throwable -> L20
                r2.<init>(r3, r0, r1)     // Catch: java.lang.Throwable -> L20
                android.ext.n2.i(r2)     // Catch: java.lang.Throwable -> L20
                android.ext.Script.W3(r1)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
                return r0
            L20:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
                throw r0
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 9
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        protected luaj.Varargs a3() {
                r6 = this;
                android.ext.Script r0 = r6.g0
                r1 = 1
                r0.c0 = r1
                android.ext.Script r0 = r6.g0
                byte r2 = r6.f0
                r0.d0 = r2
                java.util.ArrayList r0 = android.ext.Script.S3(r2)
                if (r0 != 0) goto L38
                android.ext.Script r0 = r6.g0
                boolean r2 = r0.e0
                if (r2 != 0) goto L34
                r0.e0 = r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "getResults: no reply capture for seq "
                r0.append(r2)
                byte r2 = r6.f0
                r0.append(r2)
                java.lang.String r2 = "; using the shared result list"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.ext.e1.p(r0)
            L34:
                java.util.ArrayList r0 = r6.l3()
            L38:
                luaj.LuaTable r2 = new luaj.LuaTable
                r2.<init>()
                int r3 = r0.size()
                r2.R1(r3)
                java.util.Iterator r0 = r0.iterator()
            L48:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L63
                java.lang.Object r3 = r0.next()
                android.ext.c r3 = (android.ext.c) r3
                if (r3 != 0) goto L57
                goto L48
            L57:
                int r4 = r1 + 1
                r5 = 0
                luaj.LuaTable r3 = android.ext.Script.X2(r5, r3)
                r2.Y1(r1, r3)
                r1 = r4
                goto L48
            L63:
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r18) {
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = 1
                int r2 = r0.D(r2)
                r3 = 2
                r4 = 0
                int r3 = r0.Y(r3, r4)
                r5 = 3
                r6 = 0
                long r8 = r0.a0(r5, r6)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                r5 = 4
                r6 = -1
                long r10 = r0.a0(r5, r6)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                r5 = 5
                r6 = 0
                java.lang.String r12 = r0.Z(r5, r6)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                r5 = 6
                java.lang.String r13 = r0.Z(r5, r6)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                r5 = 7
                int r14 = r0.Y(r5, r4)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                r5 = 8
                java.lang.String r15 = r0.Z(r5, r6)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                r5 = 9
                int r16 = r0.Y(r5, r4)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                android.ext.b0$a r0 = android.ext.b0.f(r8, r10, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                android.ext.Script r4 = r1.g0     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                byte r4 = r4.t3()     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                r1.f0 = r4     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                android.ext.Script.j3(r4)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                android.ext.Script r4 = r1.g0     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                byte r5 = r4.d0     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                byte r5 = android.ext.Script.J3(r5)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                r4.d0 = r5     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                byte r4 = r1.f0     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                android.ext.b0.h(r4, r2, r3, r0)     // Catch: java.lang.Throwable -> L58 luaj.d -> L5a
                return r6
            L58:
                r0 = move-exception
                goto L5c
            L5a:
                r0 = move-exception
                goto L65
            L5c:
                java.lang.String r0 = android.ext.Script.V3(r0)
                luaj.LuaString r0 = luaj.LuaValue.K2(r0)
                return r0
            L65:
                throw r0
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 7
                if (r3 == r0) goto L19
                r0 = 9
                if (r3 == r0) goto L8
                goto L2a
            L8:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L2a
                android.ext.Script r3 = r1.g0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.h
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L19:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L2a
                android.ext.Script r3 = r1.g0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f372b
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L2a:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getResults(int maxCount [, int skip = 0 [, long addressMin = nil [, long addressMax = nil [, string valueMin = nil [, string valueMax = nil [, int type = nil [, string fractional = nil [, int pointer = nil]]]]]]]]) -> table || string with error"
                return r0
        }
    }

    static final class getResultsCount extends android.ext.Script.ApiFunction {
        getResultsCount() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r3) {
                r2 = this;
                android.ext.MainService r3 = android.ext.MainService.instance
                long r0 = r3.p0
                luaj.LuaLong r3 = luaj.LuaValue.I2(r0)
                return r3
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getResultsCount() -> long"
                return r0
        }
    }

    final class getSelectedElements extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        getSelectedElements(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r8) {
                r7 = this;
                android.ext.MainService r8 = android.ext.MainService.instance
                android.ext.n1 r8 = r8.N
                boolean[] r0 = r8.f()
                luaj.LuaTable r1 = new luaj.LuaTable
                r1.<init>()
                r2 = 1
                r3 = 0
            Lf:
                int r4 = r0.length
                if (r3 >= r4) goto L28
                boolean r4 = r0[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L25
                if (r4 != 0) goto L17
                goto L25
            L17:
                int r4 = r2 + 1
                long r5 = r8.e(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L24
                luaj.LuaLong r5 = luaj.LuaLong.I2(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L24
                r1.Y1(r2, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L24
            L24:
                r2 = r4
            L25:
                int r3 = r3 + 1
                goto Lf
            L28:
                return r1
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getSelectedElements() -> table || string with error"
                return r0
        }
    }

    final class getSelectedListItems extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        getSelectedListItems(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r6) {
                r5 = this;
                android.ext.MainService r6 = android.ext.MainService.instance
                android.ext.SavedListAdapter r6 = r6.t0
                d.e r6 = r6.f()
                luaj.LuaTable r0 = new luaj.LuaTable
                r0.<init>()
                r1 = 1
                r2 = 0
            Lf:
                int r3 = r6.l()
                if (r2 >= r3) goto L32
                boolean r3 = r6.a(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                if (r3 != 0) goto L1c
                goto L2f
            L1c:
                java.lang.Object r3 = r6.n(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                android.ext.h2 r3 = (android.ext.h2) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                if (r3 != 0) goto L25
                goto L2f
            L25:
                int r4 = r1 + 1
                luaj.LuaTable r3 = android.ext.Script.o3(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L2e
                r0.Y1(r1, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L2e
            L2e:
                r1 = r4
            L2f:
                int r2 = r2 + 1
                goto Lf
            L32:
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getSelectedListItems() -> table || string with error"
                return r0
        }
    }

    final class getSelectedResults extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        getSelectedResults(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r7) {
                r6 = this;
                android.ext.MainService r7 = android.ext.MainService.instance
                d.a r7 = r7.s0
                luaj.LuaTable r0 = new luaj.LuaTable
                r0.<init>()
                r1 = 1
                r2 = 0
            Lb:
                int r3 = r7.i()
                if (r2 >= r3) goto L2d
                boolean r3 = r7.c(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L2a
                if (r3 != 0) goto L18
                goto L2a
            L18:
                r3 = 0
                android.ext.c r4 = r7.f(r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L2a
                if (r4 != 0) goto L20
                goto L2a
            L20:
                int r5 = r1 + 1
                luaj.LuaTable r3 = android.ext.Script.X2(r3, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L29
                r0.Y1(r1, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L29
            L29:
                r1 = r5
            L2a:
                int r2 = r2 + 1
                goto Lb
            L2d:
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getSelectedResults() -> table || string with error"
                return r0
        }
    }

    static final class getSpeed extends android.ext.Script.ApiFunction {
        getSpeed() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r3) {
                r2 = this;
                android.ext.MainService r3 = android.ext.MainService.instance
                double r0 = r3.G()
                luaj.LuaNumber r3 = luaj.LuaValue.J2(r0)
                return r3
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getSpeed() -> double"
                return r0
        }
    }

    static final class getTargetInfo extends android.ext.Script.ApiFunction {
        getTargetInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r18) {
                r17 = this;
                java.lang.String r1 = "uid"
                java.lang.String r2 = "nativeLibraryDir"
                java.lang.String r3 = "name"
                java.lang.String r4 = "packageName"
                luaj.LuaValue r5 = luaj.LuaValue.f1671c
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.z1$d r0 = r0.v0
                if (r0 == 0) goto L1dc
                java.lang.String r6 = r0.f1434c
                r7 = 1
                android.content.pm.PackageInfo r8 = android.ext.Tools.A0(r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                if (r8 == 0) goto L1c4
                luaj.LuaTable r9 = new luaj.LuaTable     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r10 = r0.f1434c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.b2(r4, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r10 = "cmdLine"
                java.lang.String r11 = r0.f1432a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.b2(r10, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r10 = r0.f1433b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.b2(r3, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r10 = r0.f1435d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.b2(r2, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r10 = "pid"
                int r11 = r0.f1437f     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.a2(r10, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                int r10 = r0.f1438g     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.a2(r1, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r10 = "x64"
                boolean r11 = r0.n     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                if (r11 == 0) goto L4e
                luaj.LuaBoolean r11 = luaj.LuaValue.f1672d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                goto L50
            L49:
                r0 = move-exception
                r18 = r5
                goto L1c7
            L4e:
                luaj.LuaBoolean r11 = luaj.LuaValue.f1673e     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
            L50:
                r9.c2(r10, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r10 = "RSS"
                int r0 = r0.o     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.a2(r10, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r0 = "firstInstallTime"
                long r10 = r8.firstInstallTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                double r10 = (double) r10     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.Z1(r0, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r0 = "lastUpdateTime"
                long r10 = r8.lastUpdateTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                double r10 = (double) r10     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.Z1(r0, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r0 = r8.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                if (r0 == 0) goto L71
                r9.b2(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
            L71:
                java.lang.String r0 = r8.sharedUserId     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                if (r0 == 0) goto L7a
                java.lang.String r10 = "sharedUserId"
                r9.b2(r10, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
            L7a:
                java.lang.String r0 = "sharedUserLabel"
                int r10 = r8.sharedUserLabel     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.a2(r0, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r0 = "versionCode"
                int r10 = r8.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r9.a2(r0, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r0 = r8.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                if (r0 == 0) goto L91
                java.lang.String r10 = "versionName"
                r9.b2(r10, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
            L91:
                android.content.pm.PackageManager r10 = android.ext.Tools.B0()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                android.content.pm.ActivityInfo[] r0 = r8.activities     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                java.lang.String r11 = "label"
                if (r0 == 0) goto Lf5
                if (r10 == 0) goto Lf5
                luaj.LuaTable r12 = new luaj.LuaTable     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r12.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                android.content.pm.ActivityInfo[] r13 = r8.activities     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                int r14 = r13.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                r0 = 0
                r7 = 0
                r15 = 1
            La8:
                if (r7 >= r14) goto Led
                r0 = r13[r7]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                if (r0 != 0) goto Lb3
                r18 = r5
                r16 = r13
                goto Le3
            Lb3:
                r18 = r5
                luaj.LuaTable r5 = new luaj.LuaTable     // Catch: java.lang.Throwable -> Ldb
                r5.<init>()     // Catch: java.lang.Throwable -> Ldb
                r16 = r13
                java.lang.String r13 = r0.name     // Catch: java.lang.Throwable -> Lc4
                if (r13 == 0) goto Lc6
                r5.h2(r3, r13)     // Catch: java.lang.Throwable -> Lc4
                goto Lc6
            Lc4:
                r0 = move-exception
                goto Lde
            Lc6:
                java.lang.CharSequence r0 = r0.loadLabel(r10)     // Catch: java.lang.Throwable -> Lc4
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc4
                r5.h2(r11, r0)     // Catch: java.lang.Throwable -> Lc4
                int r13 = r15 + 1
                r12.e2(r15, r5)     // Catch: java.lang.Throwable -> Ld8
                r15 = r13
                goto Le3
            Ld8:
                r0 = move-exception
                r15 = r13
                goto Lde
            Ldb:
                r0 = move-exception
                r16 = r13
            Lde:
                java.lang.String r5 = "Failed get activity info"
                android.ext.e1.s(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            Le3:
                int r7 = r7 + 1
                r5 = r18
                r13 = r16
                goto La8
            Lea:
                r0 = move-exception
                goto L1c7
            Led:
                r18 = r5
                java.lang.String r0 = "activities"
                r9.c2(r0, r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                goto Lf7
            Lf5:
                r18 = r5
            Lf7:
                if (r10 == 0) goto L119
                java.lang.String r0 = "installer"
                java.lang.String r5 = r10.getInstallerPackageName(r6)     // Catch: java.lang.Throwable -> L103
                r9.b2(r0, r5)     // Catch: java.lang.Throwable -> L103
                goto L109
            L103:
                r0 = move-exception
                java.lang.String r5 = "Failed get installer"
                android.ext.e1.s(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L109:
                java.lang.String r0 = "enabledSetting"
                int r5 = r10.getApplicationEnabledSetting(r6)     // Catch: java.lang.Throwable -> L113
                r9.a2(r0, r5)     // Catch: java.lang.Throwable -> L113
                goto L119
            L113:
                r0 = move-exception
                java.lang.String r5 = "Failed get enabledSetting"
                android.ext.e1.s(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L119:
                android.content.pm.ApplicationInfo r0 = r8.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r0 == 0) goto L1c2
                java.lang.String r5 = r0.backupAgentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r5 == 0) goto L126
                java.lang.String r7 = "backupAgentName"
                r9.b2(r7, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L126:
                java.lang.String r5 = r0.className     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r5 == 0) goto L12f
                java.lang.String r7 = "className"
                r9.b2(r7, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L12f:
                java.lang.String r5 = r0.dataDir     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r5 == 0) goto L138
                java.lang.String r7 = "dataDir"
                r9.b2(r7, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L138:
                java.lang.String r5 = "descriptionRes"
                int r7 = r0.descriptionRes     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                r9.a2(r5, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                java.lang.String r5 = "flags"
                int r7 = r0.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                r9.a2(r5, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                java.lang.String r5 = "icon"
                int r7 = r0.icon     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                r9.a2(r5, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                java.lang.String r5 = "labelRes"
                int r7 = r0.labelRes     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                r9.a2(r5, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                java.lang.String r5 = "logo"
                int r7 = r0.logo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                r9.a2(r5, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                java.lang.String r5 = r0.manageSpaceActivityName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r5 == 0) goto L164
                java.lang.String r7 = "manageSpaceActivityName"
                r9.b2(r7, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L164:
                java.lang.String r5 = r0.name     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r5 == 0) goto L16b
                r9.b2(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L16b:
                java.lang.String r3 = r0.nativeLibraryDir     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r3 == 0) goto L172
                r9.b2(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L172:
                java.lang.String r2 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r2 == 0) goto L179
                r9.b2(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L179:
                java.lang.String r2 = r0.permission     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r2 == 0) goto L182
                java.lang.String r3 = "permission"
                r9.b2(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L182:
                java.lang.String r2 = r0.processName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r2 == 0) goto L18b
                java.lang.String r3 = "processName"
                r9.b2(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L18b:
                java.lang.String r2 = r0.publicSourceDir     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r2 == 0) goto L194
                java.lang.String r3 = "publicSourceDir"
                r9.b2(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L194:
                java.lang.String r2 = r0.sourceDir     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r2 == 0) goto L19d
                java.lang.String r3 = "sourceDir"
                r9.b2(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L19d:
                java.lang.String r2 = "targetSdkVersion"
                int r3 = r0.targetSdkVersion     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                r9.a2(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                java.lang.String r2 = r0.taskAffinity     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r2 == 0) goto L1ad
                java.lang.String r3 = "taskAffinity"
                r9.b2(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L1ad:
                java.lang.String r2 = "theme"
                int r3 = r0.theme     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                r9.a2(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                int r2 = r0.uid     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                r9.a2(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                java.lang.String r0 = android.ext.Tools.a0(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
                if (r0 == 0) goto L1c2
                r9.b2(r11, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lea
            L1c2:
                r5 = r9
                goto L1e0
            L1c4:
                r18 = r5
                goto L1e0
            L1c7:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Pkg not found: "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                android.ext.e1.s(r1, r0)
                goto L1de
            L1dc:
                r18 = r5
            L1de:
                r5 = r18
            L1e0:
                return r5
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getTargetInfo() -> table || nil"
                return r0
        }
    }

    static final class getTargetPackage extends android.ext.Script.ApiFunction {
        getTargetPackage() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r1) {
                r0 = this;
                android.ext.MainService r1 = android.ext.MainService.instance
                android.ext.z1$d r1 = r1.v0
                if (r1 == 0) goto L9
                java.lang.String r1 = r1.f1434c
                goto La
            L9:
                r1 = 0
            La:
                if (r1 != 0) goto Lf
                luaj.LuaValue r1 = luaj.LuaValue.f1671c
                goto L13
            Lf:
                luaj.LuaString r1 = luaj.LuaValue.K2(r1)
            L13:
                return r1
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getTargetPackage() -> string || nil"
                return r0
        }
    }

    final class getValues extends android.ext.Script.BusyApiFunction {
        final java.util.ArrayList f0;
        long[] g0;
        int[] h0;
        int i0;
        final /* synthetic */ android.ext.Script j0;

        getValues(android.ext.Script r1) {
                r0 = this;
                r0.j0 = r1
                r0.<init>(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f0 = r1
                r1 = 0
                r0.g0 = r1
                r0.h0 = r1
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        protected luaj.Varargs a3() {
                r8 = this;
                java.util.ArrayList r0 = r8.f0
                luaj.LuaTable r1 = new luaj.LuaTable
                r1.<init>()
                int r2 = r8.i0
                r1.R1(r2)
                java.util.ArrayList r2 = android.ext.Script.p0
                r3 = 0
                r4 = 0
                if (r2 == 0) goto L3b
                int r5 = android.ext.Script.q0
                int r5 = r5 + 1
                android.ext.Script.q0 = r5
                android.ext.Script.p0 = r3
                java.util.Iterator r2 = r2.iterator()
            L1e:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L62
                java.lang.Object r5 = r2.next()
                android.ext.c r5 = (android.ext.c) r5
                int r6 = r4 + 1
                java.lang.Object r4 = r0.get(r4)
                luaj.LuaValue r4 = (luaj.LuaValue) r4
                luaj.LuaTable r5 = android.ext.Script.X2(r3, r5)
                r1.d2(r4, r5)
                r4 = r6
                goto L1e
            L3b:
                int r2 = android.ext.Script.q0
                r5 = 100000(0x186a0, float:1.4013E-40)
                int r2 = r2 + r5
                android.ext.Script.q0 = r2
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "memList is null "
                r6.append(r7)
                int r7 = android.ext.Script.q0
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                android.ext.n0.h(r2, r5, r4)
            L62:
                r8.h0 = r3
                r8.g0 = r3
                r0.clear()
                r0.trimToSize()
                return r1
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r19) {
                r18 = this;
                r0 = r18
                r1 = 1
                r2 = r19
                luaj.LuaTable r1 = r2.I(r1)
                java.util.ArrayList r3 = r0.f0
                r4 = 0
                r0.h0 = r4
                r0.g0 = r4
                int r5 = r1.d3()
                int r6 = r1.e3()
                int r5 = r5 + r6
                long[] r6 = new long[r5]
                int[] r7 = new int[r5]
                r3.clear()
                r3.ensureCapacity(r5)
                android.ext.MainService r5 = android.ext.MainService.instance
                android.ext.z1$d r5 = r5.v0
                if (r5 == 0) goto L2c
                boolean r5 = r5.n
                goto L2d
            L2c:
                r5 = 0
            L2d:
                android.ext.c r15 = new android.ext.c
                r10 = 0
                r12 = 0
                r14 = 4
                r9 = r15
                r9.<init>(r10, r12, r14)
                luaj.LuaTable$i r9 = r1.s3()
                r10 = 0
                r11 = 0
                r12 = 0
            L3f:
                boolean r13 = r9.c()
                if (r13 == 0) goto Lf7
                int r13 = r9.a()
                if (r13 == 0) goto L4d
                int r10 = r10 + 1
            L4d:
                luaj.LuaValue r13 = r9.b()
                luaj.LuaValue r14 = r9.d()
                luaj.LuaTable r14 = r14.H0()
                r4 = 2
                android.ext.Script.T3(r15, r14, r4, r5)
                int r4 = r6.length
                if (r11 != r4) goto Ld9
                int r12 = r12 + 1
                int r4 = r11 >> 1
                r14 = 10
                if (r4 >= r14) goto L6a
                r4 = 10
            L6a:
                java.lang.Thread r14 = java.lang.Thread.currentThread()
                java.lang.RuntimeException r8 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r16 = r5
                java.lang.String r5 = "OF "
                r2.append(r5)
                r2.append(r12)
                java.lang.String r5 = "; "
                r2.append(r5)
                r17 = r9
                int r9 = r6.length
                r2.append(r9)
                r2.append(r5)
                int r9 = r1.d3()
                r2.append(r9)
                java.lang.String r9 = " + "
                r2.append(r9)
                int r9 = r1.e3()
                r2.append(r9)
                r2.append(r5)
                boolean r9 = r13.h1()
                r2.append(r9)
                java.lang.String r9 = ": "
                r2.append(r9)
                r2.append(r13)
                r2.append(r5)
                luaj.LuaValue r9 = r1.V0()
                r2.append(r9)
                r2.append(r5)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                r8.<init>(r2)
                r2 = 0
                android.ext.n0.h(r14, r8, r2)
                int r4 = r4 + r11
                long[] r5 = java.util.Arrays.copyOf(r6, r4)
                int[] r4 = java.util.Arrays.copyOf(r7, r4)
                r7 = r4
                r6 = r5
                goto Lde
            Ld9:
                r16 = r5
                r17 = r9
                r2 = 0
            Lde:
                long r4 = r15.f672a
                r6[r11] = r4
                int r4 = r11 + 1
                int r5 = r15.f674c
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r7[r11] = r5
                r3.add(r13)
                r2 = r19
                r11 = r4
                r5 = r16
                r9 = r17
                r4 = 0
                goto L3f
            Lf7:
                r0.i0 = r10
                int r1 = r7.length
                if (r1 != r11) goto Lfd
                goto L101
            Lfd:
                int[] r7 = java.util.Arrays.copyOf(r7, r11)
            L101:
                r0.h0 = r7
                int r1 = r6.length
                if (r1 != r11) goto L107
                goto L10b
            L107:
                long[] r6 = java.util.Arrays.copyOf(r6, r11)
            L10b:
                r0.g0 = r6
                if (r11 != 0) goto L11a
                r1 = 0
                r0.h0 = r1
                r0.g0 = r1
                luaj.LuaTable r1 = new luaj.LuaTable
                r1.<init>()
                return r1
            L11a:
                luaj.Varargs r1 = super.b3(r19)
                return r1
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r4) {
                r3 = this;
                android.ext.MainService r4 = android.ext.MainService.instance
                android.ext.f0 r4 = r4.i
                android.ext.Script r0 = r3.j0
                byte r0 = r0.t3()
                int[] r1 = r3.h0
                long[] r2 = r3.g0
                r4.R(r0, r1, r2)
                r4 = 0
                r3.h0 = r4
                r3.g0 = r4
                return r4
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getValues(table values) -> table || string with error"
                return r0
        }
    }

    final class getValuesRange extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        getValuesRange(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r6) {
                r5 = this;
                r0 = 1
                luaj.LuaTable r6 = r6.I(r0)
                luaj.LuaTable r0 = new luaj.LuaTable
                r0.<init>()
                int r1 = r6.d3()
                int r2 = r0.f3()
                r0.w3(r1, r2)
                luaj.LuaString[] r1 = android.ext.Script.t0
                r2 = 0
                r1 = r1[r2]
                luaj.LuaTable$i r6 = r6.s3()
            L1e:
                boolean r2 = r6.c()
                if (r2 == 0) goto L65
                luaj.LuaValue r2 = r6.d()
                boolean r3 = r2.o1()
                if (r3 != 0) goto L33
                long r2 = r2.C0()
                goto L3b
            L33:
                luaj.LuaTable r2 = r2.H0()
                long r2 = android.ext.Script.i3(r2, r1)
            L3b:
                int r4 = r6.a()
                if (r4 != 0) goto L55
                luaj.LuaValue r4 = r6.b()
                java.lang.CharSequence r2 = android.ext.RegionList.a(r2)
                java.lang.String r2 = r2.toString()
                luaj.LuaString r2 = luaj.LuaValue.K2(r2)
                r0.d2(r4, r2)
                goto L1e
            L55:
                java.lang.CharSequence r2 = android.ext.RegionList.a(r2)
                java.lang.String r2 = r2.toString()
                luaj.LuaString r2 = luaj.LuaValue.K2(r2)
                r0.Y1(r4, r2)
                goto L1e
            L65:
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.getValuesRange(table values) -> table || string with error"
                return r0
        }
    }

    static final class gotoAddress extends android.ext.Script.ApiFunction {
        gotoAddress() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r4) {
                r3 = this;
                android.ext.MainService r0 = android.ext.MainService.instance
                r1 = 1
                long r1 = r4.F(r1)
                r0.J(r1)
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                return r4
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.gotoAddress(long address) -> nil"
                return r0
        }
    }

    final class hideUiButton extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        hideUiButton(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r2) {
                r1 = this;
                android.ext.MainService r2 = android.ext.MainService.instance
                r0 = 0
                r2.R0(r0)
                luaj.LuaValue r2 = luaj.LuaValue.f1671c
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.hideUiButton() -> nil"
                return r0
        }
    }

    final class internal1 extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        internal1(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 4
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r15) {
                r14 = this;
                android.ext.Script r0 = r14.f0
                r0.y3()
                r0 = 1
                luaj.LuaString r1 = r15.H(r0)     // Catch: java.lang.NumberFormatException -> L48
                int r2 = r1.R     // Catch: java.lang.NumberFormatException -> L48
                byte[] r5 = new byte[r2]     // Catch: java.lang.NumberFormatException -> L48
                r3 = 0
                r1.U2(r3, r5, r3, r2)     // Catch: java.lang.NumberFormatException -> L48
                r1 = 1
                r3 = 4
                long r1 = r15.a0(r3, r1)     // Catch: java.lang.NumberFormatException -> L48
                r6 = 2
                r4 = 2
                int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r8 != 0) goto L21
                r0 = 2
            L21:
                android.ext.Script r1 = r14.f0     // Catch: java.lang.NumberFormatException -> L48
                byte r1 = r1.t3()     // Catch: java.lang.NumberFormatException -> L48
                r6 = 0
                long r8 = r15.a0(r4, r6)     // Catch: java.lang.NumberFormatException -> L48
                r2 = 3
                r10 = -1
                long r10 = r15.a0(r2, r10)     // Catch: java.lang.NumberFormatException -> L48
                r2 = 0
                long r12 = r15.a0(r3, r6)     // Catch: java.lang.NumberFormatException -> L48
                r3 = r1
                r4 = r0
                r6 = r8
                r8 = r10
                r10 = r2
                r11 = r12
                boolean r15 = android.ext.i2.m(r3, r4, r5, r6, r8, r10, r11)     // Catch: java.lang.NumberFormatException -> L48
                if (r15 == 0) goto L4a
                luaj.LuaBoolean r15 = luaj.LuaValue.f1672d     // Catch: java.lang.NumberFormatException -> L48
                goto L4b
            L48:
                r15 = move-exception
                goto L4c
            L4a:
                r15 = 0
            L4b:
                return r15
            L4c:
                java.lang.String r15 = android.ext.Script.V3(r15)
                luaj.LuaString r15 = luaj.LuaValue.K2(r15)
                return r15
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "do not use"
                return r0
        }
    }

    final class internal2 extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        internal2(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r8) {
                r7 = this;
                r0 = 1
                luaj.LuaClosure r0 = r8.A(r0)
                r1 = 2
                java.lang.String r8 = r8.E(r1)
                luaj.LuaBoolean r1 = luaj.LuaValue.f1672d
                java.io.PrintStream r2 = luaj.g.f1714b
                java.io.PrintStream r3 = new java.io.PrintStream     // Catch: java.lang.Throwable -> L40
                java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L40
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L40
                r5.<init>(r8)     // Catch: java.lang.Throwable -> L40
                r6 = 65536(0x10000, float:9.1835E-41)
                r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L40
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L40
                luaj.g.f1714b = r3     // Catch: java.lang.Throwable -> L40
                luaj.h r3 = r0.R     // Catch: java.lang.Throwable -> L40
                luaj.g.A(r3)     // Catch: java.lang.Throwable -> L40
                java.io.PrintStream r3 = luaj.g.f1714b     // Catch: java.lang.Throwable -> L40
                r3.close()     // Catch: java.lang.Throwable -> L40
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
                r3.<init>()     // Catch: java.lang.Throwable -> L40
                r3.append(r8)     // Catch: java.lang.Throwable -> L40
                java.lang.String r4 = ".tail"
                r3.append(r4)     // Catch: java.lang.Throwable -> L40
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L40
                luaj.g.M(r0, r3)     // Catch: java.lang.Throwable -> L40
                goto L6a
            L40:
                r1 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed dump "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = " into '"
                r3.append(r0)
                r3.append(r8)
                r8 = 39
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                android.ext.e1.l(r8, r1)
                java.lang.String r8 = android.ext.Script.V3(r1)
                luaj.LuaString r1 = luaj.LuaValue.K2(r8)
            L6a:
                luaj.g.f1714b = r2
                return r1
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "do not use"
                return r0
        }
    }

    static final class isClickedUiButton extends android.ext.Script.ApiFunction {
        isClickedUiButton() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r3) {
                r2 = this;
                android.ext.MainService r3 = android.ext.MainService.instance
                luaj.LuaValue r0 = luaj.LuaValue.f1671c
                android.view.View r1 = r3.f214d
                if (r1 == 0) goto L14
                boolean r0 = r3.f215e
                if (r0 == 0) goto L12
                r0 = 0
                r3.f215e = r0
                luaj.LuaBoolean r0 = luaj.LuaValue.f1672d
                goto L14
            L12:
                luaj.LuaBoolean r0 = luaj.LuaValue.f1673e
            L14:
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.isClickedUiButton() -> bool || nil"
                return r0
        }
    }

    static final class isPackageInstalled extends android.ext.Script.ApiFunction {
        isPackageInstalled() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r2) {
                r1 = this;
                r0 = 1
                java.lang.String r2 = r2.E(r0)
                boolean r2 = android.ext.Tools.e1(r2)
                luaj.LuaBoolean r2 = luaj.LuaValue.H2(r2)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.isPackageInstalled(string pkg) -> bool"
                return r0
        }
    }

    static final class isProcessPaused extends android.ext.Script.ApiFunction {
        isProcessPaused() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r1) {
                r0 = this;
                android.ext.MainService r1 = android.ext.MainService.instance
                boolean r1 = r1.R
                luaj.LuaBoolean r1 = luaj.LuaValue.H2(r1)
                return r1
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.isProcessPaused() -> bool"
                return r0
        }
    }

    static final class isVisible extends android.ext.Script.ApiFunction {
        isVisible() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r1) {
                r0 = this;
                android.ext.MainService r1 = android.ext.MainService.instance
                android.ext.i1 r1 = r1.n
                if (r1 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                luaj.LuaBoolean r1 = luaj.LuaValue.H2(r1)
                return r1
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.isVisible() -> bool"
                return r0
        }
    }

    final class loadList extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        loadList(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r7) {
                r6 = this;
                java.io.File r0 = new java.io.File
                r1 = 1
                java.lang.String r2 = r7.E(r1)
                r0.<init>(r2)
                boolean r2 = r0.exists()
                java.lang.String r3 = "File '"
                if (r2 != 0) goto L2f
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r3)
                java.lang.String r0 = r0.getAbsolutePath()
                r7.append(r0)
                java.lang.String r0 = "' not found"
            L23:
                r7.append(r0)
            L26:
                java.lang.String r7 = r7.toString()
            L2a:
                luaj.LuaString r7 = luaj.LuaValue.K2(r7)
                return r7
            L2f:
                boolean r2 = r0.isFile()
                if (r2 != 0) goto L49
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r1 = "Path '"
                r7.append(r1)
                java.lang.String r0 = r0.getAbsolutePath()
                r7.append(r0)
                java.lang.String r0 = "' is not a file"
                goto L23
            L49:
                boolean r2 = r0.canRead()
                java.lang.String r4 = "' can not be read"
                if (r2 == 0) goto Lcf
                android.ext.Script r2 = r6.e0
                java.lang.String r5 = android.ext.Script.s3(r0)
                boolean r1 = r2.m(r5, r1)
                if (r1 == 0) goto L5e
                goto Lcf
            L5e:
                r1 = 2
                r2 = 0
                int r7 = r7.Y(r1, r2)
                android.ext.Script r1 = r6.e0     // Catch: java.lang.Throwable -> L87
                java.io.FileInputStream r1 = luaj.lib.d.e(r0, r1)     // Catch: java.lang.Throwable -> L87
                if (r1 != 0) goto L89
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
                r1.<init>()     // Catch: java.lang.Throwable -> L87
                r1.append(r3)     // Catch: java.lang.Throwable -> L87
                java.lang.String r2 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L87
                r1.append(r2)     // Catch: java.lang.Throwable -> L87
                r1.append(r4)     // Catch: java.lang.Throwable -> L87
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L87
                luaj.LuaString r7 = luaj.LuaValue.K2(r1)     // Catch: java.lang.Throwable -> L87
                return r7
            L87:
                r1 = move-exception
                goto La9
            L89:
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La4
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La4
                r3.<init>(r1)     // Catch: java.lang.Throwable -> La4
                r2.<init>(r3)     // Catch: java.lang.Throwable -> La4
                android.ext.MainService r3 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> La4
                android.ext.z1$d r3 = r3.v0     // Catch: java.lang.Throwable -> La4
                int r3 = r3.f1437f     // Catch: java.lang.Throwable -> La4
                r4 = r7 | 4
                android.ext.c1.c(r2, r3, r4)     // Catch: java.lang.Throwable -> La4
                r1.close()     // Catch: java.lang.Throwable -> L87
                luaj.LuaBoolean r7 = luaj.LuaValue.f1672d     // Catch: java.lang.Throwable -> L87
                return r7
            La4:
                r2 = move-exception
                r1.close()     // Catch: java.lang.Throwable -> L87
                throw r2     // Catch: java.lang.Throwable -> L87
            La9:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed load list: "
                r2.append(r3)
                java.lang.String r0 = r0.getAbsolutePath()
                r2.append(r0)
                java.lang.String r0 = "; "
                r2.append(r0)
                r2.append(r7)
                java.lang.String r7 = r2.toString()
                android.ext.e1.l(r7, r1)
                java.lang.String r7 = android.ext.Script.V3(r1)
                goto L2a
            Lcf:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r3)
                java.lang.String r0 = r0.getAbsolutePath()
                r7.append(r0)
                r7.append(r4)
                goto L26
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 2
                if (r3 == r0) goto L4
                goto L15
            L4:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L15
                android.ext.Script r3 = r1.e0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f375e
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L15:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.loadList(string file [, int flags = 0]) -> true || string with error"
                return r0
        }
    }

    final class loadResults extends android.ext.Script.BusyApiFunction {
        java.util.ArrayList f0;
        final /* synthetic */ android.ext.Script g0;

        loadResults(android.ext.Script r1) {
                r0 = this;
                r0.g0 = r1
                r0.<init>(r1)
                r1 = 0
                r0.f0 = r1
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r4) {
                r3 = this;
                android.ext.Script r0 = r3.g0
                r0.y3()
                java.util.ArrayList r0 = android.ext.Script.r3(r4)
                android.ext.MainService r1 = android.ext.MainService.instance
                android.ext.Script r2 = r3.g0
                byte r2 = r2.t3()
                r1.n(r2)
                int r1 = r0.size()
                if (r1 != 0) goto L1d
                luaj.LuaBoolean r4 = luaj.LuaValue.f1672d
                return r4
            L1d:
                r3.f0 = r0
                luaj.Varargs r4 = super.b3(r4)
                return r4
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r4) {
                r3 = this;
                r4 = 0
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L13
                android.ext.f0 r0 = r0.i     // Catch: java.lang.Throwable -> L13
                android.ext.Script r1 = r3.g0     // Catch: java.lang.Throwable -> L13
                byte r1 = r1.t3()     // Catch: java.lang.Throwable -> L13
                java.util.ArrayList r2 = r3.f0     // Catch: java.lang.Throwable -> L13
                r0.f0(r1, r2)     // Catch: java.lang.Throwable -> L13
                r3.f0 = r4
                return r4
            L13:
                r0 = move-exception
                r3.f0 = r4
                throw r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.loadResults(table results) -> true || string with error"
                return r0
        }
    }

    final class makeRequest extends android.ext.Script.ApiFunction implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener {
        private volatile byte e0;
        final /* synthetic */ android.ext.Script f0;


        makeRequest(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>()
                r1 = 0
                r0.e0 = r1
                return
        }

        private void l3(java.lang.String r2, luaj.LuaTable r3, java.net.HttpURLConnection r4) {
                r1 = this;
                luaj.LuaTable$i r3 = r3.s3()
            L4:
                boolean r0 = r3.c()
                if (r0 == 0) goto L16
                luaj.LuaValue r0 = r3.d()
                java.lang.String r0 = r0.B0()
                r4.addRequestProperty(r2, r0)
                goto L4
            L16:
                return
        }

        private long m3(java.net.HttpURLConnection r13) {
                r12 = this;
                java.lang.String r0 = "Content-Length"
                java.lang.String r13 = r13.getHeaderField(r0)
                r0 = -1
                if (r13 != 0) goto Lb
                return r0
            Lb:
                java.lang.String r13 = r13.trim()
                boolean r2 = r13.isEmpty()
                if (r2 == 0) goto L16
                return r0
            L16:
                r2 = 0
                r4 = 0
            L19:
                int r5 = r13.length()
                if (r4 >= r5) goto L48
                char r5 = r13.charAt(r4)
                int r6 = r5 + (-48)
                r7 = 48
                if (r5 < r7) goto L47
                r7 = 57
                if (r5 <= r7) goto L2e
                goto L47
            L2e:
                long r5 = (long) r6
                r7 = 16777216(0x1000000, double:8.289046E-317)
                long r7 = r7 - r5
                r9 = 10
                long r7 = r7 / r9
                int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r11 <= 0) goto L3e
                r0 = 16777217(0x1000001, double:8.2890466E-317)
                return r0
            L3e:
                java.lang.Long.signum(r2)
                long r2 = r2 * r9
                long r2 = r2 + r5
                int r4 = r4 + 1
                goto L19
            L47:
                return r0
            L48:
                return r2
        }

        private luaj.LuaTable n3(java.net.HttpURLConnection r8) {
                r7 = this;
                luaj.LuaTable r0 = new luaj.LuaTable
                r0.<init>()
                java.util.Map r8 = r8.getHeaderFields()
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            L11:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L55
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 != 0) goto L27
                java.lang.String r2 = "null"
            L27:
                java.lang.Object r1 = r1.getValue()
                java.util.List r1 = (java.util.List) r1
                luaj.LuaTable r3 = new luaj.LuaTable
                r3.<init>()
                int r4 = r1.size()
                r3.R1(r4)
                java.util.Iterator r1 = r1.iterator()
                r4 = 1
            L3e:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L51
                java.lang.Object r5 = r1.next()
                java.lang.String r5 = (java.lang.String) r5
                int r6 = r4 + 1
                r3.X1(r4, r5)
                r4 = r6
                goto L3e
            L51:
                r0.c2(r2, r3)
                goto L11
            L55:
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 3
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r6) {
                r5 = this;
                r0 = 1
                java.lang.String r1 = r6.E(r0)
                r2 = 2
                r3 = 0
                luaj.LuaTable r2 = r6.c0(r2, r3)
                if (r2 != 0) goto L12
                luaj.LuaTable r2 = new luaj.LuaTable
                r2.<init>()
            L12:
                r4 = 3
                luaj.LuaString r6 = r6.b0(r4, r3)
                byte r3 = r5.e0
                if (r3 != 0) goto L2c
                monitor-enter(r5)
                android.ext.Script$makeRequest$1 r3 = new android.ext.Script$makeRequest$1     // Catch: java.lang.Throwable -> L29
                r3.<init>(r5)     // Catch: java.lang.Throwable -> L29
                android.ext.n2.i(r3)     // Catch: java.lang.Throwable -> L29
                android.ext.Script.W3(r5)     // Catch: java.lang.Throwable -> L29
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L29
                goto L2c
            L29:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L29
                throw r6
            L2c:
                byte r3 = r5.e0
                if (r3 == r0) goto L37
                java.lang.String r6 = "The user did not allow access to the Internet."
                luaj.LuaString r6 = luaj.LuaValue.K2(r6)
                return r6
            L37:
                luaj.Varargs r6 = r5.o3(r1, r2, r6)
                return r6
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.makeRequest(string url [, table headers = {} [, string data = nil]]) -> table || string"
                return r0
        }

        public luaj.Varargs o3(java.lang.String r8, luaj.LuaTable r9, luaj.LuaString r10) {
                r7 = this;
                r4 = 30000(0x7530, float:4.2039E-41)
                r5 = 30000(0x7530, float:4.2039E-41)
                r6 = 30000(0x7530, float:4.2039E-41)
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                luaj.Varargs r8 = r0.p3(r1, r2, r3, r4, r5, r6)
                return r8
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1 = 1
                r0.e0 = r1
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r1) {
                r0 = this;
                monitor-enter(r0)
                byte r1 = r0.e0     // Catch: java.lang.Throwable -> L9
                if (r1 != 0) goto Lb
                r1 = 2
                r0.e0 = r1     // Catch: java.lang.Throwable -> L9
                goto Lb
            L9:
                r1 = move-exception
                goto L10
            Lb:
                r0.notify()     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L10:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }

        luaj.Varargs p3(java.lang.String r8, luaj.LuaTable r9, luaj.LuaString r10, int r11, int r12, int r13) {
                r7 = this;
                java.lang.String r0 = "Content-Type"
                java.lang.String r1 = "Content-Length"
                r2 = 0
                luaj.LuaTable r3 = new luaj.LuaTable     // Catch: java.lang.Throwable -> L1cf
                r3.<init>()     // Catch: java.lang.Throwable -> L1cf
                java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L1cf
                r4.<init>(r8)     // Catch: java.lang.Throwable -> L1cf
                java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.Throwable -> L1cf
                java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L1cf
                r4.setConnectTimeout(r11)     // Catch: java.lang.Throwable -> L3d
                r4.setReadTimeout(r12)     // Catch: java.lang.Throwable -> L3d
                luaj.LuaTable$i r9 = r9.s3()     // Catch: java.lang.Throwable -> L3d
            L1f:
                boolean r11 = r9.c()     // Catch: java.lang.Throwable -> L3d
                if (r11 == 0) goto L4d
                luaj.LuaValue r11 = r9.b()     // Catch: java.lang.Throwable -> L3d
                luaj.LuaValue r12 = r9.d()     // Catch: java.lang.Throwable -> L3d
                boolean r5 = r12 instanceof luaj.LuaTable     // Catch: java.lang.Throwable -> L3d
                if (r5 == 0) goto L41
                java.lang.String r11 = r11.B0()     // Catch: java.lang.Throwable -> L3d
                luaj.LuaTable r12 = r12.H0()     // Catch: java.lang.Throwable -> L3d
                r7.l3(r11, r12, r4)     // Catch: java.lang.Throwable -> L3d
                goto L1f
            L3d:
                r8 = move-exception
                r2 = r4
                goto L1d0
            L41:
                java.lang.String r11 = r11.B0()     // Catch: java.lang.Throwable -> L3d
                java.lang.String r12 = r12.B0()     // Catch: java.lang.Throwable -> L3d
                r4.addRequestProperty(r11, r12)     // Catch: java.lang.Throwable -> L3d
                goto L1f
            L4d:
                if (r10 == 0) goto Lbf
                r9 = 1
                r4.setDoOutput(r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r9 = "POST"
                r4.setRequestMethod(r9)     // Catch: java.lang.Throwable -> L3d
                int r9 = r10.R     // Catch: java.lang.Throwable -> L3d
                java.lang.String r11 = r4.getRequestProperty(r1)     // Catch: java.lang.Throwable -> L3d
                if (r11 != 0) goto L67
                java.lang.String r11 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L3d
                r4.addRequestProperty(r1, r11)     // Catch: java.lang.Throwable -> L3d
            L67:
                java.lang.String r11 = r4.getRequestProperty(r0)     // Catch: java.lang.Throwable -> L3d
                if (r11 != 0) goto L72
                java.lang.String r11 = "application/x-www-form-urlencoded"
                r4.addRequestProperty(r0, r11)     // Catch: java.lang.Throwable -> L3d
            L72:
                r4.setFixedLengthStreamingMode(r9)     // Catch: java.lang.Throwable -> L3d
                r4.connect()     // Catch: java.lang.Throwable -> L3d
                java.io.OutputStream r11 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L3d
                android.ext.Script$PostWriteWorker r12 = new android.ext.Script$PostWriteWorker     // Catch: java.lang.Throwable -> L3d
                byte[] r0 = r10.P     // Catch: java.lang.Throwable -> L3d
                int r10 = r10.Q     // Catch: java.lang.Throwable -> L3d
                r12.<init>(r11, r0, r10, r9)     // Catch: java.lang.Throwable -> L3d
                r12.start()     // Catch: java.lang.Throwable -> L3d
                long r9 = (long) r13
                r12.join(r9)     // Catch: java.lang.Throwable -> La7 java.lang.InterruptedException -> La9
                boolean r9 = r12.isAlive()     // Catch: java.lang.Throwable -> La7
                if (r9 != 0) goto L9f
                boolean r9 = r12.isAlive()     // Catch: java.lang.Throwable -> L3d
                if (r9 == 0) goto L9b
                r4.disconnect()     // Catch: java.lang.Throwable -> L3d
            L9b:
                r12.a(r9)     // Catch: java.lang.Throwable -> L3d
                goto Lc2
            L9f:
                java.io.InterruptedIOException r8 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> La7
                java.lang.String r9 = "POST body write timed out"
                r8.<init>(r9)     // Catch: java.lang.Throwable -> La7
                throw r8     // Catch: java.lang.Throwable -> La7
            La7:
                r8 = move-exception
                goto Lb2
            La9:
                r8 = move-exception
                java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La7
                r9.interrupt()     // Catch: java.lang.Throwable -> La7
                throw r8     // Catch: java.lang.Throwable -> La7
            Lb2:
                boolean r9 = r12.isAlive()     // Catch: java.lang.Throwable -> L3d
                if (r9 == 0) goto Lbb
                r4.disconnect()     // Catch: java.lang.Throwable -> L3d
            Lbb:
                r12.a(r9)     // Catch: java.lang.Throwable -> L3d
                throw r8     // Catch: java.lang.Throwable -> L3d
            Lbf:
                r4.connect()     // Catch: java.lang.Throwable -> L3d
            Lc2:
                java.lang.String r9 = "url"
                r3.b2(r9, r8)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "requestMethod"
                java.lang.String r9 = r4.getRequestMethod()     // Catch: java.lang.Throwable -> L3d
                r3.b2(r8, r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "code"
                int r9 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L3d
                r3.a2(r8, r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "message"
                java.lang.String r9 = r4.getResponseMessage()     // Catch: java.lang.Throwable -> L3d
                r3.b2(r8, r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "headers"
                luaj.LuaTable r9 = r7.n3(r4)     // Catch: java.lang.Throwable -> L3d
                r3.c2(r8, r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "contentEncoding"
                java.lang.String r9 = r4.getContentEncoding()     // Catch: java.lang.Throwable -> L3d
                r3.b2(r8, r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "contentLength"
                int r9 = r4.getContentLength()     // Catch: java.lang.Throwable -> L3d
                r3.a2(r8, r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "contentType"
                java.lang.String r9 = r4.getContentType()     // Catch: java.lang.Throwable -> L3d
                r3.b2(r8, r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "date"
                long r9 = r4.getDate()     // Catch: java.lang.Throwable -> L3d
                double r9 = (double) r9     // Catch: java.lang.Throwable -> L3d
                r3.Z1(r8, r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "expiration"
                long r9 = r4.getExpiration()     // Catch: java.lang.Throwable -> L3d
                double r9 = (double) r9     // Catch: java.lang.Throwable -> L3d
                r3.Z1(r8, r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "lastModified"
                long r9 = r4.getLastModified()     // Catch: java.lang.Throwable -> L3d
                double r9 = (double) r9     // Catch: java.lang.Throwable -> L3d
                r3.Z1(r8, r9)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r8 = "usingProxy"
                boolean r9 = r4.usingProxy()     // Catch: java.lang.Throwable -> L3d
                if (r9 == 0) goto L12f
                luaj.LuaBoolean r9 = luaj.LuaValue.f1672d     // Catch: java.lang.Throwable -> L3d
                goto L131
            L12f:
                luaj.LuaBoolean r9 = luaj.LuaValue.f1673e     // Catch: java.lang.Throwable -> L3d
            L131:
                r3.c2(r8, r9)     // Catch: java.lang.Throwable -> L3d
                boolean r8 = r4 instanceof javax.net.ssl.HttpsURLConnection     // Catch: java.lang.Throwable -> L3d
                if (r8 == 0) goto L144
                java.lang.String r8 = "cipherSuite"
                r9 = r4
                javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch: java.lang.Throwable -> L3d
                java.lang.String r9 = r9.getCipherSuite()     // Catch: java.lang.Throwable -> L3d
                r3.b2(r8, r9)     // Catch: java.lang.Throwable -> L3d
            L144:
                java.io.InputStream r8 = r4.getInputStream()     // Catch: java.lang.Throwable -> L14a java.io.IOException -> L14d
                r2 = r8
                goto L158
            L14a:
                r8 = move-exception
                goto L1c9
            L14d:
                java.io.InputStream r2 = r4.getErrorStream()     // Catch: java.lang.Throwable -> L14a
                java.lang.String r8 = "error"
                luaj.LuaBoolean r9 = luaj.LuaValue.f1672d     // Catch: java.lang.Throwable -> L14a
                r3.c2(r8, r9)     // Catch: java.lang.Throwable -> L14a
            L158:
                java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L14a
                r8.<init>(r2)     // Catch: java.lang.Throwable -> L14a
                long r9 = r7.m3(r4)     // Catch: java.lang.Throwable -> L185
                r11 = 16777216(0x1000000, double:8.289046E-317)
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 > 0) goto L1a5
                java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L185
                r9.<init>()     // Catch: java.lang.Throwable -> L185
                r10 = 8192(0x2000, float:1.148E-41)
                byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L185
                r0 = 0
            L173:
                int r13 = r8.read(r10)     // Catch: java.lang.Throwable -> L185
                r2 = -1
                if (r13 == r2) goto L191
                long r5 = (long) r13     // Catch: java.lang.Throwable -> L185
                long r0 = r0 + r5
                int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                if (r2 > 0) goto L189
                r2 = 0
                r9.write(r10, r2, r13)     // Catch: java.lang.Throwable -> L185
                goto L173
            L185:
                r9 = move-exception
                r2 = r8
                r8 = r9
                goto L1c9
            L189:
                java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L185
                java.lang.String r10 = "response body exceeds the 16777216 byte limit"
                r9.<init>(r10)     // Catch: java.lang.Throwable -> L185
                throw r9     // Catch: java.lang.Throwable -> L185
            L191:
                java.lang.String r10 = "content"
                byte[] r9 = r9.toByteArray()     // Catch: java.lang.Throwable -> L185
                luaj.LuaString r9 = luaj.LuaString.o3(r9)     // Catch: java.lang.Throwable -> L185
                r3.i2(r10, r9)     // Catch: java.lang.Throwable -> L185
                r8.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L1a1
            L1a1:
                r4.disconnect()
                return r3
            L1a5:
                java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L185
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L185
                r0.<init>()     // Catch: java.lang.Throwable -> L185
                java.lang.String r1 = "response body of "
                r0.append(r1)     // Catch: java.lang.Throwable -> L185
                r0.append(r9)     // Catch: java.lang.Throwable -> L185
                java.lang.String r9 = " bytes exceeds the "
                r0.append(r9)     // Catch: java.lang.Throwable -> L185
                r0.append(r11)     // Catch: java.lang.Throwable -> L185
                java.lang.String r9 = " byte limit"
                r0.append(r9)     // Catch: java.lang.Throwable -> L185
                java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L185
                r13.<init>(r9)     // Catch: java.lang.Throwable -> L185
                throw r13     // Catch: java.lang.Throwable -> L185
            L1c9:
                if (r2 == 0) goto L1ce
                r2.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L1ce
            L1ce:
                throw r8     // Catch: java.lang.Throwable -> L3d
            L1cf:
                r8 = move-exception
            L1d0:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fa
                r9.<init>()     // Catch: java.lang.Throwable -> L1fa
                java.lang.String r10 = "makeRequest failed: "
                r9.append(r10)     // Catch: java.lang.Throwable -> L1fa
                java.lang.Class r10 = r8.getClass()     // Catch: java.lang.Throwable -> L1fa
                java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> L1fa
                r9.append(r10)     // Catch: java.lang.Throwable -> L1fa
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L1fa
                android.ext.e1.p(r9)     // Catch: java.lang.Throwable -> L1fa
                java.lang.String r8 = android.ext.Script.V3(r8)     // Catch: java.lang.Throwable -> L1fa
                luaj.LuaString r8 = luaj.LuaValue.K2(r8)     // Catch: java.lang.Throwable -> L1fa
                if (r2 == 0) goto L1f9
                r2.disconnect()
            L1f9:
                return r8
            L1fa:
                r8 = move-exception
                if (r2 == 0) goto L200
                r2.disconnect()
            L200:
                throw r8
        }
    }

    static final class multiChoice extends android.ext.Script.ApiFunction implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnMultiChoiceClickListener {
        volatile boolean[] e0;
        private volatile boolean f0;


        multiChoice() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 3
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r11) {
                r10 = this;
                r0 = 1
                luaj.LuaTable r1 = r11.I(r0)
                r2 = 2
                r3 = 0
                luaj.LuaTable r2 = r11.c0(r2, r3)
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                luaj.LuaTable$i r1 = r1.s3()
            L1e:
                boolean r7 = r1.c()
                r8 = 0
                if (r7 == 0) goto L4c
                luaj.LuaValue r7 = r1.b()
                luaj.LuaValue r9 = r1.d()
                java.lang.String r9 = r9.B0()
                java.lang.String r9 = android.ext.b2.g(r9)
                r5.add(r9)
                if (r2 == 0) goto L41
                boolean r9 = android.ext.Script.G3(r2, r7, r8)
                if (r9 == 0) goto L41
                r8 = 1
            L41:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                r6.add(r8)
                r4.add(r7)
                goto L1e
            L4c:
                boolean[] r0 = android.ext.Tools.k(r6)
                r10.e0 = r0
                r10.f0 = r8
                r0 = 3
                java.lang.String r1 = ""
                java.lang.String r11 = r11.Z(r0, r1)
                java.lang.String r11 = android.ext.b2.g(r11)
                int r0 = r11.length()
                if (r0 <= 0) goto L76
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 10
                r0.append(r1)
                r0.append(r11)
                java.lang.String r3 = r0.toString()
            L76:
                int r11 = r5.size()
                java.lang.CharSequence[] r11 = new java.lang.CharSequence[r11]
                java.lang.Object[] r11 = r5.toArray(r11)
                java.lang.CharSequence[] r11 = (java.lang.CharSequence[]) r11
                monitor-enter(r10)
                android.ext.Script$multiChoice$1 r0 = new android.ext.Script$multiChoice$1     // Catch: java.lang.Throwable -> Lb6
                r0.<init>(r10, r3, r11)     // Catch: java.lang.Throwable -> Lb6
                android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> Lb6
                android.ext.Script.W3(r10)     // Catch: java.lang.Throwable -> Lb6
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb6
                boolean r11 = r10.f0
                if (r11 != 0) goto L96
                luaj.LuaValue r11 = luaj.LuaValue.f1671c
                return r11
            L96:
                luaj.LuaTable r11 = new luaj.LuaTable
                r11.<init>()
            L9b:
                int r0 = r4.size()
                if (r8 >= r0) goto Lb5
                boolean[] r0 = r10.e0
                boolean r0 = r0[r8]
                if (r0 == 0) goto Lb2
                java.lang.Object r0 = r4.get(r8)
                luaj.LuaValue r0 = (luaj.LuaValue) r0
                luaj.LuaBoolean r1 = luaj.LuaValue.f1672d
                r11.d2(r0, r1)
            Lb2:
                int r8 = r8 + 1
                goto L9b
            Lb5:
                return r11
            Lb6:
                r11 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb6
                throw r11
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.multiChoice(table items [, table selection = {} [, string message = nil]]) -> table || nil"
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1 = -1
                if (r2 != r1) goto L6
                r1 = 1
                r0.f0 = r1
            L6:
                return
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(android.content.DialogInterface r1, int r2, boolean r3) {
                r0 = this;
                boolean[] r1 = r0.e0
                r1[r2] = r3
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r2) {
                r1 = this;
                monitor-enter(r1)
                r1.notify()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                android.ext.MainService r2 = android.ext.MainService.instance
                r0 = 0
                r2.y(r0)
                return
            Lc:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                throw r2
        }
    }

    final class numberFromLocale extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        numberFromLocale(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r2) {
                r1 = this;
                r0 = 1
                java.lang.String r2 = r2.h0(r0)
                java.lang.String r2 = android.ext.Script.E3(r2)
                luaj.LuaString r2 = luaj.LuaValue.K2(r2)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.numberFromLocale(string num) -> string"
                return r0
        }
    }

    final class numberToLocale extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        numberToLocale(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r2) {
                r1 = this;
                r0 = 1
                java.lang.String r2 = r2.h0(r0)
                java.lang.String r2 = android.ext.Script.D3(r2)
                luaj.LuaString r2 = luaj.LuaValue.K2(r2)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.numberToLocale(string num) -> string"
                return r0
        }
    }

    final class processKill extends android.ext.Script.ApiFunction {
        private int e0;
        private long f0;
        final /* synthetic */ android.ext.Script g0;

        processKill(android.ext.Script r3) {
                r2 = this;
                r2.g0 = r3
                r2.<init>()
                r3 = 0
                r2.e0 = r3
                r0 = 0
                r2.f0 = r0
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r5) {
                r4 = this;
                long r0 = java.lang.System.nanoTime()
                r2 = 60000000000(0xdf8475800, double:2.96439387505E-313)
                long r0 = r0 / r2
                long r2 = r4.f0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L15
                r4.f0 = r0
                r5 = 0
                r4.e0 = r5
            L15:
                int r5 = r4.e0
                int r5 = r5 + 1
                r4.e0 = r5
                r0 = 4
                if (r5 <= r0) goto L24
                android.ext.Script r5 = r4.g0
                r0 = 3
                r5.x3(r0)
            L24:
                android.ext.MainService r5 = android.ext.MainService.instance
                android.ext.Script r0 = r4.g0
                byte r0 = r0.t3()
                boolean r5 = r5.w0(r0)
                luaj.LuaBoolean r5 = luaj.LuaValue.H2(r5)
                return r5
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.processKill() -> bool"
                return r0
        }
    }

    final class processPause extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        processPause(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r3) {
                r2 = this;
                android.ext.MainService r3 = android.ext.MainService.instance
                android.ext.Script r0 = r2.e0
                byte r0 = r0.t3()
                r1 = 1
                boolean r3 = r3.x0(r0, r1)
                luaj.LuaBoolean r3 = luaj.LuaValue.H2(r3)
                return r3
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.processPause() -> bool"
                return r0
        }
    }

    final class processResume extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        processResume(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r2) {
                r1 = this;
                android.ext.MainService r2 = android.ext.MainService.instance
                android.ext.Script r0 = r1.e0
                byte r0 = r0.t3()
                boolean r2 = r2.A0(r0)
                luaj.LuaBoolean r2 = luaj.LuaValue.H2(r2)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.processResume() -> bool"
                return r0
        }
    }

    final class processToggle extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        processToggle(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r3) {
                r2 = this;
                android.ext.MainService r3 = android.ext.MainService.instance
                android.ext.Script r0 = r2.e0
                byte r0 = r0.t3()
                r1 = 1
                boolean r3 = r3.B0(r0, r1)
                luaj.LuaBoolean r3 = luaj.LuaValue.H2(r3)
                return r3
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.processToggle() -> bool"
                return r0
        }
    }

    final class prompt extends android.ext.Script.ApiFunction implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener, android.view.View.OnFocusChangeListener {
        private volatile int e0;
        private volatile luaj.LuaTable f0;
        volatile java.util.ArrayList g0;
        final /* synthetic */ android.ext.Script h0;


        prompt(android.ext.Script r1) {
                r0 = this;
                r0.h0 = r1
                r0.<init>()
                r1 = 0
                r0.e0 = r1
                r1 = 0
                r0.f0 = r1
                r0.g0 = r1
                return
        }

        static /* synthetic */ void l3(android.ext.Script.prompt r0, android.view.View r1) {
                r0.m3(r1)
                return
        }

        private void m3(android.view.View r2) {
                r1 = this;
                r0 = 8
                r2.setVisibility(r0)
                android.ext.Tools.O0(r2)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 3
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r9) {
                r8 = this;
                r0 = 1
                luaj.LuaTable r3 = r9.I(r0)
                r0 = 2
                r7 = 0
                luaj.LuaTable r4 = r9.c0(r0, r7)
                r0 = 3
                luaj.LuaTable r5 = r9.c0(r0, r7)
                r9 = 0
                r8.e0 = r9
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                r8.g0 = r6
                luaj.LuaTable r9 = new luaj.LuaTable
                r9.<init>()
                r8.f0 = r9
                monitor-enter(r8)
                android.ext.Script$prompt$1 r9 = new android.ext.Script$prompt$1     // Catch: java.lang.Throwable -> L3d
                r1 = r9
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3d
                android.ext.n2.i(r9)     // Catch: java.lang.Throwable -> L3d
                android.ext.Script.W3(r8)     // Catch: java.lang.Throwable -> L3d
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L3d
                r8.g0 = r7
                luaj.LuaTable r9 = r8.f0
                r8.f0 = r7
                int r0 = r8.e0
                if (r0 != 0) goto L3c
                luaj.LuaValue r9 = luaj.LuaValue.f1671c
            L3c:
                return r9
            L3d:
                r9 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L3d
                throw r9
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.prompt(table prompts [, table defaults = {} [, table types = {} ]]) -> nil || table with keys from prompts and values from inputs"
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r7, int r8) {
                r6 = this;
                r7 = -1
                if (r8 == r7) goto L4
                return
            L4:
                int r8 = -r8
                r6.e0 = r8
                java.util.ArrayList r8 = r6.g0
                luaj.LuaTable r0 = r6.f0
                if (r8 == 0) goto L82
                if (r0 == 0) goto L82
                java.util.Iterator r8 = r8.iterator()
            L13:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L82
                java.lang.Object r1 = r8.next()
                android.widget.TextView r1 = (android.widget.TextView) r1
                if (r1 != 0) goto L22
                goto L13
            L22:
                java.lang.Object r2 = r1.getTag()
                luaj.LuaValue r2 = (luaj.LuaValue) r2
                if (r2 != 0) goto L2b
                goto L13
            L2b:
                boolean r3 = r1 instanceof android.widget.EditText
                r4 = 1
                if (r3 == 0) goto L5d
                java.lang.CharSequence r3 = r1.getText()
                java.lang.String r3 = r3.toString()
                boolean r5 = r1 instanceof android.ext.k0
                if (r5 == 0) goto L43
                android.ext.k0 r1 = (android.ext.k0) r1
                int r1 = r1.getDataType()
                goto L44
            L43:
                r1 = -1
            L44:
                if (r1 == r4) goto L4e
                r4 = 8
                if (r1 == r4) goto L4e
                r4 = 16
                if (r1 != r4) goto L52
            L4e:
                java.lang.String r3 = android.ext.Script.E3(r3)
            L52:
                luaj.LuaString r4 = luaj.LuaValue.K2(r3)
                r0.d2(r2, r4)
                android.ext.y0.b(r3, r1)
                goto L13
            L5d:
                boolean r3 = r1 instanceof android.widget.CheckBox
                if (r3 == 0) goto L6f
                android.widget.CheckBox r1 = (android.widget.CheckBox) r1
                boolean r1 = r1.isChecked()
                luaj.LuaBoolean r1 = luaj.LuaValue.H2(r1)
                r0.d2(r2, r1)
                goto L13
            L6f:
                java.lang.CharSequence r1 = r1.getText()
                java.lang.String r1 = r1.toString()
                luaj.LuaString r3 = luaj.LuaValue.K2(r1)
                r0.d2(r2, r3)
                android.ext.y0.b(r1, r4)
                goto L13
            L82:
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r2) {
                r1 = this;
                monitor-enter(r1)
                r1.notify()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                android.ext.MainService r2 = android.ext.MainService.instance
                r0 = 0
                r2.y(r0)
                return
            Lc:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                throw r2
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r6, boolean r7) {
                r5 = this;
                int r0 = android.ext.Config.B
                r1 = 1
                r0 = r0 & r1
                if (r0 != 0) goto L7
                return
            L7:
                android.view.View r0 = r6.getRootView()
                r2 = 2131034303(0x7f0500bf, float:1.767912E38)
                android.view.View r0 = r0.findViewById(r2)
                android.ext.InternalKeyboard r0 = (android.ext.InternalKeyboard) r0
                if (r0 == 0) goto L36
                boolean r2 = r6 instanceof android.ext.k0
                if (r2 == 0) goto L36
                r2 = r6
                android.ext.k0 r2 = (android.ext.k0) r2
                int r2 = r2.getDataType()
                r3 = 4
                r4 = 0
                if (r2 == r3) goto L2a
                r3 = 2
                if (r2 != r3) goto L29
                goto L2a
            L29:
                r1 = 0
            L2a:
                if (r1 == 0) goto L2d
                goto L2e
            L2d:
                r7 = 0
            L2e:
                r0.h(r6, r7)
                if (r1 != 0) goto L36
                android.ext.Tools.S0(r6)
            L36:
                return
        }
    }

    final class refineAddress extends android.ext.Script.searchAddress {
        final /* synthetic */ android.ext.Script g0;

        refineAddress(android.ext.Script r1) {
                r0 = this;
                r0.g0 = r1
                r0.<init>(r1)
                return
        }
    }

    final class refineNumber extends android.ext.Script.searchNumber {
        final /* synthetic */ android.ext.Script g0;

        refineNumber(android.ext.Script r1) {
                r0 = this;
                r0.g0 = r1
                r0.<init>(r1)
                return
        }
    }

    final class removeListItems extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;


        removeListItems(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r7) {
                r6 = this;
                r0 = 1
                luaj.LuaTable r7 = r7.I(r0)     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                r7.W1()     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                int r0 = r7.d3()     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                int r1 = r7.e3()     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                int r0 = r0 + r1
                long[] r0 = new long[r0]     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                luaj.LuaString[] r1 = android.ext.Script.t0     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                r2 = 0
                r1 = r1[r2]     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                luaj.LuaTable$i r7 = r7.s3()     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
            L1c:
                boolean r3 = r7.c()     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                if (r3 == 0) goto L41
                luaj.LuaValue r3 = r7.d()     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                boolean r4 = r3.o1()     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                if (r4 == 0) goto L37
                luaj.LuaTable r3 = (luaj.LuaTable) r3     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                long r3 = android.ext.Script.i3(r3, r1)     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                goto L3b
            L33:
                r7 = move-exception
                goto L59
            L35:
                r7 = move-exception
                goto L67
            L37:
                long r3 = r3.C0()     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
            L3b:
                int r5 = r2 + 1
                r0[r2] = r3     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                r2 = r5
                goto L1c
            L41:
                java.lang.Object r7 = new java.lang.Object     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                r7.<init>()     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                monitor-enter(r7)     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                android.ext.Script$removeListItems$1 r1 = new android.ext.Script$removeListItems$1     // Catch: java.lang.Throwable -> L56
                r1.<init>(r6, r0, r2, r7)     // Catch: java.lang.Throwable -> L56
                android.ext.n2.i(r1)     // Catch: java.lang.Throwable -> L56
                android.ext.Script.W3(r7)     // Catch: java.lang.Throwable -> L56
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L56
                luaj.LuaBoolean r7 = luaj.LuaValue.f1672d     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
                return r7
            L56:
                r0 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L56
                throw r0     // Catch: java.lang.Throwable -> L33 luaj.d -> L35
            L59:
                java.lang.String r0 = "Failed remove list items"
                android.ext.e1.l(r0, r7)
                java.lang.String r7 = android.ext.Script.V3(r7)
                luaj.LuaString r7 = luaj.LuaValue.K2(r7)
                return r7
            L67:
                throw r7
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.removeListItems(table items) -> true || string with error"
                return r0
        }
    }

    final class removeResults extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;


        removeResults(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r3) {
                r2 = this;
                android.ext.Script r0 = r2.e0
                r0.y3()
                java.util.ArrayList r3 = android.ext.Script.r3(r3)
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.f0 r0 = r0.i
                android.ext.Script r1 = r2.e0
                byte r1 = r1.t3()
                r0.i0(r1, r3)
                java.lang.Object r3 = new java.lang.Object
                r3.<init>()
                monitor-enter(r3)
                android.ext.Script$removeResults$1 r0 = new android.ext.Script$removeResults$1     // Catch: java.lang.Throwable -> L2b
                r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2b
                android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L2b
                android.ext.Script.W3(r3)     // Catch: java.lang.Throwable -> L2b
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
                luaj.LuaBoolean r3 = luaj.LuaValue.f1672d
                return r3
            L2b:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
                throw r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.removeResults(table results) -> true || string with error"
                return r0
        }
    }

    final class require extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        require(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r10) {
                r9 = this;
                java.lang.String r0 = "0"
                r1 = 1
                java.lang.String r0 = r10.Z(r1, r0)
                r2 = 2
                r3 = 0
                int r10 = r10.Y(r2, r3)
                int r4 = android.ext.h0.e(r0)
                r5 = 80000(0x13880, float:1.12104E-40)
                if (r4 <= r5) goto L17
                int r4 = r4 - r5
            L17:
                int r5 = android.ext.h0.d()
                r6 = 1056964608(0x3f000000, float:0.5)
                if (r5 < r4) goto L31
                r4 = 1183453082(0x468a0f9a, float:17671.8)
                float r5 = (float) r1
                float r5 = r5 * r4
                r4 = 1153276314(0x44bd999a, float:1516.8)
                float r5 = r5 - r4
                float r5 = r5 + r6
                int r4 = (int) r5
                if (r4 >= r10) goto L2e
                goto L31
            L2e:
                luaj.LuaValue r10 = luaj.LuaValue.f1671c
                return r10
            L31:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = ""
                r4.append(r5)
                float r5 = (float) r1
                r7 = 1122526823(0x42e86667, float:116.200005)
                float r7 = r7 * r5
                r8 = 1097649357(0x416ccccd, float:14.8)
                float r7 = r7 - r8
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                if (r10 <= 0) goto L88
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r0)
                java.lang.String r0 = " ("
                r7.append(r0)
                r7.append(r10)
                r10 = 41
                r7.append(r10)
                java.lang.String r7 = r7.toString()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r4)
                r8.append(r0)
                r0 = 1184457165(0x469961cd, float:19632.9)
                float r5 = r5 * r0
                r0 = 1163484774(0x45595e66, float:3477.9)
                float r5 = r5 - r0
                float r5 = r5 + r6
                int r0 = (int) r5
                r8.append(r0)
                r8.append(r10)
                java.lang.String r4 = r8.toString()
                r0 = r7
            L88:
                android.ext.Script r10 = r9.e0
                luaj.Globals r10 = r10.T
                java.io.PrintStream r10 = r10.c0
                r5 = 2131296800(0x7f090220, float:1.8211527E38)
                java.lang.String r5 = android.ext.b2.f(r5)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r3] = r0
                r2[r1] = r4
                java.lang.String r0 = android.ext.Tools.L1(r5, r2)
                r10.println(r0)
                android.ext.Script$OsExit r10 = new android.ext.Script$OsExit
                r10.<init>(r3)
                throw r10
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.require([string version = nil [, int build = 0]]) -> nil"
                return r0
        }
    }

    final class saveList extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;


        saveList(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r10) {
                r9 = this;
                java.io.File r0 = new java.io.File
                r1 = 1
                java.lang.String r1 = r10.E(r1)
                r0.<init>(r1)
                boolean r1 = r0.isDirectory()
                if (r1 == 0) goto L2f
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = "Path '"
                r10.append(r1)
                java.lang.String r0 = r0.getAbsolutePath()
                r10.append(r0)
                java.lang.String r0 = "' is a directory"
                r10.append(r0)
            L26:
                java.lang.String r10 = r10.toString()
            L2a:
                luaj.LuaString r10 = luaj.LuaValue.K2(r10)
                return r10
            L2f:
                android.ext.Script r1 = r9.e0
                java.lang.String r2 = android.ext.Script.s3(r0)
                r3 = 0
                boolean r1 = r1.m(r2, r3)
                java.lang.String r2 = "' can not be written"
                java.lang.String r4 = "File '"
                if (r1 == 0) goto L53
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r4)
                java.lang.String r0 = r0.getAbsolutePath()
                r10.append(r0)
                r10.append(r2)
                goto L26
            L53:
                r1 = 2
                int r10 = r10.Y(r1, r3)
                android.ext.MainService r1 = android.ext.MainService.instance
                android.ext.SavedListAdapter r5 = r1.t0     // Catch: java.lang.Throwable -> L6d
                int r6 = r5.getCount()     // Catch: java.lang.Throwable -> L6d
                android.ext.h2[] r7 = new android.ext.h2[r6]     // Catch: java.lang.Throwable -> L6d
            L62:
                if (r3 >= r6) goto L6f
                android.ext.h2 r8 = r5.d(r3)     // Catch: java.lang.Throwable -> L6d
                r7[r3] = r8     // Catch: java.lang.Throwable -> L6d
                int r3 = r3 + 1
                goto L62
            L6d:
                r1 = move-exception
                goto Lb5
            L6f:
                android.ext.Script r3 = r9.e0     // Catch: java.lang.Throwable -> L6d
                java.io.RandomAccessFile r3 = luaj.lib.d.f(r0, r3)     // Catch: java.lang.Throwable -> L6d
                if (r3 != 0) goto L92
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
                r1.<init>()     // Catch: java.lang.Throwable -> L6d
                r1.append(r4)     // Catch: java.lang.Throwable -> L6d
                java.lang.String r3 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L6d
                r1.append(r3)     // Catch: java.lang.Throwable -> L6d
                r1.append(r2)     // Catch: java.lang.Throwable -> L6d
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6d
                luaj.LuaString r10 = luaj.LuaValue.K2(r1)     // Catch: java.lang.Throwable -> L6d
                return r10
            L92:
                java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Lb0
                java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Lb0
                android.ext.Script$saveList$1 r5 = new android.ext.Script$saveList$1     // Catch: java.lang.Throwable -> Lb0
                r5.<init>(r9, r3)     // Catch: java.lang.Throwable -> Lb0
                r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb0
                r5 = 65536(0x10000, float:9.1835E-41)
                r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lb0
                android.ext.z1$d r1 = r1.v0     // Catch: java.lang.Throwable -> Lb0
                int r1 = r1.f1437f     // Catch: java.lang.Throwable -> Lb0
                android.ext.c1.e(r2, r1, r7, r10)     // Catch: java.lang.Throwable -> Lb0
                r3.close()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> Lad
            Lad:
                luaj.LuaBoolean r10 = luaj.LuaValue.f1672d     // Catch: java.lang.Throwable -> L6d
                return r10
            Lb0:
                r1 = move-exception
                r3.close()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> Lb4
            Lb4:
                throw r1     // Catch: java.lang.Throwable -> L6d
            Lb5:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed saved list: "
                r2.append(r3)
                java.lang.String r0 = r0.getAbsolutePath()
                r2.append(r0)
                java.lang.String r0 = "; "
                r2.append(r0)
                r2.append(r10)
                java.lang.String r10 = r2.toString()
                android.ext.e1.l(r10, r1)
                java.lang.String r10 = android.ext.Script.V3(r1)
                goto L2a
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 2
                if (r3 == r0) goto L4
                goto L15
            L4:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L15
                android.ext.Script r3 = r1.e0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f376f
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L15:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.saveList(string file [, int flags = 0]) -> true || string with error"
                return r0
        }
    }

    final class saveVariable extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        saveVariable(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r3) {
                r2 = this;
                luaj.lib.GgLib$saveVariable r0 = new luaj.lib.GgLib$saveVariable
                android.ext.Script r1 = r2.e0
                luaj.Globals r1 = r1.T
                r0.<init>(r1)
                luaj.Varargs r3 = r0.invoke(r3)
                return r3
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.saveVariable(mixed variable, string filename) -> true || string with error"
                return r0
        }
    }

    class searchAddress extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        searchAddress(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected final int Y2() {
                r1 = this;
                r0 = 7
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public final luaj.Varargs c3(luaj.Varargs r19) {
                r18 = this;
                r1 = r18
                r0 = r19
                android.ext.Script r2 = r1.f0
                r2.y3()
                boolean r2 = r1 instanceof android.ext.Script.refineAddress
                r3 = 0
                if (r2 == 0) goto L1a
                android.ext.MainService r2 = android.ext.MainService.instance
                long r5 = r2.p0
                int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r2 != 0) goto L1a
                luaj.LuaBoolean r0 = luaj.LuaValue.f1672d
                return r0
            L1a:
                android.ext.Script r2 = r1.f0     // Catch: java.lang.NumberFormatException -> L69
                byte r5 = r2.t3()     // Catch: java.lang.NumberFormatException -> L69
                r2 = 1
                java.lang.String r2 = r0.E(r2)     // Catch: java.lang.NumberFormatException -> L69
                java.lang.String r6 = android.ext.Script.D3(r2)     // Catch: java.lang.NumberFormatException -> L69
                r2 = 2
                r7 = -1
                long r9 = r0.a0(r2, r7)     // Catch: java.lang.NumberFormatException -> L69
                r2 = 3
                r11 = 127(0x7f, float:1.78E-43)
                int r2 = r0.Y(r2, r11)     // Catch: java.lang.NumberFormatException -> L69
                int r2 = android.ext.Script.f3(r2)     // Catch: java.lang.NumberFormatException -> L69
                r11 = 4
                r12 = 536870912(0x20000000, float:1.0842022E-19)
                int r11 = r0.Y(r11, r12)     // Catch: java.lang.NumberFormatException -> L69
                int r11 = android.ext.Script.e3(r11)     // Catch: java.lang.NumberFormatException -> L69
                r12 = 5
                long r12 = r0.a0(r12, r3)     // Catch: java.lang.NumberFormatException -> L69
                r14 = 6
                long r14 = r0.a0(r14, r7)     // Catch: java.lang.NumberFormatException -> L69
                r16 = 0
                r7 = 7
                long r3 = r0.a0(r7, r3)     // Catch: java.lang.NumberFormatException -> L69
                r7 = r9
                r9 = r2
                r10 = r11
                r11 = r12
                r13 = r14
                r15 = r16
                r16 = r3
                boolean r0 = android.ext.m1.k(r5, r6, r7, r9, r10, r11, r13, r15, r16)     // Catch: java.lang.NumberFormatException -> L69
                if (r0 == 0) goto L6b
                luaj.LuaBoolean r0 = luaj.LuaValue.f1672d     // Catch: java.lang.NumberFormatException -> L69
                goto L6c
            L69:
                r0 = move-exception
                goto L6d
            L6b:
                r0 = 0
            L6c:
                return r0
            L6d:
                java.lang.String r0 = android.ext.Script.V3(r0)
                luaj.LuaString r0 = luaj.LuaValue.K2(r0)
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        protected final boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 2
                if (r3 == r0) goto L32
                r0 = 3
                if (r3 == r0) goto L21
                r0 = 4
                if (r3 == r0) goto L10
                r0 = 5
                if (r3 == r0) goto L32
                r0 = 6
                if (r3 == r0) goto L32
                goto L3d
            L10:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L3d
                android.ext.Script r3 = r1.f0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f374d
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L21:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L3d
                android.ext.Script r3 = r1.f0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f372b
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L32:
                boolean r0 = r4.j1()
                if (r0 == 0) goto L3d
                boolean r2 = android.ext.Script.ApiFunction.h3(r2, r4)
                return r2
            L3d:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        final java.lang.String k3() {
                r3 = this;
                boolean r0 = r3 instanceof android.ext.Script.refineAddress
                java.lang.String r1 = "gg.searchAddress(string text [, long mask = -1 [, int type = gg.TYPE_AUTO [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error"
                if (r0 == 0) goto Le
                java.lang.String r0 = "searchAddress"
                java.lang.String r2 = "refineAddress"
                java.lang.String r1 = r1.replace(r0, r2)
            Le:
                return r1
        }
    }

    final class searchFuzzy extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        searchFuzzy(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 6
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r14) {
                r13 = this;
                android.ext.Script r0 = r13.f0
                r0.y3()
                r0 = 0
                r1 = 2
                int r0 = r14.Y(r1, r0)     // Catch: java.lang.NumberFormatException -> L26
                r2 = 127(0x7f, float:1.78E-43)
                r0 = r0 & r2
                r3 = 536870912(0x20000000, float:1.0842022E-19)
                r4 = 3
                if (r0 == 0) goto L28
                int r0 = r14.Y(r1, r2)     // Catch: java.lang.NumberFormatException -> L26
                int r0 = android.ext.Script.f3(r0)     // Catch: java.lang.NumberFormatException -> L26
                int r1 = r14.Y(r4, r3)     // Catch: java.lang.NumberFormatException -> L26
            L1f:
                int r1 = android.ext.Script.e3(r1)     // Catch: java.lang.NumberFormatException -> L26
                r4 = r0
                r5 = r1
                goto L35
            L26:
                r14 = move-exception
                goto L66
            L28:
                int r0 = r14.Y(r4, r2)     // Catch: java.lang.NumberFormatException -> L26
                int r0 = android.ext.Script.f3(r0)     // Catch: java.lang.NumberFormatException -> L26
                int r1 = r14.Y(r1, r3)     // Catch: java.lang.NumberFormatException -> L26
                goto L1f
            L35:
                android.ext.Script r0 = r13.f0     // Catch: java.lang.NumberFormatException -> L26
                byte r2 = r0.t3()     // Catch: java.lang.NumberFormatException -> L26
                java.lang.String r0 = "0"
                r1 = 1
                java.lang.String r0 = r14.Z(r1, r0)     // Catch: java.lang.NumberFormatException -> L26
                java.lang.String r3 = android.ext.Script.D3(r0)     // Catch: java.lang.NumberFormatException -> L26
                r6 = 1
                r0 = 4
                r7 = 0
                long r0 = r14.a0(r0, r7)     // Catch: java.lang.NumberFormatException -> L26
                r9 = 5
                r10 = -1
                long r9 = r14.a0(r9, r10)     // Catch: java.lang.NumberFormatException -> L26
                r11 = 6
                long r11 = r14.a0(r11, r7)     // Catch: java.lang.NumberFormatException -> L26
                r7 = r0
                boolean r14 = android.ext.t0.k(r2, r3, r4, r5, r6, r7, r9, r11)     // Catch: java.lang.NumberFormatException -> L26
                if (r14 == 0) goto L64
                luaj.LuaBoolean r14 = luaj.LuaValue.f1672d     // Catch: java.lang.NumberFormatException -> L26
                goto L65
            L64:
                r14 = 0
            L65:
                return r14
            L66:
                java.lang.String r14 = android.ext.Script.V3(r14)
                luaj.LuaString r14 = luaj.LuaValue.K2(r14)
                return r14
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 2
                if (r3 == r0) goto L29
                r0 = 3
                if (r3 == r0) goto L18
                r0 = 4
                if (r3 == r0) goto Ld
                r0 = 5
                if (r3 == r0) goto Ld
                goto L3a
            Ld:
                boolean r0 = r4.j1()
                if (r0 == 0) goto L3a
                boolean r2 = android.ext.Script.ApiFunction.h3(r2, r4)
                return r2
            L18:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L3a
                android.ext.Script r3 = r1.f0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f372b
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L29:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L3a
                android.ext.Script r3 = r1.f0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f373c
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L3a:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.searchFuzzy([string difference = '0' [, int sign = gg.SIGN_FUZZY_EQUAL [, int type = gg.TYPE_AUTO [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error"
                return r0
        }
    }

    class searchNumber extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        searchNumber(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected final int Y2() {
                r1 = this;
                r0 = 7
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public final luaj.Varargs c3(luaj.Varargs r18) {
                r17 = this;
                r1 = r17
                r0 = r18
                android.ext.Script r2 = r1.f0
                r2.y3()
                boolean r2 = r1 instanceof android.ext.Script.refineNumber
                r3 = 0
                if (r2 == 0) goto L1a
                android.ext.MainService r2 = android.ext.MainService.instance
                long r5 = r2.p0
                int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r2 != 0) goto L1a
                luaj.LuaBoolean r0 = luaj.LuaValue.f1672d
                return r0
            L1a:
                android.ext.Script r2 = r1.f0     // Catch: java.lang.NumberFormatException -> L60
                byte r5 = r2.t3()     // Catch: java.lang.NumberFormatException -> L60
                r2 = 1
                java.lang.String r2 = r0.E(r2)     // Catch: java.lang.NumberFormatException -> L60
                java.lang.String r6 = android.ext.Script.D3(r2)     // Catch: java.lang.NumberFormatException -> L60
                r2 = 2
                r7 = 127(0x7f, float:1.78E-43)
                int r2 = r0.Y(r2, r7)     // Catch: java.lang.NumberFormatException -> L60
                int r7 = android.ext.Script.f3(r2)     // Catch: java.lang.NumberFormatException -> L60
                r2 = 3
                r8 = 0
                boolean r8 = r0.V(r2, r8)     // Catch: java.lang.NumberFormatException -> L60
                r2 = 4
                r9 = 536870912(0x20000000, float:1.0842022E-19)
                int r2 = r0.Y(r2, r9)     // Catch: java.lang.NumberFormatException -> L60
                int r9 = android.ext.Script.e3(r2)     // Catch: java.lang.NumberFormatException -> L60
                r2 = 5
                long r10 = r0.a0(r2, r3)     // Catch: java.lang.NumberFormatException -> L60
                r2 = 6
                r12 = -1
                long r12 = r0.a0(r2, r12)     // Catch: java.lang.NumberFormatException -> L60
                r14 = 0
                r2 = 7
                long r15 = r0.a0(r2, r3)     // Catch: java.lang.NumberFormatException -> L60
                boolean r0 = android.ext.i2.n(r5, r6, r7, r8, r9, r10, r12, r14, r15)     // Catch: java.lang.NumberFormatException -> L60
                if (r0 == 0) goto L62
                luaj.LuaBoolean r0 = luaj.LuaValue.f1672d     // Catch: java.lang.NumberFormatException -> L60
                goto L63
            L60:
                r0 = move-exception
                goto L64
            L62:
                r0 = 0
            L63:
                return r0
            L64:
                java.lang.String r0 = android.ext.Script.V3(r0)
                luaj.LuaString r0 = luaj.LuaValue.K2(r0)
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        protected final boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 2
                if (r3 == r0) goto L29
                r0 = 4
                if (r3 == r0) goto L18
                r0 = 5
                if (r3 == r0) goto Ld
                r0 = 6
                if (r3 == r0) goto Ld
                goto L3a
            Ld:
                boolean r0 = r4.j1()
                if (r0 == 0) goto L3a
                boolean r2 = android.ext.Script.ApiFunction.h3(r2, r4)
                return r2
            L18:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L3a
                android.ext.Script r3 = r1.f0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f374d
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L29:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L3a
                android.ext.Script r3 = r1.f0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f372b
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L3a:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        final java.lang.String k3() {
                r3 = this;
                boolean r0 = r3 instanceof android.ext.Script.refineNumber
                java.lang.String r1 = "gg.searchNumber(string text [, int type = gg.TYPE_AUTO [, bool encrypted = false [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error"
                if (r0 == 0) goto Le
                java.lang.String r0 = "searchNumber"
                java.lang.String r2 = "refineNumber"
                java.lang.String r1 = r1.replace(r0, r2)
            Le:
                return r1
        }
    }

    final class searchPointer extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        searchPointer(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 4
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r12) {
                r11 = this;
                android.ext.Script r0 = r11.f0
                r0.y3()
                r0 = 1
                int r0 = r12.D(r0)     // Catch: java.lang.NumberFormatException -> L30
                short r2 = (short) r0     // Catch: java.lang.NumberFormatException -> L30
                android.ext.Script r0 = r11.f0     // Catch: java.lang.NumberFormatException -> L30
                byte r1 = r0.t3()     // Catch: java.lang.NumberFormatException -> L30
                r0 = 2
                r3 = 0
                long r5 = r12.a0(r0, r3)     // Catch: java.lang.NumberFormatException -> L30
                r0 = 3
                r7 = -1
                long r7 = r12.a0(r0, r7)     // Catch: java.lang.NumberFormatException -> L30
                r0 = 4
                long r9 = r12.a0(r0, r3)     // Catch: java.lang.NumberFormatException -> L30
                r3 = r5
                r5 = r7
                r7 = r9
                boolean r12 = android.ext.i2.p(r1, r2, r3, r5, r7)     // Catch: java.lang.NumberFormatException -> L30
                if (r12 == 0) goto L32
                luaj.LuaBoolean r12 = luaj.LuaValue.f1672d     // Catch: java.lang.NumberFormatException -> L30
                goto L33
            L30:
                r12 = move-exception
                goto L34
            L32:
                r12 = 0
            L33:
                return r12
            L34:
                java.lang.String r12 = android.ext.Script.V3(r12)
                luaj.LuaString r12 = luaj.LuaValue.K2(r12)
                return r12
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.searchPointer(int maxOffset [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]) -> true || string with error"
                return r0
        }
    }

    final class setRanges extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        setRanges(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r2) {
                r1 = this;
                r0 = 1
                int r2 = r2.D(r0)
                r0 = 2131034189(0x7f05004d, float:1.7678889E38)
                android.ext.Config$p r0 = android.ext.Config.b(r0)
                r0.f42d = r2
                android.ext.Config.k()
                luaj.LuaValue r2 = luaj.LuaValue.f1671c
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 1
                if (r3 == r0) goto L4
                goto L15
            L4:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L15
                android.ext.Script r3 = r1.e0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f371a
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L15:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.setRanges(int ranges) -> nil"
                return r0
        }
    }

    final class setSpeed extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        setSpeed(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r8) {
                r7 = this;
                r0 = 1
                double r0 = r8.B(r0)
                r2 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
                r4 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
                int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r8 < 0) goto L25
                int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r8 <= 0) goto L18
                goto L25
            L18:
                android.ext.MainService r8 = android.ext.MainService.instance
                android.ext.Script r2 = r7.f0
                byte r2 = r2.t3()
                r8.S0(r2, r0)
                r8 = 0
                return r8
            L25:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r6 = "Speed outside range: "
                r8.append(r6)
                r8.append(r0)
                java.lang.String r0 = " ("
                r8.append(r0)
                r8.append(r4)
                java.lang.String r0 = "; "
                r8.append(r0)
                r8.append(r2)
                r0 = 41
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                luaj.LuaString r8 = luaj.LuaValue.K2(r8)
                return r8
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.setSpeed(double speed) -> true || string with error"
                return r0
        }
    }

    final class setValues extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;


        setValues(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r10) {
                r9 = this;
                r0 = 1
                luaj.LuaTable r10 = r10.I(r0)
                android.ext.MainService r1 = android.ext.MainService.instance
                android.ext.z1$d r2 = r1.v0
                r3 = 0
                if (r2 == 0) goto Lf
                boolean r2 = r2.n
                goto L10
            Lf:
                r2 = 0
            L10:
                android.ext.f0 r4 = r1.i
                luaj.LuaString[] r5 = android.ext.Script.t0
                r5 = r5[r0]
                luaj.LuaTable$i r10 = r10.s3()
            L1a:
                boolean r6 = r10.c()
                if (r6 == 0) goto L56
                luaj.LuaValue r6 = r10.d()
                luaj.LuaTable r6 = r6.H0()
                r7 = 0
                android.ext.c r7 = android.ext.Script.T3(r7, r6, r0, r2)     // Catch: java.lang.NumberFormatException -> L4c
                int r8 = r7.f674c
                r8 = r8 & 127(0x7f, float:1.78E-43)
                r7.f674c = r8
                if (r8 != 0) goto L36
                goto L1a
            L36:
                java.lang.String r6 = android.ext.Script.h3(r6, r5)
                java.lang.String r6 = android.ext.Script.D3(r6)
                android.ext.i2$c r6 = android.ext.i2.x(r6, r3)
                if (r6 == 0) goto L47
                int r6 = r6.f1018b
                goto L48
            L47:
                r6 = 0
            L48:
                r4.a(r7, r6)
                goto L1a
            L4c:
                r0 = move-exception
                luaj.LuaValue r10 = r10.b()
                luaj.d r10 = android.ext.Script.m3(r10, r6, r0)
                throw r10
            L56:
                android.ext.f0 r10 = r1.i
                android.ext.Script r0 = r9.e0
                byte r0 = r0.t3()
                r10.C(r0)
                java.lang.Object r10 = new java.lang.Object
                r10.<init>()
                monitor-enter(r10)
                android.ext.Script$setValues$1 r0 = new android.ext.Script$setValues$1     // Catch: java.lang.Throwable -> L76
                r0.<init>(r9, r10)     // Catch: java.lang.Throwable -> L76
                android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L76
                android.ext.Script.W3(r10)     // Catch: java.lang.Throwable -> L76
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L76
                luaj.LuaBoolean r10 = luaj.LuaValue.f1672d
                return r10
            L76:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L76
                throw r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.setValues(table values) -> true || string with error"
                return r0
        }
    }

    final class setVisible extends android.ext.Script.ApiFunction {
        private int e0;
        private long f0;
        final /* synthetic */ android.ext.Script g0;

        setVisible(android.ext.Script r3) {
                r2 = this;
                r2.g0 = r3
                r2.<init>()
                r3 = 0
                r2.e0 = r3
                r0 = 0
                r2.f0 = r0
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r8) {
                r7 = this;
                android.ext.MainService r0 = android.ext.MainService.instance
                r1 = 1
                boolean r8 = r8.z(r1)
                r2 = 0
                if (r8 == 0) goto L12
                android.ext.i1 r8 = r0.n
                if (r8 != 0) goto L46
                r0.c0()
                goto L23
            L12:
                android.ext.i1 r8 = r0.n
                if (r8 == 0) goto L1b
                r0.u(r2)
                r8 = 1
                goto L1c
            L1b:
                r8 = 0
            L1c:
                android.ext.ShowApp r0 = r0.h0
                r0.g()
                if (r8 == 0) goto L46
            L23:
                long r3 = java.lang.System.nanoTime()
                r5 = 60000000000(0xdf8475800, double:2.96439387505E-313)
                long r3 = r3 / r5
                long r5 = r7.f0
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 == 0) goto L37
                r7.f0 = r3
                r7.e0 = r2
            L37:
                int r8 = r7.e0
                int r8 = r8 + r1
                r7.e0 = r8
                r0 = 30
                if (r8 <= r0) goto L46
                android.ext.Script r8 = r7.g0
                r0 = 2
                r8.x3(r0)
            L46:
                luaj.LuaValue r8 = luaj.LuaValue.f1671c
                return r8
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.setVisible(bool visible) -> nil"
                return r0
        }
    }

    final class showUiButton extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        showUiButton(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r2) {
                r1 = this;
                android.ext.MainService r2 = android.ext.MainService.instance
                r0 = 1
                r2.R0(r0)
                luaj.LuaValue r2 = luaj.LuaValue.f1671c
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.showUiButton() -> nil"
                return r0
        }
    }

    final class skipRestoreState extends android.ext.Script.ApiFunction {
        final /* synthetic */ android.ext.Script e0;

        skipRestoreState(android.ext.Script r1) {
                r0 = this;
                r0.e0 = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r2) {
                r1 = this;
                android.ext.Script r2 = r1.e0
                r0 = 0
                r2.m0 = r0
                luaj.LuaValue r2 = luaj.LuaValue.f1671c
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.skipRestoreState() -> nil"
                return r0
        }
    }

    static final class sleep extends android.ext.Script.ApiFunction {
        sleep() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r4) {
                r3 = this;
                r0 = 1
                int r4 = r4.D(r0)
                if (r4 < 0) goto L1a
                long r0 = (long) r4
                java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Le
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                return r4
            Le:
                r4 = move-exception
                java.lang.String r0 = "Interrupted sleep"
                android.ext.e1.s(r0, r4)
                luaj.d r0 = new luaj.d
                r0.<init>(r4)
                throw r0
            L1a:
                luaj.d r0 = new luaj.d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "milliseconds < 0: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.sleep(int milliseconds) -> nil"
                return r0
        }
    }

    final class startFuzzy extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        startFuzzy(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 4
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r12) {
                r11 = this;
                android.ext.Script r0 = r11.f0
                r0.y3()
                android.ext.Script r0 = r11.f0     // Catch: java.lang.NumberFormatException -> L35
                byte r1 = r0.t3()     // Catch: java.lang.NumberFormatException -> L35
                r0 = 1
                r2 = 127(0x7f, float:1.78E-43)
                int r0 = r12.Y(r0, r2)     // Catch: java.lang.NumberFormatException -> L35
                int r2 = android.ext.Script.f3(r0)     // Catch: java.lang.NumberFormatException -> L35
                r0 = 2
                r3 = 0
                long r5 = r12.a0(r0, r3)     // Catch: java.lang.NumberFormatException -> L35
                r0 = 3
                r7 = -1
                long r7 = r12.a0(r0, r7)     // Catch: java.lang.NumberFormatException -> L35
                r0 = 4
                long r9 = r12.a0(r0, r3)     // Catch: java.lang.NumberFormatException -> L35
                r3 = r5
                r5 = r7
                r7 = r9
                boolean r12 = android.ext.t0.m(r1, r2, r3, r5, r7)     // Catch: java.lang.NumberFormatException -> L35
                if (r12 == 0) goto L37
                luaj.LuaBoolean r12 = luaj.LuaValue.f1672d     // Catch: java.lang.NumberFormatException -> L35
                goto L38
            L35:
                r12 = move-exception
                goto L39
            L37:
                r12 = 0
            L38:
                return r12
            L39:
                java.lang.String r12 = android.ext.Script.V3(r12)
                luaj.LuaString r12 = luaj.LuaValue.K2(r12)
                return r12
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer r2, int r3, luaj.LuaValue r4) {
                r1 = this;
                r0 = 1
                if (r3 == r0) goto L15
                r0 = 2
                if (r3 == r0) goto La
                r0 = 3
                if (r3 == r0) goto La
                goto L26
            La:
                boolean r0 = r4.j1()
                if (r0 == 0) goto L26
                boolean r2 = android.ext.Script.ApiFunction.h3(r2, r4)
                return r2
            L15:
                boolean r0 = r4.h1()
                if (r0 == 0) goto L26
                android.ext.Script r3 = r1.f0
                android.ext.Script$Consts r3 = r3.g0
                android.ext.Script$Const[] r3 = r3.f372b
                boolean r2 = android.ext.Script.ApiFunction.g3(r2, r3, r4)
                return r2
            L26:
                boolean r2 = super.d3(r2, r3, r4)
                return r2
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.startFuzzy([int type = gg.TYPE_AUTO [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]) -> true || string with error"
                return r0
        }
    }

    final class timeJump extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        timeJump(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r4) {
                r3 = this;
                r0 = 1
                java.lang.String r4 = r4.E(r0)     // Catch: java.lang.NumberFormatException -> L1c
                java.lang.String r4 = android.ext.Script.D3(r4)     // Catch: java.lang.NumberFormatException -> L1c
                long r0 = android.ext.o2.i(r4)     // Catch: java.lang.NumberFormatException -> L1c
                android.ext.MainService r4 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L1c
                android.ext.f0 r4 = r4.i     // Catch: java.lang.NumberFormatException -> L1c
                android.ext.Script r2 = r3.f0     // Catch: java.lang.NumberFormatException -> L1c
                byte r2 = r2.t3()     // Catch: java.lang.NumberFormatException -> L1c
                r4.d(r2, r0)     // Catch: java.lang.NumberFormatException -> L1c
                r4 = 0
                return r4
            L1c:
                r4 = move-exception
                java.lang.String r4 = android.ext.Script.V3(r4)
                luaj.LuaString r4 = luaj.LuaValue.K2(r4)
                return r4
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.timeJump(string time) -> true || string with error"
                return r0
        }
    }

    static final class toast extends android.ext.Script.ApiFunction {


        toast() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 2131296928(0x7f0902a0, float:1.8211787E38)
                java.lang.String r1 = android.ext.Tools.N1(r1)
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r1 = 1
                java.lang.String r1 = r4.E(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2
                r2 = 0
                boolean r4 = r4.V(r1, r2)
                android.ext.Script$toast$1 r1 = new android.ext.Script$toast$1
                r1.<init>(r3, r0, r4)
                android.ext.n2.i(r1)
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                return r4
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.toast(string text [, bool fast = false]) -> nil"
                return r0
        }
    }

    final class unrandomizer extends android.ext.Script.BusyApiFunction {
        final /* synthetic */ android.ext.Script f0;

        unrandomizer(android.ext.Script r1) {
                r0 = this;
                r0.f0 = r1
                r0.<init>(r1)
                return
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
                r1 = this;
                r0 = 4
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs r18) {
                r17 = this;
                r0 = r18
                r1 = 1
                boolean r2 = r0.Q(r1)
                r3 = 2
                if (r2 == 0) goto L13
                boolean r2 = r0.Q(r3)
                if (r2 != 0) goto L11
                goto L13
            L11:
                r2 = 0
                goto L14
            L13:
                r2 = 2
            L14:
                boolean r4 = r0.Q(r3)
                r5 = 3
                if (r4 == 0) goto L24
                boolean r4 = r0.Q(r5)
                if (r4 != 0) goto L22
                goto L24
            L22:
                r8 = r2
                goto L27
            L24:
                r2 = r2 | 4
                goto L22
            L27:
                android.ext.MainService r2 = android.ext.MainService.instance
                android.ext.f0 r6 = r2.i
                r2 = r17
                android.ext.Script r4 = r2.f0
                byte r7 = r4.t3()
                r9 = 0
                long r11 = r0.a0(r1, r9)
                long r3 = r0.a0(r3, r9)
                r9 = 0
                double r13 = r0.W(r5, r9)
                r1 = 4
                double r15 = r0.W(r1, r9)
                r9 = r11
                r11 = r3
                r6.U0(r7, r8, r9, r11, r13, r15)
                r0 = 0
                return r0
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
                r1 = this;
                java.lang.String r0 = "gg.unrandomizer([long qword = nil [, long qincr = nil [, double double_ = nil [, double dincr = nil]]]]) -> true || string with error"
                return r0
        }
    }

    final class wrap extends luaj.lib.VarArgFunction {
        final luaj.LuaValue T;
        final java.lang.String U;
        final int V;
        final /* synthetic */ android.ext.Script W;

        wrap(android.ext.Script r1, java.lang.String r2, luaj.LuaValue r3, int r4) {
                r0 = this;
                r0.W = r1
                r0.<init>()
                r0.T = r3
                r0.U = r2
                r0.V = r4
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
        public java.lang.String g0() {
                r1 = this;
                luaj.LuaValue r0 = r1.T
                java.lang.String r0 = r0.g0()
                return r0
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r10) {
                r9 = this;
                android.ext.Script$DebugLog r0 = android.ext.Script.w0
                r1 = 0
                if (r0 != 0) goto L7
                r2 = r1
                goto L9
            L7:
                java.io.Writer r2 = r0.f378a
            L9:
                if (r2 == 0) goto L6a
                long r3 = java.lang.System.nanoTime()
                java.lang.String r5 = r9.U     // Catch: java.lang.Throwable -> L30
                r2.write(r5)     // Catch: java.lang.Throwable -> L30
                java.lang.String r5 = "("
                r2.write(r5)     // Catch: java.lang.Throwable -> L30
                int r5 = r10.U()     // Catch: java.lang.Throwable -> L30
                int r6 = r9.V     // Catch: java.lang.Throwable -> L30
                if (r6 < 0) goto L24
                if (r5 <= r6) goto L24
                r5 = r6
            L24:
                r6 = 1
                r7 = 1
            L26:
                if (r7 > r5) goto L3c
                if (r7 == r6) goto L32
                java.lang.String r8 = ", "
                r2.write(r8)     // Catch: java.lang.Throwable -> L30
                goto L32
            L30:
                r1 = move-exception
                goto L42
            L32:
                luaj.LuaValue r8 = r10.v(r7)     // Catch: java.lang.Throwable -> L30
                android.ext.Script.ApiFunction.e3(r1, r2, r7, r8)     // Catch: java.lang.Throwable -> L30
                int r7 = r7 + 1
                goto L26
            L3c:
                java.lang.String r1 = ")\n"
                r2.write(r1)     // Catch: java.lang.Throwable -> L30
                goto L58
            L42:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "Failed write log for "
                r2.append(r5)
                java.lang.String r5 = r9.U
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                android.ext.e1.s(r2, r1)
            L58:
                luaj.Globals r0 = r0.f379b
                int r1 = r0.b0
                long r1 = (long) r1
                long r5 = java.lang.System.nanoTime()
                long r5 = r5 - r3
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r5 / r3
                long r1 = r1 + r5
                int r2 = (int) r1
                r0.b0 = r2
            L6a:
                luaj.LuaValue r0 = r9.T
                luaj.Varargs r10 = r0.invoke(r10)
                return r10
        }
    }

    static {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            android.ext.Script.o0 = r0
            android.ext.Script.p0 = r1
            r0 = 0
            android.ext.Script.q0 = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            android.ext.Script.r0 = r2
            r2 = 0
            android.ext.Script.s0 = r2
            r2 = 8
            luaj.LuaString[] r3 = new luaj.LuaString[r2]
            java.lang.String r4 = "address"
            luaj.LuaString r4 = luaj.LuaString.K2(r4)
            r3[r0] = r4
            java.lang.String r4 = "value"
            luaj.LuaString r4 = luaj.LuaString.K2(r4)
            r5 = 1
            r3[r5] = r4
            java.lang.String r4 = "flags"
            luaj.LuaString r4 = luaj.LuaString.K2(r4)
            r5 = 2
            r3[r5] = r4
            java.lang.String r4 = "name"
            luaj.LuaString r4 = luaj.LuaString.K2(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "freeze"
            luaj.LuaString r4 = luaj.LuaString.K2(r4)
            r6 = 4
            r3[r6] = r4
            java.lang.String r4 = "freezeType"
            luaj.LuaString r4 = luaj.LuaString.K2(r4)
            r6 = 5
            r3[r6] = r4
            java.lang.String r4 = "freezeFrom"
            luaj.LuaString r4 = luaj.LuaString.K2(r4)
            r6 = 6
            r3[r6] = r4
            java.lang.String r4 = "freezeTo"
            luaj.LuaString r4 = luaj.LuaString.K2(r4)
            r6 = 7
            r3[r6] = r4
            android.ext.Script.t0 = r3
            int[] r3 = new int[r5]
            android.ext.Script.u0 = r3
            int[] r2 = new int[r2]
            android.ext.Script.v0 = r2
            r2 = 0
        L6e:
            int[] r3 = android.ext.Script.u0
            int r4 = r3.length
            if (r2 >= r4) goto L80
            luaj.LuaString[] r4 = android.ext.Script.t0
            r4 = r4[r2]
            int r4 = luaj.LuaTable.j3(r4, r5)
            r3[r2] = r4
            int r2 = r2 + 1
            goto L6e
        L80:
            int[] r2 = android.ext.Script.v0
            int r3 = r2.length
            if (r0 >= r3) goto L92
            luaj.LuaString[] r3 = android.ext.Script.t0
            r3 = r3[r0]
            int r3 = luaj.LuaTable.j3(r3, r6)
            r2[r0] = r3
            int r0 = r0 + 1
            goto L80
        L92:
            android.ext.Script.w0 = r1
            return
    }

    public Script(java.io.File r4, int r5, java.lang.String r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a0 = r0
            r1 = -1
            r3.b0 = r1
            r1 = 1
            r3.c0 = r1
            r3.d0 = r0
            r3.e0 = r0
            r3.f0 = r0
            luaj.Globals r1 = new luaj.Globals
            r1.<init>()
            r3.T = r1
            android.ext.Script$ScriptThread r1 = new android.ext.Script$ScriptThread
            r1.<init>(r3)
            r3.V = r1
            android.ext.Script$Logger r1 = new android.ext.Script$Logger
            r1.<init>()
            r3.W = r1
            int r1 = android.ext.Script.n0
            int r2 = r1 + 1
            android.ext.Script.n0 = r2
            int r1 = r1 % 5
            byte r1 = (byte) r1
            r3.Z = r1
            r1 = 0
            r3.g0 = r1
            r3.h0 = r1
            r3.i0 = r1
            r3.j0 = r1
            r3.k0 = r1
            r3.l0 = r1
            r3.m0 = r1
            luaj.a.u = r0
            r3.U = r4
            r3.X = r5
            r3.Y = r6
            r3.u3()
            return
    }

    public Script(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a0 = r0
            r1 = -1
            r2.b0 = r1
            r1 = 1
            r2.c0 = r1
            r2.d0 = r0
            r2.e0 = r0
            r2.f0 = r0
            luaj.Globals r0 = new luaj.Globals
            r0.<init>()
            r2.T = r0
            android.ext.Script$ScriptThread r0 = new android.ext.Script$ScriptThread
            r0.<init>(r2)
            r2.V = r0
            android.ext.Script$Logger r0 = new android.ext.Script$Logger
            r0.<init>()
            r2.W = r0
            int r0 = android.ext.Script.n0
            int r1 = r0 + 1
            android.ext.Script.n0 = r1
            int r0 = r0 % 5
            byte r0 = (byte) r0
            r2.Z = r0
            r0 = 0
            r2.g0 = r0
            r2.h0 = r0
            r2.i0 = r0
            r2.j0 = r0
            r2.k0 = r0
            r2.l0 = r0
            r2.m0 = r0
            r2.U = r3
            r2.X = r4
            r2.Y = r5
            r2.u3()
            return
    }

    static boolean A3(java.lang.String r2, java.lang.String r3) {
            java.lang.String r2 = luaj.lib.d.d(r2)
            java.lang.String r3 = luaj.lib.d.d(r3)
            boolean r0 = r2.startsWith(r3)
            if (r0 == 0) goto L26
            int r0 = r2.length()
            int r1 = r3.length()
            if (r0 == r1) goto L24
            int r3 = r3.length()
            char r2 = r2.charAt(r3)
            r3 = 47
            if (r2 != r3) goto L26
        L24:
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            return r2
    }

    static void B3(luaj.LuaTable r12, java.util.ArrayList r13) {
            java.lang.String r0 = "TYPE_AUTO"
            r1 = 127(0x7f, float:1.78E-43)
            P3(r13, r12, r0, r1)
            java.lang.String r0 = "TYPE_BYTE"
            r1 = 1
            P3(r13, r12, r0, r1)
            java.lang.String r0 = "TYPE_WORD"
            r2 = 2
            P3(r13, r12, r0, r2)
            java.lang.String r0 = "TYPE_DWORD"
            r3 = 4
            P3(r13, r12, r0, r3)
            java.lang.String r0 = "TYPE_XOR"
            r4 = 8
            P3(r13, r12, r0, r4)
            java.lang.String r0 = "TYPE_FLOAT"
            r5 = 16
            P3(r13, r12, r0, r5)
            java.lang.String r0 = "TYPE_QWORD"
            r6 = 32
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "TYPE_DOUBLE"
            r7 = 64
            P3(r13, r12, r0, r7)
            java.lang.String r0 = "SIGN_EQUAL"
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            P3(r13, r12, r0, r8)
            java.lang.String r0 = "SIGN_NOT_EQUAL"
            r9 = 268435456(0x10000000, float:2.524355E-29)
            P3(r13, r12, r0, r9)
            java.lang.String r0 = "SIGN_LESS_OR_EQUAL"
            r10 = 134217728(0x8000000, float:3.85186E-34)
            P3(r13, r12, r0, r10)
            java.lang.String r0 = "SIGN_GREATER_OR_EQUAL"
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            P3(r13, r12, r0, r11)
            java.lang.String r0 = "SIGN_FUZZY_EQUAL"
            P3(r13, r12, r0, r8)
            java.lang.String r0 = "SIGN_FUZZY_NOT_EQUAL"
            P3(r13, r12, r0, r9)
            java.lang.String r0 = "SIGN_FUZZY_LESS"
            P3(r13, r12, r0, r10)
            java.lang.String r0 = "SIGN_FUZZY_GREATER"
            P3(r13, r12, r0, r11)
            java.lang.String r0 = "REGION_JAVA_HEAP"
            P3(r13, r12, r0, r2)
            java.lang.String r0 = "REGION_C_HEAP"
            P3(r13, r12, r0, r1)
            java.lang.String r0 = "REGION_C_ALLOC"
            P3(r13, r12, r0, r3)
            java.lang.String r0 = "REGION_C_DATA"
            P3(r13, r12, r0, r4)
            java.lang.String r0 = "REGION_C_BSS"
            P3(r13, r12, r0, r5)
            java.lang.String r0 = "REGION_PPSSPP"
            r8 = 262144(0x40000, float:3.67342E-40)
            P3(r13, r12, r0, r8)
            java.lang.String r0 = "REGION_ANONYMOUS"
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "REGION_JAVA"
            r6 = 65536(0x10000, float:9.1835E-41)
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "REGION_STACK"
            P3(r13, r12, r0, r7)
            java.lang.String r0 = "REGION_ASHMEM"
            r6 = 524288(0x80000, float:7.34684E-40)
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "REGION_VIDEO"
            r6 = 1048576(0x100000, float:1.469368E-39)
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "REGION_OTHER"
            r6 = -2080896(0xffffffffffe03f80, float:NaN)
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "REGION_BAD"
            r6 = 131072(0x20000, float:1.83671E-40)
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "REGION_CODE_APP"
            r6 = 16384(0x4000, float:2.2959E-41)
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "REGION_CODE_SYS"
            r6 = 32768(0x8000, float:4.5918E-41)
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "LOAD_VALUES_FREEZE"
            r6 = 3
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "LOAD_VALUES"
            P3(r13, r12, r0, r2)
            java.lang.String r0 = "LOAD_APPEND"
            P3(r13, r12, r0, r4)
            java.lang.String r0 = "SAVE_AS_TEXT"
            P3(r13, r12, r0, r1)
            java.lang.String r0 = "FREEZE_NORMAL"
            r7 = 0
            r12.a2(r0, r7)
            java.lang.String r0 = "FREEZE_MAY_INCREASE"
            r12.a2(r0, r1)
            java.lang.String r0 = "FREEZE_MAY_DECREASE"
            r12.a2(r0, r2)
            java.lang.String r0 = "FREEZE_IN_RANGE"
            r12.a2(r0, r6)
            java.lang.String r0 = "PROT_NONE"
            r12.a2(r0, r7)
            java.lang.String r0 = "PROT_READ"
            P3(r13, r12, r0, r2)
            java.lang.String r0 = "PROT_WRITE"
            P3(r13, r12, r0, r1)
            java.lang.String r0 = "PROT_EXEC"
            P3(r13, r12, r0, r3)
            java.lang.String r0 = "POINTER_NO"
            P3(r13, r12, r0, r3)
            java.lang.String r0 = "POINTER_READ_ONLY"
            P3(r13, r12, r0, r4)
            java.lang.String r0 = "POINTER_WRITABLE"
            P3(r13, r12, r0, r5)
            java.lang.String r0 = "POINTER_EXECUTABLE"
            P3(r13, r12, r0, r2)
            java.lang.String r0 = "POINTER_EXECUTABLE_WRITABLE"
            P3(r13, r12, r0, r1)
            java.lang.String r0 = "DUMP_SKIP_SYSTEM_LIBS"
            P3(r13, r12, r0, r1)
            java.lang.String r0 = "TAB_SETTINGS"
            P3(r13, r12, r0, r7)
            java.lang.String r0 = "TAB_SEARCH"
            P3(r13, r12, r0, r1)
            java.lang.String r0 = "TAB_SAVED_LIST"
            P3(r13, r12, r0, r2)
            java.lang.String r0 = "TAB_MEMORY_EDITOR"
            P3(r13, r12, r0, r6)
            java.lang.String r0 = "ASM_ARM"
            P3(r13, r12, r0, r3)
            java.lang.String r0 = "ASM_THUMB"
            r1 = 5
            P3(r13, r12, r0, r1)
            java.lang.String r0 = "ASM_ARM64"
            r1 = 6
            P3(r13, r12, r0, r1)
            return
    }

    public static void C3(android.ext.w r8) {
            r8.j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L8:
            int r6 = r8.f()     // Catch: java.io.IOException -> L21
            if (r6 != 0) goto Lf
            goto L2f
        Lf:
            long r2 = r8.g()     // Catch: java.io.IOException -> L21
            long r4 = r8.h()     // Catch: java.io.IOException -> L21
            android.ext.c r7 = new android.ext.c     // Catch: java.io.IOException -> L21
            r1 = r7
            r1.<init>(r2, r4, r6)     // Catch: java.io.IOException -> L21
            r0.add(r7)     // Catch: java.io.IOException -> L21
            goto L8
        L21:
            r8 = move-exception
            java.lang.String r1 = "???"
            android.ext.e1.l(r1, r8)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r2 = 0
            android.ext.n0.h(r1, r8, r2)
        L2f:
            android.ext.Script.p0 = r0
            int r8 = android.ext.Script.q0
            int r8 = r8 + 100
            android.ext.Script.q0 = r8
            return
    }

    static java.lang.String D3(java.lang.String r1) {
            boolean r0 = android.ext.t1.m(r1)
            if (r0 != 0) goto L11
            int r0 = android.ext.t1.C(r1)
            if (r0 == 0) goto Ld
            goto L11
        Ld:
            java.lang.String r1 = android.ext.t1.f(r1)
        L11:
            return r1
    }

    static java.lang.String E3(java.lang.String r0) {
            java.lang.String r0 = android.ext.t1.e(r0)
            return r0
    }

    public static java.lang.String F3(java.lang.String r3) {
            luaj.Globals r0 = new luaj.Globals
            r0.<init>()
            r1 = 0
            r0.X = r1
            g.h.M(r0)
            luaj.lib.BaseLib r1 = new luaj.lib.BaseLib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.Bit32Lib r1 = new luaj.lib.Bit32Lib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.TableLib r1 = new luaj.lib.TableLib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.StringLib r1 = new luaj.lib.StringLib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.Utf8Lib r1 = new luaj.lib.Utf8Lib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.MathLib r1 = new luaj.lib.MathLib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.OsLib r1 = new luaj.lib.OsLib
            r1.<init>()
            r0.t1(r1)
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            byte[] r2 = r3.getBytes()
            r1.<init>(r2)
            java.lang.String r2 = "t"
            luaj.LuaValue r3 = r0.O3(r1, r3, r2, r0)
            luaj.LuaValue r3 = r3.call()
            java.lang.String r3 = r3.g0()
            return r3
    }

    static boolean G3(luaj.LuaTable r0, luaj.LuaValue r1, boolean r2) {
            luaj.LuaValue r0 = r0.U0(r1)     // Catch: luaj.d -> L9
            boolean r0 = r0.E1(r2)     // Catch: luaj.d -> L9
            return r0
        L9:
            r0 = move-exception
            luaj.d r0 = b3(r1, r0)
            throw r0
    }

    static int H3(luaj.LuaTable r0, luaj.LuaValue r1, int r2) {
            luaj.LuaValue r0 = r0.U0(r1)     // Catch: luaj.d -> L9
            int r0 = r0.H1(r2)     // Catch: luaj.d -> L9
            return r0
        L9:
            r0 = move-exception
            luaj.d r0 = b3(r1, r0)
            throw r0
    }

    static java.lang.String I3(luaj.LuaTable r0, luaj.LuaValue r1, java.lang.String r2) {
            luaj.LuaValue r0 = r0.U0(r1)     // Catch: luaj.d -> L9
            java.lang.String r0 = r0.I1(r2)     // Catch: luaj.d -> L9
            return r0
        L9:
            r0 = move-exception
            luaj.d r0 = b3(r1, r0)
            throw r0
    }

    static byte J3(byte r0) {
            j3(r0)
            r0 = 0
            return r0
    }

    public static void K3(luaj.Globals r4) {
            r0 = 0
            luaj.LuaNil.P = r0
            luaj.LuaNumber.P = r0
            luaj.LuaBoolean.Q = r0
            if (r4 != 0) goto Lb
            r4 = r0
            goto L11
        Lb:
            java.lang.String r1 = "string"
            luaj.LuaValue r4 = r4.T0(r1)
        L11:
            if (r4 == 0) goto L2a
            boolean r1 = r4.l1()
            if (r1 == 0) goto L1a
            goto L2a
        L1a:
            r1 = 2
            luaj.LuaValue[] r1 = new luaj.LuaValue[r1]
            r2 = 0
            luaj.LuaString r3 = luaj.LuaValue.l
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            luaj.LuaTable r4 = luaj.LuaValue.u2(r1)
            goto L2b
        L2a:
            r4 = r0
        L2b:
            luaj.LuaString.U = r4
            luaj.LuaFunction.P = r0
            luaj.LuaThread.T = r0
            return
    }

    static int O3(byte r0) {
            int r0 = r0 + (-20)
            byte r0 = (byte) r0
            int r0 = r0 / 20
            return r0
    }

    private static void P3(java.util.ArrayList r2, luaj.LuaTable r3, java.lang.String r4, int r5) {
            r3.a2(r4, r5)
            if (r2 == 0) goto L1e
            android.ext.Script$Const r3 = new android.ext.Script$Const
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "gg."
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4, r5)
            r2.add(r3)
        L1e:
            return
    }

    private static void Q3(int r1, luaj.LuaTable r2, luaj.LuaString r3, long r4, long r6, int r8) {
            r0 = 8
            if (r8 != r0) goto L5
            long r6 = r6 ^ r4
        L5:
            r4 = 16
            if (r8 != r4) goto L12
            int r4 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r2.H3(r1, r3, r4)
            goto L2a
        L12:
            r4 = 64
            if (r8 != r4) goto L1e
            double r4 = java.lang.Double.longBitsToDouble(r6)
            r2.G3(r1, r3, r4)
            goto L2a
        L1e:
            int r4 = android.ext.c.y(r8)
            r5 = 0
            long r4 = android.ext.i0.b(r6, r4, r5)
            r2.J3(r1, r3, r4)
        L2a:
            return
    }

    static java.util.ArrayList S3(byte r1) {
            java.util.Map r0 = android.ext.Script.r0
            monitor-enter(r0)
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    static android.ext.c T3(android.ext.c r11, luaj.LuaTable r12, byte r13, boolean r14) {
            luaj.LuaString[] r0 = android.ext.Script.t0
            r1 = 0
            r2 = r0[r1]
            long r2 = i3(r12, r2)
            if (r14 != 0) goto L11
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
        L11:
            r14 = 2
            r4 = r0[r14]
            int r4 = g3(r12, r4)
            int r10 = f3(r4)
            if (r13 == r14) goto L32
            r14 = 1
            r6 = r0[r14]
            luaj.LuaValue r7 = r12.U0(r6)
            if (r13 != 0) goto L29
            r9 = 1
            goto L2a
        L29:
            r9 = 0
        L2a:
            r4 = r2
            r8 = r10
            long r12 = q3(r4, r6, r7, r8, r9)
        L30:
            r7 = r12
            goto L35
        L32:
            r12 = 0
            goto L30
        L35:
            if (r11 != 0) goto L40
            android.ext.c r11 = new android.ext.c
            r4 = r11
            r5 = r2
            r9 = r10
            r4.<init>(r5, r7, r9)
            goto L46
        L40:
            r11.f672a = r2
            r11.f673b = r7
            r11.f674c = r10
        L46:
            return r11
    }

    static android.ext.h2 U3(luaj.LuaTable r10, boolean r11) {
            luaj.LuaString[] r0 = android.ext.Script.t0
            android.ext.h2 r1 = new android.ext.h2
            r1.<init>()
            r2 = 0
            T3(r1, r10, r2, r11)
            r11 = 3
            r11 = r0[r11]
            r3 = 0
            java.lang.String r11 = I3(r10, r11, r3)
            r1.l = r11
            r11 = 4
            r11 = r0[r11]
            boolean r11 = G3(r10, r11, r2)
            r1.m = r11
            r11 = 5
            r11 = r0[r11]
            int r11 = H3(r10, r11, r2)
            r1.d0(r11)
            long r8 = r1.f672a
            int r11 = r1.f674c
            r2 = 6
            r4 = r0[r2]
            luaj.LuaValue r5 = r10.U0(r4)
            r7 = 1
            r2 = r8
            r6 = r11
            long r2 = q3(r2, r4, r5, r6, r7)
            r1.o = r2
            r2 = 7
            r4 = r0[r2]
            luaj.LuaValue r5 = r10.U0(r4)
            r2 = r8
            long r10 = q3(r2, r4, r5, r6, r7)
            r1.p = r10
            return r1
    }

    static java.lang.String V3(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof android.ext.t1.a
            if (r0 == 0) goto La
            r0 = r1
            android.ext.t1$a r0 = (android.ext.t1.a) r0
            r0.d()
        La:
            java.lang.String r1 = r1.toString()
            return r1
    }

    static void W3(java.lang.Object r1) {
            r1.wait()     // Catch: java.lang.InterruptedException -> L4
            return
        L4:
            r1 = move-exception
            java.lang.String r0 = "Interrupted wait"
            android.ext.e1.s(r0, r1)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            luaj.d r0 = new luaj.d
            r0.<init>(r1)
            throw r0
    }

    static /* synthetic */ luaj.LuaTable X2(int[] r0, android.ext.c r1) {
            luaj.LuaTable r0 = n3(r0, r1)
            return r0
    }

    public static void Y2(long r0) {
            android.ext.Script.s0 = r0
            return
    }

    private static luaj.d b3(luaj.LuaValue r3, luaj.d r4) {
            java.lang.String r0 = r4.getMessage()
            java.lang.String r1 = "bad argument:"
            int r1 = r0.indexOf(r1)
            if (r1 != 0) goto L34
            luaj.d r4 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bad argument for key '"
            r1.append(r2)
            java.lang.String r3 = r3.g0()
            r1.append(r3)
            java.lang.String r3 = "':"
            r1.append(r3)
            r3 = 13
            java.lang.String r3 = r0.substring(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
        L34:
            return r4
    }

    public static void d3(byte r1, java.util.ArrayList r2) {
            java.util.Map r0 = android.ext.Script.r0
            monitor-enter(r0)
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch: java.lang.Throwable -> Lc
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    static int e3(int r3) {
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            if (r3 == r0) goto L2d
            r0 = 134217728(0x8000000, float:3.85186E-34)
            if (r3 == r0) goto L2d
            r0 = 268435456(0x10000000, float:2.524355E-29)
            if (r3 == r0) goto L2d
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 != r0) goto L11
            goto L2d
        L11:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown sign: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ". The sign must be one of the constants gg.SIGN_*."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2d:
            return r3
    }

    static int f3(int r3) {
            if (r3 == 0) goto L7
            r0 = r3 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L7
            return r3
        L7:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ". The type must be one of the constants gg.TYPE_*."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static int g3(luaj.LuaTable r0, luaj.LuaValue r1) {
            luaj.LuaValue r0 = r0.U0(r1)     // Catch: luaj.d -> L9
            int r0 = r0.A0()     // Catch: luaj.d -> L9
            return r0
        L9:
            r0 = move-exception
            luaj.d r0 = b3(r1, r0)
            throw r0
    }

    static java.lang.String h3(luaj.LuaTable r0, luaj.LuaValue r1) {
            luaj.LuaValue r0 = r0.U0(r1)     // Catch: luaj.d -> L9
            java.lang.String r0 = r0.B0()     // Catch: luaj.d -> L9
            return r0
        L9:
            r0 = move-exception
            luaj.d r0 = b3(r1, r0)
            throw r0
    }

    static long i3(luaj.LuaTable r0, luaj.LuaValue r1) {
            long r0 = r0.g3(r1)     // Catch: luaj.d -> L5
            return r0
        L5:
            r0 = move-exception
            luaj.d r0 = b3(r1, r0)
            throw r0
    }

    static java.util.ArrayList j3(byte r1) {
            java.util.Map r0 = android.ext.Script.r0
            monitor-enter(r0)
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r0.remove(r1)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    static void l3(int r3) {
            java.util.Map r0 = android.ext.Script.r0
            monitor-enter(r0)
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        Lb:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            java.lang.Byte r2 = (java.lang.Byte) r2     // Catch: java.lang.Throwable -> L25
            byte r2 = r2.byteValue()     // Catch: java.lang.Throwable -> L25
            int r2 = O3(r2)     // Catch: java.lang.Throwable -> L25
            if (r2 != r3) goto Lb
            r1.remove()     // Catch: java.lang.Throwable -> L25
            goto Lb
        L25:
            r3 = move-exception
            goto L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    static luaj.d m3(luaj.LuaValue r3, luaj.LuaValue r4, java.lang.Throwable r5) {
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed parse item "
            r1.append(r2)
            java.lang.String r4 = r4.g0()
            r1.append(r4)
            java.lang.String r4 = " on key '"
            r1.append(r4)
            java.lang.String r3 = r3.g0()
            r1.append(r3)
            java.lang.String r3 = "': "
            r1.append(r3)
            java.lang.String r3 = r5.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r5)
            return r0
    }

    private static luaj.LuaTable n3(int[] r11, android.ext.c r12) {
            if (r11 != 0) goto L4
            int[] r11 = android.ext.Script.u0
        L4:
            int r0 = r11.length
            luaj.LuaString[] r1 = android.ext.Script.t0
            luaj.LuaTable r10 = new luaj.LuaTable
            r2 = 0
            r10.<init>(r2, r0)
            long r5 = r12.f672a
            int r0 = r12.f674c
            r3 = r11[r2]
            r2 = r1[r2]
            r10.J3(r3, r2, r5)
            r2 = 1
            r3 = r11[r2]
            r4 = r1[r2]
            long r7 = r12.f673b
            r2 = r3
            r3 = r10
            r9 = r0
            Q3(r2, r3, r4, r5, r7, r9)
            r12 = 2
            r11 = r11[r12]
            r12 = r1[r12]
            r10.I3(r11, r12, r0)
            return r10
    }

    static luaj.LuaTable o3(android.ext.h2 r14) {
            luaj.LuaString[] r0 = android.ext.Script.t0
            int[] r1 = android.ext.Script.v0
            luaj.LuaTable r10 = n3(r1, r14)
            java.lang.String r2 = r14.l
            if (r2 == 0) goto L16
            r3 = 3
            r3 = r0[r3]
            luaj.LuaString r2 = luaj.LuaValue.K2(r2)
            r10.m3(r3, r2)
        L16:
            r2 = 4
            r3 = r1[r2]
            r2 = r0[r2]
            boolean r4 = r14.m
            r10.K3(r3, r2, r4)
            r2 = 5
            r3 = r1[r2]
            r2 = r0[r2]
            byte r4 = r14.n
            r10.I3(r3, r2, r4)
            long r11 = r14.f672a
            int r13 = r14.f674c
            long r7 = r14.o
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L3c
            long r4 = r14.p
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L53
        L3c:
            r2 = 6
            r3 = r1[r2]
            r4 = r0[r2]
            r2 = r3
            r3 = r10
            r5 = r11
            r9 = r13
            Q3(r2, r3, r4, r5, r7, r9)
            r2 = 7
            r1 = r1[r2]
            r4 = r0[r2]
            long r7 = r14.p
            r2 = r1
            Q3(r2, r3, r4, r5, r7, r9)
        L53:
            return r10
    }

    public static android.ext.Script.Consts p3(java.util.ArrayList r13) {
            java.lang.ref.WeakReference r0 = android.ext.Script.o0
            java.lang.Object r0 = r0.get()
            android.ext.Script$Consts r0 = (android.ext.Script.Consts) r0
            if (r0 != 0) goto L172
            if (r13 != 0) goto L1c
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            luaj.LuaTable r0 = new luaj.LuaTable
            r1 = 0
            r2 = 64
            r0.<init>(r1, r2)
            B3(r0, r13)
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r13 = r13.iterator()
        L52:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto Ld9
            java.lang.Object r10 = r13.next()
            android.ext.Script$Const r10 = (android.ext.Script.Const) r10
            java.lang.String r11 = r10.f369a
            java.lang.String r12 = "gg.REGION_"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L6c
            r0.add(r10)
            goto L52
        L6c:
            java.lang.String r12 = "gg.TYPE_"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L78
            r1.add(r10)
            goto L52
        L78:
            java.lang.String r12 = "gg.SIGN_FUZZY_"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L84
            r2.add(r10)
            goto L52
        L84:
            java.lang.String r12 = "gg.SIGN_"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L90
            r3.add(r10)
            goto L52
        L90:
            java.lang.String r12 = "gg.LOAD_"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L9c
            r4.add(r10)
            goto L52
        L9c:
            java.lang.String r12 = "gg.SAVE_"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto La8
            r5.add(r10)
            goto L52
        La8:
            java.lang.String r12 = "gg.PROT_"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto Lb4
            r6.add(r10)
            goto L52
        Lb4:
            java.lang.String r12 = "gg.POINTER_"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto Lc0
            r7.add(r10)
            goto L52
        Lc0:
            java.lang.String r12 = "gg.DUMP_"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto Lcc
            r8.add(r10)
            goto L52
        Lcc:
            java.lang.String r12 = "gg.ASM_"
            boolean r11 = r11.startsWith(r12)
            if (r11 == 0) goto L52
            r9.add(r10)
            goto L52
        Ld9:
            android.ext.Script$Consts r13 = new android.ext.Script$Consts
            r13.<init>()
            int r10 = r0.size()
            android.ext.Script$Const[] r10 = new android.ext.Script.Const[r10]
            java.lang.Object[] r0 = r0.toArray(r10)
            android.ext.Script$Const[] r0 = (android.ext.Script.Const[]) r0
            r13.f371a = r0
            int r0 = r1.size()
            android.ext.Script$Const[] r0 = new android.ext.Script.Const[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.ext.Script$Const[] r0 = (android.ext.Script.Const[]) r0
            r13.f372b = r0
            int r0 = r2.size()
            android.ext.Script$Const[] r0 = new android.ext.Script.Const[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            android.ext.Script$Const[] r0 = (android.ext.Script.Const[]) r0
            r13.f373c = r0
            int r0 = r3.size()
            android.ext.Script$Const[] r0 = new android.ext.Script.Const[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            android.ext.Script$Const[] r0 = (android.ext.Script.Const[]) r0
            r13.f374d = r0
            int r0 = r4.size()
            android.ext.Script$Const[] r0 = new android.ext.Script.Const[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            android.ext.Script$Const[] r0 = (android.ext.Script.Const[]) r0
            r13.f375e = r0
            int r0 = r5.size()
            android.ext.Script$Const[] r0 = new android.ext.Script.Const[r0]
            java.lang.Object[] r0 = r5.toArray(r0)
            android.ext.Script$Const[] r0 = (android.ext.Script.Const[]) r0
            r13.f376f = r0
            int r0 = r6.size()
            android.ext.Script$Const[] r0 = new android.ext.Script.Const[r0]
            java.lang.Object[] r0 = r6.toArray(r0)
            android.ext.Script$Const[] r0 = (android.ext.Script.Const[]) r0
            r13.f377g = r0
            int r0 = r7.size()
            android.ext.Script$Const[] r0 = new android.ext.Script.Const[r0]
            java.lang.Object[] r0 = r7.toArray(r0)
            android.ext.Script$Const[] r0 = (android.ext.Script.Const[]) r0
            r13.h = r0
            int r0 = r8.size()
            android.ext.Script$Const[] r0 = new android.ext.Script.Const[r0]
            java.lang.Object[] r0 = r8.toArray(r0)
            android.ext.Script$Const[] r0 = (android.ext.Script.Const[]) r0
            r13.i = r0
            int r0 = r9.size()
            android.ext.Script$Const[] r0 = new android.ext.Script.Const[r0]
            java.lang.Object[] r0 = r9.toArray(r0)
            android.ext.Script$Const[] r0 = (android.ext.Script.Const[]) r0
            r13.j = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r13)
            android.ext.Script.o0 = r0
            r0 = r13
        L172:
            return r0
    }

    private static long q3(long r4, luaj.LuaValue r6, luaj.LuaValue r7, int r8, boolean r9) {
            boolean r0 = r7 instanceof luaj.LuaLong
            r1 = 8
            r2 = 64
            r3 = 16
            if (r0 == 0) goto L22
            long r6 = r7.z2()
            if (r8 != r3) goto L17
            float r6 = (float) r6
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            goto L1e
        L17:
            if (r8 != r2) goto L1e
            double r6 = (double) r6
            long r6 = java.lang.Double.doubleToRawLongBits(r6)
        L1e:
            if (r8 != r1) goto L64
            long r6 = r6 ^ r4
            goto L64
        L22:
            boolean r0 = r7 instanceof luaj.LuaDouble
            if (r0 == 0) goto L40
            double r6 = r7.x2()
            if (r8 != r3) goto L33
            float r6 = (float) r6
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            goto L3b
        L33:
            if (r8 != r2) goto L3a
            long r6 = java.lang.Double.doubleToRawLongBits(r6)
            goto L3b
        L3a:
            long r6 = (long) r6
        L3b:
            if (r8 != r1) goto L64
            long r4 = r4 ^ r6
            r6 = r4
            goto L64
        L40:
            if (r9 == 0) goto L4a
            r9 = 0
            java.lang.String r6 = r7.I1(r9)     // Catch: luaj.d -> L48
            goto L4e
        L48:
            r4 = move-exception
            goto L65
        L4a:
            java.lang.String r6 = r7.B0()     // Catch: luaj.d -> L48
        L4e:
            if (r6 != 0) goto L53
            r6 = 0
            goto L64
        L53:
            java.lang.String r6 = D3(r6)
            r7 = 0
            android.ext.i2$c r7 = android.ext.i2.x(r6, r7)
            if (r7 == 0) goto L60
            java.lang.String r6 = r7.f1017a
        L60:
            long r6 = android.ext.c.e(r4, r6, r8)
        L64:
            return r6
        L65:
            luaj.d r4 = b3(r6, r4)
            throw r4
    }

    static java.util.ArrayList r3(luaj.Varargs r5) {
            r0 = 1
            luaj.LuaTable r5 = r5.I(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.z1$d r1 = r1.v0
            if (r1 == 0) goto L13
            boolean r1 = r1.n
            goto L14
        L13:
            r1 = 0
        L14:
            luaj.LuaTable$i r5 = r5.s3()
        L18:
            boolean r2 = r5.c()
            if (r2 == 0) goto L36
            luaj.LuaValue r2 = r5.d()
            luaj.LuaTable r2 = r2.H0()
            r3 = 2
            r4 = 0
            android.ext.c r2 = T3(r4, r2, r3, r1)
            int r3 = r2.f674c
            r3 = r3 & 127(0x7f, float:1.78E-43)
            r2.f674c = r3
            r0.add(r2)
            goto L18
        L36:
            return r0
    }

    static java.lang.String s3(java.io.File r0) {
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L5
            goto L9
        L5:
            java.lang.String r0 = r0.getAbsolutePath()
        L9:
            return r0
    }

    private void u3() {
            r2 = this;
            luaj.Globals r0 = r2.T
            r0.Z = r2
            luaj.a.c(r0)
            g.h.M(r0)
            luaj.lib.BaseLib r1 = new luaj.lib.BaseLib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.PackageLib r1 = new luaj.lib.PackageLib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.Bit32Lib r1 = new luaj.lib.Bit32Lib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.TableLib r1 = new luaj.lib.TableLib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.StringLib r1 = new luaj.lib.StringLib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.Utf8Lib r1 = new luaj.lib.Utf8Lib
            r1.<init>()
            r0.t1(r1)
            luaj.lib.MathLib r1 = new luaj.lib.MathLib
            r1.<init>()
            r0.t1(r1)
            android.ext.Script$IoLibSafe r1 = new android.ext.Script$IoLibSafe
            r1.<init>(r2)
            r0.t1(r1)
            android.ext.Script$OsLibSafe r1 = new android.ext.Script$OsLibSafe
            r1.<init>(r2)
            r0.t1(r1)
            luaj.lib.DebugLib r1 = new luaj.lib.DebugLib
            r1.<init>()
            r0.t1(r1)
            r2.v3()
            return
    }

    private void v3() {
            r3 = this;
            luaj.Globals r0 = r3.T
            android.ext.Script$ScriptPrintStream r1 = new android.ext.Script$ScriptPrintStream
            r2 = 0
            r1.<init>(r3, r2)
            r0.c0 = r1
            android.ext.Script$ScriptPrintStream r1 = new android.ext.Script$ScriptPrintStream
            r2 = 1
            r1.<init>(r3, r2)
            r0.d0 = r1
            r0.t1(r3)
            return
    }

    void L3() {
            r2 = this;
            android.ext.Script$SavedState r0 = r2.m0
            if (r0 != 0) goto L5
            return
        L5:
            android.ext.Script$1 r1 = new android.ext.Script$1
            r1.<init>(r2, r0)
            android.ext.n2.i(r1)
            return
    }

    void M3() {
            r12 = this;
            java.lang.String r0 = "Failed close log"
            java.lang.Object r1 = r12.U
            boolean r2 = r1 instanceof java.io.File
            java.lang.String r3 = ".tail"
            r4 = 1546300800000(0x16806b5bc00, double:7.63974103417E-312)
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r2 == 0) goto L140
            java.io.File r1 = (java.io.File) r1
            boolean r2 = r1.exists()
            if (r2 == 0) goto L129
            luaj.Globals r2 = r12.T
            java.io.File r7 = r1.getParentFile()
            java.lang.String r7 = r7.getAbsolutePath()
            r2.T3(r7)
            java.lang.String r2 = r1.getAbsolutePath()
            luaj.lib.BaseLib$b r7 = new luaj.lib.BaseLib$b
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r1)
            r7.<init>(r8)
            luaj.Globals r8 = r12.T     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r9.<init>()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r10 = 64
            r9.append(r10)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r9.append(r2)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            java.lang.String r10 = "bt"
            luaj.Globals r11 = r12.T     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            luaj.LuaValue r8 = r8.O3(r7, r9, r10, r11)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            boolean r9 = r8 instanceof luaj.LuaClosure     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            if (r9 == 0) goto L5f
            r9 = r8
            luaj.LuaClosure r9 = (luaj.LuaClosure) r9     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r9.U = r2     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            goto L5f
        L59:
            r0 = move-exception
            goto L125
        L5c:
            r0 = move-exception
            goto L106
        L5f:
            r7.close()
            boolean r2 = r8 instanceof luaj.LuaClosure
            if (r2 == 0) goto L101
            r2 = r8
            luaj.LuaClosure r2 = (luaj.LuaClosure) r2
            luaj.h r2 = r2.R
            boolean r2 = r2 instanceof lasm.b
            if (r2 == 0) goto L101
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r1.getAbsolutePath()
            r0.append(r2)
            r2 = 46
            r0.append(r2)
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r4
            java.lang.String r2 = android.ext.t2.h(r9)
            r0.append(r2)
            java.lang.String r2 = ".lua"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r4.<init>(r0)
            r2.<init>(r4, r6)
            luaj.LuaClosure r8 = (luaj.LuaClosure) r8     // Catch: java.lang.Throwable -> Ld6
            luaj.h r4 = r8.R     // Catch: java.lang.Throwable -> Ld6
            r5 = 0
            g.b.a(r4, r2, r5, r5)     // Catch: java.lang.Throwable -> Ld6
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r7.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld6
            r7.append(r1)     // Catch: java.lang.Throwable -> Ld6
            r7.append(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> Ld6
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Ld6
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> Ld6
            if (r1 == 0) goto Ldb
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Ld6
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Ld6
            byte[] r3 = new byte[r6]     // Catch: java.lang.Throwable -> Ld6
        Lcc:
            int r4 = r1.read(r3)     // Catch: java.lang.Throwable -> Ld6
            if (r4 <= 0) goto Ld8
            r2.write(r3, r5, r4)     // Catch: java.lang.Throwable -> Ld6
            goto Lcc
        Ld6:
            r0 = move-exception
            goto Lfd
        Ld8:
            r1.close()     // Catch: java.lang.Throwable -> Ld6
        Ldb:
            r2.close()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296291(0x7f090023, float:1.8210495E38)
            java.lang.String r2 = android.ext.Tools.N1(r2)
            r1.append(r2)
            java.lang.String r2 = ":\n"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.Z2(r0)
            return
        Lfd:
            r2.close()
            throw r0
        L101:
            java.lang.String r1 = r1.getName()
            goto L159
        L106:
            luaj.d r1 = new luaj.d     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r3.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "load "
            r3.append(r4)     // Catch: java.lang.Throwable -> L59
            r3.append(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = ": "
            r3.append(r2)     // Catch: java.lang.Throwable -> L59
            r3.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L59
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L59
            throw r1     // Catch: java.lang.Throwable -> L59
        L125:
            r7.close()
            throw r0
        L129:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "File not found: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L140:
            java.lang.String r1 = r1.toString()
            luaj.Globals r2 = r12.T
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            byte[] r8 = r1.getBytes()
            r7.<init>(r8)
            java.lang.String r8 = "t"
            luaj.Globals r9 = r12.T
            luaj.LuaValue r8 = r2.O3(r7, r1, r8, r9)
            java.lang.String r1 = "string"
        L159:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 95
            r2.append(r1)
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r4
            java.lang.String r4 = android.ext.t2.h(r9)
            r2.append(r4)
            r2.append(r1)
            java.util.Random r1 = android.ext.Tools.f489a
            int r1 = r1.nextInt()
            java.lang.String r1 = android.ext.t2.g(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            int r2 = r12.X
            r2 = r2 & 1
            r4 = 47
            if (r2 == 0) goto L1f5
            luaj.LuaClosure r2 = r8.w0()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r12.Y
            r5.append(r7)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r7 = ".lasm"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.io.PrintStream r7 = luaj.g.f1714b
            java.io.PrintStream r9 = new java.io.PrintStream     // Catch: java.lang.Throwable -> L1d1
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L1d1
            luaj.g.f1714b = r9     // Catch: java.lang.Throwable -> L1d1
            luaj.h r9 = r2.R     // Catch: java.lang.Throwable -> L1d1
            luaj.g.A(r9)     // Catch: java.lang.Throwable -> L1d1
            java.io.PrintStream r9 = luaj.g.f1714b     // Catch: java.lang.Throwable -> L1d1
            r9.close()     // Catch: java.lang.Throwable -> L1d1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d1
            r9.<init>()     // Catch: java.lang.Throwable -> L1d1
            r9.append(r5)     // Catch: java.lang.Throwable -> L1d1
            r9.append(r3)     // Catch: java.lang.Throwable -> L1d1
            java.lang.String r3 = r9.toString()     // Catch: java.lang.Throwable -> L1d1
            luaj.g.M(r2, r3)     // Catch: java.lang.Throwable -> L1d1
            goto L1f3
        L1d1:
            r3 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Failed disassemble "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r2 = " into '"
            r9.append(r2)
            r9.append(r5)
            r2 = 39
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            android.ext.e1.l(r2, r3)
        L1f3:
            luaj.g.f1714b = r7
        L1f5:
            int r2 = r12.X
            r2 = r2 & 2
            if (r2 == 0) goto L216
            luaj.Globals r2 = r12.T
            luaj.lib.BaseLib r2 = r2.g0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r12.Y
            r3.append(r5)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.c3(r3)
        L216:
            int r2 = r12.X
            r2 = r2 & 4
            r3 = 0
            if (r2 == 0) goto L24c
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L246
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L246
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L246
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L246
            r9.<init>()     // Catch: java.lang.Throwable -> L246
            java.lang.String r10 = r12.Y     // Catch: java.lang.Throwable -> L246
            r9.append(r10)     // Catch: java.lang.Throwable -> L246
            r9.append(r4)     // Catch: java.lang.Throwable -> L246
            r9.append(r1)     // Catch: java.lang.Throwable -> L246
            java.lang.String r1 = ".log.txt"
            r9.append(r1)     // Catch: java.lang.Throwable -> L246
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L246
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L246
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L246
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L246
            goto L24d
        L246:
            r1 = move-exception
            java.lang.String r2 = "Failed open log file"
            android.ext.e1.s(r2, r1)
        L24c:
            r2 = r3
        L24d:
            if (r2 != 0) goto L251
            r1 = r3
            goto L258
        L251:
            android.ext.Script$DebugLog r1 = new android.ext.Script$DebugLog
            luaj.Globals r4 = r12.T
            r1.<init>(r2, r4)
        L258:
            android.ext.Script.w0 = r1
            java.io.PrintStream r1 = luaj.g.f1714b
            luaj.Globals r4 = r12.T     // Catch: java.lang.Throwable -> L287
            java.io.PrintStream r5 = r4.c0     // Catch: java.lang.Throwable -> L287
            luaj.g.f1714b = r5     // Catch: java.lang.Throwable -> L287
            K3(r4)     // Catch: java.lang.Throwable -> L287
            r8.call()     // Catch: java.lang.Throwable -> L287
            luaj.g.f1714b = r1
            if (r2 == 0) goto L276
            android.ext.Script.w0 = r3
            r2.close()     // Catch: java.lang.Throwable -> L272
            goto L276
        L272:
            r1 = move-exception
            android.ext.e1.s(r0, r1)
        L276:
            int r0 = r12.X
            r0 = r0 & 2
            if (r0 == 0) goto L283
            luaj.Globals r0 = r12.T
            luaj.lib.BaseLib r0 = r0.g0
            r0.Z2()
        L283:
            K3(r3)
            return
        L287:
            r4 = move-exception
            luaj.g.f1714b = r1
            if (r2 == 0) goto L296
            android.ext.Script.w0 = r3
            r2.close()     // Catch: java.lang.Throwable -> L292
            goto L296
        L292:
            r1 = move-exception
            android.ext.e1.s(r0, r1)
        L296:
            int r0 = r12.X
            r0 = r0 & 2
            if (r0 == 0) goto L2a3
            luaj.Globals r0 = r12.T
            luaj.lib.BaseLib r0 = r0.g0
            r0.Z2()
        L2a3:
            K3(r3)
            throw r4
    }

    void N3() {
            r2 = this;
            android.ext.Script$SavedState r0 = new android.ext.Script$SavedState
            r1 = 0
            r0.<init>(r1)
            int r1 = android.ext.Config.i
            r0.f389a = r1
            r2.m0 = r0
            return
    }

    public android.ext.Script R3() {
            r1 = this;
            java.lang.Thread r0 = r1.V
            r0.start()
            return r1
    }

    void Z2(java.lang.String r3) {
            r2 = this;
            android.ext.Script$Logger r0 = r2.W
            java.lang.String r1 = "\n"
            r0.a(r1)
            android.ext.Script$Logger r0 = r2.W
            r0.a(r3)
            android.ext.Script$Logger r3 = r2.W
            r3.a(r1)
            return
    }

    void a3(boolean r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L9
            android.ext.Script$Logger r2 = r1.W
            java.lang.String r0 = "err: "
            r2.a(r0)
        L9:
            android.ext.Script$Logger r2 = r1.W
            r2.a(r3)
            android.ext.Script$Logger r2 = r1.W
            java.lang.String r3 = "\n"
            r2.a(r3)
            return
    }

    public void c3(byte r6, java.lang.String r7) {
            r5 = this;
            int r0 = r6 + (-20)
            byte r0 = (byte) r0
            int r1 = r0 / 20
            byte r1 = (byte) r1
            int r0 = r0 % 20
            byte r0 = (byte) r0
            byte r2 = r5.Z
            if (r2 == r1) goto L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "callNotify id mismatch: "
            r2.append(r3)
            byte r3 = r5.Z
            r2.append(r3)
            java.lang.String r3 = " != "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "; "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "; "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = "; "
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
        L40:
            android.ext.e1.d(r6)
            return
        L44:
            byte r2 = r5.b0
            if (r2 != r0) goto L5a
            monitor-enter(r5)
            byte r2 = r5.b0     // Catch: java.lang.Throwable -> L54
            if (r2 != r0) goto L56
            r5.l0 = r7     // Catch: java.lang.Throwable -> L54
            r5.notifyAll()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            return
        L54:
            r6 = move-exception
            goto L58
        L56:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            goto L5a
        L58:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            throw r6
        L5a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "callNotify seq mismatch: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " != "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "; "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "; "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = "; "
            r3.append(r6)
            r3.append(r7)
            java.lang.String r6 = r3.toString()
            goto L40
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r13, luaj.LuaValue r14) {
            r12 = this;
            java.lang.String r13 = "EXT_CACHE_DIR"
            java.lang.String r0 = "EXT_FILES_DIR"
            android.content.Context r1 = android.ext.Tools.f0()
            int r2 = r12.X
            r3 = 4
            r2 = r2 & r3
            r4 = 0
            if (r2 == 0) goto L15
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L16
        L15:
            r2 = r4
        L16:
            luaj.LuaTable r5 = new luaj.LuaTable
            r6 = 128(0x80, float:1.8E-43)
            r7 = 0
            r5.<init>(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = ""
            r6.append(r8)
            r8 = 1
            float r9 = (float) r8
            r10 = 1121491354(0x42d8999a, float:108.3)
            float r10 = r10 * r9
            r11 = 1088212173(0x40dccccd, float:6.9)
            float r10 = r10 - r11
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r10 = "VERSION"
            r5.b2(r10, r6)
            java.lang.String r6 = "VERSION_INT"
            int r10 = android.ext.h0.d()
            r5.a2(r6, r10)
            r6 = 1182806886(0x46803366, float:16409.7)
            float r9 = r9 * r6
            r6 = 1132376883(0x437eb333, float:254.7)
            float r9 = r9 - r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r6
            int r6 = (int) r9
            java.lang.String r9 = "BUILD"
            r5.a2(r9, r6)
            java.lang.String r6 = "PACKAGE"
            java.lang.String r9 = android.ext.Tools.C0()
            r5.b2(r6, r9)
            java.lang.String r6 = "ANDROID_SDK_INT"
            int r9 = android.os.Build.VERSION.SDK_INT
            r5.a2(r6, r9)
            java.io.File r6 = android.ext.Tools.p0()
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.String r9 = "FILES_DIR"
            r5.b2(r9, r6)
            java.io.File r6 = android.ext.Tools.b0()
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.String r9 = "CACHE_DIR"
            r5.b2(r9, r6)
            java.io.File r4 = r1.getExternalFilesDir(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L90
            r5.b2(r0, r4)     // Catch: java.lang.Throwable -> L90
            goto La1
        L90:
            r4 = move-exception
            java.lang.String r6 = "Failed set EXT_FILES_DIR for script"
            android.ext.e1.l(r6, r4)
            java.io.File r4 = android.ext.Tools.p0()
            java.lang.String r4 = r4.getAbsolutePath()
            r5.b2(r0, r4)
        La1:
            java.io.File r0 = r1.getExternalCacheDir()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> Lad
            r5.b2(r13, r0)     // Catch: java.lang.Throwable -> Lad
            goto Lbe
        Lad:
            r0 = move-exception
            java.lang.String r1 = "Failed set EXT_CACHE_DIR for script"
            android.ext.e1.l(r1, r0)
            java.io.File r0 = android.ext.Tools.b0()
            java.lang.String r0 = r0.getAbsolutePath()
            r5.b2(r13, r0)
        Lbe:
            java.lang.String r13 = "EXT_STORAGE"
            java.lang.String r0 = android.ext.Tools.K0()
            r5.b2(r13, r0)
            B3(r5, r2)
            android.ext.Script$require r13 = new android.ext.Script$require
            r13.<init>(r12)
            java.lang.String r0 = "require"
            r5.c2(r0, r13)
            android.ext.Script$toast r13 = new android.ext.Script$toast
            r13.<init>()
            java.lang.String r0 = "toast"
            r5.c2(r0, r13)
            android.ext.Script$alert r13 = new android.ext.Script$alert
            r13.<init>()
            java.lang.String r0 = "alert"
            r5.c2(r0, r13)
            android.ext.Script$prompt r13 = new android.ext.Script$prompt
            r13.<init>(r12)
            java.lang.String r0 = "prompt"
            r5.c2(r0, r13)
            android.ext.Script$choice r13 = new android.ext.Script$choice
            r13.<init>()
            java.lang.String r0 = "choice"
            r5.c2(r0, r13)
            android.ext.Script$multiChoice r13 = new android.ext.Script$multiChoice
            r13.<init>()
            java.lang.String r0 = "multiChoice"
            r5.c2(r0, r13)
            android.ext.Script$isVisible r13 = new android.ext.Script$isVisible
            r13.<init>()
            java.lang.String r0 = "isVisible"
            r5.c2(r0, r13)
            android.ext.Script$setVisible r13 = new android.ext.Script$setVisible
            r13.<init>(r12)
            java.lang.String r0 = "setVisible"
            r5.c2(r0, r13)
            android.ext.Script$getActiveTab r13 = new android.ext.Script$getActiveTab
            r13.<init>()
            java.lang.String r0 = "getActiveTab"
            r5.c2(r0, r13)
            android.ext.Script$showUiButton r13 = new android.ext.Script$showUiButton
            r13.<init>(r12)
            java.lang.String r0 = "showUiButton"
            r5.c2(r0, r13)
            android.ext.Script$hideUiButton r13 = new android.ext.Script$hideUiButton
            r13.<init>(r12)
            java.lang.String r0 = "hideUiButton"
            r5.c2(r0, r13)
            android.ext.Script$isClickedUiButton r13 = new android.ext.Script$isClickedUiButton
            r13.<init>()
            java.lang.String r0 = "isClickedUiButton"
            r5.c2(r0, r13)
            android.ext.Script$getTargetPackage r13 = new android.ext.Script$getTargetPackage
            r13.<init>()
            java.lang.String r0 = "getTargetPackage"
            r5.c2(r0, r13)
            android.ext.Script$getTargetInfo r0 = new android.ext.Script$getTargetInfo
            r0.<init>()
            java.lang.String r1 = "getTargetInfo"
            r5.c2(r1, r0)
            android.ext.Script$isPackageInstalled r0 = new android.ext.Script$isPackageInstalled
            r0.<init>()
            java.lang.String r1 = "isPackageInstalled"
            r5.c2(r1, r0)
            android.ext.Script$processKill r0 = new android.ext.Script$processKill
            r0.<init>(r12)
            java.lang.String r1 = "processKill"
            r5.c2(r1, r0)
            android.ext.Script$saveVariable r0 = new android.ext.Script$saveVariable
            r0.<init>(r12)
            java.lang.String r1 = "saveVariable"
            r5.c2(r1, r0)
            android.ext.Script$makeRequest r0 = new android.ext.Script$makeRequest
            r0.<init>(r12)
            java.lang.String r1 = "makeRequest"
            r5.c2(r1, r0)
            android.ext.Script$getResultsCount r0 = new android.ext.Script$getResultsCount
            r0.<init>()
            java.lang.String r1 = "getResultsCount"
            r5.c2(r1, r0)
            android.ext.Script$getResults r1 = new android.ext.Script$getResults
            r1.<init>(r12)
            java.lang.String r4 = "getResults"
            r5.c2(r4, r1)
            android.ext.Script$editAll r1 = new android.ext.Script$editAll
            r1.<init>(r12)
            java.lang.String r4 = "editAll"
            r5.c2(r4, r1)
            android.ext.Script$clearResults r1 = new android.ext.Script$clearResults
            r1.<init>(r12)
            java.lang.String r4 = "clearResults"
            r5.c2(r4, r1)
            android.ext.Script$removeResults r1 = new android.ext.Script$removeResults
            r1.<init>(r12)
            java.lang.String r4 = "removeResults"
            r5.c2(r4, r1)
            android.ext.Script$loadResults r1 = new android.ext.Script$loadResults
            r1.<init>(r12)
            java.lang.String r4 = "loadResults"
            r5.c2(r4, r1)
            android.ext.Script$getSelectedResults r1 = new android.ext.Script$getSelectedResults
            r1.<init>(r12)
            java.lang.String r4 = "getSelectedResults"
            r5.c2(r4, r1)
            android.ext.Script$setValues r1 = new android.ext.Script$setValues
            r1.<init>(r12)
            java.lang.String r4 = "setValues"
            r5.c2(r4, r1)
            android.ext.Script$getValues r1 = new android.ext.Script$getValues
            r1.<init>(r12)
            java.lang.String r4 = "getValues"
            r5.c2(r4, r1)
            android.ext.Script$getValuesRange r1 = new android.ext.Script$getValuesRange
            r1.<init>(r12)
            java.lang.String r4 = "getValuesRange"
            r5.c2(r4, r1)
            android.ext.Script$processPause r1 = new android.ext.Script$processPause
            r1.<init>(r12)
            java.lang.String r4 = "processPause"
            r5.c2(r4, r1)
            android.ext.Script$processResume r1 = new android.ext.Script$processResume
            r1.<init>(r12)
            java.lang.String r4 = "processResume"
            r5.c2(r4, r1)
            android.ext.Script$processToggle r1 = new android.ext.Script$processToggle
            r1.<init>(r12)
            java.lang.String r4 = "processToggle"
            r5.c2(r4, r1)
            android.ext.Script$isProcessPaused r1 = new android.ext.Script$isProcessPaused
            r1.<init>()
            java.lang.String r4 = "isProcessPaused"
            r5.c2(r4, r1)
            android.ext.Script$timeJump r1 = new android.ext.Script$timeJump
            r1.<init>(r12)
            java.lang.String r4 = "timeJump"
            r5.c2(r4, r1)
            android.ext.Script$setSpeed r1 = new android.ext.Script$setSpeed
            r1.<init>(r12)
            java.lang.String r4 = "setSpeed"
            r5.c2(r4, r1)
            android.ext.Script$getSpeed r1 = new android.ext.Script$getSpeed
            r1.<init>()
            java.lang.String r4 = "getSpeed"
            r5.c2(r4, r1)
            android.ext.Script$unrandomizer r1 = new android.ext.Script$unrandomizer
            r1.<init>(r12)
            java.lang.String r4 = "unrandomizer"
            r5.c2(r4, r1)
            android.ext.Script$gotoAddress r1 = new android.ext.Script$gotoAddress
            r1.<init>()
            java.lang.String r4 = "gotoAddress"
            r5.c2(r4, r1)
            android.ext.Script$getSelectedElements r1 = new android.ext.Script$getSelectedElements
            r1.<init>(r12)
            java.lang.String r4 = "getSelectedElements"
            r5.c2(r4, r1)
            android.ext.Script$getRanges r1 = new android.ext.Script$getRanges
            r1.<init>()
            java.lang.String r4 = "getRanges"
            r5.c2(r4, r1)
            android.ext.Script$setRanges r1 = new android.ext.Script$setRanges
            r1.<init>(r12)
            java.lang.String r4 = "setRanges"
            r5.c2(r4, r1)
            android.ext.Script$copyMemory r1 = new android.ext.Script$copyMemory
            r1.<init>(r12)
            java.lang.String r4 = "copyMemory"
            r5.c2(r4, r1)
            android.ext.Script$dumpMemory r1 = new android.ext.Script$dumpMemory
            r1.<init>(r12)
            java.lang.String r4 = "dumpMemory"
            r5.c2(r4, r1)
            android.ext.Script$loadList r1 = new android.ext.Script$loadList
            r1.<init>(r12)
            java.lang.String r4 = "loadList"
            r5.c2(r4, r1)
            android.ext.Script$saveList r1 = new android.ext.Script$saveList
            r1.<init>(r12)
            java.lang.String r4 = "saveList"
            r5.c2(r4, r1)
            android.ext.Script$clearList r1 = new android.ext.Script$clearList
            r1.<init>(r12)
            java.lang.String r4 = "clearList"
            r5.c2(r4, r1)
            android.ext.Script$addListItems r1 = new android.ext.Script$addListItems
            r1.<init>(r12)
            java.lang.String r4 = "addListItems"
            r5.c2(r4, r1)
            android.ext.Script$getListItems r1 = new android.ext.Script$getListItems
            r1.<init>(r12)
            java.lang.String r4 = "getListItems"
            r5.c2(r4, r1)
            android.ext.Script$removeListItems r1 = new android.ext.Script$removeListItems
            r1.<init>(r12)
            java.lang.String r4 = "removeListItems"
            r5.c2(r4, r1)
            android.ext.Script$getSelectedListItems r1 = new android.ext.Script$getSelectedListItems
            r1.<init>(r12)
            java.lang.String r4 = "getSelectedListItems"
            r5.c2(r4, r1)
            android.ext.Script$searchNumber r1 = new android.ext.Script$searchNumber
            r1.<init>(r12)
            java.lang.String r4 = "searchNumber"
            r5.c2(r4, r1)
            android.ext.Script$refineNumber r1 = new android.ext.Script$refineNumber
            r1.<init>(r12)
            java.lang.String r4 = "refineNumber"
            r5.c2(r4, r1)
            android.ext.Script$searchAddress r1 = new android.ext.Script$searchAddress
            r1.<init>(r12)
            java.lang.String r4 = "searchAddress"
            r5.c2(r4, r1)
            android.ext.Script$refineAddress r1 = new android.ext.Script$refineAddress
            r1.<init>(r12)
            java.lang.String r4 = "refineAddress"
            r5.c2(r4, r1)
            android.ext.Script$startFuzzy r1 = new android.ext.Script$startFuzzy
            r1.<init>(r12)
            java.lang.String r4 = "startFuzzy"
            r5.c2(r4, r1)
            android.ext.Script$searchFuzzy r1 = new android.ext.Script$searchFuzzy
            r1.<init>(r12)
            java.lang.String r4 = "searchFuzzy"
            r5.c2(r4, r1)
            android.ext.Script$searchPointer r1 = new android.ext.Script$searchPointer
            r1.<init>(r12)
            java.lang.String r4 = "searchPointer"
            r5.c2(r4, r1)
            android.ext.Script$sleep r4 = new android.ext.Script$sleep
            r4.<init>()
            java.lang.String r6 = "sleep"
            r5.c2(r6, r4)
            android.ext.Script$copyText r4 = new android.ext.Script$copyText
            r4.<init>()
            java.lang.String r6 = "copyText"
            r5.c2(r6, r4)
            android.ext.Script$disasm r4 = new android.ext.Script$disasm
            r4.<init>(r12)
            java.lang.String r6 = "disasm"
            r5.c2(r6, r4)
            android.ext.Script$getLine r4 = new android.ext.Script$getLine
            r4.<init>(r12)
            java.lang.String r6 = "getLine"
            r5.c2(r6, r4)
            android.ext.Script$getFile r4 = new android.ext.Script$getFile
            r4.<init>(r12)
            java.lang.String r6 = "getFile"
            r5.c2(r6, r4)
            android.ext.Script$bytes r4 = new android.ext.Script$bytes
            r4.<init>(r12)
            java.lang.String r6 = "bytes"
            r5.c2(r6, r4)
            android.ext.Script$skipRestoreState r4 = new android.ext.Script$skipRestoreState
            r4.<init>(r12)
            java.lang.String r6 = "skipRestoreState"
            r5.c2(r6, r4)
            android.ext.Script$getRangesList r4 = new android.ext.Script$getRangesList
            r4.<init>(r12)
            java.lang.String r6 = "getRangesList"
            r5.c2(r6, r4)
            android.ext.Script$allocatePage r4 = new android.ext.Script$allocatePage
            r4.<init>(r12)
            java.lang.String r6 = "allocatePage"
            r5.c2(r6, r4)
            android.ext.Script$getLocale r4 = new android.ext.Script$getLocale
            r4.<init>(r12)
            java.lang.String r6 = "getLocale"
            r5.c2(r6, r4)
            android.ext.Script$numberToLocale r4 = new android.ext.Script$numberToLocale
            r4.<init>(r12)
            java.lang.String r6 = "numberToLocale"
            r5.c2(r6, r4)
            android.ext.Script$numberFromLocale r4 = new android.ext.Script$numberFromLocale
            r4.<init>(r12)
            java.lang.String r6 = "numberFromLocale"
            r5.c2(r6, r4)
            java.lang.String r4 = "SIGN_INEQUAL"
            luaj.LuaString r4 = luaj.LuaValue.K2(r4)
            luaj.LuaString r4 = r4.h3()
            r9 = 268435456(0x10000000, double:1.32624737E-315)
            luaj.LuaLong r6 = luaj.LuaValue.I2(r9)
            r5.d2(r4, r6)
            java.lang.String r4 = "SIGN_SMALLER"
            luaj.LuaString r4 = luaj.LuaValue.K2(r4)
            luaj.LuaString r4 = r4.h3()
            r9 = 134217728(0x8000000, double:6.63123685E-316)
            luaj.LuaLong r6 = luaj.LuaValue.I2(r9)
            r5.d2(r4, r6)
            java.lang.String r4 = "SIGN_LARGER"
            luaj.LuaString r4 = luaj.LuaValue.K2(r4)
            luaj.LuaString r4 = r4.h3()
            r9 = 67108864(0x4000000, double:3.3156184E-316)
            luaj.LuaLong r6 = luaj.LuaValue.I2(r9)
            r5.d2(r4, r6)
            java.lang.String r4 = "getSelectedPackage"
            luaj.LuaString r4 = luaj.LuaValue.K2(r4)
            luaj.LuaString r4 = r4.h3()
            r5.d2(r4, r13)
            java.lang.String r13 = "getResultCount"
            luaj.LuaString r13 = luaj.LuaValue.K2(r13)
            luaj.LuaString r13 = r13.h3()
            r5.d2(r13, r0)
            java.lang.String r13 = "internal1"
            luaj.LuaString r13 = luaj.LuaValue.K2(r13)
            luaj.LuaString r13 = r13.h3()
            android.ext.Script$internal1 r0 = new android.ext.Script$internal1
            r0.<init>(r12)
            r5.d2(r13, r0)
            java.lang.String r13 = "internal2"
            luaj.LuaString r13 = luaj.LuaValue.K2(r13)
            luaj.LuaString r13 = r13.h3()
            android.ext.Script$internal2 r0 = new android.ext.Script$internal2
            r0.<init>(r12)
            r5.d2(r13, r0)
            java.lang.String r13 = "internal3"
            luaj.LuaString r13 = luaj.LuaValue.K2(r13)
            luaj.LuaString r13 = r13.h3()
            r5.d2(r13, r1)
            java.lang.String r13 = "gg"
            r14.i2(r13, r5)
            java.lang.String r0 = "package"
            luaj.LuaValue r0 = r14.T0(r0)
            java.lang.String r1 = "loaded"
            luaj.LuaValue r0 = r0.T0(r1)
            r0.i2(r13, r5)
            java.lang.String r13 = "os"
            luaj.LuaValue r13 = r14.T0(r13)
            android.ext.Script$exit r0 = new android.ext.Script$exit
            r0.<init>()
            java.lang.String r1 = "exit"
            r13.i2(r1, r0)
            android.ext.Script$wrap r0 = new android.ext.Script$wrap
            java.lang.String r1 = "os.remove"
            java.lang.String r4 = "remove"
            luaj.LuaValue r6 = r13.T0(r4)
            r0.<init>(r12, r1, r6, r8)
            r13.i2(r4, r0)
            android.ext.Script$wrap r0 = new android.ext.Script$wrap
            java.lang.String r1 = "os.rename"
            java.lang.String r4 = "rename"
            luaj.LuaValue r6 = r13.T0(r4)
            r9 = 2
            r0.<init>(r12, r1, r6, r9)
            r13.i2(r4, r0)
            android.ext.Script$wrap r0 = new android.ext.Script$wrap
            java.lang.String r1 = "os.tmpname"
            java.lang.String r4 = "tmpname"
            luaj.LuaValue r6 = r13.T0(r4)
            r0.<init>(r12, r1, r6, r7)
            r13.i2(r4, r0)
            java.lang.String r13 = "string"
            luaj.LuaValue r13 = r14.T0(r13)
            android.ext.Script$format r0 = new android.ext.Script$format
            java.lang.String r1 = "format"
            luaj.LuaValue r4 = r13.T0(r1)
            r0.<init>(r4)
            r13.i2(r1, r0)
            android.ext.Script$wrap r0 = new android.ext.Script$wrap
            java.lang.String r1 = "string.dump"
            java.lang.String r4 = "dump"
            luaj.LuaValue r6 = r13.T0(r4)
            r0.<init>(r12, r1, r6, r8)
            r13.i2(r4, r0)
            java.lang.String r13 = "io"
            luaj.LuaValue r13 = r14.T0(r13)
            android.ext.Script$wrap r0 = new android.ext.Script$wrap
            java.lang.String r1 = "open"
            luaj.LuaValue r4 = r13.T0(r1)
            r6 = 2
            java.lang.String r9 = "io.open"
            r0.<init>(r12, r9, r4, r6)
            r13.i2(r1, r0)
            android.ext.Script$wrap r0 = new android.ext.Script$wrap
            java.lang.String r1 = "io.input"
            java.lang.String r4 = "input"
            luaj.LuaValue r6 = r13.T0(r4)
            r0.<init>(r12, r1, r6, r8)
            r13.i2(r4, r0)
            android.ext.Script$wrap r0 = new android.ext.Script$wrap
            java.lang.String r1 = "io.output"
            java.lang.String r4 = "output"
            luaj.LuaValue r6 = r13.T0(r4)
            r0.<init>(r12, r1, r6, r8)
            r13.i2(r4, r0)
            android.ext.Script$wrap r0 = new android.ext.Script$wrap
            java.lang.String r1 = "io.tmpfile"
            java.lang.String r4 = "tmpfile"
            luaj.LuaValue r6 = r13.T0(r4)
            r0.<init>(r12, r1, r6, r7)
            r13.i2(r4, r0)
            android.ext.Script$wrap r0 = new android.ext.Script$wrap
            java.lang.String r1 = "io.lines"
            java.lang.String r4 = "lines"
            luaj.LuaValue r6 = r13.T0(r4)
            r0.<init>(r12, r1, r6, r8)
            r13.i2(r4, r0)
            java.lang.String r13 = "debug"
            luaj.LuaValue r14 = r14.T0(r13)
            android.ext.Script$wrap r0 = new android.ext.Script$wrap
            luaj.LuaValue r1 = r14.T0(r13)
            java.lang.String r4 = "debug.debug"
            r0.<init>(r12, r4, r1, r7)
            r14.i2(r13, r0)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "debug.gethook"
            java.lang.String r1 = "gethook"
            luaj.LuaValue r4 = r14.T0(r1)
            r13.<init>(r12, r0, r4, r8)
            r14.i2(r1, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "debug.getinfo"
            java.lang.String r1 = "getinfo"
            luaj.LuaValue r4 = r14.T0(r1)
            r6 = 3
            r13.<init>(r12, r0, r4, r6)
            r14.i2(r1, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "getlocal"
            luaj.LuaValue r0 = r14.T0(r0)
            r1 = 3
            java.lang.String r4 = "debug.getlocal"
            r13.<init>(r12, r4, r0, r1)
            java.lang.String r0 = "getlocal"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "getmetatable"
            luaj.LuaValue r0 = r14.T0(r0)
            java.lang.String r1 = "debug.getmetatable"
            r13.<init>(r12, r1, r0, r8)
            java.lang.String r0 = "getmetatable"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "getregistry"
            luaj.LuaValue r0 = r14.T0(r0)
            java.lang.String r1 = "debug.getregistry"
            r13.<init>(r12, r1, r0, r7)
            java.lang.String r0 = "getregistry"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "getupvalue"
            luaj.LuaValue r0 = r14.T0(r0)
            r1 = 2
            java.lang.String r4 = "debug.getupvalue"
            r13.<init>(r12, r4, r0, r1)
            java.lang.String r0 = "getupvalue"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "getuservalue"
            luaj.LuaValue r0 = r14.T0(r0)
            java.lang.String r1 = "debug.getuservalue"
            r13.<init>(r12, r1, r0, r8)
            java.lang.String r0 = "getuservalue"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "sethook"
            luaj.LuaValue r0 = r14.T0(r0)
            java.lang.String r1 = "debug.sethook"
            r13.<init>(r12, r1, r0, r3)
            java.lang.String r0 = "sethook"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "setlocal"
            luaj.LuaValue r0 = r14.T0(r0)
            java.lang.String r1 = "debug.setlocal"
            r13.<init>(r12, r1, r0, r3)
            java.lang.String r0 = "setlocal"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "setmetatable"
            luaj.LuaValue r0 = r14.T0(r0)
            r1 = 2
            java.lang.String r4 = "debug.setmetatable"
            r13.<init>(r12, r4, r0, r1)
            java.lang.String r0 = "setmetatable"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "setupvalue"
            luaj.LuaValue r0 = r14.T0(r0)
            r1 = 3
            java.lang.String r4 = "debug.setupvalue"
            r13.<init>(r12, r4, r0, r1)
            java.lang.String r0 = "setupvalue"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "setuservalue"
            luaj.LuaValue r0 = r14.T0(r0)
            r1 = 2
            java.lang.String r4 = "debug.setuservalue"
            r13.<init>(r12, r4, r0, r1)
            java.lang.String r0 = "setuservalue"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "traceback"
            luaj.LuaValue r0 = r14.T0(r0)
            r1 = 3
            java.lang.String r4 = "debug.traceback"
            r13.<init>(r12, r4, r0, r1)
            java.lang.String r0 = "traceback"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "upvalueid"
            luaj.LuaValue r0 = r14.T0(r0)
            r1 = 2
            java.lang.String r4 = "debug.upvalueid"
            r13.<init>(r12, r4, r0, r1)
            java.lang.String r0 = "upvalueid"
            r14.i2(r0, r13)
            android.ext.Script$wrap r13 = new android.ext.Script$wrap
            java.lang.String r0 = "upvaluejoin"
            luaj.LuaValue r0 = r14.T0(r0)
            java.lang.String r1 = "debug.upvaluejoin"
            r13.<init>(r12, r1, r0, r3)
            java.lang.String r0 = "upvaluejoin"
            r14.i2(r0, r13)
            if (r2 == 0) goto L5f6
            android.ext.Script$Consts r13 = p3(r2)
            goto L5fb
        L5f6:
            android.ext.Script$Consts r13 = new android.ext.Script$Consts
            r13.<init>()
        L5fb:
            r12.g0 = r13
            return r5
    }

    void k3() {
            r1 = this;
            byte r0 = r1.Z
            l3(r0)
            return
    }

    @Override // luaj.lib.e
    public boolean m(java.lang.String r3, boolean r4) {
            r2 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            java.lang.String r3 = s3(r0)
            java.lang.String r0 = r2.i0
            if (r0 != 0) goto L17
            java.io.File r0 = android.ext.Tools.q0()
            java.lang.String r0 = s3(r0)
            r2.i0 = r0
        L17:
            boolean r0 = A3(r3, r0)
            r1 = 1
            if (r0 == 0) goto L1f
            return r1
        L1f:
            java.lang.String r0 = r2.j0
            if (r0 != 0) goto L2d
            java.io.File r0 = android.ext.Tools.c0()
            java.lang.String r0 = s3(r0)
            r2.j0 = r0
        L2d:
            boolean r0 = A3(r3, r0)
            if (r0 == 0) goto L34
            return r1
        L34:
            java.lang.String r0 = r2.k0
            if (r0 != 0) goto L44
            java.lang.String r0 = android.ext.MainService.G0
            java.io.File r0 = android.ext.x2.g(r0)
            java.lang.String r0 = s3(r0)
            r2.k0 = r0
        L44:
            boolean r0 = A3(r0, r3)
            if (r0 == 0) goto L4b
            return r1
        L4b:
            if (r4 != 0) goto L65
            java.lang.Object r4 = r2.U
            boolean r0 = r4 instanceof java.io.File
            if (r0 != 0) goto L54
            goto L65
        L54:
            java.lang.String r0 = r2.h0
            if (r0 != 0) goto L60
            java.io.File r4 = (java.io.File) r4
            java.lang.String r0 = s3(r4)
            r2.h0 = r0
        L60:
            boolean r3 = A3(r0, r3)
            return r3
        L65:
            r3 = 0
            return r3
    }

    byte t3() {
            r2 = this;
            int r0 = r2.a0
            int r1 = r0 + 1
            r2.a0 = r1
            int r0 = r0 % 20
            byte r0 = (byte) r0
            r2.b0 = r0
            byte r1 = r2.Z
            int r1 = r1 * 20
            int r0 = r0 + r1
            int r0 = r0 + 20
            byte r0 = (byte) r0
            return r0
    }

    public android.ext.Script w3() {
            r1 = this;
            r0 = 1
            android.ext.Script r0 = r1.x3(r0)
            return r0
    }

    public android.ext.Script x3(int r1) {
            r0 = this;
            r0.f0 = r1
            java.lang.Thread r1 = r0.V
            r1.interrupt()
            return r0
    }

    void y3() {
            r1 = this;
            r0 = 0
            r1.c0 = r0
            byte r0 = r1.d0
            byte r0 = J3(r0)
            r1.d0 = r0
            return
    }

    boolean z3(java.io.File r6) {
            r5 = this;
            boolean r0 = r6.exists()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> L3c
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.io.IOException -> L3c
            r2.<init>(r6)     // Catch: java.io.IOException -> L3c
            r0.<init>(r2)     // Catch: java.io.IOException -> L3c
            r6 = 0
        L13:
            java.lang.String r2 = r0.readLine()     // Catch: java.io.IOException -> L3c
            r3 = 1
            if (r2 == 0) goto L3e
            java.lang.String r2 = r2.trim()     // Catch: java.io.IOException -> L3c
            int r4 = r2.length()     // Catch: java.io.IOException -> L3c
            if (r4 != 0) goto L25
            goto L13
        L25:
            if (r6 != 0) goto L2c
            java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L3e
            r6 = 1
            goto L13
        L2c:
            java.lang.String r4 = "\\|"
            java.lang.String[] r2 = r2.split(r4)     // Catch: java.io.IOException -> L3c
            int r2 = r2.length     // Catch: java.io.IOException -> L3c
            r4 = 10
            if (r2 >= r4) goto L39
            int r6 = -r6
            goto L3e
        L39:
            int r6 = r6 + 1
            goto L13
        L3c:
            r6 = move-exception
            goto L45
        L3e:
            r0.close()     // Catch: java.io.IOException -> L3c
            if (r6 <= r3) goto L44
            r1 = 1
        L44:
            return r1
        L45:
            java.lang.String r0 = "Failed detect"
            android.ext.e1.g(r0, r6)
            return r1
    }
}
