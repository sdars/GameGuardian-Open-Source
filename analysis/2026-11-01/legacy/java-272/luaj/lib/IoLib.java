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

/* JADX INFO: loaded from: classes.dex */
public abstract class IoLib extends TwoArgFunction {
    private static final LuaValue Z = LuaValue.K2("stdout");
    private static final LuaValue a0 = LuaValue.K2("stderr");
    private static final LuaValue b0 = LuaValue.K2("file");
    private static final LuaValue c0 = LuaValue.K2("closed file");
    public static final String[] d0 = {"close", "flush", "input", "lines", "open", "output", "popen", "read", "tmpfile", "type", "write"};
    public static final String[] e0 = {"close", "flush", "lines", "read", "seek", "setvbuf", "write"};
    private boolean T = false;
    private File U = null;
    private File V = null;
    private File W = null;
    LuaTable X;
    public Globals Y;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract class File extends LuaValue {
        protected File() {
        }

        @Override // luaj.LuaValue
        public int C2() {
            return 7;
        }

        @Override // luaj.LuaValue
        public String D2() {
            return "userdata";
        }

        public abstract void S2();

        public boolean T2() {
            try {
                return X2() < 0;
            } catch (EOFException unused) {
                return true;
            }
        }

        @Override // luaj.LuaValue
        public LuaValue U0(LuaValue luaValue) {
            return IoLib.this.X.U0(luaValue);
        }

        public abstract void U2();

        @Override // luaj.LuaValue
        public LuaValue V0() {
            return IoLib.this.X;
        }

        public abstract boolean V2();

        public abstract boolean W2();

        public abstract int X2();

        public abstract int Y2();

        public abstract int Z2(byte[] bArr, int i, int i2);

        public abstract int a3();

        public abstract int b3(String str, int i);

        public abstract void c3(String str, int i);

        public abstract void d3(LuaString luaString);

        public void finalize() {
            if (V2()) {
                return;
            }
            try {
                S2();
            } catch (IOException unused) {
            }
        }
    }

    private final class FileImpl extends File {
        private final RandomAccessFile Q;
        private final char R;
        private boolean S;
        private byte[] T;
        private int U;
        private boolean V;

        private FileImpl(java.io.File file, char c2) throws IOException {
            super();
            this.S = false;
            this.T = null;
            RandomAccessFile randomAccessFileH3 = h3(file, c2);
            try {
                IoLib.this.Y.L3(file.getAbsolutePath());
                try {
                    if (c2 != 'a' && c2 != 140) {
                        if (c2 == 'w' || c2 == 162) {
                            randomAccessFileH3.setLength(0L);
                        }
                        this.Q = randomAccessFileH3;
                        this.R = c2;
                    }
                    randomAccessFileH3.seek(randomAccessFileH3.length());
                    this.Q = randomAccessFileH3;
                    this.R = c2;
                } catch (IOException e2) {
                    try {
                        randomAccessFileH3.close();
                    } catch (IOException unused) {
                    }
                    IoLib.this.Y.S3();
                    throw e2;
                }
            } catch (RuntimeException e3) {
                try {
                    randomAccessFileH3.close();
                } catch (IOException unused2) {
                }
                throw e3;
            }
        }

        private void e3() throws IOException {
            if (this.T == null) {
                return;
            }
            U2();
            this.T = null;
        }

        private void f3(boolean z) throws IOException {
            char c2 = this.R;
            if (c2 != 'a') {
                if (c2 == 'r') {
                    if (z) {
                        throw new IOException("invalid mode for write data: '" + this.R + "'");
                    }
                    return;
                }
                if (c2 != 'w') {
                    return;
                }
            }
            if (z) {
                return;
            }
            throw new IOException("invalid mode for read data: '" + this.R + "'");
        }

        private void g3(RandomAccessFile randomAccessFile) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }

        private RandomAccessFile h3(java.io.File file, char c2) throws c {
            if (c2 == 'r') {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                if (IoLib.this.O3(file, randomAccessFile.getFD(), true)) {
                    return randomAccessFile;
                }
                g3(randomAccessFile);
                throw new c("open denied: " + file);
            }
            if (file.exists()) {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                    if (!IoLib.this.O3(file, randomAccessFile2.getFD(), false)) {
                        g3(randomAccessFile2);
                        throw new c("open denied: " + file);
                    }
                    g3(randomAccessFile2);
                } catch (FileNotFoundException unused) {
                }
            }
            RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "rw");
            if (IoLib.this.O3(file, randomAccessFile3.getFD(), false)) {
                return randomAccessFile3;
            }
            g3(randomAccessFile3);
            throw new c("open denied: " + file);
        }

        private void i3(byte[] bArr, int i, int i2) throws IOException {
            RandomAccessFile randomAccessFile = this.Q;
            if (this.R != 140) {
                randomAccessFile.write(bArr, i, i2);
                return;
            }
            long filePointer = randomAccessFile.getFilePointer();
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.seek(filePointer);
        }

        private void j3(byte[] bArr, int i, int i2) throws IOException {
            byte[] bArr2 = this.T;
            if (bArr2 == null) {
                i3(bArr, i, i2);
                return;
            }
            if (i2 == 0) {
                return;
            }
            int length = bArr2.length;
            int i3 = this.U;
            int i4 = 0;
            if (this.V) {
                for (int i5 = (i + i2) - 1; i5 >= i; i5--) {
                    if (bArr[i5] == 10) {
                        if (i3 > 0) {
                            i3(bArr2, 0, i3);
                            this.U = 0;
                            i3 = 0;
                        }
                        int i6 = (i5 - i) + 1;
                        i3(bArr, i, i6);
                        i += i6;
                        i2 -= i6;
                        break;
                    }
                }
            } else if (i3 > 0 || i2 <= length) {
                int i7 = length - i3;
                if (i7 > i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr, i, bArr2, i3, i7);
                i += i7;
                i2 -= i7;
                i3 += i7;
                if (i3 == length) {
                    i3(bArr2, 0, i3);
                    i3 = 0;
                }
                this.U = i3;
                if (i2 == 0) {
                    return;
                }
            }
            int i8 = i3 + i2;
            if (i8 >= length) {
                int i9 = (i8 / length) * length;
                if (i3 > 0) {
                    i3(bArr2, 0, i3);
                    i9 -= i3;
                    this.U = 0;
                } else {
                    i4 = i3;
                }
                i3(bArr, i, i9);
                i += i9;
                i2 -= i9;
                i3 = i4;
            }
            if (i2 > 0) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.U = i3 + i2;
            }
        }

        @Override // luaj.lib.IoLib.File
        public void S2() throws IOException {
            U2();
            if (!this.S) {
                this.S = true;
                IoLib.this.Y.S3();
            }
            this.Q.close();
        }

        @Override // luaj.lib.IoLib.File
        public void U2() throws IOException {
            byte[] bArr = this.T;
            int i = this.U;
            if (bArr == null || i <= 0) {
                return;
            }
            i3(bArr, 0, i);
            this.U = 0;
        }

        @Override // luaj.lib.IoLib.File
        public boolean V2() {
            return this.S;
        }

        @Override // luaj.lib.IoLib.File
        public boolean W2() {
            return false;
        }

        @Override // luaj.lib.IoLib.File
        public int X2() throws IOException {
            f3(false);
            RandomAccessFile randomAccessFile = this.Q;
            long filePointer = randomAccessFile.getFilePointer();
            int i = randomAccessFile.read();
            randomAccessFile.seek(filePointer);
            return i;
        }

        @Override // luaj.lib.IoLib.File
        public int Y2() throws IOException {
            f3(false);
            return this.Q.read();
        }

        @Override // luaj.lib.IoLib.File
        public int Z2(byte[] bArr, int i, int i2) throws IOException {
            f3(false);
            return this.Q.read(bArr, i, i2);
        }

        @Override // luaj.lib.IoLib.File
        public int a3() throws IOException {
            f3(false);
            return (int) (this.Q.length() - this.Q.getFilePointer());
        }

        @Override // luaj.lib.IoLib.File
        public int b3(String str, int i) throws IOException {
            RandomAccessFile randomAccessFile = this.Q;
            if ("set".equals(str)) {
                randomAccessFile.seek(i);
            } else {
                randomAccessFile.seek(("end".equals(str) ? randomAccessFile.length() : randomAccessFile.getFilePointer()) + ((long) i));
            }
            return (int) randomAccessFile.getFilePointer();
        }

        @Override // luaj.lib.IoLib.File
        public void c3(String str, int i) throws IOException {
            if ("no".equals(str)) {
                e3();
                return;
            }
            boolean zEquals = "line".equals(str);
            byte[] bArr = this.T;
            if (bArr == null || bArr.length != i) {
                try {
                    e3();
                    this.T = new byte[i];
                    this.U = 0;
                } catch (OutOfMemoryError e2) {
                    throw new IOException("Out of memory for create buffer " + i + " bytes", e2);
                }
            } else if (this.V != zEquals) {
                U2();
            }
            this.V = zEquals;
        }

        @Override // luaj.lib.IoLib.File
        public void d3(LuaString luaString) throws IOException {
            f3(true);
            IoLib.this.Y.M3(luaString.R);
            j3(luaString.P, luaString.Q, luaString.R);
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public String g0() {
            StringBuilder sb = new StringBuilder();
            sb.append("file (");
            sb.append(this.S ? "closed" : Integer.valueOf(hashCode()));
            sb.append(')');
            return sb.toString();
        }

        /* synthetic */ FileImpl(IoLib ioLib, java.io.File file, char c2, a aVar) {
            this(file, c2);
        }
    }

    static final class IoLibV extends VarArgFunction {
        private File T;
        public IoLib U;
        private boolean V;
        private Varargs W;

        public IoLibV() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            StringBuilder sb;
            String str;
            String string;
            try {
                switch (this.R) {
                    case 0:
                        return this.U.e3(varargs.w());
                    case 1:
                        return this.U.f3();
                    case 2:
                        return this.U.g3(varargs.w());
                    case 3:
                        return this.U.h3(varargs);
                    case 4:
                        return this.U.i3(varargs.E(1), varargs.Z(2, "r"));
                    case 5:
                        return this.U.j3(varargs.w());
                    case 6:
                        return this.U.k3(varargs.E(1), varargs.Z(2, "r"));
                    case 7:
                        return this.U.l3(varargs);
                    case 8:
                        return this.U.m3();
                    case 9:
                        return this.U.n3(varargs.w());
                    case 10:
                        return this.U.o3(varargs);
                    case 11:
                        return this.U.X2(varargs.w());
                    case 12:
                        return this.U.Y2(varargs.w());
                    case 13:
                        return this.U.Z2(varargs);
                    case 14:
                        return this.U.a3(varargs.w(), varargs.e0(2));
                    case 15:
                        return this.U.b3(varargs.w(), varargs.Z(2, "cur"), varargs.Y(3, 0));
                    case 16:
                        return this.U.c3(varargs.w(), varargs.E(2), varargs.Y(3, 8192));
                    case 17:
                        return this.U.d3(varargs.w(), varargs.e0(2));
                    case 18:
                        return this.U.p3(this.T, this.V, this.W);
                    default:
                        return LuaValue.f1676f;
                }
            } catch (IOException e2) {
                if (this.R == 18) {
                    String message = e2.getMessage();
                    if (message == null) {
                        message = e2.toString();
                    }
                    LuaValue.S0(message, e2);
                }
                return IoLib.s3(e2, this.R);
            } catch (luaj.c e3) {
                int i = this.R;
                String[] strArr = IoLib.d0;
                if (i >= strArr.length) {
                    if (i >= strArr.length + IoLib.e0.length) {
                        string = i == 18 ? "(io.lines iterator)" : e3.l;
                    } else {
                        sb = new StringBuilder();
                        sb.append("file:");
                        str = strArr[this.R - strArr.length];
                    }
                    luaj.c cVar = new luaj.c(e3.j, string, e3.k);
                    cVar.initCause(e3);
                    throw cVar;
                }
                sb = new StringBuilder();
                sb.append("io.");
                str = strArr[this.R];
                sb.append(str);
                string = sb.toString();
                luaj.c cVar2 = new luaj.c(e3.j, string, e3.k);
                cVar2.initCause(e3);
                throw cVar2;
            }
        }

        public IoLibV(File file, String str, int i, IoLib ioLib) {
            this.T = file;
            this.S = str;
            this.R = i;
            this.U = ioLib;
        }

        public IoLibV(File file, String str, int i, IoLib ioLib, boolean z, Varargs varargs) {
            this(file, str, i, ioLib);
            this.V = z;
            this.W = varargs.M();
        }
    }

    private final class StdoutFile extends File {
        private final int Q;

        private StdoutFile(int i) {
            super();
            this.Q = i;
        }

        private final PrintStream e3() {
            return this.Q == 2 ? IoLib.this.Y.d0 : IoLib.this.Y.c0;
        }

        @Override // luaj.lib.IoLib.File
        public void S2() {
        }

        @Override // luaj.lib.IoLib.File
        public void U2() {
            e3().flush();
        }

        @Override // luaj.lib.IoLib.File
        public boolean V2() {
            return false;
        }

        @Override // luaj.lib.IoLib.File
        public boolean W2() {
            return true;
        }

        @Override // luaj.lib.IoLib.File
        public int X2() {
            return 0;
        }

        @Override // luaj.lib.IoLib.File
        public int Y2() {
            return 0;
        }

        @Override // luaj.lib.IoLib.File
        public int Z2(byte[] bArr, int i, int i2) {
            return 0;
        }

        @Override // luaj.lib.IoLib.File
        public int a3() {
            return 0;
        }

        @Override // luaj.lib.IoLib.File
        public int b3(String str, int i) {
            return 0;
        }

        @Override // luaj.lib.IoLib.File
        public void c3(String str, int i) {
        }

        @Override // luaj.lib.IoLib.File
        public void d3(LuaString luaString) {
            e3().write(luaString.P, luaString.Q, luaString.R);
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public String g0() {
            return "file (" + hashCode() + ')';
        }

        /* synthetic */ StdoutFile(IoLib ioLib, int i, a aVar) {
            this(i);
        }
    }

    class a implements LibFunction.a {
        a() {
        }

        @Override // luaj.lib.LibFunction.a
        public LibFunction a() {
            return new IoLibV();
        }
    }

    class b implements LibFunction.a {
        b() {
        }

        @Override // luaj.lib.LibFunction.a
        public LibFunction a() {
            return new IoLibV();
        }
    }

    public static final class c extends IOException {
        c(String str) {
            super(str);
        }
    }

    public static LuaValue A3(File file, boolean z, boolean z2) {
        int iY2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (!z) {
                while (true) {
                    iY2 = file.Y2();
                    if (iY2 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(iY2);
                }
            } else {
                while (true) {
                    iY2 = file.Y2();
                    if (iY2 >= 0) {
                        if (iY2 == 10) {
                            if (!z2) {
                                break;
                            }
                            byteArrayOutputStream.write(iY2);
                            break;
                        }
                        if (iY2 != 13 || z2) {
                            byteArrayOutputStream.write(iY2);
                        }
                    } else {
                        break;
                    }
                }
            }
            if (iY2 < 0) {
                if (byteArrayOutputStream.size() == 0) {
                    return LuaValue.f1673c;
                }
            }
        } catch (EOFException unused) {
        }
        return LuaString.o3(byteArrayOutputStream.toByteArray());
    }

    private File B3(boolean z) {
        File file = this.U;
        if (file == null) {
            LuaValue.R0("stdin not supported");
        }
        if (z && file.V2()) {
            LuaValue.R0("standard input file is closed");
        }
        return file;
    }

    private static Varargs C3(File file) {
        if (file.W2()) {
            return t3("cannot close standard file", 1000);
        }
        file.S2();
        return M3();
    }

    private File D3(int i, String str, String str2) {
        try {
            return K3(i, str, str2);
        } catch (Exception e2) {
            LuaValue.S0("io error: " + e2.getMessage(), e2);
            return null;
        }
    }

    private Varargs E3(File file, Varargs varargs) {
        LuaValue luaValueW3;
        LuaString luaStringG0;
        int i;
        int iU = varargs.U();
        if (iU == 0) {
            return y3(file, false);
        }
        LuaValue[] luaValueArr = new LuaValue[iU];
        int i2 = 0;
        while (i2 < iU) {
            int i3 = i2 + 1;
            LuaValue luaValueV = varargs.v(i3);
            int iC2 = luaValueV.C2();
            if (iC2 != 3) {
                if (iC2 == 4 && (i = (luaStringG0 = luaValueV.G0()).R) >= 1) {
                    byte[] bArr = luaStringG0.P;
                    int i4 = luaStringG0.Q;
                    byte b2 = bArr[i4];
                    if (b2 == 42 && i >= 2) {
                        b2 = bArr[i4 + 1];
                    }
                    if (b2 == 76) {
                        luaValueW3 = y3(file, true);
                    } else if (b2 == 97) {
                        luaValueW3 = v3(file);
                    } else if (b2 == 108) {
                        luaValueW3 = y3(file, false);
                    } else if (b2 == 110) {
                        luaValueW3 = z3(file);
                    }
                }
                return LuaValue.l0(i3, "read", "invalid format: '" + luaValueV + "'");
            }
            luaValueW3 = w3(file, luaValueV.y2());
            luaValueArr[i2] = luaValueW3;
            if (luaValueW3.l1()) {
                i2 = i3;
                break;
            }
            i2 = i3;
        }
        return i2 == 0 ? LuaValue.f1673c : LuaValue.P2(luaValueArr, 0, i2);
    }

    private static Varargs F3(File file, Varargs varargs) {
        int iU = varargs.U();
        for (int i = 1; i <= iU; i++) {
            file.d3(varargs.H(i));
        }
        return file;
    }

    private Varargs G3(File file, boolean z, Varargs varargs) {
        int iU = varargs.U();
        if (iU > 250) {
            if (z) {
                try {
                    file.S2();
                } catch (IOException unused) {
                }
            }
            LuaValue.R0("too many arguments: " + iU + " max = 250");
        }
        try {
            return new IoLibV(file, "lnext", 18, this, z, varargs);
        } catch (Exception e2) {
            return LuaValue.S0("lines: " + e2, e2);
        }
    }

    private static File I3(LuaValue luaValue) {
        if (luaValue instanceof File) {
            return (File) luaValue;
        }
        return null;
    }

    private File J3(boolean z) {
        File fileD3 = this.V;
        if (fileD3 == null) {
            fileD3 = D3(1, "-", "w");
            this.V = fileD3;
        }
        if (z && fileD3.V2()) {
            LuaValue.R0("standard output file is closed");
        }
        return fileD3;
    }

    private File K3(int i, String str, String str2) {
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str2.charAt(i2);
            if ((i2 != 0 || "rwa".indexOf(cCharAt) < 0) && ((i2 != 1 || cCharAt != '+') && (i2 < 1 || cCharAt != 'b'))) {
                length = -1;
            }
        }
        if (length <= 0) {
            LuaValue.l0(2, "io.open", "invalid mode: '" + str2 + "'");
        }
        if (i == 1) {
            return Q3();
        }
        if (i != 2) {
            return H3(str, (char) (str2.charAt(0) + (str2.indexOf(43) > 0 ? '+' : (char) 0)));
        }
        return P3();
    }

    private void L3(LuaTable luaTable) {
        for (LuaValue luaValue : luaTable.t3()) {
            ((IoLibV) luaTable.U0(luaValue)).U = this;
        }
    }

    private static Varargs M3() {
        return LuaValue.f1674d;
    }

    private File N3() throws IOException {
        java.io.File fileCreateTempFile = java.io.File.createTempFile(".gg.", ".tmp");
        this.T = true;
        try {
            FileImpl fileImpl = new FileImpl(this, fileCreateTempFile, (char) 162, null);
            this.T = false;
            fileCreateTempFile.delete();
            return fileImpl;
        } catch (Throwable th) {
            this.T = false;
            throw th;
        }
    }

    private File P3() {
        return new StdoutFile(this, 2, null);
    }

    private File Q3() {
        return new StdoutFile(this, 1, null);
    }

    private static File q3(String str, LuaValue luaValue) {
        File fileI3 = I3(luaValue);
        if (fileI3 == null) {
            LuaValue.l0(1, str, "FILE* expected, got " + luaValue.E2());
        }
        r3(fileI3);
        return fileI3;
    }

    private static File r3(File file) {
        if (file.V2()) {
            LuaValue.R0("attempt to use a closed file");
        }
        return file;
    }

    static Varargs s3(IOException iOException, int i) {
        String message = iOException.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append("io error: ");
        if (message == null) {
            message = iOException.toString();
        }
        sb.append(message);
        return t3(sb.toString(), i);
    }

    private static Varargs t3(String str, int i) {
        return LuaValue.M2(LuaValue.f1673c, LuaValue.K2(str), LuaValue.I2(i));
    }

    private File u3() {
        File file = this.W;
        if (file != null) {
            return file;
        }
        File fileD3 = D3(2, "-", "w");
        this.W = fileD3;
        return fileD3;
    }

    public static LuaValue v3(File file) {
        int iA3 = file.a3();
        if (iA3 >= 0) {
            return iA3 == 0 ? LuaValue.L : w3(file, iA3);
        }
        return A3(file, false, false);
    }

    public static LuaValue w3(File file, int i) {
        if (i == 0) {
            return file.T2() ? LuaValue.f1673c : LuaValue.L;
        }
        byte[] bArr = new byte[i];
        int iZ2 = file.Z2(bArr, 0, i);
        return iZ2 < 0 ? LuaValue.f1673c : LuaString.p3(bArr, 0, iZ2);
    }

    private static int x3(File file, String str, ByteArrayOutputStream byteArrayOutputStream, int i) {
        int i2 = 0;
        while (true) {
            int iX2 = file.X2();
            if (str.indexOf(iX2) < 0) {
                return i2;
            }
            file.Y2();
            i2++;
            if (byteArrayOutputStream != null) {
                if (byteArrayOutputStream.size() >= 200) {
                    byteArrayOutputStream.reset();
                    return 0;
                }
                byteArrayOutputStream.write(iX2);
            }
            if (i > 0 && i2 >= i) {
                return i2;
            }
        }
    }

    public static LuaValue y3(File file, boolean z) {
        return A3(file, true, z);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    public static LuaValue z3(File file) {
        int i;
        boolean z;
        String str;
        int iX3;
        String str2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        x3(file, " \t\r\n", null, 0);
        x3(file, "-+", byteArrayOutputStream, 1);
        if (x3(file, "0", byteArrayOutputStream, 1) > 0) {
            if (x3(file, "xX", byteArrayOutputStream, 1) > 0) {
                i = 0;
                z = true;
            } else {
                i = 1;
            }
            if (z) {
                str = "0123456789abcdefABCDEF";
            } else {
                str = "0123456789";
            }
            iX3 = i + x3(file, str, byteArrayOutputStream, 0);
            if (x3(file, ".", byteArrayOutputStream, 1) > 0) {
                iX3 += x3(file, z ? "0123456789abcdefABCDEF" : "0123456789", byteArrayOutputStream, 0);
            }
            if (iX3 > 0) {
                if (z) {
                    str2 = "pP";
                } else {
                    str2 = "eE";
                }
                if (x3(file, str2, byteArrayOutputStream, 1) > 0) {
                    x3(file, "-+", byteArrayOutputStream, 1);
                    x3(file, "0123456789", byteArrayOutputStream, 0);
                }
            }
            String string = byteArrayOutputStream.toString();
            return string.length() > 0 ? LuaValue.P1(string, LuaValue.f1673c) : LuaValue.f1673c;
        }
        i = 0;
        z = false;
        if (z) {
            str = "0123456789abcdefABCDEF";
        } else {
            str = "0123456789";
        }
        iX3 = i + x3(file, str, byteArrayOutputStream, 0);
        if (x3(file, ".", byteArrayOutputStream, 1) > 0) {
            iX3 += x3(file, z ? "0123456789abcdefABCDEF" : "0123456789", byteArrayOutputStream, 0);
        }
        if (iX3 > 0) {
            if (z) {
                str2 = "pP";
            } else {
                str2 = "eE";
            }
            if (x3(file, str2, byteArrayOutputStream, 1) > 0) {
                x3(file, "-+", byteArrayOutputStream, 1);
                x3(file, "0123456789", byteArrayOutputStream, 0);
            }
        }
        String string2 = byteArrayOutputStream.toString();
        if (string2.length() > 0) {
        }
    }

    protected File H3(String str, char c2) {
        return new FileImpl(this, this.Y.R3(str), c2, null);
    }

    protected boolean O3(java.io.File file, FileDescriptor fileDescriptor, boolean z) {
        if (this.T) {
            return true;
        }
        return d.b(fileDescriptor, this.Y.Z, z);
    }

    public Varargs X2(LuaValue luaValue) {
        return C3(q3("file:close", luaValue));
    }

    public Varargs Y2(LuaValue luaValue) {
        q3("file:flush", luaValue).U2();
        return LuaValue.f1674d;
    }

    public Varargs Z2(Varargs varargs) {
        return G3(q3("file:lines", varargs.w()), false, varargs.e0(2));
    }

    public Varargs a3(LuaValue luaValue, Varargs varargs) {
        return E3(q3("file:read", luaValue), varargs);
    }

    public Varargs b3(LuaValue luaValue, String str, int i) {
        if (!"set".equals(str) && !"end".equals(str) && !"cur".equals(str)) {
            LuaValue.l0(1, "file:seek", "invalid value: '" + str + "'; must be one of 'set', 'cur' or 'end'");
        }
        return LuaValue.I2(q3("file:seek", luaValue).b3(str, i));
    }

    public Varargs c3(LuaValue luaValue, String str, int i) {
        if ("no".equals(str)) {
            i = 1;
        } else if (!"full".equals(str) && !"line".equals(str)) {
            LuaValue.l0(1, "file:setvbuf", "invalid value: '" + str + "'; must be one of 'no', 'full' or 'line'");
        }
        if (i <= 0) {
            LuaValue.l0(2, "file:setvbuf", "invalid value '" + i + "'; must be positive");
        }
        q3("file:setvbuf", luaValue).c3(str, i);
        return LuaValue.f1674d;
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        this.Y = luaValue2.z0();
        LuaTable luaTable = new LuaTable();
        V2(luaTable, new a(), d0);
        LuaTable luaTable2 = new LuaTable();
        this.X = luaTable2;
        W2(luaTable2, new b(), e0, 11);
        L3(luaTable);
        L3(this.X);
        this.X.h2("__name", "FILE*");
        LuaValue luaValue3 = this.X;
        luaValue3.i2("__index", luaValue3);
        luaTable.j2(Z, J3(false));
        luaTable.j2(a0, u3());
        luaValue2.i2("io", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("io", luaTable);
        }
        return luaTable;
    }

    public Varargs d3(LuaValue luaValue, Varargs varargs) {
        return F3(q3("file:write", luaValue), varargs);
    }

    public Varargs e3(LuaValue luaValue) {
        File fileJ3 = luaValue.l1() ? J3(false) : q3("io.close", luaValue);
        r3(fileJ3);
        return C3(fileJ3);
    }

    public Varargs f3() {
        J3(true);
        this.V.U2();
        return LuaValue.f1674d;
    }

    public Varargs g3(LuaValue luaValue) {
        File fileD3;
        if (luaValue.l1()) {
            fileD3 = B3(false);
        } else {
            fileD3 = luaValue.n1() ? D3(3, luaValue.B0(), "r") : q3("io.input", luaValue);
        }
        this.U = fileD3;
        return fileD3;
    }

    public Varargs h3(Varargs varargs) {
        String strZ = varargs.Z(1, null);
        File fileB3 = strZ == null ? B3(false) : D3(3, strZ, "r");
        r3(fileB3);
        return G3(fileB3, strZ != null, varargs.e0(2));
    }

    public Varargs i3(String str, String str2) {
        return K3(3, str, str2);
    }

    public Varargs j3(LuaValue luaValue) {
        File fileD3;
        if (luaValue.l1()) {
            fileD3 = J3(false);
        } else {
            fileD3 = luaValue.n1() ? D3(3, luaValue.B0(), "w") : q3("io.output", luaValue);
        }
        this.V = fileD3;
        return fileD3;
    }

    public Varargs k3(String str, String str2) {
        throw new luaj.d("Failed io.popen('" + str + "', '" + str2 + "'): disabled by security reason");
    }

    public Varargs l3(Varargs varargs) {
        B3(true);
        return E3(this.U, varargs);
    }

    public Varargs m3() {
        return N3();
    }

    public Varargs n3(LuaValue luaValue) {
        File fileI3 = I3(luaValue);
        if (fileI3 != null) {
            return fileI3.V2() ? c0 : b0;
        }
        return LuaValue.f1673c;
    }

    public Varargs o3(Varargs varargs) {
        J3(true);
        return F3(this.V, varargs);
    }

    public Varargs p3(LuaValue luaValue, boolean z, Varargs varargs) {
        File fileI3 = I3(luaValue);
        if (fileI3 == null) {
            LuaValue.l0(1, "lines", "not a file: " + luaValue);
        }
        if (fileI3.V2()) {
            LuaValue.R0("file is already closed");
        }
        Varargs varargsE3 = E3(fileI3, varargs);
        if (z && varargsE3.Q(1) && fileI3.T2()) {
            fileI3.S2();
        }
        return varargsE3;
    }
}
