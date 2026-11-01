package luaj.lib;

import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$getinfo extends VarArgFunction {
    final /* synthetic */ DebugLib T;

    DebugLib$getinfo(DebugLib debugLib) {
        this.T = debugLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaThread luaThreadJ;
        int i;
        DebugLib$a debugLib$aC;
        LuaString luaString;
        int i2;
        LuaValue luaValueI2;
        if (varargs.T(1)) {
            luaThreadJ = varargs.J(1);
            i = 2;
        } else {
            luaThreadJ = this.T.T.f0;
            i = 1;
        }
        LuaValue luaValueV = varargs.v(i);
        String strZ = varargs.Z(i + 1, "flnStu");
        DebugLib$b debugLib$bZ2 = this.T.Z2(luaThreadJ);
        if (luaValueV.m1()) {
            int iY2 = luaValueV.y2();
            if (debugLib$bZ2.e(1).f1749a == this) {
                iY2++;
            }
            debugLib$aC = debugLib$bZ2.e(iY2);
            if (debugLib$aC == null) {
                return LuaValue.f1676f;
            }
            luaValueV = debugLib$aC.f1749a;
        } else {
            if (!luaValueV.g1()) {
                return LuaValue.k0(i, "function or level");
            }
            debugLib$aC = debugLib$bZ2.c(luaValueV);
        }
        DebugLib$c debugLib$cA = debugLib$bZ2.a(strZ, (LuaFunction) luaValueV, debugLib$aC);
        LuaTable luaTable = new LuaTable();
        for (int i3 = 0; i3 < strZ.length(); i3++) {
            char cCharAt = strZ.charAt(i3);
            if (cCharAt != 'L') {
                if (cCharAt == 'S') {
                    luaTable.j2(DebugLib.j0, LuaValue.K2(debugLib$cA.f1760c));
                    luaTable.j2(DebugLib.k0, LuaValue.K2(debugLib$cA.f1761d));
                    luaTable.j2(DebugLib.l0, LuaValue.K2(debugLib$cA.l));
                    luaTable.j2(DebugLib.m0, LuaValue.I2(debugLib$cA.f1763f));
                    luaString = DebugLib.n0;
                    i2 = debugLib$cA.f1764g;
                } else if (cCharAt != 'f') {
                    if (cCharAt != 'l') {
                        if (cCharAt == 'n') {
                            LuaString luaString2 = DebugLib.h0;
                            String str = debugLib$cA.f1758a;
                            luaTable.j2(luaString2, str != null ? LuaValue.K2(str) : LuaValue.f1673c);
                            luaString = DebugLib.i0;
                            luaValueI2 = LuaValue.K2(debugLib$cA.f1759b);
                        } else if (cCharAt == 't') {
                            luaString = DebugLib.d0;
                            luaValueI2 = LuaValue.H2(debugLib$cA.k);
                        } else if (cCharAt != 'u') {
                            char cCharAt2 = strZ.charAt(i3);
                            LuaValue.l0(i + 1, "debug.getinfo", "invalid option: '" + cCharAt2 + "' [0x" + Integer.toHexString(cCharAt2) + "] at index " + (i3 + 1) + " in '" + strZ + "'");
                        } else {
                            luaTable.j2(DebugLib.f0, LuaValue.I2(debugLib$cA.h));
                            luaTable.j2(DebugLib.g0, LuaValue.I2(debugLib$cA.i));
                            luaString = DebugLib.e0;
                            luaValueI2 = debugLib$cA.j ? LuaValue.f1674d : LuaValue.f1675e;
                        }
                        luaTable.j2(luaString, luaValueI2);
                    } else {
                        luaString = DebugLib.o0;
                        i2 = debugLib$cA.f1762e;
                    }
                } else if (luaValueV != null) {
                    luaTable.j2(DebugLib.c0, luaValueV);
                }
                luaValueI2 = LuaValue.I2(i2);
                luaTable.j2(luaString, luaValueI2);
            } else if (luaValueV.f1()) {
                LuaTable luaTable2 = new LuaTable();
                luaTable.j2(DebugLib.p0, luaTable2);
                for (int i4 : luaValueV.w0().R.f1726d) {
                    luaTable2.d2(LuaValue.I2(i4), LuaValue.f1674d);
                }
            }
        }
        return luaTable;
    }
}
