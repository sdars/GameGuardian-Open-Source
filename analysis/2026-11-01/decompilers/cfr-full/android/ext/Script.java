/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.EditTextPath;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.RegionList;
import android.ext.SavedListAdapter;
import android.ext.Tools;
import android.ext.b0;
import android.ext.b2;
import android.ext.c;
import android.ext.c1;
import android.ext.e1;
import android.ext.f;
import android.ext.f0;
import android.ext.f1;
import android.ext.h0;
import android.ext.h2;
import android.ext.i0;
import android.ext.i2;
import android.ext.k0;
import android.ext.m;
import android.ext.m1;
import android.ext.n;
import android.ext.n0;
import android.ext.n1;
import android.ext.n2;
import android.ext.o2;
import android.ext.t0;
import android.ext.t1;
import android.ext.t2;
import android.ext.w;
import android.ext.x2;
import android.ext.y0;
import android.ext.z1;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import d.a;
import g.b;
import g.h;
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
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import luaj.d;
import luaj.g;
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
import luaj.lib.e;

public class Script
extends TwoArgFunction
implements e {
    private static volatile int n0;
    private static WeakReference o0;
    static volatile ArrayList p0;
    static volatile int q0;
    static final Map r0;
    static volatile long s0;
    static final LuaString[] t0;
    static final int[] u0;
    static final int[] v0;
    static DebugLog w0;
    final Globals T;
    final Object U;
    final Thread V;
    final Logger W;
    final int X;
    final String Y;
    private final byte Z;
    private volatile int a0 = 0;
    private volatile byte b0 = (byte)-1;
    volatile boolean c0 = true;
    byte d0 = 0;
    boolean e0 = false;
    volatile int f0 = 0;
    Consts g0;
    private String h0;
    private String i0;
    private String j0;
    private String k0;
    volatile String l0;
    volatile SavedState m0;

    static {
        int[] nArray;
        o0 = new WeakReference<Object>(null);
        p0 = null;
        int n3 = 0;
        q0 = 0;
        r0 = new HashMap();
        s0 = 0L;
        t0 = new LuaString[]{LuaString.K2("address"), LuaString.K2("value"), LuaString.K2("flags"), LuaString.K2("name"), LuaString.K2("freeze"), LuaString.K2("freezeType"), LuaString.K2("freezeFrom"), LuaString.K2("freezeTo")};
        u0 = new int[3];
        v0 = new int[8];
        int n4 = 0;
        while (true) {
            nArray = u0;
            if (n4 >= nArray.length) break;
            nArray[n4] = LuaTable.j3(t0[n4], 3);
            ++n4;
        }
        for (int i3 = n3; i3 < (nArray = v0).length; ++i3) {
            nArray[i3] = LuaTable.j3(t0[i3], 7);
        }
        w0 = null;
    }

    public Script(File file, int n3, String string2) {
        this.T = new Globals();
        this.V = new ScriptThread(this);
        this.W = new Logger();
        int n4 = n0;
        n0 = n4 + 1;
        this.Z = (byte)(n4 % 5);
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        luaj.a.u = false;
        this.U = file;
        this.X = n3;
        this.Y = string2;
        this.u3();
    }

    public Script(String string2, int n3, String string3) {
        this.T = new Globals();
        this.V = new ScriptThread(this);
        this.W = new Logger();
        int n4 = n0;
        n0 = n4 + 1;
        this.Z = (byte)(n4 % 5);
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.U = string2;
        this.X = n3;
        this.Y = string3;
        this.u3();
    }

    static boolean A3(String string2, String string3) {
        boolean bl = (string2 = luaj.lib.d.d(string2)).startsWith(string3 = luaj.lib.d.d(string3)) && (string2.length() == string3.length() || string2.charAt(string3.length()) == '/');
        return bl;
    }

    static void B3(LuaTable luaTable, ArrayList arrayList) {
        Script.P3(arrayList, luaTable, "TYPE_AUTO", 127);
        Script.P3(arrayList, luaTable, "TYPE_BYTE", 1);
        Script.P3(arrayList, luaTable, "TYPE_WORD", 2);
        Script.P3(arrayList, luaTable, "TYPE_DWORD", 4);
        Script.P3(arrayList, luaTable, "TYPE_XOR", 8);
        Script.P3(arrayList, luaTable, "TYPE_FLOAT", 16);
        Script.P3(arrayList, luaTable, "TYPE_QWORD", 32);
        Script.P3(arrayList, luaTable, "TYPE_DOUBLE", 64);
        Script.P3(arrayList, luaTable, "SIGN_EQUAL", 0x20000000);
        Script.P3(arrayList, luaTable, "SIGN_NOT_EQUAL", 0x10000000);
        Script.P3(arrayList, luaTable, "SIGN_LESS_OR_EQUAL", 0x8000000);
        Script.P3(arrayList, luaTable, "SIGN_GREATER_OR_EQUAL", 0x4000000);
        Script.P3(arrayList, luaTable, "SIGN_FUZZY_EQUAL", 0x20000000);
        Script.P3(arrayList, luaTable, "SIGN_FUZZY_NOT_EQUAL", 0x10000000);
        Script.P3(arrayList, luaTable, "SIGN_FUZZY_LESS", 0x8000000);
        Script.P3(arrayList, luaTable, "SIGN_FUZZY_GREATER", 0x4000000);
        Script.P3(arrayList, luaTable, "REGION_JAVA_HEAP", 2);
        Script.P3(arrayList, luaTable, "REGION_C_HEAP", 1);
        Script.P3(arrayList, luaTable, "REGION_C_ALLOC", 4);
        Script.P3(arrayList, luaTable, "REGION_C_DATA", 8);
        Script.P3(arrayList, luaTable, "REGION_C_BSS", 16);
        Script.P3(arrayList, luaTable, "REGION_PPSSPP", 262144);
        Script.P3(arrayList, luaTable, "REGION_ANONYMOUS", 32);
        Script.P3(arrayList, luaTable, "REGION_JAVA", 65536);
        Script.P3(arrayList, luaTable, "REGION_STACK", 64);
        Script.P3(arrayList, luaTable, "REGION_ASHMEM", 524288);
        Script.P3(arrayList, luaTable, "REGION_VIDEO", 0x100000);
        Script.P3(arrayList, luaTable, "REGION_OTHER", -2080896);
        Script.P3(arrayList, luaTable, "REGION_BAD", 131072);
        Script.P3(arrayList, luaTable, "REGION_CODE_APP", 16384);
        Script.P3(arrayList, luaTable, "REGION_CODE_SYS", 32768);
        Script.P3(arrayList, luaTable, "LOAD_VALUES_FREEZE", 3);
        Script.P3(arrayList, luaTable, "LOAD_VALUES", 2);
        Script.P3(arrayList, luaTable, "LOAD_APPEND", 8);
        Script.P3(arrayList, luaTable, "SAVE_AS_TEXT", 1);
        luaTable.a2("FREEZE_NORMAL", 0);
        luaTable.a2("FREEZE_MAY_INCREASE", 1);
        luaTable.a2("FREEZE_MAY_DECREASE", 2);
        luaTable.a2("FREEZE_IN_RANGE", 3);
        luaTable.a2("PROT_NONE", 0);
        Script.P3(arrayList, luaTable, "PROT_READ", 2);
        Script.P3(arrayList, luaTable, "PROT_WRITE", 1);
        Script.P3(arrayList, luaTable, "PROT_EXEC", 4);
        Script.P3(arrayList, luaTable, "POINTER_NO", 4);
        Script.P3(arrayList, luaTable, "POINTER_READ_ONLY", 8);
        Script.P3(arrayList, luaTable, "POINTER_WRITABLE", 16);
        Script.P3(arrayList, luaTable, "POINTER_EXECUTABLE", 2);
        Script.P3(arrayList, luaTable, "POINTER_EXECUTABLE_WRITABLE", 1);
        Script.P3(arrayList, luaTable, "DUMP_SKIP_SYSTEM_LIBS", 1);
        Script.P3(arrayList, luaTable, "TAB_SETTINGS", 0);
        Script.P3(arrayList, luaTable, "TAB_SEARCH", 1);
        Script.P3(arrayList, luaTable, "TAB_SAVED_LIST", 2);
        Script.P3(arrayList, luaTable, "TAB_MEMORY_EDITOR", 3);
        Script.P3(arrayList, luaTable, "ASM_ARM", 4);
        Script.P3(arrayList, luaTable, "ASM_THUMB", 5);
        Script.P3(arrayList, luaTable, "ASM_ARM64", 6);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void C3(w w3) {
        w3.j();
        ArrayList<c> arrayList = new ArrayList<c>();
        try {
            int n3;
            while ((n3 = w3.f()) != 0) {
                long l3 = w3.g();
                long l4 = w3.h();
                c c4 = new c(l3, l4, n3);
                arrayList.add(c4);
            }
        }
        catch (IOException iOException) {
            e1.l("???", iOException);
            android.ext.n0.h(Thread.currentThread(), iOException, false);
        }
        p0 = arrayList;
        q0 += 100;
    }

    static String D3(String string2) {
        String string3 = string2;
        if (!t1.m(string2)) {
            string3 = t1.C(string2) != 0 ? string2 : t1.f(string2);
        }
        return string3;
    }

    static String E3(String string2) {
        return t1.e(string2);
    }

    public static String F3(String string2) {
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
        return globals.O3(new ByteArrayInputStream(string2.getBytes()), string2, "t", globals).call().g0();
    }

    static boolean G3(LuaTable luaTable, LuaValue luaValue, boolean bl) {
        try {
            bl = luaTable.U0(luaValue).E1(bl);
            return bl;
        }
        catch (luaj.d d4) {
            throw Script.b3(luaValue, d4);
        }
    }

    static int H3(LuaTable luaTable, LuaValue luaValue, int n3) {
        try {
            n3 = luaTable.U0(luaValue).H1(n3);
            return n3;
        }
        catch (luaj.d d4) {
            throw Script.b3(luaValue, d4);
        }
    }

    static String I3(LuaTable object, LuaValue luaValue, String string2) {
        try {
            object = ((LuaTable)object).U0(luaValue).I1(string2);
            return object;
        }
        catch (luaj.d d4) {
            throw Script.b3(luaValue, d4);
        }
    }

    static byte J3(byte by) {
        Script.j3(by);
        return 0;
    }

    public static void K3(Globals luaValue) {
        LuaNil.P = null;
        LuaNumber.P = null;
        LuaBoolean.Q = null;
        luaValue = (luaValue = luaValue == null ? null : luaValue.T0("string")) != null && !luaValue.l1() ? LuaValue.u2(new LuaValue[]{LuaValue.l, luaValue}) : null;
        LuaString.U = luaValue;
        LuaFunction.P = null;
        LuaThread.T = null;
    }

    static int O3(byte by) {
        return (byte)(by - 20) / 20;
    }

    private static void P3(ArrayList arrayList, LuaTable object, String string2, int n3) {
        ((LuaValue)object).a2(string2, n3);
        if (arrayList != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("gg.");
            ((StringBuilder)object).append(string2);
            arrayList.add(new Const(((StringBuilder)object).toString(), n3));
        }
    }

    private static void Q3(int n3, LuaTable luaTable, LuaString luaString, long l3, long l4, int n4) {
        long l5 = l4;
        if (n4 == 8) {
            l5 = l4 ^ l3;
        }
        if (n4 == 16) {
            luaTable.H3(n3, luaString, Float.intBitsToFloat((int)l5));
        } else if (n4 == 64) {
            luaTable.G3(n3, luaString, Double.longBitsToDouble(l5));
        } else {
            luaTable.J3(n3, luaString, android.ext.i0.b(l5, android.ext.c.y(n4), false));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static ArrayList S3(byte by) {
        Map map = r0;
        synchronized (map) {
            return (ArrayList)map.get(by);
        }
    }

    static c T3(c c4, LuaTable luaValue, byte by, boolean bl) {
        long l3;
        Object object = t0;
        long l4 = l3 = Script.i3(luaValue, object[0]);
        if (!bl) {
            l4 = l3 & 0xFFFFFFFFL;
        }
        int n3 = Script.f3(Script.g3(luaValue, object[2]));
        if (by != 2) {
            object = object[1];
            luaValue = luaValue.U0((LuaValue)object);
            bl = by == 0;
            l3 = Script.q3(l4, (LuaValue)object, luaValue, n3, bl);
        } else {
            l3 = 0L;
        }
        if (c4 == null) {
            c4 = new c(l4, l3, n3);
        } else {
            c4.a = l4;
            c4.b = l3;
            c4.c = n3;
        }
        return c4;
    }

    static h2 U3(LuaTable luaTable, boolean bl) {
        Object object = t0;
        h2 h22 = new h2();
        Script.T3(h22, luaTable, (byte)0, bl);
        h22.l = Script.I3(luaTable, object[3], null);
        h22.m = Script.G3(luaTable, object[4], false);
        h22.d0(Script.H3(luaTable, object[5], 0));
        long l3 = h22.a;
        int n3 = h22.c;
        LuaString luaString = object[6];
        h22.o = Script.q3(l3, luaString, luaTable.U0(luaString), n3, true);
        object = object[7];
        h22.p = Script.q3(l3, (LuaValue)object, luaTable.U0((LuaValue)object), n3, true);
        return h22;
    }

    static String V3(Throwable throwable) {
        if (throwable instanceof t1.a) {
            ((t1.a)throwable).d();
        }
        return throwable.toString();
    }

    static void W3(Object object) {
        try {
            object.wait();
            return;
        }
        catch (InterruptedException interruptedException) {
            e1.s("Interrupted wait", interruptedException);
            Thread.currentThread().interrupt();
            throw new luaj.d(interruptedException);
        }
    }

    public static void Y2(long l3) {
        s0 = l3;
    }

    private static luaj.d b3(LuaValue luaValue, luaj.d serializable) {
        String string2 = ((luaj.d)serializable).getMessage();
        if (string2.indexOf("bad argument:") == 0) {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("bad argument for key '");
            ((StringBuilder)serializable).append(luaValue.g0());
            ((StringBuilder)serializable).append("':");
            ((StringBuilder)serializable).append(string2.substring(13));
            serializable = new luaj.d(((StringBuilder)serializable).toString());
        }
        return serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d3(byte by, ArrayList arrayList) {
        Map map = r0;
        synchronized (map) {
            map.put(by, arrayList);
            return;
        }
    }

    static int e3(int n3) {
        if (n3 != 0x4000000 && n3 != 0x8000000 && n3 != 0x10000000 && n3 != 0x20000000) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown sign: ");
            stringBuilder.append(n3);
            stringBuilder.append(". The sign must be one of the constants gg.SIGN_*.");
            throw new luaj.d(stringBuilder.toString());
        }
        return n3;
    }

    static int f3(int n3) {
        if (n3 != 0 && (n3 & 0xFFFFFF80) == 0) {
            return n3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown type: ");
        stringBuilder.append(n3);
        stringBuilder.append(". The type must be one of the constants gg.TYPE_*.");
        throw new luaj.d(stringBuilder.toString());
    }

    static int g3(LuaTable luaTable, LuaValue luaValue) {
        try {
            int n3 = luaTable.U0(luaValue).A0();
            return n3;
        }
        catch (luaj.d d4) {
            throw Script.b3(luaValue, d4);
        }
    }

    static String h3(LuaTable object, LuaValue luaValue) {
        try {
            object = ((LuaTable)object).U0(luaValue).B0();
            return object;
        }
        catch (luaj.d d4) {
            throw Script.b3(luaValue, d4);
        }
    }

    static long i3(LuaTable luaTable, LuaValue luaValue) {
        try {
            long l3 = luaTable.g3(luaValue);
            return l3;
        }
        catch (luaj.d d4) {
            throw Script.b3(luaValue, d4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static ArrayList j3(byte by) {
        Map map = r0;
        synchronized (map) {
            return (ArrayList)map.remove(by);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void l3(int n3) {
        Map map = r0;
        synchronized (map) {
            try {
                Iterator iterator = map.keySet().iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    if (Script.O3((Byte)iterator.next()) != n3) continue;
                    iterator.remove();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    static luaj.d m3(LuaValue luaValue, LuaValue luaValue2, Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed parse item ");
        stringBuilder.append(luaValue2.g0());
        stringBuilder.append(" on key '");
        stringBuilder.append(luaValue.g0());
        stringBuilder.append("': ");
        stringBuilder.append(throwable.getMessage());
        return new luaj.d(stringBuilder.toString(), throwable);
    }

    private static LuaTable n3(int[] objectArray, c c4) {
        int[] nArray = objectArray;
        if (objectArray == null) {
            nArray = u0;
        }
        int n3 = nArray.length;
        objectArray = t0;
        LuaTable luaTable = new LuaTable(0, n3);
        long l3 = c4.a;
        n3 = c4.c;
        luaTable.J3(nArray[0], (LuaString)objectArray[0], l3);
        Script.Q3(nArray[1], luaTable, (LuaString)objectArray[1], l3, c4.b, n3);
        luaTable.I3(nArray[2], (LuaString)objectArray[2], n3);
        return luaTable;
    }

    static LuaTable o3(h2 h22) {
        LuaString[] luaStringArray = t0;
        int[] nArray = v0;
        LuaTable luaTable = Script.n3(nArray, h22);
        String string2 = h22.l;
        if (string2 != null) {
            luaTable.m3(luaStringArray[3], LuaValue.K2(string2));
        }
        luaTable.K3(nArray[4], luaStringArray[4], h22.m);
        luaTable.I3(nArray[5], luaStringArray[5], h22.n);
        long l3 = h22.a;
        int n3 = h22.c;
        long l4 = h22.o;
        if (l4 != 0L || h22.p != 0L) {
            Script.Q3(nArray[6], luaTable, luaStringArray[6], l3, l4, n3);
            Script.Q3(nArray[7], luaTable, luaStringArray[7], l3, h22.p, n3);
        }
        return luaTable;
    }

    public static Consts p3(ArrayList arrayList) {
        Object object;
        Object object2 = object = (Consts)o0.get();
        if (object == null) {
            object2 = arrayList;
            if (arrayList == null) {
                object2 = new ArrayList();
                Script.B3(new LuaTable(0, 64), object2);
            }
            ArrayList<Const> arrayList2 = new ArrayList<Const>();
            arrayList = new ArrayList<Const>();
            object = new ArrayList();
            ArrayList<Const> arrayList3 = new ArrayList<Const>();
            ArrayList<Const> arrayList4 = new ArrayList<Const>();
            ArrayList<Const> arrayList5 = new ArrayList<Const>();
            ArrayList<Const> arrayList6 = new ArrayList<Const>();
            ArrayList<Const> arrayList7 = new ArrayList<Const>();
            ArrayList<Const> arrayList8 = new ArrayList<Const>();
            ArrayList<Const> arrayList9 = new ArrayList<Const>();
            object2 = ((ArrayList)object2).iterator();
            while (object2.hasNext()) {
                Const const_ = (Const)object2.next();
                String string2 = const_.a;
                if (string2.startsWith("gg.REGION_")) {
                    arrayList2.add(const_);
                    continue;
                }
                if (string2.startsWith("gg.TYPE_")) {
                    arrayList.add(const_);
                    continue;
                }
                if (string2.startsWith("gg.SIGN_FUZZY_")) {
                    ((ArrayList)object).add(const_);
                    continue;
                }
                if (string2.startsWith("gg.SIGN_")) {
                    arrayList3.add(const_);
                    continue;
                }
                if (string2.startsWith("gg.LOAD_")) {
                    arrayList4.add(const_);
                    continue;
                }
                if (string2.startsWith("gg.SAVE_")) {
                    arrayList5.add(const_);
                    continue;
                }
                if (string2.startsWith("gg.PROT_")) {
                    arrayList6.add(const_);
                    continue;
                }
                if (string2.startsWith("gg.POINTER_")) {
                    arrayList7.add(const_);
                    continue;
                }
                if (string2.startsWith("gg.DUMP_")) {
                    arrayList8.add(const_);
                    continue;
                }
                if (!string2.startsWith("gg.ASM_")) continue;
                arrayList9.add(const_);
            }
            object2 = new Consts();
            ((Consts)object2).a = arrayList2.toArray(new Const[arrayList2.size()]);
            ((Consts)object2).b = arrayList.toArray(new Const[arrayList.size()]);
            ((Consts)object2).c = ((ArrayList)object).toArray(new Const[((ArrayList)object).size()]);
            ((Consts)object2).d = arrayList3.toArray(new Const[arrayList3.size()]);
            ((Consts)object2).e = arrayList4.toArray(new Const[arrayList4.size()]);
            ((Consts)object2).f = arrayList5.toArray(new Const[arrayList5.size()]);
            ((Consts)object2).g = arrayList6.toArray(new Const[arrayList6.size()]);
            ((Consts)object2).h = arrayList7.toArray(new Const[arrayList7.size()]);
            ((Consts)object2).i = arrayList8.toArray(new Const[arrayList8.size()]);
            ((Consts)object2).j = arrayList9.toArray(new Const[arrayList9.size()]);
            o0 = new WeakReference<Object>(object2);
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static long q3(long l3, LuaValue object, LuaValue object2, int n3, boolean bl) {
        long l4;
        if (object2 instanceof LuaLong) {
            long l5;
            l4 = ((LuaValue)object2).z2();
            if (n3 == 16) {
                l5 = Float.floatToRawIntBits(l4);
            } else {
                l5 = l4;
                if (n3 == 64) {
                    l5 = Double.doubleToRawLongBits(l4);
                }
            }
            l4 = l5;
            if (n3 != 8) return l4;
            return l5 ^ l3;
        }
        if (object2 instanceof LuaDouble) {
            double d4 = ((LuaValue)object2).x2();
            long l6 = n3 == 16 ? (long)Float.floatToRawIntBits((float)d4) : (n3 == 64 ? Double.doubleToRawLongBits(d4) : (long)d4);
            l4 = l6;
            if (n3 != 8) return l4;
            return l3 ^ l6;
        }
        if (bl) {
            try {
                object = object2 = ((LuaValue)object2).I1(null);
            }
            catch (luaj.d d5) {
                throw Script.b3((LuaValue)object, d5);
            }
        } else {
            object = object2 = ((LuaValue)object2).B0();
        }
        if (object == null) {
            return 0L;
        }
        object2 = i2.x((String)(object = Script.D3((String)object)), false);
        if (object2 == null) return android.ext.c.e(l3, (String)object, n3);
        object = ((i2.c)object2).a;
        return android.ext.c.e(l3, (String)object, n3);
    }

    static ArrayList r3(Varargs object) {
        Object object2 = ((Varargs)object).I(1);
        object = new ArrayList();
        Object object3 = MainService.instance.v0;
        boolean bl = object3 != null ? ((z1.d)object3).n : false;
        object2 = ((LuaTable)object2).s3();
        while (((LuaTable.i)object2).c()) {
            object3 = Script.T3(null, ((LuaTable.i)object2).d().H0(), (byte)2, bl);
            ((c)object3).c &= 0x7F;
            ((ArrayList)object).add(object3);
        }
        return object;
    }

    static String s3(File object) {
        try {
            String string2 = ((File)object).getCanonicalPath();
            object = string2;
        }
        catch (IOException iOException) {
            object = ((File)object).getAbsolutePath();
        }
        return object;
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
        globals.t1(new IoLibSafe(this));
        globals.t1(new OsLibSafe(this));
        globals.t1(new DebugLib());
        this.v3();
    }

    private void v3() {
        Globals globals = this.T;
        globals.c0 = new ScriptPrintStream(this, false);
        globals.d0 = new ScriptPrintStream(this, true);
        globals.t1(this);
    }

    void L3() {
        SavedState savedState = this.m0;
        if (savedState == null) {
            return;
        }
        n2.i(new Runnable(this, savedState){
            final SavedState a;
            final Script b;
            {
                this.b = script;
                this.a = savedState;
            }

            @Override
            public void run() {
                int n3;
                Config.b((int)2131034189).d = n3 = this.a.a;
                Config.k();
            }
        });
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void M3() {
        Throwable throwable622222;
        Object object;
        block31: {
            Object object2;
            Object object3;
            Object object4;
            block30: {
                Object object5;
                Object object6;
                object4 = this.U;
                if (object4 instanceof File) {
                    block27: {
                        object3 = (File)object4;
                        if (!((File)object3).exists()) {
                            object4 = new StringBuilder();
                            ((StringBuilder)object4).append("File not found: ");
                            ((StringBuilder)object4).append(object3);
                            throw new FileNotFoundException(((StringBuilder)object4).toString());
                        }
                        this.T.T3(((File)object3).getParentFile().getAbsolutePath());
                        object2 = ((File)object3).getAbsolutePath();
                        object = new BaseLib.b(new FileInputStream((File)object3));
                        object6 = this.T;
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append('@');
                        ((StringBuilder)object4).append((String)object2);
                        object4 = ((Globals)object6).O3((InputStream)object, ((StringBuilder)object4).toString(), "bt", this.T);
                        if (!(object4 instanceof LuaClosure)) break block27;
                        ((LuaClosure)object4).U = object2;
                    }
                    ((InputStream)object).close();
                    if (object4 instanceof LuaClosure && ((LuaClosure)object4).R instanceof lasm.b) {
                        Throwable throwable2222222;
                        block29: {
                            block28: {
                                object = new StringBuilder();
                                ((StringBuilder)object).append(((File)object3).getAbsolutePath());
                                ((StringBuilder)object).append('.');
                                ((StringBuilder)object).append(t2.h(System.currentTimeMillis() - 1546300800000L));
                                ((StringBuilder)object).append(".lua");
                                object2 = ((StringBuilder)object).toString();
                                object = new BufferedOutputStream(new FileOutputStream((String)object2), 65536);
                                try {
                                    int n3;
                                    g.b.a(((LuaClosure)object4).R, (OutputStream)object, false, false);
                                    object6 = new StringBuilder();
                                    ((StringBuilder)object6).append(((File)object3).getAbsolutePath());
                                    ((StringBuilder)object6).append(".tail");
                                    object4 = new File(((StringBuilder)object6).toString());
                                    if (!((File)object4).exists()) break block28;
                                    object3 = new FileInputStream((File)object4);
                                    object4 = new byte[65536];
                                    while ((n3 = ((FileInputStream)object3).read((byte[])object4)) > 0) {
                                        ((OutputStream)object).write((byte[])object4, 0, n3);
                                    }
                                }
                                catch (Throwable throwable2222222) {
                                    break block29;
                                }
                                ((FileInputStream)object3).close();
                            }
                            ((OutputStream)object).close();
                            object4 = new StringBuilder();
                            ((StringBuilder)object4).append(Tools.N1(2131296291));
                            ((StringBuilder)object4).append(":\n");
                            ((StringBuilder)object4).append((String)object2);
                            this.Z2(((StringBuilder)object4).toString());
                            return;
                        }
                        ((OutputStream)object).close();
                        throw throwable2222222;
                    }
                    object3 = ((File)object3).getName();
                } else {
                    object4 = object4.toString();
                    object4 = this.T.O3(new ByteArrayInputStream(((String)object4).getBytes()), (String)object4, "t", this.T);
                    object3 = "string";
                }
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append('_');
                ((StringBuilder)object).append(t2.h(System.currentTimeMillis() - 1546300800000L));
                ((StringBuilder)object).append('_');
                ((StringBuilder)object).append(t2.g(Tools.a.nextInt()));
                object = ((StringBuilder)object).toString();
                if ((this.X & 1) != 0) {
                    object3 = ((LuaValue)object4).w0();
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(this.Y);
                    ((StringBuilder)object2).append('/');
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(".lasm");
                    object2 = ((StringBuilder)object2).toString();
                    object6 = luaj.g.b;
                    try {
                        object5 = new PrintStream((String)object2);
                        luaj.g.b = object5;
                        luaj.g.A(((LuaClosure)object3).R);
                        luaj.g.b.close();
                        object5 = new StringBuilder();
                        ((StringBuilder)object5).append((String)object2);
                        ((StringBuilder)object5).append(".tail");
                        luaj.g.M((LuaClosure)object3, ((StringBuilder)object5).toString());
                    }
                    catch (Throwable throwable3) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed disassemble ");
                        stringBuilder.append(object3);
                        stringBuilder.append(" into '");
                        stringBuilder.append((String)object2);
                        stringBuilder.append('\'');
                        e1.l(stringBuilder.toString(), throwable3);
                    }
                    luaj.g.b = object6;
                }
                if ((this.X & 2) != 0) {
                    object3 = this.T.g0;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(this.Y);
                    ((StringBuilder)object2).append('/');
                    ((StringBuilder)object2).append((String)object);
                    ((BaseLib)object3).c3(((StringBuilder)object2).toString());
                }
                if ((this.X & 4) != 0) {
                    try {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(this.Y);
                        ((StringBuilder)object2).append('/');
                        ((StringBuilder)object2).append((String)object);
                        ((StringBuilder)object2).append(".log.txt");
                        object5 = new FileOutputStream(((StringBuilder)object2).toString());
                        object6 = new OutputStreamWriter((OutputStream)object5);
                        object3 = new BufferedWriter((Writer)object6, 65536);
                        break block30;
                    }
                    catch (Throwable throwable4) {
                        e1.s("Failed open log file", throwable4);
                    }
                }
                object3 = null;
            }
            object = object3 == null ? null : new DebugLog((Writer)object3, this.T);
            w0 = object;
            object = luaj.g.b;
            try {
                object2 = this.T;
                luaj.g.b = ((Globals)object2).c0;
                Script.K3((Globals)object2);
                ((LuaValue)object4).call();
                return;
            }
            finally {
                luaj.g.b = object;
                if (object3 != null) {
                    w0 = null;
                    try {
                        ((Writer)object3).close();
                    }
                    catch (Throwable throwable5) {
                        e1.s("Failed close log", throwable5);
                    }
                }
                if ((this.X & 2) != 0) {
                    this.T.g0.Z2();
                }
                Script.K3(null);
            }
            catch (Throwable throwable622222) {
                break block31;
            }
            catch (Exception exception) {}
            {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("load ");
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(": ");
                ((StringBuilder)object3).append(exception);
                luaj.d d4 = new luaj.d(((StringBuilder)object3).toString(), exception);
                throw d4;
            }
        }
        ((InputStream)object).close();
        throw throwable622222;
    }

    void N3() {
        SavedState savedState = new SavedState();
        savedState.a = Config.i;
        this.m0 = savedState;
    }

    public Script R3() {
        this.V.start();
        return this;
    }

    void Z2(String string2) {
        this.W.a("\n");
        this.W.a(string2);
        this.W.a("\n");
    }

    void a3(boolean bl, String string2) {
        if (bl) {
            this.W.a("err: ");
        }
        this.W.a(string2);
        this.W.a("\n");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c3(byte by, String string2) {
        block7: {
            byte by2;
            byte by3;
            byte by4;
            byte by5;
            block6: {
                by5 = (byte)(by - 20);
                by4 = (byte)(by5 / 20);
                by3 = (byte)(by5 % 20);
                if (this.Z == by4) break block6;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("callNotify id mismatch: ");
                stringBuilder.append(this.Z);
                stringBuilder.append(" != ");
                stringBuilder.append(by4);
                stringBuilder.append("; ");
                stringBuilder.append(by3);
                stringBuilder.append("; ");
                stringBuilder.append(by);
                stringBuilder.append("; ");
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
                break block7;
            }
            by5 = by2 = this.b0;
            if (by2 == by3) {
                synchronized (this) {
                    try {
                        by5 = this.b0;
                        if (by5 == by3) {
                            this.l0 = string2;
                            this.notifyAll();
                            return;
                        }
                    }
                    catch (Throwable throwable) {
                    }
                    throw throwable;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("callNotify seq mismatch: ");
            stringBuilder.append(by5);
            stringBuilder.append(" != ");
            stringBuilder.append(by3);
            stringBuilder.append("; ");
            stringBuilder.append(by4);
            stringBuilder.append("; ");
            stringBuilder.append(by);
            stringBuilder.append("; ");
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
        }
        e1.d(string2);
    }

    @Override
    public LuaValue call(LuaValue object, LuaValue luaValue) {
        Object object2 = Tools.f0();
        object = (this.X & 4) != 0 ? new ArrayList() : null;
        LuaTable luaTable = new LuaTable(0, 128);
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append("");
        float f4 = 1.0f;
        ((StringBuilder)object3).append(108.3f * f4 - 6.9f);
        luaTable.b2("VERSION", ((StringBuilder)object3).toString());
        luaTable.a2("VERSION_INT", android.ext.h0.d());
        luaTable.a2("BUILD", (int)(f4 * 16409.7f - 254.7f + 0.5f));
        luaTable.b2("PACKAGE", Tools.C0());
        luaTable.a2("ANDROID_SDK_INT", Build.VERSION.SDK_INT);
        luaTable.b2("FILES_DIR", Tools.p0().getAbsolutePath());
        luaTable.b2("CACHE_DIR", Tools.b0().getAbsolutePath());
        try {
            luaTable.b2("EXT_FILES_DIR", object2.getExternalFilesDir(null).getAbsolutePath());
        }
        catch (Throwable throwable) {
            e1.l("Failed set EXT_FILES_DIR for script", throwable);
            luaTable.b2("EXT_FILES_DIR", Tools.p0().getAbsolutePath());
        }
        try {
            luaTable.b2("EXT_CACHE_DIR", object2.getExternalCacheDir().getAbsolutePath());
        }
        catch (Throwable throwable) {
            e1.l("Failed set EXT_CACHE_DIR for script", throwable);
            luaTable.b2("EXT_CACHE_DIR", Tools.b0().getAbsolutePath());
        }
        luaTable.b2("EXT_STORAGE", Tools.K0());
        Script.B3(luaTable, (ArrayList)object);
        luaTable.c2("require", new require(this));
        luaTable.c2("toast", new toast());
        luaTable.c2("alert", new alert());
        luaTable.c2("prompt", new prompt(this));
        luaTable.c2("choice", new choice());
        luaTable.c2("multiChoice", new multiChoice());
        luaTable.c2("isVisible", new isVisible());
        luaTable.c2("setVisible", new setVisible(this));
        luaTable.c2("getActiveTab", new getActiveTab());
        luaTable.c2("showUiButton", new showUiButton(this));
        luaTable.c2("hideUiButton", new hideUiButton(this));
        luaTable.c2("isClickedUiButton", new isClickedUiButton());
        getTargetPackage getTargetPackage2 = new getTargetPackage();
        luaTable.c2("getTargetPackage", getTargetPackage2);
        luaTable.c2("getTargetInfo", new getTargetInfo());
        luaTable.c2("isPackageInstalled", new isPackageInstalled());
        luaTable.c2("processKill", new processKill(this));
        luaTable.c2("saveVariable", new saveVariable(this));
        luaTable.c2("makeRequest", new makeRequest(this));
        object2 = new getResultsCount();
        luaTable.c2("getResultsCount", (LuaValue)object2);
        luaTable.c2("getResults", new getResults(this));
        luaTable.c2("editAll", new editAll(this));
        luaTable.c2("clearResults", new clearResults(this));
        luaTable.c2("removeResults", new removeResults(this));
        luaTable.c2("loadResults", new loadResults(this));
        luaTable.c2("getSelectedResults", new getSelectedResults(this));
        luaTable.c2("setValues", new setValues(this));
        luaTable.c2("getValues", new getValues(this));
        luaTable.c2("getValuesRange", new getValuesRange(this));
        luaTable.c2("processPause", new processPause(this));
        luaTable.c2("processResume", new processResume(this));
        luaTable.c2("processToggle", new processToggle(this));
        luaTable.c2("isProcessPaused", new isProcessPaused());
        luaTable.c2("timeJump", new timeJump(this));
        luaTable.c2("setSpeed", new setSpeed(this));
        luaTable.c2("getSpeed", new getSpeed());
        luaTable.c2("unrandomizer", new unrandomizer(this));
        luaTable.c2("gotoAddress", new gotoAddress());
        luaTable.c2("getSelectedElements", new getSelectedElements(this));
        luaTable.c2("getRanges", new getRanges());
        luaTable.c2("setRanges", new setRanges(this));
        luaTable.c2("copyMemory", new copyMemory(this));
        luaTable.c2("dumpMemory", new dumpMemory(this));
        luaTable.c2("loadList", new loadList(this));
        luaTable.c2("saveList", new saveList(this));
        luaTable.c2("clearList", new clearList(this));
        luaTable.c2("addListItems", new addListItems(this));
        luaTable.c2("getListItems", new getListItems(this));
        luaTable.c2("removeListItems", new removeListItems(this));
        luaTable.c2("getSelectedListItems", new getSelectedListItems(this));
        luaTable.c2("searchNumber", new searchNumber(this));
        luaTable.c2("refineNumber", new refineNumber(this));
        luaTable.c2("searchAddress", new searchAddress(this));
        luaTable.c2("refineAddress", new refineAddress(this));
        luaTable.c2("startFuzzy", new startFuzzy(this));
        luaTable.c2("searchFuzzy", new searchFuzzy(this));
        object3 = new searchPointer(this);
        luaTable.c2("searchPointer", (LuaValue)object3);
        luaTable.c2("sleep", new sleep());
        luaTable.c2("copyText", new copyText());
        luaTable.c2("disasm", new disasm(this));
        luaTable.c2("getLine", new getLine(this));
        luaTable.c2("getFile", new getFile(this));
        luaTable.c2("bytes", new bytes(this));
        luaTable.c2("skipRestoreState", new skipRestoreState(this));
        luaTable.c2("getRangesList", new getRangesList(this));
        luaTable.c2("allocatePage", new allocatePage(this));
        luaTable.c2("getLocale", new getLocale(this));
        luaTable.c2("numberToLocale", new numberToLocale(this));
        luaTable.c2("numberFromLocale", new numberFromLocale(this));
        luaTable.d2(LuaValue.K2("SIGN_INEQUAL").h3(), LuaValue.I2(0x10000000L));
        luaTable.d2(LuaValue.K2("SIGN_SMALLER").h3(), LuaValue.I2(0x8000000L));
        luaTable.d2(LuaValue.K2("SIGN_LARGER").h3(), LuaValue.I2(0x4000000L));
        luaTable.d2(LuaValue.K2("getSelectedPackage").h3(), getTargetPackage2);
        luaTable.d2(LuaValue.K2("getResultCount").h3(), (LuaValue)object2);
        luaTable.d2(LuaValue.K2("internal1").h3(), new internal1(this));
        luaTable.d2(LuaValue.K2("internal2").h3(), new internal2(this));
        luaTable.d2(LuaValue.K2("internal3").h3(), (LuaValue)object3);
        luaValue.i2("gg", luaTable);
        luaValue.T0("package").T0("loaded").i2("gg", luaTable);
        object2 = luaValue.T0("os");
        ((LuaValue)object2).i2("exit", new exit());
        ((LuaValue)object2).i2("remove", new wrap(this, "os.remove", ((LuaValue)object2).T0("remove"), 1));
        ((LuaValue)object2).i2("rename", new wrap(this, "os.rename", ((LuaValue)object2).T0("rename"), 2));
        ((LuaValue)object2).i2("tmpname", new wrap(this, "os.tmpname", ((LuaValue)object2).T0("tmpname"), 0));
        object2 = luaValue.T0("string");
        ((LuaValue)object2).i2("format", new format(((LuaValue)object2).T0("format")));
        ((LuaValue)object2).i2("dump", new wrap(this, "string.dump", ((LuaValue)object2).T0("dump"), 1));
        object2 = luaValue.T0("io");
        ((LuaValue)object2).i2("open", new wrap(this, "io.open", ((LuaValue)object2).T0("open"), 2));
        ((LuaValue)object2).i2("input", new wrap(this, "io.input", ((LuaValue)object2).T0("input"), 1));
        ((LuaValue)object2).i2("output", new wrap(this, "io.output", ((LuaValue)object2).T0("output"), 1));
        ((LuaValue)object2).i2("tmpfile", new wrap(this, "io.tmpfile", ((LuaValue)object2).T0("tmpfile"), 0));
        ((LuaValue)object2).i2("lines", new wrap(this, "io.lines", ((LuaValue)object2).T0("lines"), 1));
        luaValue = luaValue.T0("debug");
        luaValue.i2("debug", new wrap(this, "debug.debug", luaValue.T0("debug"), 0));
        luaValue.i2("gethook", new wrap(this, "debug.gethook", luaValue.T0("gethook"), 1));
        luaValue.i2("getinfo", new wrap(this, "debug.getinfo", luaValue.T0("getinfo"), 3));
        luaValue.i2("getlocal", new wrap(this, "debug.getlocal", luaValue.T0("getlocal"), 3));
        luaValue.i2("getmetatable", new wrap(this, "debug.getmetatable", luaValue.T0("getmetatable"), 1));
        luaValue.i2("getregistry", new wrap(this, "debug.getregistry", luaValue.T0("getregistry"), 0));
        luaValue.i2("getupvalue", new wrap(this, "debug.getupvalue", luaValue.T0("getupvalue"), 2));
        luaValue.i2("getuservalue", new wrap(this, "debug.getuservalue", luaValue.T0("getuservalue"), 1));
        luaValue.i2("sethook", new wrap(this, "debug.sethook", luaValue.T0("sethook"), 4));
        luaValue.i2("setlocal", new wrap(this, "debug.setlocal", luaValue.T0("setlocal"), 4));
        luaValue.i2("setmetatable", new wrap(this, "debug.setmetatable", luaValue.T0("setmetatable"), 2));
        luaValue.i2("setupvalue", new wrap(this, "debug.setupvalue", luaValue.T0("setupvalue"), 3));
        luaValue.i2("setuservalue", new wrap(this, "debug.setuservalue", luaValue.T0("setuservalue"), 2));
        luaValue.i2("traceback", new wrap(this, "debug.traceback", luaValue.T0("traceback"), 3));
        luaValue.i2("upvalueid", new wrap(this, "debug.upvalueid", luaValue.T0("upvalueid"), 2));
        luaValue.i2("upvaluejoin", new wrap(this, "debug.upvaluejoin", luaValue.T0("upvaluejoin"), 4));
        object = object != null ? Script.p3((ArrayList)object) : new Consts();
        this.g0 = object;
        return luaTable;
    }

    void k3() {
        Script.l3(this.Z);
    }

    @Override
    public boolean m(String string2, boolean bl) {
        Object object;
        String string3;
        String string4 = Script.s3(new File(string2));
        string2 = string3 = this.i0;
        if (string3 == null) {
            this.i0 = string2 = Script.s3(Tools.q0());
        }
        if (Script.A3(string4, string2)) {
            return true;
        }
        string2 = string3 = this.j0;
        if (string3 == null) {
            this.j0 = string2 = Script.s3(Tools.c0());
        }
        if (Script.A3(string4, string2)) {
            return true;
        }
        string2 = string3 = this.k0;
        if (string3 == null) {
            this.k0 = string2 = Script.s3(x2.g(MainService.G0));
        }
        if (Script.A3(string2, string4)) {
            return true;
        }
        if (!bl && (object = this.U) instanceof File) {
            string2 = string3 = this.h0;
            if (string3 == null) {
                this.h0 = string2 = Script.s3((File)object);
            }
            return Script.A3(string2, string4);
        }
        return false;
    }

    byte t3() {
        byte by;
        int n3 = this.a0;
        this.a0 = n3 + 1;
        this.b0 = by = (byte)(n3 % 20);
        return (byte)(by + this.Z * 20 + 20);
    }

    public Script w3() {
        return this.x3(1);
    }

    public Script x3(int n3) {
        this.f0 = n3;
        this.V.interrupt();
        return this;
    }

    void y3() {
        this.c0 = false;
        this.d0 = Script.J3(this.d0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean z3(File var1_1) {
        block11: {
            block10: {
                var5_4 = var1_1.exists();
                var4_5 = false;
                if (!var5_4) {
                    return false;
                }
                try {
                    var7_7 = new FileReader((File)var1_1);
                    var6_6 = new BufferedReader(var7_7);
                    var2_8 = 0;
lbl9:
                    // 3 sources

                    while (true) {
                        var1_1 = var6_6.readLine();
                        var3_9 = var2_8;
                        if (var1_1 == null) ** GOTO lbl-1000
                        var3_9 = (var1_1 = var1_1.trim()).length();
                        if (var3_9 == 0) continue;
                        if (var2_8 == 0) {
                        }
                        ** GOTO lbl-1000
                        break;
                    }
                }
                catch (IOException var1_2) {
                    break block10;
                }
                try {
                    Integer.parseInt((String)var1_1);
                    var2_8 = 1;
                    ** GOTO lbl9
                }
                catch (Throwable var1_3) {
                    var3_9 = var2_8;
                }
lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var6_6.close();
                        if (var3_9 <= 1) return var4_5;
                        return true;
                    }
                }
            }
            e1.g("Failed detect", var1_2);
            return false;
lbl-1000:
            // 1 sources

            {
                if (var1_1.split("\\|").length >= 10) break block11;
            }
            var3_9 = -var2_8;
            ** while (true)
        }
        ++var2_8;
        ** while (true)
    }

    public static abstract class ApiFunction
    extends VarArgFunction {
        static WeakReference Y = new WeakReference<Object>(null);
        static WeakReference Z = new WeakReference<Object>(null);
        private static Map a0 = null;
        private static Map b0 = null;
        private static Map c0 = null;
        private static Map d0 = null;
        private volatile Varargs T = null;
        private volatile Throwable U = null;
        protected volatile Object V;
        private final boolean W = this instanceof BusyApiFunction;
        private String X;

        public ApiFunction() {
            this.V = new Object();
        }

        private static Map X2(int n3) {
            HashMap<LuaString, LuaValue> hashMap = new HashMap<LuaString, LuaValue>();
            for (int i3 = 0; i3 < 8; ++i3) {
                if ((1 << i3 & n3) == 0) continue;
                hashMap.put(t0[i3], LuaValue.c);
            }
            return hashMap;
        }

        static boolean e3(ApiFunction object, Writer writer, int n3, LuaValue luaValue) {
            block11: {
                block5: {
                    block9: {
                        block6: {
                            block7: {
                                block10: {
                                    block8: {
                                        if (luaValue instanceof LuaString) {
                                            return Consts.d(writer, luaValue.g0());
                                        }
                                        if (!(luaValue instanceof LuaTable)) break block5;
                                        if (object == null || n3 != 1) break block6;
                                        if (object instanceof removeResults || object instanceof loadResults || object instanceof getValues) break block7;
                                        if (!(object instanceof setValues)) break block8;
                                        Map map = b0;
                                        object = map;
                                        if (map == null) {
                                            b0 = object = ApiFunction.X2(7);
                                        }
                                        break block9;
                                    }
                                    if (object instanceof getValuesRange || object instanceof removeListItems) break block10;
                                    if (!(object instanceof addListItems)) break block6;
                                    Map map = d0;
                                    object = map;
                                    if (map == null) {
                                        d0 = object = ApiFunction.X2(255);
                                    }
                                    break block9;
                                }
                                Map map = c0;
                                object = map;
                                if (map == null) {
                                    c0 = object = ApiFunction.X2(1);
                                }
                                break block9;
                            }
                            Map map = a0;
                            object = map;
                            if (map == null) {
                                a0 = object = ApiFunction.X2(5);
                            }
                            break block9;
                        }
                        object = null;
                    }
                    ((LuaTable)luaValue).E3(writer, (Map)object);
                    break block11;
                }
                writer.write(luaValue.g0());
            }
            return true;
        }

        private void f3(Writer writer, Varargs varargs) {
            int n3 = varargs.U();
            int n4 = this.Y2();
            int n5 = n3;
            if (n4 >= 0) {
                n5 = n3;
                if (n3 > n4) {
                    n5 = n4;
                }
            }
            for (n3 = 1; n3 <= n5; ++n3) {
                if (n3 != 1) {
                    writer.write(", ");
                }
                if (!this.d3(writer, n3, varargs.v(n3))) break;
            }
        }

        protected static boolean g3(Writer writer, Const[] constArray, LuaValue luaValue) {
            return Consts.a(writer, constArray, luaValue.y2());
        }

        protected static boolean h3(Writer writer, LuaValue luaValue) {
            return Consts.b(writer, luaValue.z2());
        }

        @Override
        public String T2() {
            String string2;
            String string3 = string2 = this.X;
            if (string2 == null) {
                this.X = string3 = super.T2();
            }
            return string3;
        }

        protected abstract int Y2();

        protected String Z2() {
            return null;
        }

        protected Varargs a3() {
            return LuaValue.d;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public Varargs b3(Varargs object) {
            this.T = null;
            this.U = null;
            Object object2 = new Runnable(this, (Varargs)object){
                final Varargs a;
                final ApiFunction b;
                {
                    this.b = apiFunction;
                    this.a = varargs;
                }

                @Override
                public void run() {
                    this.b.j3(this.a);
                }
            };
            object = this.V;
            synchronized (object) {
                n2.i((Runnable)object2);
                Script.W3(this.V);
            }
            object = this.U;
            this.U = null;
            if (object != null) {
                this.T = null;
                if (!(object instanceof RuntimeException)) throw new RuntimeException((Throwable)object);
                throw (RuntimeException)object;
            }
            object2 = this.T;
            this.T = null;
            object = object2;
            if (!this.W) return object;
            if (object2 != null) {
                return object2;
            }
            object = this.Z2();
            if (object != null) return LuaValue.K2((String)object);
            return this.a3();
        }

        public Varargs c3(Varargs varargs) {
            return LuaValue.c;
        }

        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            return ApiFunction.e3(this, writer, n3, luaValue);
        }

        @Override
        public String g0() {
            String string2 = this.k3();
            String string3 = string2.replace("[", "").replace("]", "").replace(" ,", ",");
            Serializable serializable = (Pattern)Y.get();
            Object object = serializable;
            if (serializable == null) {
                object = Pattern.compile(".*(\\(.*\\)).*");
                Y = new WeakReference<Pattern>((Pattern)object);
            }
            string3 = ((Pattern)object).matcher(string3).replaceAll("$1");
            serializable = (Pattern)Z.get();
            object = serializable;
            if (serializable == null) {
                object = Pattern.compile("(?<=[\\(,])( ?)\\s*\\S*\\s*(\\S*)(\\s*=\\s*[^,\\)]*)?(?=[,\\)])");
                Z = new WeakReference<Pattern>((Pattern)object);
            }
            object = ((Pattern)object).matcher(string3).replaceAll("$1$2");
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("function ");
            ((StringBuilder)serializable).append((String)object);
            ((StringBuilder)serializable).append(" end, -- ");
            ((StringBuilder)serializable).append(string2);
            return ((StringBuilder)serializable).toString();
        }

        protected void i3(Writer writer, Varargs varargs) {
            if (!(this instanceof isVisible || this instanceof internal1 || this instanceof internal2 || this instanceof sleep)) {
                writer.write(this.T2());
                writer.write("(");
                this.f3(writer, varargs);
                writer.write(")\n");
            }
        }

        /*
         * Exception decompiling
         */
        @Override
        public final Varargs invoke(Varargs var1_1) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 81->86)] java.lang.Throwable
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void j3(Varargs varargs) {
            Object object;
            block7: {
                Object var3_4 = null;
                try {
                    object = this.c3(varargs);
                }
                catch (Throwable throwable) {
                    object = null;
                    break block7;
                }
                try {
                    this.T = object;
                    varargs = var3_4;
                }
                catch (Throwable throwable) {}
            }
            this.U = varargs;
            if (!this.W || object != null || varargs != null) {
                object = this.V;
                synchronized (object) {
                    this.V.notifyAll();
                }
            }
        }

        abstract String k3();
    }

    abstract class BusyApiFunction
    extends ApiFunction {
        final Script e0;

        public BusyApiFunction(Script script) {
            this.e0 = script;
            this.V = script;
        }

        @Override
        protected String Z2() {
            return this.e0.l0;
        }
    }

    static class Const {
        final String a;
        final int b;

        public Const(String string2, int n3) {
            this.a = string2;
            this.b = n3;
        }
    }

    static class Consts {
        Const[] a = null;
        Const[] b = null;
        Const[] c = null;
        Const[] d = null;
        Const[] e = null;
        Const[] f = null;
        Const[] g = null;
        Const[] h = null;
        Const[] i = null;
        Const[] j = null;

        Consts() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static boolean a(Writer writer, Const[] constArray, int n3) {
            int n4 = constArray.length;
            boolean bl = true;
            int n5 = n3;
            for (int i3 = 0; i3 < n4; ++i3) {
                block6: {
                    block7: {
                        Const const_ = constArray[i3];
                        int n6 = const_.b;
                        n3 = n5;
                        if ((n5 & n6) != n6) break block6;
                        writer.write(const_.a);
                        n3 = n5 & ~n6;
                        if (n3 == 0) break block7;
                        writer.write(" | ");
                    }
                    bl = false;
                }
                n5 = n3;
            }
            if (!bl && n5 == 0) return true;
            try {
                writer.write(Integer.toString(n5));
                return true;
            }
            catch (IOException iOException) {}
            e1.s("Writer fail", iOException);
            return false;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static boolean b(Writer writer, long l3) {
            IOException iOException2;
            block4: {
                String string2;
                block3: {
                    if (l3 != 0L && l3 != -1L) {
                        try {
                            writer.write("0x");
                            string2 = Long.toHexString(l3);
                            break block3;
                        }
                        catch (IOException iOException2) {
                            break block4;
                        }
                    }
                    string2 = Long.toString(l3);
                }
                writer.write(string2);
                return true;
            }
            e1.s("Writer fail", iOException2);
            return false;
        }

        static boolean c(Writer writer, String string2) {
            return Consts.d(writer, Script.E3(string2));
        }

        static boolean d(Writer writer, String string2) {
            try {
                writer.write("\"");
                if (string2.length() <= 65535) {
                    string2 = string2.replace("\"", "\\\"");
                }
                writer.write(string2);
                writer.write("\"");
                return true;
            }
            catch (IOException iOException) {
                e1.s("Writer fail", iOException);
                return false;
            }
        }
    }

    public static abstract class DebugFunction
    extends ApiFunction {
        protected LuaClosure e0 = null;

        public void l3(LuaClosure luaClosure) {
            this.e0 = luaClosure;
        }
    }

    private static final class DebugLog {
        final Writer a;
        final Globals b;

        DebugLog(Writer writer, Globals globals) {
            this.a = writer;
            this.b = globals;
        }
    }

    final class IoLibSafe
    extends IoLib {
        private String f0;
        final Script g0;

        IoLibSafe(Script script) {
            this.g0 = script;
            this.f0 = null;
        }

        private IoLib.File R3(char c4) {
            File file = new File(Tools.q0(), "empty.txt");
            file.createNewFile();
            IoLib.File file2 = super.H3(file.getAbsolutePath(), c4);
            file.delete();
            return file2;
        }

        private String S3() {
            String string2;
            String string3 = string2 = this.f0;
            if (string2 == null) {
                this.f0 = string3 = Script.s3(new File(Tools.q0(), "empty.txt"));
            }
            return string3;
        }

        @Override
        protected IoLib.File H3(String object, char c4) {
            boolean bl;
            object = this.g0;
            String string2 = Script.s3(this.Y.R3((String)object));
            if (((Script)object).m(string2, bl = c4 == 'r')) {
                return this.R3(c4);
            }
            try {
                object = super.H3(string2, c4);
                return object;
            }
            catch (IoLib.c c5) {
                return this.R3(c4);
            }
        }

        @Override
        protected boolean O3(File file, FileDescriptor fileDescriptor, boolean bl) {
            if (Script.s3(file).equals(this.S3())) {
                return true;
            }
            return super.O3(file, fileDescriptor, bl);
        }
    }

    public static class Logger {
        final OutputStream a;
        final FileInputStream b;
        final StringBuilder c;
        int d;

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        Logger() {
            block7: {
                block8: {
                    super();
                    var3_1 /* !! */  = null;
                    try {
                        var2_4 = Tools.p0();
                        var1_7 = new StringBuilder();
                        var1_7.append(System.currentTimeMillis());
                        var1_7.append(".tmp");
                        var4_3 = new File((File)var2_4, var1_7.toString());
                        var4_3.createNewFile();
                        var2_4 = new FileOutputStream(var4_3);
                        var1_7 = new BufferedOutputStream((OutputStream)var2_4);
                    }
                    catch (Throwable var2_6) {
                        var1_7 = null;
                        ** continue;
                    }
                    try {
                        var2_4 = new FileInputStream(var4_3);
                    }
                    catch (Throwable var2_5) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var4_3 = null;
                            var3_1 /* !! */  = var2_4;
                            var2_4 = var4_3;
                            break block8;
                            break;
                        }
                    }
                    try {
                        var4_3.delete();
                        break block7;
                    }
                    catch (Throwable var3_2) {}
                    {
                    }
                }
                e1.a((Throwable)var3_1 /* !! */ );
                var3_1 /* !! */  = new StringBuilder();
            }
            this.c = var3_1 /* !! */ ;
            this.a = var1_7;
            this.b = var2_4;
            this.d = 0;
        }

        public void a(String object) {
            StringBuilder stringBuilder = this.c;
            if (stringBuilder == null) {
                try {
                    object = ((String)object).getBytes();
                    this.a.write((byte[])object);
                    this.d += ((Object)object).length;
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
            } else {
                stringBuilder.append((String)object);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public String toString() {
            Throwable throwable2;
            block6: {
                int n3;
                CharSequence charSequence;
                int n4;
                block5: {
                    block4: {
                        n4 = this.d;
                        if (n4 < 0) {
                            return "must be called only once";
                        }
                        charSequence = this.c;
                        if (charSequence != null) {
                            return charSequence.toString();
                        }
                        try {
                            this.d = -1;
                            this.a.close();
                            n3 = 262144;
                            if (n4 <= 262144) break block4;
                            this.b.skip(n4 - 262144);
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    n3 = n4;
                }
                byte[] byArray = new byte[n3];
                int n5 = this.b.read(byArray);
                this.b.close();
                charSequence = new StringBuilder();
                charSequence.append("Log script size: read = ");
                charSequence.append(n5);
                charSequence.append("; used = ");
                charSequence.append(n3);
                charSequence.append("; full = ");
                charSequence.append(n4);
                e1.d(charSequence.toString());
                if (n5 <= 0) return "";
                return new String(byArray, 0, n5);
            }
            e1.a(throwable2);
            return "";
        }
    }

    public static final class OsExit
    extends luaj.d {
        final int j;

        public OsExit(int n3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("called os.exit(");
            stringBuilder.append(n3);
            stringBuilder.append(')');
            super(stringBuilder.toString());
            this.j = n3;
        }
    }

    final class OsLibSafe
    extends OsLib {
        final Script W;

        OsLibSafe(Script script) {
            this.W = script;
        }

        @Override
        protected void r3(String string2) {
            if (this.W.m(string2, false)) {
                return;
            }
            super.r3(string2);
        }

        @Override
        protected void s3(String string2, String string3) {
            if (!this.W.m(string2, false) && !this.W.m(string3, false)) {
                super.s3(string2, string3);
            }
        }
    }

    private static final class PostWriteWorker
    extends Thread {
        private final OutputStream a;
        private final byte[] b;
        private final int c;
        private final int d;
        private Throwable e;

        PostWriteWorker(OutputStream outputStream, byte[] byArray, int n3, int n4) {
            this.a = outputStream;
            this.b = byArray;
            this.c = n3;
            this.d = n4;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void a(boolean bl) {
            try {
                this.a.close();
            }
            catch (Throwable throwable) {}
            try {
                this.join(5000L);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }
            Throwable throwable = this.e;
            if (!bl && throwable != null) {
                if (throwable instanceof RuntimeException) {
                    throw (RuntimeException)throwable;
                }
                throw new IOException(throwable);
            }
        }

        @Override
        public void run() {
            try {
                this.a.write(this.b, this.c, this.d);
                this.a.flush();
            }
            catch (Throwable throwable) {
                this.e = throwable;
            }
        }
    }

    private static class SavedState {
        int a;

        private SavedState() {
        }
    }

    class ScriptPrintStream
    extends b.a {
        final boolean f;
        final Script g;

        public ScriptPrintStream(Script script, boolean bl) {
            this.g = script;
            this.f = bl;
        }

        @Override
        protected void b(String string2) {
            this.g.a3(this.f, string2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("script: ");
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            if (this.f) {
                e1.i(string2);
            } else {
                e1.d(string2);
            }
        }
    }

    class ScriptThread
    extends Thread {
        final Script a;

        public ScriptThread(Script script) {
            this.a = script;
            super("Script thread");
            android.ext.n0.g(this);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            MainService mainService;
            block39: {
                Throwable throwable2;
                block26: {
                    int n3;
                    Runnable runnable;
                    Object object;
                    Object object2;
                    DialogInterface.OnClickListener onClickListener;
                    block38: {
                        block35: {
                            block32: {
                                block33: {
                                    block37: {
                                        block36: {
                                            OutOfMemoryError outOfMemoryError2;
                                            block31: {
                                                block30: {
                                                    block28: {
                                                        block27: {
                                                            OsExit osExit2;
                                                            block29: {
                                                                luaj.d d42;
                                                                block34: {
                                                                    mainService = MainService.instance;
                                                                    try {
                                                                        mainService.n0(this.a);
                                                                        f1.a.booleanValue();
                                                                        this.a.N3();
                                                                    }
                                                                    catch (Throwable throwable2) {
                                                                        break block26;
                                                                    }
                                                                    try {
                                                                        this.a.M3();
                                                                        break block27;
                                                                    }
                                                                    catch (Throwable throwable3) {
                                                                        break block28;
                                                                    }
                                                                    catch (luaj.d d42) {
                                                                    }
                                                                    catch (OsExit osExit2) {
                                                                        break block29;
                                                                    }
                                                                    onClickListener = d42.getCause();
                                                                    if (!(onClickListener instanceof InterruptedException) || this.a.f0 == 0) break block34;
                                                                    object2 = new StringBuilder();
                                                                    ((StringBuilder)object2).append("Script thread interrupted: ");
                                                                    ((StringBuilder)object2).append(this.a.f0);
                                                                    e1.l(((StringBuilder)object2).toString(), (Throwable)onClickListener);
                                                                    object2 = this.a;
                                                                    onClickListener = new StringBuilder();
                                                                    onClickListener.append(b2.f(2131296932));
                                                                    onClickListener.append(" [");
                                                                    onClickListener.append(this.a.f0);
                                                                    onClickListener.append("]");
                                                                    ((Script)object2).Z2(onClickListener.toString());
                                                                    break block27;
                                                                }
                                                                onClickListener = d42;
                                                                if (d42 instanceof d.a) {
                                                                    android.ext.n0.h(Thread.currentThread(), d42, false);
                                                                    onClickListener = d42;
                                                                }
                                                                break block28;
                                                            }
                                                            object2 = new StringBuilder();
                                                            ((StringBuilder)object2).append("Script interrupted by self: ");
                                                            ((StringBuilder)object2).append(osExit2.getMessage());
                                                            e1.i(((StringBuilder)object2).toString());
                                                            object = this.a;
                                                            object2 = new StringBuilder();
                                                            ((StringBuilder)object2).append(b2.f(2131296931));
                                                            if (osExit2.j == 0) {
                                                                onClickListener = ".";
                                                            } else {
                                                                runnable = new StringBuilder();
                                                                ((StringBuilder)((Object)runnable)).append(": ");
                                                                ((StringBuilder)((Object)runnable)).append(osExit2.j);
                                                                onClickListener = ((StringBuilder)((Object)runnable)).toString();
                                                            }
                                                            ((StringBuilder)object2).append((String)onClickListener);
                                                            ((Script)object).Z2(((StringBuilder)object2).toString());
                                                        }
                                                        onClickListener = null;
                                                    }
                                                    if (onClickListener == null) break block35;
                                                    try {
                                                        e1.l("Script error", (Throwable)onClickListener);
                                                        object = e1.n((Throwable)onClickListener);
                                                        runnable = onClickListener.getMessage();
                                                        object2 = object;
                                                        if (runnable == null) break block30;
                                                        object2 = object;
                                                        if (((String)object).contains((CharSequence)((Object)runnable))) break block30;
                                                        object2 = new StringBuilder();
                                                        ((StringBuilder)object2).append((String)((Object)runnable));
                                                        ((StringBuilder)object2).append('\n');
                                                        ((StringBuilder)object2).append((String)object);
                                                        object2 = ((StringBuilder)object2).toString();
                                                    }
                                                    catch (OutOfMemoryError outOfMemoryError2) {
                                                        break block31;
                                                    }
                                                }
                                                if (onClickListener instanceof luaj.d) {
                                                    n3 = runnable != null && (((String)((Object)runnable)).contains("<!DOCTYPE") || ((String)((Object)runnable)).contains("<html")) ? 2131296937 : 0;
                                                    object = this.a;
                                                    runnable = ((Script)object).U;
                                                    int n4 = n3;
                                                    if (runnable instanceof File) {
                                                        n4 = n3;
                                                        if (((Script)object).z3((File)((Object)runnable))) {
                                                            n4 = 2131296936;
                                                        }
                                                    }
                                                    if (n4 != 0) {
                                                        this.a.Z2(Tools.L1(b2.f(2131296934), b2.f(n4)));
                                                    }
                                                }
                                                runnable = this.a.U;
                                                object = object2;
                                                if (!(runnable instanceof File)) break block36;
                                                onClickListener = LasmBase.c((Throwable)onClickListener, ((File)((Object)runnable)).getAbsolutePath(), true);
                                                object = object2;
                                                if (onClickListener == null) break block36;
                                                object = object2;
                                                if (onClickListener.length() <= 0) break block36;
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append((String)onClickListener);
                                                ((StringBuilder)object).append((String)object2);
                                                object = ((StringBuilder)object).toString();
                                                n3 = 4;
                                                break block37;
                                            }
                                            try {
                                                object2 = new StringBuilder();
                                                ((StringBuilder)object2).append(((Object)outOfMemoryError2).toString());
                                                ((StringBuilder)object2).append('\n');
                                                object = ((StringBuilder)object2).toString();
                                            }
                                            catch (OutOfMemoryError outOfMemoryError3) {
                                                n3 = 0;
                                                break block32;
                                            }
                                        }
                                        n3 = 0;
                                    }
                                    try {
                                        if (!f1.a.booleanValue()) break block33;
                                        this.a.Z2(b2.f(2131297022));
                                    }
                                    catch (OutOfMemoryError outOfMemoryError) {
                                        break block32;
                                    }
                                }
                                onClickListener = this.a;
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append(Tools.N1(2131296930));
                                ((StringBuilder)object2).append(": ");
                                ((StringBuilder)object2).append((String)object);
                                onClickListener.Z2(((StringBuilder)object2).toString());
                                break block38;
                            }
                            object2 = this.a;
                            object = new StringBuilder();
                            ((StringBuilder)object).append(Tools.N1(2131296933));
                            ((StringBuilder)object).append(": ");
                            ((StringBuilder)object).append(onClickListener.toString());
                            ((Script)object2).Z2(((StringBuilder)object).toString());
                            break block38;
                        }
                        n3 = 0;
                    }
                    onClickListener = this.a;
                    object2 = onClickListener.T;
                    if (((Globals)object2).Y != 0 || ((Globals)object2).a0 != 0L) {
                        onClickListener.Z2(Tools.L1(b2.f(2131296938), Tools.U(Tools.f0(), this.a.T.a0), this.a.T.Y));
                    }
                    this.a.L3();
                    if (this.a.U instanceof File) {
                        object2 = b2.f(2131296904);
                        onClickListener = new DialogInterface.OnClickListener(this){
                            final ScriptThread a;
                            {
                                this.a = scriptThread;
                            }

                            public void onClick(DialogInterface object, int n3) {
                                Object object2 = (File)this.a.a.U;
                                if (!Tools.a1(object2)) {
                                    return;
                                }
                                object = MainService.instance;
                                String string2 = ((File)object2).getAbsolutePath();
                                object2 = this.a.a;
                                ((MainService)object).x(string2, ((Script)object2).X, ((Script)object2).Y);
                            }
                        };
                    } else {
                        object2 = null;
                        onClickListener = null;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(Tools.N1(2131296929));
                    ((StringBuilder)object).append(":\n");
                    ((StringBuilder)object).append(this.a.W.toString().trim());
                    object = ((StringBuilder)object).toString();
                    runnable = new Runnable(this, (String)object, n3, (String)object2, onClickListener){
                        final String a;
                        final int b;
                        final String c;
                        final DialogInterface.OnClickListener d;
                        final ScriptThread e;
                        {
                            this.e = scriptThread;
                            this.a = string2;
                            this.b = n3;
                            this.c = string3;
                            this.d = onClickListener;
                        }

                        @Override
                        public void run() {
                            Tools.i(this.a, this.b, this.c, this.d);
                        }
                    };
                    mainService.d1(runnable);
                    break block39;
                }
                e1.l("Script run exception", throwable2);
            }
            mainService.m0(this.a);
            return;
            finally {
                this.a.k3();
            }
        }
    }

    final class addListItems
    extends ApiFunction {
        final ArrayList e0;
        LuaValue f0;
        final Script g0;

        addListItems(Script script) {
            this.g0 = script;
            this.e0 = new ArrayList();
            this.f0 = null;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        /*
         * Exception decompiling
         */
        @Override
        public Varargs b3(Varargs var1_1) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [5 : 45->77)] java.lang.Throwable
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        @Override
        String k3() {
            return "gg.addListItems(table items) -> true || string with error";
        }
    }

    static final class alert
    extends ApiFunction
    implements DialogInterface.OnDismissListener,
    DialogInterface.OnClickListener {
        private volatile int e0 = 0;

        alert() {
        }

        @Override
        protected int Y2() {
            return 4;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs b3(Varargs runnable) {
            String string2 = ((Varargs)((Object)runnable)).E(1);
            String string3 = ((Varargs)((Object)runnable)).Z(2, b2.f(2131296836));
            String string4 = ((Varargs)((Object)runnable)).Z(3, null);
            String string5 = ((Varargs)((Object)runnable)).Z(4, null);
            this.e0 = 0;
            synchronized (this) {
                runnable = new Runnable(this, string2, string3, string4, string5){
                    final String a;
                    final String b;
                    final String c;
                    final String d;
                    final alert e;
                    {
                        this.e = alert2;
                        this.a = string2;
                        this.b = string3;
                        this.c = string4;
                        this.d = string5;
                    }

                    @Override
                    public void run() {
                        AlertDialog.Builder builder = android.ext.f.b().setCustomTitle(Tools.h0(Tools.N1(2131296928))).setMessage((CharSequence)b2.g(this.a)).setPositiveButton((CharSequence)b2.g(this.b), (DialogInterface.OnClickListener)this.e);
                        String string2 = this.c;
                        if (string2 != null) {
                            builder.setNegativeButton((CharSequence)b2.g(string2), (DialogInterface.OnClickListener)this.e);
                        }
                        if ((string2 = this.d) != null) {
                            builder.setNeutralButton((CharSequence)b2.g(string2), (DialogInterface.OnClickListener)this.e);
                        }
                        builder = builder.create();
                        android.ext.f.k((AlertDialog)builder, this.e);
                        android.ext.f.m((AlertDialog)builder);
                        MainService.instance.y(true);
                    }
                };
                n2.i(runnable);
                Script.W3(this);
                return LuaValue.I2(this.e0);
            }
        }

        @Override
        String k3() {
            return "gg.alert(string text [, string positive = 'ok' [, string negative = nil [, string neutral = nil]]]) -> int: 0 = cancel, 1 = positive, 2 = negative, 3 = neutral";
        }

        public void onClick(DialogInterface dialogInterface, int n3) {
            this.e0 = -n3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onDismiss(DialogInterface dialogInterface) {
            synchronized (this) {
                this.notify();
            }
            MainService.instance.y(false);
        }
    }

    final class allocatePage
    extends BusyApiFunction {
        final Script f0;

        allocatePage(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected int Y2() {
            return 2;
        }

        @Override
        protected Varargs a3() {
            long l3 = s0;
            if (-1024L < l3 && l3 <= 0L) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(b2.f(2131296269));
                stringBuilder.append(' ');
                stringBuilder.append(-l3);
                return LuaValue.K2(stringBuilder.toString());
            }
            return LuaValue.I2(s0);
        }

        @Override
        public Varargs c3(Varargs varargs) {
            int n3 = varargs.Y(1, 6);
            long l3 = varargs.a0(2, 0L);
            s0 = 0L;
            MainService.instance.i.f(this.f0.t3(), l3, n3);
            return null;
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 != 1) {
                if (n3 == 2 && luaValue.j1()) {
                    return ApiFunction.h3(writer, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, this.f0.g0.g, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.allocatePage([int mode = gg.PROT_READ | gg.PROT_EXEC [, long address = 0]) -> long || string with error";
        }
    }

    final class bytes
    extends ApiFunction {
        final Script e0;

        bytes(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 2;
        }

        @Override
        public Varargs b3(Varargs object) {
            UnsupportedEncodingException unsupportedEncodingException2;
            Object object2 = ((Varargs)object).E(1);
            object = ((Varargs)object).Z(2, "UTF-8");
            object = ((String)object2).getBytes((String)object);
            object2 = new LuaTable();
            int n3 = ((Object)object).length;
            ((LuaTable)object2).R1(n3);
            int n4 = 0;
            while (n4 < n3) {
                int n5 = n4 + 1;
                try {
                    ((LuaTable)object2).Y1(n5, LuaValue.I2(object[n4] & 0xFF));
                    n4 = n5;
                }
                catch (UnsupportedEncodingException unsupportedEncodingException2) {
                }
            }
            return object2;
            throw new luaj.d(unsupportedEncodingException2);
        }

        @Override
        String k3() {
            return "gg.bytes(string text [, string encoding = 'UTF-8']) -> table";
        }
    }

    static final class choice
    extends ApiFunction
    implements DialogInterface.OnDismissListener,
    DialogInterface.OnClickListener {
        private volatile int e0 = 0;

        choice() {
        }

        @Override
        protected int Y2() {
            return 3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs b3(Varargs object) {
            Runnable runnable = ((Varargs)object).I(1);
            LuaValue luaValue = ((Varargs)object).v(2);
            ArrayList<Object> arrayList = new ArrayList<Object>();
            CharSequence[] charSequenceArray = new ArrayList();
            LuaTable.i i3 = ((LuaTable)((Object)runnable)).s3();
            int n3 = 0;
            int n4 = -1;
            while (i3.c()) {
                runnable = i3.b();
                LuaValue luaValue2 = i3.d();
                if (((LuaValue)((Object)runnable)).P0(luaValue)) {
                    n4 = n3;
                }
                charSequenceArray.add(b2.g(luaValue2.B0()));
                arrayList.add(runnable);
                ++n3;
            }
            if (((String)(object = b2.g(((Varargs)object).Z(3, "")))).length() > 0) {
                runnable = new StringBuilder();
                ((StringBuilder)((Object)runnable)).append('\n');
                ((StringBuilder)((Object)runnable)).append((String)object);
                object = ((StringBuilder)((Object)runnable)).toString();
            } else {
                object = null;
            }
            charSequenceArray = charSequenceArray.toArray(new CharSequence[charSequenceArray.size()]);
            this.e0 = -1;
            synchronized (this) {
                runnable = new Runnable(this, (String)object, luaValue, charSequenceArray, n4){
                    final String a;
                    final LuaValue b;
                    final CharSequence[] c;
                    final int d;
                    final choice e;
                    {
                        this.e = choice2;
                        this.a = string2;
                        this.b = luaValue;
                        this.c = charSequenceArray;
                        this.d = n3;
                    }

                    @Override
                    public void run() {
                        AlertDialog.Builder builder = android.ext.f.b().setCustomTitle(Tools.i0(Tools.N1(2131296928), this.a)).setNegativeButton((CharSequence)b2.f(2131296311), (DialogInterface.OnClickListener)this.e);
                        if (this.b.l1()) {
                            builder.setItems(this.c, (DialogInterface.OnClickListener)this.e);
                        } else {
                            builder.setSingleChoiceItems(this.c, this.d, (DialogInterface.OnClickListener)this.e);
                        }
                        builder = builder.create();
                        android.ext.f.k((AlertDialog)builder, this.e);
                        android.ext.f.m((AlertDialog)builder);
                        MainService.instance.y(true);
                    }
                };
                n2.i(runnable);
                Script.W3(this);
            }
            if (this.e0 >= 0) return (Varargs)arrayList.get(this.e0);
            return LuaValue.c;
        }

        @Override
        String k3() {
            return "gg.choice(table items [, string selected = nil [, string message = nil]]) -> string || nil";
        }

        public void onClick(DialogInterface dialogInterface, int n3) {
            this.e0 = n3;
            Tools.D(dialogInterface);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onDismiss(DialogInterface dialogInterface) {
            synchronized (this) {
                this.notify();
            }
            MainService.instance.y(false);
        }
    }

    final class clearList
    extends ApiFunction {
        final Script e0;

        clearList(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            try {
                MainService.instance.t0.c();
                varargs = LuaValue.d;
                return varargs;
            }
            catch (Throwable throwable) {
                e1.l("Failed clear list", throwable);
                return LuaValue.K2(Script.V3(throwable));
            }
        }

        @Override
        String k3() {
            return "gg.clearList() -> true || string with error";
        }
    }

    final class clearResults
    extends ApiFunction {
        final Script e0;

        clearResults(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            varargs = this.e0;
            ((Script)varargs).d0 = Script.J3(((Script)varargs).d0);
            MainService.instance.n(this.e0.t3());
            return LuaValue.c;
        }

        @Override
        String k3() {
            return "gg.clearResults() -> nil";
        }
    }

    final class copyMemory
    extends BusyApiFunction {
        final Script f0;

        copyMemory(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected int Y2() {
            return 3;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            MainService.instance.i.p(this.f0.t3(), varargs.F(1), varargs.F(2), varargs.D(3));
            return null;
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if ((n3 == 1 || n3 == 2) && luaValue.j1()) {
                return ApiFunction.h3(writer, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.copyMemory(long from, long to, int bytes) -> true || string with error";
        }
    }

    static final class copyText
    extends ApiFunction {
        copyText() {
        }

        @Override
        protected int Y2() {
            return 2;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            String string2;
            String string3 = string2 = varargs.E(1);
            if (varargs.V(2, true)) {
                string3 = Script.D3(string2);
            }
            Tools.z(b2.g(string3));
            return LuaValue.c;
        }

        @Override
        String k3() {
            return "gg.copyText(string text [, bool fixLocale = true]) -> nil";
        }
    }

    final class disasm
    extends ApiFunction {
        final Script e0;

        disasm(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 3;
        }

        @Override
        public Varargs b3(Varargs object) {
            long l3 = ((Varargs)object).F(2);
            int n3 = ((Varargs)object).D(3);
            int n4 = ((Varargs)object).D(1);
            if (n4 != 4) {
                if (n4 != 5) {
                    if (n4 != 6) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unknown type: ");
                        stringBuilder.append(((Varargs)object).D(1));
                        return LuaValue.l0(1, "gg.disasm", stringBuilder.toString());
                    }
                    object = new StringBuilder();
                    android.ext.m.g(android.ext.m.d(), l3, n3, (StringBuilder)object);
                    return LuaString.K2(((StringBuilder)object).toString());
                }
                return LuaString.K2(android.ext.n.q(new n(), l3, n3));
            }
            return LuaString.K2(android.ext.n.o(new n(), l3, n3));
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 != 1) {
                if ((n3 == 2 || n3 == 3) && luaValue.j1()) {
                    return ApiFunction.h3(writer, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, this.e0.g0.j, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.disasm(int type, long address, int opcode) -> string";
        }
    }

    final class dumpMemory
    extends BusyApiFunction {
        final Script f0;

        dumpMemory(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected int Y2() {
            return 4;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            MainService mainService = MainService.instance;
            Object object = mainService.v0;
            object = object == null ? "unknown" : ((z1.d)object).c;
            if (mainService.a1()) {
                mainService.i.w(this.f0.t3(), varargs.F(1), varargs.F(2), varargs.Y(4, 0), varargs.E(3), (String)object);
                return null;
            }
            return LuaValue.K2(b2.f(2131296305));
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 != 1 && n3 != 2) {
                if (n3 == 4 && luaValue.h1()) {
                    return ApiFunction.g3(writer, this.f0.g0.i, luaValue);
                }
            } else if (luaValue.j1()) {
                return ApiFunction.h3(writer, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.dumpMemory(long from, long to, string dir [, int flags = nil]) -> true || string with error";
        }
    }

    final class editAll
    extends ApiFunction {
        final Script e0;

        editAll(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 2;
        }

        /*
         * Exception decompiling
         */
        @Override
        public Varargs b3(Varargs var1_1) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 64->87)] java.lang.NumberFormatException
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 == 2 && luaValue.h1()) {
                return ApiFunction.g3(writer, this.e0.g0.b, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.editAll(string value, int type) -> count of changed || string with error";
        }
    }

    static final class exit
    extends VarArgFunction {
        exit() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            throw new OsExit(varargs.Y(1, 0));
        }
    }

    static final class format
    extends VarArgFunction {
        final LuaValue T;

        public format(LuaValue luaValue) {
            this.T = luaValue;
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            String string2 = b2.g(varargs.E(1)).replace("%,d", "%d");
            return this.T.invoke(LuaValue.N2(LuaValue.K2(string2), varargs.e0(2)));
        }
    }

    static final class getActiveTab
    extends ApiFunction {
        getActiveTab() {
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            return LuaValue.I2(MainService.instance.H());
        }

        @Override
        String k3() {
            return "gg.getActiveTab() -> int";
        }
    }

    final class getFile
    extends DebugFunction {
        final Script f0;

        getFile(Script script) {
            this.f0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs object) {
            Object object2 = this.e0;
            if (object2 == null) {
                object = "?";
            } else {
                object = ((LuaClosure)object2).U;
                if (object == null) {
                    object = ((LuaClosure)object2).R;
                    object = object != null ? ((object = ((luaj.h)object).g) != null ? ((LuaString)object).g0() : "??") : "???";
                }
            }
            object2 = object;
            if (((String)object).startsWith("@")) {
                object2 = ((String)object).substring(1);
            }
            return LuaValue.K2((String)object2);
        }

        @Override
        String k3() {
            return "gg.getFile() -> string";
        }
    }

    final class getLine
    extends DebugFunction {
        final Script f0;

        getLine(Script script) {
            this.f0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            int n3;
            varargs = this.e0;
            Object object = n3 = -1;
            if (varargs != null) {
                Object object2 = ((LuaClosure)varargs).R;
                object = n3;
                if (object2 != null) {
                    object = n3;
                    if (((luaj.h)object2).d != null) {
                        object = n3;
                        if (((LuaClosure)varargs).W >= 0) {
                            int n4 = this.e0.W;
                            varargs = this.e0;
                            object2 = ((LuaClosure)varargs).R.d;
                            object = n3;
                            if (n4 < ((Object)object2).length) {
                                object = object2[((LuaClosure)varargs).W];
                            }
                        }
                    }
                }
            }
            return LuaValue.I2(object);
        }

        @Override
        String k3() {
            return "gg.getLine() -> int";
        }
    }

    final class getListItems
    extends ApiFunction {
        final Script e0;

        getListItems(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs b3(Varargs object) {
            Throwable throwable2;
            block9: {
                Runnable runnable;
                Object object2;
                try {
                    object = new ArrayList(MainService.instance.t0.getCount());
                    object2 = new Object();
                    synchronized (object2) {
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                catch (luaj.d d4) {
                    throw d4;
                }
                {
                    runnable = new Runnable(this, (ArrayList)object, object2){
                        final ArrayList a;
                        final Object b;
                        final getListItems c;
                        {
                            this.c = getListItems2;
                            this.a = arrayList;
                            this.b = object;
                        }

                        /*
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         */
                        @Override
                        public void run() {
                            Object object = MainService.instance.t0;
                            try {
                                int n3 = ((SavedListAdapter)object).getCount();
                                for (int i3 = 0; i3 < n3; ++i3) {
                                    h2 h22 = ((SavedListAdapter)object).d(i3);
                                    if (h22 == null) continue;
                                    this.a.add(h22);
                                }
                            }
                            catch (Throwable throwable) {
                                e1.l("Failed get list items", throwable);
                            }
                            object = this.b;
                            synchronized (object) {
                                this.b.notifyAll();
                                return;
                            }
                        }
                    };
                    n2.i(runnable);
                    Script.W3(object2);
                }
                {
                    object2 = new LuaTable();
                    ((LuaTable)object2).R1(((ArrayList)object).size());
                    runnable = ((ArrayList)object).iterator();
                    int n3 = 1;
                    while (runnable.hasNext()) {
                        object = (h2)runnable.next();
                        if (object == null) continue;
                        ((LuaTable)object2).Y1(n3, Script.o3((h2)object));
                        ++n3;
                    }
                    return object2;
                }
            }
            e1.l("Failed get list items", throwable2);
            return LuaValue.K2(Script.V3(throwable2));
        }

        @Override
        String k3() {
            return "gg.getListItems() -> table || string with error";
        }
    }

    final class getLocale
    extends ApiFunction {
        final Script e0;

        getLocale(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            return LuaValue.K2(b2.f(2131296732).replace("~", ""));
        }

        @Override
        String k3() {
            return "gg.getLocale() -> string";
        }
    }

    static final class getRanges
    extends ApiFunction {
        getRanges() {
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            return LuaValue.I2(Config.i);
        }

        @Override
        String k3() {
            return "gg.getRanges() -> int";
        }
    }

    final class getRangesList
    extends ApiFunction {
        final Script e0;

        getRangesList(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs b3(Varargs object) {
            Object object2;
            int n3;
            block5: {
                n3 = 1;
                object = object2 = ((Varargs)object).Z(1, "");
                if (((String)object2).length() > 0) {
                    object = Tools.k1((String)object2);
                }
                object2 = new LuaTable();
                if (((String)object).length() > 0) {
                    try {
                        object = Pattern.compile((String)object);
                        break block5;
                    }
                    catch (Throwable throwable) {
                        e1.a(throwable);
                    }
                }
                object = null;
            }
            LuaString luaString = LuaString.K2("state");
            LuaString luaString2 = LuaString.K2("start");
            LuaString luaString3 = LuaString.K2("end");
            LuaString luaString4 = LuaString.K2("type");
            LuaString luaString5 = LuaString.K2("name");
            LuaString luaString6 = LuaString.K2("internalName");
            for (RegionList.b b4 : RegionList.getList()) {
                String string2 = b4.a();
                if (object != null && !((Pattern)object).matcher(string2).find()) continue;
                LuaTable luaTable = new LuaTable(0, 6);
                luaTable.d2(luaString, LuaValue.K2(b4.e().toString()));
                luaTable.d2(luaString2, LuaValue.I2(b4.b));
                luaTable.d2(luaString3, LuaValue.I2(b4.c));
                luaTable.d2(luaString4, LuaValue.K2(b4.f()));
                luaTable.d2(luaString5, LuaValue.K2(b4.b()));
                luaTable.d2(luaString6, LuaValue.K2(string2));
                ((LuaTable)object2).e2(n3, luaTable);
                ++n3;
            }
            return object2;
        }

        @Override
        String k3() {
            return "gg.getRangesList([string filter = '']) -> table";
        }
    }

    final class getResults
    extends BusyApiFunction {
        private byte f0;
        final Script g0;

        getResults(Script script) {
            this.g0 = script;
            super(script);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private ArrayList l3() {
            ArrayList arrayList = new ArrayList(MainService.instance.s0.i());
            Object object = new Object();
            synchronized (object) {
                Runnable runnable = new Runnable(this, arrayList, object){
                    final ArrayList a;
                    final Object b;
                    final getResults c;
                    {
                        this.c = getResults2;
                        this.a = arrayList;
                        this.b = object;
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    @Override
                    public void run() {
                        Object object = MainService.instance.s0;
                        int n3 = 0;
                        while (true) {
                            if (n3 >= ((a)object).i()) {
                                object = this.b;
                                synchronized (object) {
                                    this.b.notifyAll();
                                    return;
                                }
                            }
                            try {
                                c c4 = ((a)object).f(n3, null);
                                if (c4 != null) {
                                    this.a.add(c4);
                                }
                            }
                            catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
                            ++n3;
                        }
                    }
                };
                n2.i(runnable);
                Script.W3(object);
                return arrayList;
            }
        }

        @Override
        protected int Y2() {
            return 9;
        }

        @Override
        protected Varargs a3() {
            Object object;
            byte by;
            Object object2 = this.g0;
            int n3 = 1;
            ((Script)object2).c0 = true;
            object2 = this.g0;
            ((Script)object2).d0 = by = this.f0;
            object2 = object = Script.S3(by);
            if (object == null) {
                object2 = this.g0;
                if (!((Script)object2).e0) {
                    ((Script)object2).e0 = true;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("getResults: no reply capture for seq ");
                    ((StringBuilder)object2).append(this.f0);
                    ((StringBuilder)object2).append("; using the shared result list");
                    e1.p(((StringBuilder)object2).toString());
                }
                object2 = this.l3();
            }
            object = new LuaTable();
            ((LuaTable)object).R1(((ArrayList)object2).size());
            object2 = ((ArrayList)object2).iterator();
            while (object2.hasNext()) {
                c c4 = (c)object2.next();
                if (c4 == null) continue;
                ((LuaTable)object).Y1(n3, Script.n3(null, c4));
                ++n3;
            }
            return object;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public Varargs c3(Varargs object) {
            int n3 = ((Varargs)object).D(1);
            int n4 = ((Varargs)object).Y(2, 0);
            try {
                byte by;
                object = android.ext.b0.f(((Varargs)object).a0(3, 0L), ((Varargs)object).a0(4, -1L), ((Varargs)object).Z(5, null), ((Varargs)object).Z(6, null), ((Varargs)object).Y(7, 0), ((Varargs)object).Z(8, null), ((Varargs)object).Y(9, 0));
                this.f0 = by = this.g0.t3();
                Script.j3(by);
                Script script = this.g0;
                script.d0 = Script.J3(script.d0);
                android.ext.b0.h(this.f0, n3, n4, (b0.a)object);
                return null;
            }
            catch (luaj.d d4) {}
            finally {
                Throwable throwable;
                return LuaValue.K2(Script.V3(throwable));
            }
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 != 7) {
                if (n3 == 9 && luaValue.h1()) {
                    return ApiFunction.g3(writer, this.g0.g0.h, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, this.g0.g0.b, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.getResults(int maxCount [, int skip = 0 [, long addressMin = nil [, long addressMax = nil [, string valueMin = nil [, string valueMax = nil [, int type = nil [, string fractional = nil [, int pointer = nil]]]]]]]]) -> table || string with error";
        }
    }

    static final class getResultsCount
    extends ApiFunction {
        getResultsCount() {
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            return LuaValue.I2(MainService.instance.p0);
        }

        @Override
        String k3() {
            return "gg.getResultsCount() -> long";
        }
    }

    final class getSelectedElements
    extends ApiFunction {
        final Script e0;

        getSelectedElements(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs c3(Varargs varargs) {
            n1 n12 = MainService.instance.N;
            boolean[] blArray = n12.f();
            varargs = new LuaTable();
            int n3 = 1;
            int n4 = 0;
            while (n4 < blArray.length) {
                boolean bl = blArray[n4];
                if (bl) {
                    try {
                        ((LuaTable)varargs).Y1(n3, LuaLong.I2(n12.e(n4)));
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
                    ++n3;
                }
                ++n4;
            }
            return varargs;
        }

        @Override
        String k3() {
            return "gg.getSelectedElements() -> table || string with error";
        }
    }

    final class getSelectedListItems
    extends ApiFunction {
        final Script e0;

        getSelectedListItems(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs c3(Varargs varargs) {
            d.e e4 = MainService.instance.t0.f();
            varargs = new LuaTable();
            int n3 = 1;
            int n4 = 0;
            while (true) {
                block6: {
                    block7: {
                        h2 h22;
                        if (n4 >= e4.l()) {
                            return varargs;
                        }
                        try {
                            if (!e4.a(n4) || (h22 = (h2)e4.n(n4)) == null) break block6;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
                        try {
                            ((LuaTable)varargs).Y1(n3, Script.o3(h22));
                            break block7;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
                        break block6;
                    }
                    ++n3;
                }
                ++n4;
            }
        }

        @Override
        String k3() {
            return "gg.getSelectedListItems() -> table || string with error";
        }
    }

    final class getSelectedResults
    extends ApiFunction {
        final Script e0;

        getSelectedResults(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs c3(Varargs varargs) {
            a a4 = MainService.instance.s0;
            varargs = new LuaTable();
            int n3 = 1;
            int n4 = 0;
            while (true) {
                block6: {
                    block7: {
                        c c4;
                        if (n4 >= a4.i()) {
                            return varargs;
                        }
                        try {
                            if (!a4.c(n4) || (c4 = a4.f(n4, null)) == null) break block6;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
                        try {
                            ((LuaTable)varargs).Y1(n3, Script.n3(null, c4));
                            break block7;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
                        break block6;
                    }
                    ++n3;
                }
                ++n4;
            }
        }

        @Override
        String k3() {
            return "gg.getSelectedResults() -> table || string with error";
        }
    }

    static final class getSpeed
    extends ApiFunction {
        getSpeed() {
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            return LuaValue.J2(MainService.instance.G());
        }

        @Override
        String k3() {
            return "gg.getSpeed() -> double";
        }
    }

    static final class getTargetInfo
    extends ApiFunction {
        getTargetInfo() {
        }

        @Override
        protected int Y2() {
            return 0;
        }

        /*
         * Exception decompiling
         */
        @Override
        public Varargs b3(Varargs var1_1) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [11 : 185->190)] android.content.pm.PackageManager$NameNotFoundException
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        @Override
        String k3() {
            return "gg.getTargetInfo() -> table || nil";
        }
    }

    static final class getTargetPackage
    extends ApiFunction {
        getTargetPackage() {
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs object) {
            object = MainService.instance.v0;
            object = object != null ? ((z1.d)object).c : null;
            object = object == null ? LuaValue.c : LuaValue.K2((String)object);
            return object;
        }

        @Override
        String k3() {
            return "gg.getTargetPackage() -> string || nil";
        }
    }

    final class getValues
    extends BusyApiFunction {
        final ArrayList f0;
        long[] g0;
        int[] h0;
        int i0;
        final Script j0;

        getValues(Script script) {
            this.j0 = script;
            super(script);
            this.f0 = new ArrayList();
            this.g0 = null;
            this.h0 = null;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        protected Varargs a3() {
            ArrayList arrayList = this.f0;
            LuaTable luaTable = new LuaTable();
            luaTable.R1(this.i0);
            Object object = p0;
            int n3 = 0;
            if (object != null) {
                ++q0;
                p0 = null;
                Iterator iterator = ((ArrayList)object).iterator();
                while (iterator.hasNext()) {
                    object = (c)iterator.next();
                    luaTable.d2((LuaValue)arrayList.get(n3), Script.n3(null, (c)object));
                    ++n3;
                }
            } else {
                Thread thread = Thread.currentThread();
                object = new StringBuilder();
                ((StringBuilder)object).append("memList is null ");
                ((StringBuilder)object).append(q0 += 100000);
                android.ext.n0.h(thread, new RuntimeException(((StringBuilder)object).toString()), false);
            }
            this.h0 = null;
            this.g0 = null;
            arrayList.clear();
            arrayList.trimToSize();
            return luaTable;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            LuaTable luaTable = varargs.I(1);
            ArrayList arrayList = this.f0;
            this.h0 = null;
            this.g0 = null;
            int n3 = luaTable.d3() + luaTable.e3();
            long[] lArray = new long[n3];
            int[] nArray = new int[n3];
            arrayList.clear();
            arrayList.ensureCapacity(n3);
            Object object = MainService.instance.v0;
            boolean bl = object != null ? ((z1.d)object).n : false;
            c c4 = new c(0L, 0L, 4);
            object = luaTable.s3();
            int n4 = 0;
            n3 = 0;
            int n5 = 0;
            while (((LuaTable.i)object).c()) {
                int n6 = n4;
                if (((LuaTable.i)object).a() != 0) {
                    n6 = n4 + 1;
                }
                LuaValue luaValue = ((LuaTable.i)object).b();
                Script.T3(c4, ((LuaTable.i)object).d().H0(), (byte)2, bl);
                if (n3 == lArray.length) {
                    int n7;
                    n4 = n5 + 1;
                    n5 = n7 = n3 >> 1;
                    if (n7 < 10) {
                        n5 = 10;
                    }
                    Thread thread = Thread.currentThread();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("OF ");
                    stringBuilder.append(n4);
                    stringBuilder.append("; ");
                    stringBuilder.append(lArray.length);
                    stringBuilder.append("; ");
                    stringBuilder.append(luaTable.d3());
                    stringBuilder.append(" + ");
                    stringBuilder.append(luaTable.e3());
                    stringBuilder.append("; ");
                    stringBuilder.append(luaValue.h1());
                    stringBuilder.append(": ");
                    stringBuilder.append(luaValue);
                    stringBuilder.append("; ");
                    stringBuilder.append(luaTable.V0());
                    stringBuilder.append("; ");
                    stringBuilder.append(luaTable);
                    android.ext.n0.h(thread, new RuntimeException(stringBuilder.toString()), false);
                    lArray = Arrays.copyOf(lArray, n5 += n3);
                    nArray = Arrays.copyOf(nArray, n5);
                    n5 = n4;
                }
                lArray[n3] = c4.a;
                nArray[n3] = c4.c & 0x7F;
                arrayList.add(luaValue);
                ++n3;
                n4 = n6;
            }
            this.i0 = n4;
            if (nArray.length != n3) {
                nArray = Arrays.copyOf(nArray, n3);
            }
            this.h0 = nArray;
            if (lArray.length != n3) {
                lArray = Arrays.copyOf(lArray, n3);
            }
            this.g0 = lArray;
            if (n3 == 0) {
                this.h0 = null;
                this.g0 = null;
                return new LuaTable();
            }
            return super.b3(varargs);
        }

        @Override
        public Varargs c3(Varargs varargs) {
            MainService.instance.i.R(this.j0.t3(), this.h0, this.g0);
            this.h0 = null;
            this.g0 = null;
            return null;
        }

        @Override
        String k3() {
            return "gg.getValues(table values) -> table || string with error";
        }
    }

    final class getValuesRange
    extends ApiFunction {
        final Script e0;

        getValuesRange(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            Object object = varargs.I(1);
            LuaTable luaTable = new LuaTable();
            luaTable.w3(((LuaTable)object).d3(), luaTable.f3());
            varargs = t0[0];
            object = ((LuaTable)object).s3();
            while (((LuaTable.i)object).c()) {
                LuaValue luaValue = ((LuaTable.i)object).d();
                long l3 = !luaValue.o1() ? luaValue.C0() : Script.i3(luaValue.H0(), (LuaValue)varargs);
                int n3 = ((LuaTable.i)object).a();
                if (n3 == 0) {
                    luaTable.d2(((LuaTable.i)object).b(), LuaValue.K2(RegionList.a(l3).toString()));
                    continue;
                }
                luaTable.Y1(n3, LuaValue.K2(RegionList.a(l3).toString()));
            }
            return luaTable;
        }

        @Override
        String k3() {
            return "gg.getValuesRange(table values) -> table || string with error";
        }
    }

    static final class gotoAddress
    extends ApiFunction {
        gotoAddress() {
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            MainService.instance.J(varargs.F(1));
            return LuaValue.c;
        }

        @Override
        String k3() {
            return "gg.gotoAddress(long address) -> nil";
        }
    }

    final class hideUiButton
    extends ApiFunction {
        final Script e0;

        hideUiButton(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            MainService.instance.R0(false);
            return LuaValue.c;
        }

        @Override
        String k3() {
            return "gg.hideUiButton() -> nil";
        }
    }

    final class internal1
    extends BusyApiFunction {
        final Script f0;

        internal1(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected int Y2() {
            return 4;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            NumberFormatException numberFormatException2;
            block4: {
                byte[] byArray;
                int n3;
                block3: {
                    this.f0.y3();
                    n3 = 1;
                    try {
                        LuaString luaString = varargs.H(1);
                        int n4 = luaString.R;
                        byArray = new byte[n4];
                        luaString.U2(0, byArray, 0, n4);
                        if (varargs.a0(4, 1L) != 2L) break block3;
                        n3 = 2;
                    }
                    catch (NumberFormatException numberFormatException2) {}
                }
                varargs = i2.m(this.f0.t3(), n3, byArray, varargs.a0(2, 0L), varargs.a0(3, -1L), false, varargs.a0(4, 0L)) ? LuaValue.d : null;
                break block4;
                return varargs;
            }
            return LuaValue.K2(Script.V3(numberFormatException2));
        }

        @Override
        String k3() {
            return "do not use";
        }
    }

    final class internal2
    extends ApiFunction {
        final Script e0;

        internal2(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 2;
        }

        @Override
        public Varargs b3(Varargs object) {
            LuaClosure luaClosure = ((Varargs)object).A(1);
            String string2 = ((Varargs)object).E(2);
            object = LuaValue.d;
            PrintStream printStream = luaj.g.b;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(string2);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 65536);
                Appendable appendable = new PrintStream(bufferedOutputStream);
                luaj.g.b = appendable;
                luaj.g.A(luaClosure.R);
                luaj.g.b.close();
                appendable = new StringBuilder();
                ((StringBuilder)appendable).append(string2);
                ((StringBuilder)appendable).append(".tail");
                luaj.g.M(luaClosure, ((StringBuilder)appendable).toString());
            }
            catch (Throwable throwable) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed dump ");
                ((StringBuilder)object).append(luaClosure);
                ((StringBuilder)object).append(" into '");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append('\'');
                e1.l(((StringBuilder)object).toString(), throwable);
                object = LuaValue.K2(Script.V3(throwable));
            }
            luaj.g.b = printStream;
            return object;
        }

        @Override
        String k3() {
            return "do not use";
        }
    }

    static final class isClickedUiButton
    extends ApiFunction {
        isClickedUiButton() {
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            MainService mainService = MainService.instance;
            varargs = LuaValue.c;
            if (mainService.d != null) {
                if (mainService.e) {
                    mainService.e = false;
                    varargs = LuaValue.d;
                } else {
                    varargs = LuaValue.e;
                }
            }
            return varargs;
        }

        @Override
        String k3() {
            return "gg.isClickedUiButton() -> bool || nil";
        }
    }

    static final class isPackageInstalled
    extends ApiFunction {
        isPackageInstalled() {
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            return LuaValue.H2(Tools.e1(varargs.E(1)));
        }

        @Override
        String k3() {
            return "gg.isPackageInstalled(string pkg) -> bool";
        }
    }

    static final class isProcessPaused
    extends ApiFunction {
        isProcessPaused() {
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            return LuaValue.H2(MainService.instance.R);
        }

        @Override
        String k3() {
            return "gg.isProcessPaused() -> bool";
        }
    }

    static final class isVisible
    extends ApiFunction {
        isVisible() {
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            boolean bl = MainService.instance.n != null;
            return LuaValue.H2(bl);
        }

        @Override
        String k3() {
            return "gg.isVisible() -> bool";
        }
    }

    final class loadList
    extends ApiFunction {
        final Script e0;

        loadList(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs c3(Varargs object) {
            block9: {
                Object object2;
                block10: {
                    Throwable throwable2;
                    int n3;
                    block5: {
                        block8: {
                            block7: {
                                block6: {
                                    object2 = new File(((Varargs)object).E(1));
                                    if (((File)object2).exists()) break block6;
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("File '");
                                    ((StringBuilder)object).append(((File)object2).getAbsolutePath());
                                    object2 = "' not found";
                                    break block7;
                                }
                                if (((File)object2).isFile()) break block8;
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Path '");
                                ((StringBuilder)object).append(((File)object2).getAbsolutePath());
                                object2 = "' is not a file";
                            }
                            ((StringBuilder)object).append((String)object2);
                            break block9;
                        }
                        if (!((File)object2).canRead() || this.e0.m(Script.s3((File)object2), true)) break block10;
                        n3 = ((Varargs)object).Y(2, 0);
                        try {
                            object = luaj.lib.d.e((File)object2, this.e0);
                            if (object != null) break block5;
                            object = new StringBuilder();
                            ((StringBuilder)object).append("File '");
                            ((StringBuilder)object).append(((File)object2).getAbsolutePath());
                            ((StringBuilder)object).append("' can not be read");
                            return LuaValue.K2(((StringBuilder)object).toString());
                        }
                        catch (Throwable throwable2) {}
                    }
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object);
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        c1.c(bufferedReader, MainService.instance.v0.f, n3 | 4);
                    }
                    catch (Throwable throwable3) {
                        ((InputStream)object).close();
                        throw throwable3;
                    }
                    ((InputStream)object).close();
                    return LuaValue.d;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Failed load list: ");
                    ((StringBuilder)object).append(((File)object2).getAbsolutePath());
                    ((StringBuilder)object).append("; ");
                    ((StringBuilder)object).append(n3);
                    e1.l(((StringBuilder)object).toString(), throwable2);
                    object = Script.V3(throwable2);
                    return LuaValue.K2((String)object);
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("File '");
                ((StringBuilder)object).append(((File)object2).getAbsolutePath());
                ((StringBuilder)object).append("' can not be read");
            }
            object = ((StringBuilder)object).toString();
            return LuaValue.K2((String)object);
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 == 2 && luaValue.h1()) {
                return ApiFunction.g3(writer, this.e0.g0.e, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.loadList(string file [, int flags = 0]) -> true || string with error";
        }
    }

    final class loadResults
    extends BusyApiFunction {
        ArrayList f0;
        final Script g0;

        loadResults(Script script) {
            this.g0 = script;
            super(script);
            this.f0 = null;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            this.g0.y3();
            ArrayList arrayList = Script.r3(varargs);
            MainService.instance.n(this.g0.t3());
            if (arrayList.size() == 0) {
                return LuaValue.d;
            }
            this.f0 = arrayList;
            return super.b3(varargs);
        }

        @Override
        public Varargs c3(Varargs varargs) {
            try {
                MainService.instance.i.f0(this.g0.t3(), this.f0);
                return null;
            }
            finally {
                this.f0 = null;
            }
        }

        @Override
        String k3() {
            return "gg.loadResults(table results) -> true || string with error";
        }
    }

    final class makeRequest
    extends ApiFunction
    implements DialogInterface.OnDismissListener,
    DialogInterface.OnClickListener {
        private volatile byte e0;
        final Script f0;

        makeRequest(Script script) {
            this.f0 = script;
            this.e0 = 0;
        }

        private void l3(String string2, LuaTable object, HttpURLConnection httpURLConnection) {
            object = ((LuaTable)object).s3();
            while (((LuaTable.i)object).c()) {
                httpURLConnection.addRequestProperty(string2, ((LuaTable.i)object).d().B0());
            }
        }

        private long m3(HttpURLConnection object) {
            if ((object = ((URLConnection)object).getHeaderField("Content-Length")) == null) {
                return -1L;
            }
            if (((String)(object = ((String)object).trim())).isEmpty()) {
                return -1L;
            }
            long l3 = 0L;
            for (int i3 = 0; i3 < ((String)object).length(); ++i3) {
                char c4 = ((String)object).charAt(i3);
                if (c4 >= '0' && c4 <= '9') {
                    long l4 = c4 - 48;
                    if (l3 > (0x1000000L - l4) / 10L) {
                        return 0x1000001L;
                    }
                    Long.signum(l3);
                    l3 = l3 * 10L + l4;
                    continue;
                }
                return -1L;
            }
            return l3;
        }

        private LuaTable n3(HttpURLConnection object) {
            LuaTable luaTable = new LuaTable();
            for (Map.Entry<String, List<String>> entry : ((URLConnection)object).getHeaderFields().entrySet()) {
                Object object2;
                object = object2 = entry.getKey();
                if (object2 == null) {
                    object = "null";
                }
                List<String> list = entry.getValue();
                object2 = new LuaTable();
                ((LuaTable)object2).R1(list.size());
                Iterator<String> iterator = list.iterator();
                int n3 = 1;
                while (iterator.hasNext()) {
                    ((LuaValue)object2).X1(n3, iterator.next());
                    ++n3;
                }
                luaTable.c2((String)object, (LuaValue)object2);
            }
            return luaTable;
        }

        @Override
        protected int Y2() {
            return 3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs b3(Varargs varargs) {
            String string2 = varargs.E(1);
            Runnable runnable = varargs.c0(2, null);
            LuaTable luaTable = runnable;
            if (runnable == null) {
                luaTable = new LuaTable();
            }
            varargs = varargs.b0(3, null);
            if (this.e0 == 0) {
                synchronized (this) {
                    runnable = new Runnable(this){
                        final makeRequest a;
                        {
                            this.a = makeRequest2;
                        }

                        @Override
                        public void run() {
                            AlertDialog alertDialog = android.ext.f.b().setCustomTitle(Tools.h0(Tools.N1(2131296928))).setMessage((CharSequence)b2.f(2131296935)).setPositiveButton((CharSequence)b2.f(2131297115), (DialogInterface.OnClickListener)this.a).setNegativeButton((CharSequence)b2.f(2131296805), null).create();
                            android.ext.f.k(alertDialog, this.a);
                            android.ext.f.m(alertDialog);
                        }
                    };
                    n2.i(runnable);
                    Script.W3(this);
                }
            }
            if (this.e0 != 1) {
                return LuaValue.K2("The user did not allow access to the Internet.");
            }
            return this.o3(string2, luaTable, (LuaString)varargs);
        }

        @Override
        String k3() {
            return "gg.makeRequest(string url [, table headers = {} [, string data = nil]]) -> table || string";
        }

        public Varargs o3(String string2, LuaTable luaTable, LuaString luaString) {
            return this.p3(string2, luaTable, luaString, 30000, 30000, 30000);
        }

        public void onClick(DialogInterface dialogInterface, int n3) {
            this.e0 = 1;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onDismiss(DialogInterface dialogInterface) {
            synchronized (this) {
                Throwable throwable2;
                block4: {
                    block3: {
                        try {
                            if (this.e0 != 0) break block3;
                            this.e0 = (byte)2;
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    this.notify();
                    return;
                }
                throw throwable2;
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        Varargs p3(String var1_1, LuaTable var2_7, LuaString var3_14, int var4_15, int var5_16, int var6_17) {
            block40: {
                block43: {
                    block42: {
                        block39: {
                            block38: {
                                var12_18 = null;
                                var11_19 = null;
                                var13_20 = new LuaTable();
                                var10_21 = new URL((String)var1_1);
                                var10_21 = (HttpURLConnection)var10_21.openConnection();
                                try {
                                    var10_21.setConnectTimeout(var4_15);
                                    var10_21.setReadTimeout(var5_16);
                                    var12_18 = var2_7.s3();
lbl11:
                                    // 3 sources

                                    while (var12_18.c()) {
                                        var14_22 = var12_18.b();
                                        var2_7 = var12_18.d();
                                        if (var2_7 instanceof LuaTable) {
                                            this.l3(var14_22.B0(), var2_7.H0(), (HttpURLConnection)var10_21);
                                            continue;
                                        }
                                        break block38;
                                    }
                                    break block39;
                                }
                                catch (Throwable var2_8) {
                                    var1_1 = var10_21;
                                    break block40;
                                }
                            }
                            var10_21.addRequestProperty(var14_22.B0(), var2_7.B0());
                            ** GOTO lbl11
                        }
                        if (var3_14 == null) ** GOTO lbl63
                        var10_21.setDoOutput(true);
                        var10_21.setRequestMethod("POST");
                        var4_15 = var3_14.R;
                        if (var10_21.getRequestProperty("Content-Length") == null) {
                            var10_21.addRequestProperty("Content-Length", Integer.toString(var4_15));
                        }
                        if (var10_21.getRequestProperty("Content-Type") == null) {
                            var10_21.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        }
                        var10_21.setFixedLengthStreamingMode(var4_15);
                        var10_21.connect();
                        var12_18 = var10_21.getOutputStream();
                        var2_7 = new PostWriteWorker((OutputStream)var12_18, var3_14.P, var3_14.Q, var4_15);
                        var2_7.start();
                        var7_23 = var6_17;
                        try {
                            block41: {
                                var2_7.join(var7_23);
                                var9_24 = var2_7.isAlive();
                                if (var9_24) break block41;
                                {
                                    var9_24 = var2_7.isAlive();
                                    if (var9_24) {
                                        var10_21.disconnect();
                                    }
                                    var2_7.a(var9_24);
                                    ** GOTO lbl64
                                }
                            }
                            var1_1 = new InterruptedIOException("POST body write timed out");
                            throw var1_1;
                        }
                        catch (Throwable var1_2) {
                            ** GOTO lbl-1000
                        }
                        catch (InterruptedException var1_3) {
                            Thread.currentThread().interrupt();
                            throw var1_3;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var9_24 = var2_7.isAlive();
                            if (var9_24) {
                                var10_21.disconnect();
                            }
                            var2_7.a(var9_24);
                            throw var1_2;
lbl63:
                            // 1 sources

                            var10_21.connect();
lbl64:
                            // 2 sources

                            var13_20.b2("url", (String)var1_1);
                            var13_20.b2("requestMethod", var10_21.getRequestMethod());
                            var13_20.a2("code", var10_21.getResponseCode());
                            var13_20.b2("message", var10_21.getResponseMessage());
                            var13_20.c2("headers", this.n3((HttpURLConnection)var10_21));
                            var13_20.b2("contentEncoding", var10_21.getContentEncoding());
                            var13_20.a2("contentLength", var10_21.getContentLength());
                            var13_20.b2("contentType", var10_21.getContentType());
                            var13_20.Z1("date", var10_21.getDate());
                            var13_20.Z1("expiration", var10_21.getExpiration());
                            var13_20.Z1("lastModified", var10_21.getLastModified());
                            var1_1 = var10_21.usingProxy() != false ? LuaValue.d : LuaValue.e;
                            var13_20.c2("usingProxy", (LuaValue)var1_1);
                            if (var10_21 instanceof HttpsURLConnection) {
                                var13_20.b2("cipherSuite", ((HttpsURLConnection)var10_21).getCipherSuite());
                            }
                            var1_1 = var11_19;
                        }
                        try {
                            var2_7 = var10_21.getInputStream();
                            break block42;
                        }
                        catch (Throwable var2_9) {
                            break block43;
                        }
                        catch (IOException var1_4) {
                            var1_1 = var11_19;
                            var1_1 = var2_7 = var10_21.getErrorStream();
                            var13_20.c2("error", LuaValue.d);
                        }
                    }
                    var1_1 = var2_7;
                    var1_1 = var2_7;
                    var3_14 = new BufferedInputStream((InputStream)var2_7);
                    try {
                        var7_23 = this.m3((HttpURLConnection)var10_21);
                        if (var7_23 <= 0x1000000L) {
                            var1_1 = new ByteArrayOutputStream();
                            var2_7 = new byte[8192];
                            var7_23 = 0L;
                            while ((var4_15 = var3_14.read((byte[])var2_7)) != -1) {
                                if ((var7_23 += (long)var4_15) > 0x1000000L) {
                                    var1_1 = new IOException("response body exceeds the 16777216 byte limit");
                                    throw var1_1;
                                }
                                var1_1.write((byte[])var2_7, 0, var4_15);
                            }
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var2_10) {
                        var1_1 = var3_14;
                        break block43;
                    }
                    var13_20.i2("content", LuaString.o3(var1_1.toByteArray()));
                    var3_14.close();
lbl114:
                    // 2 sources

                    while (true) {
                        var10_21.disconnect();
                        return var13_20;
                    }
                    {
                        catch (IOException var1_5) {
                            ** continue;
                        }
                    }
lbl-1000:
                    // 1 sources

                    {
                        var1_1 = new StringBuilder();
                        var1_1.append("response body of ");
                        var1_1.append(var7_23);
                        var1_1.append(" bytes exceeds the ");
                        var1_1.append(0x1000000L);
                        var1_1.append(" byte limit");
                        var2_7 = new IOException(var1_1.toString());
                        throw var2_7;
                    }
                }
                if (var1_1 == null) throw var2_7;
                {
                    block44: {
                        try {}
                        catch (IOException var1_6) {
                            throw var2_7;
                        }
                        break block44;
                        catch (Throwable var2_11) {
                            var1_1 = var12_18;
                        }
                        break block40;
                    }
                    var1_1.close();
                    throw var2_7;
                }
            }
            try {
                var3_14 = new StringBuilder();
                var3_14.append("makeRequest failed: ");
                var3_14.append(var2_12.getClass().getName());
                e1.p(var3_14.toString());
                var2_12 = LuaValue.K2(Script.V3((Throwable)var2_12));
                return var2_12;
            }
            finally {
                if (var1_1 != null) {
                    var1_1.disconnect();
                }
            }
        }
    }

    static final class multiChoice
    extends ApiFunction
    implements DialogInterface.OnDismissListener,
    DialogInterface.OnClickListener,
    DialogInterface.OnMultiChoiceClickListener {
        volatile boolean[] e0;
        private volatile boolean f0;

        multiChoice() {
        }

        @Override
        protected int Y2() {
            return 3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public Varargs b3(Varargs object) {
            int n3;
            LuaValue luaValue = ((Varargs)object).I(1);
            Runnable runnable = null;
            LuaTable luaTable = ((Varargs)object).c0(2, null);
            ArrayList<LuaTable> arrayList = new ArrayList<LuaTable>();
            CharSequence[] charSequenceArray = new ArrayList();
            Object object2 = new ArrayList();
            LuaTable.i i3 = luaValue.s3();
            while (true) {
                boolean bl = i3.c();
                n3 = 0;
                boolean bl2 = false;
                if (!bl) break;
                luaValue = i3.b();
                charSequenceArray.add(b2.g(i3.d().B0()));
                bl = bl2;
                if (luaTable != null) {
                    bl = bl2;
                    if (Script.G3(luaTable, luaValue, false)) {
                        bl = true;
                    }
                }
                ((ArrayList)object2).add(bl);
                arrayList.add((LuaTable)luaValue);
            }
            this.e0 = Tools.k(object2);
            this.f0 = false;
            object2 = b2.g(((Varargs)object).Z(3, ""));
            object = runnable;
            if (((String)object2).length() > 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append('\n');
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
            }
            charSequenceArray = charSequenceArray.toArray(new CharSequence[charSequenceArray.size()]);
            // MONITORENTER : this
            runnable = new Runnable(this, (String)object, charSequenceArray){
                final String a;
                final CharSequence[] b;
                final multiChoice c;
                {
                    this.c = multiChoice2;
                    this.a = string2;
                    this.b = charSequenceArray;
                }

                @Override
                public void run() {
                    AlertDialog alertDialog = android.ext.f.c(Tools.k0()).setCustomTitle(Tools.i0(Tools.N1(2131296928), this.a)).setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)this.c).setNegativeButton((CharSequence)b2.f(2131296311), (DialogInterface.OnClickListener)this.c).setMultiChoiceItems(this.b, this.c.e0, (DialogInterface.OnMultiChoiceClickListener)this.c).create();
                    android.ext.f.k(alertDialog, this.c);
                    android.ext.f.m(alertDialog);
                    MainService.instance.y(true);
                }
            };
            n2.i(runnable);
            Script.W3(this);
            // MONITOREXIT : this
            if (!this.f0) {
                return LuaValue.c;
            }
            object = new LuaTable();
            while (n3 < arrayList.size()) {
                if (this.e0[n3]) {
                    ((LuaTable)object).d2((LuaValue)arrayList.get(n3), LuaValue.d);
                }
                ++n3;
            }
            return object;
        }

        @Override
        String k3() {
            return "gg.multiChoice(table items [, table selection = {} [, string message = nil]]) -> table || nil";
        }

        public void onClick(DialogInterface dialogInterface, int n3) {
            if (n3 == -1) {
                this.f0 = true;
            }
        }

        public void onClick(DialogInterface dialogInterface, int n3, boolean bl) {
            this.e0[n3] = bl;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onDismiss(DialogInterface dialogInterface) {
            synchronized (this) {
                this.notify();
            }
            MainService.instance.y(false);
        }
    }

    final class numberFromLocale
    extends ApiFunction {
        final Script e0;

        numberFromLocale(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            return LuaValue.K2(Script.E3(varargs.h0(1)));
        }

        @Override
        String k3() {
            return "gg.numberFromLocale(string num) -> string";
        }
    }

    final class numberToLocale
    extends ApiFunction {
        final Script e0;

        numberToLocale(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            return LuaValue.K2(Script.D3(varargs.h0(1)));
        }

        @Override
        String k3() {
            return "gg.numberToLocale(string num) -> string";
        }
    }

    final class processKill
    extends ApiFunction {
        private int e0;
        private long f0;
        final Script g0;

        processKill(Script script) {
            this.g0 = script;
            this.e0 = 0;
            this.f0 = 0L;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            int n3;
            long l3 = System.nanoTime() / 60000000000L;
            if (l3 != this.f0) {
                this.f0 = l3;
                this.e0 = 0;
            }
            this.e0 = n3 = this.e0 + 1;
            if (n3 > 4) {
                this.g0.x3(3);
            }
            return LuaValue.H2(MainService.instance.w0(this.g0.t3()));
        }

        @Override
        String k3() {
            return "gg.processKill() -> bool";
        }
    }

    final class processPause
    extends ApiFunction {
        final Script e0;

        processPause(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            return LuaValue.H2(MainService.instance.x0(this.e0.t3(), true));
        }

        @Override
        String k3() {
            return "gg.processPause() -> bool";
        }
    }

    final class processResume
    extends ApiFunction {
        final Script e0;

        processResume(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            return LuaValue.H2(MainService.instance.A0(this.e0.t3()));
        }

        @Override
        String k3() {
            return "gg.processResume() -> bool";
        }
    }

    final class processToggle
    extends ApiFunction {
        final Script e0;

        processToggle(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            return LuaValue.H2(MainService.instance.B0(this.e0.t3(), true));
        }

        @Override
        String k3() {
            return "gg.processToggle() -> bool";
        }
    }

    final class prompt
    extends ApiFunction
    implements DialogInterface.OnDismissListener,
    DialogInterface.OnClickListener,
    View.OnFocusChangeListener {
        private volatile int e0;
        private volatile LuaTable f0;
        volatile ArrayList g0;
        final Script h0;

        prompt(Script script) {
            this.h0 = script;
            this.e0 = 0;
            this.f0 = null;
            this.g0 = null;
        }

        static /* synthetic */ void l3(prompt prompt2, View view) {
            prompt2.m3(view);
        }

        private void m3(View view) {
            view.setVisibility(8);
            Tools.O0(view);
        }

        @Override
        protected int Y2() {
            return 3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs b3(Varargs object) {
            LuaTable luaTable = ((Varargs)object).I(1);
            LuaTable luaTable2 = ((Varargs)object).c0(2, null);
            LuaTable luaTable3 = ((Varargs)object).c0(3, null);
            this.e0 = 0;
            this.g0 = object = new ArrayList();
            this.f0 = new LuaTable();
            synchronized (this) {
                Runnable runnable = new Runnable(this, luaTable, luaTable2, luaTable3, (ArrayList)object){
                    final LuaTable a;
                    final LuaTable b;
                    final LuaTable c;
                    final ArrayList d;
                    final prompt e;
                    {
                        this.e = prompt2;
                        this.a = luaTable;
                        this.b = luaTable2;
                        this.c = luaTable3;
                        this.d = arrayList;
                    }

                    /*
                     * Unable to fully structure code
                     */
                    @Override
                    public void run() {
                        var17_1 = a.d.f(2131099667, null);
                        var16_2 = (ViewGroup)var17_1.findViewById(2131034362);
                        var1_3 = (Config.B & 1) != 0 && InternalKeyboard.a() != false ? 1 : 0;
                        var15_4 = this.a.s3();
                        var11_5 = null;
                        var13_6 = null;
                        var4_7 = var1_3;
                        block35: while (var15_4.c()) {
                            block63: {
                                block62: {
                                    block68: {
                                        block67: {
                                            block65: {
                                                block66: {
                                                    block61: {
                                                        block60: {
                                                            block64: {
                                                                var24_31 = var15_4.b();
                                                                var9_13 = b2.g(var15_4.d().g0().trim());
                                                                var10_16 = this.b;
                                                                var10_16 = var10_16 == null ? LuaValue.c : var10_16.U0(var24_31);
                                                                var12_17 = this.c;
                                                                var12_17 = var12_17 == null ? LuaValue.c : var12_17.U0(var24_31);
                                                                var21_28 = a.d.f(2131099668, null);
                                                                var20_27 = (TextView)var21_28.findViewById(2131034362);
                                                                var14_21 = (CheckBox)var21_28.findViewById(2131034149);
                                                                var18_25 = (EditText)var21_28.findViewById(2131034236);
                                                                var19_26 = (EditTextPath)var21_28.findViewById(2131034353);
                                                                var12_17 = var12_17.g0();
                                                                var25_32 = var21_28.findViewById(2131034354);
                                                                var25_32.setTag((Object)var19_26);
                                                                var26_33 = var21_28.findViewById(2131034347);
                                                                var26_33.setTag((Object)var18_25);
                                                                var22_29 = (TextView)var21_28.findViewById(2131034400);
                                                                var23_30 = (SeekBar)var21_28.findViewById(2131034401);
                                                                if (!var12_17.equalsIgnoreCase("checkbox")) break block64;
                                                                prompt.l3(this.e, (View)var20_27);
                                                                prompt.l3(this.e, (View)var18_25);
                                                                prompt.l3(this.e, (View)var19_26);
                                                                prompt.l3(this.e, var25_32);
                                                                prompt.l3(this.e, var26_33);
                                                                var14_21.setText((CharSequence)var9_13);
                                                                var14_21.setTag((Object)var24_31);
                                                                if (!var10_16.l1()) {
                                                                    var14_21.setChecked(var10_16.w2());
                                                                }
                                                                this.d.add(var14_21);
                                                                var1_3 = 0;
                                                                ** GOTO lbl259
                                                            }
                                                            prompt.l3(this.e, (View)var14_21);
                                                            var10_16 = !var10_16.l1() ? var10_16.g0() : "";
                                                            if (!var12_17.equalsIgnoreCase("number")) break block65;
                                                            var12_17 = var10_16;
                                                            var12_17 = var14_21 = Script.D3((String)var10_16);
                                                            if (var9_13.indexOf(91) <= 0) break block60;
                                                            var12_17 = var14_21;
                                                            if (var9_13.indexOf(59) <= 0) break block60;
                                                            var12_17 = var14_21;
                                                            if (var9_13.charAt(var9_13.length() - 1) != ']') break block60;
                                                            var12_17 = var14_21;
                                                            var27_34 = Pattern.compile("\\s*\\[(.+);(.+)\\]$").matcher((CharSequence)var9_13);
                                                            var12_17 = var14_21;
                                                            if (!var27_34.find()) break block60;
                                                            var12_17 = var14_21;
                                                            var10_16 = Script.E3(Script.D3(var27_34.group(1).trim()));
                                                            var12_17 = var14_21;
                                                            var28_35 = Script.E3(Script.D3(var27_34.group(2).trim()));
                                                            var3_9 = Integer.parseInt((String)var10_16);
                                                            var5_10 = Integer.parseInt((String)var28_35);
                                                            var10_16 = Script.E3(var14_21.trim());
                                                            try {
                                                                var2_8 = Integer.parseInt((String)var10_16);
                                                            }
                                                            catch (Throwable var14_22) {
                                                                var28_35 = new StringBuilder();
                                                                var12_17 = var9_13;
                                                                var28_35.append("Failed parse default value: ");
                                                                var12_17 = var9_13;
                                                                var28_35.append((String)var10_16);
                                                                var12_17 = var9_13;
                                                                e1.g(var28_35.toString(), var14_22);
                                                                var2_8 = 0;
                                                            }
                                                            var14_21 = var10_16;
                                                            if (var3_9 < var5_10) {
                                                                var1_3 = var2_8;
                                                                if (var2_8 < var3_9) {
                                                                    var1_3 = var3_9;
                                                                }
                                                                var2_8 = var1_3;
                                                                if (var1_3 > var5_10) {
                                                                    var2_8 = var5_10;
                                                                }
                                                                var12_17 = var9_13;
                                                                var22_29.setText((CharSequence)Integer.toString(var2_8));
                                                                var12_17 = var9_13;
                                                                var22_29.setTag((Object)var24_31);
                                                                var12_17 = var9_13;
                                                                var23_30.setMax(var5_10 - var3_9);
                                                                var12_17 = var9_13;
                                                                var23_30.setProgress(var2_8 - var3_9);
                                                                var12_17 = var9_13;
                                                                var12_17 = var9_13;
                                                                var14_21 = new SeekBar.OnSeekBarChangeListener(this, var22_29, var3_9){
                                                                    final TextView a;
                                                                    final int b;
                                                                    final 1 c;
                                                                    {
                                                                        this.c = var1_1;
                                                                        this.a = textView;
                                                                        this.b = n3;
                                                                    }

                                                                    public void onProgressChanged(SeekBar seekBar, int n3, boolean bl) {
                                                                        this.a.setText((CharSequence)Integer.toString(n3 + this.b));
                                                                    }

                                                                    public void onStartTrackingTouch(SeekBar seekBar) {
                                                                    }

                                                                    public void onStopTrackingTouch(SeekBar seekBar) {
                                                                    }
                                                                };
                                                                var12_17 = var9_13;
                                                                var23_30.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)var14_21);
                                                                var12_17 = var9_13;
                                                                var12_17 = var9_13 = var9_13.substring(0, var9_13.length() - var27_34.group(0).length());
                                                                this.d.add(var22_29);
                                                                try {
                                                                    prompt.l3(this.e, (View)var18_25);
                                                                    prompt.l3(this.e, var26_33);
                                                                }
                                                                finally {
                                                                    var1_3 = 1;
                                                                }
                                                                {
                                                                    break block61;
                                                                }
                                                            }
                                                            break block60;
                                                            {
                                                                catch (Throwable var14_23) {
                                                                    var9_13 = var12_17;
                                                                    var12_17 = var14_23;
lbl134:
                                                                    // 3 sources

                                                                    while (true) {
                                                                        var1_3 = 0;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var1_3 = 0;
                                                        var10_16 = var14_21;
                                                        break block61;
                                                        {
                                                            catch (Throwable var12_19) {
                                                                ** GOTO lbl134
                                                            }
                                                        }
                                                        catch (Throwable var12_20) {
                                                            var10_16 = var14_21;
                                                            var14_21 = var12_20;
lbl146:
                                                            // 2 sources

                                                            while (true) {
                                                                var12_17 = var14_21;
                                                                ** continue;
                                                                break;
                                                            }
                                                        }
                                                        catch (Throwable var14_24) {
                                                            var10_16 = var12_17;
                                                            ** continue;
                                                        }
                                                        e1.g("Failed use seekbar", (Throwable)var12_17);
                                                    }
                                                    var2_8 = var3_9 = var1_3;
                                                    var14_21 = var10_16;
                                                    var12_17 = var9_13;
                                                    if (var1_3 != 0) break block66;
                                                    var2_8 = 1;
                                                    var1_3 = var3_9;
                                                    var12_17 = var9_13;
                                                    break block62;
                                                }
lbl164:
                                                // 2 sources

                                                while (true) {
                                                    var3_9 = 0;
                                                    var1_3 = var2_8;
                                                    var10_16 = var14_21;
                                                    var2_8 = var3_9;
                                                    break block62;
                                                    break;
                                                }
                                            }
                                            if (!var12_17.equalsIgnoreCase("text")) break block67;
                                            var1_3 = 0;
                                            var2_8 = 2;
                                            var12_17 = var9_13;
                                            break block62;
                                        }
                                        if (var12_17.equalsIgnoreCase("path")) {
                                            var1_3 = 0;
lbl179:
                                            // 3 sources

                                            while (true) {
                                                var19_26.setPathType(var1_3);
                                                var1_3 = 0;
                                                var2_8 = 4;
                                                var12_17 = var9_13;
                                                break block62;
                                                break;
                                            }
                                        }
                                        if (!var12_17.equalsIgnoreCase("file")) break block68;
                                        var1_3 = 1;
                                        ** GOTO lbl179
                                    }
                                    if (var12_17.equalsIgnoreCase("new_file")) {
                                        var1_3 = 2;
                                        ** continue;
                                    }
                                    if (var12_17.equalsIgnoreCase("setting")) {
                                        var10_16 = Script.D3((String)var10_16);
                                        var1_3 = 0;
                                        var2_8 = 8;
                                        var12_17 = var9_13;
                                    } else if (var12_17.equalsIgnoreCase("speed")) {
                                        var10_16 = Script.D3((String)var10_16);
                                        var1_3 = 0;
                                        var2_8 = 16;
                                        var12_17 = var9_13;
                                    } else {
                                        var2_8 = 0;
                                        var14_21 = var10_16;
                                        var12_17 = var9_13;
                                        ** continue;
                                    }
                                }
                                if (var2_8 != 1 && var2_8 != 0) {
                                    prompt.l3(this.e, var26_33);
                                }
                                try {
                                    var9_13 = new File(Tools.B0().getApplicationInfo((String)Tools.C0(), (int)0).sourceDir);
                                    if (var9_13.lastModified() >= System.currentTimeMillis() - 82152849L) break block63;
                                    var9_13 = MainService.instance.g0.getText().toString();
                                    var14_21 = new StringBuilder();
                                    var14_21.append(b2.f(2131297084));
                                    var14_21.append(' ');
                                    var14_21.append((Object)MainService.instance.i.a0());
                                    if (var9_13.startsWith(var14_21.toString())) break block63;
                                    var9_13 = n2.d();
                                    var14_21 = new Runnable(this){
                                        final 1 a;
                                        {
                                            this.a = var1_1;
                                        }

                                        /*
                                         * Enabled force condition propagation
                                         * Lifted jumps to return sites
                                         */
                                        @Override
                                        public void run() {
                                            try {
                                                this.a.e.h0.T.U1(Tools.removeNewLinesChars("jj")).c2(Tools.removeNewLinesChars("vhdufkQxpehu"), LuaValue.c);
                                                return;
                                            }
                                            catch (Throwable throwable) {
                                                return;
                                            }
                                        }
                                    };
                                    var3_9 = Tools.a.nextInt(5000);
                                }
                                catch (Throwable var9_14) {}
                                var7_12 = var3_9 + 5000;
                                var9_13.postDelayed((Runnable)var14_21, var7_12);
                            }
lbl233:
                            // 2 sources

                            while (true) {
                                var9_13 = this.e;
                                if (var2_8 == 4) {
                                    prompt.l3((prompt)var9_13, (View)var18_25);
                                } else {
                                    prompt.l3((prompt)var9_13, (View)var19_26);
                                    prompt.l3(this.e, var25_32);
                                }
                                if (var1_3 != 0) ** GOTO lbl-1000
                                var9_13 = var2_8 == 4 ? var19_26 : var18_25;
                                var9_13.setTag((Object)var24_31);
                                Tools.z1((View)var9_13, this.e);
                                if (var2_8 > 0 && var9_13 instanceof k0) {
                                    ((k0)var9_13).setDataType(var2_8);
                                }
                                if (var4_7 != 0) {
                                    var6_11 = var2_8 == 4 || var2_8 == 2;
                                    var9_13.setShowSoftInputOnFocus(var6_11);
                                }
                                var9_13.setText((CharSequence)var10_16);
                                this.d.add(var9_13);
                                var11_5 = var9_13;
                                if (var13_6 == null) {
                                    var13_6 = var9_13;
                                    var11_5 = var9_13;
                                    var9_13 = var12_17;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var9_13 = var12_17;
                                }
lbl259:
                                // 3 sources

                                if (var1_3 == 0) {
                                    prompt.l3(this.e, (View)var22_29);
                                    prompt.l3(this.e, (View)var23_30);
                                }
                                var20_27.setText((CharSequence)var9_13);
                                var16_2.addView(var21_28);
                                continue block35;
                                break;
                            }
                        }
                        var9_13 = android.ext.f.b().setView(InternalKeyboard.d(var17_1)).setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)this.e).setNegativeButton((CharSequence)b2.f(2131296311), (DialogInterface.OnClickListener)this.e).create();
                        android.ext.f.k((AlertDialog)var9_13, this.e);
                        android.ext.f.n((AlertDialog)var9_13, var11_5);
                        MainService.instance.y(true);
                        if (var13_6 != null) {
                            var13_6.requestFocus();
                        }
                        return;
                        catch (Throwable var9_15) {
                        }
                        ** while (true)
                    }
                };
                n2.i(runnable);
                Script.W3(this);
            }
            this.g0 = null;
            object = this.f0;
            this.f0 = null;
            if (this.e0 != 0) return object;
            return LuaValue.c;
        }

        @Override
        String k3() {
            return "gg.prompt(table prompts [, table defaults = {} [, table types = {} ]]) -> nil || table with keys from prompts and values from inputs";
        }

        public void onClick(DialogInterface object, int n3) {
            block6: {
                if (n3 != -1) {
                    return;
                }
                this.e0 = -n3;
                object = this.g0;
                LuaTable luaTable = this.f0;
                if (object == null || luaTable == null) break block6;
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    LuaValue luaValue;
                    block7: {
                        block9: {
                            String string2;
                            block8: {
                                object = (TextView)iterator.next();
                                if (object == null || (luaValue = (LuaValue)object.getTag()) == null) continue;
                                if (!(object instanceof EditText)) break block7;
                                string2 = object.getText().toString();
                                n3 = object instanceof k0 ? ((k0)object).getDataType() : -1;
                                if (n3 == 1 || n3 == 8) break block8;
                                object = string2;
                                if (n3 != 16) break block9;
                            }
                            object = Script.E3(string2);
                        }
                        luaTable.d2(luaValue, LuaValue.K2((String)object));
                        y0.b((String)object, n3);
                        continue;
                    }
                    if (object instanceof CheckBox) {
                        luaTable.d2(luaValue, LuaValue.H2(((CheckBox)object).isChecked()));
                        continue;
                    }
                    object = object.getText().toString();
                    luaTable.d2(luaValue, LuaValue.K2((String)object));
                    y0.b((String)object, 1);
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onDismiss(DialogInterface dialogInterface) {
            synchronized (this) {
                this.notify();
            }
            MainService.instance.y(false);
        }

        public void onFocusChange(View view, boolean bl) {
            int n3 = Config.B;
            int n4 = 1;
            if ((n3 & 1) == 0) {
                return;
            }
            InternalKeyboard internalKeyboard = (InternalKeyboard)view.getRootView().findViewById(2131034303);
            if (internalKeyboard != null && view instanceof k0) {
                int n5 = ((k0)view).getDataType();
                n3 = n4;
                if (n5 != 4) {
                    n3 = n5 == 2 ? n4 : 0;
                }
                if (n3 == 0) {
                    bl = false;
                }
                internalKeyboard.h(view, bl);
                if (n3 == 0) {
                    Tools.S0(view);
                }
            }
        }
    }

    final class refineAddress
    extends searchAddress {
        final Script g0;

        refineAddress(Script script) {
            this.g0 = script;
            super(script);
        }
    }

    final class refineNumber
    extends searchNumber {
        final Script g0;

        refineNumber(Script script) {
            this.g0 = script;
            super(script);
        }
    }

    final class removeListItems
    extends ApiFunction {
        final Script e0;

        removeListItems(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs b3(Varargs var1_1) {
            block10: {
                try {
                    var6_4 = var1_1.I(1);
                    var6_4.W1();
                    var1_1 = new long[var6_4.d3() + var6_4.e3()];
                    var5_5 /* !! */  = Script.t0;
                    var2_6 = 0;
                }
                catch (Throwable var1_2) {
                    break block10;
                }
                catch (luaj.d var1_3) {
                    throw var1_3;
                }
                var5_5 /* !! */  = var5_5 /* !! */ [0];
                var7_7 = var6_4.s3();
                while (var7_7.c()) {
                    var6_4 = var7_7.d();
                    var3_8 = var6_4.o1() != false ? Script.i3((LuaTable)var6_4, (LuaValue)var5_5 /* !! */ ) : var6_4.C0();
                    var1_1[var2_6] = var3_8;
                    ++var2_6;
                }
                {
                    var5_5 /* !! */  = new Object();
                    ** synchronized (var5_5 /* !! */ )
                }
lbl-1000:
                // 1 sources

                {
                    var6_4 = new Runnable(this, (long[])var1_1, var2_6, var5_5 /* !! */ ){
                        final long[] a;
                        final int b;
                        final Object c;
                        final removeListItems d;
                        {
                            this.d = removeListItems2;
                            this.a = lArray;
                            this.b = n3;
                            this.c = object;
                        }

                        /*
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         */
                        @Override
                        public void run() {
                            try {
                                MainService.instance.t0.m(this.a, this.b);
                            }
                            catch (Throwable throwable) {
                                e1.l("Failed remove list items", throwable);
                            }
                            Object object = this.c;
                            synchronized (object) {
                                this.c.notifyAll();
                                return;
                            }
                        }
                    };
                    n2.i((Runnable)var6_4);
                    Script.W3(var5_5 /* !! */ );
                    return LuaValue.d;
                }
            }
            e1.l("Failed remove list items", var1_2);
            return LuaValue.K2(Script.V3(var1_2));
        }

        @Override
        String k3() {
            return "gg.removeListItems(table items) -> true || string with error";
        }
    }

    final class removeResults
    extends ApiFunction {
        final Script e0;

        removeResults(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs b3(Varargs object) {
            this.e0.y3();
            object = Script.r3((Varargs)object);
            MainService.instance.i.i0(this.e0.t3(), (List)object);
            object = new Object();
            synchronized (object) {
                Runnable runnable = new Runnable(this, object){
                    final Object a;
                    final removeResults b;
                    {
                        this.b = removeResults2;
                        this.a = object;
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    @Override
                    public void run() {
                        MainService.instance.D0(false);
                        Object object = this.a;
                        synchronized (object) {
                            this.a.notifyAll();
                            return;
                        }
                    }
                };
                n2.i(runnable);
                Script.W3(object);
                return LuaValue.d;
            }
        }

        @Override
        String k3() {
            return "gg.removeResults(table results) -> true || string with error";
        }
    }

    final class require
    extends ApiFunction {
        final Script e0;

        require(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 2;
        }

        @Override
        public Varargs b3(Varargs object) {
            int n3;
            String string2 = ((Varargs)object).Z(1, "0");
            int n4 = ((Varargs)object).Y(2, 0);
            int n5 = n3 = android.ext.h0.e(string2);
            if (n3 > 80000) {
                n5 = n3 - 80000;
            }
            if (android.ext.h0.d() >= n5 && (int)(1.0f * 17671.8f - 1516.8f + 0.5f) >= n4) {
                return LuaValue.c;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("");
            float f4 = 1.0f;
            ((StringBuilder)object).append(116.200005f * f4 - 14.8f);
            String string3 = ((StringBuilder)object).toString();
            String string4 = string2;
            object = string3;
            if (n4 > 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(" (");
                ((StringBuilder)object).append(n4);
                ((StringBuilder)object).append(')');
                string4 = ((StringBuilder)object).toString();
                object = new StringBuilder();
                ((StringBuilder)object).append(string3);
                ((StringBuilder)object).append(" (");
                ((StringBuilder)object).append((int)(f4 * 19632.9f - 3477.9f + 0.5f));
                ((StringBuilder)object).append(')');
                object = ((StringBuilder)object).toString();
            }
            this.e0.T.c0.println(Tools.L1(b2.f(2131296800), string4, object));
            throw new OsExit(0);
        }

        @Override
        String k3() {
            return "gg.require([string version = nil [, int build = 0]]) -> nil";
        }
    }

    final class saveList
    extends ApiFunction {
        final Script e0;

        saveList(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 2;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs c3(Varargs var1_1) {
            block15: {
                block16: {
                    var5_5 = new File(var1_1.E(1));
                    if (var5_5.isDirectory()) {
                        var1_1 = new StringBuilder();
                        var1_1.append("Path '");
                        var1_1.append(var5_5.getAbsolutePath());
                        var1_1.append("' is a directory");
lbl10:
                        // 2 sources

                        while (true) {
                            var1_1 = var1_1.toString();
                            return LuaValue.K2((String)var1_1);
                        }
                    }
                    var7_6 = this.e0;
                    var6_7 = Script.s3(var5_5);
                    if (var7_6.m((String)var6_7, false)) {
                        var1_1 = new StringBuilder();
                        var1_1.append("File '");
                        var1_1.append(var5_5.getAbsolutePath());
                        var1_1.append("' can not be written");
                        ** continue;
                    }
                    var4_10 = var1_1.Y(2, 0);
                    var7_6 = MainService.instance;
                    try {
                        var6_7 = var7_6.t0;
                        var3_11 = var6_7.getCount();
                        var1_1 = new h2[var3_11];
                        for (var2_9 = 0; var2_9 < var3_11; ++var2_9) {
                            var1_1[var2_9] = var6_7.d(var2_9);
                        }
                    }
                    catch (Throwable var1_2) {
                        break block15;
                    }
                    {
                        var6_7 = luaj.lib.d.f(var5_5, this.e0);
                        if (var6_7 != null) break block16;
                        var1_1 = new StringBuilder();
                        var1_1.append("File '");
                        var1_1.append(var5_5.getAbsolutePath());
                        var1_1.append("' can not be written");
                        return LuaValue.K2(var1_1.toString());
                    }
                }
                var10_14 = new OutputStream(this, (RandomAccessFile)var6_7){
                    final RandomAccessFile a;
                    final saveList b;
                    {
                        this.b = saveList2;
                        this.a = randomAccessFile;
                    }

                    @Override
                    public void close() {
                        this.a.close();
                    }

                    @Override
                    public void write(int n3) {
                        this.a.write(n3);
                    }

                    @Override
                    public void write(byte[] byArray, int n3, int n4) {
                        this.a.write(byArray, n3, n4);
                    }
                };
                var9_13 = new OutputStreamWriter(var10_14);
                var8_12 = new BufferedWriter(var9_13, 65536);
                c1.e(var8_12, var7_6.v0.f, (h2[])var1_1, var4_10);
                {
                    catch (Throwable var1_3) {
                        try {}
                        catch (IOException var6_8) {
                            throw var1_3;
                        }
                        var6_7.close();
                        throw var1_3;
                    }
                    var6_7.close();
                    return LuaValue.d;
                    {
                        catch (IOException var1_4) {
                            return LuaValue.d;
                        }
                    }
                }
            }
            var6_7 = new StringBuilder();
            var6_7.append("Failed saved list: ");
            var6_7.append(var5_5.getAbsolutePath());
            var6_7.append("; ");
            var6_7.append(var4_10);
            e1.l(var6_7.toString(), var1_2);
            var1_1 = Script.V3(var1_2);
            return LuaValue.K2((String)var1_1);
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 == 2 && luaValue.h1()) {
                return ApiFunction.g3(writer, this.e0.g0.f, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.saveList(string file [, int flags = 0]) -> true || string with error";
        }
    }

    final class saveVariable
    extends ApiFunction {
        final Script e0;

        saveVariable(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 2;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            return new GgLib$saveVariable(this.e0.T).invoke(varargs);
        }

        @Override
        String k3() {
            return "gg.saveVariable(mixed variable, string filename) -> true || string with error";
        }
    }

    class searchAddress
    extends BusyApiFunction {
        final Script f0;

        searchAddress(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected final int Y2() {
            return 7;
        }

        @Override
        public final Varargs c3(Varargs varargs) {
            NumberFormatException numberFormatException2;
            block3: {
                this.f0.y3();
                if (this instanceof refineAddress && MainService.instance.p0 == 0L) {
                    return LuaValue.d;
                }
                try {
                    varargs = m1.k(this.f0.t3(), Script.D3(varargs.E(1)), varargs.a0(2, -1L), Script.f3(varargs.Y(3, 127)), Script.e3(varargs.Y(4, 0x20000000)), varargs.a0(5, 0L), varargs.a0(6, -1L), false, varargs.a0(7, 0L)) ? LuaValue.d : null;
                }
                catch (NumberFormatException numberFormatException2) {
                    break block3;
                }
                return varargs;
            }
            return LuaValue.K2(Script.V3(numberFormatException2));
        }

        @Override
        protected final boolean d3(Writer writer, int n3, LuaValue luaValue) {
            block6: {
                block3: {
                    block4: {
                        block5: {
                            if (n3 == 2) break block3;
                            if (n3 == 3) break block4;
                            if (n3 == 4) break block5;
                            if (n3 == 5 || n3 == 6) break block3;
                            break block6;
                        }
                        if (luaValue.h1()) {
                            return ApiFunction.g3(writer, this.f0.g0.d, luaValue);
                        }
                        break block6;
                    }
                    if (luaValue.h1()) {
                        return ApiFunction.g3(writer, this.f0.g0.b, luaValue);
                    }
                    break block6;
                }
                if (luaValue.j1()) {
                    return ApiFunction.h3(writer, luaValue);
                }
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        final String k3() {
            boolean bl = this instanceof refineAddress;
            String string2 = "gg.searchAddress(string text [, long mask = -1 [, int type = gg.TYPE_AUTO [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error";
            if (bl) {
                string2 = "gg.searchAddress(string text [, long mask = -1 [, int type = gg.TYPE_AUTO [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error".replace("searchAddress", "refineAddress");
            }
            return string2;
        }
    }

    final class searchFuzzy
    extends BusyApiFunction {
        final Script f0;

        searchFuzzy(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected int Y2() {
            return 6;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs c3(Varargs varargs) {
            this.f0.y3();
            try {
                int n3;
                int n4;
                if ((varargs.Y(2, 0) & 0x7F) != 0) {
                    n4 = Script.f3(varargs.Y(2, 127));
                    n3 = varargs.Y(3, 0x20000000);
                } else {
                    n4 = Script.f3(varargs.Y(3, 127));
                    n3 = varargs.Y(2, 0x20000000);
                }
                n3 = Script.e3(n3);
                if (android.ext.t0.k(this.f0.t3(), Script.D3(varargs.Z(1, "0")), n4, n3, 1, varargs.a0(4, 0L), varargs.a0(5, -1L), varargs.a0(6, 0L))) return LuaValue.d;
                return null;
            }
            catch (NumberFormatException numberFormatException) {
                return LuaValue.K2(Script.V3(numberFormatException));
            }
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 != 2) {
                if (n3 != 3) {
                    if ((n3 == 4 || n3 == 5) && luaValue.j1()) {
                        return ApiFunction.h3(writer, luaValue);
                    }
                } else if (luaValue.h1()) {
                    return ApiFunction.g3(writer, this.f0.g0.b, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, this.f0.g0.c, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.searchFuzzy([string difference = '0' [, int sign = gg.SIGN_FUZZY_EQUAL [, int type = gg.TYPE_AUTO [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error";
        }
    }

    class searchNumber
    extends BusyApiFunction {
        final Script f0;

        searchNumber(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected final int Y2() {
            return 7;
        }

        @Override
        public final Varargs c3(Varargs varargs) {
            NumberFormatException numberFormatException2;
            block3: {
                this.f0.y3();
                if (this instanceof refineNumber && MainService.instance.p0 == 0L) {
                    return LuaValue.d;
                }
                try {
                    varargs = i2.n(this.f0.t3(), Script.D3(varargs.E(1)), Script.f3(varargs.Y(2, 127)), varargs.V(3, false), Script.e3(varargs.Y(4, 0x20000000)), varargs.a0(5, 0L), varargs.a0(6, -1L), false, varargs.a0(7, 0L)) ? LuaValue.d : null;
                }
                catch (NumberFormatException numberFormatException2) {
                    break block3;
                }
                return varargs;
            }
            return LuaValue.K2(Script.V3(numberFormatException2));
        }

        @Override
        protected final boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 != 2) {
                if (n3 != 4) {
                    if ((n3 == 5 || n3 == 6) && luaValue.j1()) {
                        return ApiFunction.h3(writer, luaValue);
                    }
                } else if (luaValue.h1()) {
                    return ApiFunction.g3(writer, this.f0.g0.d, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, this.f0.g0.b, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        final String k3() {
            boolean bl = this instanceof refineNumber;
            String string2 = "gg.searchNumber(string text [, int type = gg.TYPE_AUTO [, bool encrypted = false [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error";
            if (bl) {
                string2 = "gg.searchNumber(string text [, int type = gg.TYPE_AUTO [, bool encrypted = false [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error".replace("searchNumber", "refineNumber");
            }
            return string2;
        }
    }

    final class searchPointer
    extends BusyApiFunction {
        final Script f0;

        searchPointer(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected int Y2() {
            return 4;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            NumberFormatException numberFormatException2;
            block2: {
                this.f0.y3();
                try {
                    short s3 = (short)varargs.D(1);
                    varargs = i2.p(this.f0.t3(), s3, varargs.a0(2, 0L), varargs.a0(3, -1L), varargs.a0(4, 0L)) ? LuaValue.d : null;
                }
                catch (NumberFormatException numberFormatException2) {
                    break block2;
                }
                return varargs;
            }
            return LuaValue.K2(Script.V3(numberFormatException2));
        }

        @Override
        String k3() {
            return "gg.searchPointer(int maxOffset [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]) -> true || string with error";
        }
    }

    final class setRanges
    extends ApiFunction {
        final Script e0;

        setRanges(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            int n3;
            Config.b((int)2131034189).d = n3 = varargs.D(1);
            Config.k();
            return LuaValue.c;
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 == 1 && luaValue.h1()) {
                return ApiFunction.g3(writer, this.e0.g0.a, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.setRanges(int ranges) -> nil";
        }
    }

    final class setSpeed
    extends BusyApiFunction {
        final Script f0;

        setSpeed(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs c3(Varargs object) {
            double d4 = ((Varargs)object).B(1);
            if (!(d4 < 1.0E-9) && !(d4 > 1.0E9)) {
                MainService.instance.S0(this.f0.t3(), d4);
                return null;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Speed outside range: ");
            ((StringBuilder)object).append(d4);
            ((StringBuilder)object).append(" (");
            ((StringBuilder)object).append(1.0E-9);
            ((StringBuilder)object).append("; ");
            ((StringBuilder)object).append(1.0E9);
            ((StringBuilder)object).append(')');
            return LuaValue.K2(((StringBuilder)object).toString());
        }

        @Override
        String k3() {
            return "gg.setSpeed(double speed) -> true || string with error";
        }
    }

    final class setValues
    extends ApiFunction {
        final Script e0;

        setValues(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs b3(Varargs object) {
            Runnable runnable = ((Varargs)object).I(1);
            object = MainService.instance;
            Object object2 = ((MainService)object).v0;
            boolean bl = object2 != null ? ((z1.d)object2).n : false;
            object2 = ((MainService)object).i;
            LuaString luaString = t0[1];
            runnable = ((LuaTable)((Object)runnable)).s3();
            while (true) {
                int n3;
                c c4;
                if (!((LuaTable.i)((Object)runnable)).c()) {
                    ((MainService)object).i.C(this.e0.t3());
                    object = new Object();
                    synchronized (object) {
                        runnable = new Runnable(this, object){
                            final Object a;
                            final setValues b;
                            {
                                this.b = setValues2;
                                this.a = object;
                            }

                            /*
                             * Enabled aggressive block sorting
                             * Enabled unnecessary exception pruning
                             * Enabled aggressive exception aggregation
                             */
                            @Override
                            public void run() {
                                MainService.instance.f0(this.b.e0.t3());
                                Object object = this.a;
                                synchronized (object) {
                                    this.a.notifyAll();
                                    return;
                                }
                            }
                        };
                        n2.i(runnable);
                        Script.W3(object);
                        return LuaValue.d;
                    }
                }
                Object object3 = ((LuaTable.i)((Object)runnable)).d().H0();
                try {
                    c4 = Script.T3(null, (LuaTable)object3, (byte)1, bl);
                }
                catch (NumberFormatException numberFormatException) {
                    throw Script.m3(((LuaTable.i)((Object)runnable)).b(), (LuaValue)object3, numberFormatException);
                }
                c4.c = n3 = c4.c & 0x7F;
                if (n3 == 0) continue;
                n3 = (object3 = i2.x(Script.D3(Script.h3((LuaTable)object3, luaString)), false)) != null ? ((i2.c)object3).b : 0;
                ((f0)object2).a(c4, n3);
            }
        }

        @Override
        String k3() {
            return "gg.setValues(table values) -> true || string with error";
        }
    }

    final class setVisible
    extends ApiFunction {
        private int e0;
        private long f0;
        final Script g0;

        setVisible(Script script) {
            this.g0 = script;
            this.e0 = 0;
            this.f0 = 0L;
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            block8: {
                int n3;
                block9: {
                    MainService mainService;
                    block7: {
                        mainService = MainService.instance;
                        if (!varargs.z(1)) break block7;
                        if (mainService.n != null) break block8;
                        mainService.c0();
                        break block9;
                    }
                    if (mainService.n != null) {
                        mainService.u(false);
                        n3 = 1;
                    } else {
                        n3 = 0;
                    }
                    mainService.h0.g();
                    if (n3 == 0) break block8;
                }
                long l3 = System.nanoTime() / 60000000000L;
                if (l3 != this.f0) {
                    this.f0 = l3;
                    this.e0 = 0;
                }
                this.e0 = n3 = this.e0 + 1;
                if (n3 > 30) {
                    this.g0.x3(2);
                }
            }
            return LuaValue.c;
        }

        @Override
        String k3() {
            return "gg.setVisible(bool visible) -> nil";
        }
    }

    final class showUiButton
    extends ApiFunction {
        final Script e0;

        showUiButton(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            MainService.instance.R0(true);
            return LuaValue.c;
        }

        @Override
        String k3() {
            return "gg.showUiButton() -> nil";
        }
    }

    final class skipRestoreState
    extends ApiFunction {
        final Script e0;

        skipRestoreState(Script script) {
            this.e0 = script;
        }

        @Override
        protected int Y2() {
            return 0;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            this.e0.m0 = null;
            return LuaValue.c;
        }

        @Override
        String k3() {
            return "gg.skipRestoreState() -> nil";
        }
    }

    static final class sleep
    extends ApiFunction {
        sleep() {
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs b3(Varargs object) {
            int n3 = ((Varargs)object).D(1);
            if (n3 >= 0) {
                long l3 = n3;
                try {
                    Thread.sleep(l3);
                    return LuaValue.c;
                }
                catch (InterruptedException interruptedException) {
                    e1.s("Interrupted sleep", interruptedException);
                    throw new luaj.d(interruptedException);
                }
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("milliseconds < 0: ");
            ((StringBuilder)object).append(n3);
            throw new luaj.d(((StringBuilder)object).toString());
        }

        @Override
        String k3() {
            return "gg.sleep(int milliseconds) -> nil";
        }
    }

    final class startFuzzy
    extends BusyApiFunction {
        final Script f0;

        startFuzzy(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected int Y2() {
            return 4;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            NumberFormatException numberFormatException2;
            block2: {
                this.f0.y3();
                try {
                    varargs = android.ext.t0.m(this.f0.t3(), Script.f3(varargs.Y(1, 127)), varargs.a0(2, 0L), varargs.a0(3, -1L), varargs.a0(4, 0L)) ? LuaValue.d : null;
                }
                catch (NumberFormatException numberFormatException2) {
                    break block2;
                }
                return varargs;
            }
            return LuaValue.K2(Script.V3(numberFormatException2));
        }

        @Override
        protected boolean d3(Writer writer, int n3, LuaValue luaValue) {
            if (n3 != 1) {
                if ((n3 == 2 || n3 == 3) && luaValue.j1()) {
                    return ApiFunction.h3(writer, luaValue);
                }
            } else if (luaValue.h1()) {
                return ApiFunction.g3(writer, this.f0.g0.b, luaValue);
            }
            return super.d3(writer, n3, luaValue);
        }

        @Override
        String k3() {
            return "gg.startFuzzy([int type = gg.TYPE_AUTO [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]) -> true || string with error";
        }
    }

    final class timeJump
    extends BusyApiFunction {
        final Script f0;

        timeJump(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected int Y2() {
            return 1;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            try {
                long l3 = o2.i(Script.D3(varargs.E(1)));
                MainService.instance.i.d(this.f0.t3(), l3);
                return null;
            }
            catch (NumberFormatException numberFormatException) {
                return LuaValue.K2(Script.V3(numberFormatException));
            }
        }

        @Override
        String k3() {
            return "gg.timeJump(string time) -> true || string with error";
        }
    }

    static final class toast
    extends ApiFunction {
        toast() {
        }

        @Override
        protected int Y2() {
            return 2;
        }

        @Override
        public Varargs b3(Varargs varargs) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Tools.N1(2131296928));
            stringBuilder.append(": ");
            stringBuilder.append(varargs.E(1));
            n2.i(new Runnable(this, stringBuilder.toString(), varargs.V(2, false)){
                final String a;
                final boolean b;
                final toast c;
                {
                    this.c = toast2;
                    this.a = string2;
                    this.b = bl;
                }

                @Override
                public void run() {
                    Tools.K1(b2.g(this.a), this.b ^ 1);
                }
            });
            return LuaValue.c;
        }

        @Override
        String k3() {
            return "gg.toast(string text [, bool fast = false]) -> nil";
        }
    }

    final class unrandomizer
    extends BusyApiFunction {
        final Script f0;

        unrandomizer(Script script) {
            this.f0 = script;
            super(script);
        }

        @Override
        protected int Y2() {
            return 4;
        }

        @Override
        public Varargs c3(Varargs varargs) {
            int n3;
            block4: {
                int n4;
                block3: {
                    n4 = varargs.Q(1) && varargs.Q(2) ? 0 : 2;
                    if (!varargs.Q(2)) break block3;
                    n3 = n4;
                    if (varargs.Q(3)) break block4;
                }
                n3 = n4 | 4;
            }
            MainService.instance.i.U0(this.f0.t3(), n3, varargs.a0(1, 0L), varargs.a0(2, 0L), varargs.W(3, 0.0), varargs.W(4, 0.0));
            return null;
        }

        @Override
        String k3() {
            return "gg.unrandomizer([long qword = nil [, long qincr = nil [, double double_ = nil [, double dincr = nil]]]]) -> true || string with error";
        }
    }

    final class wrap
    extends VarArgFunction {
        final LuaValue T;
        final String U;
        final int V;
        final Script W;

        wrap(Script script, String string2, LuaValue luaValue, int n3) {
            this.W = script;
            this.T = luaValue;
            this.U = string2;
            this.V = n3;
        }

        @Override
        public String g0() {
            return this.T.g0();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs invoke(Varargs varargs) {
            DebugLog debugLog = w0;
            Object object = debugLog == null ? null : debugLog.a;
            if (object != null) {
                long l3;
                block8: {
                    l3 = System.nanoTime();
                    try {
                        ((Writer)object).write(this.U);
                        ((Writer)object).write("(");
                        int n3 = varargs.U();
                        int n4 = this.V;
                        int n5 = n3;
                        if (n4 >= 0) {
                            n5 = n3;
                            if (n3 > n4) {
                                n5 = n4;
                            }
                        }
                        for (n4 = 1; n4 <= n5; ++n4) {
                            if (n4 != 1) {
                                ((Writer)object).write(", ");
                            }
                            ApiFunction.e3(null, (Writer)object, n4, varargs.v(n4));
                        }
                        ((Writer)object).write(")\n");
                        break block8;
                    }
                    catch (Throwable throwable) {}
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Failed write log for ");
                    ((StringBuilder)object).append(this.U);
                    e1.s(((StringBuilder)object).toString(), throwable);
                }
                object = debugLog.b;
                ((Globals)object).b0 = (int)((long)((Globals)object).b0 + (System.nanoTime() - l3) / 1000000L);
            }
            return this.T.invoke(varargs);
        }
    }
}

