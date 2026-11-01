/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import android.ext.e1;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import luaj.Globals;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.LibFunction;
import luaj.lib.TableLibFunction;
import luaj.lib.TwoArgFunction;
import luaj.lib.VarArgFunction;
import luaj.lib.e;
import luaj.lib.f;

public class BaseLib
extends TwoArgFunction
implements f {
    Globals T;
    private c U = null;
    byte[] V = null;

    static LuaString d3(LuaValue luaValue) {
        Object object = luaValue.x1(LuaValue.B);
        if (!((LuaValue)object).l1()) {
            if (!((LuaValue)(object = (luaValue = ((LuaValue)object).call(luaValue)).B2())).l1()) {
                return ((LuaValue)object).G0();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("'__tostring' must return a string, got '");
            ((StringBuilder)object).append(luaValue.D2());
            ((StringBuilder)object).append("' ('");
            ((StringBuilder)object).append(luaValue);
            ((StringBuilder)object).append("')");
            throw new luaj.d(((StringBuilder)object).toString());
        }
        object = luaValue.B2();
        if (!((LuaValue)object).l1()) {
            return ((LuaValue)object).G0();
        }
        return LuaValue.K2(luaValue.g0());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    InputStream Y2(LuaString object, String string2, boolean bl, InputStream inputStream) {
        c c4 = this.U;
        if (c4 == null) {
            return inputStream;
        }
        if (bl) {
            Throwable throwable2;
            block9: {
                Object object2;
                block8: {
                    if (string2 == null) return inputStream;
                    try {
                        object2 = this.V;
                        object = object2;
                        if (object2 != null) break block8;
                        object = new byte[8192];
                        this.V = (byte[])object;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                object2 = Os.open((String)string2, (int)OsConstants.O_RDONLY, (int)438);
                int n3 = 0;
                while (true) {
                    int n4;
                    if ((n4 = Os.read((FileDescriptor)object2, (byte[])object, (int)0, (int)((Object)object).length)) <= 0) {
                        Os.close((FileDescriptor)object2);
                        if (n3 <= 0) return inputStream;
                        c4.d.writeInt(n3);
                        return inputStream;
                    }
                    c4.b.write((byte[])object, 0, n4);
                    n3 += n4;
                }
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed write log file from ");
            ((StringBuilder)object).append(string2);
            e1.g(((StringBuilder)object).toString(), throwable2);
            return inputStream;
        }
        if (object == null) return new InputStream(this, inputStream, c4){
            private int a;
            final InputStream b;
            final c c;
            final BaseLib d;
            {
                this.d = baseLib;
                this.b = inputStream;
                this.c = c4;
                this.a = 0;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public int read() {
                Throwable throwable2;
                int n3 = this.b.read();
                if (n3 != -1) {
                    try {
                        this.c.b.write(n3);
                        ++this.a;
                        return n3;
                    }
                    catch (Throwable throwable2) {}
                } else {
                    int n4 = this.a;
                    if (n4 <= 0) return n3;
                    this.c.d.writeInt(n4);
                    return n3;
                }
                e1.s("Failed write log file", throwable2);
                return n3;
            }
        };
        try {
            int n5 = ((LuaString)object).R;
            if (n5 <= 0) return inputStream;
            c4.b.write(((LuaString)object).P, ((LuaString)object).Q, n5);
            c4.d.writeInt(n5);
            return inputStream;
        }
        catch (Throwable throwable) {
            e1.s("Failed write log file", throwable);
        }
        return inputStream;
    }

    public void Z2() {
        c c4 = this.U;
        if (c4 != null) {
            c4.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Varargs a3(String object, String object2, LuaValue luaValue) {
        Throwable throwable3;
        InputStream inputStream;
        block15: {
            block14: {
                Throwable throwable22;
                block13: {
                    block12: {
                        inputStream = this.T.e0.u((String)object);
                        if (inputStream == null) {
                            luaValue = LuaValue.c;
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("cannot open ");
                            ((StringBuilder)object2).append((String)object);
                            ((StringBuilder)object2).append(": No such file or directory");
                            return LuaValue.N2(luaValue, LuaValue.K2(((StringBuilder)object2).toString()));
                        }
                        try {
                            String string2 = this.T.R3((String)object).getAbsolutePath();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append('@');
                            stringBuilder.append(string2);
                            object2 = this.b3(inputStream, stringBuilder.toString(), (String)object2, luaValue);
                            if (!(object2 instanceof LuaClosure)) break block12;
                            ((LuaClosure)object2).U = string2;
                        }
                        catch (Throwable throwable22) {
                            break block13;
                        }
                    }
                    if (this.U != null && object2 instanceof LuaFunction) {
                        this.Y2(null, (String)object, true, null);
                    }
                    try {
                        inputStream.close();
                        return object2;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    return object2;
                }
                try {
                    object = object2 = throwable22.getMessage();
                    if (object2 != null) break block14;
                    object = throwable22.getClass().getName();
                }
                catch (Throwable throwable3) {
                    break block15;
                }
            }
            object = LuaValue.N2(LuaValue.c, LuaValue.K2((String)object));
            try {
                inputStream.close();
                return object;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return object;
        }
        try {
            inputStream.close();
            throw throwable3;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        throw throwable3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Varargs b3(InputStream object, String string2, String object2, LuaValue luaValue) {
        if (object != null) return this.T.O3((InputStream)object, string2, (String)object2, luaValue);
        try {
            object2 = LuaValue.c;
            object = new StringBuilder();
            ((StringBuilder)object).append("not found: ");
            ((StringBuilder)object).append(string2);
            return LuaValue.N2((LuaValue)object2, LuaValue.K2(((StringBuilder)object).toString()));
        }
        catch (Exception exception) {
            return LuaValue.N2(LuaValue.c, LuaValue.K2(exception.getMessage()));
        }
    }

    public void c3(String string2) {
        try {
            c c4;
            this.U = c4 = new c(this, string2);
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed prepare log loads for ");
            stringBuilder.append(string2);
            e1.g(stringBuilder.toString(), throwable);
        }
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        luaValue = luaValue2.z0();
        this.T = luaValue;
        ((Globals)luaValue).e0 = this;
        ((Globals)luaValue).g0 = this;
        if (((Globals)luaValue).X) {
            luaValue2.i2("_G", luaValue2);
            luaValue2.h2("_VERSION", "Lua 5.3 (with Luaj 3.0.1)");
            luaValue2.i2("assert", new _assert());
            luaValue2.i2("assert2", new assert2());
            luaValue2.i2("collectgarbage", new collectgarbage());
            luaValue2.i2("dofile", new dofile(this));
            luaValue2.i2("error", new error());
            luaValue2.i2("getmetatable", new getmetatable());
            luaValue2.i2("load", new load(this));
            luaValue2.i2("loadfile", new loadfile(this));
            luaValue2.i2("pcall", new pcall(this));
            luaValue2.i2("print", new print(this, this));
        }
        luaValue2.i2("rawequal", new rawequal());
        luaValue2.i2("rawget", new rawget());
        luaValue2.i2("rawlen", new rawlen());
        luaValue2.i2("rawset", new rawset());
        luaValue2.i2("select", new select());
        if (((Globals)luaValue).X) {
            luaValue2.i2("setmetatable", new setmetatable());
        }
        luaValue2.i2("tonumber", new tonumber());
        luaValue2.i2("tostring", new tostring());
        luaValue2.i2("type", new type());
        if (((Globals)luaValue).X) {
            luaValue2.i2("xpcall", new xpcall(this));
        }
        luaValue = new next();
        luaValue2.i2("next", luaValue);
        luaValue2.i2("pairs", new pairs((next)luaValue));
        luaValue2.i2("ipairs", new ipairs());
        return luaValue2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public InputStream u(String object) {
        Object object2 = this.T.R3((String)object);
        Object object3 = this.T.Z;
        object = null;
        if (object3 == null) {
            try {
                object = new FileInputStream((File)object2);
                return new b((InputStream)object);
            }
            catch (IOException iOException) {
                return null;
            }
        }
        try {
            object3 = luaj.lib.d.e((File)object2, (e)object3);
            if (object3 == null) return object;
        }
        catch (IOException iOException) {
            return object;
        }
        object2 = new b((InputStream)object3);
        return object2;
    }

    static final class _assert
    extends VarArgFunction {
        _assert() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            if (varargs.U() == 0) {
                LuaValue.l0(1, "assert", "value expected");
            }
            if (!varargs.f0(1)) {
                if (varargs.U() == 1) {
                    throw new luaj.d("assertion failed!");
                }
                throw new luaj.d(varargs.v(2));
            }
            return varargs;
        }
    }

    static final class assert2
    extends VarArgFunction {
        assert2() {
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValue;
            Object object = varargs.v(1);
            if (!((LuaValue)object).P0(luaValue = varargs.v(2))) {
                StringBuilder stringBuilder;
                if (!((LuaValue)object).B2().equals(luaValue.B2())) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(object);
                    stringBuilder.append(" ~= ");
                    stringBuilder.append(luaValue);
                } else {
                    if (!((LuaValue)object).D2().equals(luaValue.D2())) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(object);
                        stringBuilder.append(" [");
                        stringBuilder.append(((LuaValue)object).D2());
                        stringBuilder.append("] ~= ");
                        stringBuilder.append(luaValue);
                        stringBuilder.append(" [");
                        stringBuilder.append(luaValue.D2());
                        object = "]";
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(object);
                        stringBuilder.append(" {");
                        stringBuilder.append(object.getClass());
                        stringBuilder.append("} ~= ");
                        stringBuilder.append(luaValue);
                        stringBuilder.append(" {");
                        stringBuilder.append(luaValue.getClass());
                        object = "}";
                    }
                    stringBuilder.append((String)object);
                }
                object = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append(": ");
                stringBuilder.append(varargs.Z(3, "assertion failed!"));
                LuaValue.R0(stringBuilder.toString());
            }
            return varargs;
        }
    }

    public static class b
    extends BufferedInputStream {
        private long a;
        private long b = -1L;

        public b(InputStream inputStream) {
            super(inputStream);
        }

        public long a() {
            return this.a;
        }

        public InputStream b() {
            return this.in;
        }

        @Override
        public void mark(int n3) {
            synchronized (this) {
                super.mark(n3);
                this.b = this.a;
                return;
            }
        }

        @Override
        public int read() {
            int n3 = super.read();
            if (n3 != -1) {
                ++this.a;
            }
            return n3;
        }

        @Override
        public int read(byte[] byArray, int n3, int n4) {
            if ((n3 = super.read(byArray, n3, n4)) != -1) {
                this.a += (long)n3;
            }
            return n3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void reset() {
            synchronized (this) {
                Throwable throwable2;
                block5: {
                    try {
                        if (!super.markSupported()) {
                            IOException iOException = new IOException("Mark not supported");
                            throw iOException;
                        }
                        if (this.b != -1L) {
                            super.reset();
                            this.a = this.b;
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    IOException iOException = new IOException("Mark not set");
                    throw iOException;
                }
                throw throwable2;
            }
        }

        @Override
        public long skip(long l3) {
            l3 = super.skip(l3);
            this.a += l3;
            return l3;
        }
    }

    class c {
        File a;
        OutputStream b;
        File c;
        DataOutputStream d;
        final BaseLib e;

        c(BaseLib object, String string2) {
            this.e = object;
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(".load");
            this.a = new File(((StringBuilder)object).toString());
            this.b = new BufferedOutputStream(new FileOutputStream(this.a));
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(".load.tmp");
            this.c = new File(((StringBuilder)object).toString());
            this.d = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.c)));
        }

        /*
         * Exception decompiling
         */
        void a() {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 184->232)] java.lang.Throwable
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

        void b(byte[] byArray, int n3, String string2) {
            int n4 = string2.length();
            for (int i3 = 0; i3 < n4; ++i3) {
                byArray[n3 + i3] = (byte)string2.charAt(i3);
            }
        }

        int c(byte[] byArray, int n3, int n4) {
            String string2 = Integer.toOctalString(n4);
            int n5 = string2.length();
            n4 = 0;
            for (int i3 = 0; i3 < n5; ++i3) {
                char c4 = string2.charAt(i3);
                n4 += (c4 & 0xFF) - 48;
                byArray[n3 - n5 + i3] = (byte)c4;
            }
            return n4;
        }
    }

    static final class collectgarbage
    extends VarArgFunction {
        collectgarbage() {
        }

        @Override
        public Varargs invoke(Varargs object) {
            String string2 = ((Varargs)object).Z(1, "collect");
            if ("collect".equals(string2)) {
                System.gc();
                return LuaValue.g;
            }
            if ("count".equals(string2)) {
                object = Runtime.getRuntime();
                long l3 = ((Runtime)object).totalMemory() - ((Runtime)object).freeMemory();
                return LuaValue.N2(LuaValue.J2((double)l3 / 1024.0), LuaValue.I2(l3 % 1024L));
            }
            if ("step".equals(string2)) {
                System.gc();
                return LuaValue.d;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("invalid option '");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("'");
            LuaValue.l0(1, "collectgarbage", ((StringBuilder)object).toString());
            return LuaValue.c;
        }
    }

    private static class d
    extends InputStream {
        final LuaValue a;
        byte[] b;
        int c;
        int d = 0;

        d(LuaValue luaValue) {
            this.a = luaValue;
        }

        @Override
        public int read() {
            Object object;
            int n3 = this.d;
            if (n3 < 0) {
                return -1;
            }
            if (n3 == 0) {
                object = this.a.call();
                if (((LuaValue)object).l1()) {
                    this.d = -1;
                    return -1;
                }
                object = ((LuaValue)object).q2();
                this.b = ((LuaString)object).P;
                this.c = ((LuaString)object).Q;
                this.d = n3 = ((LuaString)object).R;
                if (n3 <= 0) {
                    return -1;
                }
            }
            --this.d;
            object = this.b;
            n3 = this.c;
            this.c = n3 + 1;
            return object[n3] & 0xFF;
        }
    }

    final class dofile
    extends VarArgFunction {
        final BaseLib T;

        dofile(BaseLib baseLib) {
            this.T = baseLib;
        }

        @Override
        public Varargs invoke(Varargs object) {
            Object object2 = ((Varargs)object).w();
            if (!((LuaValue)object2).n1() && !((LuaValue)object2).l1()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("string expected, got ");
                ((StringBuilder)object).append(((LuaValue)object2).D2());
                LuaValue.l0(1, "dofile", ((StringBuilder)object).toString());
            }
            object2 = ((LuaValue)object2).B0();
            object = this.T;
            object = ((Varargs)(object = ((BaseLib)object).a3((String)object2, "bt", ((BaseLib)object).T))).Q(1) ? LuaValue.R0(((Varargs)object).h0(2)) : ((Varargs)object).w().invoke();
            return object;
        }
    }

    static final class error
    extends TwoArgFunction {
        error() {
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            if (!luaValue.l1()) {
                if (luaValue.n1() && luaValue2.H1(1) != 0) {
                    throw new luaj.d(luaValue.g0(), luaValue2.H1(1));
                }
                throw new luaj.d(luaValue);
            }
            throw new luaj.d(LuaValue.c);
        }
    }

    static final class getmetatable
    extends LibFunction {
        getmetatable() {
        }

        @Override
        public LuaValue call() {
            return LuaValue.k0(1, "value expected");
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            luaValue = (luaValue = luaValue.V0()) != null ? luaValue.V1(LuaValue.p).M1(luaValue) : LuaValue.c;
            return luaValue;
        }
    }

    static final class inext
    extends VarArgFunction {
        inext() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            return varargs.I(1).p3(varargs.v(2));
        }
    }

    static final class ipairs
    extends VarArgFunction {
        inext T = new inext();

        ipairs() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            return LuaValue.M2(this.T, varargs.I(1), LuaValue.g);
        }
    }

    final class load
    extends VarArgFunction {
        final BaseLib T;

        load(BaseLib baseLib) {
            this.T = baseLib;
        }

        @Override
        public Varargs invoke(Varargs object) {
            Object object2;
            Object object3 = ((Varargs)object).w();
            if (!((LuaValue)object3).n1() && !((LuaValue)object3).g1()) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("string or function expected, got ");
                ((StringBuilder)object2).append(((LuaValue)object3).D2());
                LuaValue.l0(1, "load", ((StringBuilder)object2).toString());
            }
            object2 = ((LuaValue)object3).n1() ? ((LuaValue)object3).g0() : "=(load)";
            String string2 = ((Varargs)object).Z(2, (String)object2);
            String string3 = ((Varargs)object).Z(3, "bt");
            LuaValue luaValue = ((Varargs)object).d0(4, this.T.T);
            object2 = ((LuaValue)object3).n1() ? ((LuaValue)object3).q2() : null;
            object = object2 != null ? ((LuaString)object2).k3() : new d(((LuaValue)object3).y0());
            object3 = object;
            if (this.T.U != null) {
                object3 = this.T.Y2((LuaString)object2, null, false, (InputStream)object);
            }
            return this.T.b3((InputStream)object3, string2, string3, luaValue);
        }
    }

    final class loadfile
    extends VarArgFunction {
        final BaseLib T;

        loadfile(BaseLib baseLib) {
            this.T = baseLib;
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            CharSequence charSequence;
            Object object = varargs.w();
            if (!((LuaValue)object).n1() && !((LuaValue)object).l1()) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("string expected, got ");
                ((StringBuilder)charSequence).append(((LuaValue)object).D2());
                LuaValue.l0(1, "loadfile", ((StringBuilder)charSequence).toString());
            }
            charSequence = ((LuaValue)object).B0();
            object = varargs.Z(2, "bt");
            varargs = varargs.d0(3, this.T.T);
            return this.T.a3((String)charSequence, (String)object, (LuaValue)varargs);
        }
    }

    static final class next
    extends VarArgFunction {
        next() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            return varargs.I(1).v3(varargs.v(2));
        }
    }

    static final class pairs
    extends VarArgFunction {
        final next T;

        pairs(next next2) {
            this.T = next2;
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            return LuaValue.M2(this.T, varargs.I(1), LuaValue.c);
        }
    }

    final class pcall
    extends VarArgFunction {
        final BaseLib T;

        pcall(BaseLib baseLib) {
            this.T = baseLib;
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            return LuaClosure.d3(this.T.T, this, varargs.K(1), varargs.e0(2));
        }
    }

    final class print
    extends VarArgFunction {
        final BaseLib T;
        final BaseLib U;

        print(BaseLib baseLib, BaseLib baseLib2) {
            this.U = baseLib;
            this.T = baseLib2;
        }

        @Override
        public Varargs invoke(Varargs object) {
            LuaValue luaValue = this.U.T.T0("tostring");
            int n3 = ((Varargs)object).U();
            for (int i3 = 1; i3 <= n3; ++i3) {
                LuaValue luaValue2;
                if (i3 > 1) {
                    this.U.T.c0.print(" \t");
                }
                if ((luaValue2 = luaValue.call(((Varargs)object).v(i3))).n1()) {
                    this.U.T.c0.print(luaValue2.q2().g0());
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("'tostring' must return a string to 'print', got ");
                ((StringBuilder)object).append(luaValue2.D2());
                throw new luaj.d(((StringBuilder)object).toString());
            }
            this.U.T.c0.println();
            return LuaValue.f;
        }
    }

    static final class rawequal
    extends LibFunction {
        rawequal() {
        }

        @Override
        public LuaValue call() {
            return LuaValue.k0(1, "value expected");
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.k0(2, "value expected");
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return LuaValue.H2(luaValue.T1(luaValue2));
        }
    }

    static final class rawget
    extends TableLibFunction {
        rawget() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.k0(2, "value expected");
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return luaValue.H0().V1(luaValue2);
        }
    }

    static final class rawlen
    extends LibFunction {
        rawlen() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.I2(luaValue.W1());
        }
    }

    static final class rawset
    extends TableLibFunction {
        rawset() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.k0(2, "value expected");
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return LuaValue.k0(3, "value expected");
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
            luaValue = luaValue.H0();
            if (!luaValue2.q1()) {
                LuaValue.k0(2, "table index is nil");
            }
            ((LuaTable)luaValue).d2(luaValue2, luaValue3);
            return luaValue;
        }
    }

    static final class select
    extends VarArgFunction {
        select() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            int n3 = varargs.U() - 1;
            if (varargs.w().equals(LuaValue.K2("#"))) {
                return LuaValue.I2(n3);
            }
            int n4 = varargs.D(1);
            if (n4 == 0 || n4 < -n3) {
                LuaValue.k0(1, "index out of range");
            }
            n4 = n4 < 0 ? n3 + n4 + 2 : ++n4;
            return varargs.e0(n4);
        }
    }

    static final class setmetatable
    extends TableLibFunction {
        setmetatable() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.k0(2, "nil or table expected");
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            LuaValue luaValue3 = luaValue.H0().V0();
            if (luaValue3 != null && !luaValue3.V1(LuaValue.p).l1()) {
                LuaValue.R0("cannot change a protected metatable");
            }
            luaValue2 = luaValue2.l1() ? null : luaValue2.H0();
            return luaValue.k2(luaValue2);
        }
    }

    static final class tonumber
    extends LibFunction {
        tonumber() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return luaValue.A2();
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            if (luaValue2.l1()) {
                return luaValue.A2();
            }
            int n3 = luaValue2.A0();
            if (n3 < 2 || n3 > 36) {
                LuaValue.k0(2, "base out of range");
            }
            return luaValue.G0().l3(n3);
        }
    }

    static final class tostring
    extends LibFunction {
        tostring() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return BaseLib.d3(luaValue);
        }
    }

    static final class type
    extends LibFunction {
        type() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.K2(luaValue.D2());
        }
    }

    final class xpcall
    extends VarArgFunction {
        final BaseLib T;

        xpcall(BaseLib baseLib) {
            this.T = baseLib;
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaThread luaThread = this.T.T.f0;
            LuaValue luaValue = luaThread.S;
            luaThread.S = varargs.K(2);
            try {
                varargs = LuaClosure.d3(this.T.T, this, varargs.K(1), varargs.e0(3));
                return varargs;
            }
            finally {
                luaThread.S = luaValue;
            }
        }
    }
}

