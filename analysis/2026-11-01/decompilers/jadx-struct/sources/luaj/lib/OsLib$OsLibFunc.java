package luaj.lib;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class OsLib$OsLibFunc extends VarArgFunction {
    final /* synthetic */ OsLib T;

    public OsLib$OsLibFunc(OsLib osLib, int i, String str) {
        this.T = osLib;
        this.R = i;
        this.S = str;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        try {
            switch (this.R) {
                case 0:
                    return LuaValue.J2(this.T.g3());
                case 1:
                    String strZ = varargs.Z(1, "%c");
                    long jI0 = varargs.R(2) ? varargs.i0(2) : this.T.u3(null);
                    if (jI0 == -1) {
                        jI0 = this.T.u3(null);
                    }
                    if (jI0 > 9223372036854775L || jI0 < -9223372036854775L) {
                        throw new luaj.d("time result cannot be represented in this installation");
                    }
                    Calendar calendar = Calendar.getInstance(strZ.startsWith("!") ? TimeZone.getTimeZone("UTC") : TimeZone.getDefault());
                    calendar.setTimeInMillis(jI0 * 1000);
                    if (strZ.startsWith("!")) {
                        strZ = strZ.substring(1);
                    }
                    if (!strZ.equals("*t")) {
                        return LuaValue.K2(this.T.h3(strZ, calendar));
                    }
                    LuaTable luaTableS2 = LuaValue.s2();
                    this.T.l3(luaTableS2, calendar);
                    return luaTableS2;
                case 2:
                    return LuaValue.J2(this.T.i3(varargs.B(1), varargs.B(2)));
                case 3:
                    return this.T.j3(varargs.Z(1, null));
                case 4:
                    this.T.k3(varargs.Y(1, 0));
                    return LuaValue.f1676f;
                case 5:
                    String strM3 = this.T.m3(varargs.E(1));
                    return strM3 != null ? LuaValue.K2(strM3) : LuaValue.f1673c;
                case 6:
                    this.T.r3(varargs.E(1));
                    return LuaValue.f1674d;
                case 7:
                    this.T.s3(varargs.E(1), varargs.E(2));
                    return LuaValue.f1674d;
                case 8:
                    String strT3 = this.T.t3(varargs.Z(1, null), varargs.Z(2, "all"));
                    return strT3 != null ? LuaValue.K2(strT3) : LuaValue.f1673c;
                case 9:
                    return LuaValue.I2(this.T.u3(varargs.c0(1, null)));
                case 10:
                    return LuaValue.K2(this.T.v3());
                default:
                    return LuaValue.f1676f;
            }
        } catch (IOException e2) {
            return LuaValue.M2(LuaValue.f1673c, LuaValue.K2(e2.getMessage()), LuaValue.I2(this.R));
        }
    }
}
