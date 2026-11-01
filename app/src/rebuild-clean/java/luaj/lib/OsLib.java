package luaj.lib;

import android.ext.Tools;
import android.ext.e1;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import luaj.Globals;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class OsLib extends TwoArgFunction {
    private static final long U;
    private static long V;
    private Globals T;

    class OsLibFunc extends VarArgFunction {
        public OsLibFunc(int i, String str) {
            this.R = i;
            this.S = str;
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            try {
                switch (this.R) {
                    case 0:
                        return LuaValue.J2(OsLib.this.g3());
                    case 1:
                        String strZ = varargs.Z(1, "%c");
                        long jI0 = varargs.R(2) ? varargs.i0(2) : OsLib.this.u3(null);
                        if (jI0 == -1) {
                            jI0 = OsLib.this.u3(null);
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
                            return LuaValue.K2(OsLib.this.h3(strZ, calendar));
                        }
                        LuaTable luaTableS2 = LuaValue.s2();
                        OsLib.this.l3(luaTableS2, calendar);
                        return luaTableS2;
                    case 2:
                        return LuaValue.J2(OsLib.this.i3(varargs.B(1), varargs.B(2)));
                    case 3:
                        return OsLib.this.j3(varargs.Z(1, null));
                    case 4:
                        OsLib.this.k3(varargs.Y(1, 0));
                        return LuaValue.f1676f;
                    case 5:
                        String strM3 = OsLib.this.m3(varargs.E(1));
                        return strM3 != null ? LuaValue.K2(strM3) : LuaValue.f1673c;
                    case 6:
                        OsLib.this.r3(varargs.E(1));
                        return LuaValue.f1674d;
                    case 7:
                        OsLib.this.s3(varargs.E(1), varargs.E(2));
                        return LuaValue.f1674d;
                    case 8:
                        String strT3 = OsLib.this.t3(varargs.Z(1, null), varargs.Z(2, "all"));
                        return strT3 != null ? LuaValue.K2(strT3) : LuaValue.f1673c;
                    case 9:
                        return LuaValue.I2(OsLib.this.u3(varargs.c0(1, null)));
                    case 10:
                        return LuaValue.K2(OsLib.this.v3());
                    default:
                        return LuaValue.f1676f;
                }
            } catch (IOException e2) {
                return LuaValue.M2(LuaValue.f1673c, LuaValue.K2(e2.getMessage()), LuaValue.I2(this.R));
            }
        }
    }

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        U = jCurrentTimeMillis;
        V = jCurrentTimeMillis;
    }

    private LuaValue f3(LuaValue luaValue, boolean z) {
        if (luaValue.l1()) {
            if (z) {
                throw new luaj.d("missing in date table");
            }
        } else if (!luaValue.i1()) {
            throw new luaj.d("is not an integer");
        }
        return luaValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g3() {
        return ((System.currentTimeMillis() - U) - ((long) this.T.b0)) / 1000.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double i3(double d2, double d3) {
        return d2 - d3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Varargs j3(String str) {
        throw new luaj.d("Failed os.execute('" + str + "'): disabled by security reason");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String m3(String str) {
        String str2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            str2 = System.getenv(str);
        } catch (Throwable th) {
            e1.g("Failed getenv '" + str + "'", th);
        }
        if (str2 != null) {
            return str2;
        }
        try {
            return System.getProperty(str);
        } catch (Throwable th2) {
            e1.g("Failed getProperty '" + str + "'", th2);
            return str2;
        }
    }

    private static LuaValue n3(byte[] bArr, int i, int i2) {
        return LuaValue.l0(1, "os.date", "invalid conversion specifier '" + LuaValue.L2(bArr, i, i2 - i) + "' at offset " + i);
    }

    private Calendar o3(Calendar calendar) {
        int i = calendar.get(6);
        int i2 = ((calendar.get(7) + 5) % 7) + 1;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setLenient(true);
        calendar2.set(1, calendar.get(1));
        calendar2.set(6, (i - i2) + 4);
        return calendar2;
    }

    private int p3(Calendar calendar) {
        return ((o3(calendar).get(6) - 1) / 7) + 1;
    }

    private int q3(Calendar calendar) {
        return o3(calendar).get(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String t3(String str, String str2) {
        return "C";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public long u3(LuaTable luaTable) {
        Calendar calendar = Calendar.getInstance();
        if (luaTable == null) {
            calendar.add(14, -this.T.b0);
        } else {
            String str = "year";
            try {
                calendar.set(1, f3(luaTable.T0("year"), true).A0());
                calendar.set(2, f3(luaTable.T0("month"), true).A0() - 1);
                calendar.set(5, f3(luaTable.T0("day"), true).A0());
                calendar.set(11, f3(luaTable.T0("hour"), false).H1(12));
                calendar.set(12, f3(luaTable.T0("min"), false).H1(0));
                str = "sec";
                calendar.set(13, f3(luaTable.T0("sec"), false).H1(0));
                calendar.set(14, 0);
                l3(luaTable, calendar);
            } catch (luaj.d e2) {
                throw new luaj.d("field '" + str + "' " + e2.getMessage(), e2);
            }
        }
        return calendar.getTimeInMillis() / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String v3() {
        try {
            File fileCreateTempFile = File.createTempFile(".gg.", ".tmp");
            try {
                fileCreateTempFile.deleteOnExit();
                fileCreateTempFile.delete();
            } catch (Throwable unused) {
            }
            return fileCreateTempFile.getAbsolutePath();
        } catch (IOException unused2) {
            synchronized (OsLib.class) {
                long j = V;
                V = 1 + j;
                return Tools.b0() + "/" + (".gg." + j + ".tmp");
            }
        }
    }

    private int w3(Calendar calendar, boolean z) {
        int i = calendar.get(6);
        int i2 = calendar.get(7);
        if (z) {
            i2 = ((i2 + 5) % 7) + 1;
        }
        if (i <= i2) {
            return 0;
        }
        int i3 = (i - i2) % 7;
        int iCeil = (int) Math.ceil((i - i3) / 7.0f);
        return i3 != 0 ? iCeil : iCeil - 1;
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        String[] strArr = {"clock", "date", "difftime", "execute", "exit", "getenv", "remove", "rename", "setlocale", "time", "tmpname"};
        this.T = luaValue2.z0();
        LuaTable luaTable = new LuaTable();
        for (int i = 0; i < 11; i++) {
            if (this.T.X || (i != 3 && i != 4 && i != 6 && i != 7 && i != 10)) {
                String str = strArr[i];
                luaTable.i2(str, new OsLibFunc(i, str));
            }
        }
        luaValue2.i2("os", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("os", luaTable);
        }
        return luaTable;
    }

    public String h3(String str, Calendar calendar) {
        String strSubstring;
        int iW3;
        int iQ3;
        int i;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        f.a aVar = new f.a(length);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            byte b2 = bytes[i2];
            if (b2 == 10) {
                aVar.b("\n");
            } else if (b2 != 37) {
                aVar.a(b2);
            } else {
                if (i3 >= length) {
                    n3(bytes, i2, i3);
                }
                int i4 = i2 + 2;
                byte b3 = bytes[i3];
                if (b3 == 69 || b3 == 79) {
                    if (i4 >= length) {
                        n3(bytes, i2, i4);
                    }
                    String str2 = b3 == 69 ? "cCxXyY" : "deHImMSuUVwwy";
                    int i5 = i2 + 3;
                    byte b4 = bytes[i4];
                    if (str2.indexOf((char) (b4 & 255)) == -1) {
                        n3(bytes, i2, i5);
                    }
                    b3 = b4;
                    i4 = i5;
                }
                if (b3 == 37) {
                    aVar.b("%");
                    b3 = 0;
                } else if (b3 != 77 && b3 != 112) {
                    if (b3 == 103) {
                        strSubstring = String.valueOf(q3(calendar) + 10000).substring(3);
                    } else if (b3 != 104) {
                        switch (b3) {
                            case 65:
                            case 66:
                            case 68:
                                break;
                            case 67:
                                iW3 = calendar.get(1) / 100;
                                iQ3 = iW3 + 100;
                                strSubstring = String.valueOf(iQ3).substring(1);
                                break;
                            default:
                                switch (b3) {
                                    case 70:
                                    case 72:
                                    case 73:
                                        break;
                                    case 71:
                                        iQ3 = q3(calendar) + 10000;
                                        strSubstring = String.valueOf(iQ3).substring(1);
                                        break;
                                    default:
                                        switch (b3) {
                                            case 82:
                                            case 83:
                                            case 84:
                                            case 89:
                                            case 90:
                                                break;
                                            case 85:
                                                iW3 = w3(calendar, false);
                                                iQ3 = iW3 + 100;
                                                strSubstring = String.valueOf(iQ3).substring(1);
                                                break;
                                            case 86:
                                                iW3 = p3(calendar);
                                                iQ3 = iW3 + 100;
                                                strSubstring = String.valueOf(iQ3).substring(1);
                                                break;
                                            case 87:
                                                iW3 = w3(calendar, true);
                                                iQ3 = iW3 + 100;
                                                strSubstring = String.valueOf(iQ3).substring(1);
                                                break;
                                            case 88:
                                                b3 = 84;
                                                break;
                                            default:
                                                switch (b3) {
                                                    case 97:
                                                    case 98:
                                                    case 100:
                                                        break;
                                                    case 99:
                                                        strSubstring = h3("%a %b %d %H:%M:%S %Y", calendar);
                                                        break;
                                                    case 101:
                                                        i = calendar.get(5);
                                                        if (i < 10) {
                                                            aVar.b(" ");
                                                        }
                                                        strSubstring = String.valueOf(i);
                                                        break;
                                                    default:
                                                        switch (b3) {
                                                            case 106:
                                                            case 107:
                                                            case 108:
                                                            case 109:
                                                                break;
                                                            case 110:
                                                                aVar.b("\n");
                                                                b3 = 0;
                                                                break;
                                                            default:
                                                                switch (b3) {
                                                                    case 114:
                                                                    case 115:
                                                                        break;
                                                                    case 116:
                                                                        strSubstring = "\t";
                                                                        break;
                                                                    case 117:
                                                                        i = ((calendar.get(7) + 5) % 7) + 1;
                                                                        strSubstring = String.valueOf(i);
                                                                        break;
                                                                    default:
                                                                        switch (b3) {
                                                                            case 119:
                                                                                i = (calendar.get(7) + 6) % 7;
                                                                                strSubstring = String.valueOf(i);
                                                                                break;
                                                                            case 120:
                                                                                b3 = 68;
                                                                                break;
                                                                            case 121:
                                                                            case 122:
                                                                                break;
                                                                            default:
                                                                                n3(bytes, i2, i4);
                                                                                aVar.b("%");
                                                                                b3 = 0;
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        b3 = 98;
                    }
                    aVar.b(strSubstring);
                    b3 = 0;
                }
                if (b3 != 0) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder();
                    sb.append("%");
                    sb.append(b3 != 112 ? 't' : 'T');
                    sb.append((char) (b3 & 255));
                    aVar.b(String.format(locale, sb.toString(), calendar));
                }
                i2 = i4;
            }
            i2 = i3;
        }
        return aVar.k();
    }

    void l3(LuaTable luaTable, Calendar calendar) {
        luaTable.i2("year", LuaValue.I2(calendar.get(1)));
        luaTable.i2("month", LuaValue.I2(calendar.get(2) + 1));
        luaTable.i2("day", LuaValue.I2(calendar.get(5)));
        luaTable.i2("hour", LuaValue.I2(calendar.get(11)));
        luaTable.i2("min", LuaValue.I2(calendar.get(12)));
        luaTable.i2("sec", LuaValue.I2(calendar.get(13)));
        luaTable.i2("wday", LuaValue.I2(calendar.get(7)));
        luaTable.i2("yday", LuaValue.I2(calendar.get(6)));
        luaTable.i2("isdst", LuaValue.H2(calendar.getTimeZone().inDaylightTime(calendar.getTime())));
    }

    protected void r3(String str) {
        File fileR3 = this.T.R3(str);
        if (!fileR3.exists()) {
            throw new IOException("No such file or directory: '" + str + "'");
        }
        if (fileR3.delete()) {
            return;
        }
        throw new IOException("Failed to delete: '" + str + "'");
    }

    protected void s3(String str, String str2) {
        File fileR3 = this.T.R3(str);
        if (!fileR3.exists()) {
            throw new IOException("No such file or directory: '" + str + "'");
        }
        if (fileR3.renameTo(this.T.R3(str2))) {
            return;
        }
        throw new IOException("Failed to rename '" + str + "' to '" + str2 + "'");
    }
}
