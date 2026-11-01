package luaj;

import android.ext.Script$ApiFunction;
import android.ext.e1;
import android.ext.t2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class LuaTable extends LuaValue implements e {
    private static final LuaString T = LuaValue.K2("n");
    private static final LuaTable$m[] U = new LuaTable$m[0];
    private static volatile Set V = null;
    private static volatile int W = 0;
    private LuaValue[] P;
    private LuaTable$m[] Q;
    protected int R;
    protected e S;

    public LuaTable() {
        this.P = LuaValue.j;
        this.Q = U;
    }

    public LuaTable(int i, int i2) {
        w3(i, i2);
    }

    public LuaTable(Varargs varargs, int i) {
        int i2 = i - 1;
        int iMax = Math.max(varargs.U() - i2, 0);
        w3(iMax, 1);
        j2(T, LuaValue.I2(iMax));
        for (int i3 = 1; i3 <= iMax; i3++) {
            e2(i3, varargs.v(i3 + i2));
        }
    }

    public LuaTable(LuaValue[] luaValueArr, LuaValue[] luaValueArr2, Varargs varargs) {
        int length = luaValueArr != null ? luaValueArr.length : 0;
        int length2 = luaValueArr2 != null ? luaValueArr2.length : 0;
        w3((varargs != null ? varargs.U() : 0) + length2, length >> 1);
        int i = 0;
        while (i < length2) {
            int i2 = i + 1;
            Y1(i2, luaValueArr2[i]);
            i = i2;
        }
        if (varargs != null) {
            int iU = varargs.U();
            for (int i3 = 1; i3 <= iU; i3++) {
                Y1(length2 + i3, varargs.v(i3));
            }
        }
        for (int i4 = 0; i4 < length; i4 += 2) {
            int i5 = i4 + 1;
            if (!luaValueArr[i5].l1()) {
                d2(luaValueArr[i4], luaValueArr[i5]);
            }
        }
    }

    private static LuaValue[] A3(LuaValue[] luaValueArr, int i) {
        LuaValue[] luaValueArr2 = new LuaValue[i];
        System.arraycopy(luaValueArr, 0, luaValueArr2, 0, luaValueArr.length);
        return luaValueArr2;
    }

    private void B3(int i, int i2, LuaValue luaValue) {
        while (true) {
            int i3 = i * 2;
            if (i3 > i2) {
                return;
            }
            if (i3 < i2) {
                int i4 = i3 + 1;
                if (V2(i3, i4, luaValue)) {
                    i3 = i4;
                }
            }
            if (!V2(i, i3, luaValue)) {
                return;
            }
            LuaValue luaValueC3 = c3(i);
            e2(i, c3(i3));
            e2(i3, luaValueC3);
            i = i3;
        }
    }

    private LuaTable$n C3(LuaValue luaValue) {
        if (this.R <= 0) {
            return null;
        }
        for (LuaTable$m luaTable$mA = this.Q[i3(luaValue)]; luaTable$mA != null; luaTable$mA = luaTable$mA.a()) {
            LuaTable$n luaTable$nF = luaTable$mA.f(luaValue);
            if (luaTable$nF != null) {
                return luaTable$nF;
            }
        }
        return null;
    }

    private boolean U2(int i, LuaValue luaValue) {
        if (i <= 0) {
            return false;
        }
        LuaValue[] luaValueArr = this.P;
        if (i > luaValueArr.length) {
            return false;
        }
        int i2 = i - 1;
        if (luaValue.l1()) {
            luaValue = null;
        } else {
            e eVar = this.S;
            if (eVar != null) {
                luaValue = eVar.g(luaValue);
            }
        }
        luaValueArr[i2] = luaValue;
        return true;
    }

    private boolean V2(int i, int i2, LuaValue luaValue) {
        LuaValue luaValueC3 = c3(i);
        LuaValue luaValueC4 = c3(i2);
        if (luaValueC3 == null || luaValueC4 == null) {
            return false;
        }
        return luaValue != null ? luaValue.call(luaValueC3, luaValueC4).w2() : luaValueC3.u1(luaValueC4);
    }

    private int X2() {
        int i = 0;
        int i2 = 0;
        while (true) {
            LuaTable$m[] luaTable$mArr = this.Q;
            if (i >= luaTable$mArr.length) {
                return i2;
            }
            for (LuaTable$m luaTable$mA = luaTable$mArr[i]; luaTable$mA != null; luaTable$mA = luaTable$mA.a()) {
                if (luaTable$mA.l() != null) {
                    i2++;
                }
            }
            i++;
        }
    }

    private int Y2(int[] iArr) {
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        for (int i4 = 0; i4 < 31; i4++) {
            LuaValue[] luaValueArr = this.P;
            if (i2 > luaValueArr.length) {
                break;
            }
            int iMin = Math.min(luaValueArr.length, 1 << i4);
            int i5 = 0;
            while (i2 <= iMin) {
                int i6 = i2 + 1;
                if (this.P[i2 - 1] != null) {
                    i5++;
                }
                i2 = i6;
            }
            iArr[i4] = i5;
            i3 += i5;
        }
        while (true) {
            LuaTable$m[] luaTable$mArr = this.Q;
            if (i >= luaTable$mArr.length) {
                return i3;
            }
            for (LuaTable$m luaTable$mA = luaTable$mArr[i]; luaTable$mA != null; luaTable$mA = luaTable$mA.a()) {
                int iR = luaTable$mA.r(Integer.MAX_VALUE);
                if (iR > 0) {
                    int iU3 = u3(iR);
                    iArr[iU3] = iArr[iU3] + 1;
                    i3++;
                }
            }
            i++;
        }
    }

    protected static LuaTable$e Z2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue.i1()) {
            return new LuaTable$g(luaValue.y2(), luaValue2);
        }
        if (luaValue2 instanceof LuaBoolean) {
            return new LuaTable$b(luaValue, luaValue2.w2());
        }
        if (luaValue2 instanceof LuaLong) {
            long jZ2 = luaValue2.z2();
            int i = (int) jZ2;
            return ((long) i) == jZ2 ? new LuaTable$h(luaValue, i) : new LuaTable$k(luaValue, jZ2);
        }
        if (!(luaValue2 instanceof LuaDouble)) {
            return new LuaTable$l(luaValue, luaValue2);
        }
        double dX2 = luaValue2.x2();
        float f2 = (float) dX2;
        return ((double) f2) == dX2 ? new LuaTable$f(luaValue, f2) : new LuaTable$d(luaValue, dX2);
    }

    private void a3() {
        int i = 0;
        while (true) {
            LuaValue[] luaValueArr = this.P;
            if (i >= luaValueArr.length) {
                return;
            }
            this.S.o(luaValueArr, i);
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:113:0x0217  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0223  */
    /* JADX WARN: Code duplicated, block: B:118:0x022c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0233 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0235  */
    /* JADX WARN: Code duplicated, block: B:123:0x0238  */
    /* JADX WARN: Code duplicated, block: B:125:0x023c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0240  */
    /* JADX WARN: Code duplicated, block: B:129:0x0244  */
    /* JADX WARN: Code duplicated, block: B:131:0x0248  */
    /* JADX WARN: Code duplicated, block: B:132:0x024a  */
    /* JADX WARN: Code duplicated, block: B:133:0x024d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0250  */
    /* JADX WARN: Code duplicated, block: B:135:0x0253  */
    /* JADX WARN: Code duplicated, block: B:136:0x0256  */
    /* JADX WARN: Code duplicated, block: B:137:0x0259  */
    /* JADX WARN: Code duplicated, block: B:138:0x025c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0260  */
    /* JADX WARN: Code duplicated, block: B:142:0x0268  */
    /* JADX WARN: Code duplicated, block: B:144:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0271 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0273  */
    /* JADX WARN: Code duplicated, block: B:149:0x0277  */
    /* JADX WARN: Code duplicated, block: B:150:0x027a  */
    /* JADX WARN: Code duplicated, block: B:151:0x027d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0280  */
    /* JADX WARN: Code duplicated, block: B:155:0x0288  */
    /* JADX WARN: Code duplicated, block: B:157:0x0294  */
    /* JADX WARN: Code duplicated, block: B:160:0x029a  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:169:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d2  */
    private Appendable b3(String str, Appendable appendable, Map map) throws IOException {
        String strG0;
        boolean z;
        int iY2;
        String str2;
        int iY3;
        String strG1;
        int i;
        ArrayList arrayList;
        Appendable appendable2 = appendable;
        Set set = V;
        if (set != null) {
            set.add(this);
        }
        appendable2.append("{ -- ");
        appendable2.append(E2());
        appendable2.append("(");
        appendable2.append(Integer.toHexString(hashCode()));
        appendable2.append(")\n");
        int iS1 = s1();
        int i2 = W + iS1;
        W = i2;
        int iMax = iS1 == 0 ? 1 : (int) Math.max(1.0d, Math.min(10.0d, Math.log10(Math.abs(iS1)) + 1.0d));
        LuaTable$i luaTable$iS3 = s3();
        boolean z2 = str.length() > 0;
        boolean z3 = str.length() == 1;
        boolean z4 = i2 < 10000;
        int i3 = 1;
        ArrayList arrayList2 = null;
        boolean z5 = true;
        String str3 = null;
        while (luaTable$iS3.c()) {
            LuaValue luaValueB = luaTable$iS3.b();
            if (!z3 || map == null || map.get(luaValueB) != null) {
                if (z4 && z5) {
                    if (luaValueB.i1()) {
                        int i4 = i3 + 1;
                        if (luaValueB.y2() != i3) {
                            i3 = i4;
                            z5 = false;
                        } else {
                            i3 = i4;
                        }
                    } else {
                        z5 = false;
                    }
                }
                if (!luaValueB.d1()) {
                    LuaValue luaValueD = luaTable$iS3.d();
                    if (!luaValueD.d1()) {
                        Appendable sb = z5 ? appendable2 : new StringBuilder();
                        if (z2) {
                            sb.append(str);
                        }
                        boolean z6 = z4;
                        sb.append("\t[");
                        LuaTable$i luaTable$i = luaTable$iS3;
                        boolean z7 = z3;
                        int i5 = iS1;
                        int i6 = i3;
                        ArrayList arrayList3 = arrayList2;
                        if (luaValueB.i1()) {
                            t2.a(sb, iMax, ' ', Integer.toString(luaValueB.y2()));
                        } else {
                            if (set == null || !(luaValueB instanceof LuaTable)) {
                                iMax = iMax;
                                if (luaValueB instanceof LuaString) {
                                    sb.append('\'');
                                    strG0 = luaValueB.g0();
                                    if (strG0.indexOf(39) >= 0) {
                                        strG0 = strG0.replace("'", "\\'");
                                    }
                                    sb.append(strG0);
                                    sb.append('\'');
                                } else {
                                    sb.append(luaValueB.g0());
                                }
                                sb.append("] = ");
                                if (set == null && (luaValueD instanceof LuaTable)) {
                                    LuaTable luaTable = (LuaTable) luaValueD;
                                    if (set.contains(luaTable)) {
                                        sb.append("{ -- table(");
                                        sb.append(Integer.toHexString(luaTable.hashCode()));
                                        sb.append(")\n");
                                        if (z2) {
                                            sb.append(str);
                                        }
                                        sb.append("\t\t-- *** RECURSION ***\n");
                                        if (z2) {
                                            sb.append(str);
                                        }
                                        sb.append("\t}");
                                    } else {
                                        if (str3 == null) {
                                            str3 = str + '\t';
                                        }
                                        String str4 = str3;
                                        luaTable.b3(str4, sb, map);
                                        str3 = str4;
                                    }
                                    sb.append(',');
                                    str2 = null;
                                } else {
                                    if (luaValueD instanceof LuaString) {
                                        sb.append('\'');
                                        strG1 = luaValueD.g0();
                                        if (strG1.indexOf(39) >= 0) {
                                            strG1 = strG1.replace("'", "\\'");
                                        }
                                        sb.append(strG1);
                                        sb.append("',");
                                    } else if (luaValueD instanceof LuaLong) {
                                        if (strG0 == null && (luaValueB instanceof LuaString)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z || !strG0.equals("address")) {
                                            sb.append(luaValueD.g0());
                                            if (z) {
                                                if (strG0.equals("flags")) {
                                                    iY3 = luaValueD.y2();
                                                    if (iY3 == 1) {
                                                        str2 = "gg.TYPE_BYTE";
                                                    } else if (iY3 == 2) {
                                                        str2 = "gg.TYPE_WORD";
                                                    } else if (iY3 == 4) {
                                                        str2 = "gg.TYPE_DWORD";
                                                    } else if (iY3 == 8) {
                                                        str2 = "gg.TYPE_XOR";
                                                    } else if (iY3 == 16) {
                                                        str2 = "gg.TYPE_FLOAT";
                                                    } else if (iY3 == 32) {
                                                        str2 = "gg.TYPE_QWORD";
                                                    } else if (iY3 != 64) {
                                                        str2 = null;
                                                    } else {
                                                        str2 = "gg.TYPE_DOUBLE";
                                                    }
                                                } else {
                                                    if (strG0.equals("freezeType")) {
                                                        iY2 = luaValueD.y2();
                                                        if (iY2 == 0) {
                                                            str2 = "gg.FREEZE_NORMAL";
                                                        } else if (iY2 == 1) {
                                                            str2 = "gg.FREEZE_MAY_INCREASE";
                                                        } else if (iY2 == 2) {
                                                            str2 = "gg.FREEZE_MAY_DECREASE";
                                                        } else if (iY2 == 3) {
                                                            str2 = "gg.FREEZE_IN_RANGE";
                                                        }
                                                    }
                                                    str2 = null;
                                                }
                                            }
                                            sb.append(',');
                                        } else {
                                            sb.append("0x");
                                            sb.append(Long.toHexString(luaValueD.z2()));
                                        }
                                        str2 = null;
                                        sb.append(',');
                                    } else {
                                        sb.append(luaValueD.g0());
                                        if (!(luaValueD instanceof Script$ApiFunction)) {
                                            sb.append(',');
                                        }
                                    }
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    sb.append(" -- ");
                                    sb.append(str2);
                                }
                                sb.append('\n');
                                if (z5) {
                                    arrayList2 = arrayList3;
                                } else {
                                    if (arrayList3 == null) {
                                        i = i5 - (i6 - 1);
                                        if (i < 0) {
                                            arrayList = new ArrayList();
                                        } else {
                                            arrayList = new ArrayList(i);
                                        }
                                        arrayList2 = arrayList;
                                    } else {
                                        arrayList2 = arrayList3;
                                    }
                                    arrayList2.add(sb.toString());
                                }
                                appendable2 = appendable;
                                z4 = z6;
                                luaTable$iS3 = luaTable$i;
                                z3 = z7;
                                iS1 = i5;
                                i3 = i6;
                                iMax = iMax;
                            } else {
                                LuaTable luaTable2 = (LuaTable) luaValueB;
                                if (set.contains(luaTable2)) {
                                    sb.append("{ -- table(");
                                    sb.append(Integer.toHexString(luaTable2.hashCode()));
                                    sb.append(")\n");
                                    if (z2) {
                                        sb.append(str);
                                    }
                                    sb.append("\t\t-- *** RECURSION ***\n");
                                    if (z2) {
                                        sb.append(str);
                                    }
                                    sb.append("\t}");
                                } else {
                                    if (str3 == null) {
                                        str3 = str + '\t';
                                    }
                                    String str5 = str3;
                                    luaTable2.b3(str5, sb, map);
                                    str3 = str5;
                                }
                            }
                            strG0 = null;
                            sb.append("] = ");
                            if (set == null) {
                                if (luaValueD instanceof LuaString) {
                                    sb.append('\'');
                                    strG1 = luaValueD.g0();
                                    if (strG1.indexOf(39) >= 0) {
                                        strG1 = strG1.replace("'", "\\'");
                                    }
                                    sb.append(strG1);
                                    sb.append("',");
                                } else if (luaValueD instanceof LuaLong) {
                                    if (strG0 == null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    } else {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    }
                                    sb.append(',');
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (!(luaValueD instanceof Script$ApiFunction)) {
                                        sb.append(',');
                                    }
                                }
                                str2 = null;
                            } else {
                                if (luaValueD instanceof LuaString) {
                                    sb.append('\'');
                                    strG1 = luaValueD.g0();
                                    if (strG1.indexOf(39) >= 0) {
                                        strG1 = strG1.replace("'", "\\'");
                                    }
                                    sb.append(strG1);
                                    sb.append("',");
                                } else if (luaValueD instanceof LuaLong) {
                                    if (strG0 == null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    } else {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    }
                                    sb.append(',');
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (!(luaValueD instanceof Script$ApiFunction)) {
                                        sb.append(',');
                                    }
                                }
                                str2 = null;
                            }
                            if (str2 != null) {
                                sb.append(" -- ");
                                sb.append(str2);
                            }
                            sb.append('\n');
                            if (z5) {
                                if (arrayList3 == null) {
                                    i = i5 - (i6 - 1);
                                    if (i < 0) {
                                        arrayList = new ArrayList();
                                    } else {
                                        arrayList = new ArrayList(i);
                                    }
                                    arrayList2 = arrayList;
                                } else {
                                    arrayList2 = arrayList3;
                                }
                                arrayList2.add(sb.toString());
                            } else {
                                arrayList2 = arrayList3;
                            }
                            appendable2 = appendable;
                            z4 = z6;
                            luaTable$iS3 = luaTable$i;
                            z3 = z7;
                            iS1 = i5;
                            i3 = i6;
                            iMax = iMax;
                        }
                        iMax = iMax;
                        strG0 = null;
                        sb.append("] = ");
                        if (set == null) {
                            if (luaValueD instanceof LuaString) {
                                sb.append('\'');
                                strG1 = luaValueD.g0();
                                if (strG1.indexOf(39) >= 0) {
                                    strG1 = strG1.replace("'", "\\'");
                                }
                                sb.append(strG1);
                                sb.append("',");
                            } else if (luaValueD instanceof LuaLong) {
                                if (strG0 == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                }
                                sb.append(',');
                            } else {
                                sb.append(luaValueD.g0());
                                if (!(luaValueD instanceof Script$ApiFunction)) {
                                    sb.append(',');
                                }
                            }
                            str2 = null;
                        } else {
                            if (luaValueD instanceof LuaString) {
                                sb.append('\'');
                                strG1 = luaValueD.g0();
                                if (strG1.indexOf(39) >= 0) {
                                    strG1 = strG1.replace("'", "\\'");
                                }
                                sb.append(strG1);
                                sb.append("',");
                            } else if (luaValueD instanceof LuaLong) {
                                if (strG0 == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                }
                                sb.append(',');
                            } else {
                                sb.append(luaValueD.g0());
                                if (!(luaValueD instanceof Script$ApiFunction)) {
                                    sb.append(',');
                                }
                            }
                            str2 = null;
                        }
                        if (str2 != null) {
                            sb.append(" -- ");
                            sb.append(str2);
                        }
                        sb.append('\n');
                        if (z5) {
                            if (arrayList3 == null) {
                                i = i5 - (i6 - 1);
                                if (i < 0) {
                                    arrayList = new ArrayList();
                                } else {
                                    arrayList = new ArrayList(i);
                                }
                                arrayList2 = arrayList;
                            } else {
                                arrayList2 = arrayList3;
                            }
                            arrayList2.add(sb.toString());
                        } else {
                            arrayList2 = arrayList3;
                        }
                        appendable2 = appendable;
                        z4 = z6;
                        luaTable$iS3 = luaTable$i;
                        z3 = z7;
                        iS1 = i5;
                        i3 = i6;
                        iMax = iMax;
                    }
                }
            }
        }
        ArrayList arrayList4 = arrayList2;
        if (arrayList4 != null) {
            try {
                Collections.sort(arrayList4);
            } catch (Throwable th) {
                e1.a(th);
            }
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                appendable.append((String) it.next());
            }
        }
        if (z2) {
            appendable.append(str);
        }
        appendable.append('}');
        return appendable;
    }

    private void h3(LuaValue luaValue) {
        if (this.Q.length > 0) {
            int iI3 = i3(luaValue);
            for (LuaTable$m luaTable$mA = this.Q[iI3]; luaTable$mA != null; luaTable$mA = luaTable$mA.a()) {
                LuaTable$n luaTable$nF = luaTable$mA.f(luaValue);
                if (luaTable$nF != null) {
                    LuaTable$m[] luaTable$mArr = this.Q;
                    luaTable$mArr[iI3] = luaTable$mArr[iI3].h(luaTable$nF);
                    this.R--;
                    return;
                }
            }
        }
    }

    private int i3(LuaValue luaValue) {
        return luaValue.hashCode() & (this.Q.length - 1);
    }

    public static int j3(LuaValue luaValue, int i) {
        return luaValue.hashCode() & i;
    }

    public static int l3(int i, int i2) {
        return i & i2;
    }

    private void n3(int i, LuaValue luaValue) {
        o3(i, luaValue);
        while (i > 1) {
            LuaValue luaValueC3 = c3(i);
            e2(i, c3(1));
            e2(1, luaValueC3);
            i--;
            B3(1, i, luaValue);
        }
    }

    private void o3(int i, LuaValue luaValue) {
        for (int i2 = i / 2; i2 > 0; i2--) {
            B3(i2, i, luaValue);
        }
    }

    protected static boolean r3(LuaValue luaValue) {
        int iC2 = luaValue.C2();
        if (iC2 == 1 || iC2 == 3) {
            return false;
        }
        return iC2 != 4 || luaValue.W1() > 32;
    }

    static int u3(int i) {
        int i2;
        int i3 = i - 1;
        if (i3 < 0) {
            return Integer.MIN_VALUE;
        }
        if (((-65536) & i3) != 0) {
            i3 >>>= 16;
            i2 = 16;
        } else {
            i2 = 0;
        }
        if ((65280 & i3) != 0) {
            i2 += 8;
            i3 >>>= 8;
        }
        if ((i3 & 240) != 0) {
            i2 += 4;
            i3 >>>= 4;
        }
        switch (i3) {
            case 0:
                return 0;
            case 1:
                return i2 + 1;
            case 2:
            case 3:
                return i2 + 2;
            case 4:
            case 5:
            case 6:
            case 7:
                return i2 + 3;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i2 + 4;
            default:
                return i2;
        }
    }

    private void y3(int i) {
        LuaValue[] luaValueArr;
        LuaTable$m[] luaTable$mArr;
        int i2;
        LuaTable$m luaTable$mZ2;
        e eVar = this.S;
        if (eVar != null && (eVar.q() || this.S.p())) {
            this.R = X2();
            if (this.S.p()) {
                a3();
            }
        }
        int[] iArr = new int[32];
        int iY2 = Y2(iArr);
        if (i > 0) {
            iY2++;
            int iU3 = u3(i);
            iArr[iU3] = iArr[iU3] + 1;
        }
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = 0;
        while (true) {
            if (i4 >= 32) {
                break;
            }
            i3 += iArr[i4];
            int i6 = 1 << i4;
            if (iY2 * 2 < i6) {
                break;
            }
            if (i3 >= (1 << (i4 - 1))) {
                i5 = i6;
            }
            i4++;
        }
        LuaValue[] luaValueArr2 = this.P;
        LuaTable$m[] luaTable$mArr2 = this.Q;
        int i7 = (i <= 0 || i > i5) ? 0 : -1;
        if (i5 != luaValueArr2.length) {
            luaValueArr = new LuaValue[i5];
            if (i5 > luaValueArr2.length) {
                int iU4 = u3(i5) + 1;
                for (int iU5 = u3(luaValueArr2.length + 1); iU5 < iU4; iU5++) {
                    i7 += iArr[iU5];
                }
            } else if (luaValueArr2.length > i5) {
                int iU6 = u3(luaValueArr2.length) + 1;
                for (int iU7 = u3(i5 + 1); iU7 < iU6; iU7++) {
                    i7 -= iArr[iU7];
                }
            }
            System.arraycopy(luaValueArr2, 0, luaValueArr, 0, Math.min(luaValueArr2.length, i5));
        } else {
            luaValueArr = luaValueArr2;
        }
        int i8 = (this.R - i7) + ((i < 0 || i > i5) ? 1 : 0);
        if (i8 > 0) {
            int iU8 = i8 >= 2 ? 1 << u3(i8) : 2;
            i2 = iU8 - 1;
            luaTable$mArr = new LuaTable$m[iU8];
        } else {
            luaTable$mArr = U;
            i2 = 0;
        }
        for (LuaTable$m luaTable$mA : luaTable$mArr2) {
            for (; luaTable$mA != null; luaTable$mA = luaTable$mA.a()) {
                int iR = luaTable$mA.r(i5);
                if (iR > 0) {
                    LuaTable$n luaTable$nL = luaTable$mA.l();
                    if (luaTable$nL != null) {
                        luaValueArr[iR - 1] = luaTable$nL.t();
                    }
                } else if (!(luaTable$mA instanceof LuaTable$c)) {
                    int iB = luaTable$mA.b(i2);
                    luaTable$mArr[iB] = luaTable$mA.n(luaTable$mArr[iB]);
                }
            }
        }
        while (i5 < luaValueArr2.length) {
            int i9 = i5 + 1;
            LuaValue luaValue = luaValueArr2[i5];
            if (luaValue != null) {
                long j = i9;
                int iL3 = l3(LuaLong.V2(j), i2);
                e eVar2 = this.S;
                LuaLong luaLongI2 = LuaValue.I2(j);
                if (eVar2 != null) {
                    luaTable$mZ2 = eVar2.k(luaLongI2, luaValue);
                    if (luaTable$mZ2 == null) {
                    }
                } else {
                    luaTable$mZ2 = Z2(luaLongI2, luaValue);
                }
                LuaTable$m luaTable$m = luaTable$mArr[iL3];
                if (luaTable$m != null) {
                    luaTable$mZ2 = luaTable$m.d(luaTable$mZ2);
                }
                luaTable$mArr[iL3] = luaTable$mZ2;
            }
            i5 = i9;
        }
        this.Q = luaTable$mArr;
        this.P = luaValueArr;
        this.R -= i7;
    }

    @Override // luaj.LuaValue
    public int C2() {
        return 5;
    }

    @Override // luaj.LuaValue
    public String D2() {
        return "table";
    }

    public void D3(LuaValue luaValue) {
        int iS1 = s1();
        if (iS1 >= 16777215) {
            throw new d("array too big: " + iS1 + " >= 16777215");
        }
        e eVar = this.S;
        if (eVar != null && eVar.p()) {
            a3();
        }
        if (iS1 > 1) {
            if (luaValue.l1()) {
                luaValue = null;
            }
            n3(iS1, luaValue);
        }
    }

    public String E3(Appendable appendable, Map map) {
        if (V != null) {
            return b3("", appendable, map).toString();
        }
        V = new HashSet();
        W = 0;
        String string = b3("", appendable, map).toString();
        W = 0;
        V = null;
        return string;
    }

    public Varargs F3(long j, long j2) {
        if (j2 < j) {
            return LuaValue.f1676f;
        }
        long j3 = j2 - j;
        if (j3 < 0) {
            throw new d("too many results to unpack: greater 9223372036854775807");
        }
        if (j3 >= 16777215) {
            throw new d("too many results to unpack: " + j3 + " (max is 16777215)");
        }
        int i = (int) (j3 + 1);
        int i2 = (int) j;
        boolean z = ((long) i2) == j && ((long) ((int) j2)) == j2;
        if (i <= 0) {
            return LuaValue.f1676f;
        }
        if (i == 1) {
            return z ? c3(i2) : U0(LuaLong.I2(j));
        }
        if (i == 2) {
            LuaValue luaValueC3 = z ? c3(i2) : U0(LuaLong.I2(j));
            long j4 = j + 1;
            return LuaValue.N2(luaValueC3, z ? c3((int) j4) : U0(LuaLong.I2(j4)));
        }
        try {
            LuaValue[] luaValueArr = new LuaValue[i];
            while (true) {
                i--;
                if (i < 0) {
                    return LuaValue.O2(luaValueArr);
                }
                long j5 = ((long) i) + j;
                luaValueArr[i] = z ? c3((int) j5) : U0(LuaLong.I2(j5));
            }
        } catch (OutOfMemoryError e2) {
            e1.l("OOM on unpack: " + i, e2);
            throw new d("too many results to unpack [out of memory]: " + i);
        }
    }

    public void G3(int i, LuaString luaString, double d2) {
        LuaTable$m[] luaTable$mArr = this.Q;
        float f2 = (float) d2;
        LuaTable$m luaTable$f = ((double) f2) == d2 ? new LuaTable$f(luaString, f2) : new LuaTable$d(luaString, d2);
        LuaTable$m luaTable$m = luaTable$mArr[i];
        if (luaTable$m != null) {
            luaTable$f = luaTable$m.d(luaTable$f);
        }
        luaTable$mArr[i] = luaTable$f;
        this.R++;
    }

    @Override // luaj.LuaValue
    public LuaTable H0() {
        return this;
    }

    public void H3(int i, LuaString luaString, float f2) {
        LuaTable$m[] luaTable$mArr = this.Q;
        LuaTable$m luaTable$f = new LuaTable$f(luaString, f2);
        LuaTable$m luaTable$m = luaTable$mArr[i];
        if (luaTable$m != null) {
            luaTable$f = luaTable$m.d(luaTable$f);
        }
        luaTable$mArr[i] = luaTable$f;
        this.R++;
    }

    public void I3(int i, LuaString luaString, int i2) {
        LuaTable$m[] luaTable$mArr = this.Q;
        LuaTable$m luaTable$h = new LuaTable$h(luaString, i2);
        LuaTable$m luaTable$m = luaTable$mArr[i];
        if (luaTable$m != null) {
            luaTable$h = luaTable$m.d(luaTable$h);
        }
        luaTable$mArr[i] = luaTable$h;
        this.R++;
    }

    public void J3(int i, LuaString luaString, long j) {
        LuaTable$m[] luaTable$mArr = this.Q;
        int i2 = (int) j;
        LuaTable$m luaTable$h = ((long) i2) == j ? new LuaTable$h(luaString, i2) : new LuaTable$k(luaString, j);
        LuaTable$m luaTable$m = luaTable$mArr[i];
        if (luaTable$m != null) {
            luaTable$h = luaTable$m.d(luaTable$h);
        }
        luaTable$mArr[i] = luaTable$h;
        this.R++;
    }

    public void K3(int i, LuaString luaString, boolean z) {
        LuaTable$m[] luaTable$mArr = this.Q;
        LuaTable$m luaTable$b = new LuaTable$b(luaString, z);
        LuaTable$m luaTable$m = luaTable$mArr[i];
        if (luaTable$m != null) {
            luaTable$b = luaTable$m.d(luaTable$b);
        }
        luaTable$mArr[i] = luaTable$b;
        this.R++;
    }

    @Override // luaj.LuaValue
    public LuaTable L1(LuaTable luaTable) {
        return this;
    }

    @Override // luaj.LuaValue
    public boolean P0(LuaValue luaValue) {
        if (this == luaValue) {
            return true;
        }
        if (luaValue.o1()) {
            return LuaValue.Q0(this, luaValue);
        }
        return false;
    }

    @Override // luaj.LuaValue
    public void R1(int i) {
        LuaValue[] luaValueArr = this.P;
        if (i > luaValueArr.length) {
            this.P = A3(luaValueArr, 1 << u3(i));
        }
    }

    @Override // luaj.LuaValue
    public LuaValue U0(LuaValue luaValue) {
        LuaValue luaValueV1 = V1(luaValue);
        return (!luaValueV1.l1() || this.S == null) ? luaValueV1 : LuaValue.W0(this, luaValue);
    }

    @Override // luaj.LuaValue
    public LuaValue V0() {
        e eVar = this.S;
        if (eVar != null) {
            return eVar.e();
        }
        return null;
    }

    @Override // luaj.LuaValue
    public LuaValue V1(LuaValue luaValue) {
        int iY2;
        if (luaValue.i1() && (iY2 = luaValue.y2()) > 0) {
            LuaValue[] luaValueArr = this.P;
            if (iY2 <= luaValueArr.length) {
                e eVar = this.S;
                int i = iY2 - 1;
                LuaValue luaValueO = eVar == null ? luaValueArr[i] : eVar.o(luaValueArr, i);
                return luaValueO != null ? luaValueO : LuaValue.f1673c;
            }
        }
        return k3(luaValue);
    }

    @Override // luaj.LuaValue
    public int W1() {
        int i;
        int iD3 = d3();
        if (iD3 == 0 || !x3(iD3).l1()) {
            int iF3 = iD3 + 1;
            int i2 = iD3;
            while (!x3(iF3).l1()) {
                i2 = iF3;
                iF3 = f3() + iD3 + 1 + iF3;
            }
            iD3 = iF3;
            i = i2;
        } else {
            i = 0;
        }
        while (iD3 > i + 1) {
            int i3 = (i + iD3) / 2;
            if (x3(i3).l1()) {
                iD3 = i3;
            } else {
                i = i3;
            }
        }
        return i;
    }

    public LuaValue W2(LuaString luaString, int i, int i2) {
        f.a aVar = new f.a();
        if (i <= i2) {
            while (true) {
                aVar.c(c3(i).G0());
                if (i >= Integer.MAX_VALUE || (i = i + 1) > i2) {
                    break;
                }
                aVar.c(luaString);
            }
        }
        return aVar.l();
    }

    @Override // luaj.LuaValue
    public void Y1(int i, LuaValue luaValue) {
        if (luaValue == null || U2(i, luaValue)) {
            return;
        }
        m3(LuaLong.I2(i), luaValue);
    }

    public LuaValue c3(int i) {
        LuaValue luaValueX3 = x3(i);
        return (!luaValueX3.l1() || this.S == null) ? luaValueX3 : LuaValue.W0(this, LuaValue.I2(i));
    }

    @Override // luaj.LuaValue
    public void d2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue == null || luaValue2 == null) {
            return;
        }
        if (luaValue.i1() && U2(luaValue.y2(), luaValue2)) {
            return;
        }
        m3(luaValue, luaValue2);
    }

    public int d3() {
        return this.P.length;
    }

    @Override // luaj.e
    public LuaValue e() {
        return this;
    }

    @Override // luaj.LuaValue
    public void e2(int i, LuaValue luaValue) {
        if (this.S != null && x3(i).l1() && LuaValue.l2(this, LuaLong.I2(i), luaValue)) {
            return;
        }
        Y1(i, luaValue);
    }

    public int e3() {
        return this.R;
    }

    public int f3() {
        return this.Q.length;
    }

    @Override // luaj.e
    public LuaValue g(LuaValue luaValue) {
        return luaValue;
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String g0() {
        try {
            return E3(new StringBuilder(), null);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public long g3(LuaValue luaValue) {
        LuaTable$n luaTable$nC3 = C3(luaValue);
        if (luaTable$nC3 == null) {
            return (this.S != null ? LuaValue.W0(this, luaValue) : LuaValue.f1673c).C0();
        }
        if (luaTable$nC3 instanceof LuaTable$h) {
            return ((LuaTable$h) luaTable$nC3).k0();
        }
        return luaTable$nC3 instanceof LuaTable$k ? ((LuaTable$k) luaTable$nC3).k0() : luaTable$nC3.t().C0();
    }

    @Override // luaj.LuaValue
    public void j2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue == null || !(luaValue.q1() || x1(LuaValue.m).g1())) {
            throw new d("value ('" + luaValue + "') can not be used as a table index");
        }
        if (this.S != null && V1(luaValue).l1() && LuaValue.l2(this, luaValue, luaValue2)) {
            return;
        }
        d2(luaValue, luaValue2);
    }

    @Override // luaj.e
    public LuaTable$m k(LuaValue luaValue, LuaValue luaValue2) {
        return Z2(luaValue, luaValue2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x003d  */
    @Override // luaj.LuaValue
    public LuaValue k2(LuaValue luaValue) {
        e eVar = this.S;
        boolean z = eVar != null && eVar.q();
        e eVar2 = this.S;
        boolean z2 = eVar2 != null && eVar2.p();
        e eVarW1 = LuaValue.w1(luaValue);
        this.S = eVarW1;
        if (z != (eVarW1 != null && eVarW1.q())) {
            y3(0);
        } else {
            e eVar3 = this.S;
            if (z2 != (eVar3 != null && eVar3.p())) {
                y3(0);
            }
        }
        return this;
    }

    protected LuaValue k3(LuaValue luaValue) {
        LuaTable$n luaTable$nC3 = C3(luaValue);
        return luaTable$nC3 == null ? LuaValue.f1673c : luaTable$nC3.t();
    }

    public void m3(LuaValue luaValue, LuaValue luaValue2) {
        int iI3;
        if (luaValue2.l1()) {
            h3(luaValue);
            return;
        }
        if (this.Q.length > 0) {
            iI3 = i3(luaValue);
            for (LuaTable$m luaTable$mA = this.Q[iI3]; luaTable$mA != null; luaTable$mA = luaTable$mA.a()) {
                LuaTable$n luaTable$nF = luaTable$mA.f(luaValue);
                if (luaTable$nF != null) {
                    LuaTable$m[] luaTable$mArr = this.Q;
                    luaTable$mArr[iI3] = luaTable$mArr[iI3].j(luaTable$nF, luaValue2);
                    return;
                }
            }
        } else {
            iI3 = 0;
        }
        if (this.R >= this.Q.length) {
            e eVar = this.S;
            if ((eVar == null || !eVar.p()) && luaValue.i1() && luaValue.y2() > 0) {
                y3(luaValue.y2());
                if (U2(luaValue.y2(), luaValue2)) {
                    return;
                }
            } else {
                y3(-1);
            }
            iI3 = i3(luaValue);
        }
        e eVar2 = this.S;
        LuaTable$m luaTable$mK = eVar2 != null ? eVar2.k(luaValue, luaValue2) : Z2(luaValue, luaValue2);
        LuaTable$m[] luaTable$mArr2 = this.Q;
        LuaTable$m luaTable$m = luaTable$mArr2[iI3];
        if (luaTable$m != null) {
            luaTable$mK = luaTable$m.d(luaTable$mK);
        }
        luaTable$mArr2[iI3] = luaTable$mK;
        this.R++;
    }

    @Override // luaj.e
    public LuaValue o(LuaValue[] luaValueArr, int i) {
        return luaValueArr[i];
    }

    @Override // luaj.LuaValue
    public boolean o1() {
        return true;
    }

    @Override // luaj.e
    public boolean p() {
        return false;
    }

    public Varargs p3(LuaValue luaValue) {
        int iA0 = luaValue.A0() + 1;
        LuaValue luaValueC3 = c3(iA0);
        return luaValueC3.l1() ? LuaValue.f1676f : LuaValue.N2(LuaLong.I2(iA0), luaValueC3);
    }

    @Override // luaj.e
    public boolean q() {
        return false;
    }

    public void q3(int i, LuaValue luaValue) {
        while (!luaValue.l1()) {
            LuaValue luaValueC3 = c3(i);
            e2(i, luaValue);
            luaValue = luaValueC3;
            i++;
        }
    }

    @Override // luaj.LuaValue
    public LuaValue r1() {
        LuaValue luaValueX1 = x1(LuaValue.x);
        return luaValueX1.w2() ? luaValueX1.call(this) : LuaLong.I2(W1());
    }

    @Override // luaj.LuaValue
    public int s1() {
        if (this.S == null) {
            return W1();
        }
        LuaValue luaValueR1 = r1();
        if (luaValueR1.i1()) {
            return luaValueR1.y2();
        }
        throw new d("table length is not an integer: " + luaValueR1);
    }

    public LuaTable$i s3() {
        return new LuaTable$i(this);
    }

    public LuaValue[] t3() {
        ArrayList arrayList = new ArrayList();
        LuaTable$i luaTable$iS3 = s3();
        while (luaTable$iS3.c()) {
            arrayList.add(luaTable$iS3.b());
        }
        LuaValue[] luaValueArr = new LuaValue[arrayList.size()];
        arrayList.toArray(luaValueArr);
        return luaValueArr;
    }

    public Varargs v3(LuaValue luaValue) {
        int iY2;
        int length = 0;
        if (!luaValue.l1()) {
            if (!luaValue.i1() || (iY2 = luaValue.y2()) <= 0 || iY2 > this.P.length) {
                if (this.Q.length == 0) {
                    LuaValue.R0("invalid key to 'next' 1: " + luaValue);
                }
                int iI3 = i3(luaValue);
                for (LuaTable$m luaTable$mA = this.Q[iI3]; luaTable$mA != null; luaTable$mA = luaTable$mA.a()) {
                    if (length != 0) {
                        LuaTable$n luaTable$nL = luaTable$mA.l();
                        if (luaTable$nL != null) {
                            return luaTable$nL.c();
                        }
                    } else if (luaTable$mA.s(luaValue)) {
                        length = 1;
                    }
                }
                if (length == 0) {
                    LuaValue.R0("invalid key to 'next' 2: " + luaValue);
                }
                length = iI3 + this.P.length + 1;
            } else {
                length = iY2;
            }
        }
        while (true) {
            LuaValue[] luaValueArr = this.P;
            if (length < luaValueArr.length) {
                LuaValue luaValueO = luaValueArr[length];
                if (luaValueO != null) {
                    e eVar = this.S;
                    if (eVar != null) {
                        luaValueO = eVar.o(luaValueArr, length);
                    }
                    if (luaValueO != null) {
                        return LuaValue.N2(LuaLong.I2(length + 1), luaValueO);
                    }
                }
                length++;
            } else {
                int length2 = length - luaValueArr.length;
                while (true) {
                    LuaTable$m[] luaTable$mArr = this.Q;
                    if (length2 >= luaTable$mArr.length) {
                        return LuaValue.f1673c;
                    }
                    for (LuaTable$m luaTable$mA2 = luaTable$mArr[length2]; luaTable$mA2 != null; luaTable$mA2 = luaTable$mA2.a()) {
                        LuaTable$n luaTable$nL2 = luaTable$mA2.l();
                        if (luaTable$nL2 != null) {
                            return luaTable$nL2.c();
                        }
                    }
                    length2++;
                }
            }
        }
    }

    public void w3(int i, int i2) {
        if (i2 > 0 && i2 < 2) {
            i2 = 2;
        }
        this.P = i > 0 ? new LuaValue[1 << u3(i)] : LuaValue.j;
        this.Q = i2 > 0 ? new LuaTable$m[1 << u3(i2)] : U;
        this.R = 0;
    }

    public LuaValue x3(int i) {
        if (i > 0) {
            LuaValue[] luaValueArr = this.P;
            if (i <= luaValueArr.length) {
                e eVar = this.S;
                int i2 = i - 1;
                LuaValue luaValueO = eVar == null ? luaValueArr[i2] : eVar.o(luaValueArr, i2);
                return luaValueO != null ? luaValueO : LuaValue.f1673c;
            }
        }
        return k3(LuaLong.I2(i));
    }

    public LuaValue z3(int i, int i2) {
        if (i == 0) {
            i = i2;
        } else if (i > i2) {
            return LuaValue.f1676f;
        }
        LuaValue luaValueC3 = c3(i);
        LuaValue luaValue = luaValueC3;
        while (!luaValue.l1()) {
            int i3 = i + 1;
            LuaValue luaValueC4 = c3(i3);
            e2(i, luaValueC4);
            i = i3;
            luaValue = luaValueC4;
        }
        return luaValueC3.l1() ? LuaValue.f1676f : luaValueC3;
    }
}
