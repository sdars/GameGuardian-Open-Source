/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import android.ext.Tools;
import android.ext.e1;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import luaj.Globals;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.d;
import luaj.lib.TwoArgFunction;
import luaj.lib.VarArgFunction;

public class OsLib
extends TwoArgFunction {
    private static final long U;
    private static long V;
    private Globals T;

    static {
        long l3;
        U = l3 = System.currentTimeMillis();
        V = l3;
    }

    private LuaValue f3(LuaValue luaValue, boolean bl) {
        block7: {
            block6: {
                block5: {
                    if (!luaValue.l1()) break block5;
                    if (bl) {
                        throw new d("missing in date table");
                    }
                    break block6;
                }
                if (!luaValue.i1()) break block7;
            }
            return luaValue;
        }
        throw new d("is not an integer");
    }

    private double g3() {
        return (double)(System.currentTimeMillis() - U - (long)this.T.b0) / 1000.0;
    }

    private double i3(double d4, double d5) {
        return d4 - d5;
    }

    private Varargs j3(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed os.execute('");
        stringBuilder.append(string2);
        stringBuilder.append("'): disabled by security reason");
        throw new d(stringBuilder.toString());
    }

    private void k3(int n3) {
    }

    private String m3(String string2) {
        String string3 = null;
        CharSequence charSequence = null;
        CharSequence charSequence2 = string3;
        if (string2 != null) {
            if (string2.length() == 0) {
                charSequence2 = string3;
            } else {
                try {
                    charSequence2 = System.getenv(string2);
                }
                catch (Throwable throwable) {
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append("Failed getenv '");
                    ((StringBuilder)charSequence2).append(string2);
                    ((StringBuilder)charSequence2).append("'");
                    e1.g(((StringBuilder)charSequence2).toString(), throwable);
                    charSequence2 = charSequence;
                }
                if (charSequence2 != null) {
                    return charSequence2;
                }
                try {
                    charSequence2 = charSequence = System.getProperty(string2);
                }
                catch (Throwable throwable) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Failed getProperty '");
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append("'");
                    e1.g(((StringBuilder)charSequence).toString(), throwable);
                }
            }
        }
        return charSequence2;
    }

    private static LuaValue n3(byte[] byArray, int n3, int n4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid conversion specifier '");
        stringBuilder.append(LuaValue.L2(byArray, n3, n4 - n3));
        stringBuilder.append("' at offset ");
        stringBuilder.append(n3);
        return LuaValue.l0(1, "os.date", stringBuilder.toString());
    }

    private Calendar o3(Calendar calendar) {
        int n3 = calendar.get(6);
        int n4 = calendar.get(7);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setLenient(true);
        calendar2.set(1, calendar.get(1));
        calendar2.set(6, n3 - ((n4 + 5) % 7 + 1) + 4);
        return calendar2;
    }

    private int p3(Calendar calendar) {
        return (this.o3(calendar).get(6) - 1) / 7 + 1;
    }

    private int q3(Calendar calendar) {
        return this.o3(calendar).get(1);
    }

    private String t3(String string2, String string3) {
        return "C";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private long u3(LuaTable luaTable) {
        Comparable<Calendar> comparable = Calendar.getInstance();
        if (luaTable == null) {
            ((Calendar)comparable).add(14, -this.T.b0);
            return ((Calendar)comparable).getTimeInMillis() / 1000L;
        }
        String string2 = "year";
        try {
            ((Calendar)comparable).set(1, this.f3(luaTable.T0("year"), true).A0());
            string2 = "month";
            ((Calendar)comparable).set(2, this.f3(luaTable.T0("month"), true).A0() - 1);
            string2 = "day";
            ((Calendar)comparable).set(5, this.f3(luaTable.T0("day"), true).A0());
            string2 = "hour";
            ((Calendar)comparable).set(11, this.f3(luaTable.T0("hour"), false).H1(12));
            string2 = "min";
            ((Calendar)comparable).set(12, this.f3(luaTable.T0("min"), false).H1(0));
            string2 = "sec";
            ((Calendar)comparable).set(13, this.f3(luaTable.T0("sec"), false).H1(0));
        }
        catch (d d4) {
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("field '");
            ((StringBuilder)comparable).append(string2);
            ((StringBuilder)comparable).append("' ");
            ((StringBuilder)comparable).append(d4.getMessage());
            throw new d(((StringBuilder)comparable).toString(), d4);
        }
        ((Calendar)comparable).set(14, 0);
        this.l3(luaTable, (Calendar)comparable);
        return ((Calendar)comparable).getTimeInMillis() / 1000L;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String v3() {
        Comparable<File> comparable;
        try {
            comparable = File.createTempFile(".gg.", ".tmp");
        }
        catch (IOException iOException) {
            long l3;
            synchronized (OsLib.class) {
                l3 = V;
                V = 1L + l3;
            }
            CharSequence charSequence = new StringBuilder();
            charSequence.append(".gg.");
            charSequence.append(l3);
            charSequence.append(".tmp");
            charSequence = charSequence.toString();
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append(Tools.b0());
            ((StringBuilder)comparable).append("/");
            ((StringBuilder)comparable).append((String)charSequence);
            return ((StringBuilder)comparable).toString();
        }
        try {
            ((File)comparable).deleteOnExit();
            ((File)comparable).delete();
            return ((File)comparable).getAbsolutePath();
        }
        catch (Throwable throwable) {
            return ((File)comparable).getAbsolutePath();
        }
    }

    private int w3(Calendar calendar, boolean bl) {
        int n3;
        int n4 = calendar.get(6);
        int n5 = n3 = calendar.get(7);
        if (bl) {
            n5 = (n3 + 5) % 7 + 1;
        }
        if (n4 <= n5) {
            return 0;
        }
        n3 = (n4 - n5) % 7;
        n5 = (int)Math.ceil((float)(n4 - n3) / 7.0f);
        if (n3 == 0) {
            --n5;
        }
        return n5;
    }

    @Override
    public LuaValue call(LuaValue object, LuaValue luaValue) {
        this.T = luaValue.z0();
        LuaTable luaTable = new LuaTable();
        for (int i3 = 0; i3 < 11; ++i3) {
            if (!this.T.X && (i3 == 3 || i3 == 4 || i3 == 6 || i3 == 7 || i3 == 10)) continue;
            object = (new String[]{"clock", "date", "difftime", "execute", "exit", "getenv", "remove", "rename", "setlocale", "time", "tmpname"})[i3];
            luaTable.i2((String)object, new OsLibFunc(this, i3, (String)object));
        }
        luaValue.i2("os", luaTable);
        if (!luaValue.T0("package").l1()) {
            luaValue.T0("package").T0("loaded").i2("os", luaTable);
        }
        return luaTable;
    }

    /*
     * Exception decompiling
     */
    public String h3(String var1_1, Calendar var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    protected void r3(String string2) {
        Comparable<File> comparable = this.T.R3(string2);
        if (((File)comparable).exists()) {
            if (((File)comparable).delete()) {
                return;
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("Failed to delete: '");
            ((StringBuilder)comparable).append(string2);
            ((StringBuilder)comparable).append("'");
            throw new IOException(((StringBuilder)comparable).toString());
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("No such file or directory: '");
        ((StringBuilder)comparable).append(string2);
        ((StringBuilder)comparable).append("'");
        throw new IOException(((StringBuilder)comparable).toString());
    }

    protected void s3(String string2, String charSequence) {
        Comparable<File> comparable = this.T.R3(string2);
        if (((File)comparable).exists()) {
            if (((File)comparable).renameTo(this.T.R3((String)charSequence))) {
                return;
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("Failed to rename '");
            ((StringBuilder)comparable).append(string2);
            ((StringBuilder)comparable).append("' to '");
            ((StringBuilder)comparable).append((String)charSequence);
            ((StringBuilder)comparable).append("'");
            throw new IOException(((StringBuilder)comparable).toString());
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("No such file or directory: '");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("'");
        throw new IOException(((StringBuilder)charSequence).toString());
    }

    class OsLibFunc
    extends VarArgFunction {
        final OsLib T;

        public OsLibFunc(OsLib osLib, int n3, String string2) {
            this.T = osLib;
            this.R = n3;
            this.S = string2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs invoke(Varargs object) {
            try {
                switch (this.R) {
                    default: {
                        return LuaValue.f;
                    }
                    case 10: {
                        return LuaValue.K2(this.T.v3());
                    }
                    case 9: {
                        return LuaValue.I2(this.T.u3(((Varargs)object).c0(1, null)));
                    }
                    case 8: {
                        object = this.T.t3(((Varargs)object).Z(1, null), ((Varargs)object).Z(2, "all"));
                        if (object == null) return LuaValue.c;
                        return LuaValue.K2((String)object);
                    }
                    case 7: {
                        this.T.s3(((Varargs)object).E(1), ((Varargs)object).E(2));
                        return LuaValue.d;
                    }
                    case 6: {
                        this.T.r3(((Varargs)object).E(1));
                        return LuaValue.d;
                    }
                    case 5: {
                        object = this.T.m3(((Varargs)object).E(1));
                        if (object == null) return LuaValue.c;
                        return LuaValue.K2((String)object);
                    }
                    case 4: {
                        this.T.k3(((Varargs)object).Y(1, 0));
                        return LuaValue.f;
                    }
                    case 3: {
                        return this.T.j3(((Varargs)object).Z(1, null));
                    }
                    case 2: {
                        return LuaValue.J2(this.T.i3(((Varargs)object).B(1), ((Varargs)object).B(2)));
                    }
                    case 1: {
                        String string2 = ((Varargs)object).Z(1, "%c");
                        long l3 = ((Varargs)object).R(2) ? ((Varargs)object).i0(2) : this.T.u3(null);
                        long l4 = l3;
                        if (l3 == -1L) {
                            l4 = this.T.u3(null);
                        }
                        if (l4 <= 9223372036854775L && l4 >= -9223372036854775L) {
                            object = string2.startsWith("!") ? TimeZone.getTimeZone("UTC") : TimeZone.getDefault();
                            Calendar calendar = Calendar.getInstance((TimeZone)object);
                            calendar.setTimeInMillis(l4 * 1000L);
                            object = string2;
                            if (string2.startsWith("!")) {
                                object = string2.substring(1);
                            }
                            if (!((String)object).equals("*t")) return LuaValue.K2(this.T.h3((String)object, calendar));
                            object = LuaValue.s2();
                            this.T.l3((LuaTable)object, calendar);
                            return object;
                        }
                        object = new d("time result cannot be represented in this installation");
                        throw object;
                    }
                    case 0: 
                }
                return LuaValue.J2(this.T.g3());
            }
            catch (IOException iOException) {
                return LuaValue.M2(LuaValue.c, LuaValue.K2(iOException.getMessage()), LuaValue.I2(this.R));
            }
        }
    }
}

