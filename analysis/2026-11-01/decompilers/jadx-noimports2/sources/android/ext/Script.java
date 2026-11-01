package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class Script extends luaj.lib.TwoArgFunction implements luaj.lib.e {
    private static volatile int n0;
    private static java.lang.ref.WeakReference o0 = new java.lang.ref.WeakReference(null);
    static volatile java.util.ArrayList p0 = null;
    static volatile int q0 = 0;
    static final java.util.Map r0 = new java.util.HashMap();
    static volatile long s0 = 0;
    static final luaj.LuaString[] t0 = {luaj.LuaString.K2("address"), luaj.LuaString.K2("value"), luaj.LuaString.K2("flags"), luaj.LuaString.K2("name"), luaj.LuaString.K2("freeze"), luaj.LuaString.K2("freezeType"), luaj.LuaString.K2("freezeFrom"), luaj.LuaString.K2("freezeTo")};
    static final int[] u0 = new int[3];
    static final int[] v0 = new int[8];
    static android.ext.Script.DebugLog w0;
    final java.lang.Object U;
    final int X;
    final java.lang.String Y;
    private final byte Z;
    android.ext.Script.Consts g0;
    private java.lang.String h0;
    private java.lang.String i0;
    private java.lang.String j0;
    private java.lang.String k0;
    volatile java.lang.String l0;
    volatile android.ext.Script.SavedState m0;
    private volatile int a0 = 0;
    private volatile byte b0 = -1;
    volatile boolean c0 = true;
    byte d0 = 0;
    boolean e0 = false;
    volatile int f0 = 0;
    final luaj.Globals T = new luaj.Globals();
    final java.lang.Thread V = new android.ext.Script.ScriptThread();
    final android.ext.Script.Logger W = new android.ext.Script.Logger();

    public static abstract class ApiFunction extends luaj.lib.VarArgFunction {
        static java.lang.ref.WeakReference Y = new java.lang.ref.WeakReference(null);
        static java.lang.ref.WeakReference Z = new java.lang.ref.WeakReference(null);
        private static java.util.Map a0 = null;
        private static java.util.Map b0 = null;
        private static java.util.Map c0 = null;
        private static java.util.Map d0 = null;
        private java.lang.String X;
        private final boolean W = this instanceof android.ext.Script.BusyApiFunction;
        private volatile luaj.Varargs T = null;
        private volatile java.lang.Throwable U = null;
        protected volatile java.lang.Object V = new java.lang.Object();

        private static java.util.Map X2(int i) {
            java.util.HashMap map = new java.util.HashMap();
            for (int i2 = 0; i2 < 8; i2++) {
                if (((1 << i2) & i) != 0) {
                    map.put(android.ext.Script.t0[i2], luaj.LuaValue.f1673c);
                }
            }
            return map;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0064  */
        static boolean e3(android.ext.Script.ApiFunction apiFunction, java.io.Writer writer, int i, luaj.LuaValue luaValue) throws java.io.IOException {
            java.util.Map mapX2;
            if (luaValue instanceof luaj.LuaString) {
                return android.ext.Script.Consts.d(writer, luaValue.g0());
            }
            if (luaValue instanceof luaj.LuaTable) {
                if (apiFunction == null || i != 1) {
                    mapX2 = null;
                } else if ((apiFunction instanceof android.ext.Script.removeResults) || (apiFunction instanceof android.ext.Script.loadResults) || (apiFunction instanceof android.ext.Script.getValues)) {
                    mapX2 = a0;
                    if (mapX2 == null) {
                        mapX2 = X2(5);
                        a0 = mapX2;
                    }
                } else if (apiFunction instanceof android.ext.Script.setValues) {
                    mapX2 = b0;
                    if (mapX2 == null) {
                        mapX2 = X2(7);
                        b0 = mapX2;
                    }
                } else if ((apiFunction instanceof android.ext.Script.getValuesRange) || (apiFunction instanceof android.ext.Script.removeListItems)) {
                    mapX2 = c0;
                    if (mapX2 == null) {
                        mapX2 = X2(1);
                        c0 = mapX2;
                    }
                } else if (apiFunction instanceof android.ext.Script.addListItems) {
                    mapX2 = d0;
                    if (mapX2 == null) {
                        mapX2 = X2(255);
                        d0 = mapX2;
                    }
                } else {
                    mapX2 = null;
                }
                ((luaj.LuaTable) luaValue).E3(writer, mapX2);
            } else {
                writer.write(luaValue.g0());
            }
            return true;
        }

        private void f3(java.io.Writer writer, luaj.Varargs varargs) throws java.io.IOException {
            int iU = varargs.U();
            int iY2 = Y2();
            if (iY2 >= 0 && iU > iY2) {
                iU = iY2;
            }
            for (int i = 1; i <= iU; i++) {
                if (i != 1) {
                    writer.write(", ");
                }
                if (!d3(writer, i, varargs.v(i))) {
                    return;
                }
            }
        }

        protected static boolean g3(java.io.Writer writer, android.ext.Script.Const[] constArr, luaj.LuaValue luaValue) {
            return android.ext.Script.Consts.a(writer, constArr, luaValue.y2());
        }

        protected static boolean h3(java.io.Writer writer, luaj.LuaValue luaValue) {
            return android.ext.Script.Consts.b(writer, luaValue.z2());
        }

        @Override // luaj.LuaFunction
        public java.lang.String T2() {
            java.lang.String str = this.X;
            if (str != null) {
                return str;
            }
            java.lang.String strT2 = super.T2();
            this.X = strT2;
            return strT2;
        }

        protected abstract int Y2();

        protected java.lang.String Z2() {
            return null;
        }

        protected luaj.Varargs a3() {
            return luaj.LuaValue.f1674d;
        }

        public luaj.Varargs b3(final luaj.Varargs varargs) {
            this.T = null;
            this.U = null;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: android.ext.Script.ApiFunction.1
                @Override // java.lang.Runnable
                public void run() {
                    android.ext.Script.ApiFunction.this.j3(varargs);
                }
            };
            synchronized (this.V) {
                android.ext.n2.i(runnable);
                android.ext.Script.W3(this.V);
            }
            java.lang.Throwable th = this.U;
            this.U = null;
            if (th != null) {
                this.T = null;
                if (th instanceof java.lang.RuntimeException) {
                    throw ((java.lang.RuntimeException) th);
                }
                throw new java.lang.RuntimeException(th);
            }
            luaj.Varargs varargs2 = this.T;
            this.T = null;
            if (!this.W || varargs2 != null) {
                return varargs2;
            }
            java.lang.String strZ2 = Z2();
            return strZ2 == null ? a3() : luaj.LuaValue.K2(strZ2);
        }

        public luaj.Varargs c3(luaj.Varargs varargs) {
            return luaj.LuaValue.f1673c;
        }

        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            return e3(this, writer, i, luaValue);
        }

        @Override // luaj.lib.LibFunction, luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
        public java.lang.String g0() {
            java.lang.String strK3 = k3();
            java.lang.String strReplace = strK3.replace("[", "").replace("]", "").replace(" ,", ",");
            java.util.regex.Pattern pattern = (java.util.regex.Pattern) Y.get();
            if (pattern == null) {
                java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(".*(\\(.*\\)).*");
                Y = new java.lang.ref.WeakReference(patternCompile);
                pattern = patternCompile;
            }
            java.lang.String strReplaceAll = pattern.matcher(strReplace).replaceAll("$1");
            java.util.regex.Pattern pattern2 = (java.util.regex.Pattern) Z.get();
            if (pattern2 == null) {
                java.util.regex.Pattern patternCompile2 = java.util.regex.Pattern.compile("(?<=[\\(,])( ?)\\s*\\S*\\s*(\\S*)(\\s*=\\s*[^,\\)]*)?(?=[,\\)])");
                Z = new java.lang.ref.WeakReference(patternCompile2);
                pattern2 = patternCompile2;
            }
            return "function " + pattern2.matcher(strReplaceAll).replaceAll("$1$2") + " end, -- " + strK3;
        }

        protected void i3(java.io.Writer writer, luaj.Varargs varargs) throws java.io.IOException {
            if ((this instanceof android.ext.Script.isVisible) || (this instanceof android.ext.Script.internal1) || (this instanceof android.ext.Script.internal2) || (this instanceof android.ext.Script.sleep)) {
                return;
            }
            writer.write(T2());
            writer.write("(");
            f3(writer, varargs);
            writer.write(")\n");
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public final luaj.Varargs invoke(luaj.Varargs varargs) {
            java.lang.ThreadLocal threadLocal = luaj.Varargs.f1678a;
            luaj.lib.VarArgFunction varArgFunction = (luaj.lib.VarArgFunction) threadLocal.get();
            threadLocal.set(this);
            try {
                luaj.LuaValue luaValueW = varargs.w();
                if ((luaValueW instanceof luaj.LuaString) && luaValueW.W1() > 1000000) {
                    varargs = luaj.LuaValue.N2(luaValueW.G0().j3(0, 1000000), varargs.e0(2));
                }
                android.ext.Script.DebugLog debugLog = android.ext.Script.w0;
                if (debugLog != null) {
                    long jNanoTime = java.lang.System.nanoTime();
                    try {
                        i3(debugLog.f378a, varargs);
                    } catch (java.lang.Throwable th) {
                        android.ext.e1.s("Failed write log for " + T2(), th);
                    }
                    luaj.Globals globals = debugLog.f379b;
                    globals.b0 = (int) (((long) globals.b0) + ((java.lang.System.nanoTime() - jNanoTime) / 1000000));
                }
                luaj.Varargs varargsB3 = b3(varargs);
                if (((this instanceof android.ext.Script.alert) || (this instanceof android.ext.Script.prompt) || (this instanceof android.ext.Script.choice) || (this instanceof android.ext.Script.multiChoice)) && debugLog != null) {
                    long jNanoTime2 = java.lang.System.nanoTime();
                    try {
                        java.io.Writer writer = debugLog.f378a;
                        writer.write("--[[ return: ");
                        writer.write(varargsB3 == null ? "null" : varargsB3.toString());
                        writer.write(" ]]\n");
                    } catch (java.lang.Throwable th2) {
                        android.ext.e1.s("Failed log for " + T2(), th2);
                    }
                    luaj.Globals globals2 = debugLog.f379b;
                    globals2.b0 = (int) (((long) globals2.b0) + ((java.lang.System.nanoTime() - jNanoTime2) / 1000000));
                }
                if ((this instanceof android.ext.Script.getResults) && (varargsB3 instanceof luaj.LuaTable) && debugLog != null) {
                    long jNanoTime3 = java.lang.System.nanoTime();
                    try {
                        java.io.Writer writer2 = debugLog.f378a;
                        writer2.write("--[[ count: ");
                        writer2.write(java.lang.Integer.toString(((luaj.LuaTable) varargsB3).W1()));
                        writer2.write(" ]]\n");
                    } catch (java.lang.Throwable th3) {
                        android.ext.e1.s("Failed log for " + T2(), th3);
                    }
                    luaj.Globals globals3 = debugLog.f379b;
                    globals3.b0 = (int) (((long) globals3.b0) + ((java.lang.System.nanoTime() - jNanoTime3) / 1000000));
                }
                if (varargsB3 == luaj.LuaValue.f1674d && (((this instanceof android.ext.Script.searchNumber) || (this instanceof android.ext.Script.refineNumber) || (this instanceof android.ext.Script.startFuzzy) || (this instanceof android.ext.Script.searchFuzzy) || (this instanceof android.ext.Script.searchAddress) || (this instanceof android.ext.Script.refineAddress)) && debugLog != null)) {
                    long jNanoTime4 = java.lang.System.nanoTime();
                    try {
                        java.io.Writer writer3 = debugLog.f378a;
                        writer3.write("--[[ found: ");
                        writer3.write(java.lang.Long.toString(android.ext.MainService.instance.p0));
                        writer3.write(" ]]\n");
                    } catch (java.lang.Throwable th4) {
                        android.ext.e1.s("Failed log for " + T2(), th4);
                    }
                    luaj.Globals globals4 = debugLog.f379b;
                    globals4.b0 = (int) (((long) globals4.b0) + ((java.lang.System.nanoTime() - jNanoTime4) / 1000000));
                }
                threadLocal.set(varArgFunction);
                return varargsB3;
            } catch (java.lang.Throwable th5) {
                threadLocal.set(varArgFunction);
                throw th5;
            }
        }

        public void j3(luaj.Varargs varargs) {
            luaj.Varargs varargsC3;
            java.lang.Throwable th = null;
            try {
                varargsC3 = c3(varargs);
                try {
                    this.T = varargsC3;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    this.U = th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                varargsC3 = null;
            }
            if (this.W && varargsC3 == null && th == null) {
                return;
            }
            synchronized (this.V) {
                this.V.notifyAll();
            }
        }

        abstract java.lang.String k3();
    }

    abstract class BusyApiFunction extends android.ext.Script.ApiFunction {
        public BusyApiFunction() {
            this.V = android.ext.Script.this;
        }

        @Override // android.ext.Script.ApiFunction
        protected java.lang.String Z2() {
            return android.ext.Script.this.l0;
        }
    }

    static class Const {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f370b;

        public Const(java.lang.String str, int i) {
            this.f369a = str;
            this.f370b = i;
        }
    }

    static class Consts {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.ext.Script.Const[] f371a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.ext.Script.Const[] f372b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.ext.Script.Const[] f373c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        android.ext.Script.Const[] f374d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        android.ext.Script.Const[] f375e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        android.ext.Script.Const[] f376f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        android.ext.Script.Const[] f377g = null;
        android.ext.Script.Const[] h = null;
        android.ext.Script.Const[] i = null;
        android.ext.Script.Const[] j = null;

        Consts() {
        }

        static boolean a(java.io.Writer writer, android.ext.Script.Const[] constArr, int i) {
            try {
                boolean z = true;
                for (android.ext.Script.Const r5 : constArr) {
                    int i2 = r5.f370b;
                    if ((i & i2) == i2) {
                        writer.write(r5.f369a);
                        i &= ~i2;
                        if (i != 0) {
                            writer.write(" | ");
                        }
                        z = false;
                    }
                }
                if (z || i != 0) {
                    writer.write(java.lang.Integer.toString(i));
                }
                return true;
            } catch (java.io.IOException e2) {
                android.ext.e1.s("Writer fail", e2);
                return false;
            }
        }

        static boolean b(java.io.Writer writer, long j) {
            java.lang.String string;
            try {
                if (j == 0 || j == -1) {
                    string = java.lang.Long.toString(j);
                } else {
                    writer.write("0x");
                    string = java.lang.Long.toHexString(j);
                }
                writer.write(string);
                return true;
            } catch (java.io.IOException e2) {
                android.ext.e1.s("Writer fail", e2);
                return false;
            }
        }

        static boolean c(java.io.Writer writer, java.lang.String str) {
            return d(writer, android.ext.Script.E3(str));
        }

        static boolean d(java.io.Writer writer, java.lang.String str) {
            try {
                writer.write("\"");
                if (str.length() <= 65535) {
                    str = str.replace("\"", "\\\"");
                }
                writer.write(str);
                writer.write("\"");
                return true;
            } catch (java.io.IOException e2) {
                android.ext.e1.s("Writer fail", e2);
                return false;
            }
        }
    }

    public static abstract class DebugFunction extends android.ext.Script.ApiFunction {
        protected luaj.LuaClosure e0 = null;

        public void l3(luaj.LuaClosure luaClosure) {
            this.e0 = luaClosure;
        }
    }

    private static final class DebugLog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.io.Writer f378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final luaj.Globals f379b;

        DebugLog(java.io.Writer writer, luaj.Globals globals) {
            this.f378a = writer;
            this.f379b = globals;
        }
    }

    final class IoLibSafe extends luaj.lib.IoLib {
        private java.lang.String f0 = null;

        IoLibSafe() {
        }

        private luaj.lib.IoLib.File R3(char c2) throws java.io.IOException {
            java.io.File file = new java.io.File(android.ext.Tools.q0(), "empty.txt");
            file.createNewFile();
            luaj.lib.IoLib.File fileH3 = super.H3(file.getAbsolutePath(), c2);
            file.delete();
            return fileH3;
        }

        private java.lang.String S3() {
            java.lang.String str = this.f0;
            if (str != null) {
                return str;
            }
            java.lang.String strS3 = android.ext.Script.s3(new java.io.File(android.ext.Tools.q0(), "empty.txt"));
            this.f0 = strS3;
            return strS3;
        }

        @Override // luaj.lib.IoLib
        protected luaj.lib.IoLib.File H3(java.lang.String str, char c2) {
            java.lang.String strS3 = android.ext.Script.s3(this.Y.R3(str));
            if (android.ext.Script.this.m(strS3, c2 == 'r')) {
                return R3(c2);
            }
            try {
                return super.H3(strS3, c2);
            } catch (luaj.lib.IoLib.c unused) {
                return R3(c2);
            }
        }

        @Override // luaj.lib.IoLib
        protected boolean O3(java.io.File file, java.io.FileDescriptor fileDescriptor, boolean z) {
            if (android.ext.Script.s3(file).equals(S3())) {
                return true;
            }
            return super.O3(file, fileDescriptor, z);
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
            java.io.BufferedOutputStream bufferedOutputStream;
            java.io.FileInputStream fileInputStream;
            java.lang.Throwable th;
            java.lang.StringBuilder sb = null;
            try {
                java.io.File file = new java.io.File(android.ext.Tools.p0(), java.lang.System.currentTimeMillis() + ".tmp");
                file.createNewFile();
                bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
                try {
                    fileInputStream = new java.io.FileInputStream(file);
                    try {
                        file.delete();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        android.ext.e1.a(th);
                        sb = new java.lang.StringBuilder();
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                    th = th;
                    android.ext.e1.a(th);
                    sb = new java.lang.StringBuilder();
                    this.f382c = sb;
                    this.f380a = bufferedOutputStream;
                    this.f381b = fileInputStream;
                    this.f383d = 0;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
                fileInputStream = null;
            }
            this.f382c = sb;
            this.f380a = bufferedOutputStream;
            this.f381b = fileInputStream;
            this.f383d = 0;
        }

        public void a(java.lang.String str) {
            java.lang.StringBuilder sb = this.f382c;
            if (sb != null) {
                sb.append(str);
                return;
            }
            try {
                byte[] bytes = str.getBytes();
                this.f380a.write(bytes);
                this.f383d += bytes.length;
            } catch (java.lang.Throwable th) {
                android.ext.e1.a(th);
            }
        }

        public java.lang.String toString() {
            int i = this.f383d;
            if (i < 0) {
                return "must be called only once";
            }
            java.lang.StringBuilder sb = this.f382c;
            if (sb != null) {
                return sb.toString();
            }
            try {
                this.f383d = -1;
                this.f380a.close();
                int i2 = 262144;
                if (i > 262144) {
                    this.f381b.skip(i - 262144);
                } else {
                    i2 = i;
                }
                byte[] bArr = new byte[i2];
                int i3 = this.f381b.read(bArr);
                this.f381b.close();
                android.ext.e1.d("Log script size: read = " + i3 + "; used = " + i2 + "; full = " + i);
                return i3 > 0 ? new java.lang.String(bArr, 0, i3) : "";
            } catch (java.lang.Throwable th) {
                android.ext.e1.a(th);
                return "";
            }
        }
    }

    public static final class OsExit extends luaj.d {
        final int j;

        public OsExit(int i) {
            super("called os.exit(" + i + ')');
            this.j = i;
        }
    }

    final class OsLibSafe extends luaj.lib.OsLib {
        OsLibSafe() {
        }

        @Override // luaj.lib.OsLib
        protected void r3(java.lang.String str) {
            if (android.ext.Script.this.m(str, false)) {
                return;
            }
            super.r3(str);
        }

        @Override // luaj.lib.OsLib
        protected void s3(java.lang.String str, java.lang.String str2) {
            if (android.ext.Script.this.m(str, false) || android.ext.Script.this.m(str2, false)) {
                return;
            }
            super.s3(str, str2);
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

        PostWriteWorker(java.io.OutputStream outputStream, byte[] bArr, int i, int i2) {
            this.f384a = outputStream;
            this.f385b = bArr;
            this.f386c = i;
            this.f387d = i2;
        }

        void a(boolean z) throws java.io.IOException {
            try {
                this.f384a.close();
            } catch (java.lang.Throwable unused) {
            }
            try {
                join(5000L);
            } catch (java.lang.InterruptedException unused2) {
                java.lang.Thread.currentThread().interrupt();
            }
            java.lang.Throwable th = this.f388e;
            if (z || th == null) {
                return;
            }
            if (!(th instanceof java.lang.RuntimeException)) {
                throw new java.io.IOException(th);
            }
            throw ((java.lang.RuntimeException) th);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f384a.write(this.f385b, this.f386c, this.f387d);
                this.f384a.flush();
            } catch (java.lang.Throwable th) {
                this.f388e = th;
            }
        }
    }

    private static class SavedState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f389a;

        private SavedState() {
        }
    }

    class ScriptPrintStream extends b.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f390f;

        public ScriptPrintStream(boolean z) {
            this.f390f = z;
        }

        @Override // b.a
        protected void b(java.lang.String str) {
            android.ext.Script.this.a3(this.f390f, str);
            java.lang.String str2 = "script: " + str;
            if (this.f390f) {
                android.ext.e1.i(str2);
            } else {
                android.ext.e1.d(str2);
            }
        }
    }

    class ScriptThread extends java.lang.Thread {
        public ScriptThread() {
            super("Script thread");
            android.ext.n0.g(this);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e2 A[Catch: all -> 0x0073, OutOfMemoryError -> 0x00fb, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0102  */
        /* JADX WARN: Code duplicated, block: B:42:0x0104 A[Catch: all -> 0x0073, OutOfMemoryError -> 0x00fb, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0118  */
        /* JADX WARN: Code duplicated, block: B:50:0x0121 A[Catch: all -> 0x0073, OutOfMemoryError -> 0x00fb, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x012e A[Catch: all -> 0x0073, OutOfMemoryError -> 0x00fb, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x014e A[Catch: all -> 0x0073, OutOfMemoryError -> 0x00fb, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0184 A[PHI: r7
          0x0184: PHI (r7v12 java.lang.String) = (r7v11 java.lang.String), (r7v18 java.lang.String), (r7v18 java.lang.String), (r7v18 java.lang.String) binds: [B:63:0x0171, B:56:0x014c, B:58:0x0158, B:60:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:67:0x018d A[Catch: all -> 0x0073, OutOfMemoryError -> 0x019a, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x01e1  */
        /* JADX WARN: Code duplicated, block: B:78:0x01ea A[Catch: all -> 0x0073, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
        /* JADX WARN: Code duplicated, block: B:80:0x01f2 A[Catch: all -> 0x0073, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
        /* JADX WARN: Code duplicated, block: B:83:0x022c A[Catch: all -> 0x0073, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x023b  */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            java.lang.String str;
            int i;
            android.ext.Script script;
            luaj.Globals globals;
            final java.lang.String strF;
            final android.content.DialogInterface.OnClickListener onClickListener;
            int i2;
            java.lang.String strN;
            java.lang.String message;
            java.lang.Object obj;
            java.lang.String strC;
            int i3;
            java.lang.Object obj2;
            android.ext.MainService mainService = android.ext.MainService.instance;
            try {
                mainService.n0(android.ext.Script.this);
                android.ext.f1.f951a.booleanValue();
                android.ext.Script.this.N3();
                try {
                    android.ext.Script.this.M3();
                } catch (android.ext.Script.OsExit e2) {
                    android.ext.e1.i("Script interrupted by self: " + e2.getMessage());
                    android.ext.Script script2 = android.ext.Script.this;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_exit));
                    if (e2.j == 0) {
                        str = ".";
                    } else {
                        str = ": " + e2.j;
                    }
                    sb.append(str);
                    script2.Z2(sb.toString());
                } catch (luaj.d e3) {
                    e = e3;
                    java.lang.Throwable cause = e.getCause();
                    if ((cause instanceof java.lang.InterruptedException) && android.ext.Script.this.f0 != 0) {
                        android.ext.e1.l("Script thread interrupted: " + android.ext.Script.this.f0, cause);
                        android.ext.Script.this.Z2(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_interrupted) + " [" + android.ext.Script.this.f0 + "]");
                    } else if (e instanceof luaj.d.a) {
                        android.ext.n0.h(java.lang.Thread.currentThread(), e, false);
                    }
                    if (e != null) {
                        try {
                            android.ext.e1.l("Script error", e);
                            strN = android.ext.e1.n(e);
                            message = e.getMessage();
                            if (message != null) {
                                strN = message + '\n' + strN;
                            }
                            if (e instanceof luaj.d) {
                                if (message == null) {
                                    i3 = 0;
                                } else {
                                    i3 = 0;
                                }
                                android.ext.Script script3 = android.ext.Script.this;
                                obj2 = script3.U;
                                if (obj2 instanceof java.io.File) {
                                    i3 = catch_.me_.if_.you_.can_.R.string.script_saved_list;
                                }
                                if (i3 != 0) {
                                    android.ext.Script.this.Z2(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_possible), android.ext.b2.f(i3)));
                                }
                            }
                            obj = android.ext.Script.this.U;
                            if (obj instanceof java.io.File) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                            }
                        } catch (java.lang.OutOfMemoryError e4) {
                            try {
                                strN = e4.toString() + '\n';
                            } catch (java.lang.OutOfMemoryError e5) {
                                e = e5;
                                i2 = 0;
                                android.ext.Script.this.Z2(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script_oom) + ": " + e.toString());
                                i = i2;
                                script = android.ext.Script.this;
                                globals = script.T;
                                if (globals.Y == 0) {
                                    script.Z2(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_wrote), android.ext.Tools.U(android.ext.Tools.f0(), android.ext.Script.this.T.a0), java.lang.Integer.valueOf(android.ext.Script.this.T.Y)));
                                } else {
                                    script.Z2(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_wrote), android.ext.Tools.U(android.ext.Tools.f0(), android.ext.Script.this.T.a0), java.lang.Integer.valueOf(android.ext.Script.this.T.Y)));
                                }
                                android.ext.Script.this.L3();
                                if (android.ext.Script.this.U instanceof java.io.File) {
                                    strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.restart);
                                    onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: android.ext.Script.ScriptThread.1
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public void onClick(android.content.DialogInterface dialogInterface, int i4) {
                                            java.io.File file = (java.io.File) android.ext.Script.this.U;
                                            if (android.ext.Tools.a1(file)) {
                                                android.ext.MainService mainService2 = android.ext.MainService.instance;
                                                java.lang.String absolutePath = file.getAbsolutePath();
                                                android.ext.Script script4 = android.ext.Script.this;
                                                mainService2.x(absolutePath, script4.X, script4.Y);
                                            }
                                        }
                                    };
                                } else {
                                    strF = null;
                                    onClickListener = null;
                                }
                                final java.lang.String str2 = android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script_ended) + ":\n" + android.ext.Script.this.W.toString().trim();
                                final int i4 = i;
                                mainService.d1(new java.lang.Runnable() { // from class: android.ext.Script.ScriptThread.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        android.ext.Tools.i(str2, i4, strF, onClickListener);
                                    }
                                });
                                android.ext.Script.this.k3();
                                mainService.m0(android.ext.Script.this);
                            }
                        }
                        try {
                            if (android.ext.f1.f951a.booleanValue()) {
                                android.ext.Script.this.Z2(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.try_latest));
                            }
                            android.ext.Script.this.Z2(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script_error) + ": " + strN);
                        } catch (java.lang.OutOfMemoryError e6) {
                            e = e6;
                            android.ext.Script.this.Z2(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script_oom) + ": " + e.toString());
                        }
                        i = i2;
                    } else {
                        i = 0;
                    }
                    script = android.ext.Script.this;
                    globals = script.T;
                    if (globals.Y == 0) {
                        script.Z2(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_wrote), android.ext.Tools.U(android.ext.Tools.f0(), android.ext.Script.this.T.a0), java.lang.Integer.valueOf(android.ext.Script.this.T.Y)));
                    } else {
                        script.Z2(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_wrote), android.ext.Tools.U(android.ext.Tools.f0(), android.ext.Script.this.T.a0), java.lang.Integer.valueOf(android.ext.Script.this.T.Y)));
                    }
                    android.ext.Script.this.L3();
                    if (android.ext.Script.this.U instanceof java.io.File) {
                        strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.restart);
                        onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: android.ext.Script.ScriptThread.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(android.content.DialogInterface dialogInterface, int i5) {
                                java.io.File file = (java.io.File) android.ext.Script.this.U;
                                if (android.ext.Tools.a1(file)) {
                                    android.ext.MainService mainService2 = android.ext.MainService.instance;
                                    java.lang.String absolutePath = file.getAbsolutePath();
                                    android.ext.Script script4 = android.ext.Script.this;
                                    mainService2.x(absolutePath, script4.X, script4.Y);
                                }
                            }
                        };
                    } else {
                        strF = null;
                        onClickListener = null;
                    }
                    final java.lang.String str3 = android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script_ended) + ":\n" + android.ext.Script.this.W.toString().trim();
                    final int i5 = i;
                    mainService.d1(new java.lang.Runnable() { // from class: android.ext.Script.ScriptThread.2
                        @Override // java.lang.Runnable
                        public void run() {
                            android.ext.Tools.i(str3, i5, strF, onClickListener);
                        }
                    });
                    android.ext.Script.this.k3();
                    mainService.m0(android.ext.Script.this);
                } catch (java.lang.Throwable th) {
                    e = th;
                    if (e != null) {
                        android.ext.e1.l("Script error", e);
                        strN = android.ext.e1.n(e);
                        message = e.getMessage();
                        if (message != null) {
                            strN = message + '\n' + strN;
                        }
                        if (e instanceof luaj.d) {
                            if (message == null) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                            }
                            android.ext.Script script4 = android.ext.Script.this;
                            obj2 = script4.U;
                            if (obj2 instanceof java.io.File) {
                                i3 = catch_.me_.if_.you_.can_.R.string.script_saved_list;
                            }
                            if (i3 != 0) {
                                android.ext.Script.this.Z2(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_possible), android.ext.b2.f(i3)));
                            }
                        }
                        obj = android.ext.Script.this.U;
                        if (obj instanceof java.io.File) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                        if (android.ext.f1.f951a.booleanValue()) {
                            android.ext.Script.this.Z2(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.try_latest));
                        }
                        android.ext.Script.this.Z2(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script_error) + ": " + strN);
                        i = i2;
                    } else {
                        i = 0;
                    }
                    script = android.ext.Script.this;
                    globals = script.T;
                    if (globals.Y == 0) {
                        script.Z2(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_wrote), android.ext.Tools.U(android.ext.Tools.f0(), android.ext.Script.this.T.a0), java.lang.Integer.valueOf(android.ext.Script.this.T.Y)));
                    } else {
                        script.Z2(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_wrote), android.ext.Tools.U(android.ext.Tools.f0(), android.ext.Script.this.T.a0), java.lang.Integer.valueOf(android.ext.Script.this.T.Y)));
                    }
                    android.ext.Script.this.L3();
                    if (android.ext.Script.this.U instanceof java.io.File) {
                        strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.restart);
                        onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: android.ext.Script.ScriptThread.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(android.content.DialogInterface dialogInterface, int i6) {
                                java.io.File file = (java.io.File) android.ext.Script.this.U;
                                if (android.ext.Tools.a1(file)) {
                                    android.ext.MainService mainService2 = android.ext.MainService.instance;
                                    java.lang.String absolutePath = file.getAbsolutePath();
                                    android.ext.Script script5 = android.ext.Script.this;
                                    mainService2.x(absolutePath, script5.X, script5.Y);
                                }
                            }
                        };
                    } else {
                        strF = null;
                        onClickListener = null;
                    }
                    final java.lang.String str4 = android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script_ended) + ":\n" + android.ext.Script.this.W.toString().trim();
                    final int i6 = i;
                    mainService.d1(new java.lang.Runnable() { // from class: android.ext.Script.ScriptThread.2
                        @Override // java.lang.Runnable
                        public void run() {
                            android.ext.Tools.i(str4, i6, strF, onClickListener);
                        }
                    });
                    android.ext.Script.this.k3();
                    mainService.m0(android.ext.Script.this);
                }
                e = null;
                if (e != null) {
                    android.ext.e1.l("Script error", e);
                    strN = android.ext.e1.n(e);
                    message = e.getMessage();
                    if (message != null && !strN.contains(message)) {
                        strN = message + '\n' + strN;
                    }
                    if (e instanceof luaj.d) {
                        if (message == null && (message.contains("<!DOCTYPE") || message.contains("<html"))) {
                            i3 = catch_.me_.if_.you_.can_.R.string.script_web;
                        } else {
                            i3 = 0;
                        }
                        android.ext.Script script5 = android.ext.Script.this;
                        obj2 = script5.U;
                        if ((obj2 instanceof java.io.File) && script5.z3((java.io.File) obj2)) {
                            i3 = catch_.me_.if_.you_.can_.R.string.script_saved_list;
                        }
                        if (i3 != 0) {
                            android.ext.Script.this.Z2(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_possible), android.ext.b2.f(i3)));
                        }
                    }
                    obj = android.ext.Script.this.U;
                    if ((obj instanceof java.io.File) || (strC = lasm.LasmBase.c(e, ((java.io.File) obj).getAbsolutePath(), true)) == null || strC.length() <= 0) {
                        i2 = 0;
                    } else {
                        strN = strC + strN;
                        i2 = 4;
                    }
                    if (android.ext.f1.f951a.booleanValue()) {
                        android.ext.Script.this.Z2(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.try_latest));
                    }
                    android.ext.Script.this.Z2(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script_error) + ": " + strN);
                    i = i2;
                } else {
                    i = 0;
                }
                script = android.ext.Script.this;
                globals = script.T;
                if (globals.Y == 0 || globals.a0 != 0) {
                    script.Z2(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_wrote), android.ext.Tools.U(android.ext.Tools.f0(), android.ext.Script.this.T.a0), java.lang.Integer.valueOf(android.ext.Script.this.T.Y)));
                }
                android.ext.Script.this.L3();
                if (android.ext.Script.this.U instanceof java.io.File) {
                    strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.restart);
                    onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: android.ext.Script.ScriptThread.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i7) {
                            java.io.File file = (java.io.File) android.ext.Script.this.U;
                            if (android.ext.Tools.a1(file)) {
                                android.ext.MainService mainService2 = android.ext.MainService.instance;
                                java.lang.String absolutePath = file.getAbsolutePath();
                                android.ext.Script script6 = android.ext.Script.this;
                                mainService2.x(absolutePath, script6.X, script6.Y);
                            }
                        }
                    };
                } else {
                    strF = null;
                    onClickListener = null;
                }
                final java.lang.String str5 = android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script_ended) + ":\n" + android.ext.Script.this.W.toString().trim();
                final int i7 = i;
                mainService.d1(new java.lang.Runnable() { // from class: android.ext.Script.ScriptThread.2
                    @Override // java.lang.Runnable
                    public void run() {
                        android.ext.Tools.i(str5, i7, strF, onClickListener);
                    }
                });
            } catch (java.lang.Throwable th2) {
                try {
                    android.ext.e1.l("Script run exception", th2);
                } catch (java.lang.Throwable th3) {
                    android.ext.Script.this.k3();
                    throw th3;
                }
            }
            android.ext.Script.this.k3();
            mainService.m0(android.ext.Script.this);
        }
    }

    final class addListItems extends android.ext.Script.ApiFunction {
        final java.util.ArrayList e0 = new java.util.ArrayList();
        luaj.LuaValue f0 = null;

        addListItems() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            luaj.Varargs varargsK2;
            java.util.ArrayList arrayList = this.e0;
            try {
                try {
                    arrayList.clear();
                    luaj.LuaTable luaTableI = varargs.I(1);
                    android.ext.z1.d dVar = android.ext.MainService.instance.v0;
                    boolean z = dVar != null ? dVar.n : false;
                    luaj.LuaTable.i iVarS3 = luaTableI.s3();
                    while (iVarS3.c()) {
                        luaj.LuaValue luaValueD = iVarS3.d();
                        try {
                            android.ext.h2 h2VarU3 = android.ext.Script.U3(luaValueD.H0(), z);
                            if (h2VarU3 != null) {
                                arrayList.add(h2VarU3);
                            }
                        } catch (java.lang.NumberFormatException e2) {
                            e = e2;
                            throw android.ext.Script.m3(iVarS3.b(), luaValueD, e);
                        } catch (luaj.d e3) {
                            e = e3;
                            throw android.ext.Script.m3(iVarS3.b(), luaValueD, e);
                        }
                    }
                    this.f0 = null;
                    final java.lang.Object obj = new java.lang.Object();
                    synchronized (obj) {
                        android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.addListItems.1
                            @Override // java.lang.Runnable
                            public void run() {
                                java.util.ArrayList<android.ext.h2> arrayList2 = android.ext.Script.addListItems.this.e0;
                                try {
                                    android.ext.SavedListAdapter savedListAdapter = android.ext.MainService.instance.t0;
                                    for (android.ext.h2 h2Var : arrayList2) {
                                        if (h2Var != null) {
                                            savedListAdapter.b(h2Var, (byte) 0, false);
                                        }
                                    }
                                    savedListAdapter.notifyDataSetChanged();
                                    savedListAdapter.i();
                                    android.ext.Script.addListItems.this.f0 = luaj.LuaValue.f1674d;
                                } catch (java.lang.Throwable th) {
                                    android.ext.e1.l("Failed add list items", th);
                                    android.ext.Script.addListItems.this.f0 = luaj.LuaValue.K2(android.ext.Script.V3(th));
                                }
                                synchronized (obj) {
                                    obj.notifyAll();
                                }
                            }
                        });
                        android.ext.Script.W3(obj);
                    }
                    varargsK2 = this.f0;
                } catch (java.lang.Throwable th) {
                    android.ext.e1.l("Failed add list items", th);
                    varargsK2 = luaj.LuaValue.K2(android.ext.Script.V3(th));
                }
                try {
                    arrayList.clear();
                    arrayList.trimToSize();
                } catch (java.lang.Throwable th2) {
                    android.ext.e1.a(th2);
                }
                this.f0 = null;
                return varargsK2;
            } catch (luaj.d e4) {
                throw e4;
            }
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.addListItems(table items) -> true || string with error";
        }
    }

    static final class alert extends android.ext.Script.ApiFunction implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener {
        private volatile int e0 = 0;

        alert() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            final java.lang.String strE = varargs.E(1);
            final java.lang.String strZ = varargs.Z(2, android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok));
            final java.lang.String strZ2 = varargs.Z(3, null);
            final java.lang.String strZ3 = varargs.Z(4, null);
            this.e0 = 0;
            synchronized (this) {
                android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.alert.1
                    @Override // java.lang.Runnable
                    public void run() {
                        android.app.AlertDialog.Builder positiveButton = android.ext.f.b().setCustomTitle(android.ext.Tools.h0(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script))).setMessage(android.ext.b2.g(strE)).setPositiveButton(android.ext.b2.g(strZ), android.ext.Script.alert.this);
                        java.lang.String str = strZ2;
                        if (str != null) {
                            positiveButton.setNegativeButton(android.ext.b2.g(str), android.ext.Script.alert.this);
                        }
                        java.lang.String str2 = strZ3;
                        if (str2 != null) {
                            positiveButton.setNeutralButton(android.ext.b2.g(str2), android.ext.Script.alert.this);
                        }
                        android.app.AlertDialog alertDialogCreate = positiveButton.create();
                        android.ext.f.k(alertDialogCreate, android.ext.Script.alert.this);
                        android.ext.f.m(alertDialogCreate);
                        android.ext.MainService.instance.y(true);
                    }
                });
                android.ext.Script.W3(this);
            }
            return luaj.LuaValue.I2(this.e0);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.alert(string text [, string positive = 'ok' [, string negative = nil [, string neutral = nil]]]) -> int: 0 = cancel, 1 = positive, 2 = negative, 3 = neutral";
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            this.e0 = -i;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            synchronized (this) {
                notify();
            }
            android.ext.MainService.instance.y(false);
        }
    }

    final class allocatePage extends android.ext.Script.BusyApiFunction {
        allocatePage() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        protected luaj.Varargs a3() {
            long j = android.ext.Script.s0;
            if (-1024 >= j || j > 0) {
                return luaj.LuaValue.I2(android.ext.Script.s0);
            }
            return luaj.LuaValue.K2(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.allocate_fail) + ' ' + (-j));
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            int iY = varargs.Y(1, 6);
            long jA0 = varargs.a0(2, 0L);
            android.ext.Script.s0 = 0L;
            android.ext.MainService.instance.i.f(android.ext.Script.this.t3(), jA0, iY);
            return null;
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            if (i != 1) {
                if (i == 2 && luaValue.j1()) {
                    return android.ext.Script.ApiFunction.h3(writer, luaValue);
                }
            } else if (luaValue.h1()) {
                return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f377g, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.allocatePage([int mode = gg.PROT_READ | gg.PROT_EXEC [, long address = 0]) -> long || string with error";
        }
    }

    final class bytes extends android.ext.Script.ApiFunction {
        bytes() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            try {
                byte[] bytes = varargs.E(1).getBytes(varargs.Z(2, "UTF-8"));
                luaj.LuaTable luaTable = new luaj.LuaTable();
                int length = bytes.length;
                luaTable.R1(length);
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    luaTable.Y1(i2, luaj.LuaValue.I2(bytes[i] & 255));
                    i = i2;
                }
                return luaTable;
            } catch (java.io.UnsupportedEncodingException e2) {
                throw new luaj.d(e2);
            }
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.bytes(string text [, string encoding = 'UTF-8']) -> table";
        }
    }

    static final class choice extends android.ext.Script.ApiFunction implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener {
        private volatile int e0 = 0;

        choice() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            java.lang.String str;
            luaj.LuaTable luaTableI = varargs.I(1);
            final luaj.LuaValue luaValueV = varargs.v(2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            luaj.LuaTable.i iVarS3 = luaTableI.s3();
            int i = 0;
            final int i2 = -1;
            while (iVarS3.c()) {
                luaj.LuaValue luaValueB = iVarS3.b();
                luaj.LuaValue luaValueD = iVarS3.d();
                if (luaValueB.P0(luaValueV)) {
                    i2 = i;
                }
                arrayList2.add(android.ext.b2.g(luaValueD.B0()));
                arrayList.add(luaValueB);
                i++;
            }
            java.lang.String strG = android.ext.b2.g(varargs.Z(3, ""));
            if (strG.length() > 0) {
                str = '\n' + strG;
            } else {
                str = null;
            }
            final java.lang.CharSequence[] charSequenceArr = (java.lang.CharSequence[]) arrayList2.toArray(new java.lang.CharSequence[arrayList2.size()]);
            this.e0 = -1;
            synchronized (this) {
                final java.lang.String str2 = str;
                android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.choice.1
                    @Override // java.lang.Runnable
                    public void run() {
                        android.app.AlertDialog.Builder negativeButton = android.ext.f.b().setCustomTitle(android.ext.Tools.i0(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script), str2)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), android.ext.Script.choice.this);
                        if (luaValueV.l1()) {
                            negativeButton.setItems(charSequenceArr, android.ext.Script.choice.this);
                        } else {
                            negativeButton.setSingleChoiceItems(charSequenceArr, i2, android.ext.Script.choice.this);
                        }
                        android.app.AlertDialog alertDialogCreate = negativeButton.create();
                        android.ext.f.k(alertDialogCreate, android.ext.Script.choice.this);
                        android.ext.f.m(alertDialogCreate);
                        android.ext.MainService.instance.y(true);
                    }
                });
                android.ext.Script.W3(this);
            }
            return this.e0 < 0 ? luaj.LuaValue.f1673c : (luaj.Varargs) arrayList.get(this.e0);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.choice(table items [, string selected = nil [, string message = nil]]) -> string || nil";
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            this.e0 = i;
            android.ext.Tools.D(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            synchronized (this) {
                notify();
            }
            android.ext.MainService.instance.y(false);
        }
    }

    final class clearList extends android.ext.Script.ApiFunction {
        clearList() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            try {
                android.ext.MainService.instance.t0.c();
                return luaj.LuaValue.f1674d;
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed clear list", th);
                return luaj.LuaValue.K2(android.ext.Script.V3(th));
            }
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.clearList() -> true || string with error";
        }
    }

    final class clearResults extends android.ext.Script.ApiFunction {
        clearResults() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.Script script = android.ext.Script.this;
            script.d0 = android.ext.Script.J3(script.d0);
            android.ext.MainService.instance.n(android.ext.Script.this.t3());
            return luaj.LuaValue.f1673c;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.clearResults() -> nil";
        }
    }

    final class copyMemory extends android.ext.Script.BusyApiFunction {
        copyMemory() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.MainService.instance.i.p(android.ext.Script.this.t3(), varargs.F(1), varargs.F(2), varargs.D(3));
            return null;
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            return ((i == 1 || i == 2) && luaValue.j1()) ? android.ext.Script.ApiFunction.h3(writer, luaValue) : super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.copyMemory(long from, long to, int bytes) -> true || string with error";
        }
    }

    static final class copyText extends android.ext.Script.ApiFunction {
        copyText() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            java.lang.String strE = varargs.E(1);
            if (varargs.V(2, true)) {
                strE = android.ext.Script.D3(strE);
            }
            android.ext.Tools.z(android.ext.b2.g(strE));
            return luaj.LuaValue.f1673c;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.copyText(string text [, bool fixLocale = true]) -> nil";
        }
    }

    final class disasm extends android.ext.Script.ApiFunction {
        disasm() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            long jF = varargs.F(2);
            int iD = varargs.D(3);
            int iD2 = varargs.D(1);
            if (iD2 == 4) {
                return luaj.LuaString.K2(android.ext.n.o(new android.ext.n(), jF, iD));
            }
            if (iD2 == 5) {
                return luaj.LuaString.K2(android.ext.n.q(new android.ext.n(), jF, iD));
            }
            if (iD2 == 6) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                android.ext.m.g(android.ext.m.d(), jF, iD, sb);
                return luaj.LuaString.K2(sb.toString());
            }
            return luaj.LuaValue.l0(1, "gg.disasm", "unknown type: " + varargs.D(1));
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            if (i != 1) {
                if ((i == 2 || i == 3) && luaValue.j1()) {
                    return android.ext.Script.ApiFunction.h3(writer, luaValue);
                }
            } else if (luaValue.h1()) {
                return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.j, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.disasm(int type, long address, int opcode) -> string";
        }
    }

    final class dumpMemory extends android.ext.Script.BusyApiFunction {
        dumpMemory() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.MainService mainService = android.ext.MainService.instance;
            android.ext.z1.d dVar = mainService.v0;
            java.lang.String str = dVar == null ? "unknown" : dVar.f1434c;
            if (!mainService.a1()) {
                return luaj.LuaValue.K2(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.busy_dialog_fail));
            }
            mainService.i.w(android.ext.Script.this.t3(), varargs.F(1), varargs.F(2), varargs.Y(4, 0), varargs.E(3), str);
            return null;
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            if (i == 1 || i == 2) {
                if (luaValue.j1()) {
                    return android.ext.Script.ApiFunction.h3(writer, luaValue);
                }
            } else if (i == 4 && luaValue.h1()) {
                return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.i, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.dumpMemory(long from, long to, string dir [, int flags = nil]) -> true || string with error";
        }
    }

    final class editAll extends android.ext.Script.ApiFunction {
        editAll() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        /* JADX WARN: Code duplicated, block: B:131:0x023d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            char[] charArray;
            byte[] bArrH;
            java.lang.String[] strArr;
            android.ext.MainService mainService;
            final java.lang.Object obj;
            android.ext.MainService mainService2;
            int i;
            byte[] bArr;
            java.lang.String str;
            int i2;
            long j;
            int i3;
            long j2;
            long j3;
            if (!android.ext.Script.this.c0) {
                throw new luaj.d("You must call gg.getResults before calling gg.editAll.");
            }
            try {
                java.lang.String strD3 = android.ext.Script.D3(varargs.E(1));
                int iF3 = android.ext.Script.f3(varargs.D(2));
                int i4 = 0;
                android.ext.i2.c cVarX = android.ext.i2.x(strD3, false);
                int i5 = cVarX != null ? cVarX.f1018b : 0;
                if (cVarX != null) {
                    strD3 = cVarX.f1017a;
                }
                android.ext.MainService mainService3 = android.ext.MainService.instance;
                java.util.ArrayList arrayListS3 = android.ext.Script.S3(android.ext.Script.this.d0);
                if (arrayListS3 == null) {
                    android.ext.Script script = android.ext.Script.this;
                    if (!script.e0) {
                        script.e0 = true;
                        android.ext.e1.p("editAll: no reply capture for seq " + ((int) android.ext.Script.this.d0) + "; using the shared result list");
                    }
                }
                android.ext.t1.b bVarW = null;
                d.a aVar = arrayListS3 == null ? mainService3.s0 : null;
                int i6 = arrayListS3 == null ? aVar.i() : arrayListS3.size();
                if (iF3 == 1 && android.ext.t1.m(strD3)) {
                    charArray = null;
                    strArr = null;
                    bArrH = android.ext.t1.h(strD3);
                } else if ((iF3 & 6) != 0 && android.ext.t1.m(strD3) && strD3.charAt(0) == ';') {
                    bArrH = null;
                    strArr = null;
                    charArray = strD3.substring(1).toCharArray();
                } else if (strD3.indexOf(59) != -1) {
                    java.lang.String[] strArrSplit = strD3.split(";");
                    if (strArrSplit.length == 0) {
                        charArray = null;
                        bArrH = null;
                        strArr = null;
                    } else {
                        charArray = null;
                        bArrH = null;
                        strArr = strArrSplit;
                    }
                } else {
                    charArray = null;
                    bArrH = null;
                    strArr = null;
                }
                android.ext.c cVar = new android.ext.c();
                android.ext.t1.b[] bVarArr = strArr == null ? null : new android.ext.t1.b[strArr.length];
                long j4 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i4 < i6) {
                    if (arrayListS3 != null) {
                        try {
                            android.ext.c cVar2 = (android.ext.c) arrayListS3.get(i4);
                            if (cVar2 == null) {
                                mainService2 = mainService3;
                                arrayListS3 = arrayListS3;
                            } else {
                                mainService2 = mainService3;
                                try {
                                    cVar.f672a = cVar2.f672a;
                                    cVar.f674c = cVar2.f674c;
                                } catch (java.lang.IndexOutOfBoundsException e2) {
                                    e = e2;
                                    android.ext.e1.s("List changed", e);
                                    mainService = mainService2;
                                    mainService.i.C(android.ext.Script.this.t3());
                                    obj = new java.lang.Object();
                                    synchronized (obj) {
                                        android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.editAll.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                android.ext.MainService.instance.f0(android.ext.Script.this.t3());
                                                synchronized (obj) {
                                                    obj.notifyAll();
                                                }
                                            }
                                        });
                                        android.ext.Script.W3(obj);
                                        return luaj.LuaValue.I2(i8);
                                    }
                                }
                            }
                            str = strD3;
                            charArray = charArray;
                            bArr = bArrH;
                            i = i6;
                            strArr = strArr;
                            i4++;
                            strArr = strArr;
                            strD3 = str;
                            mainService3 = mainService2;
                            arrayListS3 = arrayListS3;
                            charArray = charArray;
                            bArrH = bArr;
                            i6 = i;
                        } catch (java.lang.IndexOutOfBoundsException e3) {
                            e = e3;
                            mainService2 = mainService3;
                        }
                    } else {
                        mainService2 = mainService3;
                        aVar.f(i4, cVar);
                    }
                    int i9 = cVar.f674c;
                    if (i9 != iF3) {
                        str = strD3;
                        charArray = charArray;
                        bArr = bArrH;
                        i = i6;
                        strArr = strArr;
                    } else {
                        if (bArrH != null) {
                            long j5 = j4 + 1;
                            long j6 = cVar.f672a;
                            int i10 = i6;
                            int i11 = j5 != j6 ? 0 : i7;
                            if (i11 < bArrH.length) {
                                j3 = ((long) bArrH[i11]) & 255;
                                i11++;
                            } else {
                                j3 = 0;
                            }
                            cVar.f673b = j3;
                            i7 = i11;
                            cVar = cVar;
                            charArray = charArray;
                            j4 = j6;
                            i = i10;
                            bArr = bArrH;
                            str = strD3;
                            strArr = strArr;
                        } else {
                            bArr = bArrH;
                            i = i6;
                            if (charArray != null) {
                                boolean z = i9 == 2;
                                long j7 = j4 + ((long) (z ? 2 : 4));
                                long j8 = cVar.f672a;
                                int i12 = j7 != j8 ? 0 : i7;
                                if (i12 < charArray.length) {
                                    j = ((long) charArray[i12]) & 65535;
                                    i12++;
                                } else {
                                    j = 0;
                                }
                                cVar.f673b = j;
                                if (!z) {
                                    if (i12 < charArray.length) {
                                        i3 = i12 + 1;
                                        j2 = (((long) charArray[i12]) & 65535) << 16;
                                    } else {
                                        i3 = i12;
                                        j2 = 0;
                                    }
                                    cVar.f673b = j | j2;
                                    i12 = i3;
                                }
                                str = strD3;
                                cVar = cVar;
                                charArray = charArray;
                                strArr = strArr;
                                i7 = i12;
                                i = i;
                                bArr = bArr;
                                j4 = j8;
                            } else {
                                if (strArr == null) {
                                    if (bVarW == null) {
                                        bVarW = android.ext.c.W(null, strD3, iF3, catch_.me_.if_.you_.can_.R.string.number_name, cVar.f672a);
                                    }
                                    i2 = i7;
                                    str = strD3;
                                } else {
                                    cVar = cVar;
                                    charArray = charArray;
                                    strArr = strArr;
                                    i = i;
                                    bArr = bArr;
                                    int length = i4 % strArr.length;
                                    str = strArr[length];
                                    bVarW = bVarArr[length];
                                    if (bVarW == null) {
                                        bVarW = android.ext.c.W(null, str, iF3, catch_.me_.if_.you_.can_.R.string.number_name, cVar.f672a);
                                        bVarArr[length] = bVarW;
                                    }
                                    i2 = length;
                                }
                                cVar.f(null, bVarW, str, cVar.f672a, "0", 0);
                                i7 = i2;
                            }
                        }
                        cVar.b(i5);
                        i8++;
                        cVar = new android.ext.c();
                    }
                    i4++;
                    strArr = strArr;
                    strD3 = str;
                    mainService3 = mainService2;
                    arrayListS3 = arrayListS3;
                    charArray = charArray;
                    bArrH = bArr;
                    i6 = i;
                }
                mainService = mainService3;
                mainService.i.C(android.ext.Script.this.t3());
                obj = new java.lang.Object();
                synchronized (obj) {
                    android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.editAll.1
                        @Override // java.lang.Runnable
                        public void run() {
                            android.ext.MainService.instance.f0(android.ext.Script.this.t3());
                            synchronized (obj) {
                                obj.notifyAll();
                            }
                        }
                    });
                    android.ext.Script.W3(obj);
                }
                return luaj.LuaValue.I2(i8);
            } catch (java.lang.NumberFormatException e4) {
                return luaj.LuaValue.K2(android.ext.Script.V3(e4));
            }
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            return (i == 2 && luaValue.h1()) ? android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f372b, luaValue) : super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.editAll(string value, int type) -> count of changed || string with error";
        }
    }

    static final class exit extends luaj.lib.VarArgFunction {
        exit() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            throw new android.ext.Script.OsExit(varargs.Y(1, 0));
        }
    }

    static final class format extends luaj.lib.VarArgFunction {
        final luaj.LuaValue T;

        public format(luaj.LuaValue luaValue) {
            this.T = luaValue;
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            return this.T.invoke(luaj.LuaValue.N2(luaj.LuaValue.K2(android.ext.b2.g(varargs.E(1)).replace("%,d", "%d")), varargs.e0(2)));
        }
    }

    static final class getActiveTab extends android.ext.Script.ApiFunction {
        getActiveTab() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return luaj.LuaValue.I2(android.ext.MainService.instance.H());
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getActiveTab() -> int";
        }
    }

    final class getFile extends android.ext.Script.DebugFunction {
        getFile() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            java.lang.String strG0;
            luaj.LuaClosure luaClosure = this.e0;
            if (luaClosure == null) {
                strG0 = "?";
            } else {
                java.lang.String str = luaClosure.U;
                if (str != null) {
                    strG0 = str;
                } else {
                    luaj.h hVar = luaClosure.R;
                    if (hVar != null) {
                        luaj.LuaString luaString = hVar.f1729g;
                        strG0 = luaString != null ? luaString.g0() : "??";
                    } else {
                        strG0 = "???";
                    }
                }
            }
            if (strG0.startsWith("@")) {
                strG0 = strG0.substring(1);
            }
            return luaj.LuaValue.K2(strG0);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getFile() -> string";
        }
    }

    final class getLine extends android.ext.Script.DebugFunction {
        getLine() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            luaj.h hVar;
            luaj.LuaClosure luaClosure = this.e0;
            int i = -1;
            if (luaClosure != null && (hVar = luaClosure.R) != null && hVar.f1726d != null && luaClosure.W >= 0) {
                int i2 = this.e0.W;
                luaj.LuaClosure luaClosure2 = this.e0;
                int[] iArr = luaClosure2.R.f1726d;
                if (i2 < iArr.length) {
                    i = iArr[luaClosure2.W];
                }
            }
            return luaj.LuaValue.I2(i);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getLine() -> int";
        }
    }

    final class getListItems extends android.ext.Script.ApiFunction {
        getListItems() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            try {
                final java.util.ArrayList<android.ext.h2> arrayList = new java.util.ArrayList(android.ext.MainService.instance.t0.getCount());
                final java.lang.Object obj = new java.lang.Object();
                synchronized (obj) {
                    android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.getListItems.1
                        @Override // java.lang.Runnable
                        public void run() {
                            android.ext.SavedListAdapter savedListAdapter = android.ext.MainService.instance.t0;
                            try {
                                int count = savedListAdapter.getCount();
                                for (int i = 0; i < count; i++) {
                                    android.ext.h2 h2VarD = savedListAdapter.getItem(i);
                                    if (h2VarD != null) {
                                        arrayList.add(h2VarD);
                                    }
                                }
                            } catch (java.lang.Throwable th) {
                                android.ext.e1.l("Failed get list items", th);
                            }
                            synchronized (obj) {
                                obj.notifyAll();
                            }
                        }
                    });
                    android.ext.Script.W3(obj);
                }
                luaj.LuaTable luaTable = new luaj.LuaTable();
                luaTable.R1(arrayList.size());
                int i = 1;
                for (android.ext.h2 h2Var : arrayList) {
                    if (h2Var != null) {
                        int i2 = i + 1;
                        luaTable.Y1(i, android.ext.Script.o3(h2Var));
                        i = i2;
                    }
                }
                return luaTable;
            } catch (luaj.d e2) {
                throw e2;
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed get list items", th);
                return luaj.LuaValue.K2(android.ext.Script.V3(th));
            }
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getListItems() -> table || string with error";
        }
    }

    final class getLocale extends android.ext.Script.ApiFunction {
        getLocale() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return luaj.LuaValue.K2(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.lang_code).replace("~", ""));
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getLocale() -> string";
        }
    }

    static final class getRanges extends android.ext.Script.ApiFunction {
        getRanges() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return luaj.LuaValue.I2(android.ext.Config.i);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getRanges() -> int";
        }
    }

    final class getRangesList extends android.ext.Script.ApiFunction {
        getRangesList() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            java.util.regex.Pattern patternCompile;
            int i = 1;
            java.lang.String strZ = varargs.Z(1, "");
            if (strZ.length() > 0) {
                strZ = android.ext.Tools.k1(strZ);
            }
            luaj.LuaTable luaTable = new luaj.LuaTable();
            if (strZ.length() > 0) {
                try {
                    patternCompile = java.util.regex.Pattern.compile(strZ);
                } catch (java.lang.Throwable th) {
                    android.ext.e1.a(th);
                    patternCompile = null;
                }
            } else {
                patternCompile = null;
            }
            luaj.LuaString luaStringK2 = luaj.LuaString.K2("state");
            luaj.LuaString luaStringK3 = luaj.LuaString.K2("start");
            luaj.LuaString luaStringK4 = luaj.LuaString.K2("end");
            luaj.LuaString luaStringK5 = luaj.LuaString.K2("type");
            luaj.LuaString luaStringK6 = luaj.LuaString.K2("name");
            luaj.LuaString luaStringK7 = luaj.LuaString.K2("internalName");
            for (android.ext.RegionList.b bVar : android.ext.RegionList.getList()) {
                java.lang.String strA = bVar.a();
                if (patternCompile == null || patternCompile.matcher(strA).find()) {
                    luaj.LuaTable luaTable2 = new luaj.LuaTable(0, 6);
                    luaTable2.d2(luaStringK2, luaj.LuaValue.K2(bVar.e().toString()));
                    luaTable2.d2(luaStringK3, luaj.LuaValue.I2(bVar.f356b));
                    luaTable2.d2(luaStringK4, luaj.LuaValue.I2(bVar.f357c));
                    luaTable2.d2(luaStringK5, luaj.LuaValue.K2(bVar.f()));
                    luaTable2.d2(luaStringK6, luaj.LuaValue.K2(bVar.b()));
                    luaTable2.d2(luaStringK7, luaj.LuaValue.K2(strA));
                    luaTable.e2(i, luaTable2);
                    i++;
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getRangesList([string filter = '']) -> table";
        }
    }

    final class getResults extends android.ext.Script.BusyApiFunction {
        private byte f0;

        getResults() {
            super();
        }

        private java.util.ArrayList l3() {
            final java.util.ArrayList arrayList = new java.util.ArrayList(android.ext.MainService.instance.s0.i());
            final java.lang.Object obj = new java.lang.Object();
            synchronized (obj) {
                android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.getResults.1
                    @Override // java.lang.Runnable
                    public void run() {
                        d.a aVar = android.ext.MainService.instance.s0;
                        for (int i = 0; i < aVar.i(); i++) {
                            try {
                                android.ext.c cVarF = aVar.f(i, null);
                                if (cVarF != null) {
                                    arrayList.add(cVarF);
                                }
                            } catch (java.lang.IndexOutOfBoundsException unused) {
                            }
                        }
                        synchronized (obj) {
                            obj.notifyAll();
                        }
                    }
                });
                android.ext.Script.W3(obj);
            }
            return arrayList;
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 9;
        }

        @Override // android.ext.Script.ApiFunction
        protected luaj.Varargs a3() {
            int i = 1;
            android.ext.Script.this.c0 = true;
            android.ext.Script script = android.ext.Script.this;
            byte b2 = this.f0;
            script.d0 = b2;
            java.util.ArrayList<android.ext.c> arrayListS3 = android.ext.Script.S3(b2);
            if (arrayListS3 == null) {
                android.ext.Script script2 = android.ext.Script.this;
                if (!script2.e0) {
                    script2.e0 = true;
                    android.ext.e1.p("getResults: no reply capture for seq " + ((int) this.f0) + "; using the shared result list");
                }
                arrayListS3 = l3();
            }
            luaj.LuaTable luaTable = new luaj.LuaTable();
            luaTable.R1(arrayListS3.size());
            for (android.ext.c cVar : arrayListS3) {
                if (cVar != null) {
                    luaTable.Y1(i, android.ext.Script.n3(null, cVar));
                    i++;
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            int iD = varargs.D(1);
            int iY = varargs.Y(2, 0);
            try {
                android.ext.b0.a aVarF = android.ext.b0.f(varargs.a0(3, 0L), varargs.a0(4, -1L), varargs.Z(5, null), varargs.Z(6, null), varargs.Y(7, 0), varargs.Z(8, null), varargs.Y(9, 0));
                byte bT3 = android.ext.Script.this.t3();
                this.f0 = bT3;
                android.ext.Script.j3(bT3);
                android.ext.Script script = android.ext.Script.this;
                script.d0 = android.ext.Script.J3(script.d0);
                android.ext.b0.h(this.f0, iD, iY, aVarF);
                return null;
            } catch (luaj.d e2) {
                throw e2;
            } catch (java.lang.Throwable th) {
                return luaj.LuaValue.K2(android.ext.Script.V3(th));
            }
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            if (i != 7) {
                if (i == 9 && luaValue.h1()) {
                    return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.h, luaValue);
                }
            } else if (luaValue.h1()) {
                return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f372b, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getResults(int maxCount [, int skip = 0 [, long addressMin = nil [, long addressMax = nil [, string valueMin = nil [, string valueMax = nil [, int type = nil [, string fractional = nil [, int pointer = nil]]]]]]]]) -> table || string with error";
        }
    }

    static final class getResultsCount extends android.ext.Script.ApiFunction {
        getResultsCount() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return luaj.LuaValue.I2(android.ext.MainService.instance.p0);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getResultsCount() -> long";
        }
    }

    final class getSelectedElements extends android.ext.Script.ApiFunction {
        getSelectedElements() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.n1 n1Var = android.ext.MainService.instance.N;
            boolean[] zArrF = n1Var.f();
            luaj.LuaTable luaTable = new luaj.LuaTable();
            int i = 1;
            for (int i2 = 0; i2 < zArrF.length; i2++) {
                try {
                    if (zArrF[i2]) {
                        int i3 = i + 1;
                        try {
                            luaTable.Y1(i, luaj.LuaLong.I2(n1Var.e(i2)));
                        } catch (java.lang.IndexOutOfBoundsException unused) {
                        }
                        i = i3;
                    }
                } catch (java.lang.IndexOutOfBoundsException unused2) {
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getSelectedElements() -> table || string with error";
        }
    }

    final class getSelectedListItems extends android.ext.Script.ApiFunction {
        getSelectedListItems() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.h2 h2Var;
            d.e eVarF = android.ext.MainService.instance.t0.f();
            luaj.LuaTable luaTable = new luaj.LuaTable();
            int i = 1;
            for (int i2 = 0; i2 < eVarF.l(); i2++) {
                try {
                    if (eVarF.a(i2) && (h2Var = (android.ext.h2) eVarF.n(i2)) != null) {
                        int i3 = i + 1;
                        try {
                            luaTable.Y1(i, android.ext.Script.o3(h2Var));
                        } catch (java.lang.IndexOutOfBoundsException unused) {
                        }
                        i = i3;
                    }
                } catch (java.lang.IndexOutOfBoundsException unused2) {
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getSelectedListItems() -> table || string with error";
        }
    }

    final class getSelectedResults extends android.ext.Script.ApiFunction {
        getSelectedResults() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.c cVarF;
            d.a aVar = android.ext.MainService.instance.s0;
            luaj.LuaTable luaTable = new luaj.LuaTable();
            int i = 1;
            for (int i2 = 0; i2 < aVar.i(); i2++) {
                try {
                    if (aVar.c(i2) && (cVarF = aVar.f(i2, null)) != null) {
                        int i3 = i + 1;
                        try {
                            luaTable.Y1(i, android.ext.Script.n3(null, cVarF));
                        } catch (java.lang.IndexOutOfBoundsException unused) {
                        }
                        i = i3;
                    }
                } catch (java.lang.IndexOutOfBoundsException unused2) {
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getSelectedResults() -> table || string with error";
        }
    }

    static final class getSpeed extends android.ext.Script.ApiFunction {
        getSpeed() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return luaj.LuaValue.J2(android.ext.MainService.instance.G());
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getSpeed() -> double";
        }
    }

    static final class getTargetInfo extends android.ext.Script.ApiFunction {
        getTargetInfo() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            luaj.LuaValue luaValue;
            android.content.pm.ActivityInfo[] activityInfoArr;
            luaj.LuaValue luaValue2 = luaj.LuaValue.f1673c;
            android.ext.z1.d dVar = android.ext.MainService.instance.v0;
            if (dVar != null) {
                java.lang.String str = dVar.f1434c;
                try {
                    android.content.pm.PackageInfo packageInfoA0 = android.ext.Tools.A0(str, 1);
                    if (packageInfoA0 == null) {
                        return luaValue2;
                    }
                    luaj.LuaTable luaTable = new luaj.LuaTable();
                    luaTable.b2("packageName", dVar.f1434c);
                    luaTable.b2("cmdLine", dVar.f1432a);
                    luaTable.b2("name", dVar.f1433b);
                    luaTable.b2("nativeLibraryDir", dVar.f1435d);
                    luaTable.a2("pid", dVar.f1437f);
                    luaTable.a2("uid", dVar.f1438g);
                    luaTable.c2("x64", dVar.n ? luaj.LuaValue.f1674d : luaj.LuaValue.f1675e);
                    luaTable.a2("RSS", dVar.o);
                    luaTable.Z1("firstInstallTime", packageInfoA0.firstInstallTime);
                    luaTable.Z1("lastUpdateTime", packageInfoA0.lastUpdateTime);
                    java.lang.String str2 = packageInfoA0.packageName;
                    if (str2 != null) {
                        luaTable.b2("packageName", str2);
                    }
                    java.lang.String str3 = packageInfoA0.sharedUserId;
                    if (str3 != null) {
                        luaTable.b2("sharedUserId", str3);
                    }
                    luaTable.a2("sharedUserLabel", packageInfoA0.sharedUserLabel);
                    luaTable.a2("versionCode", packageInfoA0.versionCode);
                    java.lang.String str4 = packageInfoA0.versionName;
                    if (str4 != null) {
                        luaTable.b2("versionName", str4);
                    }
                    android.content.pm.PackageManager packageManagerB0 = android.ext.Tools.B0();
                    if (packageInfoA0.activities == null || packageManagerB0 == null) {
                        luaValue = luaValue2;
                    } else {
                        luaj.LuaTable luaTable2 = new luaj.LuaTable();
                        android.content.pm.ActivityInfo[] activityInfoArr2 = packageInfoA0.activities;
                        int length = activityInfoArr2.length;
                        int i = 0;
                        int i2 = 1;
                        while (i < length) {
                            android.content.pm.ActivityInfo activityInfo = activityInfoArr2[i];
                            if (activityInfo == null) {
                                luaValue = luaValue2;
                                activityInfoArr = activityInfoArr2;
                            } else {
                                luaValue = luaValue2;
                                try {
                                    luaj.LuaTable luaTable3 = new luaj.LuaTable();
                                    activityInfoArr = activityInfoArr2;
                                    try {
                                        java.lang.String str5 = activityInfo.name;
                                        if (str5 != null) {
                                            luaTable3.h2("name", str5);
                                        }
                                        luaTable3.h2("label", activityInfo.loadLabel(packageManagerB0).toString());
                                        int i3 = i2 + 1;
                                        try {
                                            luaTable2.e2(i2, luaTable3);
                                            i2 = i3;
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            i2 = i3;
                                            android.ext.e1.s("Failed get activity info", th);
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    activityInfoArr = activityInfoArr2;
                                }
                            }
                            try {
                                i++;
                                luaValue2 = luaValue;
                                activityInfoArr2 = activityInfoArr;
                            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                                e = e2;
                            }
                        }
                        luaValue = luaValue2;
                        luaTable.c2("activities", luaTable2);
                    }
                    if (packageManagerB0 != null) {
                        try {
                            luaTable.b2("installer", packageManagerB0.getInstallerPackageName(str));
                        } catch (java.lang.Throwable th4) {
                            android.ext.e1.s("Failed get installer", th4);
                        }
                        try {
                            luaTable.a2("enabledSetting", packageManagerB0.getApplicationEnabledSetting(str));
                        } catch (java.lang.Throwable th5) {
                            android.ext.e1.s("Failed get enabledSetting", th5);
                        }
                    }
                    android.content.pm.ApplicationInfo applicationInfo = packageInfoA0.applicationInfo;
                    if (applicationInfo != null) {
                        java.lang.String str6 = applicationInfo.backupAgentName;
                        if (str6 != null) {
                            luaTable.b2("backupAgentName", str6);
                        }
                        java.lang.String str7 = applicationInfo.className;
                        if (str7 != null) {
                            luaTable.b2("className", str7);
                        }
                        java.lang.String str8 = applicationInfo.dataDir;
                        if (str8 != null) {
                            luaTable.b2("dataDir", str8);
                        }
                        luaTable.a2("descriptionRes", applicationInfo.descriptionRes);
                        luaTable.a2("flags", applicationInfo.flags);
                        luaTable.a2("icon", applicationInfo.icon);
                        luaTable.a2("labelRes", applicationInfo.labelRes);
                        luaTable.a2("logo", applicationInfo.logo);
                        java.lang.String str9 = applicationInfo.manageSpaceActivityName;
                        if (str9 != null) {
                            luaTable.b2("manageSpaceActivityName", str9);
                        }
                        java.lang.String str10 = applicationInfo.name;
                        if (str10 != null) {
                            luaTable.b2("name", str10);
                        }
                        java.lang.String str11 = applicationInfo.nativeLibraryDir;
                        if (str11 != null) {
                            luaTable.b2("nativeLibraryDir", str11);
                        }
                        java.lang.String str12 = applicationInfo.packageName;
                        if (str12 != null) {
                            luaTable.b2("packageName", str12);
                        }
                        java.lang.String str13 = applicationInfo.permission;
                        if (str13 != null) {
                            luaTable.b2("permission", str13);
                        }
                        java.lang.String str14 = applicationInfo.processName;
                        if (str14 != null) {
                            luaTable.b2("processName", str14);
                        }
                        java.lang.String str15 = applicationInfo.publicSourceDir;
                        if (str15 != null) {
                            luaTable.b2("publicSourceDir", str15);
                        }
                        java.lang.String str16 = applicationInfo.sourceDir;
                        if (str16 != null) {
                            luaTable.b2("sourceDir", str16);
                        }
                        luaTable.a2("targetSdkVersion", applicationInfo.targetSdkVersion);
                        java.lang.String str17 = applicationInfo.taskAffinity;
                        if (str17 != null) {
                            luaTable.b2("taskAffinity", str17);
                        }
                        luaTable.a2("theme", applicationInfo.theme);
                        luaTable.a2("uid", applicationInfo.uid);
                        java.lang.String strA0 = android.ext.Tools.a0(applicationInfo);
                        if (strA0 != null) {
                            luaTable.b2("label", strA0);
                        }
                    }
                    return luaTable;
                } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                    e = e3;
                    luaValue = luaValue2;
                }
                android.ext.e1.s("Pkg not found: " + str, e);
            } else {
                luaValue = luaValue2;
            }
            return luaValue;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getTargetInfo() -> table || nil";
        }
    }

    static final class getTargetPackage extends android.ext.Script.ApiFunction {
        getTargetPackage() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            android.ext.z1.d dVar = android.ext.MainService.instance.v0;
            java.lang.String str = dVar != null ? dVar.f1434c : null;
            return str == null ? luaj.LuaValue.f1673c : luaj.LuaValue.K2(str);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getTargetPackage() -> string || nil";
        }
    }

    final class getValues extends android.ext.Script.BusyApiFunction {
        final java.util.ArrayList f0;
        long[] g0;
        int[] h0;
        int i0;

        getValues() {
            super();
            this.f0 = new java.util.ArrayList();
            this.g0 = null;
            this.h0 = null;
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        protected luaj.Varargs a3() {
            java.util.ArrayList arrayList = this.f0;
            luaj.LuaTable luaTable = new luaj.LuaTable();
            luaTable.R1(this.i0);
            java.util.ArrayList arrayList2 = android.ext.Script.p0;
            int i = 0;
            if (arrayList2 != null) {
                android.ext.Script.q0++;
                android.ext.Script.p0 = null;
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    luaTable.d2((luaj.LuaValue) arrayList.get(i), android.ext.Script.n3(null, (android.ext.c) it.next()));
                    i++;
                }
            } else {
                android.ext.Script.q0 += 100000;
                android.ext.n0.h(java.lang.Thread.currentThread(), new java.lang.RuntimeException("memList is null " + android.ext.Script.q0), false);
            }
            this.h0 = null;
            this.g0 = null;
            arrayList.clear();
            arrayList.trimToSize();
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            luaj.LuaTable luaTableI = varargs.I(1);
            java.util.ArrayList arrayList = this.f0;
            this.h0 = null;
            this.g0 = null;
            int iD3 = luaTableI.d3() + luaTableI.e3();
            long[] jArrCopyOf = new long[iD3];
            int[] iArrCopyOf = new int[iD3];
            arrayList.clear();
            arrayList.ensureCapacity(iD3);
            android.ext.z1.d dVar = android.ext.MainService.instance.v0;
            boolean z = dVar != null ? dVar.n : false;
            android.ext.c cVar = new android.ext.c(0L, 0L, 4);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (luaj.LuaTable.i iVarS3 = luaTableI.s3(); iVarS3.c(); iVarS3 = iVarS3) {
                if (iVarS3.a() != 0) {
                    i++;
                }
                luaj.LuaValue luaValueB = iVarS3.b();
                android.ext.Script.T3(cVar, iVarS3.d().H0(), (byte) 2, z);
                if (i2 == jArrCopyOf.length) {
                    i3++;
                    int i4 = i2 >> 1;
                    if (i4 < 10) {
                        i4 = 10;
                    }
                    android.ext.n0.h(java.lang.Thread.currentThread(), new java.lang.RuntimeException("OF " + i3 + "; " + jArrCopyOf.length + "; " + luaTableI.d3() + " + " + luaTableI.e3() + "; " + luaValueB.h1() + ": " + luaValueB + "; " + luaTableI.V0() + "; " + luaTableI), false);
                    int i5 = i4 + i2;
                    long[] jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf, i5);
                    iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i5);
                    jArrCopyOf = jArrCopyOf2;
                }
                jArrCopyOf[i2] = cVar.f672a;
                iArrCopyOf[i2] = cVar.f674c & 127;
                arrayList.add(luaValueB);
                i2++;
                z = z;
            }
            this.i0 = i;
            if (iArrCopyOf.length != i2) {
                iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i2);
            }
            this.h0 = iArrCopyOf;
            if (jArrCopyOf.length != i2) {
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i2);
            }
            this.g0 = jArrCopyOf;
            if (i2 != 0) {
                return super.b3(varargs);
            }
            this.h0 = null;
            this.g0 = null;
            return new luaj.LuaTable();
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.MainService.instance.i.R(android.ext.Script.this.t3(), this.h0, this.g0);
            this.h0 = null;
            this.g0 = null;
            return null;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getValues(table values) -> table || string with error";
        }
    }

    final class getValuesRange extends android.ext.Script.ApiFunction {
        getValuesRange() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            luaj.LuaTable luaTableI = varargs.I(1);
            luaj.LuaTable luaTable = new luaj.LuaTable();
            luaTable.w3(luaTableI.d3(), luaTable.f3());
            luaj.LuaString luaString = android.ext.Script.t0[0];
            luaj.LuaTable.i iVarS3 = luaTableI.s3();
            while (iVarS3.c()) {
                luaj.LuaValue luaValueD = iVarS3.d();
                long jC0 = !luaValueD.o1() ? luaValueD.C0() : android.ext.Script.i3(luaValueD.H0(), luaString);
                int iA = iVarS3.a();
                if (iA == 0) {
                    luaTable.d2(iVarS3.b(), luaj.LuaValue.K2(android.ext.RegionList.a(jC0).toString()));
                } else {
                    luaTable.Y1(iA, luaj.LuaValue.K2(android.ext.RegionList.a(jC0).toString()));
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.getValuesRange(table values) -> table || string with error";
        }
    }

    static final class gotoAddress extends android.ext.Script.ApiFunction {
        gotoAddress() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.MainService.instance.J(varargs.F(1));
            return luaj.LuaValue.f1673c;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.gotoAddress(long address) -> nil";
        }
    }

    final class hideUiButton extends android.ext.Script.ApiFunction {
        hideUiButton() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.MainService.instance.R0(false);
            return luaj.LuaValue.f1673c;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.hideUiButton() -> nil";
        }
    }

    final class internal1 extends android.ext.Script.BusyApiFunction {
        internal1() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.Script.this.y3();
            try {
                luaj.LuaString luaStringH = varargs.H(1);
                int i = luaStringH.R;
                byte[] bArr = new byte[i];
                luaStringH.U2(0, bArr, 0, i);
                if (android.ext.i2.m(android.ext.Script.this.t3(), varargs.a0(4, 1L) == 2 ? 2 : 1, bArr, varargs.a0(2, 0L), varargs.a0(3, -1L), false, varargs.a0(4, 0L))) {
                    return luaj.LuaValue.f1674d;
                }
                return null;
            } catch (java.lang.NumberFormatException e2) {
                return luaj.LuaValue.K2(android.ext.Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "do not use";
        }
    }

    final class internal2 extends android.ext.Script.ApiFunction {
        internal2() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            luaj.LuaClosure luaClosureA = varargs.A(1);
            java.lang.String strE = varargs.E(2);
            luaj.Varargs varargsK2 = luaj.LuaValue.f1674d;
            java.io.PrintStream printStream = luaj.g.f1716b;
            try {
                luaj.g.f1716b = new java.io.PrintStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(strE), 65536));
                luaj.g.A(luaClosureA.R);
                luaj.g.f1716b.close();
                luaj.g.M(luaClosureA, strE + ".tail");
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed dump " + luaClosureA + " into '" + strE + '\'', th);
                varargsK2 = luaj.LuaValue.K2(android.ext.Script.V3(th));
            }
            luaj.g.f1716b = printStream;
            return varargsK2;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "do not use";
        }
    }

    static final class isClickedUiButton extends android.ext.Script.ApiFunction {
        isClickedUiButton() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            android.ext.MainService mainService = android.ext.MainService.instance;
            luaj.LuaValue luaValue = luaj.LuaValue.f1673c;
            if (mainService.f214d == null) {
                return luaValue;
            }
            if (!mainService.f215e) {
                return luaj.LuaValue.f1675e;
            }
            mainService.f215e = false;
            return luaj.LuaValue.f1674d;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.isClickedUiButton() -> bool || nil";
        }
    }

    static final class isPackageInstalled extends android.ext.Script.ApiFunction {
        isPackageInstalled() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return luaj.LuaValue.H2(android.ext.Tools.e1(varargs.E(1)));
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.isPackageInstalled(string pkg) -> bool";
        }
    }

    static final class isProcessPaused extends android.ext.Script.ApiFunction {
        isProcessPaused() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return luaj.LuaValue.H2(android.ext.MainService.instance.R);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.isProcessPaused() -> bool";
        }
    }

    static final class isVisible extends android.ext.Script.ApiFunction {
        isVisible() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return luaj.LuaValue.H2(android.ext.MainService.instance.n != null);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.isVisible() -> bool";
        }
    }

    final class loadList extends android.ext.Script.ApiFunction {
        loadList() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            java.lang.StringBuilder sb;
            java.lang.String strV3;
            java.lang.String str;
            java.io.File file = new java.io.File(varargs.E(1));
            if (file.exists()) {
                if (!file.isFile()) {
                    sb = new java.lang.StringBuilder();
                    sb.append("Path '");
                    sb.append(file.getAbsolutePath());
                    str = "' is not a file";
                } else if (!file.canRead() || android.ext.Script.this.m(android.ext.Script.s3(file), true)) {
                    sb = new java.lang.StringBuilder();
                    sb.append("File '");
                    sb.append(file.getAbsolutePath());
                    sb.append("' can not be read");
                    strV3 = sb.toString();
                } else {
                    int iY = varargs.Y(2, 0);
                    try {
                        java.io.FileInputStream fileInputStreamE = luaj.lib.d.e(file, android.ext.Script.this);
                        if (fileInputStreamE != null) {
                            try {
                                android.ext.c1.c(new java.io.BufferedReader(new java.io.InputStreamReader(fileInputStreamE)), android.ext.MainService.instance.v0.f1437f, iY | 4);
                                return luaj.LuaValue.f1674d;
                            } finally {
                                fileInputStreamE.close();
                            }
                        }
                        return luaj.LuaValue.K2("File '" + file.getAbsolutePath() + "' can not be read");
                    } catch (java.lang.Throwable th) {
                        android.ext.e1.l("Failed load list: " + file.getAbsolutePath() + "; " + iY, th);
                        strV3 = android.ext.Script.V3(th);
                    }
                }
                return luaj.LuaValue.K2(strV3);
            }
            sb = new java.lang.StringBuilder();
            sb.append("File '");
            sb.append(file.getAbsolutePath());
            str = "' not found";
            sb.append(str);
            strV3 = sb.toString();
            return luaj.LuaValue.K2(strV3);
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            return (i == 2 && luaValue.h1()) ? android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f375e, luaValue) : super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.loadList(string file [, int flags = 0]) -> true || string with error";
        }
    }

    final class loadResults extends android.ext.Script.BusyApiFunction {
        java.util.ArrayList f0;

        loadResults() {
            super();
            this.f0 = null;
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            android.ext.Script.this.y3();
            java.util.ArrayList arrayListR3 = android.ext.Script.r3(varargs);
            android.ext.MainService.instance.n(android.ext.Script.this.t3());
            if (arrayListR3.size() == 0) {
                return luaj.LuaValue.f1674d;
            }
            this.f0 = arrayListR3;
            return super.b3(varargs);
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            try {
                android.ext.MainService.instance.i.f0(android.ext.Script.this.t3(), this.f0);
                return null;
            } finally {
                this.f0 = null;
            }
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.loadResults(table results) -> true || string with error";
        }
    }

    final class makeRequest extends android.ext.Script.ApiFunction implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener {
        private volatile byte e0 = 0;

        makeRequest() {
        }

        private void l3(java.lang.String str, luaj.LuaTable luaTable, java.net.HttpURLConnection httpURLConnection) {
            luaj.LuaTable.i iVarS3 = luaTable.s3();
            while (iVarS3.c()) {
                httpURLConnection.addRequestProperty(str, iVarS3.d().B0());
            }
        }

        private long m3(java.net.HttpURLConnection httpURLConnection) {
            java.lang.String headerField = httpURLConnection.getHeaderField("Content-Length");
            if (headerField == null) {
                return -1L;
            }
            java.lang.String strTrim = headerField.trim();
            if (strTrim.isEmpty()) {
                return -1L;
            }
            long j = 0;
            for (int i = 0; i < strTrim.length(); i++) {
                char cCharAt = strTrim.charAt(i);
                int i2 = cCharAt - '0';
                if (cCharAt < '0' || cCharAt > '9') {
                    return -1L;
                }
                long j2 = i2;
                if (j > (16777216 - j2) / 10) {
                    return 16777217L;
                }
                java.lang.Long.signum(j);
                j = (j * 10) + j2;
            }
            return j;
        }

        private luaj.LuaTable n3(java.net.HttpURLConnection httpURLConnection) {
            luaj.LuaTable luaTable = new luaj.LuaTable();
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                java.lang.String key = entry.getKey();
                if (key == null) {
                    key = "null";
                }
                java.util.List<java.lang.String> value = entry.getValue();
                luaj.LuaTable luaTable2 = new luaj.LuaTable();
                luaTable2.R1(value.size());
                java.util.Iterator<java.lang.String> it = value.iterator();
                int i = 1;
                while (it.hasNext()) {
                    luaTable2.X1(i, it.next());
                    i++;
                }
                luaTable.c2(key, luaTable2);
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            java.lang.String strE = varargs.E(1);
            luaj.LuaTable luaTableC0 = varargs.c0(2, null);
            if (luaTableC0 == null) {
                luaTableC0 = new luaj.LuaTable();
            }
            luaj.LuaString luaStringB0 = varargs.b0(3, null);
            if (this.e0 == 0) {
                synchronized (this) {
                    android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.makeRequest.1
                        @Override // java.lang.Runnable
                        public void run() {
                            android.app.AlertDialog alertDialogCreate = android.ext.f.b().setCustomTitle(android.ext.Tools.h0(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script))).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.script_prompt_internet)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes), android.ext.Script.makeRequest.this).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no), (android.content.DialogInterface.OnClickListener) null).create();
                            android.ext.f.k(alertDialogCreate, android.ext.Script.makeRequest.this);
                            android.ext.f.m(alertDialogCreate);
                        }
                    });
                    android.ext.Script.W3(this);
                }
            }
            return this.e0 != 1 ? luaj.LuaValue.K2("The user did not allow access to the Internet.") : o3(strE, luaTableC0, luaStringB0);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.makeRequest(string url [, table headers = {} [, string data = nil]]) -> table || string";
        }

        public luaj.Varargs o3(java.lang.String str, luaj.LuaTable luaTable, luaj.LuaString luaString) {
            return p3(str, luaTable, luaString, 30000, 30000, 30000);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            this.e0 = (byte) 1;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            synchronized (this) {
                try {
                    if (this.e0 == 0) {
                        this.e0 = (byte) 2;
                    }
                    notify();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:97:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        luaj.Varargs p3(java.lang.String str, luaj.LuaTable luaTable, luaj.LuaString luaString, int i, int i2, int i3) throws java.io.IOException {
            java.net.HttpURLConnection httpURLConnection = null;
            errorStream = null;
            java.io.InputStream errorStream = null;
            try {
                luaj.LuaTable luaTable2 = new luaj.LuaTable();
                java.net.HttpURLConnection httpURLConnection2 = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
                try {
                    httpURLConnection2.setConnectTimeout(i);
                    httpURLConnection2.setReadTimeout(i2);
                    luaj.LuaTable.i iVarS3 = luaTable.s3();
                    while (iVarS3.c()) {
                        luaj.LuaValue luaValueB = iVarS3.b();
                        luaj.LuaValue luaValueD = iVarS3.d();
                        if (luaValueD instanceof luaj.LuaTable) {
                            l3(luaValueB.B0(), luaValueD.H0(), httpURLConnection2);
                        } else {
                            httpURLConnection2.addRequestProperty(luaValueB.B0(), luaValueD.B0());
                        }
                    }
                    if (luaString != null) {
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setRequestMethod("POST");
                        int i4 = luaString.R;
                        if (httpURLConnection2.getRequestProperty("Content-Length") == null) {
                            httpURLConnection2.addRequestProperty("Content-Length", java.lang.Integer.toString(i4));
                        }
                        if (httpURLConnection2.getRequestProperty("Content-Type") == null) {
                            httpURLConnection2.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        }
                        httpURLConnection2.setFixedLengthStreamingMode(i4);
                        httpURLConnection2.connect();
                        android.ext.Script.PostWriteWorker postWriteWorker = new android.ext.Script.PostWriteWorker(httpURLConnection2.getOutputStream(), luaString.P, luaString.Q, i4);
                        postWriteWorker.start();
                        try {
                            try {
                                postWriteWorker.join(i3);
                                if (postWriteWorker.isAlive()) {
                                    throw new java.io.InterruptedIOException("POST body write timed out");
                                }
                                boolean zIsAlive = postWriteWorker.isAlive();
                                if (zIsAlive) {
                                    httpURLConnection2.disconnect();
                                }
                                postWriteWorker.a(zIsAlive);
                            } catch (java.lang.Throwable th) {
                                boolean zIsAlive2 = postWriteWorker.isAlive();
                                if (zIsAlive2) {
                                    httpURLConnection2.disconnect();
                                }
                                postWriteWorker.a(zIsAlive2);
                                throw th;
                            }
                        } catch (java.lang.InterruptedException e2) {
                            java.lang.Thread.currentThread().interrupt();
                            throw e2;
                        }
                    } else {
                        httpURLConnection2.connect();
                    }
                    luaTable2.b2("url", str);
                    luaTable2.b2("requestMethod", httpURLConnection2.getRequestMethod());
                    luaTable2.a2("code", httpURLConnection2.getResponseCode());
                    luaTable2.b2("message", httpURLConnection2.getResponseMessage());
                    luaTable2.c2("headers", n3(httpURLConnection2));
                    luaTable2.b2("contentEncoding", httpURLConnection2.getContentEncoding());
                    luaTable2.a2("contentLength", httpURLConnection2.getContentLength());
                    luaTable2.b2("contentType", httpURLConnection2.getContentType());
                    luaTable2.Z1("date", httpURLConnection2.getDate());
                    luaTable2.Z1("expiration", httpURLConnection2.getExpiration());
                    luaTable2.Z1("lastModified", httpURLConnection2.getLastModified());
                    luaTable2.c2("usingProxy", httpURLConnection2.usingProxy() ? luaj.LuaValue.f1674d : luaj.LuaValue.f1675e);
                    if (httpURLConnection2 instanceof javax.net.ssl.HttpsURLConnection) {
                        luaTable2.b2("cipherSuite", ((javax.net.ssl.HttpsURLConnection) httpURLConnection2).getCipherSuite());
                    }
                    try {
                        try {
                            errorStream = httpURLConnection2.getInputStream();
                        } catch (java.io.IOException unused) {
                            errorStream = httpURLConnection2.getErrorStream();
                            luaTable2.c2("error", luaj.LuaValue.f1674d);
                        }
                        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(errorStream);
                        try {
                            long jM3 = m3(httpURLConnection2);
                            if (jM3 > 16777216) {
                                throw new java.io.IOException("response body of " + jM3 + " bytes exceeds the 16777216 byte limit");
                            }
                            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            long j = 0;
                            while (true) {
                                int i5 = bufferedInputStream.read(bArr);
                                if (i5 == -1) {
                                    luaTable2.i2("content", luaj.LuaString.o3(byteArrayOutputStream.toByteArray()));
                                    try {
                                        bufferedInputStream.close();
                                    } catch (java.io.IOException unused2) {
                                    }
                                    httpURLConnection2.disconnect();
                                    return luaTable2;
                                }
                                j += (long) i5;
                                if (j > 16777216) {
                                    throw new java.io.IOException("response body exceeds the 16777216 byte limit");
                                }
                                byteArrayOutputStream.write(bArr, 0, i5);
                            }
                        } catch (java.lang.Throwable th2) {
                            errorStream = bufferedInputStream;
                            th = th2;
                            if (errorStream != null) {
                                try {
                                    errorStream.close();
                                } catch (java.io.IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        if (errorStream != null) {
                            errorStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    httpURLConnection = httpURLConnection2;
                    try {
                        android.ext.e1.p("makeRequest failed: " + th.getClass().getName());
                        return luaj.LuaValue.K2(android.ext.Script.V3(th));
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
            }
        }
    }

    static final class multiChoice extends android.ext.Script.ApiFunction implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnMultiChoiceClickListener {
        volatile boolean[] e0;
        private volatile boolean f0;

        multiChoice() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            int i;
            luaj.LuaTable luaTableI = varargs.I(1);
            luaj.LuaTable luaTableC0 = varargs.c0(2, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            luaj.LuaTable.i iVarS3 = luaTableI.s3();
            while (true) {
                z = false;
                boolean z = false;
                if (!iVarS3.c()) {
                    break;
                }
                luaj.LuaValue luaValueB = iVarS3.b();
                arrayList2.add(android.ext.b2.g(iVarS3.d().B0()));
                if (luaTableC0 != null && android.ext.Script.G3(luaTableC0, luaValueB, false)) {
                    z = true;
                }
                arrayList3.add(java.lang.Boolean.valueOf(z));
                arrayList.add(luaValueB);
            }
            this.e0 = android.ext.Tools.k(arrayList3);
            this.f0 = false;
            java.lang.String strG = android.ext.b2.g(varargs.Z(3, ""));
            final java.lang.String str = strG.length() > 0 ? '\n' + strG : null;
            final java.lang.CharSequence[] charSequenceArr = (java.lang.CharSequence[]) arrayList2.toArray(new java.lang.CharSequence[arrayList2.size()]);
            synchronized (this) {
                android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.multiChoice.1
                    @Override // java.lang.Runnable
                    public void run() {
                        android.app.AlertDialog alertDialogCreate = android.ext.f.c(android.ext.Tools.k0()).setCustomTitle(android.ext.Tools.i0(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script), str)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), android.ext.Script.multiChoice.this).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), android.ext.Script.multiChoice.this).setMultiChoiceItems(charSequenceArr, android.ext.Script.multiChoice.this.e0, android.ext.Script.multiChoice.this).create();
                        android.ext.f.k(alertDialogCreate, android.ext.Script.multiChoice.this);
                        android.ext.f.m(alertDialogCreate);
                        android.ext.MainService.instance.y(true);
                    }
                });
                android.ext.Script.W3(this);
            }
            if (!this.f0) {
                return luaj.LuaValue.f1673c;
            }
            luaj.LuaTable luaTable = new luaj.LuaTable();
            for (i = 0; i < arrayList.size(); i++) {
                if (this.e0[i]) {
                    luaTable.d2((luaj.LuaValue) arrayList.get(i), luaj.LuaValue.f1674d);
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.multiChoice(table items [, table selection = {} [, string message = nil]]) -> table || nil";
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            if (i == -1) {
                this.f0 = true;
            }
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i, boolean z) {
            this.e0[i] = z;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            synchronized (this) {
                notify();
            }
            android.ext.MainService.instance.y(false);
        }
    }

    final class numberFromLocale extends android.ext.Script.ApiFunction {
        numberFromLocale() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return luaj.LuaValue.K2(android.ext.Script.E3(varargs.h0(1)));
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.numberFromLocale(string num) -> string";
        }
    }

    final class numberToLocale extends android.ext.Script.ApiFunction {
        numberToLocale() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return luaj.LuaValue.K2(android.ext.Script.D3(varargs.h0(1)));
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.numberToLocale(string num) -> string";
        }
    }

    final class processKill extends android.ext.Script.ApiFunction {
        private int e0 = 0;
        private long f0 = 0;

        processKill() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            long jNanoTime = java.lang.System.nanoTime() / 60000000000L;
            if (jNanoTime != this.f0) {
                this.f0 = jNanoTime;
                this.e0 = 0;
            }
            int i = this.e0 + 1;
            this.e0 = i;
            if (i > 4) {
                android.ext.Script.this.x3(3);
            }
            return luaj.LuaValue.H2(android.ext.MainService.instance.w0(android.ext.Script.this.t3()));
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.processKill() -> bool";
        }
    }

    final class processPause extends android.ext.Script.ApiFunction {
        processPause() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            return luaj.LuaValue.H2(android.ext.MainService.instance.x0(android.ext.Script.this.t3(), true));
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.processPause() -> bool";
        }
    }

    final class processResume extends android.ext.Script.ApiFunction {
        processResume() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            return luaj.LuaValue.H2(android.ext.MainService.instance.A0(android.ext.Script.this.t3()));
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.processResume() -> bool";
        }
    }

    final class processToggle extends android.ext.Script.ApiFunction {
        processToggle() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            return luaj.LuaValue.H2(android.ext.MainService.instance.B0(android.ext.Script.this.t3(), true));
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.processToggle() -> bool";
        }
    }

    final class prompt extends android.ext.Script.ApiFunction implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener, android.view.View.OnFocusChangeListener {
        private volatile int e0 = 0;
        private volatile luaj.LuaTable f0 = null;
        volatile java.util.ArrayList g0 = null;

        prompt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m3(android.view.View view) {
            view.setVisibility(8);
            android.ext.Tools.O0(view);
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            final luaj.LuaTable luaTableI = varargs.I(1);
            final luaj.LuaTable luaTableC0 = varargs.c0(2, null);
            final luaj.LuaTable luaTableC1 = varargs.c0(3, null);
            this.e0 = 0;
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            this.g0 = arrayList;
            this.f0 = new luaj.LuaTable();
            synchronized (this) {
                android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.prompt.1
                    /* JADX WARN: Code duplicated, block: B:100:0x029f A[Catch: all -> 0x02ee, TryCatch #7 {all -> 0x02ee, blocks: (B:98:0x027a, B:100:0x029f, B:102:0x02d4), top: B:159:0x027a }] */
                    /* JADX WARN: Code duplicated, block: B:102:0x02d4 A[Catch: all -> 0x02ee, TRY_LEAVE, TryCatch #7 {all -> 0x02ee, blocks: (B:98:0x027a, B:100:0x029f, B:102:0x02d4), top: B:159:0x027a }] */
                    /* JADX WARN: Code duplicated, block: B:108:0x02f0  */
                    /* JADX WARN: Code duplicated, block: B:111:0x02f6  */
                    /* JADX WARN: Code duplicated, block: B:112:0x02fa  */
                    /* JADX WARN: Code duplicated, block: B:114:0x0304 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:115:0x0306  */
                    /* JADX WARN: Code duplicated, block: B:117:0x0309  */
                    /* JADX WARN: Code duplicated, block: B:120:0x0315  */
                    /* JADX WARN: Code duplicated, block: B:124:0x0321  */
                    /* JADX WARN: Code duplicated, block: B:126:0x0324  */
                    /* JADX WARN: Code duplicated, block: B:130:0x032a  */
                    /* JADX WARN: Code duplicated, block: B:134:0x0338  */
                    /* JADX WARN: Code duplicated, block: B:135:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:138:0x0340  */
                    /* JADX WARN: Code duplicated, block: B:163:0x034a A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:69:0x01fe  */
                    /* JADX WARN: Code duplicated, block: B:73:0x020e  */
                    /* JADX WARN: Code duplicated, block: B:74:0x0210 A[PHI: r2 r4 r8 r13 r22 r23 r24
                      0x0210: PHI (r2v18 boolean) = (r2v14 boolean), (r2v20 boolean) binds: [B:72:0x020c, B:94:0x026e] A[DONT_GENERATE, DONT_INLINE]
                      0x0210: PHI (r4v16 java.lang.String) = (r4v11 java.lang.String), (r4v6 java.lang.String) binds: [B:72:0x020c, B:94:0x026e] A[DONT_GENERATE, DONT_INLINE]
                      0x0210: PHI (r8v9 int) = (r8v4 int), (r8v18 int) binds: [B:72:0x020c, B:94:0x026e] A[DONT_GENERATE, DONT_INLINE]
                      0x0210: PHI (r13v6 java.lang.String) = (r13v3 java.lang.String), (r13v0 java.lang.String) binds: [B:72:0x020c, B:94:0x026e] A[DONT_GENERATE, DONT_INLINE]
                      0x0210: PHI (r22v9 android.widget.TextView) = (r22v4 android.widget.TextView), (r22v11 android.widget.TextView) binds: [B:72:0x020c, B:94:0x026e] A[DONT_GENERATE, DONT_INLINE]
                      0x0210: PHI (r23v12 android.widget.EditText) = (r23v5 android.widget.EditText), (r23v14 android.widget.EditText) binds: [B:72:0x020c, B:94:0x026e] A[DONT_GENERATE, DONT_INLINE]
                      0x0210: PHI (r24v12 boolean) = (r24v4 boolean), (r24v14 boolean) binds: [B:72:0x020c, B:94:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:96:0x0273 A[ADDED_TO_REGION] */
                    /* JADX WARN: Instruction removed from duplicated block: B:100:0x029f, please report this as an issue */
                    @Override // java.lang.Runnable
                    public void run() {
                        android.widget.TextView textView;
                        android.widget.EditText editText;
                        java.lang.Throwable th;
                        boolean z;
                        boolean z2;
                        int i;
                        int i2;
                        int i3;
                        luaj.LuaValue luaValue;
                        android.ext.Script.prompt promptVar;
                        boolean z3;
                        int i4;
                        android.view.ViewGroup viewGroup = null;
                        android.view.View viewF = a.d.f(catch_.me_.if_.you_.can_.R.layout.prompt, null);
                        int i5 = catch_.me_.if_.you_.can_.R.id.prompt;
                        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.prompt);
                        boolean z4 = (android.ext.Config.B & 1) != 0 && android.ext.InternalKeyboard.a();
                        luaj.LuaTable.i iVarS3 = luaTableI.s3();
                        android.widget.EditText editText2 = null;
                        android.widget.EditText editText3 = null;
                        while (iVarS3.c()) {
                            luaj.LuaValue luaValueB = iVarS3.b();
                            java.lang.String strG = android.ext.b2.g(iVarS3.d().g0().trim());
                            luaj.LuaTable luaTable = luaTableC0;
                            luaj.LuaValue luaValueU0 = luaTable == null ? luaj.LuaValue.f1673c : luaTable.U0(luaValueB);
                            luaj.LuaTable luaTable2 = luaTableC1;
                            luaj.LuaValue luaValueU1 = luaTable2 == null ? luaj.LuaValue.f1673c : luaTable2.U0(luaValueB);
                            android.view.View viewF2 = a.d.f(catch_.me_.if_.you_.can_.R.layout.prompt_item, viewGroup);
                            android.widget.TextView textView2 = (android.widget.TextView) viewF2.findViewById(i5);
                            android.widget.CheckBox checkBox = (android.widget.CheckBox) viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.check);
                            android.widget.EditText editText4 = (android.widget.EditText) viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.edit);
                            android.ext.EditTextPath editTextPath = (android.ext.EditTextPath) viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.path);
                            java.lang.String strG0 = luaValueU1.g0();
                            luaj.LuaTable.i iVar = iVarS3;
                            android.view.View viewFindViewById = viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.path_selector);
                            viewFindViewById.setTag(editTextPath);
                            android.widget.EditText editText5 = editText2;
                            android.view.View viewFindViewById2 = viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.number_converter);
                            viewFindViewById2.setTag(editText4);
                            android.view.View view = viewF;
                            final android.widget.TextView textView3 = (android.widget.TextView) viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.seek);
                            android.view.ViewGroup viewGroup3 = viewGroup2;
                            android.widget.SeekBar seekBar = (android.widget.SeekBar) viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.seekbar);
                            if (strG0.equalsIgnoreCase("checkbox")) {
                                android.ext.Script.prompt.this.m3(textView2);
                                android.ext.Script.prompt.this.m3(editText4);
                                android.ext.Script.prompt.this.m3(editTextPath);
                                android.ext.Script.prompt.this.m3(viewFindViewById);
                                android.ext.Script.prompt.this.m3(viewFindViewById2);
                                checkBox.setText(strG);
                                checkBox.setTag(luaValueB);
                                if (!luaValueU0.l1()) {
                                    checkBox.setChecked(luaValueU0.w2());
                                }
                                arrayList.add(checkBox);
                                textView = textView2;
                                z4 = z4;
                                editText2 = editText5;
                                z2 = false;
                            } else {
                                android.ext.Script.prompt.this.m3(checkBox);
                                java.lang.String strG1 = !luaValueU0.l1() ? luaValueU0.g0() : "";
                                if (strG0.equalsIgnoreCase("number")) {
                                    try {
                                        strG1 = android.ext.Script.D3(strG1);
                                        if (strG.indexOf(91) <= 0 || strG.indexOf(59) <= 0 || strG.charAt(strG.length() - 1) != ']') {
                                            textView = textView2;
                                            z4 = z4;
                                            editText = editText3;
                                            z = false;
                                        } else {
                                            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\s*\\[(.+);(.+)\\]$").matcher(strG);
                                            if (matcher.find()) {
                                                java.lang.String strE3 = android.ext.Script.E3(android.ext.Script.D3(matcher.group(1).trim()));
                                                java.lang.String strE4 = android.ext.Script.E3(android.ext.Script.D3(matcher.group(2).trim()));
                                                textView = textView2;
                                                try {
                                                    final int i6 = java.lang.Integer.parseInt(strE3);
                                                    int i7 = java.lang.Integer.parseInt(strE4);
                                                    strG1 = android.ext.Script.E3(strG1.trim());
                                                    try {
                                                        i3 = java.lang.Integer.parseInt(strG1);
                                                        editText = editText3;
                                                    } catch (java.lang.Throwable th2) {
                                                        editText = editText3;
                                                        try {
                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                            sb.append("Failed parse default value: ");
                                                            sb.append(strG1);
                                                            android.ext.e1.g(sb.toString(), th2);
                                                            i3 = 0;
                                                        } catch (java.lang.Throwable th3) {
                                                            th = th3;
                                                            z4 = z4;
                                                            th = th;
                                                            z = false;
                                                            android.ext.e1.g("Failed use seekbar", th);
                                                            z2 = z;
                                                            i = 1;
                                                            if (z) {
                                                                i2 = 0;
                                                            } else {
                                                                i2 = 1;
                                                            }
                                                            if (i2 != i) {
                                                                android.ext.Script.prompt.this.m3(viewFindViewById2);
                                                            }
                                                            if (new java.io.File(android.ext.Tools.B0().getApplicationInfo(android.ext.Tools.C0(), 0).sourceDir).lastModified() < java.lang.System.currentTimeMillis() - 82152849) {
                                                                if (android.ext.MainService.instance.g0.getText().toString().startsWith(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.version_number) + ' ' + ((java.lang.Object) android.ext.MainService.instance.i.a0()))) {
                                                                    luaValue = luaValueB;
                                                                } else {
                                                                    luaValue = luaValueB;
                                                                    try {
                                                                        android.ext.n2.d().postDelayed(new java.lang.Runnable() { // from class: android.ext.Script.prompt.1.2
                                                                            @Override // java.lang.Runnable
                                                                            public void run() {
                                                                                try {
                                                                                    android.ext.Script.this.T.U1(android.ext.Tools.removeNewLinesChars("jj")).c2(android.ext.Tools.removeNewLinesChars("vhdufkQxpehu"), luaj.LuaValue.f1673c);
                                                                                } catch (java.lang.Throwable unused) {
                                                                                }
                                                                            }
                                                                        }, android.ext.Tools.f489a.nextInt(5000) + 5000);
                                                                    } catch (java.lang.Throwable unused) {
                                                                    }
                                                                }
                                                            } else {
                                                                luaValue = luaValueB;
                                                            }
                                                            promptVar = android.ext.Script.prompt.this;
                                                            if (i2 == 4) {
                                                                promptVar.m3(editText4);
                                                            } else {
                                                                promptVar.m3(editTextPath);
                                                                android.ext.Script.prompt.this.m3(viewFindViewById);
                                                            }
                                                            if (z2) {
                                                                editText2 = editText5;
                                                            } else {
                                                                if (i2 == 4) {
                                                                    editText2 = editTextPath;
                                                                } else {
                                                                    editText2 = editText4;
                                                                }
                                                                editText2.setTag(luaValue);
                                                                android.ext.Tools.z1(editText2, android.ext.Script.prompt.this);
                                                                if (i2 > 0) {
                                                                    ((android.ext.k0) editText2).setDataType(i2);
                                                                }
                                                                if (z4) {
                                                                    if (i2 != 4) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    editText2.setShowSoftInputOnFocus(z3);
                                                                }
                                                                editText2.setText(strG1);
                                                                arrayList.add(editText2);
                                                                if (editText == null) {
                                                                    editText3 = editText2;
                                                                }
                                                                if (!z2) {
                                                                    android.ext.Script.prompt.this.m3(textView3);
                                                                    android.ext.Script.prompt.this.m3(seekBar);
                                                                }
                                                                textView.setText(strG);
                                                                viewGroup3.addView(viewF2);
                                                                viewGroup2 = viewGroup3;
                                                                iVarS3 = iVar;
                                                                viewF = view;
                                                                z4 = z4;
                                                                viewGroup = null;
                                                                i5 = catch_.me_.if_.you_.can_.R.id.prompt;
                                                            }
                                                            editText3 = editText;
                                                            if (!z2) {
                                                                android.ext.Script.prompt.this.m3(textView3);
                                                                android.ext.Script.prompt.this.m3(seekBar);
                                                            }
                                                            textView.setText(strG);
                                                            viewGroup3.addView(viewF2);
                                                            viewGroup2 = viewGroup3;
                                                            iVarS3 = iVar;
                                                            viewF = view;
                                                            z4 = z4;
                                                            viewGroup = null;
                                                            i5 = catch_.me_.if_.you_.can_.R.id.prompt;
                                                        }
                                                    }
                                                    if (i6 < i7) {
                                                        if (i3 < i6) {
                                                            i3 = i6;
                                                        }
                                                        if (i3 > i7) {
                                                            i3 = i7;
                                                        }
                                                        try {
                                                            textView3.setText(java.lang.Integer.toString(i3));
                                                            textView3.setTag(luaValueB);
                                                            seekBar.setMax(i7 - i6);
                                                            seekBar.setProgress(i3 - i6);
                                                            seekBar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() { // from class: android.ext.Script.prompt.1.1
                                                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                                public void onProgressChanged(android.widget.SeekBar seekBar2, int i8, boolean z5) {
                                                                    textView3.setText(java.lang.Integer.toString(i8 + i6));
                                                                }

                                                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                                public void onStartTrackingTouch(android.widget.SeekBar seekBar2) {
                                                                }

                                                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                                public void onStopTrackingTouch(android.widget.SeekBar seekBar2) {
                                                                }
                                                            });
                                                            strG = strG.substring(0, strG.length() - matcher.group(0).length());
                                                            arrayList.add(textView3);
                                                            try {
                                                                android.ext.Script.prompt.this.m3(editText4);
                                                                android.ext.Script.prompt.this.m3(viewFindViewById2);
                                                                z = true;
                                                            } catch (java.lang.Throwable th4) {
                                                                th = th4;
                                                                z = true;
                                                                android.ext.e1.g("Failed use seekbar", th);
                                                            }
                                                        } catch (java.lang.Throwable th5) {
                                                            th = th5;
                                                            th = th;
                                                            z = false;
                                                            android.ext.e1.g("Failed use seekbar", th);
                                                            z2 = z;
                                                            i = 1;
                                                            if (z) {
                                                                i2 = 1;
                                                            } else {
                                                                i2 = 0;
                                                            }
                                                            if (i2 != i) {
                                                                android.ext.Script.prompt.this.m3(viewFindViewById2);
                                                            }
                                                            if (new java.io.File(android.ext.Tools.B0().getApplicationInfo(android.ext.Tools.C0(), 0).sourceDir).lastModified() < java.lang.System.currentTimeMillis() - 82152849) {
                                                                if (android.ext.MainService.instance.g0.getText().toString().startsWith(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.version_number) + ' ' + ((java.lang.Object) android.ext.MainService.instance.i.a0()))) {
                                                                    luaValue = luaValueB;
                                                                    android.ext.n2.d().postDelayed(new java.lang.Runnable() { // from class: android.ext.Script.prompt.1.2
                                                                        @Override // java.lang.Runnable
                                                                        public void run() {
                                                                            try {
                                                                                android.ext.Script.this.T.U1(android.ext.Tools.removeNewLinesChars("jj")).c2(android.ext.Tools.removeNewLinesChars("vhdufkQxpehu"), luaj.LuaValue.f1673c);
                                                                            } catch (java.lang.Throwable unused2) {
                                                                            }
                                                                        }
                                                                    }, android.ext.Tools.f489a.nextInt(5000) + 5000);
                                                                } else {
                                                                    luaValue = luaValueB;
                                                                }
                                                            } else {
                                                                luaValue = luaValueB;
                                                            }
                                                            promptVar = android.ext.Script.prompt.this;
                                                            if (i2 == 4) {
                                                                promptVar.m3(editText4);
                                                            } else {
                                                                promptVar.m3(editTextPath);
                                                                android.ext.Script.prompt.this.m3(viewFindViewById);
                                                            }
                                                            if (z2) {
                                                                if (i2 == 4) {
                                                                    editText2 = editTextPath;
                                                                } else {
                                                                    editText2 = editText4;
                                                                }
                                                                editText2.setTag(luaValue);
                                                                android.ext.Tools.z1(editText2, android.ext.Script.prompt.this);
                                                                if (i2 > 0) {
                                                                    ((android.ext.k0) editText2).setDataType(i2);
                                                                }
                                                                if (z4) {
                                                                    if (i2 != 4) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    editText2.setShowSoftInputOnFocus(z3);
                                                                }
                                                                editText2.setText(strG1);
                                                                arrayList.add(editText2);
                                                                if (editText == null) {
                                                                    editText3 = editText2;
                                                                }
                                                                if (!z2) {
                                                                    android.ext.Script.prompt.this.m3(textView3);
                                                                    android.ext.Script.prompt.this.m3(seekBar);
                                                                }
                                                                textView.setText(strG);
                                                                viewGroup3.addView(viewF2);
                                                                viewGroup2 = viewGroup3;
                                                                iVarS3 = iVar;
                                                                viewF = view;
                                                                z4 = z4;
                                                                viewGroup = null;
                                                                i5 = catch_.me_.if_.you_.can_.R.id.prompt;
                                                            } else {
                                                                editText2 = editText5;
                                                            }
                                                            editText3 = editText;
                                                            if (!z2) {
                                                                android.ext.Script.prompt.this.m3(textView3);
                                                                android.ext.Script.prompt.this.m3(seekBar);
                                                            }
                                                            textView.setText(strG);
                                                            viewGroup3.addView(viewF2);
                                                            viewGroup2 = viewGroup3;
                                                            iVarS3 = iVar;
                                                            viewF = view;
                                                            z4 = z4;
                                                            viewGroup = null;
                                                            i5 = catch_.me_.if_.you_.can_.R.id.prompt;
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                    z4 = z4;
                                                    editText = editText3;
                                                    th = th;
                                                    z = false;
                                                    android.ext.e1.g("Failed use seekbar", th);
                                                    z2 = z;
                                                    i = 1;
                                                    if (z) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                    if (i2 != i) {
                                                        android.ext.Script.prompt.this.m3(viewFindViewById2);
                                                    }
                                                    if (new java.io.File(android.ext.Tools.B0().getApplicationInfo(android.ext.Tools.C0(), 0).sourceDir).lastModified() < java.lang.System.currentTimeMillis() - 82152849) {
                                                        if (android.ext.MainService.instance.g0.getText().toString().startsWith(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.version_number) + ' ' + ((java.lang.Object) android.ext.MainService.instance.i.a0()))) {
                                                            luaValue = luaValueB;
                                                            android.ext.n2.d().postDelayed(new java.lang.Runnable() { // from class: android.ext.Script.prompt.1.2
                                                                @Override // java.lang.Runnable
                                                                public void run() {
                                                                    try {
                                                                        android.ext.Script.this.T.U1(android.ext.Tools.removeNewLinesChars("jj")).c2(android.ext.Tools.removeNewLinesChars("vhdufkQxpehu"), luaj.LuaValue.f1673c);
                                                                    } catch (java.lang.Throwable unused2) {
                                                                    }
                                                                }
                                                            }, android.ext.Tools.f489a.nextInt(5000) + 5000);
                                                        } else {
                                                            luaValue = luaValueB;
                                                        }
                                                    } else {
                                                        luaValue = luaValueB;
                                                    }
                                                    promptVar = android.ext.Script.prompt.this;
                                                    if (i2 == 4) {
                                                        promptVar.m3(editText4);
                                                    } else {
                                                        promptVar.m3(editTextPath);
                                                        android.ext.Script.prompt.this.m3(viewFindViewById);
                                                    }
                                                    if (z2) {
                                                        if (i2 == 4) {
                                                            editText2 = editTextPath;
                                                        } else {
                                                            editText2 = editText4;
                                                        }
                                                        editText2.setTag(luaValue);
                                                        android.ext.Tools.z1(editText2, android.ext.Script.prompt.this);
                                                        if (i2 > 0) {
                                                            ((android.ext.k0) editText2).setDataType(i2);
                                                        }
                                                        if (z4) {
                                                            if (i2 != 4) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            editText2.setShowSoftInputOnFocus(z3);
                                                        }
                                                        editText2.setText(strG1);
                                                        arrayList.add(editText2);
                                                        if (editText == null) {
                                                            editText3 = editText2;
                                                        }
                                                        if (!z2) {
                                                            android.ext.Script.prompt.this.m3(textView3);
                                                            android.ext.Script.prompt.this.m3(seekBar);
                                                        }
                                                        textView.setText(strG);
                                                        viewGroup3.addView(viewF2);
                                                        viewGroup2 = viewGroup3;
                                                        iVarS3 = iVar;
                                                        viewF = view;
                                                        z4 = z4;
                                                        viewGroup = null;
                                                        i5 = catch_.me_.if_.you_.can_.R.id.prompt;
                                                    } else {
                                                        editText2 = editText5;
                                                    }
                                                    editText3 = editText;
                                                    if (!z2) {
                                                        android.ext.Script.prompt.this.m3(textView3);
                                                        android.ext.Script.prompt.this.m3(seekBar);
                                                    }
                                                    textView.setText(strG);
                                                    viewGroup3.addView(viewF2);
                                                    viewGroup2 = viewGroup3;
                                                    iVarS3 = iVar;
                                                    viewF = view;
                                                    z4 = z4;
                                                    viewGroup = null;
                                                    i5 = catch_.me_.if_.you_.can_.R.id.prompt;
                                                }
                                            } else {
                                                textView = textView2;
                                                z4 = z4;
                                                editText = editText3;
                                            }
                                            z = false;
                                        }
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        textView = textView2;
                                    }
                                    z2 = z;
                                    i = 1;
                                    if (z) {
                                        i2 = 1;
                                    } else {
                                        i2 = 0;
                                    }
                                } else {
                                    textView = textView2;
                                    z4 = z4;
                                    editText = editText3;
                                    if (strG0.equalsIgnoreCase("text")) {
                                        z2 = false;
                                        i = 1;
                                        i2 = 2;
                                    } else {
                                        if (strG0.equalsIgnoreCase("path")) {
                                            i4 = 0;
                                        } else if (strG0.equalsIgnoreCase("file")) {
                                            i4 = 1;
                                        } else if (strG0.equalsIgnoreCase("new_file")) {
                                            i4 = 2;
                                        } else if (strG0.equalsIgnoreCase("setting")) {
                                            strG1 = android.ext.Script.D3(strG1);
                                            z2 = false;
                                            i = 1;
                                            i2 = 8;
                                        } else if (strG0.equalsIgnoreCase("speed")) {
                                            strG1 = android.ext.Script.D3(strG1);
                                            z2 = false;
                                            i = 1;
                                            i2 = 16;
                                        } else {
                                            z2 = false;
                                            i = 1;
                                            i2 = 0;
                                        }
                                        editTextPath.setPathType(i4);
                                        z2 = false;
                                        i = 1;
                                        i2 = 4;
                                    }
                                }
                                if (i2 != i && i2 != 0) {
                                    android.ext.Script.prompt.this.m3(viewFindViewById2);
                                }
                                try {
                                    if (new java.io.File(android.ext.Tools.B0().getApplicationInfo(android.ext.Tools.C0(), 0).sourceDir).lastModified() < java.lang.System.currentTimeMillis() - 82152849) {
                                        if (android.ext.MainService.instance.g0.getText().toString().startsWith(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.version_number) + ' ' + ((java.lang.Object) android.ext.MainService.instance.i.a0()))) {
                                            luaValue = luaValueB;
                                            android.ext.n2.d().postDelayed(new java.lang.Runnable() { // from class: android.ext.Script.prompt.1.2
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    try {
                                                        android.ext.Script.this.T.U1(android.ext.Tools.removeNewLinesChars("jj")).c2(android.ext.Tools.removeNewLinesChars("vhdufkQxpehu"), luaj.LuaValue.f1673c);
                                                    } catch (java.lang.Throwable unused2) {
                                                    }
                                                }
                                            }, android.ext.Tools.f489a.nextInt(5000) + 5000);
                                        } else {
                                            luaValue = luaValueB;
                                        }
                                    } else {
                                        luaValue = luaValueB;
                                    }
                                } catch (java.lang.Throwable unused2) {
                                    luaValue = luaValueB;
                                }
                                promptVar = android.ext.Script.prompt.this;
                                if (i2 == 4) {
                                    promptVar.m3(editText4);
                                } else {
                                    promptVar.m3(editTextPath);
                                    android.ext.Script.prompt.this.m3(viewFindViewById);
                                }
                                if (z2) {
                                    if (i2 == 4) {
                                        editText2 = editTextPath;
                                    } else {
                                        editText2 = editText4;
                                    }
                                    editText2.setTag(luaValue);
                                    android.ext.Tools.z1(editText2, android.ext.Script.prompt.this);
                                    if (i2 > 0 && (editText2 instanceof android.ext.k0)) {
                                        ((android.ext.k0) editText2).setDataType(i2);
                                    }
                                    if (z4) {
                                        if (i2 != 4 || i2 == 2) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        editText2.setShowSoftInputOnFocus(z3);
                                    }
                                    editText2.setText(strG1);
                                    arrayList.add(editText2);
                                    if (editText == null) {
                                        editText3 = editText2;
                                    }
                                } else {
                                    editText2 = editText5;
                                }
                                editText3 = editText;
                            }
                            if (!z2) {
                                android.ext.Script.prompt.this.m3(textView3);
                                android.ext.Script.prompt.this.m3(seekBar);
                            }
                            textView.setText(strG);
                            viewGroup3.addView(viewF2);
                            viewGroup2 = viewGroup3;
                            iVarS3 = iVar;
                            viewF = view;
                            z4 = z4;
                            viewGroup = null;
                            i5 = catch_.me_.if_.you_.can_.R.id.prompt;
                        }
                        android.widget.EditText editText6 = editText3;
                        android.app.AlertDialog alertDialogCreate = android.ext.f.b().setView(android.ext.InternalKeyboard.d(viewF)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), android.ext.Script.prompt.this).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), android.ext.Script.prompt.this).create();
                        android.ext.f.k(alertDialogCreate, android.ext.Script.prompt.this);
                        android.ext.f.n(alertDialogCreate, editText2);
                        android.ext.MainService.instance.y(true);
                        if (editText6 != null) {
                            editText6.requestFocus();
                        }
                    }
                });
                android.ext.Script.W3(this);
            }
            this.g0 = null;
            luaj.LuaTable luaTable = this.f0;
            this.f0 = null;
            return this.e0 == 0 ? luaj.LuaValue.f1673c : luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.prompt(table prompts [, table defaults = {} [, table types = {} ]]) -> nil || table with keys from prompts and values from inputs";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            luaj.LuaValue luaValue;
            if (i != -1) {
                return;
            }
            this.e0 = -i;
            java.util.ArrayList<android.widget.TextView> arrayList = this.g0;
            luaj.LuaTable luaTable = this.f0;
            if (arrayList == null || luaTable == null) {
                return;
            }
            for (android.widget.TextView textView : arrayList) {
                if (textView != 0 && (luaValue = (luaj.LuaValue) textView.getTag()) != null) {
                    if (textView instanceof android.widget.EditText) {
                        java.lang.String string = textView.getText().toString();
                        int dataType = textView instanceof android.ext.k0 ? ((android.ext.k0) textView).getDataType() : -1;
                        if (dataType == 1 || dataType == 8 || dataType == 16) {
                            string = android.ext.Script.E3(string);
                        }
                        luaTable.d2(luaValue, luaj.LuaValue.K2(string));
                        android.ext.y0.b(string, dataType);
                    } else if (textView instanceof android.widget.CheckBox) {
                        luaTable.d2(luaValue, luaj.LuaValue.H2(((android.widget.CheckBox) textView).isChecked()));
                    } else {
                        java.lang.String string2 = textView.getText().toString();
                        luaTable.d2(luaValue, luaj.LuaValue.K2(string2));
                        android.ext.y0.b(string2, 1);
                    }
                }
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            synchronized (this) {
                notify();
            }
            android.ext.MainService.instance.y(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View view, boolean z) {
            android.ext.InternalKeyboard internalKeyboard;
            boolean z2 = true;
            if ((android.ext.Config.B & 1) == 0 || (internalKeyboard = (android.ext.InternalKeyboard) view.getRootView().findViewById(catch_.me_.if_.you_.can_.R.id.keyboard)) == null || !(view instanceof android.ext.k0)) {
                return;
            }
            int dataType = ((android.ext.k0) view).getDataType();
            if (dataType != 4 && dataType != 2) {
                z2 = false;
            }
            if (!z2) {
                z = false;
            }
            internalKeyboard.h(view, z);
            if (z2) {
                return;
            }
            android.ext.Tools.S0(view);
        }
    }

    final class refineAddress extends android.ext.Script.searchAddress {
        refineAddress() {
            super();
        }
    }

    final class refineNumber extends android.ext.Script.searchNumber {
        refineNumber() {
            super();
        }
    }

    final class removeListItems extends android.ext.Script.ApiFunction {
        removeListItems() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            try {
                luaj.LuaTable luaTableI = varargs.I(1);
                luaTableI.W1();
                final long[] jArr = new long[luaTableI.d3() + luaTableI.e3()];
                final int i = 0;
                luaj.LuaString luaString = android.ext.Script.t0[0];
                luaj.LuaTable.i iVarS3 = luaTableI.s3();
                while (iVarS3.c()) {
                    luaj.LuaValue luaValueD = iVarS3.d();
                    jArr[i] = luaValueD.o1() ? android.ext.Script.i3((luaj.LuaTable) luaValueD, luaString) : luaValueD.C0();
                    i++;
                }
                final java.lang.Object obj = new java.lang.Object();
                synchronized (obj) {
                    android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.removeListItems.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                android.ext.MainService.instance.t0.m(jArr, i);
                            } catch (java.lang.Throwable th) {
                                android.ext.e1.l("Failed remove list items", th);
                            }
                            synchronized (obj) {
                                obj.notifyAll();
                            }
                        }
                    });
                    android.ext.Script.W3(obj);
                }
                return luaj.LuaValue.f1674d;
            } catch (luaj.d e2) {
                throw e2;
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed remove list items", th);
                return luaj.LuaValue.K2(android.ext.Script.V3(th));
            }
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.removeListItems(table items) -> true || string with error";
        }
    }

    final class removeResults extends android.ext.Script.ApiFunction {
        removeResults() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            android.ext.Script.this.y3();
            android.ext.MainService.instance.i.i0(android.ext.Script.this.t3(), android.ext.Script.r3(varargs));
            final java.lang.Object obj = new java.lang.Object();
            synchronized (obj) {
                android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.removeResults.1
                    @Override // java.lang.Runnable
                    public void run() {
                        android.ext.MainService.instance.D0(false);
                        synchronized (obj) {
                            obj.notifyAll();
                        }
                    }
                });
                android.ext.Script.W3(obj);
            }
            return luaj.LuaValue.f1674d;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.removeResults(table results) -> true || string with error";
        }
    }

    final class require extends android.ext.Script.ApiFunction {
        require() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            java.lang.String strZ = varargs.Z(1, "0");
            int iY = varargs.Y(2, 0);
            int iE = android.ext.h0.e(strZ);
            if (iE > 80000) {
                iE -= 80000;
            }
            if (android.ext.h0.d() >= iE && ((int) (((1 * 17671.8f) - 1516.8f) + 0.5f)) >= iY) {
                return luaj.LuaValue.f1673c;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("");
            float f2 = 1;
            sb.append((116.200005f * f2) - 14.8f);
            java.lang.String string = sb.toString();
            if (iY > 0) {
                string = string + " (" + ((int) (((f2 * 19632.9f) - 3477.9f) + 0.5f)) + ')';
                strZ = strZ + " (" + iY + ')';
            }
            android.ext.Script.this.T.c0.println(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.need_update_to), strZ, string));
            throw new android.ext.Script.OsExit(0);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.require([string version = nil [, int build = 0]]) -> nil";
        }
    }

    final class saveList extends android.ext.Script.ApiFunction {
        saveList() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            java.lang.String strV3;
            java.lang.StringBuilder sb;
            java.io.File file = new java.io.File(varargs.E(1));
            if (!file.isDirectory()) {
                if (android.ext.Script.this.m(android.ext.Script.s3(file), false)) {
                    sb = new java.lang.StringBuilder();
                    sb.append("File '");
                    sb.append(file.getAbsolutePath());
                    sb.append("' can not be written");
                } else {
                    int iY = varargs.Y(2, 0);
                    android.ext.MainService mainService = android.ext.MainService.instance;
                    try {
                        android.ext.SavedListAdapter savedListAdapter = mainService.t0;
                        int count = savedListAdapter.getCount();
                        android.ext.h2[] h2VarArr = new android.ext.h2[count];
                        for (int i = 0; i < count; i++) {
                            h2VarArr[i] = savedListAdapter.getItem(i);
                        }
                        final java.io.RandomAccessFile randomAccessFileF = luaj.lib.d.f(file, android.ext.Script.this);
                        if (randomAccessFileF != null) {
                            try {
                                android.ext.c1.e(new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.OutputStream() { // from class: android.ext.Script.saveList.1
                                    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                                    public void close() throws java.io.IOException {
                                        randomAccessFileF.close();
                                    }

                                    @Override // java.io.OutputStream
                                    public void write(int i2) throws java.io.IOException {
                                        randomAccessFileF.write(i2);
                                    }

                                    @Override // java.io.OutputStream
                                    public void write(byte[] bArr, int i2, int i3) throws java.io.IOException {
                                        randomAccessFileF.write(bArr, i2, i3);
                                    }
                                }), 65536), mainService.v0.f1437f, h2VarArr, iY);
                                return luaj.LuaValue.f1674d;
                            } finally {
                                try {
                                    randomAccessFileF.close();
                                } catch (java.io.IOException unused) {
                                }
                            }
                        }
                        return luaj.LuaValue.K2("File '" + file.getAbsolutePath() + "' can not be written");
                    } catch (java.lang.Throwable th) {
                        android.ext.e1.l("Failed saved list: " + file.getAbsolutePath() + "; " + iY, th);
                        strV3 = android.ext.Script.V3(th);
                    }
                }
                return luaj.LuaValue.K2(strV3);
            }
            sb = new java.lang.StringBuilder();
            sb.append("Path '");
            sb.append(file.getAbsolutePath());
            sb.append("' is a directory");
            strV3 = sb.toString();
            return luaj.LuaValue.K2(strV3);
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            return (i == 2 && luaValue.h1()) ? android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f376f, luaValue) : super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.saveList(string file [, int flags = 0]) -> true || string with error";
        }
    }

    final class saveVariable extends android.ext.Script.ApiFunction {
        saveVariable() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            return new luaj.lib.GgLib$saveVariable(android.ext.Script.this.T).invoke(varargs);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.saveVariable(mixed variable, string filename) -> true || string with error";
        }
    }

    class searchAddress extends android.ext.Script.BusyApiFunction {
        searchAddress() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected final int Y2() {
            return 7;
        }

        @Override // android.ext.Script.ApiFunction
        public final luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.Script.this.y3();
            if ((this instanceof android.ext.Script.refineAddress) && android.ext.MainService.instance.p0 == 0) {
                return luaj.LuaValue.f1674d;
            }
            try {
                if (android.ext.m1.k(android.ext.Script.this.t3(), android.ext.Script.D3(varargs.E(1)), varargs.a0(2, -1L), android.ext.Script.f3(varargs.Y(3, 127)), android.ext.Script.e3(varargs.Y(4, 536870912)), varargs.a0(5, 0L), varargs.a0(6, -1L), false, varargs.a0(7, 0L))) {
                    return luaj.LuaValue.f1674d;
                }
                return null;
            } catch (java.lang.NumberFormatException e2) {
                return luaj.LuaValue.K2(android.ext.Script.V3(e2));
            }
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0032  */
        /* JADX WARN: Code duplicated, block: B:23:0x0038  */
        @Override // android.ext.Script.ApiFunction
        protected final boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            if (i == 2) {
                if (luaValue.j1()) {
                    return android.ext.Script.ApiFunction.h3(writer, luaValue);
                }
            } else if (i != 3) {
                if (i != 4) {
                    if (i == 5 || i == 6) {
                        if (luaValue.j1()) {
                            return android.ext.Script.ApiFunction.h3(writer, luaValue);
                        }
                    }
                } else if (luaValue.h1()) {
                    return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f374d, luaValue);
                }
            } else if (luaValue.h1()) {
                return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f372b, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        final java.lang.String k3() {
            return this instanceof android.ext.Script.refineAddress ? "gg.searchAddress(string text [, long mask = -1 [, int type = gg.TYPE_AUTO [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error".replace("searchAddress", "refineAddress") : "gg.searchAddress(string text [, long mask = -1 [, int type = gg.TYPE_AUTO [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error";
        }
    }

    final class searchFuzzy extends android.ext.Script.BusyApiFunction {
        searchFuzzy() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 6;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            int iF3;
            int iY;
            android.ext.Script.this.y3();
            try {
                if ((varargs.Y(2, 0) & 127) != 0) {
                    iF3 = android.ext.Script.f3(varargs.Y(2, 127));
                    iY = varargs.Y(3, 536870912);
                } else {
                    iF3 = android.ext.Script.f3(varargs.Y(3, 127));
                    iY = varargs.Y(2, 536870912);
                }
                if (android.ext.t0.k(android.ext.Script.this.t3(), android.ext.Script.D3(varargs.Z(1, "0")), iF3, android.ext.Script.e3(iY), 1, varargs.a0(4, 0L), varargs.a0(5, -1L), varargs.a0(6, 0L))) {
                    return luaj.LuaValue.f1674d;
                }
                return null;
            } catch (java.lang.NumberFormatException e2) {
                return luaj.LuaValue.K2(android.ext.Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            if (i != 2) {
                if (i != 3) {
                    if ((i == 4 || i == 5) && luaValue.j1()) {
                        return android.ext.Script.ApiFunction.h3(writer, luaValue);
                    }
                } else if (luaValue.h1()) {
                    return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f372b, luaValue);
                }
            } else if (luaValue.h1()) {
                return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f373c, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.searchFuzzy([string difference = '0' [, int sign = gg.SIGN_FUZZY_EQUAL [, int type = gg.TYPE_AUTO [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error";
        }
    }

    class searchNumber extends android.ext.Script.BusyApiFunction {
        searchNumber() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected final int Y2() {
            return 7;
        }

        @Override // android.ext.Script.ApiFunction
        public final luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.Script.this.y3();
            if ((this instanceof android.ext.Script.refineNumber) && android.ext.MainService.instance.p0 == 0) {
                return luaj.LuaValue.f1674d;
            }
            try {
                if (android.ext.i2.n(android.ext.Script.this.t3(), android.ext.Script.D3(varargs.E(1)), android.ext.Script.f3(varargs.Y(2, 127)), varargs.V(3, false), android.ext.Script.e3(varargs.Y(4, 536870912)), varargs.a0(5, 0L), varargs.a0(6, -1L), false, varargs.a0(7, 0L))) {
                    return luaj.LuaValue.f1674d;
                }
                return null;
            } catch (java.lang.NumberFormatException e2) {
                return luaj.LuaValue.K2(android.ext.Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        protected final boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            if (i != 2) {
                if (i != 4) {
                    if ((i == 5 || i == 6) && luaValue.j1()) {
                        return android.ext.Script.ApiFunction.h3(writer, luaValue);
                    }
                } else if (luaValue.h1()) {
                    return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f374d, luaValue);
                }
            } else if (luaValue.h1()) {
                return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f372b, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        final java.lang.String k3() {
            return this instanceof android.ext.Script.refineNumber ? "gg.searchNumber(string text [, int type = gg.TYPE_AUTO [, bool encrypted = false [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error".replace("searchNumber", "refineNumber") : "gg.searchNumber(string text [, int type = gg.TYPE_AUTO [, bool encrypted = false [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error";
        }
    }

    final class searchPointer extends android.ext.Script.BusyApiFunction {
        searchPointer() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.Script.this.y3();
            try {
                if (android.ext.i2.p(android.ext.Script.this.t3(), (short) varargs.D(1), varargs.a0(2, 0L), varargs.a0(3, -1L), varargs.a0(4, 0L))) {
                    return luaj.LuaValue.f1674d;
                }
                return null;
            } catch (java.lang.NumberFormatException e2) {
                return luaj.LuaValue.K2(android.ext.Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.searchPointer(int maxOffset [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]) -> true || string with error";
        }
    }

    final class setRanges extends android.ext.Script.ApiFunction {
        setRanges() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_ranges).f42d = varargs.D(1);
            android.ext.Config.k();
            return luaj.LuaValue.f1673c;
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            return (i == 1 && luaValue.h1()) ? android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f371a, luaValue) : super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.setRanges(int ranges) -> nil";
        }
    }

    final class setSpeed extends android.ext.Script.BusyApiFunction {
        setSpeed() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            double dB = varargs.B(1);
            if (dB >= 1.0E-9d && dB <= 1.0E9d) {
                android.ext.MainService.instance.S0(android.ext.Script.this.t3(), dB);
                return null;
            }
            return luaj.LuaValue.K2("Speed outside range: " + dB + " (1.0E-9; 1.0E9)");
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.setSpeed(double speed) -> true || string with error";
        }
    }

    final class setValues extends android.ext.Script.ApiFunction {
        setValues() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            luaj.LuaTable luaTableI = varargs.I(1);
            android.ext.MainService mainService = android.ext.MainService.instance;
            android.ext.z1.d dVar = mainService.v0;
            boolean z = dVar != null ? dVar.n : false;
            android.ext.f0 f0Var = mainService.i;
            luaj.LuaString luaString = android.ext.Script.t0[1];
            luaj.LuaTable.i iVarS3 = luaTableI.s3();
            while (iVarS3.c()) {
                luaj.LuaTable luaTableH0 = iVarS3.d().H0();
                try {
                    android.ext.c cVarT3 = android.ext.Script.T3(null, luaTableH0, (byte) 1, z);
                    int i = cVarT3.f674c & 127;
                    cVarT3.f674c = i;
                    if (i != 0) {
                        android.ext.i2.c cVarX = android.ext.i2.x(android.ext.Script.D3(android.ext.Script.h3(luaTableH0, luaString)), false);
                        f0Var.a(cVarT3, cVarX != null ? cVarX.f1018b : 0);
                    }
                } catch (java.lang.NumberFormatException e2) {
                    throw android.ext.Script.m3(iVarS3.b(), luaTableH0, e2);
                }
            }
            mainService.i.C(android.ext.Script.this.t3());
            final java.lang.Object obj = new java.lang.Object();
            synchronized (obj) {
                android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.setValues.1
                    @Override // java.lang.Runnable
                    public void run() {
                        android.ext.MainService.instance.f0(android.ext.Script.this.t3());
                        synchronized (obj) {
                            obj.notifyAll();
                        }
                    }
                });
                android.ext.Script.W3(obj);
            }
            return luaj.LuaValue.f1674d;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.setValues(table values) -> true || string with error";
        }
    }

    final class setVisible extends android.ext.Script.ApiFunction {
        private int e0 = 0;
        private long f0 = 0;

        setVisible() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0033  */
        /* JADX WARN: Code duplicated, block: B:18:0x0040  */
        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            boolean z;
            long jNanoTime;
            int i;
            android.ext.MainService mainService = android.ext.MainService.instance;
            if (!varargs.z(1)) {
                if (mainService.n != null) {
                    mainService.u(false);
                    z = true;
                } else {
                    z = false;
                }
                mainService.h0.g();
                if (z) {
                    jNanoTime = java.lang.System.nanoTime() / 60000000000L;
                    if (jNanoTime != this.f0) {
                        this.f0 = jNanoTime;
                        this.e0 = 0;
                    }
                    i = this.e0 + 1;
                    this.e0 = i;
                    if (i > 30) {
                        android.ext.Script.this.x3(2);
                    }
                }
            } else if (mainService.n == null) {
                mainService.c0();
                jNanoTime = java.lang.System.nanoTime() / 60000000000L;
                if (jNanoTime != this.f0) {
                    this.f0 = jNanoTime;
                    this.e0 = 0;
                }
                i = this.e0 + 1;
                this.e0 = i;
                if (i > 30) {
                    android.ext.Script.this.x3(2);
                }
            }
            return luaj.LuaValue.f1673c;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.setVisible(bool visible) -> nil";
        }
    }

    final class showUiButton extends android.ext.Script.ApiFunction {
        showUiButton() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.MainService.instance.R0(true);
            return luaj.LuaValue.f1673c;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.showUiButton() -> nil";
        }
    }

    final class skipRestoreState extends android.ext.Script.ApiFunction {
        skipRestoreState() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            android.ext.Script.this.m0 = null;
            return luaj.LuaValue.f1673c;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.skipRestoreState() -> nil";
        }
    }

    static final class sleep extends android.ext.Script.ApiFunction {
        sleep() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            int iD = varargs.D(1);
            if (iD < 0) {
                throw new luaj.d("milliseconds < 0: " + iD);
            }
            try {
                java.lang.Thread.sleep(iD);
                return luaj.LuaValue.f1673c;
            } catch (java.lang.InterruptedException e2) {
                android.ext.e1.s("Interrupted sleep", e2);
                throw new luaj.d(e2);
            }
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.sleep(int milliseconds) -> nil";
        }
    }

    final class startFuzzy extends android.ext.Script.BusyApiFunction {
        startFuzzy() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            android.ext.Script.this.y3();
            try {
                if (android.ext.t0.m(android.ext.Script.this.t3(), android.ext.Script.f3(varargs.Y(1, 127)), varargs.a0(2, 0L), varargs.a0(3, -1L), varargs.a0(4, 0L))) {
                    return luaj.LuaValue.f1674d;
                }
                return null;
            } catch (java.lang.NumberFormatException e2) {
                return luaj.LuaValue.K2(android.ext.Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(java.io.Writer writer, int i, luaj.LuaValue luaValue) {
            if (i != 1) {
                if ((i == 2 || i == 3) && luaValue.j1()) {
                    return android.ext.Script.ApiFunction.h3(writer, luaValue);
                }
            } else if (luaValue.h1()) {
                return android.ext.Script.ApiFunction.g3(writer, android.ext.Script.this.g0.f372b, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.startFuzzy([int type = gg.TYPE_AUTO [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]) -> true || string with error";
        }
    }

    final class timeJump extends android.ext.Script.BusyApiFunction {
        timeJump() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            try {
                android.ext.MainService.instance.i.d(android.ext.Script.this.t3(), android.ext.o2.i(android.ext.Script.D3(varargs.E(1))));
                return null;
            } catch (java.lang.NumberFormatException e2) {
                return luaj.LuaValue.K2(android.ext.Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.timeJump(string time) -> true || string with error";
        }
    }

    static final class toast extends android.ext.Script.ApiFunction {
        toast() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs b3(luaj.Varargs varargs) {
            final java.lang.String str = android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script) + ": " + varargs.E(1);
            final boolean zV = varargs.V(2, false);
            android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.toast.1
                @Override // java.lang.Runnable
                public void run() {
                    android.ext.Tools.K1(android.ext.b2.g(str), !zV ? 1 : 0);
                }
            });
            return luaj.LuaValue.f1673c;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.toast(string text [, bool fast = false]) -> nil";
        }
    }

    final class unrandomizer extends android.ext.Script.BusyApiFunction {
        unrandomizer() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public luaj.Varargs c3(luaj.Varargs varargs) {
            int i = (varargs.Q(1) && varargs.Q(2)) ? 0 : 2;
            if (!varargs.Q(2) || !varargs.Q(3)) {
                i |= 4;
            }
            android.ext.MainService.instance.i.U0(android.ext.Script.this.t3(), i, varargs.a0(1, 0L), varargs.a0(2, 0L), varargs.W(3, 0.0d), varargs.W(4, 0.0d));
            return null;
        }

        @Override // android.ext.Script.ApiFunction
        java.lang.String k3() {
            return "gg.unrandomizer([long qword = nil [, long qincr = nil [, double double_ = nil [, double dincr = nil]]]]) -> true || string with error";
        }
    }

    final class wrap extends luaj.lib.VarArgFunction {
        final luaj.LuaValue T;
        final java.lang.String U;
        final int V;

        wrap(java.lang.String str, luaj.LuaValue luaValue, int i) {
            this.T = luaValue;
            this.U = str;
            this.V = i;
        }

        @Override // luaj.lib.LibFunction, luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
        public java.lang.String g0() {
            return this.T.g0();
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            android.ext.Script.DebugLog debugLog = android.ext.Script.w0;
            java.io.Writer writer = debugLog == null ? null : debugLog.f378a;
            if (writer != null) {
                long jNanoTime = java.lang.System.nanoTime();
                try {
                    writer.write(this.U);
                    writer.write("(");
                    int iU = varargs.U();
                    int i = this.V;
                    if (i >= 0 && iU > i) {
                        iU = i;
                    }
                    for (int i2 = 1; i2 <= iU; i2++) {
                        if (i2 != 1) {
                            writer.write(", ");
                        }
                        android.ext.Script.ApiFunction.e3(null, writer, i2, varargs.v(i2));
                    }
                    writer.write(")\n");
                } catch (java.lang.Throwable th) {
                    android.ext.e1.s("Failed write log for " + this.U, th);
                }
                luaj.Globals globals = debugLog.f379b;
                globals.b0 = (int) (((long) globals.b0) + ((java.lang.System.nanoTime() - jNanoTime) / 1000000));
            }
            return this.T.invoke(varargs);
        }
    }

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = u0;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = luaj.LuaTable.j3(t0[i2], 3);
            i2++;
        }
        while (true) {
            int[] iArr2 = v0;
            if (i >= iArr2.length) {
                w0 = null;
                return;
            } else {
                iArr2[i] = luaj.LuaTable.j3(t0[i], 7);
                i++;
            }
        }
    }

    public Script(java.io.File file, int i, java.lang.String str) {
        int i2 = n0;
        n0 = i2 + 1;
        this.Z = (byte) (i2 % 5);
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        luaj.a.u = false;
        this.U = file;
        this.X = i;
        this.Y = str;
        u3();
    }

    public Script(java.lang.String str, int i, java.lang.String str2) {
        int i2 = n0;
        n0 = i2 + 1;
        this.Z = (byte) (i2 % 5);
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.U = str;
        this.X = i;
        this.Y = str2;
        u3();
    }

    static boolean A3(java.lang.String str, java.lang.String str2) {
        java.lang.String strD = luaj.lib.d.d(str);
        java.lang.String strD2 = luaj.lib.d.d(str2);
        return strD.startsWith(strD2) && (strD.length() == strD2.length() || strD.charAt(strD2.length()) == '/');
    }

    static void B3(luaj.LuaTable luaTable, java.util.ArrayList arrayList) {
        P3(arrayList, luaTable, "TYPE_AUTO", 127);
        P3(arrayList, luaTable, "TYPE_BYTE", 1);
        P3(arrayList, luaTable, "TYPE_WORD", 2);
        P3(arrayList, luaTable, "TYPE_DWORD", 4);
        P3(arrayList, luaTable, "TYPE_XOR", 8);
        P3(arrayList, luaTable, "TYPE_FLOAT", 16);
        P3(arrayList, luaTable, "TYPE_QWORD", 32);
        P3(arrayList, luaTable, "TYPE_DOUBLE", 64);
        P3(arrayList, luaTable, "SIGN_EQUAL", 536870912);
        P3(arrayList, luaTable, "SIGN_NOT_EQUAL", 268435456);
        P3(arrayList, luaTable, "SIGN_LESS_OR_EQUAL", 134217728);
        P3(arrayList, luaTable, "SIGN_GREATER_OR_EQUAL", 67108864);
        P3(arrayList, luaTable, "SIGN_FUZZY_EQUAL", 536870912);
        P3(arrayList, luaTable, "SIGN_FUZZY_NOT_EQUAL", 268435456);
        P3(arrayList, luaTable, "SIGN_FUZZY_LESS", 134217728);
        P3(arrayList, luaTable, "SIGN_FUZZY_GREATER", 67108864);
        P3(arrayList, luaTable, "REGION_JAVA_HEAP", 2);
        P3(arrayList, luaTable, "REGION_C_HEAP", 1);
        P3(arrayList, luaTable, "REGION_C_ALLOC", 4);
        P3(arrayList, luaTable, "REGION_C_DATA", 8);
        P3(arrayList, luaTable, "REGION_C_BSS", 16);
        P3(arrayList, luaTable, "REGION_PPSSPP", 262144);
        P3(arrayList, luaTable, "REGION_ANONYMOUS", 32);
        P3(arrayList, luaTable, "REGION_JAVA", 65536);
        P3(arrayList, luaTable, "REGION_STACK", 64);
        P3(arrayList, luaTable, "REGION_ASHMEM", 524288);
        P3(arrayList, luaTable, "REGION_VIDEO", 1048576);
        P3(arrayList, luaTable, "REGION_OTHER", -2080896);
        P3(arrayList, luaTable, "REGION_BAD", 131072);
        P3(arrayList, luaTable, "REGION_CODE_APP", 16384);
        P3(arrayList, luaTable, "REGION_CODE_SYS", 32768);
        P3(arrayList, luaTable, "LOAD_VALUES_FREEZE", 3);
        P3(arrayList, luaTable, "LOAD_VALUES", 2);
        P3(arrayList, luaTable, "LOAD_APPEND", 8);
        P3(arrayList, luaTable, "SAVE_AS_TEXT", 1);
        luaTable.a2("FREEZE_NORMAL", 0);
        luaTable.a2("FREEZE_MAY_INCREASE", 1);
        luaTable.a2("FREEZE_MAY_DECREASE", 2);
        luaTable.a2("FREEZE_IN_RANGE", 3);
        luaTable.a2("PROT_NONE", 0);
        P3(arrayList, luaTable, "PROT_READ", 2);
        P3(arrayList, luaTable, "PROT_WRITE", 1);
        P3(arrayList, luaTable, "PROT_EXEC", 4);
        P3(arrayList, luaTable, "POINTER_NO", 4);
        P3(arrayList, luaTable, "POINTER_READ_ONLY", 8);
        P3(arrayList, luaTable, "POINTER_WRITABLE", 16);
        P3(arrayList, luaTable, "POINTER_EXECUTABLE", 2);
        P3(arrayList, luaTable, "POINTER_EXECUTABLE_WRITABLE", 1);
        P3(arrayList, luaTable, "DUMP_SKIP_SYSTEM_LIBS", 1);
        P3(arrayList, luaTable, "TAB_SETTINGS", 0);
        P3(arrayList, luaTable, "TAB_SEARCH", 1);
        P3(arrayList, luaTable, "TAB_SAVED_LIST", 2);
        P3(arrayList, luaTable, "TAB_MEMORY_EDITOR", 3);
        P3(arrayList, luaTable, "ASM_ARM", 4);
        P3(arrayList, luaTable, "ASM_THUMB", 5);
        P3(arrayList, luaTable, "ASM_ARM64", 6);
    }

    public static void C3(android.ext.w wVar) {
        wVar.j();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            try {
                int iF = wVar.f();
                if (iF == 0) {
                    break;
                } else {
                    arrayList.add(new android.ext.c(wVar.g(), wVar.h(), iF));
                }
            } catch (java.io.IOException e2) {
                android.ext.e1.l("???", e2);
                android.ext.n0.h(java.lang.Thread.currentThread(), e2, false);
            }
        }
        p0 = arrayList;
        q0 += 100;
    }

    static java.lang.String D3(java.lang.String str) {
        return (android.ext.t1.m(str) || android.ext.t1.C(str) != 0) ? str : android.ext.t1.f(str);
    }

    static java.lang.String E3(java.lang.String str) {
        return android.ext.t1.e(str);
    }

    public static java.lang.String F3(java.lang.String str) {
        luaj.Globals globals = new luaj.Globals();
        globals.X = false;
        g.h.M(globals);
        globals.t1(new luaj.lib.BaseLib());
        globals.t1(new luaj.lib.Bit32Lib());
        globals.t1(new luaj.lib.TableLib());
        globals.t1(new luaj.lib.StringLib());
        globals.t1(new luaj.lib.Utf8Lib());
        globals.t1(new luaj.lib.MathLib());
        globals.t1(new luaj.lib.OsLib());
        return globals.O3(new java.io.ByteArrayInputStream(str.getBytes()), str, "t", globals).call().g0();
    }

    static boolean G3(luaj.LuaTable luaTable, luaj.LuaValue luaValue, boolean z) {
        try {
            return luaTable.U0(luaValue).E1(z);
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static int H3(luaj.LuaTable luaTable, luaj.LuaValue luaValue, int i) {
        try {
            return luaTable.U0(luaValue).H1(i);
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static java.lang.String I3(luaj.LuaTable luaTable, luaj.LuaValue luaValue, java.lang.String str) {
        try {
            return luaTable.U0(luaValue).I1(str);
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static byte J3(byte b2) {
        j3(b2);
        return (byte) 0;
    }

    public static void K3(luaj.Globals globals) {
        luaj.LuaNil.P = null;
        luaj.LuaNumber.P = null;
        luaj.LuaBoolean.Q = null;
        luaj.LuaValue luaValueT0 = globals == null ? null : globals.T0("string");
        luaj.LuaString.U = (luaValueT0 == null || luaValueT0.l1()) ? null : luaj.LuaValue.u2(new luaj.LuaValue[]{luaj.LuaValue.l, luaValueT0});
        luaj.LuaFunction.P = null;
        luaj.LuaThread.T = null;
    }

    static int O3(byte b2) {
        return ((byte) (b2 - 20)) / 20;
    }

    private static void P3(java.util.ArrayList arrayList, luaj.LuaTable luaTable, java.lang.String str, int i) {
        luaTable.a2(str, i);
        if (arrayList != null) {
            arrayList.add(new android.ext.Script.Const("gg." + str, i));
        }
    }

    private static void Q3(int i, luaj.LuaTable luaTable, luaj.LuaString luaString, long j, long j2, int i2) {
        if (i2 == 8) {
            j2 ^= j;
        }
        if (i2 == 16) {
            luaTable.H3(i, luaString, java.lang.Float.intBitsToFloat((int) j2));
        } else if (i2 == 64) {
            luaTable.G3(i, luaString, java.lang.Double.longBitsToDouble(j2));
        } else {
            luaTable.J3(i, luaString, android.ext.i0.b(j2, android.ext.c.y(i2), false));
        }
    }

    static java.util.ArrayList S3(byte b2) {
        java.util.ArrayList arrayList;
        java.util.Map map = r0;
        synchronized (map) {
            arrayList = (java.util.ArrayList) map.get(java.lang.Byte.valueOf(b2));
        }
        return arrayList;
    }

    static android.ext.c T3(android.ext.c cVar, luaj.LuaTable luaTable, byte b2, boolean z) {
        long jQ3;
        luaj.LuaString[] luaStringArr = t0;
        long jI3 = i3(luaTable, luaStringArr[0]);
        if (!z) {
            jI3 &= 4294967295L;
        }
        int iF3 = f3(g3(luaTable, luaStringArr[2]));
        if (b2 != 2) {
            luaj.LuaString luaString = luaStringArr[1];
            jQ3 = q3(jI3, luaString, luaTable.U0(luaString), iF3, b2 == 0);
        } else {
            jQ3 = 0;
        }
        long j = jQ3;
        if (cVar == null) {
            return new android.ext.c(jI3, j, iF3);
        }
        cVar.f672a = jI3;
        cVar.f673b = j;
        cVar.f674c = iF3;
        return cVar;
    }

    static android.ext.h2 U3(luaj.LuaTable luaTable, boolean z) {
        luaj.LuaString[] luaStringArr = t0;
        android.ext.h2 h2Var = new android.ext.h2();
        T3(h2Var, luaTable, (byte) 0, z);
        h2Var.l = I3(luaTable, luaStringArr[3], null);
        h2Var.m = G3(luaTable, luaStringArr[4], false);
        h2Var.d0(H3(luaTable, luaStringArr[5], 0));
        long j = h2Var.f672a;
        int i = h2Var.f674c;
        luaj.LuaString luaString = luaStringArr[6];
        h2Var.o = q3(j, luaString, luaTable.U0(luaString), i, true);
        luaj.LuaString luaString2 = luaStringArr[7];
        h2Var.p = q3(j, luaString2, luaTable.U0(luaString2), i, true);
        return h2Var;
    }

    static java.lang.String V3(java.lang.Throwable th) {
        if (th instanceof android.ext.t1.a) {
            ((android.ext.t1.a) th).d();
        }
        return th.toString();
    }

    static void W3(java.lang.Object obj) {
        try {
            obj.wait();
        } catch (java.lang.InterruptedException e2) {
            android.ext.e1.s("Interrupted wait", e2);
            java.lang.Thread.currentThread().interrupt();
            throw new luaj.d(e2);
        }
    }

    public static void Y2(long j) {
        s0 = j;
    }

    private static luaj.d b3(luaj.LuaValue luaValue, luaj.d dVar) {
        java.lang.String message = dVar.getMessage();
        if (message.indexOf("bad argument:") != 0) {
            return dVar;
        }
        return new luaj.d("bad argument for key '" + luaValue.g0() + "':" + message.substring(13));
    }

    public static void d3(byte b2, java.util.ArrayList arrayList) {
        java.util.Map map = r0;
        synchronized (map) {
            map.put(java.lang.Byte.valueOf(b2), arrayList);
        }
    }

    static int e3(int i) {
        if (i == 67108864 || i == 134217728 || i == 268435456 || i == 536870912) {
            return i;
        }
        throw new luaj.d("Unknown sign: " + i + ". The sign must be one of the constants gg.SIGN_*.");
    }

    static int f3(int i) {
        if (i != 0 && (i & (-128)) == 0) {
            return i;
        }
        throw new luaj.d("Unknown type: " + i + ". The type must be one of the constants gg.TYPE_*.");
    }

    static int g3(luaj.LuaTable luaTable, luaj.LuaValue luaValue) {
        try {
            return luaTable.U0(luaValue).A0();
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static java.lang.String h3(luaj.LuaTable luaTable, luaj.LuaValue luaValue) {
        try {
            return luaTable.U0(luaValue).B0();
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static long i3(luaj.LuaTable luaTable, luaj.LuaValue luaValue) {
        try {
            return luaTable.g3(luaValue);
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static java.util.ArrayList j3(byte b2) {
        java.util.ArrayList arrayList;
        java.util.Map map = r0;
        synchronized (map) {
            arrayList = (java.util.ArrayList) map.remove(java.lang.Byte.valueOf(b2));
        }
        return arrayList;
    }

    static void l3(int i) {
        java.util.Map map = r0;
        synchronized (map) {
            try {
                java.util.Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    if (O3(((java.lang.Byte) it.next()).byteValue()) == i) {
                        it.remove();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    static luaj.d m3(luaj.LuaValue luaValue, luaj.LuaValue luaValue2, java.lang.Throwable th) {
        return new luaj.d("Failed parse item " + luaValue2.g0() + " on key '" + luaValue.g0() + "': " + th.getMessage(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static luaj.LuaTable n3(int[] iArr, android.ext.c cVar) {
        if (iArr == null) {
            iArr = u0;
        }
        int length = iArr.length;
        luaj.LuaString[] luaStringArr = t0;
        luaj.LuaTable luaTable = new luaj.LuaTable(0, length);
        long j = cVar.f672a;
        int i = cVar.f674c;
        luaTable.J3(iArr[0], luaStringArr[0], j);
        Q3(iArr[1], luaTable, luaStringArr[1], j, cVar.f673b, i);
        luaTable.I3(iArr[2], luaStringArr[2], i);
        return luaTable;
    }

    static luaj.LuaTable o3(android.ext.h2 h2Var) {
        luaj.LuaString[] luaStringArr = t0;
        int[] iArr = v0;
        luaj.LuaTable luaTableN3 = n3(iArr, h2Var);
        java.lang.String str = h2Var.l;
        if (str != null) {
            luaTableN3.m3(luaStringArr[3], luaj.LuaValue.K2(str));
        }
        luaTableN3.K3(iArr[4], luaStringArr[4], h2Var.m);
        luaTableN3.I3(iArr[5], luaStringArr[5], h2Var.n);
        long j = h2Var.f672a;
        int i = h2Var.f674c;
        long j2 = h2Var.o;
        if (j2 != 0 || h2Var.p != 0) {
            Q3(iArr[6], luaTableN3, luaStringArr[6], j, j2, i);
            Q3(iArr[7], luaTableN3, luaStringArr[7], j, h2Var.p, i);
        }
        return luaTableN3;
    }

    public static android.ext.Script.Consts p3(java.util.ArrayList arrayList) {
        android.ext.Script.Consts consts = (android.ext.Script.Consts) o0.get();
        if (consts != null) {
            return consts;
        }
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            B3(new luaj.LuaTable(0, 64), arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        for (android.ext.Script.Const r10 : arrayList) {
            java.lang.String str = r10.f369a;
            if (str.startsWith("gg.REGION_")) {
                arrayList2.add(r10);
            } else if (str.startsWith("gg.TYPE_")) {
                arrayList3.add(r10);
            } else if (str.startsWith("gg.SIGN_FUZZY_")) {
                arrayList4.add(r10);
            } else if (str.startsWith("gg.SIGN_")) {
                arrayList5.add(r10);
            } else if (str.startsWith("gg.LOAD_")) {
                arrayList6.add(r10);
            } else if (str.startsWith("gg.SAVE_")) {
                arrayList7.add(r10);
            } else if (str.startsWith("gg.PROT_")) {
                arrayList8.add(r10);
            } else if (str.startsWith("gg.POINTER_")) {
                arrayList9.add(r10);
            } else if (str.startsWith("gg.DUMP_")) {
                arrayList10.add(r10);
            } else if (str.startsWith("gg.ASM_")) {
                arrayList11.add(r10);
            }
        }
        android.ext.Script.Consts consts2 = new android.ext.Script.Consts();
        consts2.f371a = (android.ext.Script.Const[]) arrayList2.toArray(new android.ext.Script.Const[arrayList2.size()]);
        consts2.f372b = (android.ext.Script.Const[]) arrayList3.toArray(new android.ext.Script.Const[arrayList3.size()]);
        consts2.f373c = (android.ext.Script.Const[]) arrayList4.toArray(new android.ext.Script.Const[arrayList4.size()]);
        consts2.f374d = (android.ext.Script.Const[]) arrayList5.toArray(new android.ext.Script.Const[arrayList5.size()]);
        consts2.f375e = (android.ext.Script.Const[]) arrayList6.toArray(new android.ext.Script.Const[arrayList6.size()]);
        consts2.f376f = (android.ext.Script.Const[]) arrayList7.toArray(new android.ext.Script.Const[arrayList7.size()]);
        consts2.f377g = (android.ext.Script.Const[]) arrayList8.toArray(new android.ext.Script.Const[arrayList8.size()]);
        consts2.h = (android.ext.Script.Const[]) arrayList9.toArray(new android.ext.Script.Const[arrayList9.size()]);
        consts2.i = (android.ext.Script.Const[]) arrayList10.toArray(new android.ext.Script.Const[arrayList10.size()]);
        consts2.j = (android.ext.Script.Const[]) arrayList11.toArray(new android.ext.Script.Const[arrayList11.size()]);
        o0 = new java.lang.ref.WeakReference(consts2);
        return consts2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [luaj.LuaValue] */
    /* JADX WARN: Type inference failed for: r6v1, types: [luaj.LuaValue] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    private static long q3(long j, luaj.LuaValue luaValue, luaj.LuaValue luaValue2, int i, boolean z) {
        java.lang.String strB0;
        long jDoubleToRawLongBits;
        if (luaValue2 instanceof luaj.LuaLong) {
            long jZ2 = luaValue2.z2();
            if (i == 16) {
                jZ2 = java.lang.Float.floatToRawIntBits(jZ2);
            } else if (i == 64) {
                jZ2 = java.lang.Double.doubleToRawLongBits(jZ2);
            }
            return i == 8 ? jZ2 ^ j : jZ2;
        }
        if (luaValue2 instanceof luaj.LuaDouble) {
            double dX2 = luaValue2.x2();
            if (i == 16) {
                jDoubleToRawLongBits = java.lang.Float.floatToRawIntBits((float) dX2);
            } else {
                jDoubleToRawLongBits = i == 64 ? java.lang.Double.doubleToRawLongBits(dX2) : (long) dX2;
            }
            return i == 8 ? j ^ jDoubleToRawLongBits : jDoubleToRawLongBits;
        }
        try {
            if (z) {
                luaValue = luaValue2.I1(null);
            } else {
                strB0 = luaValue2.B0();
            }
            if (luaValue == 0) {
                luaValue = strB0;
                return 0L;
            }
            luaValue = strB0;
            java.lang.String strD3 = D3(luaValue);
            android.ext.i2.c cVarX = android.ext.i2.x(strD3, false);
            if (cVarX != null) {
                strD3 = cVarX.f1017a;
            }
            return android.ext.c.e(j, strD3, i);
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static java.util.ArrayList r3(luaj.Varargs varargs) {
        luaj.LuaTable luaTableI = varargs.I(1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.ext.z1.d dVar = android.ext.MainService.instance.v0;
        boolean z = dVar != null ? dVar.n : false;
        luaj.LuaTable.i iVarS3 = luaTableI.s3();
        while (iVarS3.c()) {
            android.ext.c cVarT3 = T3(null, iVarS3.d().H0(), (byte) 2, z);
            cVarT3.f674c &= 127;
            arrayList.add(cVarT3);
        }
        return arrayList;
    }

    static java.lang.String s3(java.io.File file) {
        try {
            return file.getCanonicalPath();
        } catch (java.io.IOException unused) {
            return file.getAbsolutePath();
        }
    }

    private void u3() {
        luaj.Globals globals = this.T;
        globals.Z = this;
        luaj.a.c(globals);
        g.h.M(globals);
        globals.t1(new luaj.lib.BaseLib());
        globals.t1(new luaj.lib.PackageLib());
        globals.t1(new luaj.lib.Bit32Lib());
        globals.t1(new luaj.lib.TableLib());
        globals.t1(new luaj.lib.StringLib());
        globals.t1(new luaj.lib.Utf8Lib());
        globals.t1(new luaj.lib.MathLib());
        globals.t1(new android.ext.Script.IoLibSafe());
        globals.t1(new android.ext.Script.OsLibSafe());
        globals.t1(new luaj.lib.DebugLib());
        v3();
    }

    private void v3() {
        luaj.Globals globals = this.T;
        globals.c0 = new android.ext.Script.ScriptPrintStream(false);
        globals.d0 = new android.ext.Script.ScriptPrintStream(true);
        globals.t1(this);
    }

    void L3() {
        final android.ext.Script.SavedState savedState = this.m0;
        if (savedState == null) {
            return;
        }
        android.ext.n2.i(new java.lang.Runnable() { // from class: android.ext.Script.1
            @Override // java.lang.Runnable
            public void run() {
                android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_ranges).f42d = savedState.f389a;
                android.ext.Config.k();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    void M3() throws java.io.IOException {
        luaj.LuaValue luaValueO3;
        java.lang.String name;
        java.io.BufferedWriter bufferedWriter;
        java.lang.Object obj = this.U;
        if (obj instanceof java.io.File) {
            java.io.File file = (java.io.File) obj;
            if (!file.exists()) {
                throw new java.io.FileNotFoundException("File not found: " + file);
            }
            this.T.T3(file.getParentFile().getAbsolutePath());
            java.lang.String absolutePath = file.getAbsolutePath();
            luaj.lib.BaseLib.b bVar = new luaj.lib.BaseLib.b(new java.io.FileInputStream(file));
            try {
                try {
                    luaValueO3 = this.T.O3(bVar, '@' + absolutePath, "bt", this.T);
                    if (luaValueO3 instanceof luaj.LuaClosure) {
                        ((luaj.LuaClosure) luaValueO3).U = absolutePath;
                    }
                    bVar.close();
                    if ((luaValueO3 instanceof luaj.LuaClosure) && (((luaj.LuaClosure) luaValueO3).R instanceof lasm.b)) {
                        java.lang.String str = file.getAbsolutePath() + '.' + android.ext.t2.h(java.lang.System.currentTimeMillis() - 1546300800000L) + ".lua";
                        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(str), 65536);
                        try {
                            g.b.a(((luaj.LuaClosure) luaValueO3).R, bufferedOutputStream, false, false);
                            java.io.File file2 = new java.io.File(file.getAbsolutePath() + ".tail");
                            if (file2.exists()) {
                                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file2);
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    int i = fileInputStream.read(bArr);
                                    if (i <= 0) {
                                        break;
                                    } else {
                                        bufferedOutputStream.write(bArr, 0, i);
                                    }
                                }
                                fileInputStream.close();
                            }
                            bufferedOutputStream.close();
                            Z2(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.assembled) + ":\n" + str);
                            return;
                        } catch (java.lang.Throwable th) {
                            bufferedOutputStream.close();
                            throw th;
                        }
                    }
                    name = file.getName();
                } catch (java.lang.Exception e2) {
                    throw new luaj.d("load " + absolutePath + ": " + e2, e2);
                }
            } catch (java.lang.Throwable th2) {
                bVar.close();
                throw th2;
            }
        } else {
            java.lang.String string = obj.toString();
            luaValueO3 = this.T.O3(new java.io.ByteArrayInputStream(string.getBytes()), string, "t", this.T);
            name = "string";
        }
        java.lang.String str2 = name + '_' + android.ext.t2.h(java.lang.System.currentTimeMillis() - 1546300800000L) + '_' + android.ext.t2.g(android.ext.Tools.f489a.nextInt());
        if ((this.X & 1) != 0) {
            luaj.LuaClosure luaClosureW0 = luaValueO3.w0();
            java.lang.String str3 = this.Y + '/' + str2 + ".lasm";
            java.io.PrintStream printStream = luaj.g.f1716b;
            try {
                luaj.g.f1716b = new java.io.PrintStream(str3);
                luaj.g.A(luaClosureW0.R);
                luaj.g.f1716b.close();
                luaj.g.M(luaClosureW0, str3 + ".tail");
            } catch (java.lang.Throwable th3) {
                android.ext.e1.l("Failed disassemble " + luaClosureW0 + " into '" + str3 + '\'', th3);
            }
            luaj.g.f1716b = printStream;
        }
        if ((this.X & 2) != 0) {
            this.T.g0.c3(this.Y + '/' + str2);
        }
        if ((this.X & 4) != 0) {
            try {
                bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.Y + '/' + str2 + ".log.txt")), 65536);
            } catch (java.lang.Throwable th4) {
                android.ext.e1.s("Failed open log file", th4);
                bufferedWriter = null;
            }
        } else {
            bufferedWriter = null;
        }
        w0 = bufferedWriter == null ? null : new android.ext.Script.DebugLog(bufferedWriter, this.T);
        java.io.PrintStream printStream2 = luaj.g.f1716b;
        try {
            luaj.Globals globals = this.T;
            luaj.g.f1716b = globals.c0;
            K3(globals);
            luaValueO3.call();
        } finally {
            luaj.g.f1716b = printStream2;
            if (bufferedWriter != null) {
                w0 = null;
                try {
                    bufferedWriter.close();
                } catch (java.lang.Throwable th5) {
                    android.ext.e1.s("Failed close log", th5);
                }
            }
            if ((this.X & 2) != 0) {
                this.T.g0.Z2();
            }
            K3(null);
        }
    }

    void N3() {
        android.ext.Script.SavedState savedState = new android.ext.Script.SavedState();
        savedState.f389a = android.ext.Config.i;
        this.m0 = savedState;
    }

    public android.ext.Script R3() {
        this.V.start();
        return this;
    }

    void Z2(java.lang.String str) {
        this.W.a("\n");
        this.W.a(str);
        this.W.a("\n");
    }

    void a3(boolean z, java.lang.String str) {
        if (z) {
            this.W.a("err: ");
        }
        this.W.a(str);
        this.W.a("\n");
    }

    public void c3(byte b2, java.lang.String str) {
        java.lang.String str2;
        byte b3 = (byte) (b2 - 20);
        byte b4 = (byte) (b3 / 20);
        byte b5 = (byte) (b3 % 20);
        if (this.Z != b4) {
            str2 = "callNotify id mismatch: " + ((int) this.Z) + " != " + ((int) b4) + "; " + ((int) b5) + "; " + ((int) b2) + "; " + str;
        } else {
            byte b6 = this.b0;
            if (b6 == b5) {
                synchronized (this) {
                    try {
                        b6 = this.b0;
                        if (b6 == b5) {
                            this.l0 = str;
                            notifyAll();
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            str2 = "callNotify seq mismatch: " + ((int) b6) + " != " + ((int) b5) + "; " + ((int) b4) + "; " + ((int) b2) + "; " + str;
        }
        android.ext.e1.d(str2);
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        android.content.Context contextF0 = android.ext.Tools.f0();
        java.util.ArrayList arrayList = (this.X & 4) != 0 ? new java.util.ArrayList() : null;
        luaj.LuaTable luaTable = new luaj.LuaTable(0, 128);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("");
        float f2 = 1;
        sb.append((108.3f * f2) - 6.9f);
        luaTable.b2("VERSION", sb.toString());
        luaTable.a2("VERSION_INT", android.ext.h0.d());
        luaTable.a2("BUILD", (int) (((f2 * 16409.7f) - 254.7f) + 0.5f));
        luaTable.b2("PACKAGE", android.ext.Tools.C0());
        luaTable.a2("ANDROID_SDK_INT", android.os.Build.VERSION.SDK_INT);
        luaTable.b2("FILES_DIR", android.ext.Tools.p0().getAbsolutePath());
        luaTable.b2("CACHE_DIR", android.ext.Tools.b0().getAbsolutePath());
        try {
            luaTable.b2("EXT_FILES_DIR", contextF0.getExternalFilesDir(null).getAbsolutePath());
        } catch (java.lang.Throwable th) {
            android.ext.e1.l("Failed set EXT_FILES_DIR for script", th);
            luaTable.b2("EXT_FILES_DIR", android.ext.Tools.p0().getAbsolutePath());
        }
        try {
            luaTable.b2("EXT_CACHE_DIR", contextF0.getExternalCacheDir().getAbsolutePath());
        } catch (java.lang.Throwable th2) {
            android.ext.e1.l("Failed set EXT_CACHE_DIR for script", th2);
            luaTable.b2("EXT_CACHE_DIR", android.ext.Tools.b0().getAbsolutePath());
        }
        luaTable.b2("EXT_STORAGE", android.ext.Tools.K0());
        B3(luaTable, arrayList);
        luaTable.c2("require", new android.ext.Script.require());
        luaTable.c2("toast", new android.ext.Script.toast());
        luaTable.c2("alert", new android.ext.Script.alert());
        luaTable.c2("prompt", new android.ext.Script.prompt());
        luaTable.c2("choice", new android.ext.Script.choice());
        luaTable.c2("multiChoice", new android.ext.Script.multiChoice());
        luaTable.c2("isVisible", new android.ext.Script.isVisible());
        luaTable.c2("setVisible", new android.ext.Script.setVisible());
        luaTable.c2("getActiveTab", new android.ext.Script.getActiveTab());
        luaTable.c2("showUiButton", new android.ext.Script.showUiButton());
        luaTable.c2("hideUiButton", new android.ext.Script.hideUiButton());
        luaTable.c2("isClickedUiButton", new android.ext.Script.isClickedUiButton());
        android.ext.Script.getTargetPackage gettargetpackage = new android.ext.Script.getTargetPackage();
        luaTable.c2("getTargetPackage", gettargetpackage);
        luaTable.c2("getTargetInfo", new android.ext.Script.getTargetInfo());
        luaTable.c2("isPackageInstalled", new android.ext.Script.isPackageInstalled());
        luaTable.c2("processKill", new android.ext.Script.processKill());
        luaTable.c2("saveVariable", new android.ext.Script.saveVariable());
        luaTable.c2("makeRequest", new android.ext.Script.makeRequest());
        android.ext.Script.getResultsCount getresultscount = new android.ext.Script.getResultsCount();
        luaTable.c2("getResultsCount", getresultscount);
        luaTable.c2("getResults", new android.ext.Script.getResults());
        luaTable.c2("editAll", new android.ext.Script.editAll());
        luaTable.c2("clearResults", new android.ext.Script.clearResults());
        luaTable.c2("removeResults", new android.ext.Script.removeResults());
        luaTable.c2("loadResults", new android.ext.Script.loadResults());
        luaTable.c2("getSelectedResults", new android.ext.Script.getSelectedResults());
        luaTable.c2("setValues", new android.ext.Script.setValues());
        luaTable.c2("getValues", new android.ext.Script.getValues());
        luaTable.c2("getValuesRange", new android.ext.Script.getValuesRange());
        luaTable.c2("processPause", new android.ext.Script.processPause());
        luaTable.c2("processResume", new android.ext.Script.processResume());
        luaTable.c2("processToggle", new android.ext.Script.processToggle());
        luaTable.c2("isProcessPaused", new android.ext.Script.isProcessPaused());
        luaTable.c2("timeJump", new android.ext.Script.timeJump());
        luaTable.c2("setSpeed", new android.ext.Script.setSpeed());
        luaTable.c2("getSpeed", new android.ext.Script.getSpeed());
        luaTable.c2("unrandomizer", new android.ext.Script.unrandomizer());
        luaTable.c2("gotoAddress", new android.ext.Script.gotoAddress());
        luaTable.c2("getSelectedElements", new android.ext.Script.getSelectedElements());
        luaTable.c2("getRanges", new android.ext.Script.getRanges());
        luaTable.c2("setRanges", new android.ext.Script.setRanges());
        luaTable.c2("copyMemory", new android.ext.Script.copyMemory());
        luaTable.c2("dumpMemory", new android.ext.Script.dumpMemory());
        luaTable.c2("loadList", new android.ext.Script.loadList());
        luaTable.c2("saveList", new android.ext.Script.saveList());
        luaTable.c2("clearList", new android.ext.Script.clearList());
        luaTable.c2("addListItems", new android.ext.Script.addListItems());
        luaTable.c2("getListItems", new android.ext.Script.getListItems());
        luaTable.c2("removeListItems", new android.ext.Script.removeListItems());
        luaTable.c2("getSelectedListItems", new android.ext.Script.getSelectedListItems());
        luaTable.c2("searchNumber", new android.ext.Script.searchNumber());
        luaTable.c2("refineNumber", new android.ext.Script.refineNumber());
        luaTable.c2("searchAddress", new android.ext.Script.searchAddress());
        luaTable.c2("refineAddress", new android.ext.Script.refineAddress());
        luaTable.c2("startFuzzy", new android.ext.Script.startFuzzy());
        luaTable.c2("searchFuzzy", new android.ext.Script.searchFuzzy());
        android.ext.Script.searchPointer searchpointer = new android.ext.Script.searchPointer();
        luaTable.c2("searchPointer", searchpointer);
        luaTable.c2("sleep", new android.ext.Script.sleep());
        luaTable.c2("copyText", new android.ext.Script.copyText());
        luaTable.c2("disasm", new android.ext.Script.disasm());
        luaTable.c2("getLine", new android.ext.Script.getLine());
        luaTable.c2("getFile", new android.ext.Script.getFile());
        luaTable.c2("bytes", new android.ext.Script.bytes());
        luaTable.c2("skipRestoreState", new android.ext.Script.skipRestoreState());
        luaTable.c2("getRangesList", new android.ext.Script.getRangesList());
        luaTable.c2("allocatePage", new android.ext.Script.allocatePage());
        luaTable.c2("getLocale", new android.ext.Script.getLocale());
        luaTable.c2("numberToLocale", new android.ext.Script.numberToLocale());
        luaTable.c2("numberFromLocale", new android.ext.Script.numberFromLocale());
        luaTable.d2(luaj.LuaValue.K2("SIGN_INEQUAL").h3(), luaj.LuaValue.I2(268435456L));
        luaTable.d2(luaj.LuaValue.K2("SIGN_SMALLER").h3(), luaj.LuaValue.I2(134217728L));
        luaTable.d2(luaj.LuaValue.K2("SIGN_LARGER").h3(), luaj.LuaValue.I2(67108864L));
        luaTable.d2(luaj.LuaValue.K2("getSelectedPackage").h3(), gettargetpackage);
        luaTable.d2(luaj.LuaValue.K2("getResultCount").h3(), getresultscount);
        luaTable.d2(luaj.LuaValue.K2("internal1").h3(), new android.ext.Script.internal1());
        luaTable.d2(luaj.LuaValue.K2("internal2").h3(), new android.ext.Script.internal2());
        luaTable.d2(luaj.LuaValue.K2("internal3").h3(), searchpointer);
        luaValue2.i2("gg", luaTable);
        luaValue2.T0("package").T0("loaded").i2("gg", luaTable);
        luaj.LuaValue luaValueT0 = luaValue2.T0("os");
        luaValueT0.i2("exit", new android.ext.Script.exit());
        luaValueT0.i2("remove", new android.ext.Script.wrap("os.remove", luaValueT0.T0("remove"), 1));
        luaValueT0.i2("rename", new android.ext.Script.wrap("os.rename", luaValueT0.T0("rename"), 2));
        luaValueT0.i2("tmpname", new android.ext.Script.wrap("os.tmpname", luaValueT0.T0("tmpname"), 0));
        luaj.LuaValue luaValueT1 = luaValue2.T0("string");
        luaValueT1.i2("format", new android.ext.Script.format(luaValueT1.T0("format")));
        luaValueT1.i2("dump", new android.ext.Script.wrap("string.dump", luaValueT1.T0("dump"), 1));
        luaj.LuaValue luaValueT2 = luaValue2.T0("io");
        luaValueT2.i2("open", new android.ext.Script.wrap("io.open", luaValueT2.T0("open"), 2));
        luaValueT2.i2("input", new android.ext.Script.wrap("io.input", luaValueT2.T0("input"), 1));
        luaValueT2.i2("output", new android.ext.Script.wrap("io.output", luaValueT2.T0("output"), 1));
        luaValueT2.i2("tmpfile", new android.ext.Script.wrap("io.tmpfile", luaValueT2.T0("tmpfile"), 0));
        luaValueT2.i2("lines", new android.ext.Script.wrap("io.lines", luaValueT2.T0("lines"), 1));
        luaj.LuaValue luaValueT3 = luaValue2.T0("debug");
        luaValueT3.i2("debug", new android.ext.Script.wrap("debug.debug", luaValueT3.T0("debug"), 0));
        luaValueT3.i2("gethook", new android.ext.Script.wrap("debug.gethook", luaValueT3.T0("gethook"), 1));
        luaValueT3.i2("getinfo", new android.ext.Script.wrap("debug.getinfo", luaValueT3.T0("getinfo"), 3));
        luaValueT3.i2("getlocal", new android.ext.Script.wrap("debug.getlocal", luaValueT3.T0("getlocal"), 3));
        luaValueT3.i2("getmetatable", new android.ext.Script.wrap("debug.getmetatable", luaValueT3.T0("getmetatable"), 1));
        luaValueT3.i2("getregistry", new android.ext.Script.wrap("debug.getregistry", luaValueT3.T0("getregistry"), 0));
        luaValueT3.i2("getupvalue", new android.ext.Script.wrap("debug.getupvalue", luaValueT3.T0("getupvalue"), 2));
        luaValueT3.i2("getuservalue", new android.ext.Script.wrap("debug.getuservalue", luaValueT3.T0("getuservalue"), 1));
        luaValueT3.i2("sethook", new android.ext.Script.wrap("debug.sethook", luaValueT3.T0("sethook"), 4));
        luaValueT3.i2("setlocal", new android.ext.Script.wrap("debug.setlocal", luaValueT3.T0("setlocal"), 4));
        luaValueT3.i2("setmetatable", new android.ext.Script.wrap("debug.setmetatable", luaValueT3.T0("setmetatable"), 2));
        luaValueT3.i2("setupvalue", new android.ext.Script.wrap("debug.setupvalue", luaValueT3.T0("setupvalue"), 3));
        luaValueT3.i2("setuservalue", new android.ext.Script.wrap("debug.setuservalue", luaValueT3.T0("setuservalue"), 2));
        luaValueT3.i2("traceback", new android.ext.Script.wrap("debug.traceback", luaValueT3.T0("traceback"), 3));
        luaValueT3.i2("upvalueid", new android.ext.Script.wrap("debug.upvalueid", luaValueT3.T0("upvalueid"), 2));
        luaValueT3.i2("upvaluejoin", new android.ext.Script.wrap("debug.upvaluejoin", luaValueT3.T0("upvaluejoin"), 4));
        this.g0 = arrayList != null ? p3(arrayList) : new android.ext.Script.Consts();
        return luaTable;
    }

    void k3() {
        l3(this.Z);
    }

    @Override // luaj.lib.e
    public boolean m(java.lang.String str, boolean z) {
        java.lang.String strS3 = s3(new java.io.File(str));
        java.lang.String strS4 = this.i0;
        if (strS4 == null) {
            strS4 = s3(android.ext.Tools.q0());
            this.i0 = strS4;
        }
        if (A3(strS3, strS4)) {
            return true;
        }
        java.lang.String strS5 = this.j0;
        if (strS5 == null) {
            strS5 = s3(android.ext.Tools.c0());
            this.j0 = strS5;
        }
        if (A3(strS3, strS5)) {
            return true;
        }
        java.lang.String strS6 = this.k0;
        if (strS6 == null) {
            strS6 = s3(android.ext.x2.g(android.ext.MainService.G0));
            this.k0 = strS6;
        }
        if (A3(strS6, strS3)) {
            return true;
        }
        if (z) {
            return false;
        }
        java.lang.Object obj = this.U;
        if (!(obj instanceof java.io.File)) {
            return false;
        }
        java.lang.String strS7 = this.h0;
        if (strS7 == null) {
            strS7 = s3((java.io.File) obj);
            this.h0 = strS7;
        }
        return A3(strS7, strS3);
    }

    byte t3() {
        int i = this.a0;
        this.a0 = i + 1;
        byte b2 = (byte) (i % 20);
        this.b0 = b2;
        return (byte) (b2 + (this.Z * 20) + 20);
    }

    public android.ext.Script w3() {
        return x3(1);
    }

    public android.ext.Script x3(int i) {
        this.f0 = i;
        this.V.interrupt();
        return this;
    }

    void y3() {
        this.c0 = false;
        this.d0 = J3(this.d0);
    }

    boolean z3(java.io.File file) {
        if (!file.exists()) {
            return false;
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            int i = 0;
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                java.lang.String strTrim = line.trim();
                if (strTrim.length() != 0) {
                    if (i == 0) {
                        try {
                            java.lang.Integer.parseInt(strTrim);
                            i = 1;
                        } catch (java.lang.Throwable unused) {
                        }
                    } else {
                        if (strTrim.split("\\|").length < 10) {
                            i = -i;
                            break;
                        }
                        i++;
                    }
                }
            }
            bufferedReader.close();
            return i > 1;
        } catch (java.io.IOException e2) {
            android.ext.e1.g("Failed detect", e2);
            return false;
        }
    }
}
