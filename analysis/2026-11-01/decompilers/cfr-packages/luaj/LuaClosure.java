/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import android.ext.Script;
import luaj.Globals;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.d;
import luaj.g;
import luaj.h;
import luaj.i;
import luaj.lib.DebugLib;

public class LuaClosure
extends LuaFunction {
    private static final i[] X = new i[0];
    private static int Y;
    public final h R;
    public i[] S;
    final Globals T;
    public String U;
    private Varargs V;
    public volatile int W;

    public LuaClosure(h object, LuaValue luaValue, boolean bl) {
        Object var6_4 = null;
        this.U = null;
        this.V = LuaValue.f;
        this.R = object;
        object = object.f;
        if (object != null && ((f.d[])object).length != 0) {
            int n3 = ((f.d[])object).length;
            object = new i[n3];
            if (bl) {
                LuaValue[] luaValueArray = new LuaValue[n3];
                luaValueArray[0] = luaValue;
                object[0] = new i(luaValueArray, 0);
                for (int i3 = 1; i3 < n3; ++i3) {
                    luaValueArray[i3] = LuaValue.c;
                    object[i3] = new i(luaValueArray, i3);
                }
            }
            this.S = object;
        } else {
            this.S = X;
        }
        object = var6_4;
        if (luaValue instanceof Globals) {
            object = (Globals)luaValue;
        }
        this.T = object;
    }

    private LuaValue V2(LuaValue luaValue) {
        if (luaValue != null) {
            return luaValue;
        }
        throw new NullPointerException("return null as LuaValue");
    }

    private Varargs W2(Varargs varargs) {
        if (varargs != null) {
            return varargs;
        }
        throw new NullPointerException("return null as Varargs");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void X2(Globals luaValue, d d4, StringBuilder object) {
        LuaValue luaValue2;
        if (luaValue != null) {
            void var1_5;
            LuaThread luaThread = luaValue.f0;
            if (luaThread.S != null) {
                String string2;
                var1_5.e = string2 = ((StringBuilder)((Object)luaValue2)).toString();
                try {
                    void var0_3;
                    luaValue2 = luaThread.S;
                    LuaValue luaValue3 = var1_5.g;
                    if (luaValue3 == null) {
                        LuaString luaString = LuaValue.K2(string2);
                    }
                    var1_5.g = luaValue2.call((LuaValue)var0_3);
                    return;
                }
                catch (Throwable throwable) {
                    var1_5.g = LuaValue.K2("error in error handling");
                }
                return;
            }
            if (luaValue.i0 != null) {
                ((StringBuilder)((Object)luaValue2)).append('\n');
                ((StringBuilder)((Object)luaValue2)).append(luaValue.i0.m3((Globals)luaValue, var1_5.a));
            }
        }
        var1_5.e = ((StringBuilder)((Object)luaValue2)).toString();
    }

    private i Z2(LuaValue[] object, short s3, i[] iArray) {
        int n3 = iArray.length;
        int n4 = -1;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n5;
            i i4 = iArray[i3];
            if (i4 == null) {
                n5 = n4;
                if (n4 < 0) {
                    n5 = i3;
                }
            } else {
                n5 = n4;
                if (i4.b == s3) {
                    return i4;
                }
            }
            n4 = n5;
        }
        if (n4 >= 0) {
            iArray[n4] = object = new i((LuaValue[])object, s3);
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("No space for upvalue ");
        ((StringBuilder)object).append(n3);
        LuaValue.R0(((StringBuilder)object).toString());
        return null;
    }

    private LuaValue[] a3() {
        int n3 = this.R.l;
        LuaValue[] luaValueArray = new LuaValue[n3];
        System.arraycopy(LuaValue.O, 0, luaValueArray, 0, n3);
        return luaValueArray;
    }

    private static void c3(Globals globals, d d4, h h4, int n3, String string2) {
        Object object;
        if (d4.e != null) {
            return;
        }
        if (h4 != null) {
            Object object2;
            String string3 = "?";
            if (globals != null && (object = globals.i0) != null) {
                object = object2 = ((DebugLib)object).d3(d4.a);
                if (object2 != null) {
                    object = ((DebugLib.a)object2).i();
                    if (object == null) {
                        object = "?";
                    }
                    d4.c = object;
                    d4.d = ((DebugLib.a)object2).a();
                    object = object2;
                }
            } else {
                object = null;
            }
            if (object == null) {
                object2 = h4.g;
                object = string3;
                if (object2 != null) {
                    object = ((LuaString)object2).g0();
                }
                d4.c = object;
                object = h4.d;
                Object object3 = object != null && n3 >= 0 && n3 < ((Object)object).length ? (Object)object[n3] : -1;
                d4.d = object3;
            }
            d4.d();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(d4.getMessage());
        if (string2 != null) {
            ((StringBuilder)object).append(" (");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(")");
        }
        ((StringBuilder)object).append("\nlevel = ");
        ((StringBuilder)object).append(d4.a);
        if (h4 != null) {
            ((StringBuilder)object).append(", const = ");
            ((StringBuilder)object).append(h4.a.length);
            ((StringBuilder)object).append(", proto = ");
            ((StringBuilder)object).append(h4.c.length);
            ((StringBuilder)object).append(", upval = ");
            ((StringBuilder)object).append(h4.f.length);
            ((StringBuilder)object).append(", vars = ");
            ((StringBuilder)object).append(h4.l);
            ((StringBuilder)object).append(", code = ");
            ((StringBuilder)object).append(h4.b.length);
            ((StringBuilder)object).append('\n');
            if (n3 >= 0 && n3 < h4.b.length) {
                luaj.g.F((StringBuilder)object, h4, n3, null);
                ((StringBuilder)object).append('\n');
                luaj.g.v((StringBuilder)object, n3, h4.b[n3]);
            } else {
                ((StringBuilder)object).append("PC ");
                ((StringBuilder)object).append(n3);
            }
        }
        LuaClosure.X2(globals, d4, (StringBuilder)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Varargs d3(Globals luaValue, LuaFunction varargs, LuaValue luaValue2, Varargs varargs2) {
        DebugLib debugLib;
        if (luaValue != null && (debugLib = ((Globals)luaValue).i0) != null) {
            debugLib.j3((LuaFunction)varargs, false);
        }
        int n3 = Y;
        Y = 0;
        try {
            varargs = LuaValue.N2(LuaValue.d, luaValue2.invoke(varargs2));
            Y = n3;
            if (luaValue != null && (luaValue = ((Globals)luaValue).i0) != null) {
                ((DebugLib)luaValue).l3();
            }
            return varargs;
        }
        catch (Throwable throwable) {
            Throwable throwable22;
            block10: {
                Object object;
                try {
                    object = throwable instanceof d ? (d)throwable : new d.a(throwable);
                }
                catch (Throwable throwable22) {
                    break block10;
                }
                if (((d)object).e == null) {
                    LuaClosure.c3((Globals)luaValue, (d)object, null, 0, null);
                }
                object = ((d)object).b();
                luaValue2 = LuaValue.e;
                if (object == null) {
                    object = LuaValue.c;
                }
                object = LuaValue.N2(luaValue2, (Varargs)object);
                Y = n3;
                if (luaValue != null && (luaValue = ((Globals)luaValue).i0) != null) {
                    ((DebugLib)luaValue).l3();
                }
                return object;
            }
            Y = n3;
            if (luaValue != null && (luaValue = ((Globals)luaValue).i0) != null) {
                ((DebugLib)luaValue).l3();
            }
            throw throwable22;
        }
    }

    private void e3(LuaValue luaValue) {
        if (luaValue instanceof Script.DebugFunction) {
            ((Script.DebugFunction)luaValue).l3(this);
        }
    }

    private static d g3(int n3, int n4, int n5) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Damaged script ");
        stringBuilder.append(n3);
        stringBuilder.append(": an attempt to get an upvalue with index ");
        stringBuilder.append(n4);
        stringBuilder.append(" when there are ");
        stringBuilder.append(n5);
        stringBuilder.append(" in total.");
        return new d(stringBuilder.toString());
    }

    @Override
    public final Varargs D1(Varargs object, boolean bl) {
        LuaValue[] luaValueArray = this.a3();
        h h4 = this.R;
        if (h4.l >= h4.j) {
            int n3;
            int n4 = 0;
            while (true) {
                h4 = this.R;
                n3 = h4.j;
                if (n4 >= n3) break;
                n3 = n4 + 1;
                luaValueArray[n4] = ((Varargs)object).v(n3);
                n4 = n3;
            }
            object = h4.k == 0 ? LuaValue.f : ((Varargs)object).e0(n3 + 1);
            return this.Y2(luaValueArray, (Varargs)object, bl);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Damaged script: .maxstacksize (");
        ((StringBuilder)object).append(this.R.l);
        ((StringBuilder)object).append(") < .numparams (");
        ((StringBuilder)object).append(this.R.j);
        ((StringBuilder)object).append(")");
        throw new d(((StringBuilder)object).toString());
    }

    /*
     * Exception decompiling
     */
    protected Varargs Y2(LuaValue[] var1_1, Varargs var2_31, boolean var3_65) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [31, 30, 29, 28 : 676->680)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public Varargs b3() {
        return this.V;
    }

    @Override
    public final LuaValue call() {
        return this.Y2(this.a3(), LuaValue.f, false).w();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final LuaValue call(LuaValue luaValue) {
        LuaValue[] luaValueArray;
        block4: {
            block3: {
                h h4;
                block2: {
                    luaValueArray = this.a3();
                    h4 = this.R;
                    if (h4.j == 0) break block2;
                    luaValueArray[0] = luaValue;
                    break block3;
                }
                if (h4.k != 0) break block4;
            }
            luaValue = LuaValue.f;
        }
        return this.Y2(luaValueArray, luaValue, false).w();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final LuaValue call(LuaValue varargs, LuaValue luaValue) {
        h h4;
        LuaValue[] luaValueArray;
        block5: {
            luaValueArray = this.a3();
            h4 = this.R;
            int n3 = h4.j;
            if (n3 == 0) break block5;
            if (n3 != 1) {
                luaValueArray[0] = varargs;
                luaValueArray[1] = luaValue;
            } else {
                luaValueArray[0] = varargs;
                if (h4.k == 0) {
                    luaValue = LuaValue.f;
                }
                varargs = this.Y2(luaValueArray, luaValue, false);
                return varargs.w();
            }
        }
        if (h4.k == 0) {
            varargs = LuaValue.f;
        } else {
            varargs = LuaValue.N2((LuaValue)varargs, luaValue);
        }
        varargs = this.Y2(luaValueArray, varargs, false);
        return varargs.w();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final LuaValue call(LuaValue var1_1, LuaValue var2_2, LuaValue var3_3) {
        block6: {
            var5_4 = this.a3();
            var6_5 = this.R;
            var4_6 = var6_5.j;
            if (var4_6 == 0) break block6;
            if (var4_6 != 1) {
                if (var4_6 != 2) {
                    var5_4[0] = var1_1;
                    var5_4[1] = var2_2;
                    var5_4[2] = var3_3;
lbl10:
                    // 3 sources

                    while (true) {
                        var1_1 = LuaValue.f;
lbl12:
                        // 3 sources

                        while (true) {
                            var1_1 = this.Y2(var5_4, var1_1, false);
lbl14:
                            // 2 sources

                            return var1_1.w();
                        }
                        break;
                    }
                }
                var5_4[0] = var1_1;
                var5_4[1] = var2_2;
                if (var6_5.k == 0) {
                    var3_3 = LuaValue.f;
                }
                var1_1 = this.Y2(var5_4, var3_3, false);
                ** continue;
            }
            var5_4[0] = var1_1;
            if (var6_5.k == 0) ** GOTO lbl10
            var1_1 = LuaValue.N2(var2_2, var3_3);
            ** GOTO lbl12
        }
        ** while (var6_5.k == 0)
lbl28:
        // 1 sources

        var1_1 = LuaValue.M2((LuaValue)var1_1, var2_2, var3_3);
        ** while (true)
    }

    @Override
    public boolean f1() {
        return true;
    }

    public void f3(Varargs varargs) {
        this.V = varargs;
    }

    @Override
    public String g0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("function: ");
        stringBuilder.append(this.R.toString());
        return stringBuilder.toString();
    }

    @Override
    public final Varargs invoke(Varargs varargs) {
        return this.D1(varargs, false).N();
    }

    @Override
    public LuaClosure w0() {
        return this;
    }
}

