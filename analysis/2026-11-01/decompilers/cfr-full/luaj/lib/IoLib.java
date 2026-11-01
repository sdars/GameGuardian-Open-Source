/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import luaj.Globals;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.LibFunction;
import luaj.lib.TwoArgFunction;
import luaj.lib.VarArgFunction;
import luaj.lib.d;

public abstract class IoLib
extends TwoArgFunction {
    private static final LuaValue Z = LuaValue.K2("stdout");
    private static final LuaValue a0 = LuaValue.K2("stderr");
    private static final LuaValue b0 = LuaValue.K2("file");
    private static final LuaValue c0 = LuaValue.K2("closed file");
    public static final String[] d0 = new String[]{"close", "flush", "input", "lines", "open", "output", "popen", "read", "tmpfile", "type", "write"};
    public static final String[] e0 = new String[]{"close", "flush", "lines", "read", "seek", "setvbuf", "write"};
    private boolean T = false;
    private File U = null;
    private File V = null;
    private File W = null;
    LuaTable X;
    public Globals Y;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static LuaValue A3(File var0, boolean var1_2, boolean var2_3) {
        block10: {
            block6: {
                block7: {
                    block9: {
                        block8: {
                            var5_4 = new ByteArrayOutputStream();
                            if (!var1_2) ** GOTO lbl-1000
                            ** try [egrp 0[TRYBLOCK] [0 : 13->106)] { 
lbl4:
                            // 1 sources

                            ** GOTO lbl11
lbl-1000:
                            // 1 sources

                            {
                                while (true) {
                                    var3_5 = var4_7 = var0.Y2();
                                    if (var4_7 >= 0) {
                                        var5_4.write(var4_7);
                                        continue;
                                    }
                                    break block6;
                                    break;
                                }
lbl11:
                                // 3 sources

                                while (true) {
                                    var3_5 = var4_6 = var0.Y2();
                                    if (var4_6 < 0) break block6;
                                    if (var4_6 == 10) break block7;
                                    if (var4_6 == 13) break block8;
                                    break block9;
                                    break;
                                }
                            }
lbl17:
                            // 1 sources

                            catch (EOFException var0_1) {
                                break block10;
                            }
                        }
                        if (!var2_3) ** GOTO lbl11
                    }
                    var5_4.write(var4_6);
                    ** while (true)
                }
                var3_5 = var4_6;
                if (var2_3) {
                    var5_4.write(var4_6);
                    var3_5 = var4_6;
                }
            }
            if (var3_5 >= 0) return LuaString.o3(var5_4.toByteArray());
        }
        if (var5_4.size() != 0) return LuaString.o3(var5_4.toByteArray());
        return LuaValue.c;
    }

    private File B3(boolean bl) {
        File file = this.U;
        if (file == null) {
            LuaValue.R0("stdin not supported");
        }
        if (bl && file.V2()) {
            LuaValue.R0("standard input file is closed");
        }
        return file;
    }

    private static Varargs C3(File file) {
        if (file.W2()) {
            return IoLib.t3("cannot close standard file", 1000);
        }
        file.S2();
        return IoLib.M3();
    }

    private File D3(int n3, String object, String string2) {
        try {
            object = this.K3(n3, (String)object, string2);
            return object;
        }
        catch (Exception exception) {
            object = new StringBuilder();
            ((StringBuilder)object).append("io error: ");
            ((StringBuilder)object).append(exception.getMessage());
            LuaValue.S0(((StringBuilder)object).toString(), exception);
            return null;
        }
    }

    private Varargs E3(File object, Varargs varargs) {
        int n3;
        int n4 = varargs.U();
        if (n4 == 0) {
            return IoLib.y3((File)object, false);
        }
        LuaValue[] luaValueArray = new LuaValue[n4];
        int n5 = 0;
        while (true) {
            LuaValue luaValue;
            block9: {
                block4: {
                    block5: {
                        block6: {
                            block7: {
                                block8: {
                                    int n6;
                                    n3 = n5;
                                    if (n5 >= n4) break;
                                    n3 = n5 + 1;
                                    luaValue = varargs.v(n3);
                                    int n7 = luaValue.C2();
                                    if (n7 == 3) break block4;
                                    if (n7 != 4) break block5;
                                    LuaString luaString = luaValue.G0();
                                    int n8 = luaString.R;
                                    if (n8 < 1) break block5;
                                    byte[] byArray = luaString.P;
                                    int n9 = luaString.Q;
                                    n7 = n6 = byArray[n9];
                                    if (n6 == 42) {
                                        n7 = n6;
                                        if (n8 >= 2) {
                                            n7 = byArray[n9 + 1];
                                        }
                                    }
                                    if (n7 == 76) break block6;
                                    if (n7 == 97) break block7;
                                    if (n7 == 108) break block8;
                                    if (n7 != 110) break block5;
                                    luaValue = IoLib.z3((File)object);
                                    break block9;
                                }
                                luaValue = IoLib.y3((File)object, false);
                                break block9;
                            }
                            luaValue = IoLib.v3((File)object);
                            break block9;
                        }
                        luaValue = IoLib.y3((File)object, true);
                        break block9;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("invalid format: '");
                    ((StringBuilder)object).append(luaValue);
                    ((StringBuilder)object).append("'");
                    return LuaValue.l0(n3, "read", ((StringBuilder)object).toString());
                }
                luaValue = IoLib.w3((File)object, luaValue.y2());
            }
            luaValueArray[n5] = luaValue;
            if (luaValue.l1()) break;
            n5 = n3;
        }
        object = n3 == 0 ? LuaValue.c : LuaValue.P2(luaValueArray, 0, n3);
        return object;
    }

    private static Varargs F3(File file, Varargs varargs) {
        int n3 = varargs.U();
        for (int i3 = 1; i3 <= n3; ++i3) {
            file.d3(varargs.H(i3));
        }
        return file;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Varargs G3(File object, boolean bl, Varargs varargs) {
        int n3 = varargs.U();
        if (n3 > 250) {
            if (bl) {
                try {
                    ((File)object).S2();
                }
                catch (IOException iOException) {}
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("too many arguments: ");
            stringBuilder.append(n3);
            stringBuilder.append(" max = ");
            stringBuilder.append(250);
            LuaValue.R0(stringBuilder.toString());
        }
        try {
            return new IoLibV((File)object, "lnext", 18, this, bl, varargs);
        }
        catch (Exception exception) {
            object = new StringBuilder();
            ((StringBuilder)object).append("lines: ");
            ((StringBuilder)object).append(exception);
            return LuaValue.S0(((StringBuilder)object).toString(), exception);
        }
    }

    private static File I3(LuaValue luaValue) {
        luaValue = luaValue instanceof File ? (File)luaValue : null;
        return luaValue;
    }

    private File J3(boolean bl) {
        File file;
        File file2 = file = this.V;
        if (file == null) {
            this.V = file2 = this.D3(1, "-", "w");
        }
        if (bl && file2.V2()) {
            LuaValue.R0("standard output file is closed");
        }
        return file2;
    }

    private File K3(int n3, String string2, String string3) {
        int n4;
        int n5 = string3.length();
        int n6 = 0;
        for (n4 = 0; n4 < n5; ++n4) {
            char c4 = string3.charAt(n4);
            if (n4 == 0 && "rwa".indexOf(c4) >= 0 || n4 == 1 && c4 == '+' || n4 >= 1 && c4 == 'b') continue;
            n5 = -1;
        }
        if (n5 <= 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid mode: '");
            stringBuilder.append(string3);
            stringBuilder.append("'");
            LuaValue.l0(2, "io.open", stringBuilder.toString());
        }
        if (n3 != 1) {
            if (n3 != 2) {
                n4 = string3.charAt(0);
                n3 = n6;
                if (string3.indexOf(43) > 0) {
                    n3 = 43;
                }
                return this.H3(string2, (char)(n4 + n3));
            }
            return this.P3();
        }
        return this.Q3();
    }

    private void L3(LuaTable luaTable) {
        LuaValue[] luaValueArray = luaTable.t3();
        int n3 = luaValueArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            ((IoLibV)luaTable.U0((LuaValue)luaValueArray[i3])).U = this;
        }
    }

    private static Varargs M3() {
        return LuaValue.d;
    }

    private File N3() {
        java.io.File file = java.io.File.createTempFile(".gg.", ".tmp");
        this.T = true;
        FileImpl fileImpl = new FileImpl(this, file, '¢', null);
        file.delete();
        return fileImpl;
        finally {
            this.T = false;
        }
    }

    private File P3() {
        return new StdoutFile(this, 2);
    }

    private File Q3() {
        return new StdoutFile(this, 1);
    }

    private static File q3(String string2, LuaValue luaValue) {
        File file = IoLib.I3(luaValue);
        if (file == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FILE* expected, got ");
            stringBuilder.append(luaValue.E2());
            LuaValue.l0(1, string2, stringBuilder.toString());
        }
        IoLib.r3(file);
        return file;
    }

    private static File r3(File file) {
        if (file.V2()) {
            LuaValue.R0("attempt to use a closed file");
        }
        return file;
    }

    static Varargs s3(IOException object, int n3) {
        String string2 = ((Throwable)object).getMessage();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("io error: ");
        object = string2 != null ? string2 : object.toString();
        stringBuilder.append((String)object);
        return IoLib.t3(stringBuilder.toString(), n3);
    }

    private static Varargs t3(String string2, int n3) {
        return LuaValue.M2(LuaValue.c, LuaValue.K2(string2), LuaValue.I2(n3));
    }

    private File u3() {
        File file = this.W;
        if (file == null) {
            this.W = file = this.D3(2, "-", "w");
        }
        return file;
    }

    public static LuaValue v3(File luaValue) {
        int n3 = luaValue.a3();
        if (n3 >= 0) {
            luaValue = n3 == 0 ? LuaValue.L : IoLib.w3(luaValue, n3);
            return luaValue;
        }
        return IoLib.A3(luaValue, false, false);
    }

    public static LuaValue w3(File luaValue, int n3) {
        if (n3 == 0) {
            luaValue = luaValue.T2() ? LuaValue.c : LuaValue.L;
            return luaValue;
        }
        byte[] byArray = new byte[n3];
        if ((n3 = luaValue.Z2(byArray, 0, n3)) < 0) {
            return LuaValue.c;
        }
        return LuaString.p3(byArray, 0, n3);
    }

    private static int x3(File file, String string2, ByteArrayOutputStream byteArrayOutputStream, int n3) {
        int n4;
        int n5 = 0;
        while (true) {
            int n6;
            if (string2.indexOf(n6 = file.X2()) < 0) {
                return n5;
            }
            file.Y2();
            n4 = n5 + 1;
            if (byteArrayOutputStream != null) {
                if (byteArrayOutputStream.size() >= 200) {
                    byteArrayOutputStream.reset();
                    return 0;
                }
                byteArrayOutputStream.write(n6);
            }
            n5 = n4;
            if (n3 <= 0) continue;
            n5 = n4;
            if (n4 >= n3) break;
        }
        return n4;
    }

    public static LuaValue y3(File file, boolean bl) {
        return IoLib.A3(file, true, bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static LuaValue z3(File object) {
        int n3;
        int n4;
        int n5;
        ByteArrayOutputStream byteArrayOutputStream;
        block4: {
            block5: {
                block2: {
                    block3: {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        IoLib.x3((File)object, " \t\r\n", null, 0);
                        IoLib.x3((File)object, "-+", byteArrayOutputStream, 1);
                        if (IoLib.x3((File)object, "0", byteArrayOutputStream, 1) <= 0) break block2;
                        if (IoLib.x3((File)object, "xX", byteArrayOutputStream, 1) <= 0) break block3;
                        n5 = 0;
                        n4 = 1;
                        break block4;
                    }
                    n4 = 1;
                    break block5;
                }
                n4 = 0;
            }
            n3 = 0;
            n5 = n4;
            n4 = n3;
        }
        String string2 = "0123456789abcdefABCDEF";
        String string3 = n4 != 0 ? "0123456789abcdefABCDEF" : "0123456789";
        n5 = n3 = n5 + IoLib.x3((File)object, string3, byteArrayOutputStream, 0);
        if (IoLib.x3((File)object, ".", byteArrayOutputStream, 1) > 0) {
            string3 = n4 != 0 ? string2 : "0123456789";
            n5 = n3 + IoLib.x3((File)object, string3, byteArrayOutputStream, 0);
        }
        if (n5 > 0 && IoLib.x3((File)object, string3 = n4 != 0 ? "pP" : "eE", byteArrayOutputStream, 1) > 0) {
            IoLib.x3((File)object, "-+", byteArrayOutputStream, 1);
            IoLib.x3((File)object, "0123456789", byteArrayOutputStream, 0);
        }
        if (((String)(object = byteArrayOutputStream.toString())).length() <= 0) return LuaValue.c;
        return LuaValue.P1((String)object, LuaValue.c);
    }

    protected File H3(String string2, char c4) {
        return new FileImpl(this, this.Y.R3(string2), c4, null);
    }

    protected boolean O3(java.io.File file, FileDescriptor fileDescriptor, boolean bl) {
        if (this.T) {
            return true;
        }
        return luaj.lib.d.b(fileDescriptor, this.Y.Z, bl);
    }

    public Varargs X2(LuaValue luaValue) {
        return IoLib.C3(IoLib.q3("file:close", luaValue));
    }

    public Varargs Y2(LuaValue luaValue) {
        IoLib.q3("file:flush", luaValue).U2();
        return LuaValue.d;
    }

    public Varargs Z2(Varargs varargs) {
        return this.G3(IoLib.q3("file:lines", varargs.w()), false, varargs.e0(2));
    }

    public Varargs a3(LuaValue luaValue, Varargs varargs) {
        return this.E3(IoLib.q3("file:read", luaValue), varargs);
    }

    public Varargs b3(LuaValue luaValue, String string2, int n3) {
        if (!("set".equals(string2) || "end".equals(string2) || "cur".equals(string2))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid value: '");
            stringBuilder.append(string2);
            stringBuilder.append("'; must be one of 'set', 'cur' or 'end'");
            LuaValue.l0(1, "file:seek", stringBuilder.toString());
        }
        return LuaValue.I2(IoLib.q3("file:seek", luaValue).b3(string2, n3));
    }

    public Varargs c3(LuaValue luaValue, String string2, int n3) {
        StringBuilder stringBuilder;
        if ("no".equals(string2)) {
            n3 = 1;
        } else if (!"full".equals(string2) && !"line".equals(string2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("invalid value: '");
            stringBuilder.append(string2);
            stringBuilder.append("'; must be one of 'no', 'full' or 'line'");
            LuaValue.l0(1, "file:setvbuf", stringBuilder.toString());
        }
        if (n3 <= 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("invalid value '");
            stringBuilder.append(n3);
            stringBuilder.append("'; must be positive");
            LuaValue.l0(2, "file:setvbuf", stringBuilder.toString());
        }
        IoLib.q3("file:setvbuf", luaValue).c3(string2, n3);
        return LuaValue.d;
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        LuaTable luaTable;
        this.Y = luaValue2.z0();
        luaValue = new LuaTable();
        this.V2(luaValue, new LibFunction.a(this){
            final IoLib a;
            {
                this.a = ioLib;
            }

            @Override
            public LibFunction a() {
                return new IoLibV();
            }
        }, d0);
        this.X = luaTable = new LuaTable();
        this.W2(luaTable, new LibFunction.a(this){
            final IoLib a;
            {
                this.a = ioLib;
            }

            @Override
            public LibFunction a() {
                return new IoLibV();
            }
        }, e0, 11);
        this.L3((LuaTable)luaValue);
        this.L3(this.X);
        this.X.h2("__name", "FILE*");
        luaTable = this.X;
        luaTable.i2("__index", luaTable);
        ((LuaTable)luaValue).j2(Z, this.J3(false));
        ((LuaTable)luaValue).j2(a0, this.u3());
        luaValue2.i2("io", luaValue);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("io", luaValue);
        }
        return luaValue;
    }

    public Varargs d3(LuaValue luaValue, Varargs varargs) {
        return IoLib.F3(IoLib.q3("file:write", luaValue), varargs);
    }

    public Varargs e3(LuaValue luaValue) {
        luaValue = luaValue.l1() ? this.J3(false) : IoLib.q3("io.close", luaValue);
        IoLib.r3((File)luaValue);
        return IoLib.C3((File)luaValue);
    }

    public Varargs f3() {
        this.J3(true);
        this.V.U2();
        return LuaValue.d;
    }

    public Varargs g3(LuaValue luaValue) {
        luaValue = luaValue.l1() ? this.B3(false) : (luaValue.n1() ? this.D3(3, luaValue.B0(), "r") : IoLib.q3("io.input", luaValue));
        this.U = luaValue;
        return luaValue;
    }

    public Varargs h3(Varargs varargs) {
        boolean bl = true;
        String string2 = varargs.Z(1, null);
        File file = string2 == null ? this.B3(false) : this.D3(3, string2, "r");
        IoLib.r3(file);
        if (string2 == null) {
            bl = false;
        }
        return this.G3(file, bl, varargs.e0(2));
    }

    public Varargs i3(String string2, String string3) {
        return this.K3(3, string2, string3);
    }

    public Varargs j3(LuaValue luaValue) {
        luaValue = luaValue.l1() ? this.J3(false) : (luaValue.n1() ? this.D3(3, luaValue.B0(), "w") : IoLib.q3("io.output", luaValue));
        this.V = luaValue;
        return luaValue;
    }

    public Varargs k3(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed io.popen('");
        stringBuilder.append(string2);
        stringBuilder.append("', '");
        stringBuilder.append(string3);
        stringBuilder.append("'): disabled by security reason");
        throw new luaj.d(stringBuilder.toString());
    }

    public Varargs l3(Varargs varargs) {
        this.B3(true);
        return this.E3(this.U, varargs);
    }

    public Varargs m3() {
        return this.N3();
    }

    public Varargs n3(LuaValue luaValue) {
        luaValue = (luaValue = IoLib.I3(luaValue)) != null ? (((File)luaValue).V2() ? c0 : b0) : LuaValue.c;
        return luaValue;
    }

    public Varargs o3(Varargs varargs) {
        this.J3(true);
        return IoLib.F3(this.V, varargs);
    }

    public Varargs p3(LuaValue varargs, boolean bl, Varargs varargs2) {
        File file = IoLib.I3((LuaValue)varargs);
        if (file == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("not a file: ");
            stringBuilder.append(varargs);
            LuaValue.l0(1, "lines", stringBuilder.toString());
        }
        if (file.V2()) {
            LuaValue.R0("file is already closed");
        }
        varargs = this.E3(file, varargs2);
        if (bl && varargs.Q(1) && file.T2()) {
            file.S2();
        }
        return varargs;
    }

    protected abstract class File
    extends LuaValue {
        final IoLib P;

        protected File(IoLib ioLib) {
            this.P = ioLib;
        }

        @Override
        public int C2() {
            return 7;
        }

        @Override
        public String D2() {
            return "userdata";
        }

        public abstract void S2();

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean T2() {
            boolean bl = true;
            try {
                int n3 = this.X2();
                if (n3 >= 0) return false;
                return bl;
            }
            catch (EOFException eOFException) {
                return bl;
            }
        }

        @Override
        public LuaValue U0(LuaValue luaValue) {
            return this.P.X.U0(luaValue);
        }

        public abstract void U2();

        @Override
        public LuaValue V0() {
            return this.P.X;
        }

        public abstract boolean V2();

        public abstract boolean W2();

        public abstract int X2();

        public abstract int Y2();

        public abstract int Z2(byte[] var1, int var2, int var3);

        public abstract int a3();

        public abstract int b3(String var1, int var2);

        public abstract void c3(String var1, int var2);

        public abstract void d3(LuaString var1);

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void finalize() {
            if (this.V2()) return;
            try {
                this.S2();
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }
    }

    /*
     * Exception performing whole class analysis.
     */
    private final class FileImpl
    extends File {
        private final RandomAccessFile Q;
        private final char R;
        private boolean S;
        private byte[] T;
        private int U;
        private boolean V;
        final IoLib W;

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private FileImpl(IoLib var1_1, java.io.File var2_3, char var3_6) {
            block11: {
                block10: {
                    block9: {
                        this.W = var1_1;
                        super(var1_1);
                        this.S = false;
                        this.T = null;
                        var4_7 = this.h3(var2_3, var3_6);
                        try {
                            var1_1.Y.L3(var2_3.getAbsolutePath());
                            if (var3_6 == 'a' || var3_6 == '') break block9;
                            if (var3_6 != 'w' && var3_6 != '¢') break block10;
                        }
                        catch (RuntimeException var1_2) {
                            try {}
                            catch (IOException var2_5) {
                                throw var1_2;
                            }
                            var4_7.close();
                            throw var1_2;
                        }
                        try {
                            var4_7.setLength(0L);
                            break block10;
                        }
                        catch (IOException var2_4) {
                            break block11;
                        }
                    }
                    var4_7.seek(var4_7.length());
                }
                this.Q = var4_7;
                this.R = var3_6;
                return;
            }
            var4_7.close();
lbl31:
            // 2 sources

            while (true) {
                var1_1.Y.S3();
                break;
            }
            {
                catch (IOException var4_8) {
                    ** continue;
                }
            }
            {
                throw var2_4;
            }
        }

        /* synthetic */ FileImpl(IoLib ioLib, java.io.File file, char c4, a a4) {
            this(ioLib, file, c4);
        }

        private void e3() {
            if (this.T == null) {
                return;
            }
            this.U2();
            this.T = null;
        }

        private void f3(boolean bl) {
            block9: {
                block8: {
                    block6: {
                        block7: {
                            char c4 = this.R;
                            if (c4 == 'a') break block6;
                            if (c4 == 'r') break block7;
                            if (c4 == 'w') break block6;
                            break block8;
                        }
                        if (bl) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("invalid mode for write data: '");
                            stringBuilder.append(this.R);
                            stringBuilder.append("'");
                            throw new IOException(stringBuilder.toString());
                        }
                        break block8;
                    }
                    if (!bl) break block9;
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid mode for read data: '");
            stringBuilder.append(this.R);
            stringBuilder.append("'");
            throw new IOException(stringBuilder.toString());
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private void g3(RandomAccessFile randomAccessFile) {
            try {
                randomAccessFile.close();
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private RandomAccessFile h3(java.io.File file, char c4) {
            Object object;
            if (c4 == 'r') {
                Object object2 = new RandomAccessFile(file, "r");
                if (this.W.O3(file, ((RandomAccessFile)object2).getFD(), true)) {
                    return object2;
                }
                this.g3((RandomAccessFile)object2);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("open denied: ");
                ((StringBuilder)object2).append(file);
                throw new c(((StringBuilder)object2).toString());
            }
            if (file.exists()) {
                try {
                    object = new RandomAccessFile(file, "r");
                    if (!this.W.O3(file, ((RandomAccessFile)object).getFD(), false)) {
                        this.g3((RandomAccessFile)object);
                        object = new StringBuilder();
                        ((StringBuilder)object).append("open denied: ");
                        ((StringBuilder)object).append(file);
                        c c5 = new c(((StringBuilder)object).toString());
                        throw c5;
                    }
                    this.g3((RandomAccessFile)object);
                }
                catch (FileNotFoundException fileNotFoundException) {}
            }
            if (this.W.O3(file, ((RandomAccessFile)(object = new RandomAccessFile(file, "rw"))).getFD(), false)) {
                return object;
            }
            this.g3((RandomAccessFile)object);
            object = new StringBuilder();
            ((StringBuilder)object).append("open denied: ");
            ((StringBuilder)object).append(file);
            throw new c(((StringBuilder)object).toString());
        }

        private void i3(byte[] byArray, int n3, int n4) {
            RandomAccessFile randomAccessFile = this.Q;
            if (this.R == '') {
                long l3 = randomAccessFile.getFilePointer();
                randomAccessFile.seek(randomAccessFile.length());
                randomAccessFile.write(byArray, n3, n4);
                randomAccessFile.seek(l3);
            } else {
                randomAccessFile.write(byArray, n3, n4);
            }
        }

        private void j3(byte[] byArray, int n3, int n4) {
            block17: {
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                byte[] byArray2;
                block15: {
                    block18: {
                        block16: {
                            byArray2 = this.T;
                            if (byArray2 != null) break block16;
                            this.i3(byArray, n3, n4);
                            break block17;
                        }
                        if (n4 == 0) break block17;
                        n11 = byArray2.length;
                        n10 = this.U;
                        boolean bl = this.V;
                        n9 = 0;
                        if (bl) {
                            n8 = n3 + n4 - 1;
                            while (true) {
                                n7 = n10;
                                n6 = n3;
                                n5 = n4;
                                if (n8 < n3) break block15;
                                if (byArray[n8] == 10) {
                                    n7 = n10;
                                    if (n10 > 0) {
                                        this.i3(byArray2, 0, n10);
                                        this.U = 0;
                                        n7 = 0;
                                    }
                                    n5 = n8 - n3 + 1;
                                    this.i3(byArray, n3, n5);
                                    n6 = n3 + n5;
                                    n5 = n4 - n5;
                                    break block15;
                                }
                                --n8;
                            }
                        }
                        if (n10 > 0) break block18;
                        n7 = n10;
                        n6 = n3;
                        n5 = n4;
                        if (n4 > n11) break block15;
                    }
                    n7 = n5 = n11 - n10;
                    if (n5 > n4) {
                        n7 = n4;
                    }
                    System.arraycopy(byArray, n3, byArray2, n10, n7);
                    n6 = n3 + n7;
                    n3 = n4 - n7;
                    n7 = n4 = n10 + n7;
                    if (n4 == n11) {
                        this.i3(byArray2, 0, n4);
                        n7 = 0;
                    }
                    this.U = n7;
                    n5 = n3;
                    if (n3 == 0) {
                        return;
                    }
                }
                n8 = n7 + n5;
                n10 = n7;
                n4 = n6;
                n3 = n5;
                if (n8 >= n11) {
                    n4 = n8 / n11 * n11;
                    if (n7 > 0) {
                        this.i3(byArray2, 0, n7);
                        n4 -= n7;
                        this.U = 0;
                        n3 = n9;
                    } else {
                        n3 = n7;
                    }
                    this.i3(byArray, n6, n4);
                    n7 = n6 + n4;
                    n4 = n5 - n4;
                    n10 = n3;
                    n3 = n4;
                    n4 = n7;
                }
                if (n3 > 0) {
                    System.arraycopy(byArray, n4, byArray2, n10, n3);
                    this.U = n10 + n3;
                }
            }
        }

        @Override
        public void S2() {
            this.U2();
            if (!this.S) {
                this.S = true;
                this.W.Y.S3();
            }
            this.Q.close();
        }

        @Override
        public void U2() {
            byte[] byArray = this.T;
            int n3 = this.U;
            if (byArray != null && n3 > 0) {
                this.i3(byArray, 0, n3);
                this.U = 0;
            }
        }

        @Override
        public boolean V2() {
            return this.S;
        }

        @Override
        public boolean W2() {
            return false;
        }

        @Override
        public int X2() {
            this.f3(false);
            RandomAccessFile randomAccessFile = this.Q;
            long l3 = randomAccessFile.getFilePointer();
            int n3 = randomAccessFile.read();
            randomAccessFile.seek(l3);
            return n3;
        }

        @Override
        public int Y2() {
            this.f3(false);
            return this.Q.read();
        }

        @Override
        public int Z2(byte[] byArray, int n3, int n4) {
            this.f3(false);
            return this.Q.read(byArray, n3, n4);
        }

        @Override
        public int a3() {
            this.f3(false);
            return (int)(this.Q.length() - this.Q.getFilePointer());
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public int b3(String string2, int n3) {
            RandomAccessFile randomAccessFile = this.Q;
            if ("set".equals(string2)) {
                randomAccessFile.seek(n3);
                return (int)randomAccessFile.getFilePointer();
            }
            long l3 = "end".equals(string2) ? randomAccessFile.length() : randomAccessFile.getFilePointer();
            randomAccessFile.seek(l3 + (long)n3);
            return (int)randomAccessFile.getFilePointer();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void c3(String object, int n3) {
            if ("no".equals(object)) {
                this.e3();
                return;
            }
            boolean bl = "line".equals(object);
            object = this.T;
            if (object != null && ((Object)object).length == n3) {
                if (this.V != bl) {
                    this.U2();
                }
            } else {
                try {
                    object = new byte[n3];
                    this.e3();
                    this.T = (byte[])object;
                    this.U = 0;
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Out of memory for create buffer ");
                    ((StringBuilder)object).append(n3);
                    ((StringBuilder)object).append(" bytes");
                    throw new IOException(((StringBuilder)object).toString(), outOfMemoryError);
                }
            }
            this.V = bl;
        }

        @Override
        public void d3(LuaString luaString) {
            this.f3(true);
            this.W.Y.M3(luaString.R);
            this.j3(luaString.P, luaString.Q, luaString.R);
        }

        @Override
        public String g0() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("file (");
            Object object = this.S ? "closed" : Integer.valueOf(this.hashCode());
            stringBuilder.append(object);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    static final class IoLibV
    extends VarArgFunction {
        private File T;
        public IoLib U;
        private boolean V;
        private Varargs W;

        public IoLibV() {
        }

        public IoLibV(File file, String string2, int n3, IoLib ioLib) {
            this.T = file;
            this.S = string2;
            this.R = n3;
            this.U = ioLib;
        }

        public IoLibV(File file, String string2, int n3, IoLib ioLib, boolean bl, Varargs varargs) {
            this(file, string2, n3, ioLib);
            this.V = bl;
            this.W = varargs.M();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs invoke(Varargs object) {
            IOException iOException2;
            block26: {
                luaj.c c42;
                block29: {
                    StringBuilder stringBuilder;
                    block30: {
                        block27: {
                            block28: {
                                int n3 = this.R;
                                switch (n3) {
                                    default: {
                                        return LuaValue.f;
                                    }
                                    case 18: {
                                        try {
                                            return this.U.p3(this.T, this.V, this.W);
                                        }
                                        catch (luaj.c c42) {
                                            break;
                                        }
                                        catch (IOException iOException2) {
                                            break block26;
                                        }
                                    }
                                    case 17: {
                                        return this.U.d3(((Varargs)object).w(), ((Varargs)object).e0(2));
                                    }
                                    case 16: {
                                        return this.U.c3(((Varargs)object).w(), ((Varargs)object).E(2), ((Varargs)object).Y(3, 8192));
                                    }
                                    case 15: {
                                        return this.U.b3(((Varargs)object).w(), ((Varargs)object).Z(2, "cur"), ((Varargs)object).Y(3, 0));
                                    }
                                    case 14: {
                                        return this.U.a3(((Varargs)object).w(), ((Varargs)object).e0(2));
                                    }
                                    case 13: {
                                        return this.U.Z2((Varargs)object);
                                    }
                                    case 12: {
                                        return this.U.Y2(((Varargs)object).w());
                                    }
                                    case 11: {
                                        return this.U.X2(((Varargs)object).w());
                                    }
                                    case 10: {
                                        return this.U.o3((Varargs)object);
                                    }
                                    case 9: {
                                        return this.U.n3(((Varargs)object).w());
                                    }
                                    case 8: {
                                        return this.U.m3();
                                    }
                                    case 7: {
                                        return this.U.l3((Varargs)object);
                                    }
                                    case 6: {
                                        return this.U.k3(((Varargs)object).E(1), ((Varargs)object).Z(2, "r"));
                                    }
                                    case 5: {
                                        return this.U.j3(((Varargs)object).w());
                                    }
                                    case 4: {
                                        return this.U.i3(((Varargs)object).E(1), ((Varargs)object).Z(2, "r"));
                                    }
                                    case 3: {
                                        return this.U.h3((Varargs)object);
                                    }
                                    case 2: {
                                        return this.U.g3(((Varargs)object).w());
                                    }
                                    case 1: {
                                        return this.U.f3();
                                    }
                                    case 0: {
                                        return this.U.e3(((Varargs)object).w());
                                    }
                                }
                                n3 = this.R;
                                object = d0;
                                if (n3 < ((Object)object).length) break block27;
                                if (n3 < ((Object)object).length + e0.length) break block28;
                                object = n3 == 18 ? "(io.lines iterator)" : c42.l;
                                break block29;
                            }
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("file:");
                            object = object[this.R - ((Object)object).length];
                            break block30;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("io.");
                        object = object[this.R];
                    }
                    stringBuilder.append((String)object);
                    object = stringBuilder.toString();
                }
                object = new luaj.c(c42.j, (String)object, c42.k);
                ((Throwable)object).initCause(c42);
                throw object;
            }
            if (this.R != 18) return IoLib.s3(iOException2, this.R);
            object = iOException2.getMessage();
            if (object == null) {
                object = ((Object)iOException2).toString();
            }
            LuaValue.S0((String)object, iOException2);
            return IoLib.s3(iOException2, this.R);
        }
    }

    private final class StdoutFile
    extends File {
        private final int Q;
        final IoLib R;

        private StdoutFile(IoLib ioLib, int n3) {
            this.R = ioLib;
            super(ioLib);
            this.Q = n3;
        }

        private final PrintStream e3() {
            PrintStream printStream = this.Q == 2 ? this.R.Y.d0 : this.R.Y.c0;
            return printStream;
        }

        @Override
        public void S2() {
        }

        @Override
        public void U2() {
            this.e3().flush();
        }

        @Override
        public boolean V2() {
            return false;
        }

        @Override
        public boolean W2() {
            return true;
        }

        @Override
        public int X2() {
            return 0;
        }

        @Override
        public int Y2() {
            return 0;
        }

        @Override
        public int Z2(byte[] byArray, int n3, int n4) {
            return 0;
        }

        @Override
        public int a3() {
            return 0;
        }

        @Override
        public int b3(String string2, int n3) {
            return 0;
        }

        @Override
        public void c3(String string2, int n3) {
        }

        @Override
        public void d3(LuaString luaString) {
            this.e3().write(luaString.P, luaString.Q, luaString.R);
        }

        @Override
        public String g0() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("file (");
            stringBuilder.append(this.hashCode());
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    public static final class c
    extends IOException {
        c(String string2) {
            super(string2);
        }
    }
}

