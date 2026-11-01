/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import android.ext.Script;
import android.ext.e1;
import android.ext.t2;
import f.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import luaj.LuaBoolean;
import luaj.LuaDouble;
import luaj.LuaLong;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

public class LuaTable
extends LuaValue
implements luaj.e {
    private static final LuaString T = LuaValue.K2("n");
    private static final m[] U = new m[0];
    private static volatile Set V = null;
    private static volatile int W = 0;
    private LuaValue[] P;
    private m[] Q;
    protected int R;
    protected luaj.e S;

    public LuaTable() {
        this.P = LuaValue.j;
        this.Q = U;
    }

    public LuaTable(int n3, int n4) {
        this.w3(n3, n4);
    }

    public LuaTable(Varargs varargs, int n3) {
        int n4 = 1;
        int n5 = n3 - 1;
        int n6 = Math.max(varargs.U() - n5, 0);
        this.w3(n6, 1);
        this.j2(T, LuaValue.I2(n6));
        for (n3 = n4; n3 <= n6; ++n3) {
            this.e2(n3, varargs.v(n3 + n5));
        }
    }

    public LuaTable(LuaValue[] luaValueArray, LuaValue[] luaValueArray2, Varargs varargs) {
        int n3;
        int n4 = 0;
        int n5 = luaValueArray != null ? luaValueArray.length : 0;
        int n6 = luaValueArray2 != null ? luaValueArray2.length : 0;
        int n7 = varargs != null ? varargs.U() : 0;
        this.w3(n7 + n6, n5 >> 1);
        n7 = 0;
        while (n7 < n6) {
            n3 = n7 + 1;
            this.Y1(n3, luaValueArray2[n7]);
            n7 = n3;
        }
        n7 = n4;
        if (varargs != null) {
            int n8 = varargs.U();
            n3 = 1;
            while (true) {
                n7 = n4;
                if (n3 > n8) break;
                this.Y1(n6 + n3, varargs.v(n3));
                ++n3;
            }
        }
        while (n7 < n5) {
            n6 = n7 + 1;
            if (!luaValueArray[n6].l1()) {
                this.d2(luaValueArray[n7], luaValueArray[n6]);
            }
            n7 += 2;
        }
    }

    private static LuaValue[] A3(LuaValue[] luaValueArray, int n3) {
        LuaValue[] luaValueArray2 = new LuaValue[n3];
        System.arraycopy(luaValueArray, 0, luaValueArray2, 0, luaValueArray.length);
        return luaValueArray2;
    }

    private void B3(int n3, int n4, LuaValue luaValue) {
        int n5;
        int n6 = n3;
        while ((n5 = n6 * 2) <= n4) {
            n3 = n5;
            if (n5 < n4) {
                int n7 = n5 + 1;
                n3 = n5;
                if (this.V2(n5, n7, luaValue)) {
                    n3 = n7;
                }
            }
            if (!this.V2(n6, n3, luaValue)) break;
            LuaValue luaValue2 = this.c3(n6);
            this.e2(n6, this.c3(n3));
            this.e2(n3, luaValue2);
            n6 = n3;
        }
    }

    private n C3(LuaValue luaValue) {
        if (this.R > 0) {
            for (m m3 = this.Q[this.i3(luaValue)]; m3 != null; m3 = m3.a()) {
                n n3 = m3.f(luaValue);
                if (n3 == null) continue;
                return n3;
            }
        }
        return null;
    }

    private boolean U2(int n3, LuaValue luaValue) {
        LuaValue[] luaValueArray;
        if (n3 > 0 && n3 <= (luaValueArray = this.P).length) {
            LuaValue luaValue2;
            if (luaValue.l1()) {
                luaValue2 = null;
            } else {
                luaj.e e4 = this.S;
                luaValue2 = luaValue;
                if (e4 != null) {
                    luaValue2 = e4.g(luaValue);
                }
            }
            luaValueArray[n3 - 1] = luaValue2;
            return true;
        }
        return false;
    }

    private boolean V2(int n3, int n4, LuaValue luaValue) {
        LuaValue luaValue2 = this.c3(n3);
        LuaValue luaValue3 = this.c3(n4);
        if (luaValue2 != null && luaValue3 != null) {
            if (luaValue != null) {
                return luaValue.call(luaValue2, luaValue3).w2();
            }
            return luaValue2.u1(luaValue3);
        }
        return false;
    }

    private int X2() {
        Object object;
        int n3 = 0;
        for (int i3 = 0; i3 < ((m[])(object = this.Q)).length; ++i3) {
            for (object = object[i3]; object != null; object = object.a()) {
                int n4 = n3;
                if (object.l() != null) {
                    n4 = n3 + 1;
                }
                n3 = n4;
            }
        }
        return n3;
    }

    private int Y2(int[] nArray) {
        Object object;
        int n3;
        int n4;
        int n5 = 0;
        int n6 = 0;
        int n7 = 1;
        int n8 = 0;
        while (true) {
            n4 = n5;
            n3 = n8;
            if (n6 >= 31) break;
            object = this.P;
            if (n7 > ((Object[])object).length) {
                n4 = n5;
                n3 = n8;
                break;
            }
            int n9 = Math.min(((Object[])object).length, 1 << n6);
            n4 = 0;
            while (n7 <= n9) {
                n3 = n4;
                if (this.P[n7 - 1] != null) {
                    n3 = n4 + 1;
                }
                ++n7;
                n4 = n3;
            }
            nArray[n6] = n4;
            n8 += n4;
            ++n6;
        }
        while (n4 < ((Object[])(object = this.Q)).length) {
            for (object = object[n4]; object != null; object = object.a()) {
                n6 = object.r(Integer.MAX_VALUE);
                n8 = n3;
                if (n6 > 0) {
                    n8 = LuaTable.u3(n6);
                    nArray[n8] = nArray[n8] + 1;
                    n8 = n3 + 1;
                }
                n3 = n8;
            }
            ++n4;
        }
        return n3;
    }

    protected static e Z2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue.i1()) {
            return new g(luaValue.y2(), luaValue2);
        }
        if (luaValue2 instanceof LuaBoolean) {
            return new b(luaValue, luaValue2.w2());
        }
        if (luaValue2 instanceof LuaLong) {
            long l3 = luaValue2.z2();
            int n3 = (int)l3;
            if ((long)n3 == l3) {
                return new h(luaValue, n3);
            }
            return new k(luaValue, l3);
        }
        if (luaValue2 instanceof LuaDouble) {
            double d4 = luaValue2.x2();
            float f4 = (float)d4;
            if ((double)f4 == d4) {
                return new f(luaValue, f4);
            }
            return new d(luaValue, d4);
        }
        return new l(luaValue, luaValue2);
    }

    private void a3() {
        LuaValue[] luaValueArray;
        for (int i3 = 0; i3 < (luaValueArray = this.P).length; ++i3) {
            this.S.o(luaValueArray, i3);
        }
    }

    /*
     * Unable to fully structure code
     */
    private Appendable b3(String var1_1, Appendable var2_2, Map var3_3) {
        var13_5 = var2_2;
        var19_6 = LuaTable.V;
        if (var19_6 != null) {
            var19_6.add(this);
        }
        var13_5.append("{ -- ");
        var13_5.append(this.E2());
        var13_5.append("(");
        var13_5.append(Integer.toHexString(this.hashCode()));
        var13_5.append(")\n");
        var8_7 = this.s1();
        LuaTable.W = var4_8 = LuaTable.W + var8_7;
        var6_9 = var8_7 == 0 ? 1 : (int)Math.max(1.0, Math.min(10.0, Math.log10(Math.abs(var8_7)) + 1.0));
        var16_10 = this.s3();
        var10_11 = var1_1.length() > 0;
        var7_12 = var1_1.length() == 1;
        var9_13 = var4_8 < 10000;
        var5_14 = 1;
        var15_15 = null;
        var12_16 = 1;
        var14_17 = null;
        block2: while (var16_10.c()) {
            block42: {
                block44: {
                    block45: {
                        block49: {
                            block47: {
                                block50: {
                                    block51: {
                                        block52: {
                                            block48: {
                                                block46: {
                                                    block43: {
                                                        block41: {
                                                            block40: {
                                                                block39: {
                                                                    block38: {
                                                                        block37: {
                                                                            block36: {
                                                                                var20_21 = var16_10.b();
                                                                                if (var7_12 && var3_3 != null && var3_3.get(var20_21) == null) continue;
                                                                                var4_8 = var5_14;
                                                                                var11_18 = var12_16;
                                                                                if (!var9_13) break block36;
                                                                                var4_8 = var5_14;
                                                                                var11_18 = var12_16;
                                                                                if (var12_16 == 0) break block36;
                                                                                var4_8 = var5_14;
                                                                                if (!var20_21.i1()) ** GOTO lbl-1000
                                                                                var11_18 = var20_21.y2();
                                                                                var4_8 = var5_14 + 1;
                                                                                if (var11_18 == var5_14) {
                                                                                    var11_18 = var12_16;
                                                                                } else lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    var11_18 = 0;
                                                                                }
                                                                            }
                                                                            if (!var20_21.d1()) break block37;
                                                                            var17_19 = var13_5;
                                                                            break block38;
                                                                        }
                                                                        var21_22 = var16_10.d();
                                                                        if (!var21_22.d1()) break block39;
                                                                        var17_19 = var13_5;
                                                                    }
lbl53:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var13_5 = var17_19;
                                                                        var5_14 = var4_8;
                                                                        var12_16 = var11_18;
                                                                        continue block2;
                                                                        break;
                                                                    }
                                                                }
                                                                var17_19 = var11_18 != 0 ? var13_5 : new StringBuilder();
                                                                if (var10_11) {
                                                                    var17_19.append(var1_1);
                                                                }
                                                                var17_19.append("\t[");
                                                                if (!var20_21.i1()) break block40;
                                                                t2.a((Appendable)var17_19, var6_9, ' ', Integer.toString(var20_21.y2()));
                                                                ** GOTO lbl99
                                                            }
                                                            if (var19_6 != null && var20_21 instanceof LuaTable) {
                                                                var13_5 = (LuaTable)var20_21;
                                                                if (var19_6.contains(var13_5)) {
                                                                    var17_19.append("{ -- table(");
                                                                    var17_19.append(Integer.toHexString(var13_5.hashCode()));
                                                                    var17_19.append(")\n");
                                                                    if (var10_11) {
                                                                        var17_19.append(var1_1);
                                                                    }
                                                                    var17_19.append("\t\t-- *** RECURSION ***\n");
                                                                    if (var10_11) {
                                                                        var17_19.append(var1_1);
                                                                    }
                                                                    var17_19.append("\t}");
                                                                } else {
                                                                    if (var14_17 == null) {
                                                                        var14_17 = new StringBuilder();
                                                                        var14_17.append(var1_1);
                                                                        var14_17.append('\t');
                                                                        var14_17 = var14_17.toString();
                                                                    }
                                                                    super.b3((String)var14_17, (Appendable)var17_19, (Map)var3_3);
                                                                }
lbl99:
                                                                // 4 sources

                                                                while (true) {
                                                                    var13_5 = null;
                                                                    break;
                                                                }
                                                            } else if (var20_21 instanceof LuaString) {
                                                                var17_19.append('\'');
                                                                var13_5 = var18_20 = var20_21.g0();
                                                                if (var18_20.indexOf(39) >= 0) {
                                                                    var13_5 = var18_20.replace("'", "\\'");
                                                                }
                                                                var17_19.append((CharSequence)var13_5);
                                                                var17_19.append('\'');
                                                            } else {
                                                                var17_19.append(var20_21.g0());
                                                                ** continue;
                                                            }
                                                            var17_19.append("] = ");
                                                            if (var19_6 == null || !(var21_22 instanceof LuaTable)) break block41;
                                                            var18_20 = (LuaTable)var21_22;
                                                            if (var19_6.contains(var18_20)) {
                                                                var17_19.append("{ -- table(");
                                                                var17_19.append(Integer.toHexString(var18_20.hashCode()));
                                                                var17_19.append(")\n");
                                                                if (var10_11) {
                                                                    var17_19.append(var1_1);
                                                                }
                                                                var17_19.append("\t\t-- *** RECURSION ***\n");
                                                                if (var10_11) {
                                                                    var17_19.append(var1_1);
                                                                }
                                                                var17_19.append("\t}");
                                                            } else {
                                                                var13_5 = var14_17;
                                                                if (var14_17 == null) {
                                                                    var13_5 = new StringBuilder();
                                                                    var13_5.append(var1_1);
                                                                    var13_5.append('\t');
                                                                    var13_5 = var13_5.toString();
                                                                }
                                                                super.b3((String)var13_5, (Appendable)var17_19, (Map)var3_3);
                                                                var14_17 = var13_5;
                                                            }
                                                            var17_19.append(',');
                                                            var13_5 = null;
                                                            break block42;
                                                        }
                                                        if (!(var21_22 instanceof LuaString)) break block43;
                                                        var17_19.append('\'');
                                                        var13_5 = var18_20 = var21_22.g0();
                                                        if (var18_20.indexOf(39) >= 0) {
                                                            var13_5 = var18_20.replace("'", "\\'");
                                                        }
                                                        var17_19.append((CharSequence)var13_5);
                                                        var17_19.append("',");
                                                        break block44;
                                                    }
                                                    if (!(var21_22 instanceof LuaLong)) break block45;
                                                    var5_14 = var13_5 != null && var20_21 instanceof LuaString != false ? 1 : 0;
                                                    if (var5_14 == 0 || !var13_5.equals("address")) break block46;
                                                    var17_19.append("0x");
                                                    var17_19.append(Long.toHexString(var21_22.z2()));
                                                    break block47;
                                                }
                                                var17_19.append(var21_22.g0());
                                                if (var5_14 == 0) break block47;
                                                if (!var13_5.equals("flags")) break block48;
                                                var5_14 = var21_22.y2();
                                                var13_5 = var5_14 != 1 ? (var5_14 != 2 ? (var5_14 != 4 ? (var5_14 != 8 ? (var5_14 != 16 ? (var5_14 != 32 ? (var5_14 != 64 ? null : "gg.TYPE_DOUBLE") : "gg.TYPE_QWORD") : "gg.TYPE_FLOAT") : "gg.TYPE_XOR") : "gg.TYPE_DWORD") : "gg.TYPE_WORD") : "gg.TYPE_BYTE";
                                                break block49;
                                            }
                                            if (!var13_5.equals("freezeType")) break block47;
                                            var5_14 = var21_22.y2();
                                            if (var5_14 == 0) break block50;
                                            if (var5_14 == 1) break block51;
                                            if (var5_14 == 2) break block52;
                                            if (var5_14 != 3) break block47;
                                            var13_5 = "gg.FREEZE_IN_RANGE";
                                            break block49;
                                        }
                                        var13_5 = "gg.FREEZE_MAY_DECREASE";
                                        break block49;
                                    }
                                    var13_5 = "gg.FREEZE_MAY_INCREASE";
                                    break block49;
                                }
                                var13_5 = "gg.FREEZE_NORMAL";
                                break block49;
                            }
                            var13_5 = null;
                        }
                        var17_19.append(',');
                        break block42;
                    }
                    var17_19.append(var21_22.g0());
                    if (!(var21_22 instanceof Script.ApiFunction)) {
                        var17_19.append(',');
                    }
                }
                var13_5 = null;
            }
            if (var13_5 != null) {
                var17_19.append(" -- ");
                var17_19.append((CharSequence)var13_5);
            }
            var17_19.append('\n');
            if (var11_18 == 0) {
                var13_5 = var15_15 == null ? ((var5_14 = var8_7 - (var4_8 - 1)) < 0 ? new ArrayList() : new ArrayList(var5_14)) : var15_15;
                var13_5.add(var17_19.toString());
            } else {
                var13_5 = var15_15;
            }
            var17_19 = var2_2;
            var15_15 = var13_5;
            ** continue;
        }
        if (var15_15 != null) {
            try {
                Collections.sort(var15_15);
            }
            catch (Throwable var3_4) {
                e1.a(var3_4);
            }
            var3_3 = var15_15.iterator();
            while (var3_3.hasNext()) {
                var2_2.append((String)var3_3.next());
            }
        }
        if (var10_11) {
            var2_2.append(var1_1);
        }
        var2_2.append('}');
        return var2_2;
    }

    private void h3(LuaValue mArray) {
        if (this.Q.length > 0) {
            int n3 = this.i3((LuaValue)mArray);
            for (m m3 = this.Q[n3]; m3 != null; m3 = m3.a()) {
                n n4 = m3.f((LuaValue)mArray);
                if (n4 == null) continue;
                mArray = this.Q;
                mArray[n3] = mArray[n3].h(n4);
                --this.R;
                return;
            }
        }
    }

    private int i3(LuaValue luaValue) {
        return luaValue.hashCode() & this.Q.length - 1;
    }

    public static int j3(LuaValue luaValue, int n3) {
        return luaValue.hashCode() & n3;
    }

    public static int l3(int n3, int n4) {
        return n3 & n4;
    }

    private void n3(int n3, LuaValue luaValue) {
        this.o3(n3, luaValue);
        while (n3 > 1) {
            LuaValue luaValue2 = this.c3(n3);
            this.e2(n3, this.c3(1));
            this.e2(1, luaValue2);
            this.B3(1, --n3, luaValue);
        }
    }

    private void o3(int n3, LuaValue luaValue) {
        for (int i3 = n3 / 2; i3 > 0; --i3) {
            this.B3(i3, n3, luaValue);
        }
    }

    protected static boolean r3(LuaValue luaValue) {
        boolean bl;
        int n3 = luaValue.C2();
        boolean bl2 = bl = false;
        if (n3 != 1) {
            bl2 = bl;
            if (n3 != 3) {
                if (n3 != 4) {
                    return true;
                }
                bl2 = bl;
                if (luaValue.W1() > 32) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int u3(int n3) {
        int n4;
        int n5 = n3 - 1;
        if (n5 < 0) {
            return Integer.MIN_VALUE;
        }
        if ((0xFFFF0000 & n5) != 0) {
            n5 >>>= 16;
            n4 = 16;
        } else {
            n4 = 0;
        }
        int n6 = n4;
        n3 = n5;
        if ((0xFF00 & n5) != 0) {
            n6 = n4 + 8;
            n3 = n5 >>> 8;
        }
        n5 = n6;
        n4 = n3;
        if ((n3 & 0xF0) != 0) {
            n5 = n6 + 4;
            n4 = n3 >>> 4;
        }
        switch (n4) {
            default: {
                return n5;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return n5 + 4;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                return n5 + 3;
            }
            case 2: 
            case 3: {
                return n5 + 2;
            }
            case 1: {
                return n5 + 1;
            }
            case 0: 
        }
        return 0;
    }

    private void y3(int n3) {
        Object object;
        m[] mArray;
        LuaValue[] luaValueArray;
        int n4;
        int n5;
        Object object2;
        Object object3 = this.S;
        if (object3 != null && (object3.q() || this.S.p())) {
            this.R = this.X2();
            if (this.S.p()) {
                this.a3();
            }
        }
        object3 = new int[32];
        int n6 = object2 = this.Y2((int[])object3);
        if (n3 > 0) {
            n6 = object2 + 1;
            object2 = LuaTable.u3(n3);
            object3[object2] = object3[object2] + true;
        }
        int n7 = 0;
        Object object4 = object3[0];
        object2 = 1;
        int n8 = 0;
        while (true) {
            n5 = 2;
            if (object2 >= 32) break;
            object4 += object3[object2];
            n4 = 1 << object2;
            if (n6 * 2 < n4) break;
            if (object4 >= 1 << object2 - 1) {
                n8 = n4;
            }
            ++object2;
        }
        LuaValue[] luaValueArray2 = this.P;
        Object object5 = this.Q;
        n6 = n3 > 0 && n3 <= n8 ? -1 : 0;
        if (n8 != luaValueArray2.length) {
            luaValueArray = new LuaValue[n8];
            if (n8 > luaValueArray2.length) {
                object4 = LuaTable.u3(luaValueArray2.length + 1);
                n4 = LuaTable.u3(n8);
                while (true) {
                    object2 = n6;
                    if (object4 < n4 + 1) {
                        n6 += object3[object4];
                        ++object4;
                        continue;
                    }
                    break;
                }
            } else {
                object2 = n6;
                if (luaValueArray2.length > n8) {
                    object4 = LuaTable.u3(n8 + 1);
                    n4 = LuaTable.u3(luaValueArray2.length);
                    while (true) {
                        object2 = n6;
                        if (object4 >= n4 + 1) break;
                        n6 -= object3[object4];
                        ++object4;
                    }
                }
            }
            System.arraycopy(luaValueArray2, 0, luaValueArray, 0, Math.min(luaValueArray2.length, n8));
            n6 = object2;
        } else {
            luaValueArray = luaValueArray2;
        }
        object2 = this.R;
        n3 = n3 >= 0 && n3 <= n8 ? 0 : 1;
        n3 = object2 - n6 + n3;
        n4 = ((m[])object5).length;
        if (n3 > 0) {
            n3 = n3 < 2 ? n5 : 1 << LuaTable.u3(n3);
            object2 = n3 - 1;
            mArray = new m[n3];
            n3 = object2;
            object2 = n7;
        } else {
            mArray = U;
            n3 = 0;
            object2 = n7;
        }
        while (true) {
            object4 = n8;
            if (object2 >= n4) break;
            for (object3 = object5[object2]; object3 != null; object3 = object3.a()) {
                object4 = object3.r(n8);
                if (object4 > 0) {
                    object = object3.l();
                    if (object == null) continue;
                    luaValueArray[object4 - true] = object.t();
                    continue;
                }
                if (object3 instanceof c) continue;
                object4 = object3.b(n3);
                mArray[object4] = object3.n(mArray[object4]);
            }
            ++object2;
        }
        while (object4 < luaValueArray2.length) {
            block20: {
                block22: {
                    block21: {
                        object2 = object4 + true;
                        object5 = luaValueArray2[object4];
                        if (object5 == null) break block20;
                        long l3 = object2;
                        n8 = LuaTable.l3(LuaLong.V2(l3), n3);
                        object3 = this.S;
                        object = LuaValue.I2(l3);
                        if (object3 == null) break block21;
                        object3 = object5 = object3.k((LuaValue)object, (LuaValue)object5);
                        if (object5 != null) break block22;
                        break block20;
                    }
                    object3 = LuaTable.Z2((LuaValue)object, (LuaValue)object5);
                }
                object = mArray[n8];
                object5 = object3;
                if (object != null) {
                    object5 = object.d((m)object3);
                }
                mArray[n8] = object5;
            }
            object4 = object2;
        }
        this.Q = mArray;
        this.P = luaValueArray;
        this.R -= n6;
    }

    @Override
    public int C2() {
        return 5;
    }

    @Override
    public String D2() {
        return "table";
    }

    public void D3(LuaValue object) {
        int n3 = this.s1();
        if (n3 < 0xFFFFFF) {
            Object object2 = this.S;
            if (object2 != null && object2.p()) {
                this.a3();
            }
            if (n3 > 1) {
                object2 = object;
                if (((LuaValue)object).l1()) {
                    object2 = null;
                }
                this.n3(n3, (LuaValue)object2);
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("array too big: ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" >= ");
        ((StringBuilder)object).append(0xFFFFFF);
        throw new luaj.d(((StringBuilder)object).toString());
    }

    public String E3(Appendable object, Map map) {
        if (V == null) {
            V = new HashSet();
            W = 0;
            object = this.b3("", (Appendable)object, map).toString();
            W = 0;
            V = null;
            return object;
        }
        return this.b3("", (Appendable)object, map).toString();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Varargs F3(long l3, long l4) {
        OutOfMemoryError outOfMemoryError2;
        Object object;
        int n3;
        block13: {
            if (l4 < l3) {
                return LuaValue.f;
            }
            long l5 = l4 - l3;
            if (l5 < 0L) throw new luaj.d("too many results to unpack: greater 9223372036854775807");
            if (l5 >= 0xFFFFFFL) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("too many results to unpack: ");
                stringBuilder.append(l5);
                stringBuilder.append(" (max is ");
                stringBuilder.append(0xFFFFFFL);
                stringBuilder.append(')');
                throw new luaj.d(stringBuilder.toString());
            }
            int n4 = (int)(l5 + 1L);
            n3 = (int)l3;
            boolean bl = (long)n3 == l3 && (long)((int)l4) == l4;
            if (n4 <= 0) {
                return LuaValue.f;
            }
            if (n4 == 1) {
                if (!bl) return this.U0(LuaLong.I2(l3));
                return this.c3(n3);
            }
            if (n4 == 2) {
                LuaValue luaValue;
                LuaValue luaValue2 = bl ? this.c3(n3) : this.U0(LuaLong.I2(l3));
                ++l3;
                if (bl) {
                    luaValue = this.c3((int)l3);
                    return LuaValue.N2(luaValue2, luaValue);
                }
                luaValue = this.U0(LuaLong.I2(l3));
                return LuaValue.N2(luaValue2, luaValue);
            }
            n3 = n4;
            try {
                object = new LuaValue[n4];
            }
            catch (OutOfMemoryError outOfMemoryError2) {
                break block13;
            }
            while (--n4 >= 0) {
                Varargs varargs;
                l4 = (long)n4 + l3;
                if (bl) {
                    n3 = n4;
                    varargs = this.c3((int)l4);
                } else {
                    n3 = n4;
                    varargs = this.U0(LuaLong.I2(l4));
                }
                object[n4] = varargs;
            }
            n3 = n4;
            return LuaValue.O2((LuaValue[])object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("OOM on unpack: ");
        ((StringBuilder)object).append(n3);
        e1.l(((StringBuilder)object).toString(), outOfMemoryError2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("too many results to unpack [out of memory]: ");
        stringBuilder.append(n3);
        throw new luaj.d(stringBuilder.toString());
    }

    public void G3(int n3, LuaString varargs, double d4) {
        m[] mArray = this.Q;
        float f4 = (float)d4;
        varargs = (double)f4 == d4 ? new f((LuaValue)varargs, f4) : new d((LuaValue)varargs, d4);
        m m3 = mArray[n3];
        Object object = varargs;
        if (m3 != null) {
            object = m3.d((m)((Object)varargs));
        }
        mArray[n3] = object;
        ++this.R;
    }

    @Override
    public LuaTable H0() {
        return this;
    }

    public void H3(int n3, LuaString object, float f4) {
        m[] mArray = this.Q;
        f f5 = new f((LuaValue)object, f4);
        m m3 = mArray[n3];
        object = f5;
        if (m3 != null) {
            object = m3.d(f5);
        }
        mArray[n3] = object;
        ++this.R;
    }

    public void I3(int n3, LuaString object, int n4) {
        m[] mArray = this.Q;
        h h4 = new h((LuaValue)object, n4);
        m m3 = mArray[n3];
        object = h4;
        if (m3 != null) {
            object = m3.d(h4);
        }
        mArray[n3] = object;
        ++this.R;
    }

    public void J3(int n3, LuaString varargs, long l3) {
        m[] mArray = this.Q;
        int n4 = (int)l3;
        varargs = (long)n4 == l3 ? new h((LuaValue)varargs, n4) : new k((LuaValue)varargs, l3);
        m m3 = mArray[n3];
        Object object = varargs;
        if (m3 != null) {
            object = m3.d((m)((Object)varargs));
        }
        mArray[n3] = object;
        ++this.R;
    }

    public void K3(int n3, LuaString object, boolean bl) {
        m[] mArray = this.Q;
        b b4 = new b((LuaValue)object, bl);
        m m3 = mArray[n3];
        object = b4;
        if (m3 != null) {
            object = m3.d(b4);
        }
        mArray[n3] = object;
        ++this.R;
    }

    @Override
    public LuaTable L1(LuaTable luaTable) {
        return this;
    }

    @Override
    public boolean P0(LuaValue luaValue) {
        if (this == luaValue) {
            return true;
        }
        if (!luaValue.o1()) {
            return false;
        }
        return LuaValue.Q0(this, luaValue);
    }

    @Override
    public void R1(int n3) {
        LuaValue[] luaValueArray = this.P;
        if (n3 > luaValueArray.length) {
            this.P = LuaTable.A3(luaValueArray, 1 << LuaTable.u3(n3));
        }
    }

    @Override
    public LuaValue U0(LuaValue luaValue) {
        LuaValue luaValue2;
        LuaValue luaValue3 = luaValue2 = this.V1(luaValue);
        if (luaValue2.l1()) {
            luaValue3 = luaValue2;
            if (this.S != null) {
                luaValue3 = LuaValue.W0(this, luaValue);
            }
        }
        return luaValue3;
    }

    @Override
    public LuaValue V0() {
        Object object = this.S;
        object = object != null ? object.e() : null;
        return object;
    }

    @Override
    public LuaValue V1(LuaValue object) {
        LuaValue[] luaValueArray;
        int n3;
        if (((LuaValue)object).i1() && (n3 = ((LuaValue)object).y2()) > 0 && n3 <= (luaValueArray = this.P).length) {
            object = this.S;
            if ((object = object == null ? luaValueArray[n3] : object.o(luaValueArray, --n3)) == null) {
                object = LuaValue.c;
            }
            return object;
        }
        return this.k3((LuaValue)object);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int W1() {
        block3: {
            var3_1 = this.d3();
            if (var3_1 == 0 || !this.x3(var3_1).l1()) break block3;
            var2_2 = 0;
            var1_3 = var3_1;
            ** GOTO lbl19
        }
        var1_3 = var3_1 + 1;
        var2_2 = var3_1;
        while (!this.x3(var1_3).l1()) {
            var4_4 = this.f3();
            var2_2 = var1_3;
            var1_3 = var4_4 + var3_1 + 1 + var1_3;
        }
        var4_4 = var1_3;
        var1_3 = var2_2;
        block1: while (true) {
            var2_2 = var1_3;
            var1_3 = var4_4;
            while (var1_3 > var2_2 + 1) {
                var3_1 = (var2_2 + var1_3) / 2;
                var4_4 = var1_3;
                var1_3 = var3_1;
                if (!this.x3(var3_1).l1()) continue block1;
                var1_3 = var3_1;
            }
            break;
        }
        return var2_2;
    }

    public LuaValue W2(LuaString luaString, int n3, int n4) {
        a a4 = new a();
        if (n3 <= n4) {
            while (true) {
                a4.c(this.c3(n3).G0());
                if (n3 >= Integer.MAX_VALUE || ++n3 > n4) break;
                a4.c(luaString);
            }
        }
        return a4.l();
    }

    @Override
    public void Y1(int n3, LuaValue luaValue) {
        if (luaValue == null) {
            return;
        }
        if (!this.U2(n3, luaValue)) {
            this.m3(LuaLong.I2(n3), luaValue);
        }
    }

    public LuaValue c3(int n3) {
        LuaValue luaValue;
        LuaValue luaValue2 = luaValue = this.x3(n3);
        if (luaValue.l1()) {
            luaValue2 = luaValue;
            if (this.S != null) {
                luaValue2 = LuaValue.W0(this, LuaValue.I2(n3));
            }
        }
        return luaValue2;
    }

    @Override
    public void d2(LuaValue luaValue, LuaValue luaValue2) {
        if (!(luaValue == null || luaValue2 == null || luaValue.i1() && this.U2(luaValue.y2(), luaValue2))) {
            this.m3(luaValue, luaValue2);
        }
    }

    public int d3() {
        return this.P.length;
    }

    @Override
    public LuaValue e() {
        return this;
    }

    @Override
    public void e2(int n3, LuaValue luaValue) {
        if (this.S == null || !this.x3(n3).l1() || !LuaValue.l2(this, LuaLong.I2(n3), luaValue)) {
            this.Y1(n3, luaValue);
        }
    }

    public int e3() {
        return this.R;
    }

    public int f3() {
        return this.Q.length;
    }

    @Override
    public LuaValue g(LuaValue luaValue) {
        return luaValue;
    }

    @Override
    public String g0() {
        try {
            CharSequence charSequence = new StringBuilder();
            charSequence = this.E3((Appendable)((Object)charSequence), null);
            return charSequence;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public long g3(LuaValue luaValue) {
        n n3 = this.C3(luaValue);
        if (n3 == null) {
            luaValue = this.S != null ? LuaValue.W0(this, luaValue) : LuaValue.c;
            return luaValue.C0();
        }
        if (n3 instanceof h) {
            return ((h)n3).k0();
        }
        if (n3 instanceof k) {
            return ((k)n3).k0();
        }
        return n3.t().C0();
    }

    @Override
    public void j2(LuaValue luaValue, LuaValue object) {
        if (luaValue != null && (luaValue.q1() || this.x1(LuaValue.m).g1())) {
            if (this.S == null || !this.V1(luaValue).l1() || !LuaValue.l2(this, luaValue, (LuaValue)object)) {
                this.d2(luaValue, (LuaValue)object);
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("value ('");
        ((StringBuilder)object).append(luaValue);
        ((StringBuilder)object).append("') can not be used as a table index");
        throw new luaj.d(((StringBuilder)object).toString());
    }

    @Override
    public m k(LuaValue luaValue, LuaValue luaValue2) {
        return LuaTable.Z2(luaValue, luaValue2);
    }

    @Override
    public LuaValue k2(LuaValue object) {
        luaj.e e4 = this.S;
        boolean bl = true;
        boolean bl2 = e4 != null && e4.q();
        e4 = this.S;
        boolean bl3 = e4 != null && e4.p();
        this.S = object = LuaValue.w1((LuaValue)object);
        boolean bl4 = object != null && object.q();
        if (bl2 != bl4 || bl3 != (bl2 = (object = this.S) != null && object.p() ? bl : false)) {
            this.y3(0);
        }
        return this;
    }

    protected LuaValue k3(LuaValue object) {
        object = (object = this.C3((LuaValue)object)) == null ? LuaValue.c : object.t();
        return object;
    }

    public void m3(LuaValue object, LuaValue object2) {
        if (object2.l1()) {
            this.h3((LuaValue)object);
        } else {
            m m3;
            int n3;
            Object object3;
            if (this.Q.length > 0) {
                int n4 = this.i3((LuaValue)object);
                object3 = this.Q[n4];
                while (true) {
                    n3 = n4;
                    if (object3 != null) {
                        m3 = object3.f((LuaValue)object);
                        if (m3 != null) {
                            object = this.Q;
                            object[n4] = object[n4].j((n)m3, (LuaValue)object2);
                            return;
                        }
                        object3 = object3.a();
                        continue;
                    }
                    break;
                }
            } else {
                n3 = 0;
            }
            if (this.R >= this.Q.length) {
                object3 = this.S;
                if ((object3 == null || !object3.p()) && object.i1() && object.y2() > 0) {
                    this.y3(object.y2());
                    if (this.U2(object.y2(), (LuaValue)object2)) {
                        return;
                    }
                } else {
                    this.y3(-1);
                }
                n3 = this.i3((LuaValue)object);
            }
            object = (object3 = this.S) != null ? object3.k((LuaValue)object, (LuaValue)object2) : LuaTable.Z2((LuaValue)object, (LuaValue)object2);
            object3 = this.Q;
            m3 = object3[n3];
            object2 = object;
            if (m3 != null) {
                object2 = m3.d((m)object);
            }
            object3[n3] = object2;
            ++this.R;
        }
    }

    @Override
    public LuaValue o(LuaValue[] luaValueArray, int n3) {
        return luaValueArray[n3];
    }

    @Override
    public boolean o1() {
        return true;
    }

    @Override
    public boolean p() {
        return false;
    }

    public Varargs p3(LuaValue varargs) {
        int n3 = varargs.A0() + 1;
        varargs = (varargs = this.c3(n3)).l1() ? LuaValue.f : LuaValue.N2(LuaLong.I2(n3), varargs);
        return varargs;
    }

    @Override
    public boolean q() {
        return false;
    }

    public void q3(int n3, LuaValue luaValue) {
        while (!luaValue.l1()) {
            LuaValue luaValue2 = this.c3(n3);
            this.e2(n3, luaValue);
            luaValue = luaValue2;
            ++n3;
        }
    }

    @Override
    public LuaValue r1() {
        LuaValue luaValue = this.x1(LuaValue.x);
        if (luaValue.w2()) {
            return luaValue.call(this);
        }
        return LuaLong.I2(this.W1());
    }

    @Override
    public int s1() {
        if (this.S != null) {
            LuaValue luaValue = this.r1();
            if (luaValue.i1()) {
                return luaValue.y2();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("table length is not an integer: ");
            stringBuilder.append(luaValue);
            throw new luaj.d(stringBuilder.toString());
        }
        return this.W1();
    }

    public i s3() {
        return new i(this);
    }

    public LuaValue[] t3() {
        ArrayList<LuaValue> arrayList = new ArrayList<LuaValue>();
        LuaValue[] luaValueArray = this.s3();
        while (luaValueArray.c()) {
            arrayList.add(luaValueArray.b());
        }
        luaValueArray = new LuaValue[arrayList.size()];
        arrayList.toArray(luaValueArray);
        return luaValueArray;
    }

    public Varargs v3(LuaValue object) {
        Object object2;
        Object object3;
        boolean bl = ((LuaValue)object).l1();
        int n3 = 0;
        int n4 = 0;
        if (!(bl || ((LuaValue)object).i1() && (n3 = ((LuaValue)object).y2()) > 0 && n3 <= this.P.length)) {
            if (this.Q.length == 0) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("invalid key to 'next' 1: ");
                ((StringBuilder)object3).append(object);
                LuaValue.R0(((StringBuilder)object3).toString());
            }
            int n5 = this.i3((LuaValue)object);
            n3 = n4;
            for (object3 = this.Q[n5]; object3 != null; object3 = object3.a()) {
                if (n3 != 0) {
                    object2 = object3.l();
                    if (object2 == null) continue;
                    return object2.c();
                }
                if (!object3.s((LuaValue)object)) continue;
                n3 = 1;
            }
            if (n3 == 0) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("invalid key to 'next' 2: ");
                ((StringBuilder)object3).append(object);
                LuaValue.R0(((StringBuilder)object3).toString());
            }
            n3 = n5 + (this.P.length + 1);
        }
        while (n3 < ((LuaValue[])(object3 = this.P)).length) {
            object = object3[n3];
            if (object != null) {
                object2 = this.S;
                if (object2 != null) {
                    object = object2.o((LuaValue[])object3, n3);
                }
                if (object != null) {
                    return LuaValue.N2(LuaLong.I2(n3 + 1), (Varargs)object);
                }
            }
            ++n3;
        }
        n3 -= ((LuaValue[])object3).length;
        while (n3 < ((m[])(object = this.Q)).length) {
            for (object = object[n3]; object != null; object = object.a()) {
                object3 = object.l();
                if (object3 == null) continue;
                return object3.c();
            }
            ++n3;
        }
        return LuaValue.c;
    }

    public void w3(int n3, int n4) {
        int n5 = n4;
        if (n4 > 0) {
            n5 = n4;
            if (n4 < 2) {
                n5 = 2;
            }
        }
        Object[] objectArray = n3 > 0 ? new LuaValue[1 << LuaTable.u3(n3)] : LuaValue.j;
        this.P = objectArray;
        objectArray = n5 > 0 ? new m[1 << LuaTable.u3(n5)] : U;
        this.Q = objectArray;
        this.R = 0;
    }

    public LuaValue x3(int n3) {
        Object object;
        if (n3 > 0 && n3 <= ((LuaValue[])(object = this.P)).length) {
            luaj.e e4 = this.S;
            object = e4 == null ? object[n3] : e4.o((LuaValue[])object, --n3);
            if (object == null) {
                object = LuaValue.c;
            }
            return object;
        }
        return this.k3(LuaLong.I2(n3));
    }

    public LuaValue z3(int n3, int n4) {
        LuaValue luaValue;
        int n5;
        if (n3 == 0) {
            n5 = n4;
        } else {
            n5 = n3;
            if (n3 > n4) {
                return LuaValue.f;
            }
        }
        LuaValue luaValue2 = luaValue = this.c3(n5);
        while (!luaValue2.l1()) {
            n3 = n5 + 1;
            luaValue2 = this.c3(n3);
            this.e2(n5, luaValue2);
            n5 = n3;
        }
        luaValue2 = luaValue;
        if (luaValue.l1()) {
            luaValue2 = LuaValue.f;
        }
        return luaValue2;
    }

    private static class b
    extends o {
        private boolean c;

        b(LuaValue luaValue, boolean bl) {
            super(luaValue);
            this.c = bl;
        }

        @Override
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                boolean bl = luaValue == LuaValue.d;
                this.c = bl;
                return this;
            }
            if (luaValue instanceof LuaLong) {
                long l3 = luaValue.z2();
                int n3 = (int)l3;
                if ((long)n3 == l3) {
                    return new h(this.b, n3);
                }
                return new k(this.b, l3);
            }
            if (luaValue instanceof LuaDouble) {
                double d4 = luaValue.x2();
                float f4 = (float)d4;
                if ((double)f4 == d4) {
                    return new f(this.b, f4);
                }
                return new d(this.b, d4);
            }
            return new l(this.b, luaValue);
        }

        @Override
        public LuaValue t() {
            return LuaValue.H2(this.c);
        }
    }

    private static class c
    implements m {
        private final Object a;
        private m b;

        private c(LuaValue luaValue, m m3) {
            Object object = luaValue;
            if (LuaTable.r3(luaValue)) {
                object = new WeakReference<LuaValue>(luaValue);
            }
            this.a = object;
            this.b = m3;
        }

        private LuaValue i() {
            Object object;
            Object object2 = object = this.a;
            if (object instanceof WeakReference) {
                object2 = ((WeakReference)object).get();
            }
            return (LuaValue)object2;
        }

        @Override
        public m a() {
            return this.b;
        }

        @Override
        public int b(int n3) {
            return 0;
        }

        @Override
        public m d(m m3) {
            m m4 = this.b;
            m m5 = m3;
            if (m4 != null) {
                m5 = m4.d(m3);
            }
            return m5;
        }

        @Override
        public n f(LuaValue luaValue) {
            return null;
        }

        @Override
        public m h(n n3) {
            if (this.i() != null) {
                this.b = this.b.h(n3);
                return this;
            }
            return this.b;
        }

        @Override
        public m j(n m3, LuaValue luaValue) {
            m m4 = this.b;
            m3 = m4 != null ? m4.j((n)m3, luaValue) : null;
            if (this.i() != null) {
                this.b = m3;
                return this;
            }
            return m3;
        }

        @Override
        public n l() {
            return null;
        }

        @Override
        public m n(m m3) {
            return m3;
        }

        @Override
        public int r(int n3) {
            return -1;
        }

        @Override
        public boolean s(LuaValue luaValue) {
            LuaValue luaValue2 = this.i();
            boolean bl = luaValue2 != null && luaValue.T1(luaValue2);
            return bl;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<dead");
            LuaValue luaValue = this.i();
            if (luaValue != null) {
                stringBuilder.append(": ");
                stringBuilder.append(luaValue.toString());
            }
            stringBuilder.append('>');
            if (this.b != null) {
                stringBuilder.append("; ");
                stringBuilder.append(this.b.toString());
            }
            return stringBuilder.toString();
        }
    }

    private static class d
    extends o {
        private double c;

        d(LuaValue luaValue, double d4) {
            super(luaValue);
            this.c = d4;
        }

        @Override
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                return new b(this.b, luaValue.w2());
            }
            LuaValue luaValue2 = luaValue.A2();
            if (luaValue2.l1()) {
                return new l(this.b, luaValue);
            }
            if (luaValue2 instanceof LuaLong) {
                long l3 = luaValue2.z2();
                int n3 = (int)l3;
                if ((long)n3 == l3) {
                    return new h(this.b, n3);
                }
                return new k(this.b, l3);
            }
            double d4 = luaValue2.x2();
            float f4 = (float)d4;
            if ((double)f4 == d4) {
                return new f(this.b, f4);
            }
            this.c = d4;
            return this;
        }

        @Override
        public LuaValue t() {
            return LuaValue.J2(this.c);
        }
    }

    static abstract class e
    extends Varargs
    implements n {
        e() {
        }

        @Override
        public int U() {
            return 2;
        }

        @Override
        public m a() {
            return null;
        }

        @Override
        public abstract int b(int var1);

        @Override
        public Varargs c() {
            return this;
        }

        @Override
        public m d(m m3) {
            return new j(this, m3);
        }

        @Override
        public Varargs e0(int n3) {
            if (n3 != 1) {
                if (n3 != 2) {
                    return LuaValue.f;
                }
                return this.t();
            }
            return this;
        }

        @Override
        public n f(LuaValue varargs) {
            varargs = this.s((LuaValue)varargs) ? this : null;
            return varargs;
        }

        @Override
        public m h(n n3) {
            return new c(this.i(), null);
        }

        @Override
        public abstract LuaValue i();

        @Override
        public m j(n n3, LuaValue luaValue) {
            return this.j0(luaValue);
        }

        abstract e j0(LuaValue var1);

        @Override
        public n l() {
            return this;
        }

        @Override
        public m n(m m3) {
            m3 = m3 != null ? new j(this, m3) : this;
            return m3;
        }

        @Override
        public int r(int n3) {
            return 0;
        }

        @Override
        public abstract boolean s(LuaValue var1);

        @Override
        public abstract LuaValue t();

        @Override
        public LuaValue v(int n3) {
            if (n3 != 1) {
                if (n3 != 2) {
                    return LuaValue.c;
                }
                return this.t();
            }
            return this.i();
        }

        @Override
        public LuaValue w() {
            return this.i();
        }
    }

    private static class f
    extends o {
        private float c;

        f(LuaValue luaValue, float f4) {
            super(luaValue);
            this.c = f4;
        }

        @Override
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                return new b(this.b, luaValue.w2());
            }
            LuaValue luaValue2 = luaValue.A2();
            if (luaValue2.l1()) {
                return new l(this.b, luaValue);
            }
            if (luaValue2 instanceof LuaLong) {
                long l3 = luaValue2.z2();
                int n3 = (int)l3;
                if ((long)n3 == l3) {
                    return new h(this.b, n3);
                }
                return new k(this.b, l3);
            }
            double d4 = luaValue2.x2();
            float f4 = (float)d4;
            if ((double)f4 == d4) {
                this.c = f4;
                return this;
            }
            return new d(this.b, d4);
        }

        @Override
        public LuaValue t() {
            return LuaValue.J2(this.c);
        }
    }

    private static class g
    extends e {
        private final int b;
        private LuaValue c;

        g(int n3, LuaValue luaValue) {
            this.b = n3;
            this.c = luaValue;
        }

        @Override
        public int b(int n3) {
            return LuaTable.l3(LuaLong.V2(this.b), n3);
        }

        @Override
        public LuaValue i() {
            return LuaValue.I2(this.b);
        }

        @Override
        public e j0(LuaValue luaValue) {
            this.c = luaValue;
            return this;
        }

        @Override
        public int r(int n3) {
            int n4 = this.b;
            n3 = n4 >= 1 && n4 <= n3 ? n4 : 0;
            return n3;
        }

        @Override
        public boolean s(LuaValue luaValue) {
            boolean bl = luaValue.m1();
            boolean bl2 = false;
            if (bl && this.b == luaValue.y2()) {
                bl2 = true;
            }
            return bl2;
        }

        @Override
        public LuaValue t() {
            return this.c;
        }
    }

    private static class h
    extends o {
        private int c;

        h(LuaValue luaValue, int n3) {
            super(luaValue);
            this.c = n3;
        }

        @Override
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                return new b(this.b, luaValue.w2());
            }
            LuaValue luaValue2 = luaValue.A2();
            if (luaValue2.l1()) {
                return new l(this.b, luaValue);
            }
            if (luaValue2 instanceof LuaLong) {
                long l3 = luaValue2.z2();
                int n3 = (int)l3;
                if ((long)n3 == l3) {
                    this.c = n3;
                    return this;
                }
                return new k(this.b, l3);
            }
            double d4 = luaValue2.x2();
            float f4 = (float)d4;
            if ((double)f4 == d4) {
                return new f(this.b, f4);
            }
            return new d(this.b, d4);
        }

        int k0() {
            return this.c;
        }

        @Override
        public LuaValue t() {
            return LuaValue.I2(this.c);
        }
    }

    public class i {
        private int a;
        private m b;
        private n c;
        final LuaTable d;

        public i(LuaTable luaTable) {
            this.d = luaTable;
            this.a = -1;
            this.b = null;
            this.c = null;
        }

        public int a() {
            int n3 = this.c == null ? this.a + 1 : 0;
            return n3;
        }

        public LuaValue b() {
            n n3 = this.c;
            if (n3 != null) {
                return n3.i();
            }
            return LuaLong.I2(this.a + 1);
        }

        public boolean c() {
            int n3;
            Object object;
            Object object2 = this.b;
            while (object2 != null) {
                object2 = object = object2.a();
                if (object == null) continue;
                n n4 = object.l();
                object2 = object;
                if (n4 == null) continue;
                this.b = object;
                this.c = n4;
                return true;
            }
            this.b = null;
            this.c = null;
            for (n3 = this.a + 1; n3 < this.d.P.length; ++n3) {
                if (this.d.P[n3] == null) continue;
                object = this.d;
                object2 = ((LuaTable)object).S;
                if (object2 != null && object2.o(((LuaTable)object).P, n3) == null) continue;
                this.a = n3;
                return true;
            }
            n3 -= this.d.P.length;
            while (n3 < this.d.Q.length) {
                for (object2 = this.d.Q[n3]; object2 != null; object2 = object2.a()) {
                    object = object2.l();
                    if (object == null) continue;
                    this.a = n3 + this.d.P.length;
                    this.b = object2;
                    this.c = object;
                    return true;
                }
                ++n3;
            }
            return false;
        }

        public LuaValue d() {
            Object object = this.c;
            if (object != null) {
                return object.t();
            }
            LuaValue[] luaValueArray = this.d;
            object = luaValueArray.S;
            luaValueArray = ((LuaTable)luaValueArray).P;
            object = object == null ? luaValueArray[this.a] : object.o(luaValueArray, this.a);
            return object;
        }
    }

    private static class j
    implements n {
        private e a;
        private m b;

        j(e e4, m m3) {
            this.a = e4;
            this.b = m3;
        }

        private m e(m m3) {
            if (m3 != null) {
                this.b = m3;
                return this;
            }
            return this.a;
        }

        @Override
        public m a() {
            return this.b;
        }

        @Override
        public int b(int n3) {
            return this.a.b(n3);
        }

        @Override
        public Varargs c() {
            return this.a.c();
        }

        @Override
        public m d(m m3) {
            return this.e(this.b.d(m3));
        }

        @Override
        public n f(LuaValue object) {
            object = this.a.s((LuaValue)object) ? this : null;
            return object;
        }

        @Override
        public m h(n n3) {
            if (this == n3) {
                return new c(this.i(), this.b);
            }
            this.b = this.b.h(n3);
            return this;
        }

        @Override
        public LuaValue i() {
            return this.a.i();
        }

        @Override
        public m j(n n3, LuaValue luaValue) {
            if (n3 == this) {
                this.a = this.a.j0(luaValue);
                return this;
            }
            return this.e(this.b.j(n3, luaValue));
        }

        @Override
        public n l() {
            return this.a;
        }

        @Override
        public m n(m m3) {
            m3 = m3 != null ? new j(this.a, m3) : this.a;
            return m3;
        }

        @Override
        public int r(int n3) {
            return this.a.r(n3);
        }

        @Override
        public boolean s(LuaValue luaValue) {
            return this.a.s(luaValue);
        }

        @Override
        public LuaValue t() {
            return this.a.t();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("; ");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    private static class k
    extends o {
        private long c;

        k(LuaValue luaValue, long l3) {
            super(luaValue);
            this.c = l3;
        }

        @Override
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                return new b(this.b, luaValue.w2());
            }
            LuaValue luaValue2 = luaValue.A2();
            if (luaValue2.l1()) {
                return new l(this.b, luaValue);
            }
            if (luaValue2 instanceof LuaLong) {
                long l3 = luaValue2.z2();
                int n3 = (int)l3;
                if ((long)n3 == l3) {
                    return new h(this.b, n3);
                }
                this.c = l3;
                return this;
            }
            double d4 = luaValue2.x2();
            float f4 = (float)d4;
            if ((double)f4 == d4) {
                return new f(this.b, f4);
            }
            return new d(this.b, d4);
        }

        long k0() {
            return this.c;
        }

        @Override
        public LuaValue t() {
            return LuaValue.I2(this.c);
        }
    }

    static class l
    extends o {
        private LuaValue c;

        l(LuaValue luaValue, LuaValue luaValue2) {
            super(luaValue);
            this.c = luaValue2;
        }

        @Override
        public Varargs c() {
            return this;
        }

        @Override
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                return new b(this.b, luaValue.w2());
            }
            if (luaValue instanceof LuaLong) {
                long l3 = luaValue.z2();
                int n3 = (int)l3;
                if ((long)n3 == l3) {
                    return new h(this.b, n3);
                }
                return new k(this.b, l3);
            }
            if (luaValue instanceof LuaDouble) {
                double d4 = luaValue.x2();
                float f4 = (float)d4;
                if ((double)f4 == d4) {
                    return new f(this.b, f4);
                }
                return new d(this.b, d4);
            }
            this.c = luaValue;
            return this;
        }

        @Override
        public LuaValue t() {
            return this.c;
        }
    }

    static interface m {
        public m a();

        public int b(int var1);

        public m d(m var1);

        public n f(LuaValue var1);

        public m h(n var1);

        public m j(n var1, LuaValue var2);

        public n l();

        public m n(m var1);

        public int r(int var1);

        public boolean s(LuaValue var1);
    }

    static interface n
    extends m {
        public Varargs c();

        public LuaValue i();

        public LuaValue t();
    }

    private static abstract class o
    extends e {
        protected final LuaValue b;

        o(LuaValue luaValue) {
            this.b = luaValue;
        }

        @Override
        public final int b(int n3) {
            return LuaTable.j3(this.b, n3);
        }

        @Override
        public final LuaValue i() {
            return this.b;
        }

        @Override
        public final boolean s(LuaValue luaValue) {
            return luaValue.T1(this.b);
        }
    }
}

