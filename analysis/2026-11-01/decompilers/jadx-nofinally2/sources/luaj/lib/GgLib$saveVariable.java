package luaj.lib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import luaj.Globals;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public final class GgLib$saveVariable extends VarArgFunction {
    static final String[] Y = {"address", "value", "flags", "name", "freeze", "freezeType", "freezeFrom", "freezeTo"};
    final Globals T;
    Writer U;
    Map V;
    List W;
    final Integer X = 0;

    private final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final RandomAccessFile f1767a;

        a(RandomAccessFile randomAccessFile) {
            this.f1767a = randomAccessFile;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f1767a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            GgLib$saveVariable.this.T.M3(1L);
            this.f1767a.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            GgLib$saveVariable.this.T.M3(bArr.length);
            this.f1767a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            GgLib$saveVariable.this.T.M3(i2);
            this.f1767a.write(bArr, i, i2);
        }
    }

    public GgLib$saveVariable(Globals globals) {
        this.T = globals;
    }

    private void X2(LuaTable luaTable) {
        if (((Integer) this.V.put(luaTable, this.X)) == null && (luaTable instanceof LuaTable)) {
            LuaTable.i iVarS3 = luaTable.s3();
            while (iVarS3.c()) {
                int i = 0;
                while (i < 2) {
                    LuaValue luaValueB = i == 0 ? iVarS3.b() : iVarS3.d();
                    if (luaValueB instanceof LuaTable) {
                        X2((LuaTable) luaValueB);
                    }
                    i++;
                }
            }
        }
    }

    private void Y2() throws IOException {
        LuaValue luaValueB;
        String[] strArr = Y;
        Writer writer = this.U;
        List list = this.W;
        Map map = this.V;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            boolean z = true;
            i++;
            LuaTable.i iVarS3 = ((LuaTable) it.next()).s3();
            while (iVarS3.c()) {
                int iA = iVarS3.a();
                LuaValue luaValueD = iVarS3.d();
                if (luaValueD instanceof LuaTable) {
                    luaValueB = iA != 0 ? null : iVarS3.b();
                } else if (iA == 0) {
                    luaValueB = iVarS3.b();
                    if (!(luaValueB instanceof LuaTable)) {
                    }
                }
                if (z) {
                    writer.write("\nt=v[");
                    writer.write(Integer.toString(i));
                    writer.write(93);
                    z = false;
                }
                writer.write("\nt[");
                if (luaValueB == null) {
                    writer.write(Integer.toString(iA));
                } else {
                    a3(writer, strArr, map, luaValueB);
                }
                writer.write("]=");
                a3(writer, strArr, map, luaValueD);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    private void Z2() throws IOException {
        LuaValue luaValueD;
        String[] strArr = Y;
        this.U.write("local ");
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            this.U.write((char) (i2 + 97));
            this.U.write(44);
        }
        this.U.write("v,t=");
        for (String str : strArr) {
            this.U.write(39);
            this.U.write(str);
            this.U.write("',");
        }
        this.U.write("nil\nv={");
        Writer writer = this.U;
        Map map = this.V;
        for (LuaTable luaTable : this.W) {
            int i3 = 1;
            i++;
            map.put(luaTable, Integer.valueOf(i));
            writer.write("{");
            LuaTable.i iVarS3 = luaTable.s3();
            while (iVarS3.c()) {
                int iA = iVarS3.a();
                if (iA == 0) {
                    LuaValue luaValueB = iVarS3.b();
                    if (!(luaValueB instanceof LuaTable)) {
                        writer.write("[");
                        a3(writer, strArr, map, luaValueB);
                    }
                } else {
                    if (iA != i3) {
                        writer.write("[");
                        writer.write(Integer.toString(iA));
                    } else {
                        i3++;
                    }
                    luaValueD = iVarS3.d();
                    if (luaValueD instanceof LuaTable) {
                        writer.write("nil");
                    } else {
                        a3(writer, strArr, map, luaValueD);
                    }
                    writer.write(";");
                }
                writer.write("]=");
                luaValueD = iVarS3.d();
                if (luaValueD instanceof LuaTable) {
                    writer.write("nil");
                } else {
                    a3(writer, strArr, map, luaValueD);
                }
                writer.write(";");
            }
            writer.write("};");
        }
        writer.write("}");
    }

    private void a3(Writer writer, String[] strArr, Map map, LuaValue luaValue) throws IOException {
        if (luaValue instanceof LuaTable) {
            writer.write("v[");
            writer.write(Integer.toString(((Integer) map.get(luaValue)).intValue()));
            writer.write(93);
        } else {
            if (!(luaValue instanceof LuaString)) {
                writer.write(luaValue.g0());
                return;
            }
            String strG0 = luaValue.g0();
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (strG0.equals(strArr[i])) {
                    writer.write(i + 97);
                    return;
                }
            }
            b3(writer, strG0);
        }
    }

    /* JADX WARN: Switch 'out' block B:18:0x0038 for B:9:0x001d already processed. Defaulting to fallback option. */
    private Appendable b3(Appendable appendable, String str) throws IOException {
        if (appendable == null) {
            appendable = new StringBuilder();
        }
        appendable.append('\'');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\'' && cCharAt != '\\') {
                switch (cCharAt) {
                    case 7:
                        cCharAt = 'a';
                        appendable.append('\\');
                        break;
                    case '\b':
                        cCharAt = 'b';
                        appendable.append('\\');
                        break;
                    case '\t':
                        cCharAt = 't';
                        appendable.append('\\');
                        break;
                    case '\n':
                        cCharAt = 'n';
                        appendable.append('\\');
                        break;
                    case 11:
                        cCharAt = 'v';
                        appendable.append('\\');
                        break;
                    case '\f':
                        cCharAt = 'f';
                        appendable.append('\\');
                        break;
                    case '\r':
                        cCharAt = 'r';
                        appendable.append('\\');
                        break;
                }
            } else {
                appendable.append('\\');
            }
            appendable.append(cCharAt);
        }
        appendable.append('\'');
        return appendable;
    }

    private void c3(LuaValue luaValue, RandomAccessFile randomAccessFile) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new a(randomAccessFile)), 65536);
            this.U = bufferedWriter;
            if (luaValue instanceof LuaTable) {
                this.V = new HashMap();
                X2((LuaTable) luaValue);
                this.W = new ArrayList(this.V.keySet());
                Z2();
                Y2();
                bufferedWriter.write("\nreturn v[" + this.V.get(luaValue) + "]\n");
                this.V = null;
            } else {
                if (luaValue instanceof LuaString) {
                    bufferedWriter.write("return ");
                    b3(bufferedWriter, luaValue.g0());
                } else {
                    bufferedWriter.write("return ");
                    bufferedWriter.write(luaValue.g0());
                }
                bufferedWriter.write(10);
            }
            bufferedWriter.close();
            this.U = null;
            this.V = null;
            this.W = null;
        } catch (Throwable th) {
            this.U = null;
            this.V = null;
            this.W = null;
            throw th;
        }
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaValue luaValueV = varargs.v(1);
        String strE = varargs.E(2);
        this.T.L3(strE);
        try {
            RandomAccessFile randomAccessFileF = d.f(new File(strE), this.T.Z);
            if (randomAccessFileF == null) {
                this.T.S3();
                return LuaValue.K2("File '" + strE + "' can not be written");
            }
            try {
                c3(luaValueV, randomAccessFileF);
                try {
                    randomAccessFileF.close();
                } catch (IOException unused) {
                }
                this.T.S3();
                return LuaValue.f1673c;
            } catch (Throwable th) {
                try {
                    LuaString luaStringK2 = LuaValue.K2(th.toString());
                    try {
                        randomAccessFileF.close();
                    } catch (IOException unused2) {
                    }
                    this.T.S3();
                    return luaStringK2;
                } catch (Throwable th2) {
                    try {
                        randomAccessFileF.close();
                    } catch (IOException unused3) {
                    }
                    this.T.S3();
                    throw th2;
                }
            }
        } catch (IOException e2) {
            this.T.S3();
            return LuaValue.K2(e2.toString());
        }
    }
}
