package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public final class GgLib$saveVariable extends luaj.lib.VarArgFunction {
    static final java.lang.String[] Y = null;
    final luaj.Globals T;
    java.io.Writer U;
    java.util.Map V;
    java.util.List W;
    final java.lang.Integer X;

    private final class a extends java.io.OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.io.RandomAccessFile f1765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ luaj.lib.GgLib$saveVariable f1766b;

        a(luaj.lib.GgLib$saveVariable r1, java.io.RandomAccessFile r2) {
                r0 = this;
                r0.f1766b = r1
                r0.<init>()
                r0.f1765a = r2
                return
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                java.io.RandomAccessFile r0 = r1.f1765a
                r0.close()
                return
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
                r0 = this;
                return
        }

        @Override // java.io.OutputStream
        public void write(int r4) {
                r3 = this;
                luaj.lib.GgLib$saveVariable r0 = r3.f1766b
                luaj.Globals r0 = r0.T
                r1 = 1
                r0.M3(r1)
                java.io.RandomAccessFile r0 = r3.f1765a
                r0.write(r4)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r4) {
                r3 = this;
                luaj.lib.GgLib$saveVariable r0 = r3.f1766b
                luaj.Globals r0 = r0.T
                int r1 = r4.length
                long r1 = (long) r1
                r0.M3(r1)
                java.io.RandomAccessFile r0 = r3.f1765a
                r0.write(r4)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r4, int r5, int r6) {
                r3 = this;
                luaj.lib.GgLib$saveVariable r0 = r3.f1766b
                luaj.Globals r0 = r0.T
                long r1 = (long) r6
                r0.M3(r1)
                java.io.RandomAccessFile r0 = r3.f1765a
                r0.write(r4, r5, r6)
                return
        }
    }

    static {
            java.lang.String r0 = "address"
            java.lang.String r1 = "value"
            java.lang.String r2 = "flags"
            java.lang.String r3 = "name"
            java.lang.String r4 = "freeze"
            java.lang.String r5 = "freezeType"
            java.lang.String r6 = "freezeFrom"
            java.lang.String r7 = "freezeTo"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            luaj.lib.GgLib$saveVariable.Y = r0
            return
    }

    public GgLib$saveVariable(luaj.Globals r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.X = r0
            r1.T = r2
            return
    }

    private void X2(luaj.LuaTable r4) {
            r3 = this;
            java.util.Map r0 = r3.V
            java.lang.Integer r1 = r3.X
            java.lang.Object r0 = r0.put(r4, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L35
            boolean r0 = r4 instanceof luaj.LuaTable
            if (r0 == 0) goto L35
            luaj.LuaTable$i r4 = r4.s3()
        L14:
            boolean r0 = r4.c()
            if (r0 == 0) goto L35
            r0 = 0
        L1b:
            r1 = 2
            if (r0 >= r1) goto L14
            if (r0 != 0) goto L25
            luaj.LuaValue r1 = r4.b()
            goto L29
        L25:
            luaj.LuaValue r1 = r4.d()
        L29:
            boolean r2 = r1 instanceof luaj.LuaTable
            if (r2 == 0) goto L32
            luaj.LuaTable r1 = (luaj.LuaTable) r1
            r3.X2(r1)
        L32:
            int r0 = r0 + 1
            goto L1b
        L35:
            return
    }

    private void Y2() {
            r12 = this;
            java.lang.String[] r0 = luaj.lib.GgLib$saveVariable.Y
            java.io.Writer r1 = r12.U
            java.util.List r2 = r12.W
            java.util.Map r3 = r12.V
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r5 = 0
        Le:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L75
            java.lang.Object r6 = r2.next()
            luaj.LuaTable r6 = (luaj.LuaTable) r6
            r7 = 1
            int r5 = r5 + r7
            luaj.LuaTable$i r6 = r6.s3()
        L20:
            boolean r8 = r6.c()
            if (r8 == 0) goto Le
            int r8 = r6.a()
            luaj.LuaValue r9 = r6.d()
            boolean r10 = r9 instanceof luaj.LuaTable
            if (r10 != 0) goto L3e
            if (r8 == 0) goto L35
            goto L20
        L35:
            luaj.LuaValue r10 = r6.b()
            boolean r11 = r10 instanceof luaj.LuaTable
            if (r11 != 0) goto L46
            goto L20
        L3e:
            if (r8 == 0) goto L42
            r10 = 0
            goto L46
        L42:
            luaj.LuaValue r10 = r6.b()
        L46:
            if (r7 == 0) goto L5a
            java.lang.String r7 = "\nt=v["
            r1.write(r7)
            java.lang.String r7 = java.lang.Integer.toString(r5)
            r1.write(r7)
            r7 = 93
            r1.write(r7)
            r7 = 0
        L5a:
            java.lang.String r11 = "\nt["
            r1.write(r11)
            if (r10 != 0) goto L69
            java.lang.String r8 = java.lang.Integer.toString(r8)
            r1.write(r8)
            goto L6c
        L69:
            r12.a3(r1, r0, r3, r10)
        L6c:
            java.lang.String r8 = "]="
            r1.write(r8)
            r12.a3(r1, r0, r3, r9)
            goto L20
        L75:
            return
    }

    private void Z2() {
            r11 = this;
            java.lang.String[] r0 = luaj.lib.GgLib$saveVariable.Y
            java.io.Writer r1 = r11.U
            java.lang.String r2 = "local "
            r1.write(r2)
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L20
            java.io.Writer r4 = r11.U
            int r5 = r3 + 97
            char r5 = (char) r5
            r4.write(r5)
            java.io.Writer r4 = r11.U
            r5 = 44
            r4.write(r5)
            int r3 = r3 + 1
            goto Lc
        L20:
            java.io.Writer r1 = r11.U
            java.lang.String r3 = "v,t="
            r1.write(r3)
            int r1 = r0.length
            r3 = 0
        L29:
            if (r3 >= r1) goto L43
            java.io.Writer r4 = r11.U
            r5 = 39
            r4.write(r5)
            java.io.Writer r4 = r11.U
            r5 = r0[r3]
            r4.write(r5)
            java.io.Writer r4 = r11.U
            java.lang.String r5 = "',"
            r4.write(r5)
            int r3 = r3 + 1
            goto L29
        L43:
            java.io.Writer r1 = r11.U
            java.lang.String r3 = "nil\nv={"
            r1.write(r3)
            java.io.Writer r1 = r11.U
            java.util.Map r3 = r11.V
            java.util.List r4 = r11.W
            java.util.Iterator r4 = r4.iterator()
        L54:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lc1
            java.lang.Object r5 = r4.next()
            luaj.LuaTable r5 = (luaj.LuaTable) r5
            r6 = 1
            int r2 = r2 + r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r3.put(r5, r7)
            java.lang.String r7 = "{"
            r1.write(r7)
            luaj.LuaTable$i r5 = r5.s3()
        L72:
            boolean r7 = r5.c()
            if (r7 == 0) goto Lbb
            int r7 = r5.a()
            java.lang.String r8 = "]="
            java.lang.String r9 = "["
            if (r7 != 0) goto L95
            luaj.LuaValue r7 = r5.b()
            boolean r10 = r7 instanceof luaj.LuaTable
            if (r10 == 0) goto L8b
            goto L72
        L8b:
            r1.write(r9)
            r11.a3(r1, r0, r3, r7)
        L91:
            r1.write(r8)
            goto La4
        L95:
            if (r7 == r6) goto La2
            r1.write(r9)
            java.lang.String r7 = java.lang.Integer.toString(r7)
            r1.write(r7)
            goto L91
        La2:
            int r6 = r6 + 1
        La4:
            luaj.LuaValue r7 = r5.d()
            boolean r8 = r7 instanceof luaj.LuaTable
            if (r8 == 0) goto Lb2
            java.lang.String r7 = "nil"
            r1.write(r7)
            goto Lb5
        Lb2:
            r11.a3(r1, r0, r3, r7)
        Lb5:
            java.lang.String r7 = ";"
            r1.write(r7)
            goto L72
        Lbb:
            java.lang.String r5 = "};"
            r1.write(r5)
            goto L54
        Lc1:
            java.lang.String r0 = "}"
            r1.write(r0)
            return
    }

    private void a3(java.io.Writer r3, java.lang.String[] r4, java.util.Map r5, luaj.LuaValue r6) {
            r2 = this;
            boolean r0 = r6 instanceof luaj.LuaTable
            if (r0 == 0) goto L20
            java.lang.String r4 = "v["
            r3.write(r4)
            java.lang.Object r4 = r5.get(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r3.write(r4)
            r4 = 93
            r3.write(r4)
            goto L48
        L20:
            boolean r5 = r6 instanceof luaj.LuaString
            if (r5 == 0) goto L41
            java.lang.String r5 = r6.g0()
            int r6 = r4.length
            r0 = 0
        L2a:
            if (r0 >= r6) goto L3d
            r1 = r4[r0]
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L3a
            int r0 = r0 + 97
            r3.write(r0)
            return
        L3a:
            int r0 = r0 + 1
            goto L2a
        L3d:
            r2.b3(r3, r5)
            goto L48
        L41:
            java.lang.String r4 = r6.g0()
            r3.write(r4)
        L48:
            return
    }

    private java.lang.Appendable b3(java.lang.Appendable r6, java.lang.String r7) {
            r5 = this;
            if (r6 != 0) goto L7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
        L7:
            r0 = 39
            r6.append(r0)
            int r1 = r7.length()
            r2 = 0
        L11:
            if (r2 >= r1) goto L3f
            char r3 = r7.charAt(r2)
            r4 = 92
            if (r3 == r0) goto L38
            if (r3 == r4) goto L38
            switch(r3) {
                case 7: goto L36;
                case 8: goto L33;
                case 9: goto L30;
                case 10: goto L2d;
                case 11: goto L2a;
                case 12: goto L27;
                case 13: goto L24;
                default: goto L20;
            }
        L20:
            r6.append(r3)
            goto L3c
        L24:
            r3 = 114(0x72, float:1.6E-43)
            goto L38
        L27:
            r3 = 102(0x66, float:1.43E-43)
            goto L38
        L2a:
            r3 = 118(0x76, float:1.65E-43)
            goto L38
        L2d:
            r3 = 110(0x6e, float:1.54E-43)
            goto L38
        L30:
            r3 = 116(0x74, float:1.63E-43)
            goto L38
        L33:
            r3 = 98
            goto L38
        L36:
            r3 = 97
        L38:
            r6.append(r4)
            goto L20
        L3c:
            int r2 = r2 + 1
            goto L11
        L3f:
            r6.append(r0)
            return r6
    }

    private void c3(luaj.LuaValue r5, java.io.RandomAccessFile r6) {
            r4 = this;
            r0 = 0
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L5a
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L5a
            luaj.lib.GgLib$saveVariable$a r3 = new luaj.lib.GgLib$saveVariable$a     // Catch: java.lang.Throwable -> L5a
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5a
            r6 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> L5a
            r4.U = r1     // Catch: java.lang.Throwable -> L5a
            boolean r6 = r5 instanceof luaj.LuaTable     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L5c
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            r4.V = r6     // Catch: java.lang.Throwable -> L5a
            r6 = r5
            luaj.LuaTable r6 = (luaj.LuaTable) r6     // Catch: java.lang.Throwable -> L5a
            r4.X2(r6)     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5a
            java.util.Map r2 = r4.V     // Catch: java.lang.Throwable -> L5a
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L5a
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5a
            r4.W = r6     // Catch: java.lang.Throwable -> L5a
            r4.Z2()     // Catch: java.lang.Throwable -> L5a
            r4.Y2()     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "\nreturn v["
            r6.append(r2)     // Catch: java.lang.Throwable -> L5a
            java.util.Map r2 = r4.V     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r5 = r2.get(r5)     // Catch: java.lang.Throwable -> L5a
            r6.append(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = "]\n"
            r6.append(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r1.write(r5)     // Catch: java.lang.Throwable -> L5a
            r4.V = r0     // Catch: java.lang.Throwable -> L5a
            goto L7d
        L5a:
            r5 = move-exception
            goto L87
        L5c:
            boolean r6 = r5 instanceof luaj.LuaString     // Catch: java.lang.Throwable -> L5a
            r2 = 10
            java.lang.String r3 = "return "
            if (r6 == 0) goto L72
            r1.write(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r5.g0()     // Catch: java.lang.Throwable -> L5a
            r4.b3(r1, r5)     // Catch: java.lang.Throwable -> L5a
        L6e:
            r1.write(r2)     // Catch: java.lang.Throwable -> L5a
            goto L7d
        L72:
            r1.write(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r5.g0()     // Catch: java.lang.Throwable -> L5a
            r1.write(r5)     // Catch: java.lang.Throwable -> L5a
            goto L6e
        L7d:
            r1.close()     // Catch: java.lang.Throwable -> L5a
            r4.U = r0
            r4.V = r0
            r4.W = r0
            return
        L87:
            r4.U = r0
            r4.V = r0
            r4.W = r0
            throw r5
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.Varargs invoke(luaj.Varargs r4) {
            r3 = this;
            r0 = 1
            luaj.LuaValue r0 = r4.v(r0)
            r1 = 2
            java.lang.String r4 = r4.E(r1)
            luaj.Globals r1 = r3.T
            r1.L3(r4)
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L3e
            r1.<init>(r4)     // Catch: java.io.IOException -> L3e
            luaj.Globals r2 = r3.T     // Catch: java.io.IOException -> L3e
            luaj.lib.e r2 = r2.Z     // Catch: java.io.IOException -> L3e
            java.io.RandomAccessFile r1 = luaj.lib.d.f(r1, r2)     // Catch: java.io.IOException -> L3e
            if (r1 != 0) goto L40
            luaj.Globals r0 = r3.T     // Catch: java.io.IOException -> L3e
            r0.S3()     // Catch: java.io.IOException -> L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L3e
            r0.<init>()     // Catch: java.io.IOException -> L3e
            java.lang.String r1 = "File '"
            r0.append(r1)     // Catch: java.io.IOException -> L3e
            r0.append(r4)     // Catch: java.io.IOException -> L3e
            java.lang.String r4 = "' can not be written"
            r0.append(r4)     // Catch: java.io.IOException -> L3e
            java.lang.String r4 = r0.toString()     // Catch: java.io.IOException -> L3e
            luaj.LuaString r4 = luaj.LuaValue.K2(r4)     // Catch: java.io.IOException -> L3e
            return r4
        L3e:
            r4 = move-exception
            goto L6a
        L40:
            r3.c3(r0, r1)     // Catch: java.lang.Throwable -> L4e
            r1.close()     // Catch: java.io.IOException -> L46
        L46:
            luaj.Globals r4 = r3.T
            r4.S3()
            luaj.LuaValue r4 = luaj.LuaValue.f1671c
            return r4
        L4e:
            r4 = move-exception
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L60
            luaj.LuaString r4 = luaj.LuaValue.K2(r4)     // Catch: java.lang.Throwable -> L60
            r1.close()     // Catch: java.io.IOException -> L5a
        L5a:
            luaj.Globals r0 = r3.T
            r0.S3()
            return r4
        L60:
            r4 = move-exception
            r1.close()     // Catch: java.io.IOException -> L64
        L64:
            luaj.Globals r0 = r3.T
            r0.S3()
            throw r4
        L6a:
            luaj.Globals r0 = r3.T
            r0.S3()
            java.lang.String r4 = r4.toString()
            luaj.LuaString r4 = luaj.LuaValue.K2(r4)
            return r4
    }
}
