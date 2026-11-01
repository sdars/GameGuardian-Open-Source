package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class PackageLib extends luaj.lib.TwoArgFunction {
    public static final java.lang.String Z = null;
    static final luaj.LuaString a0 = null;
    private static final luaj.LuaString b0 = null;
    static final luaj.LuaString c0 = null;
    static final luaj.LuaString d0 = null;
    static final luaj.LuaString e0 = null;
    static final luaj.LuaString f0 = null;
    static final luaj.LuaString g0 = null;
    static final java.lang.String h0 = null;
    luaj.Globals T;
    luaj.LuaTable U;
    public luaj.lib.PackageLib.preload_searcher V;
    public luaj.lib.PackageLib.lua_searcher W;
    public luaj.lib.PackageLib.java_searcher X;
    private volatile java.lang.String[] Y;

    public class java_searcher extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.PackageLib T;

        public java_searcher(luaj.lib.PackageLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r4) {
                r3 = this;
                r0 = 1
                java.lang.String r4 = r4.E(r0)
                java.lang.String r4 = luaj.lib.PackageLib.a3(r4)
                luaj.lib.PackageLib r0 = r3.T
                boolean r0 = luaj.lib.PackageLib.X2(r0, r4)
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "\n\tjava class '"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = "' not allowed"
                r0.append(r4)
            L23:
                java.lang.String r4 = r0.toString()
            L27:
                luaj.LuaString r4 = luaj.LuaValue.K2(r4)
                return r4
            L2c:
                java.lang.Class<luaj.lib.PackageLib> r0 = luaj.lib.PackageLib.class
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                r1 = 0
                java.lang.Class r0 = java.lang.Class.forName(r4, r1, r0)     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                java.lang.Class<luaj.LuaValue> r1 = luaj.LuaValue.class
                java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                luaj.LuaValue r0 = (luaj.LuaValue) r0     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                boolean r1 = r0.g1()     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                if (r1 == 0) goto L56
                r1 = r0
                luaj.LuaFunction r1 = (luaj.LuaFunction) r1     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                luaj.lib.PackageLib r2 = r3.T     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                luaj.Globals r2 = r2.T     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                r1.c1(r2)     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                goto L56
            L54:
                r0 = move-exception
                goto L5f
            L56:
                luaj.lib.PackageLib r1 = r3.T     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                luaj.Globals r1 = r1.T     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                luaj.Varargs r4 = luaj.LuaValue.N2(r0, r1)     // Catch: java.lang.Exception -> L54 java.lang.ClassNotFoundException -> L79
                return r4
            L5f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "\n\tjava load failed on '"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = "', "
                r1.append(r4)
                r1.append(r0)
                java.lang.String r4 = r1.toString()
                goto L27
            L79:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "\n\tno class '"
                r0.append(r1)
                r0.append(r4)
                r4 = 39
                r0.append(r4)
                goto L23
        }
    }

    public static class loadlib extends luaj.lib.VarArgFunction {
        public loadlib() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r3) {
                r2 = this;
                r0 = 1
                r3.H(r0)
                luaj.LuaValue r3 = luaj.LuaValue.f1671c
                java.lang.String r0 = "dynamic libraries not enabled"
                luaj.LuaString r0 = luaj.LuaValue.K2(r0)
                java.lang.String r1 = "absent"
                luaj.LuaString r1 = luaj.LuaValue.K2(r1)
                luaj.Varargs r3 = luaj.LuaValue.M2(r3, r0, r1)
                return r3
        }
    }

    public class lua_searcher extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.PackageLib T;

        public lua_searcher(luaj.lib.PackageLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r6) {
                r5 = this;
                r0 = 1
                luaj.LuaString r6 = r6.H(r0)
                luaj.lib.PackageLib r1 = r5.T
                luaj.LuaTable r1 = r1.U
                luaj.LuaString r2 = luaj.lib.PackageLib.d0
                luaj.LuaValue r1 = r1.U0(r2)
                boolean r2 = r1.n1()
                if (r2 != 0) goto L1c
                java.lang.String r6 = "\n\tpackage.path is not a string"
                luaj.LuaString r6 = luaj.LuaValue.K2(r6)
                return r6
            L1c:
                luaj.lib.PackageLib r2 = r5.T
                luaj.LuaTable r2 = r2.U
                luaj.LuaString r3 = luaj.lib.PackageLib.e0
                luaj.LuaValue r2 = r2.U0(r3)
                luaj.Varargs r6 = luaj.LuaValue.N2(r6, r1)
                luaj.Varargs r6 = r2.invoke(r6)
                boolean r1 = r6.S(r0)
                r2 = 2
                if (r1 != 0) goto L3e
                luaj.LuaValue r6 = r6.v(r2)
                luaj.LuaValue r6 = r6.B2()
                return r6
            L3e:
                luaj.LuaValue r6 = r6.w()
                luaj.LuaString r6 = r6.q2()
                java.lang.String r1 = r6.g0()
                luaj.lib.PackageLib r3 = r5.T
                luaj.Globals r3 = r3.T
                luaj.lib.BaseLib r3 = r3.g0
                r4 = 0
                r3.Y2(r4, r1, r0, r4)
                luaj.lib.PackageLib r0 = r5.T
                luaj.Globals r0 = r0.T
                luaj.LuaValue r0 = r0.Q3(r1)
                luaj.LuaValue r1 = r0.w()
                boolean r1 = r1.g1()
                if (r1 == 0) goto L6f
                luaj.LuaValue r0 = r0.w()
                luaj.Varargs r6 = luaj.LuaValue.N2(r0, r6)
                return r6
            L6f:
                luaj.LuaValue r1 = luaj.LuaValue.f1671c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "'"
                r3.append(r4)
                r3.append(r6)
                java.lang.String r6 = "': "
                r3.append(r6)
                luaj.LuaValue r6 = r0.v(r2)
                java.lang.String r6 = r6.g0()
                r3.append(r6)
                java.lang.String r6 = r3.toString()
                luaj.LuaString r6 = luaj.LuaValue.K2(r6)
                luaj.Varargs r6 = luaj.LuaValue.N2(r1, r6)
                return r6
        }
    }

    public class preload_searcher extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.PackageLib T;

        public preload_searcher(luaj.lib.PackageLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r3) {
                r2 = this;
                r0 = 1
                luaj.LuaString r3 = r3.H(r0)
                luaj.lib.PackageLib r0 = r2.T
                luaj.LuaTable r0 = r0.U
                luaj.LuaString r1 = luaj.lib.PackageLib.c0
                luaj.LuaValue r0 = r0.U0(r1)
                luaj.LuaValue r0 = r0.U0(r3)
                boolean r1 = r0.l1()
                if (r1 == 0) goto L33
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "\n\tno field package.preload['"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = "']"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                luaj.LuaString r0 = luaj.LuaValue.K2(r3)
            L33:
                return r0
        }
    }

    public class require extends luaj.lib.OneArgFunction {
        final /* synthetic */ luaj.lib.PackageLib T;

        public require(luaj.lib.PackageLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r10) {
                r9 = this;
                luaj.LuaString r10 = r10.G0()
                luaj.lib.PackageLib r0 = r9.T
                luaj.LuaTable r0 = r0.U
                luaj.LuaString r1 = luaj.lib.PackageLib.a0
                luaj.LuaValue r0 = r0.U0(r1)
                luaj.LuaValue r1 = r0.U0(r10)
                boolean r2 = r1.w2()
                if (r2 == 0) goto L36
                luaj.LuaString r0 = luaj.lib.PackageLib.g0
                if (r1 != r0) goto L35
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "loop or previous error loading module '"
                r0.append(r2)
                r0.append(r10)
                r10 = 39
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                luaj.LuaValue.R0(r10)
            L35:
                return r1
            L36:
                luaj.lib.PackageLib r1 = r9.T
                luaj.LuaTable r1 = r1.U
                luaj.LuaString r2 = luaj.lib.PackageLib.f0
                luaj.LuaValue r1 = r1.U0(r2)
                boolean r2 = r1.o1()
                if (r2 != 0) goto L4b
                java.lang.String r2 = "'package.searchers' must be a table"
                luaj.LuaValue.R0(r2)
            L4b:
                luaj.LuaTable r1 = r1.H0()
                java.lang.StringBuffer r2 = new java.lang.StringBuffer
                r2.<init>()
                r3 = 1
                r4 = 1
            L56:
                r5 = 0
                luaj.LuaValue r6 = r1.c3(r4)     // Catch: java.lang.Exception -> L81
                boolean r7 = r6.l1()     // Catch: java.lang.Exception -> L81
                if (r7 == 0) goto L83
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L81
                r7.<init>()     // Catch: java.lang.Exception -> L81
                java.lang.String r8 = "module '"
                r7.append(r8)     // Catch: java.lang.Exception -> L81
                r7.append(r10)     // Catch: java.lang.Exception -> L81
                java.lang.String r8 = "' not found: "
                r7.append(r8)     // Catch: java.lang.Exception -> L81
                r7.append(r10)     // Catch: java.lang.Exception -> L81
                r7.append(r2)     // Catch: java.lang.Exception -> L81
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L81
                luaj.LuaValue.R0(r7)     // Catch: java.lang.Exception -> L81
                goto L83
            L81:
                r0 = move-exception
                goto Lc3
            L83:
                luaj.Varargs r6 = r6.invoke(r10)     // Catch: java.lang.Exception -> L81
                boolean r7 = r6.P(r3)     // Catch: java.lang.Exception -> L81
                if (r7 == 0) goto Lb3
                luaj.LuaString r1 = luaj.lib.PackageLib.g0     // Catch: java.lang.Exception -> L81
                r0.j2(r10, r1)     // Catch: java.lang.Exception -> L81
                r2 = 2
                luaj.LuaValue r5 = r6.v(r2)     // Catch: java.lang.Exception -> L81
                luaj.LuaValue r2 = r6.w()     // Catch: java.lang.Exception -> L81
                luaj.LuaValue r2 = r2.call(r10, r5)     // Catch: java.lang.Exception -> L81
                boolean r3 = r2.l1()
                if (r3 != 0) goto La9
            La5:
                r0.j2(r10, r2)
                goto Lb2
            La9:
                luaj.LuaValue r2 = r0.U0(r10)
                if (r2 != r1) goto Lb2
                luaj.LuaBoolean r2 = luaj.LuaValue.f1672d
                goto La5
            Lb2:
                return r2
            Lb3:
                boolean r7 = r6.S(r3)     // Catch: java.lang.Exception -> L81
                if (r7 == 0) goto Lc0
                java.lang.String r6 = r6.h0(r3)     // Catch: java.lang.Exception -> L81
                r2.append(r6)     // Catch: java.lang.Exception -> L81
            Lc0:
                int r4 = r4 + 1
                goto L56
            Lc3:
                boolean r1 = r0 instanceof luaj.d
                if (r1 == 0) goto L103
                r1 = r0
                luaj.d r1 = (luaj.d) r1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "error loading module '"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r10 = "'"
                r2.append(r10)
                if (r5 != 0) goto Le1
                java.lang.String r10 = ""
                goto Lf5
            Le1:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = " from file '"
                r3.append(r4)
                r3.append(r5)
                r3.append(r10)
                java.lang.String r10 = r3.toString()
            Lf5:
                r2.append(r10)
                java.lang.String r10 = ":\n"
                r2.append(r10)
                java.lang.String r10 = r2.toString()
                r1.i = r10
            L103:
                throw r0
        }
    }

    public class searchpath extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.PackageLib T;

        public searchpath(luaj.lib.PackageLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r8) {
                r7 = this;
                r0 = 1
                java.lang.String r0 = r8.E(r0)
                r1 = 2
                java.lang.String r1 = r8.E(r1)
                r2 = 3
                java.lang.String r3 = "."
                java.lang.String r2 = r8.Z(r2, r3)
                r3 = 4
                java.lang.String r4 = luaj.lib.PackageLib.h0
                java.lang.String r8 = r8.Z(r3, r4)
                int r3 = r1.length()
                int r4 = r2.length()
                r5 = -1
                r6 = 0
                if (r4 <= 0) goto L28
                java.lang.String r0 = r0.replace(r2, r8)
            L28:
                if (r5 >= r3) goto L74
                int r5 = r5 + 1
                r8 = 59
                int r8 = r1.indexOf(r8, r5)
                if (r8 >= 0) goto L38
                int r8 = r1.length()
            L38:
                java.lang.String r2 = r1.substring(r5, r8)
                java.lang.String r4 = "?"
                java.lang.String r2 = r2.replace(r4, r0)
                luaj.lib.PackageLib r4 = r7.T
                luaj.Globals r4 = r4.T
                luaj.lib.f r4 = r4.e0
                java.io.InputStream r4 = r4.u(r2)
                if (r4 == 0) goto L56
                r4.close()     // Catch: java.io.IOException -> L51
            L51:
                luaj.LuaString r8 = luaj.LuaValue.K2(r2)
                return r8
            L56:
                if (r6 != 0) goto L5e
                java.lang.StringBuffer r4 = new java.lang.StringBuffer
                r4.<init>()
                r6 = r4
            L5e:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "\n\t"
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r6.append(r2)
                r5 = r8
                goto L28
            L74:
                luaj.LuaValue r8 = luaj.LuaValue.f1671c
                java.lang.String r0 = r6.toString()
                luaj.LuaString r0 = luaj.LuaValue.K2(r0)
                luaj.Varargs r8 = luaj.LuaValue.N2(r8, r0)
                return r8
        }
    }

    static {
            java.lang.String r0 = "luaj.package.path"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> L7
            goto L12
        L7:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r0 = r0.toString()
            r1.println(r0)
            r0 = 0
        L12:
            if (r0 != 0) goto L16
            java.lang.String r0 = "?.lua"
        L16:
            luaj.lib.PackageLib.Z = r0
            java.lang.String r0 = "loaded"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.PackageLib.a0 = r0
            java.lang.String r0 = "loadlib"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.PackageLib.b0 = r0
            java.lang.String r0 = "preload"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.PackageLib.c0 = r0
            java.lang.String r0 = "path"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.PackageLib.d0 = r0
            java.lang.String r0 = "searchpath"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.PackageLib.e0 = r0
            java.lang.String r0 = "searchers"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.PackageLib.f0 = r0
            java.lang.String r0 = "\u0001"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.PackageLib.g0 = r0
            java.lang.String r0 = "file.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            luaj.lib.PackageLib.h0 = r0
            return
    }

    public PackageLib() {
            r1 = this;
            r1.<init>()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.Y = r0
            return
    }

    static /* synthetic */ boolean X2(luaj.lib.PackageLib r0, java.lang.String r1) {
            boolean r0 = r0.Z2(r1)
            return r0
    }

    private static final boolean Y2(char r2) {
            r0 = 97
            r1 = 1
            if (r2 < r0) goto L9
            r0 = 122(0x7a, float:1.71E-43)
            if (r2 <= r0) goto L19
        L9:
            r0 = 65
            if (r2 < r0) goto L11
            r0 = 90
            if (r2 <= r0) goto L19
        L11:
            r0 = 48
            if (r2 < r0) goto L1a
            r0 = 57
            if (r2 > r0) goto L1a
        L19:
            return r1
        L1a:
            r0 = 36
            if (r2 == r0) goto L28
            r0 = 46
            if (r2 == r0) goto L28
            r0 = 95
            if (r2 == r0) goto L28
            r2 = 0
            return r2
        L28:
            return r1
    }

    private boolean Z2(java.lang.String r6) {
            r5 = this;
            java.lang.String[] r0 = r5.Y
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L14
            r4 = r0[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L11
            r6 = 1
            return r6
        L11:
            int r3 = r3 + 1
            goto L5
        L14:
            return r2
    }

    public static final java.lang.String a3(java.lang.String r8) {
            int r0 = r8.length()
            java.lang.String r1 = ".lua"
            boolean r1 = r8.endsWith(r1)
            if (r1 == 0) goto Lf
            int r1 = r0 + (-4)
            goto L10
        Lf:
            r1 = r0
        L10:
            r2 = 0
            r3 = 0
        L12:
            if (r3 >= r1) goto L51
            char r4 = r8.charAt(r3)
            boolean r5 = Y2(r4)
            r6 = 92
            r7 = 47
            if (r5 == 0) goto L2a
            if (r4 == r7) goto L2a
            if (r4 != r6) goto L27
            goto L2a
        L27:
            int r3 = r3 + 1
            goto L12
        L2a:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>(r1)
        L2f:
            if (r2 >= r1) goto L4c
            char r3 = r8.charAt(r2)
            boolean r4 = Y2(r3)
            if (r4 == 0) goto L3c
            goto L46
        L3c:
            if (r3 == r7) goto L44
            if (r3 != r6) goto L41
            goto L44
        L41:
            r3 = 95
            goto L46
        L44:
            r3 = 46
        L46:
            r0.append(r3)
            int r2 = r2 + 1
            goto L2f
        L4c:
            java.lang.String r8 = r0.toString()
            return r8
        L51:
            if (r0 != r1) goto L54
            goto L58
        L54:
            java.lang.String r8 = r8.substring(r2, r1)
        L58:
            return r8
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r4, luaj.LuaValue r5) {
            r3 = this;
            luaj.Globals r4 = r5.z0()
            r3.T = r4
            luaj.lib.PackageLib$require r0 = new luaj.lib.PackageLib$require
            r0.<init>(r3)
            java.lang.String r1 = "require"
            r4.i2(r1, r0)
            luaj.LuaTable r4 = new luaj.LuaTable
            r4.<init>()
            r3.U = r4
            luaj.LuaString r0 = luaj.lib.PackageLib.a0
            luaj.LuaTable r1 = new luaj.LuaTable
            r1.<init>()
            r4.j2(r0, r1)
            luaj.LuaTable r4 = r3.U
            luaj.LuaString r1 = luaj.lib.PackageLib.c0
            luaj.LuaTable r2 = new luaj.LuaTable
            r2.<init>()
            r4.j2(r1, r2)
            luaj.LuaTable r4 = r3.U
            luaj.LuaString r1 = luaj.lib.PackageLib.d0
            java.lang.String r2 = luaj.lib.PackageLib.Z
            luaj.LuaString r2 = luaj.LuaValue.K2(r2)
            r4.j2(r1, r2)
            luaj.LuaTable r4 = r3.U
            luaj.LuaString r1 = luaj.lib.PackageLib.b0
            luaj.lib.PackageLib$loadlib r2 = new luaj.lib.PackageLib$loadlib
            r2.<init>()
            r4.j2(r1, r2)
            luaj.LuaTable r4 = r3.U
            luaj.LuaString r1 = luaj.lib.PackageLib.e0
            luaj.lib.PackageLib$searchpath r2 = new luaj.lib.PackageLib$searchpath
            r2.<init>(r3)
            r4.j2(r1, r2)
            luaj.LuaTable r4 = new luaj.LuaTable
            r4.<init>()
            luaj.lib.PackageLib$preload_searcher r1 = new luaj.lib.PackageLib$preload_searcher
            r1.<init>(r3)
            r3.V = r1
            r2 = 1
            r4.e2(r2, r1)
            luaj.lib.PackageLib$lua_searcher r1 = new luaj.lib.PackageLib$lua_searcher
            r1.<init>(r3)
            r3.W = r1
            r2 = 2
            r4.e2(r2, r1)
            luaj.lib.PackageLib$java_searcher r1 = new luaj.lib.PackageLib$java_searcher
            r1.<init>(r3)
            r3.X = r1
            r2 = 3
            r4.e2(r2, r1)
            luaj.LuaTable r1 = r3.U
            luaj.LuaString r2 = luaj.lib.PackageLib.f0
            r1.j2(r2, r4)
            luaj.LuaTable r4 = r3.U
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = luaj.lib.PackageLib.h0
            r1.append(r2)
            java.lang.String r2 = "\n;\n?\n!\n-\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "config"
            r4.h2(r2, r1)
            luaj.LuaTable r4 = r3.U
            luaj.LuaValue r4 = r4.U0(r0)
            luaj.LuaTable r0 = r3.U
            java.lang.String r1 = "package"
            r4.i2(r1, r0)
            luaj.LuaTable r4 = r3.U
            r5.i2(r1, r4)
            luaj.Globals r4 = r3.T
            r4.h0 = r3
            return r5
    }

    @Override // luaj.lib.LibFunction, luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
            r1 = this;
            java.lang.String r0 = "package"
            return r0
    }
}
