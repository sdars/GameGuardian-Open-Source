package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import lasm.LasmBase;
import luaj.Globals;
import luaj.LuaBoolean;
import luaj.LuaClosure;
import luaj.LuaDouble;
import luaj.LuaFunction;
import luaj.LuaLong;
import luaj.LuaNil;
import luaj.LuaNumber;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.BaseLib;
import luaj.lib.Bit32Lib;
import luaj.lib.DebugLib;
import luaj.lib.GgLib$saveVariable;
import luaj.lib.IoLib;
import luaj.lib.MathLib;
import luaj.lib.OsLib;
import luaj.lib.PackageLib;
import luaj.lib.StringLib;
import luaj.lib.TableLib;
import luaj.lib.TwoArgFunction;
import luaj.lib.Utf8Lib;
import luaj.lib.VarArgFunction;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Script extends TwoArgFunction implements luaj.lib.e {
    private static volatile int n0;
    private static WeakReference o0 = new WeakReference(null);
    static volatile ArrayList p0 = null;
    static volatile int q0 = 0;
    static final Map r0 = new HashMap();
    static volatile long s0 = 0;
    static final LuaString[] t0 = {LuaString.K2("address"), LuaString.K2("value"), LuaString.K2("flags"), LuaString.K2("name"), LuaString.K2("freeze"), LuaString.K2("freezeType"), LuaString.K2("freezeFrom"), LuaString.K2("freezeTo")};
    static final int[] u0 = new int[3];
    static final int[] v0 = new int[8];
    static DebugLog w0;
    final Object U;
    final int X;
    final String Y;
    private final byte Z;
    Consts g0;
    private String h0;
    private String i0;
    private String j0;
    private String k0;
    volatile String l0;
    volatile SavedState m0;
    private volatile int a0 = 0;
    private volatile byte b0 = -1;
    volatile boolean c0 = true;
    byte d0 = 0;
    boolean e0 = false;
    volatile int f0 = 0;
    final Globals T = new Globals();
    final Thread V = new ScriptThread();
    final Logger W = new Logger();

    public static abstract class ApiFunction extends VarArgFunction {
        static WeakReference Y = new WeakReference(null);
        static WeakReference Z = new WeakReference(null);
        private static Map a0 = null;
        private static Map b0 = null;
        private static Map c0 = null;
        private static Map d0 = null;
        private String X;
        private final boolean W = this instanceof BusyApiFunction;
        private volatile Varargs T = null;
        private volatile Throwable U = null;
        protected volatile Object V = new Object();

        private static Map X2(int i) {
            HashMap map = new HashMap();
            for (int i2 = 0; i2 < 8; i2++) {
                if (((1 << i2) & i) != 0) {
                    map.put(Script.t0[i2], LuaValue.f1671c);
                }
            }
            return map;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0064  */
        static boolean e3(ApiFunction apiFunction, Writer writer, int i, LuaValue luaValue) throws IOException {
            Map mapX2;
            if (luaValue instanceof LuaString) {
                return Consts.d(writer, luaValue.g0());
            }
            if (luaValue instanceof LuaTable) {
                if (apiFunction == null || i != 1) {
                    mapX2 = null;
                } else if ((apiFunction instanceof removeResults) || (apiFunction instanceof loadResults) || (apiFunction instanceof getValues)) {
                    mapX2 = a0;
                    if (mapX2 == null) {
                        mapX2 = X2(5);
                        a0 = mapX2;
                    }
                } else if (apiFunction instanceof setValues) {
                    mapX2 = b0;
                    if (mapX2 == null) {
                        mapX2 = X2(7);
                        b0 = mapX2;
                    }
                } else if ((apiFunction instanceof getValuesRange) || (apiFunction instanceof removeListItems)) {
                    mapX2 = c0;
                    if (mapX2 == null) {
                        mapX2 = X2(1);
                        c0 = mapX2;
                    }
                } else if (apiFunction instanceof addListItems) {
                    mapX2 = d0;
                    if (mapX2 == null) {
                        mapX2 = X2(255);
                        d0 = mapX2;
                    }
                } else {
                    mapX2 = null;
                }
                ((LuaTable) luaValue).E3(writer, mapX2);
            } else {
                writer.write(luaValue.g0());
            }
            return true;
        }

        private void f3(Writer writer, Varargs varargs) throws IOException {
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

        protected static boolean g3(Writer writer, Const[] constArr, LuaValue luaValue) {
            return Consts.a(writer, constArr, luaValue.y2());
        }

        protected static boolean h3(Writer writer, LuaValue luaValue) {
            return Consts.b(writer, luaValue.z2());
        }

        @Override // luaj.LuaFunction
        public String T2() {
            String str = this.X;
            if (str != null) {
                return str;
            }
            String strT2 = super.T2();
            this.X = strT2;
            return strT2;
        }

        protected abstract int Y2();

        protected String Z2() {
            return null;
        }

        protected Varargs a3() {
            return LuaValue.f1672d;
        }

        public Varargs b3(final Varargs varargs) {
            this.T = null;
            this.U = null;
            Runnable runnable = new Runnable() { // from class: android.ext.Script.ApiFunction.1
                @Override // java.lang.Runnable
                public void run() {
                    ApiFunction.this.j3(varargs);
                }
            };
            synchronized (this.V) {
                n2.i(runnable);
                Script.W3(this.V);
            }
            Throwable th = this.U;
            this.U = null;
            if (th != null) {
                this.T = null;
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw new RuntimeException(th);
            }
            Varargs varargs2 = this.T;
            this.T = null;
            if (!this.W || varargs2 != null) {
                return varargs2;
            }
            String strZ2 = Z2();
            return strZ2 == null ? a3() : LuaValue.K2(strZ2);
        }

        public Varargs c3(Varargs varargs) {
            return LuaValue.f1671c;
        }

        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            return e3(this, writer, i, luaValue);
        }

        @Override // luaj.lib.LibFunction, luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
        public String g0() {
            String strK3 = k3();
            String strReplace = strK3.replace("[", "").replace("]", "").replace(" ,", ",");
            Pattern pattern = (Pattern) Y.get();
            if (pattern == null) {
                Pattern patternCompile = Pattern.compile(".*(\\(.*\\)).*");
                Y = new WeakReference(patternCompile);
                pattern = patternCompile;
            }
            String strReplaceAll = pattern.matcher(strReplace).replaceAll("$1");
            Pattern pattern2 = (Pattern) Z.get();
            if (pattern2 == null) {
                Pattern patternCompile2 = Pattern.compile("(?<=[\\(,])( ?)\\s*\\S*\\s*(\\S*)(\\s*=\\s*[^,\\)]*)?(?=[,\\)])");
                Z = new WeakReference(patternCompile2);
                pattern2 = patternCompile2;
            }
            return "function " + pattern2.matcher(strReplaceAll).replaceAll("$1$2") + " end, -- " + strK3;
        }

        protected void i3(Writer writer, Varargs varargs) throws IOException {
            if ((this instanceof isVisible) || (this instanceof internal1) || (this instanceof internal2) || (this instanceof sleep)) {
                return;
            }
            writer.write(T2());
            writer.write("(");
            f3(writer, varargs);
            writer.write(")\n");
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public final Varargs invoke(Varargs varargs) {
            ThreadLocal threadLocal = Varargs.f1676a;
            VarArgFunction varArgFunction = (VarArgFunction) threadLocal.get();
            threadLocal.set(this);
            try {
                LuaValue luaValueW = varargs.w();
                if ((luaValueW instanceof LuaString) && luaValueW.W1() > 1000000) {
                    varargs = LuaValue.N2(luaValueW.G0().j3(0, 1000000), varargs.e0(2));
                }
                DebugLog debugLog = Script.w0;
                if (debugLog != null) {
                    long jNanoTime = System.nanoTime();
                    try {
                        i3(debugLog.f378a, varargs);
                    } catch (Throwable th) {
                        e1.s("Failed write log for " + T2(), th);
                    }
                    Globals globals = debugLog.f379b;
                    globals.b0 = (int) (((long) globals.b0) + ((System.nanoTime() - jNanoTime) / 1000000));
                }
                Varargs varargsB3 = b3(varargs);
                if (((this instanceof alert) || (this instanceof prompt) || (this instanceof choice) || (this instanceof multiChoice)) && debugLog != null) {
                    long jNanoTime2 = System.nanoTime();
                    try {
                        Writer writer = debugLog.f378a;
                        writer.write("--[[ return: ");
                        writer.write(varargsB3 == null ? "null" : varargsB3.toString());
                        writer.write(" ]]\n");
                    } catch (Throwable th2) {
                        e1.s("Failed log for " + T2(), th2);
                    }
                    Globals globals2 = debugLog.f379b;
                    globals2.b0 = (int) (((long) globals2.b0) + ((System.nanoTime() - jNanoTime2) / 1000000));
                }
                if ((this instanceof getResults) && (varargsB3 instanceof LuaTable) && debugLog != null) {
                    long jNanoTime3 = System.nanoTime();
                    try {
                        Writer writer2 = debugLog.f378a;
                        writer2.write("--[[ count: ");
                        writer2.write(Integer.toString(((LuaTable) varargsB3).W1()));
                        writer2.write(" ]]\n");
                    } catch (Throwable th3) {
                        e1.s("Failed log for " + T2(), th3);
                    }
                    Globals globals3 = debugLog.f379b;
                    globals3.b0 = (int) (((long) globals3.b0) + ((System.nanoTime() - jNanoTime3) / 1000000));
                }
                if (varargsB3 == LuaValue.f1672d && (((this instanceof searchNumber) || (this instanceof refineNumber) || (this instanceof startFuzzy) || (this instanceof searchFuzzy) || (this instanceof searchAddress) || (this instanceof refineAddress)) && debugLog != null)) {
                    long jNanoTime4 = System.nanoTime();
                    try {
                        Writer writer3 = debugLog.f378a;
                        writer3.write("--[[ found: ");
                        writer3.write(Long.toString(MainService.instance.p0));
                        writer3.write(" ]]\n");
                    } catch (Throwable th4) {
                        e1.s("Failed log for " + T2(), th4);
                    }
                    Globals globals4 = debugLog.f379b;
                    globals4.b0 = (int) (((long) globals4.b0) + ((System.nanoTime() - jNanoTime4) / 1000000));
                }
                threadLocal.set(varArgFunction);
                return varargsB3;
            } catch (Throwable th5) {
                threadLocal.set(varArgFunction);
                throw th5;
            }
        }

        public void j3(Varargs varargs) {
            Varargs varargsC3;
            Throwable th = null;
            try {
                varargsC3 = c3(varargs);
                try {
                    this.T = varargsC3;
                } catch (Throwable th2) {
                    th = th2;
                    this.U = th;
                }
            } catch (Throwable th3) {
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

        abstract String k3();
    }

    abstract class BusyApiFunction extends ApiFunction {
        public BusyApiFunction() {
            this.V = Script.this;
        }

        @Override // android.ext.Script.ApiFunction
        protected String Z2() {
            return Script.this.l0;
        }
    }

    static class Const {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f370b;

        public Const(String str, int i) {
            this.f369a = str;
            this.f370b = i;
        }
    }

    static class Consts {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Const[] f371a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Const[] f372b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Const[] f373c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Const[] f374d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Const[] f375e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Const[] f376f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Const[] f377g = null;
        Const[] h = null;
        Const[] i = null;
        Const[] j = null;

        Consts() {
        }

        static boolean a(Writer writer, Const[] constArr, int i) {
            try {
                boolean z = true;
                for (Const r5 : constArr) {
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
                    writer.write(Integer.toString(i));
                }
                return true;
            } catch (IOException e2) {
                e1.s("Writer fail", e2);
                return false;
            }
        }

        static boolean b(Writer writer, long j) {
            String string;
            try {
                if (j == 0 || j == -1) {
                    string = Long.toString(j);
                } else {
                    writer.write("0x");
                    string = Long.toHexString(j);
                }
                writer.write(string);
                return true;
            } catch (IOException e2) {
                e1.s("Writer fail", e2);
                return false;
            }
        }

        static boolean c(Writer writer, String str) {
            return d(writer, Script.E3(str));
        }

        static boolean d(Writer writer, String str) {
            try {
                writer.write("\"");
                if (str.length() <= 65535) {
                    str = str.replace("\"", "\\\"");
                }
                writer.write(str);
                writer.write("\"");
                return true;
            } catch (IOException e2) {
                e1.s("Writer fail", e2);
                return false;
            }
        }
    }

    public static abstract class DebugFunction extends ApiFunction {
        protected LuaClosure e0 = null;

        public void l3(LuaClosure luaClosure) {
            this.e0 = luaClosure;
        }
    }

    private static final class DebugLog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Writer f378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Globals f379b;

        DebugLog(Writer writer, Globals globals) {
            this.f378a = writer;
            this.f379b = globals;
        }
    }

    final class IoLibSafe extends IoLib {
        private String f0 = null;

        IoLibSafe() {
        }

        private IoLib.File R3(char c2) throws IOException {
            File file = new File(Tools.q0(), "empty.txt");
            file.createNewFile();
            IoLib.File fileH3 = super.H3(file.getAbsolutePath(), c2);
            file.delete();
            return fileH3;
        }

        private String S3() {
            String str = this.f0;
            if (str != null) {
                return str;
            }
            String strS3 = Script.s3(new File(Tools.q0(), "empty.txt"));
            this.f0 = strS3;
            return strS3;
        }

        @Override // luaj.lib.IoLib
        protected IoLib.File H3(String str, char c2) {
            String strS3 = Script.s3(this.Y.R3(str));
            if (Script.this.m(strS3, c2 == 'r')) {
                return R3(c2);
            }
            try {
                return super.H3(strS3, c2);
            } catch (IoLib.c unused) {
                return R3(c2);
            }
        }

        @Override // luaj.lib.IoLib
        protected boolean O3(File file, FileDescriptor fileDescriptor, boolean z) {
            if (Script.s3(file).equals(S3())) {
                return true;
            }
            return super.O3(file, fileDescriptor, z);
        }
    }

    public static class Logger {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final OutputStream f380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final FileInputStream f381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final StringBuilder f382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f383d;

        Logger() {
            BufferedOutputStream bufferedOutputStream;
            FileInputStream fileInputStream;
            Throwable th;
            StringBuilder sb = null;
            try {
                File file = new File(Tools.p0(), System.currentTimeMillis() + ".tmp");
                file.createNewFile();
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        file.delete();
                    } catch (Throwable th2) {
                        th = th2;
                        e1.a(th);
                        sb = new StringBuilder();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                    th = th;
                    e1.a(th);
                    sb = new StringBuilder();
                    this.f382c = sb;
                    this.f380a = bufferedOutputStream;
                    this.f381b = fileInputStream;
                    this.f383d = 0;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
                fileInputStream = null;
            }
            this.f382c = sb;
            this.f380a = bufferedOutputStream;
            this.f381b = fileInputStream;
            this.f383d = 0;
        }

        public void a(String str) {
            StringBuilder sb = this.f382c;
            if (sb != null) {
                sb.append(str);
                return;
            }
            try {
                byte[] bytes = str.getBytes();
                this.f380a.write(bytes);
                this.f383d += bytes.length;
            } catch (Throwable th) {
                e1.a(th);
            }
        }

        public String toString() {
            int i = this.f383d;
            if (i < 0) {
                return "must be called only once";
            }
            StringBuilder sb = this.f382c;
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
                e1.d("Log script size: read = " + i3 + "; used = " + i2 + "; full = " + i);
                return i3 > 0 ? new String(bArr, 0, i3) : "";
            } catch (Throwable th) {
                e1.a(th);
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

    final class OsLibSafe extends OsLib {
        OsLibSafe() {
        }

        @Override // luaj.lib.OsLib
        protected void r3(String str) {
            if (Script.this.m(str, false)) {
                return;
            }
            super.r3(str);
        }

        @Override // luaj.lib.OsLib
        protected void s3(String str, String str2) {
            if (Script.this.m(str, false) || Script.this.m(str2, false)) {
                return;
            }
            super.s3(str, str2);
        }
    }

    private static final class PostWriteWorker extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OutputStream f384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Throwable f388e;

        PostWriteWorker(OutputStream outputStream, byte[] bArr, int i, int i2) {
            this.f384a = outputStream;
            this.f385b = bArr;
            this.f386c = i;
            this.f387d = i2;
        }

        void a(boolean z) throws IOException {
            try {
                this.f384a.close();
            } catch (Throwable unused) {
            }
            try {
                join(5000L);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
            Throwable th = this.f388e;
            if (z || th == null) {
                return;
            }
            if (!(th instanceof RuntimeException)) {
                throw new IOException(th);
            }
            throw ((RuntimeException) th);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f384a.write(this.f385b, this.f386c, this.f387d);
                this.f384a.flush();
            } catch (Throwable th) {
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
        protected void b(String str) {
            Script.this.a3(this.f390f, str);
            String str2 = "script: " + str;
            if (this.f390f) {
                e1.i(str2);
            } else {
                e1.d(str2);
            }
        }
    }

    class ScriptThread extends Thread {
        public ScriptThread() {
            super("Script thread");
            n0.g(this);
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
            String str;
            int i;
            Script script;
            Globals globals;
            final String strF;
            final DialogInterface.OnClickListener onClickListener;
            int i2;
            String strN;
            String message;
            Object obj;
            String strC;
            int i3;
            Object obj2;
            MainService mainService = MainService.instance;
            try {
                mainService.n0(Script.this);
                f1.f951a.booleanValue();
                Script.this.N3();
                try {
                    Script.this.M3();
                } catch (OsExit e2) {
                    e1.i("Script interrupted by self: " + e2.getMessage());
                    Script script2 = Script.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append(b2.f(2131296931));
                    if (e2.j == 0) {
                        str = ".";
                    } else {
                        str = ": " + e2.j;
                    }
                    sb.append(str);
                    script2.Z2(sb.toString());
                } catch (luaj.d e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if ((cause instanceof InterruptedException) && Script.this.f0 != 0) {
                        e1.l("Script thread interrupted: " + Script.this.f0, cause);
                        Script.this.Z2(b2.f(2131296932) + " [" + Script.this.f0 + "]");
                    } else if (e instanceof luaj.d.a) {
                        n0.h(Thread.currentThread(), e, false);
                    }
                    if (e != null) {
                        try {
                            e1.l("Script error", e);
                            strN = e1.n(e);
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
                                Script script3 = Script.this;
                                obj2 = script3.U;
                                if (obj2 instanceof File) {
                                    i3 = 2131296936;
                                }
                                if (i3 != 0) {
                                    Script.this.Z2(Tools.L1(b2.f(2131296934), b2.f(i3)));
                                }
                            }
                            obj = Script.this.U;
                            if (obj instanceof File) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                            }
                        } catch (OutOfMemoryError e4) {
                            try {
                                strN = e4.toString() + '\n';
                            } catch (OutOfMemoryError e5) {
                                e = e5;
                                i2 = 0;
                                Script.this.Z2(Tools.N1(2131296933) + ": " + e.toString());
                                i = i2;
                                script = Script.this;
                                globals = script.T;
                                if (globals.Y == 0) {
                                    script.Z2(Tools.L1(b2.f(2131296938), Tools.U(Tools.f0(), Script.this.T.a0), Integer.valueOf(Script.this.T.Y)));
                                } else {
                                    script.Z2(Tools.L1(b2.f(2131296938), Tools.U(Tools.f0(), Script.this.T.a0), Integer.valueOf(Script.this.T.Y)));
                                }
                                Script.this.L3();
                                if (Script.this.U instanceof File) {
                                    strF = b2.f(2131296904);
                                    onClickListener = new DialogInterface.OnClickListener() { // from class: android.ext.Script.ScriptThread.1
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public void onClick(DialogInterface dialogInterface, int i4) {
                                            File file = (File) Script.this.U;
                                            if (Tools.a1(file)) {
                                                MainService mainService2 = MainService.instance;
                                                String absolutePath = file.getAbsolutePath();
                                                Script script4 = Script.this;
                                                mainService2.x(absolutePath, script4.X, script4.Y);
                                            }
                                        }
                                    };
                                } else {
                                    strF = null;
                                    onClickListener = null;
                                }
                                final String str2 = Tools.N1(2131296929) + ":\n" + Script.this.W.toString().trim();
                                final int i4 = i;
                                mainService.d1(new Runnable() { // from class: android.ext.Script.ScriptThread.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Tools.i(str2, i4, strF, onClickListener);
                                    }
                                });
                                Script.this.k3();
                                mainService.m0(Script.this);
                            }
                        }
                        try {
                            if (f1.f951a.booleanValue()) {
                                Script.this.Z2(b2.f(2131297022));
                            }
                            Script.this.Z2(Tools.N1(2131296930) + ": " + strN);
                        } catch (OutOfMemoryError e6) {
                            e = e6;
                            Script.this.Z2(Tools.N1(2131296933) + ": " + e.toString());
                        }
                        i = i2;
                    } else {
                        i = 0;
                    }
                    script = Script.this;
                    globals = script.T;
                    if (globals.Y == 0) {
                        script.Z2(Tools.L1(b2.f(2131296938), Tools.U(Tools.f0(), Script.this.T.a0), Integer.valueOf(Script.this.T.Y)));
                    } else {
                        script.Z2(Tools.L1(b2.f(2131296938), Tools.U(Tools.f0(), Script.this.T.a0), Integer.valueOf(Script.this.T.Y)));
                    }
                    Script.this.L3();
                    if (Script.this.U instanceof File) {
                        strF = b2.f(2131296904);
                        onClickListener = new DialogInterface.OnClickListener() { // from class: android.ext.Script.ScriptThread.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i5) {
                                File file = (File) Script.this.U;
                                if (Tools.a1(file)) {
                                    MainService mainService2 = MainService.instance;
                                    String absolutePath = file.getAbsolutePath();
                                    Script script4 = Script.this;
                                    mainService2.x(absolutePath, script4.X, script4.Y);
                                }
                            }
                        };
                    } else {
                        strF = null;
                        onClickListener = null;
                    }
                    final String str3 = Tools.N1(2131296929) + ":\n" + Script.this.W.toString().trim();
                    final int i5 = i;
                    mainService.d1(new Runnable() { // from class: android.ext.Script.ScriptThread.2
                        @Override // java.lang.Runnable
                        public void run() {
                            Tools.i(str3, i5, strF, onClickListener);
                        }
                    });
                    Script.this.k3();
                    mainService.m0(Script.this);
                } catch (Throwable th) {
                    e = th;
                    if (e != null) {
                        e1.l("Script error", e);
                        strN = e1.n(e);
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
                            Script script4 = Script.this;
                            obj2 = script4.U;
                            if (obj2 instanceof File) {
                                i3 = 2131296936;
                            }
                            if (i3 != 0) {
                                Script.this.Z2(Tools.L1(b2.f(2131296934), b2.f(i3)));
                            }
                        }
                        obj = Script.this.U;
                        if (obj instanceof File) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                        if (f1.f951a.booleanValue()) {
                            Script.this.Z2(b2.f(2131297022));
                        }
                        Script.this.Z2(Tools.N1(2131296930) + ": " + strN);
                        i = i2;
                    } else {
                        i = 0;
                    }
                    script = Script.this;
                    globals = script.T;
                    if (globals.Y == 0) {
                        script.Z2(Tools.L1(b2.f(2131296938), Tools.U(Tools.f0(), Script.this.T.a0), Integer.valueOf(Script.this.T.Y)));
                    } else {
                        script.Z2(Tools.L1(b2.f(2131296938), Tools.U(Tools.f0(), Script.this.T.a0), Integer.valueOf(Script.this.T.Y)));
                    }
                    Script.this.L3();
                    if (Script.this.U instanceof File) {
                        strF = b2.f(2131296904);
                        onClickListener = new DialogInterface.OnClickListener() { // from class: android.ext.Script.ScriptThread.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i6) {
                                File file = (File) Script.this.U;
                                if (Tools.a1(file)) {
                                    MainService mainService2 = MainService.instance;
                                    String absolutePath = file.getAbsolutePath();
                                    Script script5 = Script.this;
                                    mainService2.x(absolutePath, script5.X, script5.Y);
                                }
                            }
                        };
                    } else {
                        strF = null;
                        onClickListener = null;
                    }
                    final String str4 = Tools.N1(2131296929) + ":\n" + Script.this.W.toString().trim();
                    final int i6 = i;
                    mainService.d1(new Runnable() { // from class: android.ext.Script.ScriptThread.2
                        @Override // java.lang.Runnable
                        public void run() {
                            Tools.i(str4, i6, strF, onClickListener);
                        }
                    });
                    Script.this.k3();
                    mainService.m0(Script.this);
                }
                e = null;
                if (e != null) {
                    e1.l("Script error", e);
                    strN = e1.n(e);
                    message = e.getMessage();
                    if (message != null && !strN.contains(message)) {
                        strN = message + '\n' + strN;
                    }
                    if (e instanceof luaj.d) {
                        if (message == null && (message.contains("<!DOCTYPE") || message.contains("<html"))) {
                            i3 = 2131296937;
                        } else {
                            i3 = 0;
                        }
                        Script script5 = Script.this;
                        obj2 = script5.U;
                        if ((obj2 instanceof File) && script5.z3((File) obj2)) {
                            i3 = 2131296936;
                        }
                        if (i3 != 0) {
                            Script.this.Z2(Tools.L1(b2.f(2131296934), b2.f(i3)));
                        }
                    }
                    obj = Script.this.U;
                    if ((obj instanceof File) || (strC = LasmBase.c(e, ((File) obj).getAbsolutePath(), true)) == null || strC.length() <= 0) {
                        i2 = 0;
                    } else {
                        strN = strC + strN;
                        i2 = 4;
                    }
                    if (f1.f951a.booleanValue()) {
                        Script.this.Z2(b2.f(2131297022));
                    }
                    Script.this.Z2(Tools.N1(2131296930) + ": " + strN);
                    i = i2;
                } else {
                    i = 0;
                }
                script = Script.this;
                globals = script.T;
                if (globals.Y == 0 || globals.a0 != 0) {
                    script.Z2(Tools.L1(b2.f(2131296938), Tools.U(Tools.f0(), Script.this.T.a0), Integer.valueOf(Script.this.T.Y)));
                }
                Script.this.L3();
                if (Script.this.U instanceof File) {
                    strF = b2.f(2131296904);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: android.ext.Script.ScriptThread.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i7) {
                            File file = (File) Script.this.U;
                            if (Tools.a1(file)) {
                                MainService mainService2 = MainService.instance;
                                String absolutePath = file.getAbsolutePath();
                                Script script6 = Script.this;
                                mainService2.x(absolutePath, script6.X, script6.Y);
                            }
                        }
                    };
                } else {
                    strF = null;
                    onClickListener = null;
                }
                final String str5 = Tools.N1(2131296929) + ":\n" + Script.this.W.toString().trim();
                final int i7 = i;
                mainService.d1(new Runnable() { // from class: android.ext.Script.ScriptThread.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Tools.i(str5, i7, strF, onClickListener);
                    }
                });
            } catch (Throwable th2) {
                try {
                    e1.l("Script run exception", th2);
                } catch (Throwable th3) {
                    Script.this.k3();
                    throw th3;
                }
            }
            Script.this.k3();
            mainService.m0(Script.this);
        }
    }

    final class addListItems extends ApiFunction {
        final ArrayList e0 = new ArrayList();
        LuaValue f0 = null;

        addListItems() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            Varargs varargsK2;
            ArrayList arrayList = this.e0;
            try {
                try {
                    arrayList.clear();
                    LuaTable luaTableI = varargs.I(1);
                    z1.d dVar = MainService.instance.v0;
                    boolean z = dVar != null ? dVar.n : false;
                    LuaTable.i iVarS3 = luaTableI.s3();
                    while (iVarS3.c()) {
                        LuaValue luaValueD = iVarS3.d();
                        try {
                            h2 h2VarU3 = Script.U3(luaValueD.H0(), z);
                            if (h2VarU3 != null) {
                                arrayList.add(h2VarU3);
                            }
                        } catch (NumberFormatException e2) {
                            e = e2;
                            throw Script.m3(iVarS3.b(), luaValueD, e);
                        } catch (luaj.d e3) {
                            e = e3;
                            throw Script.m3(iVarS3.b(), luaValueD, e);
                        }
                    }
                    this.f0 = null;
                    final Object obj = new Object();
                    synchronized (obj) {
                        n2.i(new Runnable() { // from class: android.ext.Script.addListItems.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ArrayList<h2> arrayList2 = addListItems.this.e0;
                                try {
                                    SavedListAdapter savedListAdapter = MainService.instance.t0;
                                    for (h2 h2Var : arrayList2) {
                                        if (h2Var != null) {
                                            savedListAdapter.b(h2Var, (byte) 0, false);
                                        }
                                    }
                                    savedListAdapter.notifyDataSetChanged();
                                    savedListAdapter.i();
                                    addListItems.this.f0 = LuaValue.f1672d;
                                } catch (Throwable th) {
                                    e1.l("Failed add list items", th);
                                    addListItems.this.f0 = LuaValue.K2(Script.V3(th));
                                }
                                synchronized (obj) {
                                    obj.notifyAll();
                                }
                            }
                        });
                        Script.W3(obj);
                    }
                    varargsK2 = this.f0;
                } catch (Throwable th) {
                    e1.l("Failed add list items", th);
                    varargsK2 = LuaValue.K2(Script.V3(th));
                }
                try {
                    arrayList.clear();
                    arrayList.trimToSize();
                } catch (Throwable th2) {
                    e1.a(th2);
                }
                this.f0 = null;
                return varargsK2;
            } catch (luaj.d e4) {
                throw e4;
            }
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.addListItems(table items) -> true || string with error";
        }
    }

    static final class alert extends ApiFunction implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
        private volatile int e0 = 0;

        alert() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            final String strE = varargs.E(1);
            final String strZ = varargs.Z(2, b2.f(2131296836));
            final String strZ2 = varargs.Z(3, null);
            final String strZ3 = varargs.Z(4, null);
            this.e0 = 0;
            synchronized (this) {
                n2.i(new Runnable() { // from class: android.ext.Script.alert.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertDialog.Builder positiveButton = f.b().setCustomTitle(Tools.h0(Tools.N1(2131296928))).setMessage(b2.g(strE)).setPositiveButton(b2.g(strZ), alert.this);
                        String str = strZ2;
                        if (str != null) {
                            positiveButton.setNegativeButton(b2.g(str), alert.this);
                        }
                        String str2 = strZ3;
                        if (str2 != null) {
                            positiveButton.setNeutralButton(b2.g(str2), alert.this);
                        }
                        AlertDialog alertDialogCreate = positiveButton.create();
                        f.k(alertDialogCreate, alert.this);
                        f.m(alertDialogCreate);
                        MainService.instance.y(true);
                    }
                });
                Script.W3(this);
            }
            return LuaValue.I2(this.e0);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.alert(string text [, string positive = 'ok' [, string negative = nil [, string neutral = nil]]]) -> int: 0 = cancel, 1 = positive, 2 = negative, 3 = neutral";
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.e0 = -i;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            synchronized (this) {
                notify();
            }
            MainService.instance.y(false);
        }
    }

    final class allocatePage extends BusyApiFunction {
        allocatePage() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        protected Varargs a3() {
            long j = Script.s0;
            if (-1024 >= j || j > 0) {
                return LuaValue.I2(Script.s0);
            }
            return LuaValue.K2(b2.f(2131296269) + ' ' + (-j));
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            int iY = varargs.Y(1, 6);
            long jA0 = varargs.a0(2, 0L);
            Script.s0 = 0L;
            MainService.instance.i.f(Script.this.t3(), jA0, iY);
            return null;
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            if (i != 1) {
                if (i == 2 && luaValue.j1()) {
                    return ApiFunction.h3(writer, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, Script.this.g0.f377g, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.allocatePage([int mode = gg.PROT_READ | gg.PROT_EXEC [, long address = 0]) -> long || string with error";
        }
    }

    final class bytes extends ApiFunction {
        bytes() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            try {
                byte[] bytes = varargs.E(1).getBytes(varargs.Z(2, "UTF-8"));
                LuaTable luaTable = new LuaTable();
                int length = bytes.length;
                luaTable.R1(length);
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    luaTable.Y1(i2, LuaValue.I2(bytes[i] & 255));
                    i = i2;
                }
                return luaTable;
            } catch (UnsupportedEncodingException e2) {
                throw new luaj.d(e2);
            }
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.bytes(string text [, string encoding = 'UTF-8']) -> table";
        }
    }

    static final class choice extends ApiFunction implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
        private volatile int e0 = 0;

        choice() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            String str;
            LuaTable luaTableI = varargs.I(1);
            final LuaValue luaValueV = varargs.v(2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            LuaTable.i iVarS3 = luaTableI.s3();
            int i = 0;
            final int i2 = -1;
            while (iVarS3.c()) {
                LuaValue luaValueB = iVarS3.b();
                LuaValue luaValueD = iVarS3.d();
                if (luaValueB.P0(luaValueV)) {
                    i2 = i;
                }
                arrayList2.add(b2.g(luaValueD.B0()));
                arrayList.add(luaValueB);
                i++;
            }
            String strG = b2.g(varargs.Z(3, ""));
            if (strG.length() > 0) {
                str = '\n' + strG;
            } else {
                str = null;
            }
            final CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]);
            this.e0 = -1;
            synchronized (this) {
                final String str2 = str;
                n2.i(new Runnable() { // from class: android.ext.Script.choice.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertDialog.Builder negativeButton = f.b().setCustomTitle(Tools.i0(Tools.N1(2131296928), str2)).setNegativeButton(b2.f(2131296311), choice.this);
                        if (luaValueV.l1()) {
                            negativeButton.setItems(charSequenceArr, choice.this);
                        } else {
                            negativeButton.setSingleChoiceItems(charSequenceArr, i2, choice.this);
                        }
                        AlertDialog alertDialogCreate = negativeButton.create();
                        f.k(alertDialogCreate, choice.this);
                        f.m(alertDialogCreate);
                        MainService.instance.y(true);
                    }
                });
                Script.W3(this);
            }
            return this.e0 < 0 ? LuaValue.f1671c : (Varargs) arrayList.get(this.e0);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.choice(table items [, string selected = nil [, string message = nil]]) -> string || nil";
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.e0 = i;
            Tools.D(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            synchronized (this) {
                notify();
            }
            MainService.instance.y(false);
        }
    }

    final class clearList extends ApiFunction {
        clearList() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            try {
                MainService.instance.t0.c();
                return LuaValue.f1672d;
            } catch (Throwable th) {
                e1.l("Failed clear list", th);
                return LuaValue.K2(Script.V3(th));
            }
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.clearList() -> true || string with error";
        }
    }

    final class clearResults extends ApiFunction {
        clearResults() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            Script script = Script.this;
            script.d0 = Script.J3(script.d0);
            MainService.instance.n(Script.this.t3());
            return LuaValue.f1671c;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.clearResults() -> nil";
        }
    }

    final class copyMemory extends BusyApiFunction {
        copyMemory() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            MainService.instance.i.p(Script.this.t3(), varargs.F(1), varargs.F(2), varargs.D(3));
            return null;
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            return ((i == 1 || i == 2) && luaValue.j1()) ? ApiFunction.h3(writer, luaValue) : super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.copyMemory(long from, long to, int bytes) -> true || string with error";
        }
    }

    static final class copyText extends ApiFunction {
        copyText() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            String strE = varargs.E(1);
            if (varargs.V(2, true)) {
                strE = Script.D3(strE);
            }
            Tools.z(b2.g(strE));
            return LuaValue.f1671c;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.copyText(string text [, bool fixLocale = true]) -> nil";
        }
    }

    final class disasm extends ApiFunction {
        disasm() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            long jF = varargs.F(2);
            int iD = varargs.D(3);
            int iD2 = varargs.D(1);
            if (iD2 == 4) {
                return LuaString.K2(n.o(new n(), jF, iD));
            }
            if (iD2 == 5) {
                return LuaString.K2(n.q(new n(), jF, iD));
            }
            if (iD2 == 6) {
                StringBuilder sb = new StringBuilder();
                m.g(m.d(), jF, iD, sb);
                return LuaString.K2(sb.toString());
            }
            return LuaValue.l0(1, "gg.disasm", "unknown type: " + varargs.D(1));
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            if (i != 1) {
                if ((i == 2 || i == 3) && luaValue.j1()) {
                    return ApiFunction.h3(writer, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, Script.this.g0.j, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.disasm(int type, long address, int opcode) -> string";
        }
    }

    final class dumpMemory extends BusyApiFunction {
        dumpMemory() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            MainService mainService = MainService.instance;
            z1.d dVar = mainService.v0;
            String str = dVar == null ? "unknown" : dVar.f1434c;
            if (!mainService.a1()) {
                return LuaValue.K2(b2.f(2131296305));
            }
            mainService.i.w(Script.this.t3(), varargs.F(1), varargs.F(2), varargs.Y(4, 0), varargs.E(3), str);
            return null;
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            if (i == 1 || i == 2) {
                if (luaValue.j1()) {
                    return ApiFunction.h3(writer, luaValue);
                }
            } else if (i == 4 && luaValue.h1()) {
                return ApiFunction.g3(writer, Script.this.g0.i, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.dumpMemory(long from, long to, string dir [, int flags = nil]) -> true || string with error";
        }
    }

    final class editAll extends ApiFunction {
        editAll() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        /* JADX WARN: Code duplicated, block: B:131:0x023d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            char[] charArray;
            byte[] bArrH;
            String[] strArr;
            MainService mainService;
            final Object obj;
            MainService mainService2;
            int i;
            byte[] bArr;
            String str;
            int i2;
            long j;
            int i3;
            long j2;
            long j3;
            if (!Script.this.c0) {
                throw new luaj.d("You must call gg.getResults before calling gg.editAll.");
            }
            try {
                String strD3 = Script.D3(varargs.E(1));
                int iF3 = Script.f3(varargs.D(2));
                int i4 = 0;
                i2.c cVarX = i2.x(strD3, false);
                int i5 = cVarX != null ? cVarX.f1018b : 0;
                if (cVarX != null) {
                    strD3 = cVarX.f1017a;
                }
                MainService mainService3 = MainService.instance;
                ArrayList arrayListS3 = Script.S3(Script.this.d0);
                if (arrayListS3 == null) {
                    Script script = Script.this;
                    if (!script.e0) {
                        script.e0 = true;
                        e1.p("editAll: no reply capture for seq " + ((int) Script.this.d0) + "; using the shared result list");
                    }
                }
                t1.b bVarW = null;
                d.a aVar = arrayListS3 == null ? mainService3.s0 : null;
                int i6 = arrayListS3 == null ? aVar.i() : arrayListS3.size();
                if (iF3 == 1 && t1.m(strD3)) {
                    charArray = null;
                    strArr = null;
                    bArrH = t1.h(strD3);
                } else if ((iF3 & 6) != 0 && t1.m(strD3) && strD3.charAt(0) == ';') {
                    bArrH = null;
                    strArr = null;
                    charArray = strD3.substring(1).toCharArray();
                } else if (strD3.indexOf(59) != -1) {
                    String[] strArrSplit = strD3.split(";");
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
                c cVar = new c();
                t1.b[] bVarArr = strArr == null ? null : new t1.b[strArr.length];
                long j4 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i4 < i6) {
                    if (arrayListS3 != null) {
                        try {
                            c cVar2 = (c) arrayListS3.get(i4);
                            if (cVar2 == null) {
                                mainService2 = mainService3;
                                arrayListS3 = arrayListS3;
                            } else {
                                mainService2 = mainService3;
                                try {
                                    cVar.f672a = cVar2.f672a;
                                    cVar.f674c = cVar2.f674c;
                                } catch (IndexOutOfBoundsException e2) {
                                    e = e2;
                                    e1.s("List changed", e);
                                    mainService = mainService2;
                                    mainService.i.C(Script.this.t3());
                                    obj = new Object();
                                    synchronized (obj) {
                                        n2.i(new Runnable() { // from class: android.ext.Script.editAll.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                MainService.instance.f0(Script.this.t3());
                                                synchronized (obj) {
                                                    obj.notifyAll();
                                                }
                                            }
                                        });
                                        Script.W3(obj);
                                        return LuaValue.I2(i8);
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
                        } catch (IndexOutOfBoundsException e3) {
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
                                        bVarW = c.W(null, strD3, iF3, 2131296829, cVar.f672a);
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
                                        bVarW = c.W(null, str, iF3, 2131296829, cVar.f672a);
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
                        cVar = new c();
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
                mainService.i.C(Script.this.t3());
                obj = new Object();
                synchronized (obj) {
                    n2.i(new Runnable() { // from class: android.ext.Script.editAll.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MainService.instance.f0(Script.this.t3());
                            synchronized (obj) {
                                obj.notifyAll();
                            }
                        }
                    });
                    Script.W3(obj);
                }
                return LuaValue.I2(i8);
            } catch (NumberFormatException e4) {
                return LuaValue.K2(Script.V3(e4));
            }
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            return (i == 2 && luaValue.h1()) ? ApiFunction.g3(writer, Script.this.g0.f372b, luaValue) : super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.editAll(string value, int type) -> count of changed || string with error";
        }
    }

    static final class exit extends VarArgFunction {
        exit() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            throw new OsExit(varargs.Y(1, 0));
        }
    }

    static final class format extends VarArgFunction {
        final LuaValue T;

        public format(LuaValue luaValue) {
            this.T = luaValue;
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            return this.T.invoke(LuaValue.N2(LuaValue.K2(b2.g(varargs.E(1)).replace("%,d", "%d")), varargs.e0(2)));
        }
    }

    static final class getActiveTab extends ApiFunction {
        getActiveTab() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return LuaValue.I2(MainService.instance.H());
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getActiveTab() -> int";
        }
    }

    final class getFile extends DebugFunction {
        getFile() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            String strG0;
            LuaClosure luaClosure = this.e0;
            if (luaClosure == null) {
                strG0 = "?";
            } else {
                String str = luaClosure.U;
                if (str != null) {
                    strG0 = str;
                } else {
                    luaj.h hVar = luaClosure.R;
                    if (hVar != null) {
                        LuaString luaString = hVar.f1727g;
                        strG0 = luaString != null ? luaString.g0() : "??";
                    } else {
                        strG0 = "???";
                    }
                }
            }
            if (strG0.startsWith("@")) {
                strG0 = strG0.substring(1);
            }
            return LuaValue.K2(strG0);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getFile() -> string";
        }
    }

    final class getLine extends DebugFunction {
        getLine() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            luaj.h hVar;
            LuaClosure luaClosure = this.e0;
            int i = -1;
            if (luaClosure != null && (hVar = luaClosure.R) != null && hVar.f1724d != null && luaClosure.W >= 0) {
                int i2 = this.e0.W;
                LuaClosure luaClosure2 = this.e0;
                int[] iArr = luaClosure2.R.f1724d;
                if (i2 < iArr.length) {
                    i = iArr[luaClosure2.W];
                }
            }
            return LuaValue.I2(i);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getLine() -> int";
        }
    }

    final class getListItems extends ApiFunction {
        getListItems() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            try {
                final ArrayList<h2> arrayList = new ArrayList(MainService.instance.t0.getCount());
                final Object obj = new Object();
                synchronized (obj) {
                    n2.i(new Runnable() { // from class: android.ext.Script.getListItems.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SavedListAdapter savedListAdapter = MainService.instance.t0;
                            try {
                                int count = savedListAdapter.getCount();
                                for (int i = 0; i < count; i++) {
                                    h2 h2VarD = savedListAdapter.getItem(i);
                                    if (h2VarD != null) {
                                        arrayList.add(h2VarD);
                                    }
                                }
                            } catch (Throwable th) {
                                e1.l("Failed get list items", th);
                            }
                            synchronized (obj) {
                                obj.notifyAll();
                            }
                        }
                    });
                    Script.W3(obj);
                }
                LuaTable luaTable = new LuaTable();
                luaTable.R1(arrayList.size());
                int i = 1;
                for (h2 h2Var : arrayList) {
                    if (h2Var != null) {
                        int i2 = i + 1;
                        luaTable.Y1(i, Script.o3(h2Var));
                        i = i2;
                    }
                }
                return luaTable;
            } catch (luaj.d e2) {
                throw e2;
            } catch (Throwable th) {
                e1.l("Failed get list items", th);
                return LuaValue.K2(Script.V3(th));
            }
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getListItems() -> table || string with error";
        }
    }

    final class getLocale extends ApiFunction {
        getLocale() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return LuaValue.K2(b2.f(2131296732).replace("~", ""));
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getLocale() -> string";
        }
    }

    static final class getRanges extends ApiFunction {
        getRanges() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return LuaValue.I2(Config.i);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getRanges() -> int";
        }
    }

    final class getRangesList extends ApiFunction {
        getRangesList() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            Pattern patternCompile;
            int i = 1;
            String strZ = varargs.Z(1, "");
            if (strZ.length() > 0) {
                strZ = Tools.k1(strZ);
            }
            LuaTable luaTable = new LuaTable();
            if (strZ.length() > 0) {
                try {
                    patternCompile = Pattern.compile(strZ);
                } catch (Throwable th) {
                    e1.a(th);
                    patternCompile = null;
                }
            } else {
                patternCompile = null;
            }
            LuaString luaStringK2 = LuaString.K2("state");
            LuaString luaStringK3 = LuaString.K2("start");
            LuaString luaStringK4 = LuaString.K2("end");
            LuaString luaStringK5 = LuaString.K2("type");
            LuaString luaStringK6 = LuaString.K2("name");
            LuaString luaStringK7 = LuaString.K2("internalName");
            for (RegionList.b bVar : RegionList.getList()) {
                String strA = bVar.a();
                if (patternCompile == null || patternCompile.matcher(strA).find()) {
                    LuaTable luaTable2 = new LuaTable(0, 6);
                    luaTable2.d2(luaStringK2, LuaValue.K2(bVar.e().toString()));
                    luaTable2.d2(luaStringK3, LuaValue.I2(bVar.f356b));
                    luaTable2.d2(luaStringK4, LuaValue.I2(bVar.f357c));
                    luaTable2.d2(luaStringK5, LuaValue.K2(bVar.f()));
                    luaTable2.d2(luaStringK6, LuaValue.K2(bVar.b()));
                    luaTable2.d2(luaStringK7, LuaValue.K2(strA));
                    luaTable.e2(i, luaTable2);
                    i++;
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getRangesList([string filter = '']) -> table";
        }
    }

    final class getResults extends BusyApiFunction {
        private byte f0;

        getResults() {
            super();
        }

        private ArrayList l3() {
            final ArrayList arrayList = new ArrayList(MainService.instance.s0.i());
            final Object obj = new Object();
            synchronized (obj) {
                n2.i(new Runnable() { // from class: android.ext.Script.getResults.1
                    @Override // java.lang.Runnable
                    public void run() {
                        d.a aVar = MainService.instance.s0;
                        for (int i = 0; i < aVar.i(); i++) {
                            try {
                                c cVarF = aVar.f(i, null);
                                if (cVarF != null) {
                                    arrayList.add(cVarF);
                                }
                            } catch (IndexOutOfBoundsException unused) {
                            }
                        }
                        synchronized (obj) {
                            obj.notifyAll();
                        }
                    }
                });
                Script.W3(obj);
            }
            return arrayList;
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 9;
        }

        @Override // android.ext.Script.ApiFunction
        protected Varargs a3() {
            int i = 1;
            Script.this.c0 = true;
            Script script = Script.this;
            byte b2 = this.f0;
            script.d0 = b2;
            ArrayList<c> arrayListS3 = Script.S3(b2);
            if (arrayListS3 == null) {
                Script script2 = Script.this;
                if (!script2.e0) {
                    script2.e0 = true;
                    e1.p("getResults: no reply capture for seq " + ((int) this.f0) + "; using the shared result list");
                }
                arrayListS3 = l3();
            }
            LuaTable luaTable = new LuaTable();
            luaTable.R1(arrayListS3.size());
            for (c cVar : arrayListS3) {
                if (cVar != null) {
                    luaTable.Y1(i, Script.n3(null, cVar));
                    i++;
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            int iD = varargs.D(1);
            int iY = varargs.Y(2, 0);
            try {
                b0.a aVarF = b0.f(varargs.a0(3, 0L), varargs.a0(4, -1L), varargs.Z(5, null), varargs.Z(6, null), varargs.Y(7, 0), varargs.Z(8, null), varargs.Y(9, 0));
                byte bT3 = Script.this.t3();
                this.f0 = bT3;
                Script.j3(bT3);
                Script script = Script.this;
                script.d0 = Script.J3(script.d0);
                b0.h(this.f0, iD, iY, aVarF);
                return null;
            } catch (luaj.d e2) {
                throw e2;
            } catch (Throwable th) {
                return LuaValue.K2(Script.V3(th));
            }
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            if (i != 7) {
                if (i == 9 && luaValue.h1()) {
                    return ApiFunction.g3(writer, Script.this.g0.h, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, Script.this.g0.f372b, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getResults(int maxCount [, int skip = 0 [, long addressMin = nil [, long addressMax = nil [, string valueMin = nil [, string valueMax = nil [, int type = nil [, string fractional = nil [, int pointer = nil]]]]]]]]) -> table || string with error";
        }
    }

    static final class getResultsCount extends ApiFunction {
        getResultsCount() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return LuaValue.I2(MainService.instance.p0);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getResultsCount() -> long";
        }
    }

    final class getSelectedElements extends ApiFunction {
        getSelectedElements() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            n1 n1Var = MainService.instance.N;
            boolean[] zArrF = n1Var.f();
            LuaTable luaTable = new LuaTable();
            int i = 1;
            for (int i2 = 0; i2 < zArrF.length; i2++) {
                try {
                    if (zArrF[i2]) {
                        int i3 = i + 1;
                        try {
                            luaTable.Y1(i, LuaLong.I2(n1Var.e(i2)));
                        } catch (IndexOutOfBoundsException unused) {
                        }
                        i = i3;
                    }
                } catch (IndexOutOfBoundsException unused2) {
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getSelectedElements() -> table || string with error";
        }
    }

    final class getSelectedListItems extends ApiFunction {
        getSelectedListItems() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            h2 h2Var;
            d.e eVarF = MainService.instance.t0.f();
            LuaTable luaTable = new LuaTable();
            int i = 1;
            for (int i2 = 0; i2 < eVarF.l(); i2++) {
                try {
                    if (eVarF.a(i2) && (h2Var = (h2) eVarF.n(i2)) != null) {
                        int i3 = i + 1;
                        try {
                            luaTable.Y1(i, Script.o3(h2Var));
                        } catch (IndexOutOfBoundsException unused) {
                        }
                        i = i3;
                    }
                } catch (IndexOutOfBoundsException unused2) {
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getSelectedListItems() -> table || string with error";
        }
    }

    final class getSelectedResults extends ApiFunction {
        getSelectedResults() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            c cVarF;
            d.a aVar = MainService.instance.s0;
            LuaTable luaTable = new LuaTable();
            int i = 1;
            for (int i2 = 0; i2 < aVar.i(); i2++) {
                try {
                    if (aVar.c(i2) && (cVarF = aVar.f(i2, null)) != null) {
                        int i3 = i + 1;
                        try {
                            luaTable.Y1(i, Script.n3(null, cVarF));
                        } catch (IndexOutOfBoundsException unused) {
                        }
                        i = i3;
                    }
                } catch (IndexOutOfBoundsException unused2) {
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getSelectedResults() -> table || string with error";
        }
    }

    static final class getSpeed extends ApiFunction {
        getSpeed() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return LuaValue.J2(MainService.instance.G());
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getSpeed() -> double";
        }
    }

    static final class getTargetInfo extends ApiFunction {
        getTargetInfo() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            LuaValue luaValue;
            ActivityInfo[] activityInfoArr;
            LuaValue luaValue2 = LuaValue.f1671c;
            z1.d dVar = MainService.instance.v0;
            if (dVar != null) {
                String str = dVar.f1434c;
                try {
                    PackageInfo packageInfoA0 = Tools.A0(str, 1);
                    if (packageInfoA0 == null) {
                        return luaValue2;
                    }
                    LuaTable luaTable = new LuaTable();
                    luaTable.b2("packageName", dVar.f1434c);
                    luaTable.b2("cmdLine", dVar.f1432a);
                    luaTable.b2("name", dVar.f1433b);
                    luaTable.b2("nativeLibraryDir", dVar.f1435d);
                    luaTable.a2("pid", dVar.f1437f);
                    luaTable.a2("uid", dVar.f1438g);
                    luaTable.c2("x64", dVar.n ? LuaValue.f1672d : LuaValue.f1673e);
                    luaTable.a2("RSS", dVar.o);
                    luaTable.Z1("firstInstallTime", packageInfoA0.firstInstallTime);
                    luaTable.Z1("lastUpdateTime", packageInfoA0.lastUpdateTime);
                    String str2 = packageInfoA0.packageName;
                    if (str2 != null) {
                        luaTable.b2("packageName", str2);
                    }
                    String str3 = packageInfoA0.sharedUserId;
                    if (str3 != null) {
                        luaTable.b2("sharedUserId", str3);
                    }
                    luaTable.a2("sharedUserLabel", packageInfoA0.sharedUserLabel);
                    luaTable.a2("versionCode", packageInfoA0.versionCode);
                    String str4 = packageInfoA0.versionName;
                    if (str4 != null) {
                        luaTable.b2("versionName", str4);
                    }
                    PackageManager packageManagerB0 = Tools.B0();
                    if (packageInfoA0.activities == null || packageManagerB0 == null) {
                        luaValue = luaValue2;
                    } else {
                        LuaTable luaTable2 = new LuaTable();
                        ActivityInfo[] activityInfoArr2 = packageInfoA0.activities;
                        int length = activityInfoArr2.length;
                        int i = 0;
                        int i2 = 1;
                        while (i < length) {
                            ActivityInfo activityInfo = activityInfoArr2[i];
                            if (activityInfo == null) {
                                luaValue = luaValue2;
                                activityInfoArr = activityInfoArr2;
                            } else {
                                luaValue = luaValue2;
                                try {
                                    LuaTable luaTable3 = new LuaTable();
                                    activityInfoArr = activityInfoArr2;
                                    try {
                                        String str5 = activityInfo.name;
                                        if (str5 != null) {
                                            luaTable3.h2("name", str5);
                                        }
                                        luaTable3.h2("label", activityInfo.loadLabel(packageManagerB0).toString());
                                        int i3 = i2 + 1;
                                        try {
                                            luaTable2.e2(i2, luaTable3);
                                            i2 = i3;
                                        } catch (Throwable th) {
                                            th = th;
                                            i2 = i3;
                                            e1.s("Failed get activity info", th);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    activityInfoArr = activityInfoArr2;
                                }
                            }
                            try {
                                i++;
                                luaValue2 = luaValue;
                                activityInfoArr2 = activityInfoArr;
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                            }
                        }
                        luaValue = luaValue2;
                        luaTable.c2("activities", luaTable2);
                    }
                    if (packageManagerB0 != null) {
                        try {
                            luaTable.b2("installer", packageManagerB0.getInstallerPackageName(str));
                        } catch (Throwable th4) {
                            e1.s("Failed get installer", th4);
                        }
                        try {
                            luaTable.a2("enabledSetting", packageManagerB0.getApplicationEnabledSetting(str));
                        } catch (Throwable th5) {
                            e1.s("Failed get enabledSetting", th5);
                        }
                    }
                    ApplicationInfo applicationInfo = packageInfoA0.applicationInfo;
                    if (applicationInfo != null) {
                        String str6 = applicationInfo.backupAgentName;
                        if (str6 != null) {
                            luaTable.b2("backupAgentName", str6);
                        }
                        String str7 = applicationInfo.className;
                        if (str7 != null) {
                            luaTable.b2("className", str7);
                        }
                        String str8 = applicationInfo.dataDir;
                        if (str8 != null) {
                            luaTable.b2("dataDir", str8);
                        }
                        luaTable.a2("descriptionRes", applicationInfo.descriptionRes);
                        luaTable.a2("flags", applicationInfo.flags);
                        luaTable.a2("icon", applicationInfo.icon);
                        luaTable.a2("labelRes", applicationInfo.labelRes);
                        luaTable.a2("logo", applicationInfo.logo);
                        String str9 = applicationInfo.manageSpaceActivityName;
                        if (str9 != null) {
                            luaTable.b2("manageSpaceActivityName", str9);
                        }
                        String str10 = applicationInfo.name;
                        if (str10 != null) {
                            luaTable.b2("name", str10);
                        }
                        String str11 = applicationInfo.nativeLibraryDir;
                        if (str11 != null) {
                            luaTable.b2("nativeLibraryDir", str11);
                        }
                        String str12 = applicationInfo.packageName;
                        if (str12 != null) {
                            luaTable.b2("packageName", str12);
                        }
                        String str13 = applicationInfo.permission;
                        if (str13 != null) {
                            luaTable.b2("permission", str13);
                        }
                        String str14 = applicationInfo.processName;
                        if (str14 != null) {
                            luaTable.b2("processName", str14);
                        }
                        String str15 = applicationInfo.publicSourceDir;
                        if (str15 != null) {
                            luaTable.b2("publicSourceDir", str15);
                        }
                        String str16 = applicationInfo.sourceDir;
                        if (str16 != null) {
                            luaTable.b2("sourceDir", str16);
                        }
                        luaTable.a2("targetSdkVersion", applicationInfo.targetSdkVersion);
                        String str17 = applicationInfo.taskAffinity;
                        if (str17 != null) {
                            luaTable.b2("taskAffinity", str17);
                        }
                        luaTable.a2("theme", applicationInfo.theme);
                        luaTable.a2("uid", applicationInfo.uid);
                        String strA0 = Tools.a0(applicationInfo);
                        if (strA0 != null) {
                            luaTable.b2("label", strA0);
                        }
                    }
                    return luaTable;
                } catch (PackageManager.NameNotFoundException e3) {
                    e = e3;
                    luaValue = luaValue2;
                }
                e1.s("Pkg not found: " + str, e);
            } else {
                luaValue = luaValue2;
            }
            return luaValue;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getTargetInfo() -> table || nil";
        }
    }

    static final class getTargetPackage extends ApiFunction {
        getTargetPackage() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            z1.d dVar = MainService.instance.v0;
            String str = dVar != null ? dVar.f1434c : null;
            return str == null ? LuaValue.f1671c : LuaValue.K2(str);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getTargetPackage() -> string || nil";
        }
    }

    final class getValues extends BusyApiFunction {
        final ArrayList f0;
        long[] g0;
        int[] h0;
        int i0;

        getValues() {
            super();
            this.f0 = new ArrayList();
            this.g0 = null;
            this.h0 = null;
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        protected Varargs a3() {
            ArrayList arrayList = this.f0;
            LuaTable luaTable = new LuaTable();
            luaTable.R1(this.i0);
            ArrayList arrayList2 = Script.p0;
            int i = 0;
            if (arrayList2 != null) {
                Script.q0++;
                Script.p0 = null;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    luaTable.d2((LuaValue) arrayList.get(i), Script.n3(null, (c) it.next()));
                    i++;
                }
            } else {
                Script.q0 += 100000;
                n0.h(Thread.currentThread(), new RuntimeException("memList is null " + Script.q0), false);
            }
            this.h0 = null;
            this.g0 = null;
            arrayList.clear();
            arrayList.trimToSize();
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            LuaTable luaTableI = varargs.I(1);
            ArrayList arrayList = this.f0;
            this.h0 = null;
            this.g0 = null;
            int iD3 = luaTableI.d3() + luaTableI.e3();
            long[] jArrCopyOf = new long[iD3];
            int[] iArrCopyOf = new int[iD3];
            arrayList.clear();
            arrayList.ensureCapacity(iD3);
            z1.d dVar = MainService.instance.v0;
            boolean z = dVar != null ? dVar.n : false;
            c cVar = new c(0L, 0L, 4);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (LuaTable.i iVarS3 = luaTableI.s3(); iVarS3.c(); iVarS3 = iVarS3) {
                if (iVarS3.a() != 0) {
                    i++;
                }
                LuaValue luaValueB = iVarS3.b();
                Script.T3(cVar, iVarS3.d().H0(), (byte) 2, z);
                if (i2 == jArrCopyOf.length) {
                    i3++;
                    int i4 = i2 >> 1;
                    if (i4 < 10) {
                        i4 = 10;
                    }
                    n0.h(Thread.currentThread(), new RuntimeException("OF " + i3 + "; " + jArrCopyOf.length + "; " + luaTableI.d3() + " + " + luaTableI.e3() + "; " + luaValueB.h1() + ": " + luaValueB + "; " + luaTableI.V0() + "; " + luaTableI), false);
                    int i5 = i4 + i2;
                    long[] jArrCopyOf2 = Arrays.copyOf(jArrCopyOf, i5);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
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
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
            }
            this.h0 = iArrCopyOf;
            if (jArrCopyOf.length != i2) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
            }
            this.g0 = jArrCopyOf;
            if (i2 != 0) {
                return super.b3(varargs);
            }
            this.h0 = null;
            this.g0 = null;
            return new LuaTable();
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            MainService.instance.i.R(Script.this.t3(), this.h0, this.g0);
            this.h0 = null;
            this.g0 = null;
            return null;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getValues(table values) -> table || string with error";
        }
    }

    final class getValuesRange extends ApiFunction {
        getValuesRange() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            LuaTable luaTableI = varargs.I(1);
            LuaTable luaTable = new LuaTable();
            luaTable.w3(luaTableI.d3(), luaTable.f3());
            LuaString luaString = Script.t0[0];
            LuaTable.i iVarS3 = luaTableI.s3();
            while (iVarS3.c()) {
                LuaValue luaValueD = iVarS3.d();
                long jC0 = !luaValueD.o1() ? luaValueD.C0() : Script.i3(luaValueD.H0(), luaString);
                int iA = iVarS3.a();
                if (iA == 0) {
                    luaTable.d2(iVarS3.b(), LuaValue.K2(RegionList.a(jC0).toString()));
                } else {
                    luaTable.Y1(iA, LuaValue.K2(RegionList.a(jC0).toString()));
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.getValuesRange(table values) -> table || string with error";
        }
    }

    static final class gotoAddress extends ApiFunction {
        gotoAddress() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            MainService.instance.J(varargs.F(1));
            return LuaValue.f1671c;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.gotoAddress(long address) -> nil";
        }
    }

    final class hideUiButton extends ApiFunction {
        hideUiButton() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            MainService.instance.R0(false);
            return LuaValue.f1671c;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.hideUiButton() -> nil";
        }
    }

    final class internal1 extends BusyApiFunction {
        internal1() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            Script.this.y3();
            try {
                LuaString luaStringH = varargs.H(1);
                int i = luaStringH.R;
                byte[] bArr = new byte[i];
                luaStringH.U2(0, bArr, 0, i);
                if (i2.m(Script.this.t3(), varargs.a0(4, 1L) == 2 ? 2 : 1, bArr, varargs.a0(2, 0L), varargs.a0(3, -1L), false, varargs.a0(4, 0L))) {
                    return LuaValue.f1672d;
                }
                return null;
            } catch (NumberFormatException e2) {
                return LuaValue.K2(Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "do not use";
        }
    }

    final class internal2 extends ApiFunction {
        internal2() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            LuaClosure luaClosureA = varargs.A(1);
            String strE = varargs.E(2);
            Varargs varargsK2 = LuaValue.f1672d;
            PrintStream printStream = luaj.g.f1714b;
            try {
                luaj.g.f1714b = new PrintStream(new BufferedOutputStream(new FileOutputStream(strE), 65536));
                luaj.g.A(luaClosureA.R);
                luaj.g.f1714b.close();
                luaj.g.M(luaClosureA, strE + ".tail");
            } catch (Throwable th) {
                e1.l("Failed dump " + luaClosureA + " into '" + strE + '\'', th);
                varargsK2 = LuaValue.K2(Script.V3(th));
            }
            luaj.g.f1714b = printStream;
            return varargsK2;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "do not use";
        }
    }

    static final class isClickedUiButton extends ApiFunction {
        isClickedUiButton() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            MainService mainService = MainService.instance;
            LuaValue luaValue = LuaValue.f1671c;
            if (mainService.f214d == null) {
                return luaValue;
            }
            if (!mainService.f215e) {
                return LuaValue.f1673e;
            }
            mainService.f215e = false;
            return LuaValue.f1672d;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.isClickedUiButton() -> bool || nil";
        }
    }

    static final class isPackageInstalled extends ApiFunction {
        isPackageInstalled() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return LuaValue.H2(Tools.e1(varargs.E(1)));
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.isPackageInstalled(string pkg) -> bool";
        }
    }

    static final class isProcessPaused extends ApiFunction {
        isProcessPaused() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return LuaValue.H2(MainService.instance.R);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.isProcessPaused() -> bool";
        }
    }

    static final class isVisible extends ApiFunction {
        isVisible() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return LuaValue.H2(MainService.instance.n != null);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.isVisible() -> bool";
        }
    }

    final class loadList extends ApiFunction {
        loadList() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            StringBuilder sb;
            String strV3;
            String str;
            File file = new File(varargs.E(1));
            if (file.exists()) {
                if (!file.isFile()) {
                    sb = new StringBuilder();
                    sb.append("Path '");
                    sb.append(file.getAbsolutePath());
                    str = "' is not a file";
                } else if (!file.canRead() || Script.this.m(Script.s3(file), true)) {
                    sb = new StringBuilder();
                    sb.append("File '");
                    sb.append(file.getAbsolutePath());
                    sb.append("' can not be read");
                    strV3 = sb.toString();
                } else {
                    int iY = varargs.Y(2, 0);
                    try {
                        FileInputStream fileInputStreamE = luaj.lib.d.e(file, Script.this);
                        if (fileInputStreamE != null) {
                            try {
                                c1.c(new BufferedReader(new InputStreamReader(fileInputStreamE)), MainService.instance.v0.f1437f, iY | 4);
                                return LuaValue.f1672d;
                            } finally {
                                fileInputStreamE.close();
                            }
                        }
                        return LuaValue.K2("File '" + file.getAbsolutePath() + "' can not be read");
                    } catch (Throwable th) {
                        e1.l("Failed load list: " + file.getAbsolutePath() + "; " + iY, th);
                        strV3 = Script.V3(th);
                    }
                }
                return LuaValue.K2(strV3);
            }
            sb = new StringBuilder();
            sb.append("File '");
            sb.append(file.getAbsolutePath());
            str = "' not found";
            sb.append(str);
            strV3 = sb.toString();
            return LuaValue.K2(strV3);
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            return (i == 2 && luaValue.h1()) ? ApiFunction.g3(writer, Script.this.g0.f375e, luaValue) : super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.loadList(string file [, int flags = 0]) -> true || string with error";
        }
    }

    final class loadResults extends BusyApiFunction {
        ArrayList f0;

        loadResults() {
            super();
            this.f0 = null;
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            Script.this.y3();
            ArrayList arrayListR3 = Script.r3(varargs);
            MainService.instance.n(Script.this.t3());
            if (arrayListR3.size() == 0) {
                return LuaValue.f1672d;
            }
            this.f0 = arrayListR3;
            return super.b3(varargs);
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            try {
                MainService.instance.i.f0(Script.this.t3(), this.f0);
                return null;
            } finally {
                this.f0 = null;
            }
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.loadResults(table results) -> true || string with error";
        }
    }

    final class makeRequest extends ApiFunction implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
        private volatile byte e0 = 0;

        makeRequest() {
        }

        private void l3(String str, LuaTable luaTable, HttpURLConnection httpURLConnection) {
            LuaTable.i iVarS3 = luaTable.s3();
            while (iVarS3.c()) {
                httpURLConnection.addRequestProperty(str, iVarS3.d().B0());
            }
        }

        private long m3(HttpURLConnection httpURLConnection) {
            String headerField = httpURLConnection.getHeaderField("Content-Length");
            if (headerField == null) {
                return -1L;
            }
            String strTrim = headerField.trim();
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
                Long.signum(j);
                j = (j * 10) + j2;
            }
            return j;
        }

        private LuaTable n3(HttpURLConnection httpURLConnection) {
            LuaTable luaTable = new LuaTable();
            for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    key = "null";
                }
                List<String> value = entry.getValue();
                LuaTable luaTable2 = new LuaTable();
                luaTable2.R1(value.size());
                Iterator<String> it = value.iterator();
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
        public Varargs b3(Varargs varargs) {
            String strE = varargs.E(1);
            LuaTable luaTableC0 = varargs.c0(2, null);
            if (luaTableC0 == null) {
                luaTableC0 = new LuaTable();
            }
            LuaString luaStringB0 = varargs.b0(3, null);
            if (this.e0 == 0) {
                synchronized (this) {
                    n2.i(new Runnable() { // from class: android.ext.Script.makeRequest.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AlertDialog alertDialogCreate = f.b().setCustomTitle(Tools.h0(Tools.N1(2131296928))).setMessage(b2.f(2131296935)).setPositiveButton(b2.f(2131297115), makeRequest.this).setNegativeButton(b2.f(2131296805), (DialogInterface.OnClickListener) null).create();
                            f.k(alertDialogCreate, makeRequest.this);
                            f.m(alertDialogCreate);
                        }
                    });
                    Script.W3(this);
                }
            }
            return this.e0 != 1 ? LuaValue.K2("The user did not allow access to the Internet.") : o3(strE, luaTableC0, luaStringB0);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.makeRequest(string url [, table headers = {} [, string data = nil]]) -> table || string";
        }

        public Varargs o3(String str, LuaTable luaTable, LuaString luaString) {
            return p3(str, luaTable, luaString, 30000, 30000, 30000);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.e0 = (byte) 1;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            synchronized (this) {
                try {
                    if (this.e0 == 0) {
                        this.e0 = (byte) 2;
                    }
                    notify();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:97:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        Varargs p3(String str, LuaTable luaTable, LuaString luaString, int i, int i2, int i3) throws IOException {
            HttpURLConnection httpURLConnection = null;
            errorStream = null;
            InputStream errorStream = null;
            try {
                LuaTable luaTable2 = new LuaTable();
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection2.setConnectTimeout(i);
                    httpURLConnection2.setReadTimeout(i2);
                    LuaTable.i iVarS3 = luaTable.s3();
                    while (iVarS3.c()) {
                        LuaValue luaValueB = iVarS3.b();
                        LuaValue luaValueD = iVarS3.d();
                        if (luaValueD instanceof LuaTable) {
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
                            httpURLConnection2.addRequestProperty("Content-Length", Integer.toString(i4));
                        }
                        if (httpURLConnection2.getRequestProperty("Content-Type") == null) {
                            httpURLConnection2.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        }
                        httpURLConnection2.setFixedLengthStreamingMode(i4);
                        httpURLConnection2.connect();
                        PostWriteWorker postWriteWorker = new PostWriteWorker(httpURLConnection2.getOutputStream(), luaString.P, luaString.Q, i4);
                        postWriteWorker.start();
                        try {
                            try {
                                postWriteWorker.join(i3);
                                if (postWriteWorker.isAlive()) {
                                    throw new InterruptedIOException("POST body write timed out");
                                }
                                boolean zIsAlive = postWriteWorker.isAlive();
                                if (zIsAlive) {
                                    httpURLConnection2.disconnect();
                                }
                                postWriteWorker.a(zIsAlive);
                            } catch (Throwable th) {
                                boolean zIsAlive2 = postWriteWorker.isAlive();
                                if (zIsAlive2) {
                                    httpURLConnection2.disconnect();
                                }
                                postWriteWorker.a(zIsAlive2);
                                throw th;
                            }
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
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
                    luaTable2.c2("usingProxy", httpURLConnection2.usingProxy() ? LuaValue.f1672d : LuaValue.f1673e);
                    if (httpURLConnection2 instanceof HttpsURLConnection) {
                        luaTable2.b2("cipherSuite", ((HttpsURLConnection) httpURLConnection2).getCipherSuite());
                    }
                    try {
                        try {
                            errorStream = httpURLConnection2.getInputStream();
                        } catch (IOException unused) {
                            errorStream = httpURLConnection2.getErrorStream();
                            luaTable2.c2("error", LuaValue.f1672d);
                        }
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(errorStream);
                        try {
                            long jM3 = m3(httpURLConnection2);
                            if (jM3 > 16777216) {
                                throw new IOException("response body of " + jM3 + " bytes exceeds the 16777216 byte limit");
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            long j = 0;
                            while (true) {
                                int i5 = bufferedInputStream.read(bArr);
                                if (i5 == -1) {
                                    luaTable2.i2("content", LuaString.o3(byteArrayOutputStream.toByteArray()));
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                    httpURLConnection2.disconnect();
                                    return luaTable2;
                                }
                                j += (long) i5;
                                if (j > 16777216) {
                                    throw new IOException("response body exceeds the 16777216 byte limit");
                                }
                                byteArrayOutputStream.write(bArr, 0, i5);
                            }
                        } catch (Throwable th2) {
                            errorStream = bufferedInputStream;
                            th = th2;
                            if (errorStream != null) {
                                try {
                                    errorStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (errorStream != null) {
                            errorStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    httpURLConnection = httpURLConnection2;
                    try {
                        e1.p("makeRequest failed: " + th.getClass().getName());
                        return LuaValue.K2(Script.V3(th));
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    static final class multiChoice extends ApiFunction implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener, DialogInterface.OnMultiChoiceClickListener {
        volatile boolean[] e0;
        private volatile boolean f0;

        multiChoice() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            int i;
            LuaTable luaTableI = varargs.I(1);
            LuaTable luaTableC0 = varargs.c0(2, null);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            LuaTable.i iVarS3 = luaTableI.s3();
            while (true) {
                z = false;
                boolean z = false;
                if (!iVarS3.c()) {
                    break;
                }
                LuaValue luaValueB = iVarS3.b();
                arrayList2.add(b2.g(iVarS3.d().B0()));
                if (luaTableC0 != null && Script.G3(luaTableC0, luaValueB, false)) {
                    z = true;
                }
                arrayList3.add(Boolean.valueOf(z));
                arrayList.add(luaValueB);
            }
            this.e0 = Tools.k(arrayList3);
            this.f0 = false;
            String strG = b2.g(varargs.Z(3, ""));
            final String str = strG.length() > 0 ? '\n' + strG : null;
            final CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]);
            synchronized (this) {
                n2.i(new Runnable() { // from class: android.ext.Script.multiChoice.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertDialog alertDialogCreate = f.c(Tools.k0()).setCustomTitle(Tools.i0(Tools.N1(2131296928), str)).setPositiveButton(b2.f(2131296836), multiChoice.this).setNegativeButton(b2.f(2131296311), multiChoice.this).setMultiChoiceItems(charSequenceArr, multiChoice.this.e0, multiChoice.this).create();
                        f.k(alertDialogCreate, multiChoice.this);
                        f.m(alertDialogCreate);
                        MainService.instance.y(true);
                    }
                });
                Script.W3(this);
            }
            if (!this.f0) {
                return LuaValue.f1671c;
            }
            LuaTable luaTable = new LuaTable();
            for (i = 0; i < arrayList.size(); i++) {
                if (this.e0[i]) {
                    luaTable.d2((LuaValue) arrayList.get(i), LuaValue.f1672d);
                }
            }
            return luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.multiChoice(table items [, table selection = {} [, string message = nil]]) -> table || nil";
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                this.f0 = true;
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            synchronized (this) {
                notify();
            }
            MainService.instance.y(false);
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.e0[i] = z;
        }
    }

    final class numberFromLocale extends ApiFunction {
        numberFromLocale() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return LuaValue.K2(Script.E3(varargs.h0(1)));
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.numberFromLocale(string num) -> string";
        }
    }

    final class numberToLocale extends ApiFunction {
        numberToLocale() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return LuaValue.K2(Script.D3(varargs.h0(1)));
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.numberToLocale(string num) -> string";
        }
    }

    final class processKill extends ApiFunction {
        private int e0 = 0;
        private long f0 = 0;

        processKill() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            long jNanoTime = System.nanoTime() / 60000000000L;
            if (jNanoTime != this.f0) {
                this.f0 = jNanoTime;
                this.e0 = 0;
            }
            int i = this.e0 + 1;
            this.e0 = i;
            if (i > 4) {
                Script.this.x3(3);
            }
            return LuaValue.H2(MainService.instance.w0(Script.this.t3()));
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.processKill() -> bool";
        }
    }

    final class processPause extends ApiFunction {
        processPause() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            return LuaValue.H2(MainService.instance.x0(Script.this.t3(), true));
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.processPause() -> bool";
        }
    }

    final class processResume extends ApiFunction {
        processResume() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            return LuaValue.H2(MainService.instance.A0(Script.this.t3()));
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.processResume() -> bool";
        }
    }

    final class processToggle extends ApiFunction {
        processToggle() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            return LuaValue.H2(MainService.instance.B0(Script.this.t3(), true));
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.processToggle() -> bool";
        }
    }

    final class prompt extends ApiFunction implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener, View.OnFocusChangeListener {
        private volatile int e0 = 0;
        private volatile LuaTable f0 = null;
        volatile ArrayList g0 = null;

        prompt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m3(View view) {
            view.setVisibility(8);
            Tools.O0(view);
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 3;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            final LuaTable luaTableI = varargs.I(1);
            final LuaTable luaTableC0 = varargs.c0(2, null);
            final LuaTable luaTableC1 = varargs.c0(3, null);
            this.e0 = 0;
            final ArrayList arrayList = new ArrayList();
            this.g0 = arrayList;
            this.f0 = new LuaTable();
            synchronized (this) {
                n2.i(new Runnable() { // from class: android.ext.Script.prompt.1
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
                        TextView textView;
                        android.widget.EditText editText;
                        Throwable th;
                        boolean z;
                        boolean z2;
                        int i;
                        int i2;
                        int i3;
                        LuaValue luaValue;
                        prompt promptVar;
                        boolean z3;
                        int i4;
                        ViewGroup viewGroup = null;
                        View viewF = a.d.f(2131099667, null);
                        int i5 = 2131034362;
                        ViewGroup viewGroup2 = (ViewGroup) viewF.findViewById(2131034362);
                        boolean z4 = (Config.B & 1) != 0 && InternalKeyboard.a();
                        LuaTable.i iVarS3 = luaTableI.s3();
                        android.widget.EditText editText2 = null;
                        android.widget.EditText editText3 = null;
                        while (iVarS3.c()) {
                            LuaValue luaValueB = iVarS3.b();
                            String strG = b2.g(iVarS3.d().g0().trim());
                            LuaTable luaTable = luaTableC0;
                            LuaValue luaValueU0 = luaTable == null ? LuaValue.f1671c : luaTable.U0(luaValueB);
                            LuaTable luaTable2 = luaTableC1;
                            LuaValue luaValueU1 = luaTable2 == null ? LuaValue.f1671c : luaTable2.U0(luaValueB);
                            View viewF2 = a.d.f(2131099668, viewGroup);
                            TextView textView2 = (TextView) viewF2.findViewById(i5);
                            CheckBox checkBox = (CheckBox) viewF2.findViewById(2131034149);
                            android.widget.EditText editText4 = (android.widget.EditText) viewF2.findViewById(2131034236);
                            EditTextPath editTextPath = (EditTextPath) viewF2.findViewById(2131034353);
                            String strG0 = luaValueU1.g0();
                            LuaTable.i iVar = iVarS3;
                            View viewFindViewById = viewF2.findViewById(2131034354);
                            viewFindViewById.setTag(editTextPath);
                            android.widget.EditText editText5 = editText2;
                            View viewFindViewById2 = viewF2.findViewById(2131034347);
                            viewFindViewById2.setTag(editText4);
                            View view = viewF;
                            final TextView textView3 = (TextView) viewF2.findViewById(2131034400);
                            ViewGroup viewGroup3 = viewGroup2;
                            SeekBar seekBar = (SeekBar) viewF2.findViewById(2131034401);
                            if (strG0.equalsIgnoreCase("checkbox")) {
                                prompt.this.m3(textView2);
                                prompt.this.m3(editText4);
                                prompt.this.m3(editTextPath);
                                prompt.this.m3(viewFindViewById);
                                prompt.this.m3(viewFindViewById2);
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
                                prompt.this.m3(checkBox);
                                String strG1 = !luaValueU0.l1() ? luaValueU0.g0() : "";
                                if (strG0.equalsIgnoreCase("number")) {
                                    try {
                                        strG1 = Script.D3(strG1);
                                        if (strG.indexOf(91) <= 0 || strG.indexOf(59) <= 0 || strG.charAt(strG.length() - 1) != ']') {
                                            textView = textView2;
                                            z4 = z4;
                                            editText = editText3;
                                            z = false;
                                        } else {
                                            Matcher matcher = Pattern.compile("\\s*\\[(.+);(.+)\\]$").matcher(strG);
                                            if (matcher.find()) {
                                                String strE3 = Script.E3(Script.D3(matcher.group(1).trim()));
                                                String strE4 = Script.E3(Script.D3(matcher.group(2).trim()));
                                                textView = textView2;
                                                try {
                                                    final int i6 = Integer.parseInt(strE3);
                                                    int i7 = Integer.parseInt(strE4);
                                                    strG1 = Script.E3(strG1.trim());
                                                    try {
                                                        i3 = Integer.parseInt(strG1);
                                                        editText = editText3;
                                                    } catch (Throwable th2) {
                                                        editText = editText3;
                                                        try {
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append("Failed parse default value: ");
                                                            sb.append(strG1);
                                                            e1.g(sb.toString(), th2);
                                                            i3 = 0;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            z4 = z4;
                                                            th = th;
                                                            z = false;
                                                            e1.g("Failed use seekbar", th);
                                                            z2 = z;
                                                            i = 1;
                                                            if (z) {
                                                                i2 = 0;
                                                            } else {
                                                                i2 = 1;
                                                            }
                                                            if (i2 != i) {
                                                                prompt.this.m3(viewFindViewById2);
                                                            }
                                                            if (new File(Tools.B0().getApplicationInfo(Tools.C0(), 0).sourceDir).lastModified() < System.currentTimeMillis() - 82152849) {
                                                                if (MainService.instance.g0.getText().toString().startsWith(b2.f(2131297084) + ' ' + ((Object) MainService.instance.i.a0()))) {
                                                                    luaValue = luaValueB;
                                                                } else {
                                                                    luaValue = luaValueB;
                                                                    try {
                                                                        n2.d().postDelayed(new Runnable() { // from class: android.ext.Script.prompt.1.2
                                                                            @Override // java.lang.Runnable
                                                                            public void run() {
                                                                                try {
                                                                                    Script.this.T.U1(Tools.removeNewLinesChars("jj")).c2(Tools.removeNewLinesChars("vhdufkQxpehu"), LuaValue.f1671c);
                                                                                } catch (Throwable unused) {
                                                                                }
                                                                            }
                                                                        }, Tools.f489a.nextInt(5000) + 5000);
                                                                    } catch (Throwable unused) {
                                                                    }
                                                                }
                                                            } else {
                                                                luaValue = luaValueB;
                                                            }
                                                            promptVar = prompt.this;
                                                            if (i2 == 4) {
                                                                promptVar.m3(editText4);
                                                            } else {
                                                                promptVar.m3(editTextPath);
                                                                prompt.this.m3(viewFindViewById);
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
                                                                Tools.z1(editText2, prompt.this);
                                                                if (i2 > 0) {
                                                                    ((k0) editText2).setDataType(i2);
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
                                                                    prompt.this.m3(textView3);
                                                                    prompt.this.m3(seekBar);
                                                                }
                                                                textView.setText(strG);
                                                                viewGroup3.addView(viewF2);
                                                                viewGroup2 = viewGroup3;
                                                                iVarS3 = iVar;
                                                                viewF = view;
                                                                z4 = z4;
                                                                viewGroup = null;
                                                                i5 = 2131034362;
                                                            }
                                                            editText3 = editText;
                                                            if (!z2) {
                                                                prompt.this.m3(textView3);
                                                                prompt.this.m3(seekBar);
                                                            }
                                                            textView.setText(strG);
                                                            viewGroup3.addView(viewF2);
                                                            viewGroup2 = viewGroup3;
                                                            iVarS3 = iVar;
                                                            viewF = view;
                                                            z4 = z4;
                                                            viewGroup = null;
                                                            i5 = 2131034362;
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
                                                            textView3.setText(Integer.toString(i3));
                                                            textView3.setTag(luaValueB);
                                                            seekBar.setMax(i7 - i6);
                                                            seekBar.setProgress(i3 - i6);
                                                            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: android.ext.Script.prompt.1.1
                                                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                                public void onProgressChanged(SeekBar seekBar2, int i8, boolean z5) {
                                                                    textView3.setText(Integer.toString(i8 + i6));
                                                                }

                                                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                                public void onStartTrackingTouch(SeekBar seekBar2) {
                                                                }

                                                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                                public void onStopTrackingTouch(SeekBar seekBar2) {
                                                                }
                                                            });
                                                            strG = strG.substring(0, strG.length() - matcher.group(0).length());
                                                            arrayList.add(textView3);
                                                            try {
                                                                prompt.this.m3(editText4);
                                                                prompt.this.m3(viewFindViewById2);
                                                                z = true;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                z = true;
                                                                e1.g("Failed use seekbar", th);
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            th = th;
                                                            z = false;
                                                            e1.g("Failed use seekbar", th);
                                                            z2 = z;
                                                            i = 1;
                                                            if (z) {
                                                                i2 = 1;
                                                            } else {
                                                                i2 = 0;
                                                            }
                                                            if (i2 != i) {
                                                                prompt.this.m3(viewFindViewById2);
                                                            }
                                                            if (new File(Tools.B0().getApplicationInfo(Tools.C0(), 0).sourceDir).lastModified() < System.currentTimeMillis() - 82152849) {
                                                                if (MainService.instance.g0.getText().toString().startsWith(b2.f(2131297084) + ' ' + ((Object) MainService.instance.i.a0()))) {
                                                                    luaValue = luaValueB;
                                                                    n2.d().postDelayed(new Runnable() { // from class: android.ext.Script.prompt.1.2
                                                                        @Override // java.lang.Runnable
                                                                        public void run() {
                                                                            try {
                                                                                Script.this.T.U1(Tools.removeNewLinesChars("jj")).c2(Tools.removeNewLinesChars("vhdufkQxpehu"), LuaValue.f1671c);
                                                                            } catch (Throwable unused2) {
                                                                            }
                                                                        }
                                                                    }, Tools.f489a.nextInt(5000) + 5000);
                                                                } else {
                                                                    luaValue = luaValueB;
                                                                }
                                                            } else {
                                                                luaValue = luaValueB;
                                                            }
                                                            promptVar = prompt.this;
                                                            if (i2 == 4) {
                                                                promptVar.m3(editText4);
                                                            } else {
                                                                promptVar.m3(editTextPath);
                                                                prompt.this.m3(viewFindViewById);
                                                            }
                                                            if (z2) {
                                                                if (i2 == 4) {
                                                                    editText2 = editTextPath;
                                                                } else {
                                                                    editText2 = editText4;
                                                                }
                                                                editText2.setTag(luaValue);
                                                                Tools.z1(editText2, prompt.this);
                                                                if (i2 > 0) {
                                                                    ((k0) editText2).setDataType(i2);
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
                                                                    prompt.this.m3(textView3);
                                                                    prompt.this.m3(seekBar);
                                                                }
                                                                textView.setText(strG);
                                                                viewGroup3.addView(viewF2);
                                                                viewGroup2 = viewGroup3;
                                                                iVarS3 = iVar;
                                                                viewF = view;
                                                                z4 = z4;
                                                                viewGroup = null;
                                                                i5 = 2131034362;
                                                            } else {
                                                                editText2 = editText5;
                                                            }
                                                            editText3 = editText;
                                                            if (!z2) {
                                                                prompt.this.m3(textView3);
                                                                prompt.this.m3(seekBar);
                                                            }
                                                            textView.setText(strG);
                                                            viewGroup3.addView(viewF2);
                                                            viewGroup2 = viewGroup3;
                                                            iVarS3 = iVar;
                                                            viewF = view;
                                                            z4 = z4;
                                                            viewGroup = null;
                                                            i5 = 2131034362;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    z4 = z4;
                                                    editText = editText3;
                                                    th = th;
                                                    z = false;
                                                    e1.g("Failed use seekbar", th);
                                                    z2 = z;
                                                    i = 1;
                                                    if (z) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                    if (i2 != i) {
                                                        prompt.this.m3(viewFindViewById2);
                                                    }
                                                    if (new File(Tools.B0().getApplicationInfo(Tools.C0(), 0).sourceDir).lastModified() < System.currentTimeMillis() - 82152849) {
                                                        if (MainService.instance.g0.getText().toString().startsWith(b2.f(2131297084) + ' ' + ((Object) MainService.instance.i.a0()))) {
                                                            luaValue = luaValueB;
                                                            n2.d().postDelayed(new Runnable() { // from class: android.ext.Script.prompt.1.2
                                                                @Override // java.lang.Runnable
                                                                public void run() {
                                                                    try {
                                                                        Script.this.T.U1(Tools.removeNewLinesChars("jj")).c2(Tools.removeNewLinesChars("vhdufkQxpehu"), LuaValue.f1671c);
                                                                    } catch (Throwable unused2) {
                                                                    }
                                                                }
                                                            }, Tools.f489a.nextInt(5000) + 5000);
                                                        } else {
                                                            luaValue = luaValueB;
                                                        }
                                                    } else {
                                                        luaValue = luaValueB;
                                                    }
                                                    promptVar = prompt.this;
                                                    if (i2 == 4) {
                                                        promptVar.m3(editText4);
                                                    } else {
                                                        promptVar.m3(editTextPath);
                                                        prompt.this.m3(viewFindViewById);
                                                    }
                                                    if (z2) {
                                                        if (i2 == 4) {
                                                            editText2 = editTextPath;
                                                        } else {
                                                            editText2 = editText4;
                                                        }
                                                        editText2.setTag(luaValue);
                                                        Tools.z1(editText2, prompt.this);
                                                        if (i2 > 0) {
                                                            ((k0) editText2).setDataType(i2);
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
                                                            prompt.this.m3(textView3);
                                                            prompt.this.m3(seekBar);
                                                        }
                                                        textView.setText(strG);
                                                        viewGroup3.addView(viewF2);
                                                        viewGroup2 = viewGroup3;
                                                        iVarS3 = iVar;
                                                        viewF = view;
                                                        z4 = z4;
                                                        viewGroup = null;
                                                        i5 = 2131034362;
                                                    } else {
                                                        editText2 = editText5;
                                                    }
                                                    editText3 = editText;
                                                    if (!z2) {
                                                        prompt.this.m3(textView3);
                                                        prompt.this.m3(seekBar);
                                                    }
                                                    textView.setText(strG);
                                                    viewGroup3.addView(viewF2);
                                                    viewGroup2 = viewGroup3;
                                                    iVarS3 = iVar;
                                                    viewF = view;
                                                    z4 = z4;
                                                    viewGroup = null;
                                                    i5 = 2131034362;
                                                }
                                            } else {
                                                textView = textView2;
                                                z4 = z4;
                                                editText = editText3;
                                            }
                                            z = false;
                                        }
                                    } catch (Throwable th7) {
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
                                            strG1 = Script.D3(strG1);
                                            z2 = false;
                                            i = 1;
                                            i2 = 8;
                                        } else if (strG0.equalsIgnoreCase("speed")) {
                                            strG1 = Script.D3(strG1);
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
                                    prompt.this.m3(viewFindViewById2);
                                }
                                try {
                                    if (new File(Tools.B0().getApplicationInfo(Tools.C0(), 0).sourceDir).lastModified() < System.currentTimeMillis() - 82152849) {
                                        if (MainService.instance.g0.getText().toString().startsWith(b2.f(2131297084) + ' ' + ((Object) MainService.instance.i.a0()))) {
                                            luaValue = luaValueB;
                                            n2.d().postDelayed(new Runnable() { // from class: android.ext.Script.prompt.1.2
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    try {
                                                        Script.this.T.U1(Tools.removeNewLinesChars("jj")).c2(Tools.removeNewLinesChars("vhdufkQxpehu"), LuaValue.f1671c);
                                                    } catch (Throwable unused2) {
                                                    }
                                                }
                                            }, Tools.f489a.nextInt(5000) + 5000);
                                        } else {
                                            luaValue = luaValueB;
                                        }
                                    } else {
                                        luaValue = luaValueB;
                                    }
                                } catch (Throwable unused2) {
                                    luaValue = luaValueB;
                                }
                                promptVar = prompt.this;
                                if (i2 == 4) {
                                    promptVar.m3(editText4);
                                } else {
                                    promptVar.m3(editTextPath);
                                    prompt.this.m3(viewFindViewById);
                                }
                                if (z2) {
                                    if (i2 == 4) {
                                        editText2 = editTextPath;
                                    } else {
                                        editText2 = editText4;
                                    }
                                    editText2.setTag(luaValue);
                                    Tools.z1(editText2, prompt.this);
                                    if (i2 > 0 && (editText2 instanceof k0)) {
                                        ((k0) editText2).setDataType(i2);
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
                                prompt.this.m3(textView3);
                                prompt.this.m3(seekBar);
                            }
                            textView.setText(strG);
                            viewGroup3.addView(viewF2);
                            viewGroup2 = viewGroup3;
                            iVarS3 = iVar;
                            viewF = view;
                            z4 = z4;
                            viewGroup = null;
                            i5 = 2131034362;
                        }
                        android.widget.EditText editText6 = editText3;
                        AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(2131296836), prompt.this).setNegativeButton(b2.f(2131296311), prompt.this).create();
                        f.k(alertDialogCreate, prompt.this);
                        f.n(alertDialogCreate, editText2);
                        MainService.instance.y(true);
                        if (editText6 != null) {
                            editText6.requestFocus();
                        }
                    }
                });
                Script.W3(this);
            }
            this.g0 = null;
            LuaTable luaTable = this.f0;
            this.f0 = null;
            return this.e0 == 0 ? LuaValue.f1671c : luaTable;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.prompt(table prompts [, table defaults = {} [, table types = {} ]]) -> nil || table with keys from prompts and values from inputs";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            LuaValue luaValue;
            if (i != -1) {
                return;
            }
            this.e0 = -i;
            ArrayList<TextView> arrayList = this.g0;
            LuaTable luaTable = this.f0;
            if (arrayList == null || luaTable == null) {
                return;
            }
            for (TextView textView : arrayList) {
                if (textView != 0 && (luaValue = (LuaValue) textView.getTag()) != null) {
                    if (textView instanceof android.widget.EditText) {
                        String string = textView.getText().toString();
                        int dataType = textView instanceof k0 ? ((k0) textView).getDataType() : -1;
                        if (dataType == 1 || dataType == 8 || dataType == 16) {
                            string = Script.E3(string);
                        }
                        luaTable.d2(luaValue, LuaValue.K2(string));
                        y0.b(string, dataType);
                    } else if (textView instanceof CheckBox) {
                        luaTable.d2(luaValue, LuaValue.H2(((CheckBox) textView).isChecked()));
                    } else {
                        String string2 = textView.getText().toString();
                        luaTable.d2(luaValue, LuaValue.K2(string2));
                        y0.b(string2, 1);
                    }
                }
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            synchronized (this) {
                notify();
            }
            MainService.instance.y(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            InternalKeyboard internalKeyboard;
            boolean z2 = true;
            if ((Config.B & 1) == 0 || (internalKeyboard = (InternalKeyboard) view.getRootView().findViewById(2131034303)) == null || !(view instanceof k0)) {
                return;
            }
            int dataType = ((k0) view).getDataType();
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
            Tools.S0(view);
        }
    }

    final class refineAddress extends searchAddress {
        refineAddress() {
            super();
        }
    }

    final class refineNumber extends searchNumber {
        refineNumber() {
            super();
        }
    }

    final class removeListItems extends ApiFunction {
        removeListItems() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            try {
                LuaTable luaTableI = varargs.I(1);
                luaTableI.W1();
                final long[] jArr = new long[luaTableI.d3() + luaTableI.e3()];
                final int i = 0;
                LuaString luaString = Script.t0[0];
                LuaTable.i iVarS3 = luaTableI.s3();
                while (iVarS3.c()) {
                    LuaValue luaValueD = iVarS3.d();
                    jArr[i] = luaValueD.o1() ? Script.i3((LuaTable) luaValueD, luaString) : luaValueD.C0();
                    i++;
                }
                final Object obj = new Object();
                synchronized (obj) {
                    n2.i(new Runnable() { // from class: android.ext.Script.removeListItems.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                MainService.instance.t0.m(jArr, i);
                            } catch (Throwable th) {
                                e1.l("Failed remove list items", th);
                            }
                            synchronized (obj) {
                                obj.notifyAll();
                            }
                        }
                    });
                    Script.W3(obj);
                }
                return LuaValue.f1672d;
            } catch (luaj.d e2) {
                throw e2;
            } catch (Throwable th) {
                e1.l("Failed remove list items", th);
                return LuaValue.K2(Script.V3(th));
            }
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.removeListItems(table items) -> true || string with error";
        }
    }

    final class removeResults extends ApiFunction {
        removeResults() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            Script.this.y3();
            MainService.instance.i.i0(Script.this.t3(), Script.r3(varargs));
            final Object obj = new Object();
            synchronized (obj) {
                n2.i(new Runnable() { // from class: android.ext.Script.removeResults.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MainService.instance.D0(false);
                        synchronized (obj) {
                            obj.notifyAll();
                        }
                    }
                });
                Script.W3(obj);
            }
            return LuaValue.f1672d;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.removeResults(table results) -> true || string with error";
        }
    }

    final class require extends ApiFunction {
        require() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            String strZ = varargs.Z(1, "0");
            int iY = varargs.Y(2, 0);
            int iE = h0.e(strZ);
            if (iE > 80000) {
                iE -= 80000;
            }
            if (h0.d() >= iE && ((int) (((1 * 17671.8f) - 1516.8f) + 0.5f)) >= iY) {
                return LuaValue.f1671c;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("");
            float f2 = 1;
            sb.append((116.200005f * f2) - 14.8f);
            String string = sb.toString();
            if (iY > 0) {
                string = string + " (" + ((int) (((f2 * 19632.9f) - 3477.9f) + 0.5f)) + ')';
                strZ = strZ + " (" + iY + ')';
            }
            Script.this.T.c0.println(Tools.L1(b2.f(2131296800), strZ, string));
            throw new OsExit(0);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.require([string version = nil [, int build = 0]]) -> nil";
        }
    }

    final class saveList extends ApiFunction {
        saveList() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            String strV3;
            StringBuilder sb;
            File file = new File(varargs.E(1));
            if (!file.isDirectory()) {
                if (Script.this.m(Script.s3(file), false)) {
                    sb = new StringBuilder();
                    sb.append("File '");
                    sb.append(file.getAbsolutePath());
                    sb.append("' can not be written");
                } else {
                    int iY = varargs.Y(2, 0);
                    MainService mainService = MainService.instance;
                    try {
                        SavedListAdapter savedListAdapter = mainService.t0;
                        int count = savedListAdapter.getCount();
                        h2[] h2VarArr = new h2[count];
                        for (int i = 0; i < count; i++) {
                            h2VarArr[i] = savedListAdapter.getItem(i);
                        }
                        final RandomAccessFile randomAccessFileF = luaj.lib.d.f(file, Script.this);
                        if (randomAccessFileF != null) {
                            try {
                                c1.e(new BufferedWriter(new OutputStreamWriter(new OutputStream() { // from class: android.ext.Script.saveList.1
                                    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                                    public void close() throws IOException {
                                        randomAccessFileF.close();
                                    }

                                    @Override // java.io.OutputStream
                                    public void write(int i2) throws IOException {
                                        randomAccessFileF.write(i2);
                                    }

                                    @Override // java.io.OutputStream
                                    public void write(byte[] bArr, int i2, int i3) throws IOException {
                                        randomAccessFileF.write(bArr, i2, i3);
                                    }
                                }), 65536), mainService.v0.f1437f, h2VarArr, iY);
                                return LuaValue.f1672d;
                            } finally {
                                try {
                                    randomAccessFileF.close();
                                } catch (IOException unused) {
                                }
                            }
                        }
                        return LuaValue.K2("File '" + file.getAbsolutePath() + "' can not be written");
                    } catch (Throwable th) {
                        e1.l("Failed saved list: " + file.getAbsolutePath() + "; " + iY, th);
                        strV3 = Script.V3(th);
                    }
                }
                return LuaValue.K2(strV3);
            }
            sb = new StringBuilder();
            sb.append("Path '");
            sb.append(file.getAbsolutePath());
            sb.append("' is a directory");
            strV3 = sb.toString();
            return LuaValue.K2(strV3);
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            return (i == 2 && luaValue.h1()) ? ApiFunction.g3(writer, Script.this.g0.f376f, luaValue) : super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.saveList(string file [, int flags = 0]) -> true || string with error";
        }
    }

    final class saveVariable extends ApiFunction {
        saveVariable() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            return new GgLib$saveVariable(Script.this.T).invoke(varargs);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.saveVariable(mixed variable, string filename) -> true || string with error";
        }
    }

    class searchAddress extends BusyApiFunction {
        searchAddress() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected final int Y2() {
            return 7;
        }

        @Override // android.ext.Script.ApiFunction
        public final Varargs c3(Varargs varargs) {
            Script.this.y3();
            if ((this instanceof refineAddress) && MainService.instance.p0 == 0) {
                return LuaValue.f1672d;
            }
            try {
                if (m1.k(Script.this.t3(), Script.D3(varargs.E(1)), varargs.a0(2, -1L), Script.f3(varargs.Y(3, 127)), Script.e3(varargs.Y(4, 536870912)), varargs.a0(5, 0L), varargs.a0(6, -1L), false, varargs.a0(7, 0L))) {
                    return LuaValue.f1672d;
                }
                return null;
            } catch (NumberFormatException e2) {
                return LuaValue.K2(Script.V3(e2));
            }
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0032  */
        /* JADX WARN: Code duplicated, block: B:23:0x0038  */
        @Override // android.ext.Script.ApiFunction
        protected final boolean d3(Writer writer, int i, LuaValue luaValue) {
            if (i == 2) {
                if (luaValue.j1()) {
                    return ApiFunction.h3(writer, luaValue);
                }
            } else if (i != 3) {
                if (i != 4) {
                    if (i == 5 || i == 6) {
                        if (luaValue.j1()) {
                            return ApiFunction.h3(writer, luaValue);
                        }
                    }
                } else if (luaValue.h1()) {
                    return ApiFunction.g3(writer, Script.this.g0.f374d, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, Script.this.g0.f372b, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        final String k3() {
            return this instanceof refineAddress ? "gg.searchAddress(string text [, long mask = -1 [, int type = gg.TYPE_AUTO [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error".replace("searchAddress", "refineAddress") : "gg.searchAddress(string text [, long mask = -1 [, int type = gg.TYPE_AUTO [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error";
        }
    }

    final class searchFuzzy extends BusyApiFunction {
        searchFuzzy() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 6;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            int iF3;
            int iY;
            Script.this.y3();
            try {
                if ((varargs.Y(2, 0) & 127) != 0) {
                    iF3 = Script.f3(varargs.Y(2, 127));
                    iY = varargs.Y(3, 536870912);
                } else {
                    iF3 = Script.f3(varargs.Y(3, 127));
                    iY = varargs.Y(2, 536870912);
                }
                if (t0.k(Script.this.t3(), Script.D3(varargs.Z(1, "0")), iF3, Script.e3(iY), 1, varargs.a0(4, 0L), varargs.a0(5, -1L), varargs.a0(6, 0L))) {
                    return LuaValue.f1672d;
                }
                return null;
            } catch (NumberFormatException e2) {
                return LuaValue.K2(Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            if (i != 2) {
                if (i != 3) {
                    if ((i == 4 || i == 5) && luaValue.j1()) {
                        return ApiFunction.h3(writer, luaValue);
                    }
                } else if (luaValue.h1()) {
                    return ApiFunction.g3(writer, Script.this.g0.f372b, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, Script.this.g0.f373c, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.searchFuzzy([string difference = '0' [, int sign = gg.SIGN_FUZZY_EQUAL [, int type = gg.TYPE_AUTO [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error";
        }
    }

    class searchNumber extends BusyApiFunction {
        searchNumber() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected final int Y2() {
            return 7;
        }

        @Override // android.ext.Script.ApiFunction
        public final Varargs c3(Varargs varargs) {
            Script.this.y3();
            if ((this instanceof refineNumber) && MainService.instance.p0 == 0) {
                return LuaValue.f1672d;
            }
            try {
                if (i2.n(Script.this.t3(), Script.D3(varargs.E(1)), Script.f3(varargs.Y(2, 127)), varargs.V(3, false), Script.e3(varargs.Y(4, 536870912)), varargs.a0(5, 0L), varargs.a0(6, -1L), false, varargs.a0(7, 0L))) {
                    return LuaValue.f1672d;
                }
                return null;
            } catch (NumberFormatException e2) {
                return LuaValue.K2(Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        protected final boolean d3(Writer writer, int i, LuaValue luaValue) {
            if (i != 2) {
                if (i != 4) {
                    if ((i == 5 || i == 6) && luaValue.j1()) {
                        return ApiFunction.h3(writer, luaValue);
                    }
                } else if (luaValue.h1()) {
                    return ApiFunction.g3(writer, Script.this.g0.f374d, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, Script.this.g0.f372b, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        final String k3() {
            return this instanceof refineNumber ? "gg.searchNumber(string text [, int type = gg.TYPE_AUTO [, bool encrypted = false [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error".replace("searchNumber", "refineNumber") : "gg.searchNumber(string text [, int type = gg.TYPE_AUTO [, bool encrypted = false [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error";
        }
    }

    final class searchPointer extends BusyApiFunction {
        searchPointer() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            Script.this.y3();
            try {
                if (i2.p(Script.this.t3(), (short) varargs.D(1), varargs.a0(2, 0L), varargs.a0(3, -1L), varargs.a0(4, 0L))) {
                    return LuaValue.f1672d;
                }
                return null;
            } catch (NumberFormatException e2) {
                return LuaValue.K2(Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.searchPointer(int maxOffset [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]) -> true || string with error";
        }
    }

    final class setRanges extends ApiFunction {
        setRanges() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            Config.b(2131034189).f42d = varargs.D(1);
            Config.k();
            return LuaValue.f1671c;
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            return (i == 1 && luaValue.h1()) ? ApiFunction.g3(writer, Script.this.g0.f371a, luaValue) : super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.setRanges(int ranges) -> nil";
        }
    }

    final class setSpeed extends BusyApiFunction {
        setSpeed() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            double dB = varargs.B(1);
            if (dB >= 1.0E-9d && dB <= 1.0E9d) {
                MainService.instance.S0(Script.this.t3(), dB);
                return null;
            }
            return LuaValue.K2("Speed outside range: " + dB + " (1.0E-9; 1.0E9)");
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.setSpeed(double speed) -> true || string with error";
        }
    }

    final class setValues extends ApiFunction {
        setValues() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            LuaTable luaTableI = varargs.I(1);
            MainService mainService = MainService.instance;
            z1.d dVar = mainService.v0;
            boolean z = dVar != null ? dVar.n : false;
            f0 f0Var = mainService.i;
            LuaString luaString = Script.t0[1];
            LuaTable.i iVarS3 = luaTableI.s3();
            while (iVarS3.c()) {
                LuaTable luaTableH0 = iVarS3.d().H0();
                try {
                    c cVarT3 = Script.T3(null, luaTableH0, (byte) 1, z);
                    int i = cVarT3.f674c & 127;
                    cVarT3.f674c = i;
                    if (i != 0) {
                        i2.c cVarX = i2.x(Script.D3(Script.h3(luaTableH0, luaString)), false);
                        f0Var.a(cVarT3, cVarX != null ? cVarX.f1018b : 0);
                    }
                } catch (NumberFormatException e2) {
                    throw Script.m3(iVarS3.b(), luaTableH0, e2);
                }
            }
            mainService.i.C(Script.this.t3());
            final Object obj = new Object();
            synchronized (obj) {
                n2.i(new Runnable() { // from class: android.ext.Script.setValues.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MainService.instance.f0(Script.this.t3());
                        synchronized (obj) {
                            obj.notifyAll();
                        }
                    }
                });
                Script.W3(obj);
            }
            return LuaValue.f1672d;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.setValues(table values) -> true || string with error";
        }
    }

    final class setVisible extends ApiFunction {
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
        public Varargs c3(Varargs varargs) {
            boolean z;
            long jNanoTime;
            int i;
            MainService mainService = MainService.instance;
            if (!varargs.z(1)) {
                if (mainService.n != null) {
                    mainService.u(false);
                    z = true;
                } else {
                    z = false;
                }
                mainService.h0.g();
                if (z) {
                    jNanoTime = System.nanoTime() / 60000000000L;
                    if (jNanoTime != this.f0) {
                        this.f0 = jNanoTime;
                        this.e0 = 0;
                    }
                    i = this.e0 + 1;
                    this.e0 = i;
                    if (i > 30) {
                        Script.this.x3(2);
                    }
                }
            } else if (mainService.n == null) {
                mainService.c0();
                jNanoTime = System.nanoTime() / 60000000000L;
                if (jNanoTime != this.f0) {
                    this.f0 = jNanoTime;
                    this.e0 = 0;
                }
                i = this.e0 + 1;
                this.e0 = i;
                if (i > 30) {
                    Script.this.x3(2);
                }
            }
            return LuaValue.f1671c;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.setVisible(bool visible) -> nil";
        }
    }

    final class showUiButton extends ApiFunction {
        showUiButton() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            MainService.instance.R0(true);
            return LuaValue.f1671c;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.showUiButton() -> nil";
        }
    }

    final class skipRestoreState extends ApiFunction {
        skipRestoreState() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 0;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            Script.this.m0 = null;
            return LuaValue.f1671c;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.skipRestoreState() -> nil";
        }
    }

    static final class sleep extends ApiFunction {
        sleep() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            int iD = varargs.D(1);
            if (iD < 0) {
                throw new luaj.d("milliseconds < 0: " + iD);
            }
            try {
                Thread.sleep(iD);
                return LuaValue.f1671c;
            } catch (InterruptedException e2) {
                e1.s("Interrupted sleep", e2);
                throw new luaj.d(e2);
            }
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.sleep(int milliseconds) -> nil";
        }
    }

    final class startFuzzy extends BusyApiFunction {
        startFuzzy() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            Script.this.y3();
            try {
                if (t0.m(Script.this.t3(), Script.f3(varargs.Y(1, 127)), varargs.a0(2, 0L), varargs.a0(3, -1L), varargs.a0(4, 0L))) {
                    return LuaValue.f1672d;
                }
                return null;
            } catch (NumberFormatException e2) {
                return LuaValue.K2(Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        protected boolean d3(Writer writer, int i, LuaValue luaValue) {
            if (i != 1) {
                if ((i == 2 || i == 3) && luaValue.j1()) {
                    return ApiFunction.h3(writer, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, Script.this.g0.f372b, luaValue);
            }
            return super.d3(writer, i, luaValue);
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.startFuzzy([int type = gg.TYPE_AUTO [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]) -> true || string with error";
        }
    }

    final class timeJump extends BusyApiFunction {
        timeJump() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 1;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            try {
                MainService.instance.i.d(Script.this.t3(), o2.i(Script.D3(varargs.E(1))));
                return null;
            } catch (NumberFormatException e2) {
                return LuaValue.K2(Script.V3(e2));
            }
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.timeJump(string time) -> true || string with error";
        }
    }

    static final class toast extends ApiFunction {
        toast() {
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 2;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs b3(Varargs varargs) {
            final String str = Tools.N1(2131296928) + ": " + varargs.E(1);
            final boolean zV = varargs.V(2, false);
            n2.i(new Runnable() { // from class: android.ext.Script.toast.1
                @Override // java.lang.Runnable
                public void run() {
                    Tools.K1(b2.g(str), !zV ? 1 : 0);
                }
            });
            return LuaValue.f1671c;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.toast(string text [, bool fast = false]) -> nil";
        }
    }

    final class unrandomizer extends BusyApiFunction {
        unrandomizer() {
            super();
        }

        @Override // android.ext.Script.ApiFunction
        protected int Y2() {
            return 4;
        }

        @Override // android.ext.Script.ApiFunction
        public Varargs c3(Varargs varargs) {
            int i = (varargs.Q(1) && varargs.Q(2)) ? 0 : 2;
            if (!varargs.Q(2) || !varargs.Q(3)) {
                i |= 4;
            }
            MainService.instance.i.U0(Script.this.t3(), i, varargs.a0(1, 0L), varargs.a0(2, 0L), varargs.W(3, 0.0d), varargs.W(4, 0.0d));
            return null;
        }

        @Override // android.ext.Script.ApiFunction
        String k3() {
            return "gg.unrandomizer([long qword = nil [, long qincr = nil [, double double_ = nil [, double dincr = nil]]]]) -> true || string with error";
        }
    }

    final class wrap extends VarArgFunction {
        final LuaValue T;
        final String U;
        final int V;

        wrap(String str, LuaValue luaValue, int i) {
            this.T = luaValue;
            this.U = str;
            this.V = i;
        }

        @Override // luaj.lib.LibFunction, luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
        public String g0() {
            return this.T.g0();
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            DebugLog debugLog = Script.w0;
            Writer writer = debugLog == null ? null : debugLog.f378a;
            if (writer != null) {
                long jNanoTime = System.nanoTime();
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
                        ApiFunction.e3(null, writer, i2, varargs.v(i2));
                    }
                    writer.write(")\n");
                } catch (Throwable th) {
                    e1.s("Failed write log for " + this.U, th);
                }
                Globals globals = debugLog.f379b;
                globals.b0 = (int) (((long) globals.b0) + ((System.nanoTime() - jNanoTime) / 1000000));
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
            iArr[i2] = LuaTable.j3(t0[i2], 3);
            i2++;
        }
        while (true) {
            int[] iArr2 = v0;
            if (i >= iArr2.length) {
                w0 = null;
                return;
            } else {
                iArr2[i] = LuaTable.j3(t0[i], 7);
                i++;
            }
        }
    }

    public Script(File file, int i, String str) {
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

    static boolean A3(String str, String str2) {
        String strD = luaj.lib.d.d(str);
        String strD2 = luaj.lib.d.d(str2);
        return strD.startsWith(strD2) && (strD.length() == strD2.length() || strD.charAt(strD2.length()) == '/');
    }

    static void B3(LuaTable luaTable, ArrayList arrayList) {
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

    public static void C3(w wVar) {
        wVar.j();
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                int iF = wVar.f();
                if (iF == 0) {
                    break;
                } else {
                    arrayList.add(new c(wVar.g(), wVar.h(), iF));
                }
            } catch (IOException e2) {
                e1.l("???", e2);
                n0.h(Thread.currentThread(), e2, false);
            }
        }
        p0 = arrayList;
        q0 += 100;
    }

    static String D3(String str) {
        return (t1.m(str) || t1.C(str) != 0) ? str : t1.f(str);
    }

    static String E3(String str) {
        return t1.e(str);
    }

    public static String F3(String str) {
        Globals globals = new Globals();
        globals.X = false;
        g.h.M(globals);
        globals.t1(new BaseLib());
        globals.t1(new Bit32Lib());
        globals.t1(new TableLib());
        globals.t1(new StringLib());
        globals.t1(new Utf8Lib());
        globals.t1(new MathLib());
        globals.t1(new OsLib());
        return globals.O3(new ByteArrayInputStream(str.getBytes()), str, "t", globals).call().g0();
    }

    static boolean G3(LuaTable luaTable, LuaValue luaValue, boolean z) {
        try {
            return luaTable.U0(luaValue).E1(z);
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static int H3(LuaTable luaTable, LuaValue luaValue, int i) {
        try {
            return luaTable.U0(luaValue).H1(i);
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static String I3(LuaTable luaTable, LuaValue luaValue, String str) {
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

    public static void K3(Globals globals) {
        LuaNil.P = null;
        LuaNumber.P = null;
        LuaBoolean.Q = null;
        LuaValue luaValueT0 = globals == null ? null : globals.T0("string");
        LuaString.U = (luaValueT0 == null || luaValueT0.l1()) ? null : LuaValue.u2(new LuaValue[]{LuaValue.l, luaValueT0});
        LuaFunction.P = null;
        LuaThread.T = null;
    }

    static int O3(byte b2) {
        return ((byte) (b2 - 20)) / 20;
    }

    private static void P3(ArrayList arrayList, LuaTable luaTable, String str, int i) {
        luaTable.a2(str, i);
        if (arrayList != null) {
            arrayList.add(new Const("gg." + str, i));
        }
    }

    private static void Q3(int i, LuaTable luaTable, LuaString luaString, long j, long j2, int i2) {
        if (i2 == 8) {
            j2 ^= j;
        }
        if (i2 == 16) {
            luaTable.H3(i, luaString, Float.intBitsToFloat((int) j2));
        } else if (i2 == 64) {
            luaTable.G3(i, luaString, Double.longBitsToDouble(j2));
        } else {
            luaTable.J3(i, luaString, i0.b(j2, c.y(i2), false));
        }
    }

    static ArrayList S3(byte b2) {
        ArrayList arrayList;
        Map map = r0;
        synchronized (map) {
            arrayList = (ArrayList) map.get(Byte.valueOf(b2));
        }
        return arrayList;
    }

    static c T3(c cVar, LuaTable luaTable, byte b2, boolean z) {
        long jQ3;
        LuaString[] luaStringArr = t0;
        long jI3 = i3(luaTable, luaStringArr[0]);
        if (!z) {
            jI3 &= 4294967295L;
        }
        int iF3 = f3(g3(luaTable, luaStringArr[2]));
        if (b2 != 2) {
            LuaString luaString = luaStringArr[1];
            jQ3 = q3(jI3, luaString, luaTable.U0(luaString), iF3, b2 == 0);
        } else {
            jQ3 = 0;
        }
        long j = jQ3;
        if (cVar == null) {
            return new c(jI3, j, iF3);
        }
        cVar.f672a = jI3;
        cVar.f673b = j;
        cVar.f674c = iF3;
        return cVar;
    }

    static h2 U3(LuaTable luaTable, boolean z) {
        LuaString[] luaStringArr = t0;
        h2 h2Var = new h2();
        T3(h2Var, luaTable, (byte) 0, z);
        h2Var.l = I3(luaTable, luaStringArr[3], null);
        h2Var.m = G3(luaTable, luaStringArr[4], false);
        h2Var.d0(H3(luaTable, luaStringArr[5], 0));
        long j = h2Var.f672a;
        int i = h2Var.f674c;
        LuaString luaString = luaStringArr[6];
        h2Var.o = q3(j, luaString, luaTable.U0(luaString), i, true);
        LuaString luaString2 = luaStringArr[7];
        h2Var.p = q3(j, luaString2, luaTable.U0(luaString2), i, true);
        return h2Var;
    }

    static String V3(Throwable th) {
        if (th instanceof t1.a) {
            ((t1.a) th).d();
        }
        return th.toString();
    }

    static void W3(Object obj) {
        try {
            obj.wait();
        } catch (InterruptedException e2) {
            e1.s("Interrupted wait", e2);
            Thread.currentThread().interrupt();
            throw new luaj.d(e2);
        }
    }

    public static void Y2(long j) {
        s0 = j;
    }

    private static luaj.d b3(LuaValue luaValue, luaj.d dVar) {
        String message = dVar.getMessage();
        if (message.indexOf("bad argument:") != 0) {
            return dVar;
        }
        return new luaj.d("bad argument for key '" + luaValue.g0() + "':" + message.substring(13));
    }

    public static void d3(byte b2, ArrayList arrayList) {
        Map map = r0;
        synchronized (map) {
            map.put(Byte.valueOf(b2), arrayList);
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

    static int g3(LuaTable luaTable, LuaValue luaValue) {
        try {
            return luaTable.U0(luaValue).A0();
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static String h3(LuaTable luaTable, LuaValue luaValue) {
        try {
            return luaTable.U0(luaValue).B0();
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static long i3(LuaTable luaTable, LuaValue luaValue) {
        try {
            return luaTable.g3(luaValue);
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static ArrayList j3(byte b2) {
        ArrayList arrayList;
        Map map = r0;
        synchronized (map) {
            arrayList = (ArrayList) map.remove(Byte.valueOf(b2));
        }
        return arrayList;
    }

    static void l3(int i) {
        Map map = r0;
        synchronized (map) {
            try {
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    if (O3(((Byte) it.next()).byteValue()) == i) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static luaj.d m3(LuaValue luaValue, LuaValue luaValue2, Throwable th) {
        return new luaj.d("Failed parse item " + luaValue2.g0() + " on key '" + luaValue.g0() + "': " + th.getMessage(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LuaTable n3(int[] iArr, c cVar) {
        if (iArr == null) {
            iArr = u0;
        }
        int length = iArr.length;
        LuaString[] luaStringArr = t0;
        LuaTable luaTable = new LuaTable(0, length);
        long j = cVar.f672a;
        int i = cVar.f674c;
        luaTable.J3(iArr[0], luaStringArr[0], j);
        Q3(iArr[1], luaTable, luaStringArr[1], j, cVar.f673b, i);
        luaTable.I3(iArr[2], luaStringArr[2], i);
        return luaTable;
    }

    static LuaTable o3(h2 h2Var) {
        LuaString[] luaStringArr = t0;
        int[] iArr = v0;
        LuaTable luaTableN3 = n3(iArr, h2Var);
        String str = h2Var.l;
        if (str != null) {
            luaTableN3.m3(luaStringArr[3], LuaValue.K2(str));
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

    public static Consts p3(ArrayList arrayList) {
        Consts consts = (Consts) o0.get();
        if (consts != null) {
            return consts;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            B3(new LuaTable(0, 64), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        for (Const r10 : arrayList) {
            String str = r10.f369a;
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
        Consts consts2 = new Consts();
        consts2.f371a = (Const[]) arrayList2.toArray(new Const[arrayList2.size()]);
        consts2.f372b = (Const[]) arrayList3.toArray(new Const[arrayList3.size()]);
        consts2.f373c = (Const[]) arrayList4.toArray(new Const[arrayList4.size()]);
        consts2.f374d = (Const[]) arrayList5.toArray(new Const[arrayList5.size()]);
        consts2.f375e = (Const[]) arrayList6.toArray(new Const[arrayList6.size()]);
        consts2.f376f = (Const[]) arrayList7.toArray(new Const[arrayList7.size()]);
        consts2.f377g = (Const[]) arrayList8.toArray(new Const[arrayList8.size()]);
        consts2.h = (Const[]) arrayList9.toArray(new Const[arrayList9.size()]);
        consts2.i = (Const[]) arrayList10.toArray(new Const[arrayList10.size()]);
        consts2.j = (Const[]) arrayList11.toArray(new Const[arrayList11.size()]);
        o0 = new WeakReference(consts2);
        return consts2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [luaj.LuaValue] */
    /* JADX WARN: Type inference failed for: r6v1, types: [luaj.LuaValue] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    private static long q3(long j, LuaValue luaValue, LuaValue luaValue2, int i, boolean z) {
        String strB0;
        long jDoubleToRawLongBits;
        if (luaValue2 instanceof LuaLong) {
            long jZ2 = luaValue2.z2();
            if (i == 16) {
                jZ2 = Float.floatToRawIntBits(jZ2);
            } else if (i == 64) {
                jZ2 = Double.doubleToRawLongBits(jZ2);
            }
            return i == 8 ? jZ2 ^ j : jZ2;
        }
        if (luaValue2 instanceof LuaDouble) {
            double dX2 = luaValue2.x2();
            if (i == 16) {
                jDoubleToRawLongBits = Float.floatToRawIntBits((float) dX2);
            } else {
                jDoubleToRawLongBits = i == 64 ? Double.doubleToRawLongBits(dX2) : (long) dX2;
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
            String strD3 = D3(luaValue);
            i2.c cVarX = i2.x(strD3, false);
            if (cVarX != null) {
                strD3 = cVarX.f1017a;
            }
            return c.e(j, strD3, i);
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static ArrayList r3(Varargs varargs) {
        LuaTable luaTableI = varargs.I(1);
        ArrayList arrayList = new ArrayList();
        z1.d dVar = MainService.instance.v0;
        boolean z = dVar != null ? dVar.n : false;
        LuaTable.i iVarS3 = luaTableI.s3();
        while (iVarS3.c()) {
            c cVarT3 = T3(null, iVarS3.d().H0(), (byte) 2, z);
            cVarT3.f674c &= 127;
            arrayList.add(cVarT3);
        }
        return arrayList;
    }

    static String s3(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return file.getAbsolutePath();
        }
    }

    private void u3() {
        Globals globals = this.T;
        globals.Z = this;
        luaj.a.c(globals);
        g.h.M(globals);
        globals.t1(new BaseLib());
        globals.t1(new PackageLib());
        globals.t1(new Bit32Lib());
        globals.t1(new TableLib());
        globals.t1(new StringLib());
        globals.t1(new Utf8Lib());
        globals.t1(new MathLib());
        globals.t1(new IoLibSafe());
        globals.t1(new OsLibSafe());
        globals.t1(new DebugLib());
        v3();
    }

    private void v3() {
        Globals globals = this.T;
        globals.c0 = new ScriptPrintStream(false);
        globals.d0 = new ScriptPrintStream(true);
        globals.t1(this);
    }

    void L3() {
        final SavedState savedState = this.m0;
        if (savedState == null) {
            return;
        }
        n2.i(new Runnable() { // from class: android.ext.Script.1
            @Override // java.lang.Runnable
            public void run() {
                Config.b(2131034189).f42d = savedState.f389a;
                Config.k();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    void M3() throws IOException {
        LuaValue luaValueO3;
        String name;
        BufferedWriter bufferedWriter;
        Object obj = this.U;
        if (obj instanceof File) {
            File file = (File) obj;
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + file);
            }
            this.T.T3(file.getParentFile().getAbsolutePath());
            String absolutePath = file.getAbsolutePath();
            BaseLib.b bVar = new BaseLib.b(new FileInputStream(file));
            try {
                try {
                    luaValueO3 = this.T.O3(bVar, '@' + absolutePath, "bt", this.T);
                    if (luaValueO3 instanceof LuaClosure) {
                        ((LuaClosure) luaValueO3).U = absolutePath;
                    }
                    bVar.close();
                    if ((luaValueO3 instanceof LuaClosure) && (((LuaClosure) luaValueO3).R instanceof lasm.b)) {
                        String str = file.getAbsolutePath() + '.' + t2.h(System.currentTimeMillis() - 1546300800000L) + ".lua";
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str), 65536);
                        try {
                            g.b.a(((LuaClosure) luaValueO3).R, bufferedOutputStream, false, false);
                            File file2 = new File(file.getAbsolutePath() + ".tail");
                            if (file2.exists()) {
                                FileInputStream fileInputStream = new FileInputStream(file2);
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
                            Z2(Tools.N1(2131296291) + ":\n" + str);
                            return;
                        } catch (Throwable th) {
                            bufferedOutputStream.close();
                            throw th;
                        }
                    }
                    name = file.getName();
                } catch (Exception e2) {
                    throw new luaj.d("load " + absolutePath + ": " + e2, e2);
                }
            } catch (Throwable th2) {
                bVar.close();
                throw th2;
            }
        } else {
            String string = obj.toString();
            luaValueO3 = this.T.O3(new ByteArrayInputStream(string.getBytes()), string, "t", this.T);
            name = "string";
        }
        String str2 = name + '_' + t2.h(System.currentTimeMillis() - 1546300800000L) + '_' + t2.g(Tools.f489a.nextInt());
        if ((this.X & 1) != 0) {
            LuaClosure luaClosureW0 = luaValueO3.w0();
            String str3 = this.Y + '/' + str2 + ".lasm";
            PrintStream printStream = luaj.g.f1714b;
            try {
                luaj.g.f1714b = new PrintStream(str3);
                luaj.g.A(luaClosureW0.R);
                luaj.g.f1714b.close();
                luaj.g.M(luaClosureW0, str3 + ".tail");
            } catch (Throwable th3) {
                e1.l("Failed disassemble " + luaClosureW0 + " into '" + str3 + '\'', th3);
            }
            luaj.g.f1714b = printStream;
        }
        if ((this.X & 2) != 0) {
            this.T.g0.c3(this.Y + '/' + str2);
        }
        if ((this.X & 4) != 0) {
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.Y + '/' + str2 + ".log.txt")), 65536);
            } catch (Throwable th4) {
                e1.s("Failed open log file", th4);
                bufferedWriter = null;
            }
        } else {
            bufferedWriter = null;
        }
        w0 = bufferedWriter == null ? null : new DebugLog(bufferedWriter, this.T);
        PrintStream printStream2 = luaj.g.f1714b;
        try {
            Globals globals = this.T;
            luaj.g.f1714b = globals.c0;
            K3(globals);
            luaValueO3.call();
        } finally {
            luaj.g.f1714b = printStream2;
            if (bufferedWriter != null) {
                w0 = null;
                try {
                    bufferedWriter.close();
                } catch (Throwable th5) {
                    e1.s("Failed close log", th5);
                }
            }
            if ((this.X & 2) != 0) {
                this.T.g0.Z2();
            }
            K3(null);
        }
    }

    void N3() {
        SavedState savedState = new SavedState();
        savedState.f389a = Config.i;
        this.m0 = savedState;
    }

    public Script R3() {
        this.V.start();
        return this;
    }

    void Z2(String str) {
        this.W.a("\n");
        this.W.a(str);
        this.W.a("\n");
    }

    void a3(boolean z, String str) {
        if (z) {
            this.W.a("err: ");
        }
        this.W.a(str);
        this.W.a("\n");
    }

    public void c3(byte b2, String str) {
        String str2;
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
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            str2 = "callNotify seq mismatch: " + ((int) b6) + " != " + ((int) b5) + "; " + ((int) b4) + "; " + ((int) b2) + "; " + str;
        }
        e1.d(str2);
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        Context contextF0 = Tools.f0();
        ArrayList arrayList = (this.X & 4) != 0 ? new ArrayList() : null;
        LuaTable luaTable = new LuaTable(0, 128);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        float f2 = 1;
        sb.append((108.3f * f2) - 6.9f);
        luaTable.b2("VERSION", sb.toString());
        luaTable.a2("VERSION_INT", h0.d());
        luaTable.a2("BUILD", (int) (((f2 * 16409.7f) - 254.7f) + 0.5f));
        luaTable.b2("PACKAGE", Tools.C0());
        luaTable.a2("ANDROID_SDK_INT", Build.VERSION.SDK_INT);
        luaTable.b2("FILES_DIR", Tools.p0().getAbsolutePath());
        luaTable.b2("CACHE_DIR", Tools.b0().getAbsolutePath());
        try {
            luaTable.b2("EXT_FILES_DIR", contextF0.getExternalFilesDir(null).getAbsolutePath());
        } catch (Throwable th) {
            e1.l("Failed set EXT_FILES_DIR for script", th);
            luaTable.b2("EXT_FILES_DIR", Tools.p0().getAbsolutePath());
        }
        try {
            luaTable.b2("EXT_CACHE_DIR", contextF0.getExternalCacheDir().getAbsolutePath());
        } catch (Throwable th2) {
            e1.l("Failed set EXT_CACHE_DIR for script", th2);
            luaTable.b2("EXT_CACHE_DIR", Tools.b0().getAbsolutePath());
        }
        luaTable.b2("EXT_STORAGE", Tools.K0());
        B3(luaTable, arrayList);
        luaTable.c2("require", new require());
        luaTable.c2("toast", new toast());
        luaTable.c2("alert", new alert());
        luaTable.c2("prompt", new prompt());
        luaTable.c2("choice", new choice());
        luaTable.c2("multiChoice", new multiChoice());
        luaTable.c2("isVisible", new isVisible());
        luaTable.c2("setVisible", new setVisible());
        luaTable.c2("getActiveTab", new getActiveTab());
        luaTable.c2("showUiButton", new showUiButton());
        luaTable.c2("hideUiButton", new hideUiButton());
        luaTable.c2("isClickedUiButton", new isClickedUiButton());
        getTargetPackage gettargetpackage = new getTargetPackage();
        luaTable.c2("getTargetPackage", gettargetpackage);
        luaTable.c2("getTargetInfo", new getTargetInfo());
        luaTable.c2("isPackageInstalled", new isPackageInstalled());
        luaTable.c2("processKill", new processKill());
        luaTable.c2("saveVariable", new saveVariable());
        luaTable.c2("makeRequest", new makeRequest());
        getResultsCount getresultscount = new getResultsCount();
        luaTable.c2("getResultsCount", getresultscount);
        luaTable.c2("getResults", new getResults());
        luaTable.c2("editAll", new editAll());
        luaTable.c2("clearResults", new clearResults());
        luaTable.c2("removeResults", new removeResults());
        luaTable.c2("loadResults", new loadResults());
        luaTable.c2("getSelectedResults", new getSelectedResults());
        luaTable.c2("setValues", new setValues());
        luaTable.c2("getValues", new getValues());
        luaTable.c2("getValuesRange", new getValuesRange());
        luaTable.c2("processPause", new processPause());
        luaTable.c2("processResume", new processResume());
        luaTable.c2("processToggle", new processToggle());
        luaTable.c2("isProcessPaused", new isProcessPaused());
        luaTable.c2("timeJump", new timeJump());
        luaTable.c2("setSpeed", new setSpeed());
        luaTable.c2("getSpeed", new getSpeed());
        luaTable.c2("unrandomizer", new unrandomizer());
        luaTable.c2("gotoAddress", new gotoAddress());
        luaTable.c2("getSelectedElements", new getSelectedElements());
        luaTable.c2("getRanges", new getRanges());
        luaTable.c2("setRanges", new setRanges());
        luaTable.c2("copyMemory", new copyMemory());
        luaTable.c2("dumpMemory", new dumpMemory());
        luaTable.c2("loadList", new loadList());
        luaTable.c2("saveList", new saveList());
        luaTable.c2("clearList", new clearList());
        luaTable.c2("addListItems", new addListItems());
        luaTable.c2("getListItems", new getListItems());
        luaTable.c2("removeListItems", new removeListItems());
        luaTable.c2("getSelectedListItems", new getSelectedListItems());
        luaTable.c2("searchNumber", new searchNumber());
        luaTable.c2("refineNumber", new refineNumber());
        luaTable.c2("searchAddress", new searchAddress());
        luaTable.c2("refineAddress", new refineAddress());
        luaTable.c2("startFuzzy", new startFuzzy());
        luaTable.c2("searchFuzzy", new searchFuzzy());
        searchPointer searchpointer = new searchPointer();
        luaTable.c2("searchPointer", searchpointer);
        luaTable.c2("sleep", new sleep());
        luaTable.c2("copyText", new copyText());
        luaTable.c2("disasm", new disasm());
        luaTable.c2("getLine", new getLine());
        luaTable.c2("getFile", new getFile());
        luaTable.c2("bytes", new bytes());
        luaTable.c2("skipRestoreState", new skipRestoreState());
        luaTable.c2("getRangesList", new getRangesList());
        luaTable.c2("allocatePage", new allocatePage());
        luaTable.c2("getLocale", new getLocale());
        luaTable.c2("numberToLocale", new numberToLocale());
        luaTable.c2("numberFromLocale", new numberFromLocale());
        luaTable.d2(LuaValue.K2("SIGN_INEQUAL").h3(), LuaValue.I2(268435456L));
        luaTable.d2(LuaValue.K2("SIGN_SMALLER").h3(), LuaValue.I2(134217728L));
        luaTable.d2(LuaValue.K2("SIGN_LARGER").h3(), LuaValue.I2(67108864L));
        luaTable.d2(LuaValue.K2("getSelectedPackage").h3(), gettargetpackage);
        luaTable.d2(LuaValue.K2("getResultCount").h3(), getresultscount);
        luaTable.d2(LuaValue.K2("internal1").h3(), new internal1());
        luaTable.d2(LuaValue.K2("internal2").h3(), new internal2());
        luaTable.d2(LuaValue.K2("internal3").h3(), searchpointer);
        luaValue2.i2("gg", luaTable);
        luaValue2.T0("package").T0("loaded").i2("gg", luaTable);
        LuaValue luaValueT0 = luaValue2.T0("os");
        luaValueT0.i2("exit", new exit());
        luaValueT0.i2("remove", new wrap("os.remove", luaValueT0.T0("remove"), 1));
        luaValueT0.i2("rename", new wrap("os.rename", luaValueT0.T0("rename"), 2));
        luaValueT0.i2("tmpname", new wrap("os.tmpname", luaValueT0.T0("tmpname"), 0));
        LuaValue luaValueT1 = luaValue2.T0("string");
        luaValueT1.i2("format", new format(luaValueT1.T0("format")));
        luaValueT1.i2("dump", new wrap("string.dump", luaValueT1.T0("dump"), 1));
        LuaValue luaValueT2 = luaValue2.T0("io");
        luaValueT2.i2("open", new wrap("io.open", luaValueT2.T0("open"), 2));
        luaValueT2.i2("input", new wrap("io.input", luaValueT2.T0("input"), 1));
        luaValueT2.i2("output", new wrap("io.output", luaValueT2.T0("output"), 1));
        luaValueT2.i2("tmpfile", new wrap("io.tmpfile", luaValueT2.T0("tmpfile"), 0));
        luaValueT2.i2("lines", new wrap("io.lines", luaValueT2.T0("lines"), 1));
        LuaValue luaValueT3 = luaValue2.T0("debug");
        luaValueT3.i2("debug", new wrap("debug.debug", luaValueT3.T0("debug"), 0));
        luaValueT3.i2("gethook", new wrap("debug.gethook", luaValueT3.T0("gethook"), 1));
        luaValueT3.i2("getinfo", new wrap("debug.getinfo", luaValueT3.T0("getinfo"), 3));
        luaValueT3.i2("getlocal", new wrap("debug.getlocal", luaValueT3.T0("getlocal"), 3));
        luaValueT3.i2("getmetatable", new wrap("debug.getmetatable", luaValueT3.T0("getmetatable"), 1));
        luaValueT3.i2("getregistry", new wrap("debug.getregistry", luaValueT3.T0("getregistry"), 0));
        luaValueT3.i2("getupvalue", new wrap("debug.getupvalue", luaValueT3.T0("getupvalue"), 2));
        luaValueT3.i2("getuservalue", new wrap("debug.getuservalue", luaValueT3.T0("getuservalue"), 1));
        luaValueT3.i2("sethook", new wrap("debug.sethook", luaValueT3.T0("sethook"), 4));
        luaValueT3.i2("setlocal", new wrap("debug.setlocal", luaValueT3.T0("setlocal"), 4));
        luaValueT3.i2("setmetatable", new wrap("debug.setmetatable", luaValueT3.T0("setmetatable"), 2));
        luaValueT3.i2("setupvalue", new wrap("debug.setupvalue", luaValueT3.T0("setupvalue"), 3));
        luaValueT3.i2("setuservalue", new wrap("debug.setuservalue", luaValueT3.T0("setuservalue"), 2));
        luaValueT3.i2("traceback", new wrap("debug.traceback", luaValueT3.T0("traceback"), 3));
        luaValueT3.i2("upvalueid", new wrap("debug.upvalueid", luaValueT3.T0("upvalueid"), 2));
        luaValueT3.i2("upvaluejoin", new wrap("debug.upvaluejoin", luaValueT3.T0("upvaluejoin"), 4));
        this.g0 = arrayList != null ? p3(arrayList) : new Consts();
        return luaTable;
    }

    void k3() {
        l3(this.Z);
    }

    @Override // luaj.lib.e
    public boolean m(String str, boolean z) {
        String strS3 = s3(new File(str));
        String strS4 = this.i0;
        if (strS4 == null) {
            strS4 = s3(Tools.q0());
            this.i0 = strS4;
        }
        if (A3(strS3, strS4)) {
            return true;
        }
        String strS5 = this.j0;
        if (strS5 == null) {
            strS5 = s3(Tools.c0());
            this.j0 = strS5;
        }
        if (A3(strS3, strS5)) {
            return true;
        }
        String strS6 = this.k0;
        if (strS6 == null) {
            strS6 = s3(x2.g(MainService.G0));
            this.k0 = strS6;
        }
        if (A3(strS6, strS3)) {
            return true;
        }
        if (z) {
            return false;
        }
        Object obj = this.U;
        if (!(obj instanceof File)) {
            return false;
        }
        String strS7 = this.h0;
        if (strS7 == null) {
            strS7 = s3((File) obj);
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

    public Script w3() {
        return x3(1);
    }

    public Script x3(int i) {
        this.f0 = i;
        this.V.interrupt();
        return this;
    }

    void y3() {
        this.c0 = false;
        this.d0 = J3(this.d0);
    }

    boolean z3(File file) {
        if (!file.exists()) {
            return false;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            int i = 0;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String strTrim = line.trim();
                if (strTrim.length() != 0) {
                    if (i == 0) {
                        try {
                            Integer.parseInt(strTrim);
                            i = 1;
                        } catch (Throwable unused) {
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
        } catch (IOException e2) {
            e1.g("Failed detect", e2);
            return false;
        }
    }

    public Script(String str, int i, String str2) {
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
}
