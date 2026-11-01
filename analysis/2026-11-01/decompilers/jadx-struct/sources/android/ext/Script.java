package android.ext;

import android.content.Context;
import android.os.Build$VERSION;
import catch_.me_.if_.you_.can_.R$string;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
import luaj.LuaTable$i;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.BaseLib;
import luaj.lib.BaseLib$b;
import luaj.lib.Bit32Lib;
import luaj.lib.DebugLib;
import luaj.lib.MathLib;
import luaj.lib.OsLib;
import luaj.lib.PackageLib;
import luaj.lib.StringLib;
import luaj.lib.TableLib;
import luaj.lib.TwoArgFunction;
import luaj.lib.Utf8Lib;

/* JADX INFO: loaded from: classes.dex */
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
    static Script$DebugLog w0;
    final Object U;
    final int X;
    final String Y;
    private final byte Z;
    Script$Consts g0;
    private String h0;
    private String i0;
    private String j0;
    private String k0;
    volatile String l0;
    volatile Script$SavedState m0;
    private volatile int a0 = 0;
    private volatile byte b0 = -1;
    volatile boolean c0 = true;
    byte d0 = 0;
    boolean e0 = false;
    volatile int f0 = 0;
    final Globals T = new Globals();
    final Thread V = new Script$ScriptThread(this);
    final Script$Logger W = new Script$Logger();

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
            arrayList.add(new Script$Const("gg." + str, i));
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
            try {
                arrayList = (ArrayList) map.get(Byte.valueOf(b2));
            } catch (Throwable th) {
                throw th;
            }
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
        if (th instanceof t1$a) {
            ((t1$a) th).d();
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
            try {
                map.put(Byte.valueOf(b2), arrayList);
            } catch (Throwable th) {
                throw th;
            }
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
            try {
                arrayList = (ArrayList) map.remove(Byte.valueOf(b2));
            } catch (Throwable th) {
                throw th;
            }
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

    private static LuaTable n3(int[] iArr, c cVar) {
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

    public static Script$Consts p3(ArrayList arrayList) {
        Script$Consts script$Consts = (Script$Consts) o0.get();
        if (script$Consts != null) {
            return script$Consts;
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
        for (Script$Const script$Const : arrayList) {
            String str = script$Const.f369a;
            if (str.startsWith("gg.REGION_")) {
                arrayList2.add(script$Const);
            } else if (str.startsWith("gg.TYPE_")) {
                arrayList3.add(script$Const);
            } else if (str.startsWith("gg.SIGN_FUZZY_")) {
                arrayList4.add(script$Const);
            } else if (str.startsWith("gg.SIGN_")) {
                arrayList5.add(script$Const);
            } else if (str.startsWith("gg.LOAD_")) {
                arrayList6.add(script$Const);
            } else if (str.startsWith("gg.SAVE_")) {
                arrayList7.add(script$Const);
            } else if (str.startsWith("gg.PROT_")) {
                arrayList8.add(script$Const);
            } else if (str.startsWith("gg.POINTER_")) {
                arrayList9.add(script$Const);
            } else if (str.startsWith("gg.DUMP_")) {
                arrayList10.add(script$Const);
            } else if (str.startsWith("gg.ASM_")) {
                arrayList11.add(script$Const);
            }
        }
        Script$Consts script$Consts2 = new Script$Consts();
        script$Consts2.f371a = (Script$Const[]) arrayList2.toArray(new Script$Const[arrayList2.size()]);
        script$Consts2.f372b = (Script$Const[]) arrayList3.toArray(new Script$Const[arrayList3.size()]);
        script$Consts2.f373c = (Script$Const[]) arrayList4.toArray(new Script$Const[arrayList4.size()]);
        script$Consts2.f374d = (Script$Const[]) arrayList5.toArray(new Script$Const[arrayList5.size()]);
        script$Consts2.f375e = (Script$Const[]) arrayList6.toArray(new Script$Const[arrayList6.size()]);
        script$Consts2.f376f = (Script$Const[]) arrayList7.toArray(new Script$Const[arrayList7.size()]);
        script$Consts2.f377g = (Script$Const[]) arrayList8.toArray(new Script$Const[arrayList8.size()]);
        script$Consts2.h = (Script$Const[]) arrayList9.toArray(new Script$Const[arrayList9.size()]);
        script$Consts2.i = (Script$Const[]) arrayList10.toArray(new Script$Const[arrayList10.size()]);
        script$Consts2.j = (Script$Const[]) arrayList11.toArray(new Script$Const[arrayList11.size()]);
        o0 = new WeakReference(script$Consts2);
        return script$Consts2;
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
            i2$c i2_cX = i2.x(strD3, false);
            if (i2_cX != null) {
                strD3 = i2_cX.f1017a;
            }
            return c.e(j, strD3, i);
        } catch (luaj.d e2) {
            throw b3(luaValue, e2);
        }
    }

    static ArrayList r3(Varargs varargs) {
        LuaTable luaTableI = varargs.I(1);
        ArrayList arrayList = new ArrayList();
        z1$d z1_d = MainService.instance.v0;
        boolean z = z1_d != null ? z1_d.n : false;
        LuaTable$i luaTable$iS3 = luaTableI.s3();
        while (luaTable$iS3.c()) {
            c cVarT3 = T3(null, luaTable$iS3.d().H0(), (byte) 2, z);
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
        globals.t1(new Script$IoLibSafe(this));
        globals.t1(new Script$OsLibSafe(this));
        globals.t1(new DebugLib());
        v3();
    }

    private void v3() {
        Globals globals = this.T;
        globals.c0 = new Script$ScriptPrintStream(this, false);
        globals.d0 = new Script$ScriptPrintStream(this, true);
        globals.t1(this);
    }

    void L3() {
        Script$SavedState script$SavedState = this.m0;
        if (script$SavedState == null) {
            return;
        }
        n2.i(new Script$1(this, script$SavedState));
    }

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
            BaseLib$b baseLib$b = new BaseLib$b(new FileInputStream(file));
            try {
                try {
                    luaValueO3 = this.T.O3(baseLib$b, '@' + absolutePath, "bt", this.T);
                    if (luaValueO3 instanceof LuaClosure) {
                        ((LuaClosure) luaValueO3).U = absolutePath;
                    }
                    baseLib$b.close();
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
                            Z2(Tools.N1(R$string.assembled) + ":\n" + str);
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
                baseLib$b.close();
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
            PrintStream printStream = luaj.g.f1716b;
            try {
                luaj.g.f1716b = new PrintStream(str3);
                luaj.g.A(luaClosureW0.R);
                luaj.g.f1716b.close();
                luaj.g.M(luaClosureW0, str3 + ".tail");
            } catch (Throwable th3) {
                e1.l("Failed disassemble " + luaClosureW0 + " into '" + str3 + '\'', th3);
            }
            luaj.g.f1716b = printStream;
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
        w0 = bufferedWriter == null ? null : new Script$DebugLog(bufferedWriter, this.T);
        PrintStream printStream2 = luaj.g.f1716b;
        try {
            Globals globals = this.T;
            luaj.g.f1716b = globals.c0;
            K3(globals);
            luaValueO3.call();
            luaj.g.f1716b = printStream2;
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
        } catch (Throwable th6) {
            luaj.g.f1716b = printStream2;
            if (bufferedWriter != null) {
                w0 = null;
                try {
                    bufferedWriter.close();
                } catch (Throwable th7) {
                    e1.s("Failed close log", th7);
                }
            }
            if ((this.X & 2) != 0) {
                this.T.g0.Z2();
            }
            K3(null);
            throw th6;
        }
    }

    void N3() {
        Script$SavedState script$SavedState = new Script$SavedState(null);
        script$SavedState.f389a = Config.i;
        this.m0 = script$SavedState;
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
        luaTable.a2("ANDROID_SDK_INT", Build$VERSION.SDK_INT);
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
        luaTable.c2("require", new Script$require(this));
        luaTable.c2("toast", new Script$toast());
        luaTable.c2("alert", new Script$alert());
        luaTable.c2("prompt", new Script$prompt(this));
        luaTable.c2("choice", new Script$choice());
        luaTable.c2("multiChoice", new Script$multiChoice());
        luaTable.c2("isVisible", new Script$isVisible());
        luaTable.c2("setVisible", new Script$setVisible(this));
        luaTable.c2("getActiveTab", new Script$getActiveTab());
        luaTable.c2("showUiButton", new Script$showUiButton(this));
        luaTable.c2("hideUiButton", new Script$hideUiButton(this));
        luaTable.c2("isClickedUiButton", new Script$isClickedUiButton());
        Script$getTargetPackage script$getTargetPackage = new Script$getTargetPackage();
        luaTable.c2("getTargetPackage", script$getTargetPackage);
        luaTable.c2("getTargetInfo", new Script$getTargetInfo());
        luaTable.c2("isPackageInstalled", new Script$isPackageInstalled());
        luaTable.c2("processKill", new Script$processKill(this));
        luaTable.c2("saveVariable", new Script$saveVariable(this));
        luaTable.c2("makeRequest", new Script$makeRequest(this));
        Script$getResultsCount script$getResultsCount = new Script$getResultsCount();
        luaTable.c2("getResultsCount", script$getResultsCount);
        luaTable.c2("getResults", new Script$getResults(this));
        luaTable.c2("editAll", new Script$editAll(this));
        luaTable.c2("clearResults", new Script$clearResults(this));
        luaTable.c2("removeResults", new Script$removeResults(this));
        luaTable.c2("loadResults", new Script$loadResults(this));
        luaTable.c2("getSelectedResults", new Script$getSelectedResults(this));
        luaTable.c2("setValues", new Script$setValues(this));
        luaTable.c2("getValues", new Script$getValues(this));
        luaTable.c2("getValuesRange", new Script$getValuesRange(this));
        luaTable.c2("processPause", new Script$processPause(this));
        luaTable.c2("processResume", new Script$processResume(this));
        luaTable.c2("processToggle", new Script$processToggle(this));
        luaTable.c2("isProcessPaused", new Script$isProcessPaused());
        luaTable.c2("timeJump", new Script$timeJump(this));
        luaTable.c2("setSpeed", new Script$setSpeed(this));
        luaTable.c2("getSpeed", new Script$getSpeed());
        luaTable.c2("unrandomizer", new Script$unrandomizer(this));
        luaTable.c2("gotoAddress", new Script$gotoAddress());
        luaTable.c2("getSelectedElements", new Script$getSelectedElements(this));
        luaTable.c2("getRanges", new Script$getRanges());
        luaTable.c2("setRanges", new Script$setRanges(this));
        luaTable.c2("copyMemory", new Script$copyMemory(this));
        luaTable.c2("dumpMemory", new Script$dumpMemory(this));
        luaTable.c2("loadList", new Script$loadList(this));
        luaTable.c2("saveList", new Script$saveList(this));
        luaTable.c2("clearList", new Script$clearList(this));
        luaTable.c2("addListItems", new Script$addListItems(this));
        luaTable.c2("getListItems", new Script$getListItems(this));
        luaTable.c2("removeListItems", new Script$removeListItems(this));
        luaTable.c2("getSelectedListItems", new Script$getSelectedListItems(this));
        luaTable.c2("searchNumber", new Script$searchNumber(this));
        luaTable.c2("refineNumber", new Script$refineNumber(this));
        luaTable.c2("searchAddress", new Script$searchAddress(this));
        luaTable.c2("refineAddress", new Script$refineAddress(this));
        luaTable.c2("startFuzzy", new Script$startFuzzy(this));
        luaTable.c2("searchFuzzy", new Script$searchFuzzy(this));
        Script$searchPointer script$searchPointer = new Script$searchPointer(this);
        luaTable.c2("searchPointer", script$searchPointer);
        luaTable.c2("sleep", new Script$sleep());
        luaTable.c2("copyText", new Script$copyText());
        luaTable.c2("disasm", new Script$disasm(this));
        luaTable.c2("getLine", new Script$getLine(this));
        luaTable.c2("getFile", new Script$getFile(this));
        luaTable.c2("bytes", new Script$bytes(this));
        luaTable.c2("skipRestoreState", new Script$skipRestoreState(this));
        luaTable.c2("getRangesList", new Script$getRangesList(this));
        luaTable.c2("allocatePage", new Script$allocatePage(this));
        luaTable.c2("getLocale", new Script$getLocale(this));
        luaTable.c2("numberToLocale", new Script$numberToLocale(this));
        luaTable.c2("numberFromLocale", new Script$numberFromLocale(this));
        luaTable.d2(LuaValue.K2("SIGN_INEQUAL").h3(), LuaValue.I2(268435456L));
        luaTable.d2(LuaValue.K2("SIGN_SMALLER").h3(), LuaValue.I2(134217728L));
        luaTable.d2(LuaValue.K2("SIGN_LARGER").h3(), LuaValue.I2(67108864L));
        luaTable.d2(LuaValue.K2("getSelectedPackage").h3(), script$getTargetPackage);
        luaTable.d2(LuaValue.K2("getResultCount").h3(), script$getResultsCount);
        luaTable.d2(LuaValue.K2("internal1").h3(), new Script$internal1(this));
        luaTable.d2(LuaValue.K2("internal2").h3(), new Script$internal2(this));
        luaTable.d2(LuaValue.K2("internal3").h3(), script$searchPointer);
        luaValue2.i2("gg", luaTable);
        luaValue2.T0("package").T0("loaded").i2("gg", luaTable);
        LuaValue luaValueT0 = luaValue2.T0("os");
        luaValueT0.i2("exit", new Script$exit());
        luaValueT0.i2("remove", new Script$wrap(this, "os.remove", luaValueT0.T0("remove"), 1));
        luaValueT0.i2("rename", new Script$wrap(this, "os.rename", luaValueT0.T0("rename"), 2));
        luaValueT0.i2("tmpname", new Script$wrap(this, "os.tmpname", luaValueT0.T0("tmpname"), 0));
        LuaValue luaValueT1 = luaValue2.T0("string");
        luaValueT1.i2("format", new Script$format(luaValueT1.T0("format")));
        luaValueT1.i2("dump", new Script$wrap(this, "string.dump", luaValueT1.T0("dump"), 1));
        LuaValue luaValueT2 = luaValue2.T0("io");
        luaValueT2.i2("open", new Script$wrap(this, "io.open", luaValueT2.T0("open"), 2));
        luaValueT2.i2("input", new Script$wrap(this, "io.input", luaValueT2.T0("input"), 1));
        luaValueT2.i2("output", new Script$wrap(this, "io.output", luaValueT2.T0("output"), 1));
        luaValueT2.i2("tmpfile", new Script$wrap(this, "io.tmpfile", luaValueT2.T0("tmpfile"), 0));
        luaValueT2.i2("lines", new Script$wrap(this, "io.lines", luaValueT2.T0("lines"), 1));
        LuaValue luaValueT3 = luaValue2.T0("debug");
        luaValueT3.i2("debug", new Script$wrap(this, "debug.debug", luaValueT3.T0("debug"), 0));
        luaValueT3.i2("gethook", new Script$wrap(this, "debug.gethook", luaValueT3.T0("gethook"), 1));
        luaValueT3.i2("getinfo", new Script$wrap(this, "debug.getinfo", luaValueT3.T0("getinfo"), 3));
        luaValueT3.i2("getlocal", new Script$wrap(this, "debug.getlocal", luaValueT3.T0("getlocal"), 3));
        luaValueT3.i2("getmetatable", new Script$wrap(this, "debug.getmetatable", luaValueT3.T0("getmetatable"), 1));
        luaValueT3.i2("getregistry", new Script$wrap(this, "debug.getregistry", luaValueT3.T0("getregistry"), 0));
        luaValueT3.i2("getupvalue", new Script$wrap(this, "debug.getupvalue", luaValueT3.T0("getupvalue"), 2));
        luaValueT3.i2("getuservalue", new Script$wrap(this, "debug.getuservalue", luaValueT3.T0("getuservalue"), 1));
        luaValueT3.i2("sethook", new Script$wrap(this, "debug.sethook", luaValueT3.T0("sethook"), 4));
        luaValueT3.i2("setlocal", new Script$wrap(this, "debug.setlocal", luaValueT3.T0("setlocal"), 4));
        luaValueT3.i2("setmetatable", new Script$wrap(this, "debug.setmetatable", luaValueT3.T0("setmetatable"), 2));
        luaValueT3.i2("setupvalue", new Script$wrap(this, "debug.setupvalue", luaValueT3.T0("setupvalue"), 3));
        luaValueT3.i2("setuservalue", new Script$wrap(this, "debug.setuservalue", luaValueT3.T0("setuservalue"), 2));
        luaValueT3.i2("traceback", new Script$wrap(this, "debug.traceback", luaValueT3.T0("traceback"), 3));
        luaValueT3.i2("upvalueid", new Script$wrap(this, "debug.upvalueid", luaValueT3.T0("upvalueid"), 2));
        luaValueT3.i2("upvaluejoin", new Script$wrap(this, "debug.upvaluejoin", luaValueT3.T0("upvaluejoin"), 4));
        this.g0 = arrayList != null ? p3(arrayList) : new Script$Consts();
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
}
