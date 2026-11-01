package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
public abstract class IoLib extends luaj.lib.TwoArgFunction {
    private static final luaj.LuaValue Z = luaj.LuaValue.K2("stdout");
    private static final luaj.LuaValue a0 = luaj.LuaValue.K2("stderr");
    private static final luaj.LuaValue b0 = luaj.LuaValue.K2("file");
    private static final luaj.LuaValue c0 = luaj.LuaValue.K2("closed file");
    public static final java.lang.String[] d0 = {"close", "flush", "input", "lines", "open", "output", "popen", "read", "tmpfile", "type", "write"};
    public static final java.lang.String[] e0 = {"close", "flush", "lines", "read", "seek", "setvbuf", "write"};
    private boolean T = false;
    private luaj.lib.IoLib.File U = null;
    private luaj.lib.IoLib.File V = null;
    private luaj.lib.IoLib.File W = null;
    luaj.LuaTable X;
    public luaj.Globals Y;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract class File extends luaj.LuaValue {
        protected File() {
        }

        @Override // luaj.LuaValue
        public int C2() {
            return 7;
        }

        @Override // luaj.LuaValue
        public java.lang.String D2() {
            return "userdata";
        }

        public abstract void S2();

        public boolean T2() {
            try {
                return X2() < 0;
            } catch (java.io.EOFException unused) {
                return true;
            }
        }

        @Override // luaj.LuaValue
        public luaj.LuaValue U0(luaj.LuaValue luaValue) {
            return luaj.lib.IoLib.this.X.U0(luaValue);
        }

        public abstract void U2();

        @Override // luaj.LuaValue
        public luaj.LuaValue V0() {
            return luaj.lib.IoLib.this.X;
        }

        public abstract boolean V2();

        public abstract boolean W2();

        public abstract int X2();

        public abstract int Y2();

        public abstract int Z2(byte[] bArr, int i, int i2);

        public abstract int a3();

        public abstract int b3(java.lang.String str, int i);

        public abstract void c3(java.lang.String str, int i);

        public abstract void d3(luaj.LuaString luaString);

        public void finalize() {
            if (V2()) {
                return;
            }
            try {
                S2();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private final class FileImpl extends luaj.lib.IoLib.File {
        private final java.io.RandomAccessFile Q;
        private final char R;
        private boolean S;
        private byte[] T;
        private int U;
        private boolean V;

        private FileImpl(java.io.File file, char c2) throws java.io.IOException {
            super();
            this.S = false;
            this.T = null;
            java.io.RandomAccessFile randomAccessFileH3 = h3(file, c2);
            try {
                luaj.lib.IoLib.this.Y.L3(file.getAbsolutePath());
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
                } catch (java.io.IOException e2) {
                    try {
                        randomAccessFileH3.close();
                    } catch (java.io.IOException unused) {
                    }
                    luaj.lib.IoLib.this.Y.S3();
                    throw e2;
                }
            } catch (java.lang.RuntimeException e3) {
                try {
                    randomAccessFileH3.close();
                } catch (java.io.IOException unused2) {
                }
                throw e3;
            }
        }

        /* synthetic */ FileImpl(luaj.lib.IoLib ioLib, java.io.File file, char c2, luaj.lib.IoLib.a aVar) {
            this(file, c2);
        }

        private void e3() throws java.io.IOException {
            if (this.T == null) {
                return;
            }
            U2();
            this.T = null;
        }

        private void f3(boolean z) throws java.io.IOException {
            char c2 = this.R;
            if (c2 != 'a') {
                if (c2 == 'r') {
                    if (z) {
                        throw new java.io.IOException("invalid mode for write data: '" + this.R + "'");
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
            throw new java.io.IOException("invalid mode for read data: '" + this.R + "'");
        }

        private void g3(java.io.RandomAccessFile randomAccessFile) {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused) {
            }
        }

        private java.io.RandomAccessFile h3(java.io.File file, char c2) throws luaj.lib.IoLib.c {
            if (c2 == 'r') {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "r");
                if (luaj.lib.IoLib.this.O3(file, randomAccessFile.getFD(), true)) {
                    return randomAccessFile;
                }
                g3(randomAccessFile);
                throw new luaj.lib.IoLib.c("open denied: " + file);
            }
            if (file.exists()) {
                try {
                    java.io.RandomAccessFile randomAccessFile2 = new java.io.RandomAccessFile(file, "r");
                    if (!luaj.lib.IoLib.this.O3(file, randomAccessFile2.getFD(), false)) {
                        g3(randomAccessFile2);
                        throw new luaj.lib.IoLib.c("open denied: " + file);
                    }
                    g3(randomAccessFile2);
                } catch (java.io.FileNotFoundException unused) {
                }
            }
            java.io.RandomAccessFile randomAccessFile3 = new java.io.RandomAccessFile(file, "rw");
            if (luaj.lib.IoLib.this.O3(file, randomAccessFile3.getFD(), false)) {
                return randomAccessFile3;
            }
            g3(randomAccessFile3);
            throw new luaj.lib.IoLib.c("open denied: " + file);
        }

        private void i3(byte[] bArr, int i, int i2) throws java.io.IOException {
            java.io.RandomAccessFile randomAccessFile = this.Q;
            if (this.R != 140) {
                randomAccessFile.write(bArr, i, i2);
                return;
            }
            long filePointer = randomAccessFile.getFilePointer();
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.seek(filePointer);
        }

        private void j3(byte[] bArr, int i, int i2) throws java.io.IOException {
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
                java.lang.System.arraycopy(bArr, i, bArr2, i3, i7);
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
                java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
                this.U = i3 + i2;
            }
        }

        @Override // luaj.lib.IoLib.File
        public void S2() throws java.io.IOException {
            U2();
            if (!this.S) {
                this.S = true;
                luaj.lib.IoLib.this.Y.S3();
            }
            this.Q.close();
        }

        @Override // luaj.lib.IoLib.File
        public void U2() throws java.io.IOException {
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
        public int X2() throws java.io.IOException {
            f3(false);
            java.io.RandomAccessFile randomAccessFile = this.Q;
            long filePointer = randomAccessFile.getFilePointer();
            int i = randomAccessFile.read();
            randomAccessFile.seek(filePointer);
            return i;
        }

        @Override // luaj.lib.IoLib.File
        public int Y2() throws java.io.IOException {
            f3(false);
            return this.Q.read();
        }

        @Override // luaj.lib.IoLib.File
        public int Z2(byte[] bArr, int i, int i2) throws java.io.IOException {
            f3(false);
            return this.Q.read(bArr, i, i2);
        }

        @Override // luaj.lib.IoLib.File
        public int a3() throws java.io.IOException {
            f3(false);
            return (int) (this.Q.length() - this.Q.getFilePointer());
        }

        @Override // luaj.lib.IoLib.File
        public int b3(java.lang.String str, int i) throws java.io.IOException {
            java.io.RandomAccessFile randomAccessFile = this.Q;
            if ("set".equals(str)) {
                randomAccessFile.seek(i);
            } else {
                randomAccessFile.seek(("end".equals(str) ? randomAccessFile.length() : randomAccessFile.getFilePointer()) + ((long) i));
            }
            return (int) randomAccessFile.getFilePointer();
        }

        @Override // luaj.lib.IoLib.File
        public void c3(java.lang.String str, int i) throws java.io.IOException {
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
                } catch (java.lang.OutOfMemoryError e2) {
                    throw new java.io.IOException("Out of memory for create buffer " + i + " bytes", e2);
                }
            } else if (this.V != zEquals) {
                U2();
            }
            this.V = zEquals;
        }

        @Override // luaj.lib.IoLib.File
        public void d3(luaj.LuaString luaString) throws java.io.IOException {
            f3(true);
            luaj.lib.IoLib.this.Y.M3(luaString.R);
            j3(luaString.P, luaString.Q, luaString.R);
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public java.lang.String g0() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("file (");
            sb.append(this.S ? "closed" : java.lang.Integer.valueOf(hashCode()));
            sb.append(')');
            return sb.toString();
        }
    }

    static final class IoLibV extends luaj.lib.VarArgFunction {
        private luaj.lib.IoLib.File T;
        public luaj.lib.IoLib U;
        private boolean V;
        private luaj.Varargs W;

        public IoLibV() {
        }

        public IoLibV(luaj.lib.IoLib.File file, java.lang.String str, int i, luaj.lib.IoLib ioLib) {
            this.T = file;
            this.S = str;
            this.R = i;
            this.U = ioLib;
        }

        public IoLibV(luaj.lib.IoLib.File file, java.lang.String str, int i, luaj.lib.IoLib ioLib, boolean z, luaj.Varargs varargs) {
            this(file, str, i, ioLib);
            this.V = z;
            this.W = varargs.M();
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            java.lang.StringBuilder sb;
            java.lang.String str;
            java.lang.String string;
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
                        return luaj.LuaValue.f1676f;
                }
            } catch (java.io.IOException e2) {
                if (this.R == 18) {
                    java.lang.String message = e2.getMessage();
                    if (message == null) {
                        message = e2.toString();
                    }
                    luaj.LuaValue.S0(message, e2);
                }
                return luaj.lib.IoLib.s3(e2, this.R);
            } catch (luaj.c e3) {
                int i = this.R;
                java.lang.String[] strArr = luaj.lib.IoLib.d0;
                if (i >= strArr.length) {
                    if (i >= strArr.length + luaj.lib.IoLib.e0.length) {
                        string = i == 18 ? "(io.lines iterator)" : e3.l;
                    } else {
                        sb = new java.lang.StringBuilder();
                        sb.append("file:");
                        str = strArr[this.R - strArr.length];
                    }
                    luaj.c cVar = new luaj.c(e3.j, string, e3.k);
                    cVar.initCause(e3);
                    throw cVar;
                }
                sb = new java.lang.StringBuilder();
                sb.append("io.");
                str = strArr[this.R];
                sb.append(str);
                string = sb.toString();
                luaj.c cVar2 = new luaj.c(e3.j, string, e3.k);
                cVar2.initCause(e3);
                throw cVar2;
            }
        }
    }

    private final class StdoutFile extends luaj.lib.IoLib.File {
        private final int Q;

        private StdoutFile(int i) {
            super();
            this.Q = i;
        }

        /* synthetic */ StdoutFile(luaj.lib.IoLib ioLib, int i, luaj.lib.IoLib.a aVar) {
            this(i);
        }

        private final java.io.PrintStream e3() {
            return this.Q == 2 ? luaj.lib.IoLib.this.Y.d0 : luaj.lib.IoLib.this.Y.c0;
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
        public int b3(java.lang.String str, int i) {
            return 0;
        }

        @Override // luaj.lib.IoLib.File
        public void c3(java.lang.String str, int i) {
        }

        @Override // luaj.lib.IoLib.File
        public void d3(luaj.LuaString luaString) {
            e3().write(luaString.P, luaString.Q, luaString.R);
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public java.lang.String g0() {
            return "file (" + hashCode() + ')';
        }
    }

    class a implements luaj.lib.LibFunction.a {
        a() {
        }

        @Override // luaj.lib.LibFunction.a
        public luaj.lib.LibFunction a() {
            return new luaj.lib.IoLib.IoLibV();
        }
    }

    class b implements luaj.lib.LibFunction.a {
        b() {
        }

        @Override // luaj.lib.LibFunction.a
        public luaj.lib.LibFunction a() {
            return new luaj.lib.IoLib.IoLibV();
        }
    }

    public static final class c extends java.io.IOException {
        c(java.lang.String str) {
            super(str);
        }
    }

    public static luaj.LuaValue A3(luaj.lib.IoLib.File file, boolean z, boolean z2) {
        int iY2;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
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
                    return luaj.LuaValue.f1673c;
                }
            }
        } catch (java.io.EOFException unused) {
        }
        return luaj.LuaString.o3(byteArrayOutputStream.toByteArray());
    }

    private luaj.lib.IoLib.File B3(boolean z) {
        luaj.lib.IoLib.File file = this.U;
        if (file == null) {
            luaj.LuaValue.R0("stdin not supported");
        }
        if (z && file.V2()) {
            luaj.LuaValue.R0("standard input file is closed");
        }
        return file;
    }

    private static luaj.Varargs C3(luaj.lib.IoLib.File file) {
        if (file.W2()) {
            return t3("cannot close standard file", 1000);
        }
        file.S2();
        return M3();
    }

    private luaj.lib.IoLib.File D3(int i, java.lang.String str, java.lang.String str2) {
        try {
            return K3(i, str, str2);
        } catch (java.lang.Exception e2) {
            luaj.LuaValue.S0("io error: " + e2.getMessage(), e2);
            return null;
        }
    }

    private luaj.Varargs E3(luaj.lib.IoLib.File file, luaj.Varargs varargs) {
        luaj.LuaValue luaValueW3;
        luaj.LuaString luaStringG0;
        int i;
        int iU = varargs.U();
        if (iU == 0) {
            return y3(file, false);
        }
        luaj.LuaValue[] luaValueArr = new luaj.LuaValue[iU];
        int i2 = 0;
        while (i2 < iU) {
            int i3 = i2 + 1;
            luaj.LuaValue luaValueV = varargs.v(i3);
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
                return luaj.LuaValue.l0(i3, "read", "invalid format: '" + luaValueV + "'");
            }
            luaValueW3 = w3(file, luaValueV.y2());
            luaValueArr[i2] = luaValueW3;
            if (luaValueW3.l1()) {
                i2 = i3;
                break;
            }
            i2 = i3;
        }
        return i2 == 0 ? luaj.LuaValue.f1673c : luaj.LuaValue.P2(luaValueArr, 0, i2);
    }

    private static luaj.Varargs F3(luaj.lib.IoLib.File file, luaj.Varargs varargs) {
        int iU = varargs.U();
        for (int i = 1; i <= iU; i++) {
            file.d3(varargs.H(i));
        }
        return file;
    }

    private luaj.Varargs G3(luaj.lib.IoLib.File file, boolean z, luaj.Varargs varargs) {
        int iU = varargs.U();
        if (iU > 250) {
            if (z) {
                try {
                    file.S2();
                } catch (java.io.IOException unused) {
                }
            }
            luaj.LuaValue.R0("too many arguments: " + iU + " max = 250");
        }
        try {
            return new luaj.lib.IoLib.IoLibV(file, "lnext", 18, this, z, varargs);
        } catch (java.lang.Exception e2) {
            return luaj.LuaValue.S0("lines: " + e2, e2);
        }
    }

    private static luaj.lib.IoLib.File I3(luaj.LuaValue luaValue) {
        if (luaValue instanceof luaj.lib.IoLib.File) {
            return (luaj.lib.IoLib.File) luaValue;
        }
        return null;
    }

    private luaj.lib.IoLib.File J3(boolean z) {
        luaj.lib.IoLib.File fileD3 = this.V;
        if (fileD3 == null) {
            fileD3 = D3(1, "-", "w");
            this.V = fileD3;
        }
        if (z && fileD3.V2()) {
            luaj.LuaValue.R0("standard output file is closed");
        }
        return fileD3;
    }

    private luaj.lib.IoLib.File K3(int i, java.lang.String str, java.lang.String str2) {
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str2.charAt(i2);
            if ((i2 != 0 || "rwa".indexOf(cCharAt) < 0) && ((i2 != 1 || cCharAt != '+') && (i2 < 1 || cCharAt != 'b'))) {
                length = -1;
            }
        }
        if (length <= 0) {
            luaj.LuaValue.l0(2, "io.open", "invalid mode: '" + str2 + "'");
        }
        if (i == 1) {
            return Q3();
        }
        if (i != 2) {
            return H3(str, (char) (str2.charAt(0) + (str2.indexOf(43) > 0 ? '+' : (char) 0)));
        }
        return P3();
    }

    private void L3(luaj.LuaTable luaTable) {
        for (luaj.LuaValue luaValue : luaTable.t3()) {
            ((luaj.lib.IoLib.IoLibV) luaTable.U0(luaValue)).U = this;
        }
    }

    private static luaj.Varargs M3() {
        return luaj.LuaValue.f1674d;
    }

    private luaj.lib.IoLib.File N3() throws java.io.IOException {
        java.io.File fileCreateTempFile = java.io.File.createTempFile(".gg.", ".tmp");
        this.T = true;
        try {
            luaj.lib.IoLib.FileImpl fileImpl = new luaj.lib.IoLib.FileImpl(this, fileCreateTempFile, (char) 162, null);
            this.T = false;
            fileCreateTempFile.delete();
            return fileImpl;
        } catch (java.lang.Throwable th) {
            this.T = false;
            throw th;
        }
    }

    private luaj.lib.IoLib.File P3() {
        return new luaj.lib.IoLib.StdoutFile(this, 2, null);
    }

    private luaj.lib.IoLib.File Q3() {
        return new luaj.lib.IoLib.StdoutFile(this, 1, null);
    }

    private static luaj.lib.IoLib.File q3(java.lang.String str, luaj.LuaValue luaValue) {
        luaj.lib.IoLib.File fileI3 = I3(luaValue);
        if (fileI3 == null) {
            luaj.LuaValue.l0(1, str, "FILE* expected, got " + luaValue.E2());
        }
        r3(fileI3);
        return fileI3;
    }

    private static luaj.lib.IoLib.File r3(luaj.lib.IoLib.File file) {
        if (file.V2()) {
            luaj.LuaValue.R0("attempt to use a closed file");
        }
        return file;
    }

    static luaj.Varargs s3(java.io.IOException iOException, int i) {
        java.lang.String message = iOException.getMessage();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("io error: ");
        if (message == null) {
            message = iOException.toString();
        }
        sb.append(message);
        return t3(sb.toString(), i);
    }

    private static luaj.Varargs t3(java.lang.String str, int i) {
        return luaj.LuaValue.M2(luaj.LuaValue.f1673c, luaj.LuaValue.K2(str), luaj.LuaValue.I2(i));
    }

    private luaj.lib.IoLib.File u3() {
        luaj.lib.IoLib.File file = this.W;
        if (file != null) {
            return file;
        }
        luaj.lib.IoLib.File fileD3 = D3(2, "-", "w");
        this.W = fileD3;
        return fileD3;
    }

    public static luaj.LuaValue v3(luaj.lib.IoLib.File file) {
        int iA3 = file.a3();
        if (iA3 >= 0) {
            return iA3 == 0 ? luaj.LuaValue.L : w3(file, iA3);
        }
        return A3(file, false, false);
    }

    public static luaj.LuaValue w3(luaj.lib.IoLib.File file, int i) {
        if (i == 0) {
            return file.T2() ? luaj.LuaValue.f1673c : luaj.LuaValue.L;
        }
        byte[] bArr = new byte[i];
        int iZ2 = file.Z2(bArr, 0, i);
        return iZ2 < 0 ? luaj.LuaValue.f1673c : luaj.LuaString.p3(bArr, 0, iZ2);
    }

    private static int x3(luaj.lib.IoLib.File file, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int i) {
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

    public static luaj.LuaValue y3(luaj.lib.IoLib.File file, boolean z) {
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
    public static luaj.LuaValue z3(luaj.lib.IoLib.File file) {
        int i;
        boolean z;
        java.lang.String str;
        int iX3;
        java.lang.String str2;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
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
            java.lang.String string = byteArrayOutputStream.toString();
            return string.length() > 0 ? luaj.LuaValue.P1(string, luaj.LuaValue.f1673c) : luaj.LuaValue.f1673c;
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
        java.lang.String string2 = byteArrayOutputStream.toString();
        if (string2.length() > 0) {
        }
    }

    protected luaj.lib.IoLib.File H3(java.lang.String str, char c2) {
        return new luaj.lib.IoLib.FileImpl(this, this.Y.R3(str), c2, null);
    }

    protected boolean O3(java.io.File file, java.io.FileDescriptor fileDescriptor, boolean z) {
        if (this.T) {
            return true;
        }
        return luaj.lib.d.b(fileDescriptor, this.Y.Z, z);
    }

    public luaj.Varargs X2(luaj.LuaValue luaValue) {
        return C3(q3("file:close", luaValue));
    }

    public luaj.Varargs Y2(luaj.LuaValue luaValue) {
        q3("file:flush", luaValue).U2();
        return luaj.LuaValue.f1674d;
    }

    public luaj.Varargs Z2(luaj.Varargs varargs) {
        return G3(q3("file:lines", varargs.w()), false, varargs.e0(2));
    }

    public luaj.Varargs a3(luaj.LuaValue luaValue, luaj.Varargs varargs) {
        return E3(q3("file:read", luaValue), varargs);
    }

    public luaj.Varargs b3(luaj.LuaValue luaValue, java.lang.String str, int i) {
        if (!"set".equals(str) && !"end".equals(str) && !"cur".equals(str)) {
            luaj.LuaValue.l0(1, "file:seek", "invalid value: '" + str + "'; must be one of 'set', 'cur' or 'end'");
        }
        return luaj.LuaValue.I2(q3("file:seek", luaValue).b3(str, i));
    }

    public luaj.Varargs c3(luaj.LuaValue luaValue, java.lang.String str, int i) {
        if ("no".equals(str)) {
            i = 1;
        } else if (!"full".equals(str) && !"line".equals(str)) {
            luaj.LuaValue.l0(1, "file:setvbuf", "invalid value: '" + str + "'; must be one of 'no', 'full' or 'line'");
        }
        if (i <= 0) {
            luaj.LuaValue.l0(2, "file:setvbuf", "invalid value '" + i + "'; must be positive");
        }
        q3("file:setvbuf", luaValue).c3(str, i);
        return luaj.LuaValue.f1674d;
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        this.Y = luaValue2.z0();
        luaj.LuaTable luaTable = new luaj.LuaTable();
        V2(luaTable, new luaj.lib.IoLib.a(), d0);
        luaj.LuaTable luaTable2 = new luaj.LuaTable();
        this.X = luaTable2;
        W2(luaTable2, new luaj.lib.IoLib.b(), e0, 11);
        L3(luaTable);
        L3(this.X);
        this.X.h2("__name", "FILE*");
        luaj.LuaValue luaValue3 = this.X;
        luaValue3.i2("__index", luaValue3);
        luaTable.j2(Z, J3(false));
        luaTable.j2(a0, u3());
        luaValue2.i2("io", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("io", luaTable);
        }
        return luaTable;
    }

    public luaj.Varargs d3(luaj.LuaValue luaValue, luaj.Varargs varargs) {
        return F3(q3("file:write", luaValue), varargs);
    }

    public luaj.Varargs e3(luaj.LuaValue luaValue) {
        luaj.lib.IoLib.File fileJ3 = luaValue.l1() ? J3(false) : q3("io.close", luaValue);
        r3(fileJ3);
        return C3(fileJ3);
    }

    public luaj.Varargs f3() {
        J3(true);
        this.V.U2();
        return luaj.LuaValue.f1674d;
    }

    public luaj.Varargs g3(luaj.LuaValue luaValue) {
        luaj.lib.IoLib.File fileD3;
        if (luaValue.l1()) {
            fileD3 = B3(false);
        } else {
            fileD3 = luaValue.n1() ? D3(3, luaValue.B0(), "r") : q3("io.input", luaValue);
        }
        this.U = fileD3;
        return fileD3;
    }

    public luaj.Varargs h3(luaj.Varargs varargs) {
        java.lang.String strZ = varargs.Z(1, null);
        luaj.lib.IoLib.File fileB3 = strZ == null ? B3(false) : D3(3, strZ, "r");
        r3(fileB3);
        return G3(fileB3, strZ != null, varargs.e0(2));
    }

    public luaj.Varargs i3(java.lang.String str, java.lang.String str2) {
        return K3(3, str, str2);
    }

    public luaj.Varargs j3(luaj.LuaValue luaValue) {
        luaj.lib.IoLib.File fileD3;
        if (luaValue.l1()) {
            fileD3 = J3(false);
        } else {
            fileD3 = luaValue.n1() ? D3(3, luaValue.B0(), "w") : q3("io.output", luaValue);
        }
        this.V = fileD3;
        return fileD3;
    }

    public luaj.Varargs k3(java.lang.String str, java.lang.String str2) {
        throw new luaj.d("Failed io.popen('" + str + "', '" + str2 + "'): disabled by security reason");
    }

    public luaj.Varargs l3(luaj.Varargs varargs) {
        B3(true);
        return E3(this.U, varargs);
    }

    public luaj.Varargs m3() {
        return N3();
    }

    public luaj.Varargs n3(luaj.LuaValue luaValue) {
        luaj.lib.IoLib.File fileI3 = I3(luaValue);
        if (fileI3 != null) {
            return fileI3.V2() ? c0 : b0;
        }
        return luaj.LuaValue.f1673c;
    }

    public luaj.Varargs o3(luaj.Varargs varargs) {
        J3(true);
        return F3(this.V, varargs);
    }

    public luaj.Varargs p3(luaj.LuaValue luaValue, boolean z, luaj.Varargs varargs) {
        luaj.lib.IoLib.File fileI3 = I3(luaValue);
        if (fileI3 == null) {
            luaj.LuaValue.l0(1, "lines", "not a file: " + luaValue);
        }
        if (fileI3.V2()) {
            luaj.LuaValue.R0("file is already closed");
        }
        luaj.Varargs varargsE3 = E3(fileI3, varargs);
        if (z && varargsE3.Q(1) && fileI3.T2()) {
            fileI3.S2();
        }
        return varargsE3;
    }
}
