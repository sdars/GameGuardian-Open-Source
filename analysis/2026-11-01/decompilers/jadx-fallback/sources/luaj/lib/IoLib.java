package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class IoLib extends luaj.lib.TwoArgFunction {
    private static final luaj.LuaValue Z = null;
    private static final luaj.LuaValue a0 = null;
    private static final luaj.LuaValue b0 = null;
    private static final luaj.LuaValue c0 = null;
    public static final java.lang.String[] d0 = null;
    public static final java.lang.String[] e0 = null;
    private boolean T;
    private luaj.lib.IoLib.File U;
    private luaj.lib.IoLib.File V;
    private luaj.lib.IoLib.File W;
    luaj.LuaTable X;
    public luaj.Globals Y;

    protected abstract class File extends luaj.LuaValue {
        final /* synthetic */ luaj.lib.IoLib P;

        protected File(luaj.lib.IoLib r1) {
                r0 = this;
                r0.P = r1
                r0.<init>()
                return
        }

        @Override // luaj.LuaValue
        public int C2() {
                r1 = this;
                r0 = 7
                return r0
        }

        @Override // luaj.LuaValue
        public java.lang.String D2() {
                r1 = this;
                java.lang.String r0 = "userdata"
                return r0
        }

        public abstract void S2();

        public boolean T2() {
                r2 = this;
                r0 = 1
                int r1 = r2.X2()     // Catch: java.io.EOFException -> L9
                if (r1 >= 0) goto L8
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // luaj.LuaValue
        public luaj.LuaValue U0(luaj.LuaValue r2) {
                r1 = this;
                luaj.lib.IoLib r0 = r1.P
                luaj.LuaTable r0 = r0.X
                luaj.LuaValue r2 = r0.U0(r2)
                return r2
        }

        public abstract void U2();

        @Override // luaj.LuaValue
        public luaj.LuaValue V0() {
                r1 = this;
                luaj.lib.IoLib r0 = r1.P
                luaj.LuaTable r0 = r0.X
                return r0
        }

        public abstract boolean V2();

        public abstract boolean W2();

        public abstract int X2();

        public abstract int Y2();

        public abstract int Z2(byte[] r1, int r2, int r3);

        public abstract int a3();

        public abstract int b3(java.lang.String r1, int r2);

        public abstract void c3(java.lang.String r1, int r2);

        public abstract void d3(luaj.LuaString r1);

        public void finalize() {
                r1 = this;
                boolean r0 = r1.V2()
                if (r0 != 0) goto L9
                r1.S2()     // Catch: java.io.IOException -> L9
            L9:
                return
        }
    }

    private final class FileImpl extends luaj.lib.IoLib.File {
        private final java.io.RandomAccessFile Q;
        private final char R;
        private boolean S;
        private byte[] T;
        private int U;
        private boolean V;
        final /* synthetic */ luaj.lib.IoLib W;

        private FileImpl(luaj.lib.IoLib r4, java.io.File r5, char r6) {
                r3 = this;
                r3.W = r4
                r3.<init>(r4)
                r0 = 0
                r3.S = r0
                r0 = 0
                r3.T = r0
                java.io.RandomAccessFile r0 = r3.h3(r5, r6)
                luaj.Globals r1 = r4.Y     // Catch: java.lang.RuntimeException -> L46
                java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.RuntimeException -> L46
                r1.L3(r5)     // Catch: java.lang.RuntimeException -> L46
                r5 = 97
                if (r6 == r5) goto L31
                r5 = 140(0x8c, float:1.96E-43)
                if (r6 != r5) goto L21
                goto L31
            L21:
                r5 = 119(0x77, float:1.67E-43)
                if (r6 == r5) goto L29
                r5 = 162(0xa2, float:2.27E-43)
                if (r6 != r5) goto L38
            L29:
                r1 = 0
                r0.setLength(r1)     // Catch: java.io.IOException -> L2f
                goto L38
            L2f:
                r5 = move-exception
                goto L3d
            L31:
                long r1 = r0.length()     // Catch: java.io.IOException -> L2f
                r0.seek(r1)     // Catch: java.io.IOException -> L2f
            L38:
                r3.Q = r0
                r3.R = r6
                return
            L3d:
                r0.close()     // Catch: java.io.IOException -> L40
            L40:
                luaj.Globals r4 = r4.Y
                r4.S3()
                throw r5
            L46:
                r4 = move-exception
                r0.close()     // Catch: java.io.IOException -> L4a
            L4a:
                throw r4
        }

        /* synthetic */ FileImpl(luaj.lib.IoLib r1, java.io.File r2, char r3, luaj.lib.IoLib.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private void e3() {
                r1 = this;
                byte[] r0 = r1.T
                if (r0 != 0) goto L5
                return
            L5:
                r1.U2()
                r0 = 0
                r1.T = r0
                return
        }

        private void f3(boolean r4) {
                r3 = this;
                char r0 = r3.R
                r1 = 97
                java.lang.String r2 = "'"
                if (r0 == r1) goto L30
                r1 = 114(0x72, float:1.6E-43)
                if (r0 == r1) goto L11
                r1 = 119(0x77, float:1.67E-43)
                if (r0 == r1) goto L30
                goto L32
            L11:
                if (r4 != 0) goto L14
                goto L32
            L14:
                java.io.IOException r4 = new java.io.IOException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "invalid mode for write data: '"
                r0.append(r1)
                char r1 = r3.R
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
            L30:
                if (r4 == 0) goto L33
            L32:
                return
            L33:
                java.io.IOException r4 = new java.io.IOException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "invalid mode for read data: '"
                r0.append(r1)
                char r1 = r3.R
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }

        private void g3(java.io.RandomAccessFile r1) {
                r0 = this;
                r1.close()     // Catch: java.io.IOException -> L3
            L3:
                return
        }

        private java.io.RandomAccessFile h3(java.io.File r5, char r6) {
                r4 = this;
                r0 = 114(0x72, float:1.6E-43)
                java.lang.String r1 = "r"
                java.lang.String r2 = "open denied: "
                if (r6 != r0) goto L33
                java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
                r6.<init>(r5, r1)
                luaj.lib.IoLib r0 = r4.W
                java.io.FileDescriptor r1 = r6.getFD()
                r3 = 1
                boolean r0 = r0.O3(r5, r1, r3)
                if (r0 == 0) goto L1b
                return r6
            L1b:
                r4.g3(r6)
                luaj.lib.IoLib$c r6 = new luaj.lib.IoLib$c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r6.<init>(r5)
                throw r6
            L33:
                boolean r6 = r5.exists()
                r0 = 0
                if (r6 == 0) goto L69
                java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch: java.io.FileNotFoundException -> L4f
                r6.<init>(r5, r1)     // Catch: java.io.FileNotFoundException -> L4f
                luaj.lib.IoLib r1 = r4.W     // Catch: java.io.FileNotFoundException -> L4f
                java.io.FileDescriptor r3 = r6.getFD()     // Catch: java.io.FileNotFoundException -> L4f
                boolean r1 = r1.O3(r5, r3, r0)     // Catch: java.io.FileNotFoundException -> L4f
                if (r1 == 0) goto L51
                r4.g3(r6)     // Catch: java.io.FileNotFoundException -> L4f
                goto L69
            L4f:
                goto L69
            L51:
                r4.g3(r6)     // Catch: java.io.FileNotFoundException -> L4f
                luaj.lib.IoLib$c r6 = new luaj.lib.IoLib$c     // Catch: java.io.FileNotFoundException -> L4f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L4f
                r1.<init>()     // Catch: java.io.FileNotFoundException -> L4f
                r1.append(r2)     // Catch: java.io.FileNotFoundException -> L4f
                r1.append(r5)     // Catch: java.io.FileNotFoundException -> L4f
                java.lang.String r1 = r1.toString()     // Catch: java.io.FileNotFoundException -> L4f
                r6.<init>(r1)     // Catch: java.io.FileNotFoundException -> L4f
                throw r6     // Catch: java.io.FileNotFoundException -> L4f
            L69:
                java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
                java.lang.String r1 = "rw"
                r6.<init>(r5, r1)
                luaj.lib.IoLib r1 = r4.W
                java.io.FileDescriptor r3 = r6.getFD()
                boolean r0 = r1.O3(r5, r3, r0)
                if (r0 == 0) goto L7d
                return r6
            L7d:
                r4.g3(r6)
                luaj.lib.IoLib$c r6 = new luaj.lib.IoLib$c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r6.<init>(r5)
                throw r6
        }

        private void i3(byte[] r6, int r7, int r8) {
                r5 = this;
                java.io.RandomAccessFile r0 = r5.Q
                char r1 = r5.R
                r2 = 140(0x8c, float:1.96E-43)
                if (r1 != r2) goto L1a
                long r1 = r0.getFilePointer()
                long r3 = r0.length()
                r0.seek(r3)
                r0.write(r6, r7, r8)
                r0.seek(r1)
                goto L1d
            L1a:
                r0.write(r6, r7, r8)
            L1d:
                return
        }

        private void j3(byte[] r8, int r9, int r10) {
                r7 = this;
                byte[] r0 = r7.T
                if (r0 != 0) goto L9
                r7.i3(r8, r9, r10)
                goto L6d
            L9:
                if (r10 != 0) goto Lc
                goto L6d
            Lc:
                int r1 = r0.length
                int r2 = r7.U
                boolean r3 = r7.V
                r4 = 0
                if (r3 == 0) goto L34
                int r3 = r9 + r10
                int r3 = r3 + (-1)
            L18:
                if (r3 < r9) goto L4e
                r5 = r8[r3]
                r6 = 10
                if (r5 != r6) goto L31
                if (r2 <= 0) goto L28
                r7.i3(r0, r4, r2)
                r7.U = r4
                r2 = 0
            L28:
                int r3 = r3 - r9
                int r3 = r3 + 1
                r7.i3(r8, r9, r3)
                int r9 = r9 + r3
                int r10 = r10 - r3
                goto L4e
            L31:
                int r3 = r3 + (-1)
                goto L18
            L34:
                if (r2 > 0) goto L38
                if (r10 > r1) goto L4e
            L38:
                int r3 = r1 - r2
                if (r3 <= r10) goto L3d
                r3 = r10
            L3d:
                java.lang.System.arraycopy(r8, r9, r0, r2, r3)
                int r9 = r9 + r3
                int r10 = r10 - r3
                int r2 = r2 + r3
                if (r2 != r1) goto L49
                r7.i3(r0, r4, r2)
                r2 = 0
            L49:
                r7.U = r2
                if (r10 != 0) goto L4e
                return
            L4e:
                int r3 = r2 + r10
                if (r3 < r1) goto L65
                int r3 = r3 / r1
                int r3 = r3 * r1
                if (r2 <= 0) goto L5e
                r7.i3(r0, r4, r2)
                int r3 = r3 - r2
                r7.U = r4
                goto L5f
            L5e:
                r4 = r2
            L5f:
                r7.i3(r8, r9, r3)
                int r9 = r9 + r3
                int r10 = r10 - r3
                r2 = r4
            L65:
                if (r10 <= 0) goto L6d
                java.lang.System.arraycopy(r8, r9, r0, r2, r10)
                int r2 = r2 + r10
                r7.U = r2
            L6d:
                return
        }

        @Override // luaj.lib.IoLib.File
        public void S2() {
                r1 = this;
                r1.U2()
                boolean r0 = r1.S
                if (r0 != 0) goto L11
                r0 = 1
                r1.S = r0
                luaj.lib.IoLib r0 = r1.W
                luaj.Globals r0 = r0.Y
                r0.S3()
            L11:
                java.io.RandomAccessFile r0 = r1.Q
                r0.close()
                return
        }

        @Override // luaj.lib.IoLib.File
        public void U2() {
                r3 = this;
                byte[] r0 = r3.T
                int r1 = r3.U
                if (r0 == 0) goto Le
                if (r1 <= 0) goto Le
                r2 = 0
                r3.i3(r0, r2, r1)
                r3.U = r2
            Le:
                return
        }

        @Override // luaj.lib.IoLib.File
        public boolean V2() {
                r1 = this;
                boolean r0 = r1.S
                return r0
        }

        @Override // luaj.lib.IoLib.File
        public boolean W2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // luaj.lib.IoLib.File
        public int X2() {
                r4 = this;
                r0 = 0
                r4.f3(r0)
                java.io.RandomAccessFile r0 = r4.Q
                long r1 = r0.getFilePointer()
                int r3 = r0.read()
                r0.seek(r1)
                return r3
        }

        @Override // luaj.lib.IoLib.File
        public int Y2() {
                r1 = this;
                r0 = 0
                r1.f3(r0)
                java.io.RandomAccessFile r0 = r1.Q
                int r0 = r0.read()
                return r0
        }

        @Override // luaj.lib.IoLib.File
        public int Z2(byte[] r2, int r3, int r4) {
                r1 = this;
                r0 = 0
                r1.f3(r0)
                java.io.RandomAccessFile r0 = r1.Q
                int r2 = r0.read(r2, r3, r4)
                return r2
        }

        @Override // luaj.lib.IoLib.File
        public int a3() {
                r4 = this;
                r0 = 0
                r4.f3(r0)
                java.io.RandomAccessFile r0 = r4.Q
                long r0 = r0.length()
                java.io.RandomAccessFile r2 = r4.Q
                long r2 = r2.getFilePointer()
                long r0 = r0 - r2
                int r1 = (int) r0
                return r1
        }

        @Override // luaj.lib.IoLib.File
        public int b3(java.lang.String r4, int r5) {
                r3 = this;
                java.io.RandomAccessFile r0 = r3.Q
                java.lang.String r1 = "set"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto Lf
                long r4 = (long) r5
                r0.seek(r4)
                goto L26
            Lf:
                java.lang.String r1 = "end"
                boolean r4 = r1.equals(r4)
                if (r4 == 0) goto L21
                long r1 = r0.length()
            L1b:
                long r4 = (long) r5
                long r1 = r1 + r4
                r0.seek(r1)
                goto L26
            L21:
                long r1 = r0.getFilePointer()
                goto L1b
            L26:
                long r4 = r0.getFilePointer()
                int r5 = (int) r4
                return r5
        }

        @Override // luaj.lib.IoLib.File
        public void c3(java.lang.String r4, int r5) {
                r3 = this;
                java.lang.String r0 = "no"
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto Lc
                r3.e3()
                goto L2e
            Lc:
                java.lang.String r0 = "line"
                boolean r4 = r0.equals(r4)
                byte[] r0 = r3.T
                if (r0 == 0) goto L22
                int r0 = r0.length
                if (r0 == r5) goto L1a
                goto L22
            L1a:
                boolean r5 = r3.V
                if (r5 == r4) goto L2c
                r3.U2()
                goto L2c
            L22:
                byte[] r0 = new byte[r5]     // Catch: java.lang.OutOfMemoryError -> L2f
                r3.e3()     // Catch: java.lang.OutOfMemoryError -> L2f
                r3.T = r0     // Catch: java.lang.OutOfMemoryError -> L2f
                r0 = 0
                r3.U = r0     // Catch: java.lang.OutOfMemoryError -> L2f
            L2c:
                r3.V = r4
            L2e:
                return
            L2f:
                r4 = move-exception
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Out of memory for create buffer "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = " bytes"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5, r4)
                throw r0
        }

        @Override // luaj.lib.IoLib.File
        public void d3(luaj.LuaString r4) {
                r3 = this;
                r0 = 1
                r3.f3(r0)
                luaj.lib.IoLib r0 = r3.W
                luaj.Globals r0 = r0.Y
                int r1 = r4.R
                long r1 = (long) r1
                r0.M3(r1)
                byte[] r0 = r4.P
                int r1 = r4.Q
                int r4 = r4.R
                r3.j3(r0, r1, r4)
                return
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public java.lang.String g0() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "file ("
                r0.append(r1)
                boolean r1 = r2.S
                if (r1 == 0) goto L11
                java.lang.String r1 = "closed"
                goto L19
            L11:
                int r1 = r2.hashCode()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            L19:
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static final class IoLibV extends luaj.lib.VarArgFunction {
        private luaj.lib.IoLib.File T;
        public luaj.lib.IoLib U;
        private boolean V;
        private luaj.Varargs W;

        public IoLibV() {
                r0 = this;
                r0.<init>()
                return
        }

        public IoLibV(luaj.lib.IoLib.File r1, java.lang.String r2, int r3, luaj.lib.IoLib r4) {
                r0 = this;
                r0.<init>()
                r0.T = r1
                r0.S = r2
                r0.R = r3
                r0.U = r4
                return
        }

        public IoLibV(luaj.lib.IoLib.File r1, java.lang.String r2, int r3, luaj.lib.IoLib r4, boolean r5, luaj.Varargs r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r0.V = r5
                luaj.Varargs r1 = r6.M()
                r0.W = r1
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r7) {
                r6 = this;
                r0 = 18
                int r1 = r6.R     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                java.lang.String r2 = "r"
                r3 = 1
                r4 = 3
                r5 = 2
                switch(r1) {
                    case 0: goto Lea;
                    case 1: goto Le3;
                    case 2: goto Ld8;
                    case 3: goto Ld1;
                    case 4: goto Lc2;
                    case 5: goto Lb7;
                    case 6: goto La8;
                    case 7: goto La1;
                    case 8: goto L9a;
                    case 9: goto L8f;
                    case 10: goto L88;
                    case 11: goto L7d;
                    case 12: goto L72;
                    case 13: goto L6b;
                    case 14: goto L5c;
                    case 15: goto L46;
                    case 16: goto L31;
                    case 17: goto L22;
                    case 18: goto Lf;
                    default: goto Lc;
                }
            Lc:
                luaj.LuaValue r7 = luaj.LuaValue.f1674f
                return r7
            Lf:
                luaj.lib.IoLib r7 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.lib.IoLib$File r1 = r6.T     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                boolean r2 = r6.V     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r3 = r6.W     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r7.p3(r1, r2, r3)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            L1c:
                r7 = move-exception
                goto Lf5
            L1f:
                r7 = move-exception
                goto L13f
            L22:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.LuaValue r2 = r7.w()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r7.e0(r5)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.d3(r2, r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            L31:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.LuaValue r2 = r7.w()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                java.lang.String r3 = r7.E(r5)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                r5 = 8192(0x2000, float:1.148E-41)
                int r7 = r7.Y(r4, r5)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.c3(r2, r3, r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            L46:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.LuaValue r2 = r7.w()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                java.lang.String r3 = "cur"
                java.lang.String r3 = r7.Z(r5, r3)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                r5 = 0
                int r7 = r7.Y(r4, r5)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.b3(r2, r3, r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            L5c:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.LuaValue r2 = r7.w()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r7.e0(r5)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.a3(r2, r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            L6b:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.Z2(r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            L72:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.LuaValue r7 = r7.w()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.Y2(r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            L7d:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.LuaValue r7 = r7.w()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.X2(r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            L88:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.o3(r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            L8f:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.LuaValue r7 = r7.w()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.n3(r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            L9a:
                luaj.lib.IoLib r7 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r7.m3()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            La1:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.l3(r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            La8:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                java.lang.String r3 = r7.E(r3)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                java.lang.String r7 = r7.Z(r5, r2)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.k3(r3, r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            Lb7:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.LuaValue r7 = r7.w()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.j3(r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            Lc2:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                java.lang.String r3 = r7.E(r3)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                java.lang.String r7 = r7.Z(r5, r2)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.i3(r3, r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            Ld1:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.h3(r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            Ld8:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.LuaValue r7 = r7.w()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.g3(r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            Le3:
                luaj.lib.IoLib r7 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r7.f3()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            Lea:
                luaj.lib.IoLib r1 = r6.U     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.LuaValue r7 = r7.w()     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                luaj.Varargs r7 = r1.e3(r7)     // Catch: luaj.c -> L1c java.io.IOException -> L1f
                return r7
            Lf5:
                int r1 = r6.R
                java.lang.String[] r2 = luaj.lib.IoLib.d0
                int r3 = r2.length
                if (r1 < r3) goto L123
                int r3 = r2.length
                java.lang.String[] r4 = luaj.lib.IoLib.e0
                int r4 = r4.length
                int r3 = r3 + r4
                if (r1 < r3) goto L10b
                if (r1 != r0) goto L108
                java.lang.String r0 = "(io.lines iterator)"
                goto L132
            L108:
                java.lang.String r0 = r7.l
                goto L132
            L10b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "file:"
                r0.append(r1)
                int r1 = r6.R
                int r3 = r2.length
                int r1 = r1 - r3
                r1 = r2[r1]
            L11b:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                goto L132
            L123:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "io."
                r0.append(r1)
                int r1 = r6.R
                r1 = r2[r1]
                goto L11b
            L132:
                luaj.c r1 = new luaj.c
                int r2 = r7.j
                java.lang.String r3 = r7.k
                r1.<init>(r2, r0, r3)
                r1.initCause(r7)
                throw r1
            L13f:
                int r1 = r6.R
                if (r1 != r0) goto L151
                java.lang.String r0 = r7.getMessage()
                if (r0 == 0) goto L14a
                goto L14e
            L14a:
                java.lang.String r0 = r7.toString()
            L14e:
                luaj.LuaValue.S0(r0, r7)
            L151:
                int r0 = r6.R
                luaj.Varargs r7 = luaj.lib.IoLib.s3(r7, r0)
                return r7
        }
    }

    private final class StdoutFile extends luaj.lib.IoLib.File {
        private final int Q;
        final /* synthetic */ luaj.lib.IoLib R;

        private StdoutFile(luaj.lib.IoLib r1, int r2) {
                r0 = this;
                r0.R = r1
                r0.<init>(r1)
                r0.Q = r2
                return
        }

        /* synthetic */ StdoutFile(luaj.lib.IoLib r1, int r2, luaj.lib.IoLib.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private final java.io.PrintStream e3() {
                r2 = this;
                int r0 = r2.Q
                r1 = 2
                if (r0 != r1) goto Lc
                luaj.lib.IoLib r0 = r2.R
                luaj.Globals r0 = r0.Y
                java.io.PrintStream r0 = r0.d0
                goto L12
            Lc:
                luaj.lib.IoLib r0 = r2.R
                luaj.Globals r0 = r0.Y
                java.io.PrintStream r0 = r0.c0
            L12:
                return r0
        }

        @Override // luaj.lib.IoLib.File
        public void S2() {
                r0 = this;
                return
        }

        @Override // luaj.lib.IoLib.File
        public void U2() {
                r1 = this;
                java.io.PrintStream r0 = r1.e3()
                r0.flush()
                return
        }

        @Override // luaj.lib.IoLib.File
        public boolean V2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // luaj.lib.IoLib.File
        public boolean W2() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // luaj.lib.IoLib.File
        public int X2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // luaj.lib.IoLib.File
        public int Y2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // luaj.lib.IoLib.File
        public int Z2(byte[] r1, int r2, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // luaj.lib.IoLib.File
        public int a3() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // luaj.lib.IoLib.File
        public int b3(java.lang.String r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // luaj.lib.IoLib.File
        public void c3(java.lang.String r1, int r2) {
                r0 = this;
                return
        }

        @Override // luaj.lib.IoLib.File
        public void d3(luaj.LuaString r4) {
                r3 = this;
                java.io.PrintStream r0 = r3.e3()
                byte[] r1 = r4.P
                int r2 = r4.Q
                int r4 = r4.R
                r0.write(r1, r2, r4)
                return
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public java.lang.String g0() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "file ("
                r0.append(r1)
                int r1 = r2.hashCode()
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    class a implements luaj.lib.LibFunction.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ luaj.lib.IoLib f1767a;

        a(luaj.lib.IoLib r1) {
                r0 = this;
                r0.f1767a = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction.a
        public luaj.lib.LibFunction a() {
                r1 = this;
                luaj.lib.IoLib$IoLibV r0 = new luaj.lib.IoLib$IoLibV
                r0.<init>()
                return r0
        }
    }

    class b implements luaj.lib.LibFunction.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ luaj.lib.IoLib f1768a;

        b(luaj.lib.IoLib r1) {
                r0 = this;
                r0.f1768a = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction.a
        public luaj.lib.LibFunction a() {
                r1 = this;
                luaj.lib.IoLib$IoLibV r0 = new luaj.lib.IoLib$IoLibV
                r0.<init>()
                return r0
        }
    }

    public static final class c extends java.io.IOException {
        c(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            java.lang.String r0 = "stdout"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.IoLib.Z = r0
            java.lang.String r0 = "stderr"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.IoLib.a0 = r0
            java.lang.String r0 = "file"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.IoLib.b0 = r0
            java.lang.String r0 = "closed file"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.IoLib.c0 = r0
            java.lang.String r1 = "close"
            java.lang.String r2 = "flush"
            java.lang.String r3 = "input"
            java.lang.String r4 = "lines"
            java.lang.String r5 = "open"
            java.lang.String r6 = "output"
            java.lang.String r7 = "popen"
            java.lang.String r8 = "read"
            java.lang.String r9 = "tmpfile"
            java.lang.String r10 = "type"
            java.lang.String r11 = "write"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            luaj.lib.IoLib.d0 = r0
            java.lang.String r1 = "close"
            java.lang.String r2 = "flush"
            java.lang.String r3 = "lines"
            java.lang.String r4 = "read"
            java.lang.String r5 = "seek"
            java.lang.String r6 = "setvbuf"
            java.lang.String r7 = "write"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            luaj.lib.IoLib.e0 = r0
            return
    }

    public IoLib() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.T = r0
            r0 = 0
            r1.U = r0
            r1.V = r0
            r1.W = r0
            return
    }

    public static luaj.LuaValue A3(luaj.lib.IoLib.File r2, boolean r3, boolean r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            if (r3 == 0) goto L24
        L7:
            int r3 = r2.Y2()     // Catch: java.io.EOFException -> L19
            if (r3 < 0) goto L2e
            r1 = 10
            if (r3 == r1) goto L1e
            r1 = 13
            if (r3 == r1) goto L1b
        L15:
            r0.write(r3)     // Catch: java.io.EOFException -> L19
            goto L7
        L19:
            goto L30
        L1b:
            if (r4 == 0) goto L7
            goto L15
        L1e:
            if (r4 == 0) goto L2e
            r0.write(r3)     // Catch: java.io.EOFException -> L19
            goto L2e
        L24:
            int r3 = r2.Y2()     // Catch: java.io.EOFException -> L19
            if (r3 < 0) goto L2e
            r0.write(r3)     // Catch: java.io.EOFException -> L19
            goto L24
        L2e:
            if (r3 >= 0) goto L39
        L30:
            int r2 = r0.size()
            if (r2 != 0) goto L39
            luaj.LuaValue r2 = luaj.LuaValue.f1671c
            goto L41
        L39:
            byte[] r2 = r0.toByteArray()
            luaj.LuaString r2 = luaj.LuaString.o3(r2)
        L41:
            return r2
    }

    private luaj.lib.IoLib.File B3(boolean r3) {
            r2 = this;
            luaj.lib.IoLib$File r0 = r2.U
            if (r0 != 0) goto L9
            java.lang.String r1 = "stdin not supported"
            luaj.LuaValue.R0(r1)
        L9:
            if (r3 == 0) goto L16
            boolean r3 = r0.V2()
            if (r3 == 0) goto L16
            java.lang.String r3 = "standard input file is closed"
            luaj.LuaValue.R0(r3)
        L16:
            return r0
    }

    private static luaj.Varargs C3(luaj.lib.IoLib.File r1) {
            boolean r0 = r1.W2()
            if (r0 == 0) goto Lf
            java.lang.String r1 = "cannot close standard file"
            r0 = 1000(0x3e8, float:1.401E-42)
            luaj.Varargs r1 = t3(r1, r0)
            return r1
        Lf:
            r1.S2()
            luaj.Varargs r1 = M3()
            return r1
    }

    private luaj.lib.IoLib.File D3(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            luaj.lib.IoLib$File r1 = r0.K3(r1, r2, r3)     // Catch: java.lang.Exception -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "io error: "
            r2.append(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            luaj.LuaValue.S0(r2, r1)
            r1 = 0
            return r1
    }

    private luaj.Varargs E3(luaj.lib.IoLib.File r13, luaj.Varargs r14) {
            r12 = this;
            int r0 = r14.U()
            r1 = 0
            if (r0 != 0) goto Lc
            luaj.LuaValue r13 = y3(r13, r1)
            return r13
        Lc:
            luaj.LuaValue[] r2 = new luaj.LuaValue[r0]
            r3 = 0
        Lf:
            if (r3 >= r0) goto L93
            int r4 = r3 + 1
            luaj.LuaValue r5 = r14.v(r4)
            int r6 = r5.C2()
            r7 = 3
            if (r6 == r7) goto L7e
            r7 = 4
            if (r6 == r7) goto L22
            goto L61
        L22:
            luaj.LuaString r6 = r5.G0()
            int r7 = r6.R
            r8 = 1
            if (r7 < r8) goto L61
            byte[] r9 = r6.P
            int r6 = r6.Q
            r10 = r9[r6]
            r11 = 42
            if (r10 != r11) goto L3c
            r11 = 2
            if (r7 < r11) goto L3c
            int r6 = r6 + 1
            r10 = r9[r6]
        L3c:
            r6 = 76
            if (r10 == r6) goto L5c
            r6 = 97
            if (r10 == r6) goto L57
            r6 = 108(0x6c, float:1.51E-43)
            if (r10 == r6) goto L52
            r6 = 110(0x6e, float:1.54E-43)
            if (r10 == r6) goto L4d
            goto L61
        L4d:
            luaj.LuaValue r5 = z3(r13)
            goto L86
        L52:
            luaj.LuaValue r5 = y3(r13, r1)
            goto L86
        L57:
            luaj.LuaValue r5 = v3(r13)
            goto L86
        L5c:
            luaj.LuaValue r5 = y3(r13, r8)
            goto L86
        L61:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "invalid format: '"
            r13.append(r14)
            r13.append(r5)
            java.lang.String r14 = "'"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "read"
            luaj.LuaValue r13 = luaj.LuaValue.l0(r4, r14, r13)
            return r13
        L7e:
            int r5 = r5.y2()
            luaj.LuaValue r5 = w3(r13, r5)
        L86:
            r2[r3] = r5
            boolean r3 = r5.l1()
            if (r3 == 0) goto L90
            r3 = r4
            goto L93
        L90:
            r3 = r4
            goto Lf
        L93:
            if (r3 != 0) goto L98
            luaj.LuaValue r13 = luaj.LuaValue.f1671c
            goto L9c
        L98:
            luaj.Varargs r13 = luaj.LuaValue.P2(r2, r1, r3)
        L9c:
            return r13
    }

    private static luaj.Varargs F3(luaj.lib.IoLib.File r3, luaj.Varargs r4) {
            int r0 = r4.U()
            r1 = 1
        L5:
            if (r1 > r0) goto L11
            luaj.LuaString r2 = r4.H(r1)
            r3.d3(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return r3
    }

    private luaj.Varargs G3(luaj.lib.IoLib.File r9, boolean r10, luaj.Varargs r11) {
            r8 = this;
            int r0 = r11.U()
            r1 = 250(0xfa, float:3.5E-43)
            if (r0 <= r1) goto L29
            if (r10 == 0) goto Ld
            r9.S2()     // Catch: java.io.IOException -> Ld
        Ld:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "too many arguments: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " max = "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            luaj.LuaValue.R0(r0)
        L29:
            luaj.lib.IoLib$IoLibV r0 = new luaj.lib.IoLib$IoLibV     // Catch: java.lang.Exception -> L38
            java.lang.String r3 = "lnext"
            r4 = 18
            r1 = r0
            r2 = r9
            r5 = r8
            r6 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L38
            return r0
        L38:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "lines: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            luaj.LuaValue r9 = luaj.LuaValue.S0(r10, r9)
            return r9
    }

    private static luaj.lib.IoLib.File I3(luaj.LuaValue r1) {
            boolean r0 = r1 instanceof luaj.lib.IoLib.File
            if (r0 == 0) goto L7
            luaj.lib.IoLib$File r1 = (luaj.lib.IoLib.File) r1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    private luaj.lib.IoLib.File J3(boolean r4) {
            r3 = this;
            luaj.lib.IoLib$File r0 = r3.V
            if (r0 != 0) goto Lf
            java.lang.String r0 = "-"
            java.lang.String r1 = "w"
            r2 = 1
            luaj.lib.IoLib$File r0 = r3.D3(r2, r0, r1)
            r3.V = r0
        Lf:
            if (r4 == 0) goto L1c
            boolean r4 = r0.V2()
            if (r4 == 0) goto L1c
            java.lang.String r4 = "standard output file is closed"
            luaj.LuaValue.R0(r4)
        L1c:
            return r0
    }

    private luaj.lib.IoLib.File K3(int r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            int r0 = r10.length()
            r1 = 0
            r2 = 0
        L6:
            r3 = 43
            r4 = 1
            if (r2 >= r0) goto L2a
            char r5 = r10.charAt(r2)
            if (r2 != 0) goto L1a
            java.lang.String r6 = "rwa"
            int r6 = r6.indexOf(r5)
            if (r6 < 0) goto L1a
            goto L27
        L1a:
            if (r2 != r4) goto L1f
            if (r5 != r3) goto L1f
            goto L27
        L1f:
            if (r2 < r4) goto L26
            r3 = 98
            if (r5 != r3) goto L26
            goto L27
        L26:
            r0 = -1
        L27:
            int r2 = r2 + 1
            goto L6
        L2a:
            r2 = 2
            if (r0 > 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "invalid mode: '"
            r0.append(r5)
            r0.append(r10)
            java.lang.String r5 = "'"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "io.open"
            luaj.LuaValue.l0(r2, r5, r0)
        L48:
            if (r8 == r4) goto L64
            if (r8 == r2) goto L5f
            char r8 = r10.charAt(r1)
            int r10 = r10.indexOf(r3)
            if (r10 <= 0) goto L58
            r1 = 43
        L58:
            int r8 = r8 + r1
            char r8 = (char) r8
            luaj.lib.IoLib$File r8 = r7.H3(r9, r8)
            return r8
        L5f:
            luaj.lib.IoLib$File r8 = r7.P3()
            return r8
        L64:
            luaj.lib.IoLib$File r8 = r7.Q3()
            return r8
    }

    private void L3(luaj.LuaTable r5) {
            r4 = this;
            luaj.LuaValue[] r0 = r5.t3()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L15
            r3 = r0[r2]
            luaj.LuaValue r3 = r5.U0(r3)
            luaj.lib.IoLib$IoLibV r3 = (luaj.lib.IoLib.IoLibV) r3
            r3.U = r4
            int r2 = r2 + 1
            goto L6
        L15:
            return
    }

    private static luaj.Varargs M3() {
            luaj.LuaBoolean r0 = luaj.LuaValue.f1672d
            return r0
    }

    private luaj.lib.IoLib.File N3() {
            r5 = this;
            java.lang.String r0 = ".gg."
            java.lang.String r1 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r0, r1)
            r1 = 1
            r5.T = r1
            r1 = 0
            luaj.lib.IoLib$FileImpl r2 = new luaj.lib.IoLib$FileImpl     // Catch: java.lang.Throwable -> L1a
            r3 = 162(0xa2, float:2.27E-43)
            r4 = 0
            r2.<init>(r5, r0, r3, r4)     // Catch: java.lang.Throwable -> L1a
            r5.T = r1
            r0.delete()
            return r2
        L1a:
            r0 = move-exception
            r5.T = r1
            throw r0
    }

    private luaj.lib.IoLib.File P3() {
            r3 = this;
            luaj.lib.IoLib$StdoutFile r0 = new luaj.lib.IoLib$StdoutFile
            r1 = 2
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    private luaj.lib.IoLib.File Q3() {
            r3 = this;
            luaj.lib.IoLib$StdoutFile r0 = new luaj.lib.IoLib$StdoutFile
            r1 = 1
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    private static luaj.lib.IoLib.File q3(java.lang.String r3, luaj.LuaValue r4) {
            luaj.lib.IoLib$File r0 = I3(r4)
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "FILE* expected, got "
            r1.append(r2)
            java.lang.String r4 = r4.E2()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 1
            luaj.LuaValue.l0(r1, r3, r4)
        L1f:
            r3(r0)
            return r0
    }

    private static luaj.lib.IoLib.File r3(luaj.lib.IoLib.File r1) {
            boolean r0 = r1.V2()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "attempt to use a closed file"
            luaj.LuaValue.R0(r0)
        Lb:
            return r1
    }

    static luaj.Varargs s3(java.io.IOException r3, int r4) {
            java.lang.String r0 = r3.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "io error: "
            r1.append(r2)
            if (r0 == 0) goto L11
            goto L15
        L11:
            java.lang.String r0 = r3.toString()
        L15:
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            luaj.Varargs r3 = t3(r3, r4)
            return r3
    }

    private static luaj.Varargs t3(java.lang.String r3, int r4) {
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
            luaj.LuaString r3 = luaj.LuaValue.K2(r3)
            long r1 = (long) r4
            luaj.LuaLong r4 = luaj.LuaValue.I2(r1)
            luaj.Varargs r3 = luaj.LuaValue.M2(r0, r3, r4)
            return r3
    }

    private luaj.lib.IoLib.File u3() {
            r3 = this;
            luaj.lib.IoLib$File r0 = r3.W
            if (r0 == 0) goto L5
            goto L10
        L5:
            java.lang.String r0 = "-"
            java.lang.String r1 = "w"
            r2 = 2
            luaj.lib.IoLib$File r0 = r3.D3(r2, r0, r1)
            r3.W = r0
        L10:
            return r0
    }

    public static luaj.LuaValue v3(luaj.lib.IoLib.File r1) {
            int r0 = r1.a3()
            if (r0 < 0) goto L10
            if (r0 != 0) goto Lb
            luaj.LuaString r1 = luaj.LuaValue.L
            goto Lf
        Lb:
            luaj.LuaValue r1 = w3(r1, r0)
        Lf:
            return r1
        L10:
            r0 = 0
            luaj.LuaValue r1 = A3(r1, r0, r0)
            return r1
    }

    public static luaj.LuaValue w3(luaj.lib.IoLib.File r2, int r3) {
            if (r3 != 0) goto Le
            boolean r2 = r2.T2()
            if (r2 == 0) goto Lb
            luaj.LuaValue r2 = luaj.LuaValue.f1671c
            goto Ld
        Lb:
            luaj.LuaString r2 = luaj.LuaValue.L
        Ld:
            return r2
        Le:
            byte[] r0 = new byte[r3]
            r1 = 0
            int r2 = r2.Z2(r0, r1, r3)
            if (r2 >= 0) goto L1a
            luaj.LuaValue r2 = luaj.LuaValue.f1671c
            return r2
        L1a:
            luaj.LuaString r2 = luaj.LuaString.p3(r0, r1, r2)
            return r2
    }

    private static int x3(luaj.lib.IoLib.File r5, java.lang.String r6, java.io.ByteArrayOutputStream r7, int r8) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.X2()
            int r3 = r6.indexOf(r2)
            if (r3 >= 0) goto Ld
            return r1
        Ld:
            r5.Y2()
            int r1 = r1 + 1
            if (r7 == 0) goto L23
            int r3 = r7.size()
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 < r4) goto L20
            r7.reset()
            return r0
        L20:
            r7.write(r2)
        L23:
            if (r8 <= 0) goto L2
            if (r1 < r8) goto L2
            return r1
    }

    public static luaj.LuaValue y3(luaj.lib.IoLib.File r1, boolean r2) {
            r0 = 1
            luaj.LuaValue r1 = A3(r1, r0, r2)
            return r1
    }

    public static luaj.LuaValue z3(luaj.lib.IoLib.File r9) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.lang.String r1 = " \t\r\n"
            r2 = 0
            r3 = 0
            x3(r9, r1, r2, r3)
            java.lang.String r1 = "-+"
            r2 = 1
            x3(r9, r1, r0, r2)
            java.lang.String r4 = "0"
            int r4 = x3(r9, r4, r0, r2)
            if (r4 <= 0) goto L28
            java.lang.String r4 = "xX"
            int r4 = x3(r9, r4, r0, r2)
            if (r4 <= 0) goto L25
            r4 = 0
            r5 = 1
            goto L2a
        L25:
            r4 = 1
        L26:
            r5 = 0
            goto L2a
        L28:
            r4 = 0
            goto L26
        L2a:
            java.lang.String r6 = "0123456789abcdefABCDEF"
            java.lang.String r7 = "0123456789"
            if (r5 == 0) goto L32
            r8 = r6
            goto L33
        L32:
            r8 = r7
        L33:
            int r8 = x3(r9, r8, r0, r3)
            int r4 = r4 + r8
            java.lang.String r8 = "."
            int r8 = x3(r9, r8, r0, r2)
            if (r8 <= 0) goto L49
            if (r5 == 0) goto L43
            goto L44
        L43:
            r6 = r7
        L44:
            int r6 = x3(r9, r6, r0, r3)
            int r4 = r4 + r6
        L49:
            if (r4 <= 0) goto L5e
            if (r5 == 0) goto L50
            java.lang.String r4 = "pP"
            goto L52
        L50:
            java.lang.String r4 = "eE"
        L52:
            int r4 = x3(r9, r4, r0, r2)
            if (r4 <= 0) goto L5e
            x3(r9, r1, r0, r2)
            x3(r9, r7, r0, r3)
        L5e:
            java.lang.String r9 = r0.toString()
            int r0 = r9.length()
            if (r0 <= 0) goto L6f
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
            luaj.LuaValue r9 = luaj.LuaValue.P1(r9, r0)
            goto L71
        L6f:
            luaj.LuaValue r9 = luaj.LuaValue.f1671c
        L71:
            return r9
    }

    protected luaj.lib.IoLib.File H3(java.lang.String r3, char r4) {
            r2 = this;
            luaj.lib.IoLib$FileImpl r0 = new luaj.lib.IoLib$FileImpl
            luaj.Globals r1 = r2.Y
            java.io.File r3 = r1.R3(r3)
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    protected boolean O3(java.io.File r1, java.io.FileDescriptor r2, boolean r3) {
            r0 = this;
            boolean r1 = r0.T
            if (r1 == 0) goto L6
            r1 = 1
            return r1
        L6:
            luaj.Globals r1 = r0.Y
            luaj.lib.e r1 = r1.Z
            boolean r1 = luaj.lib.d.b(r2, r1, r3)
            return r1
    }

    public luaj.Varargs X2(luaj.LuaValue r2) {
            r1 = this;
            java.lang.String r0 = "file:close"
            luaj.lib.IoLib$File r2 = q3(r0, r2)
            luaj.Varargs r2 = C3(r2)
            return r2
    }

    public luaj.Varargs Y2(luaj.LuaValue r2) {
            r1 = this;
            java.lang.String r0 = "file:flush"
            luaj.lib.IoLib$File r2 = q3(r0, r2)
            r2.U2()
            luaj.LuaBoolean r2 = luaj.LuaValue.f1672d
            return r2
    }

    public luaj.Varargs Z2(luaj.Varargs r3) {
            r2 = this;
            luaj.LuaValue r0 = r3.w()
            java.lang.String r1 = "file:lines"
            luaj.lib.IoLib$File r0 = q3(r1, r0)
            r1 = 2
            luaj.Varargs r3 = r3.e0(r1)
            r1 = 0
            luaj.Varargs r3 = r2.G3(r0, r1, r3)
            return r3
    }

    public luaj.Varargs a3(luaj.LuaValue r2, luaj.Varargs r3) {
            r1 = this;
            java.lang.String r0 = "file:read"
            luaj.lib.IoLib$File r2 = q3(r0, r2)
            luaj.Varargs r2 = r1.E3(r2, r3)
            return r2
    }

    public luaj.Varargs b3(luaj.LuaValue r4, java.lang.String r5, int r6) {
            r3 = this;
            java.lang.String r0 = "set"
            boolean r0 = r0.equals(r5)
            java.lang.String r1 = "file:seek"
            if (r0 == 0) goto Lb
            goto L37
        Lb:
            java.lang.String r0 = "end"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L14
            goto L37
        L14:
            java.lang.String r0 = "cur"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L1d
            goto L37
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "invalid value: '"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = "'; must be one of 'set', 'cur' or 'end'"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 1
            luaj.LuaValue.l0(r2, r1, r0)
        L37:
            luaj.lib.IoLib$File r4 = q3(r1, r4)
            int r4 = r4.b3(r5, r6)
            long r4 = (long) r4
            luaj.LuaLong r4 = luaj.LuaValue.I2(r4)
            return r4
    }

    public luaj.Varargs c3(luaj.LuaValue r5, java.lang.String r6, int r7) {
            r4 = this;
            java.lang.String r0 = "no"
            boolean r0 = r0.equals(r6)
            r1 = 1
            java.lang.String r2 = "file:setvbuf"
            if (r0 == 0) goto Ld
            r7 = 1
            goto L38
        Ld:
            java.lang.String r0 = "full"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L16
            goto L38
        L16:
            java.lang.String r0 = "line"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L1f
            goto L38
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "invalid value: '"
            r0.append(r3)
            r0.append(r6)
            java.lang.String r3 = "'; must be one of 'no', 'full' or 'line'"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            luaj.LuaValue.l0(r1, r2, r0)
        L38:
            if (r7 > 0) goto L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid value '"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "'; must be positive"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 2
            luaj.LuaValue.l0(r1, r2, r0)
        L54:
            luaj.lib.IoLib$File r5 = q3(r2, r5)
            r5.c3(r6, r7)
            luaj.LuaBoolean r5 = luaj.LuaValue.f1672d
            return r5
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r5, luaj.LuaValue r6) {
            r4 = this;
            luaj.Globals r5 = r6.z0()
            r4.Y = r5
            luaj.LuaTable r5 = new luaj.LuaTable
            r5.<init>()
            luaj.lib.IoLib$a r0 = new luaj.lib.IoLib$a
            r0.<init>(r4)
            java.lang.String[] r1 = luaj.lib.IoLib.d0
            r4.V2(r5, r0, r1)
            luaj.LuaTable r0 = new luaj.LuaTable
            r0.<init>()
            r4.X = r0
            luaj.lib.IoLib$b r1 = new luaj.lib.IoLib$b
            r1.<init>(r4)
            java.lang.String[] r2 = luaj.lib.IoLib.e0
            r3 = 11
            r4.W2(r0, r1, r2, r3)
            r4.L3(r5)
            luaj.LuaTable r0 = r4.X
            r4.L3(r0)
            luaj.LuaTable r0 = r4.X
            java.lang.String r1 = "__name"
            java.lang.String r2 = "FILE*"
            r0.h2(r1, r2)
            luaj.LuaTable r0 = r4.X
            java.lang.String r1 = "__index"
            r0.i2(r1, r0)
            luaj.LuaValue r0 = luaj.lib.IoLib.Z
            r1 = 0
            luaj.lib.IoLib$File r1 = r4.J3(r1)
            r5.j2(r0, r1)
            luaj.LuaValue r0 = luaj.lib.IoLib.a0
            luaj.lib.IoLib$File r1 = r4.u3()
            r5.j2(r0, r1)
            java.lang.String r0 = "io"
            r6.i2(r0, r5)
            java.lang.String r1 = "package"
            luaj.LuaValue r2 = r6.T0(r1)
            boolean r2 = r2.l1()
            if (r2 != 0) goto L71
            luaj.LuaValue r6 = r6.T0(r1)
            java.lang.String r1 = "loaded"
            luaj.LuaValue r6 = r6.T0(r1)
            r6.i2(r0, r5)
        L71:
            return r5
    }

    public luaj.Varargs d3(luaj.LuaValue r2, luaj.Varargs r3) {
            r1 = this;
            java.lang.String r0 = "file:write"
            luaj.lib.IoLib$File r2 = q3(r0, r2)
            luaj.Varargs r2 = F3(r2, r3)
            return r2
    }

    public luaj.Varargs e3(luaj.LuaValue r2) {
            r1 = this;
            boolean r0 = r2.l1()
            if (r0 == 0) goto Lc
            r2 = 0
            luaj.lib.IoLib$File r2 = r1.J3(r2)
            goto L12
        Lc:
            java.lang.String r0 = "io.close"
            luaj.lib.IoLib$File r2 = q3(r0, r2)
        L12:
            r3(r2)
            luaj.Varargs r2 = C3(r2)
            return r2
    }

    public luaj.Varargs f3() {
            r1 = this;
            r0 = 1
            r1.J3(r0)
            luaj.lib.IoLib$File r0 = r1.V
            r0.U2()
            luaj.LuaBoolean r0 = luaj.LuaValue.f1672d
            return r0
    }

    public luaj.Varargs g3(luaj.LuaValue r3) {
            r2 = this;
            boolean r0 = r3.l1()
            if (r0 == 0) goto Lc
            r3 = 0
            luaj.lib.IoLib$File r3 = r2.B3(r3)
            goto L24
        Lc:
            boolean r0 = r3.n1()
            if (r0 == 0) goto L1e
            java.lang.String r3 = r3.B0()
            java.lang.String r0 = "r"
            r1 = 3
            luaj.lib.IoLib$File r3 = r2.D3(r1, r3, r0)
            goto L24
        L1e:
            java.lang.String r0 = "io.input"
            luaj.lib.IoLib$File r3 = q3(r0, r3)
        L24:
            r2.U = r3
            return r3
    }

    public luaj.Varargs h3(luaj.Varargs r6) {
            r5 = this;
            r0 = 0
            r1 = 1
            java.lang.String r0 = r6.Z(r1, r0)
            r2 = 0
            if (r0 != 0) goto Le
            luaj.lib.IoLib$File r3 = r5.B3(r2)
            goto L15
        Le:
            r3 = 3
            java.lang.String r4 = "r"
            luaj.lib.IoLib$File r3 = r5.D3(r3, r0, r4)
        L15:
            r3(r3)
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0 = 2
            luaj.Varargs r6 = r6.e0(r0)
            luaj.Varargs r6 = r5.G3(r3, r1, r6)
            return r6
    }

    public luaj.Varargs i3(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 3
            luaj.lib.IoLib$File r2 = r1.K3(r0, r2, r3)
            return r2
    }

    public luaj.Varargs j3(luaj.LuaValue r3) {
            r2 = this;
            boolean r0 = r3.l1()
            if (r0 == 0) goto Lc
            r3 = 0
            luaj.lib.IoLib$File r3 = r2.J3(r3)
            goto L24
        Lc:
            boolean r0 = r3.n1()
            if (r0 == 0) goto L1e
            java.lang.String r3 = r3.B0()
            java.lang.String r0 = "w"
            r1 = 3
            luaj.lib.IoLib$File r3 = r2.D3(r1, r3, r0)
            goto L24
        L1e:
            java.lang.String r0 = "io.output"
            luaj.lib.IoLib$File r3 = q3(r0, r3)
        L24:
            r2.V = r3
            return r3
    }

    public luaj.Varargs k3(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed io.popen('"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "', '"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "'): disabled by security reason"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public luaj.Varargs l3(luaj.Varargs r2) {
            r1 = this;
            r0 = 1
            r1.B3(r0)
            luaj.lib.IoLib$File r0 = r1.U
            luaj.Varargs r2 = r1.E3(r0, r2)
            return r2
    }

    public luaj.Varargs m3() {
            r1 = this;
            luaj.lib.IoLib$File r0 = r1.N3()
            return r0
    }

    public luaj.Varargs n3(luaj.LuaValue r1) {
            r0 = this;
            luaj.lib.IoLib$File r1 = I3(r1)
            if (r1 == 0) goto L12
            boolean r1 = r1.V2()
            if (r1 == 0) goto Lf
            luaj.LuaValue r1 = luaj.lib.IoLib.c0
            goto L14
        Lf:
            luaj.LuaValue r1 = luaj.lib.IoLib.b0
            goto L14
        L12:
            luaj.LuaValue r1 = luaj.LuaValue.f1671c
        L14:
            return r1
    }

    public luaj.Varargs o3(luaj.Varargs r2) {
            r1 = this;
            r0 = 1
            r1.J3(r0)
            luaj.lib.IoLib$File r0 = r1.V
            luaj.Varargs r2 = F3(r0, r2)
            return r2
    }

    public luaj.Varargs p3(luaj.LuaValue r5, boolean r6, luaj.Varargs r7) {
            r4 = this;
            luaj.lib.IoLib$File r0 = I3(r5)
            r1 = 1
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "not a file: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r2 = "lines"
            luaj.LuaValue.l0(r1, r2, r5)
        L1d:
            boolean r5 = r0.V2()
            if (r5 == 0) goto L28
            java.lang.String r5 = "file is already closed"
            luaj.LuaValue.R0(r5)
        L28:
            luaj.Varargs r5 = r4.E3(r0, r7)
            if (r6 == 0) goto L3d
            boolean r6 = r5.Q(r1)
            if (r6 == 0) goto L3d
            boolean r6 = r0.T2()
            if (r6 == 0) goto L3d
            r0.S2()
        L3d:
            return r5
    }
}
