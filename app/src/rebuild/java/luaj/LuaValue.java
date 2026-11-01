package luaj;

/* JADX INFO: loaded from: classes.dex */
public abstract class LuaValue extends Varargs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f1672b = {"nil", "boolean", "lightuserdata", "number", "string", "table", "function", "userdata", "thread", "value"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LuaValue f1673c = new LuaNil();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LuaBoolean f1674d = new LuaBoolean(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LuaBoolean f1675e = new LuaBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LuaValue f1676f = new None();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LuaNumber f1677g = LuaLong.I2(0);
    public static final LuaNumber h = LuaLong.I2(1);
    public static final LuaNumber i = LuaLong.I2(-1);
    public static final LuaValue[] j = new LuaValue[0];
    public static final LuaString k = LuaString.i3("_ENV");
    public static final LuaString l = LuaString.i3("__index");
    public static final LuaString m = LuaString.i3("__newindex");
    public static final LuaString n = LuaString.i3("__call");
    public static final LuaString o = LuaString.i3("__mode");
    public static final LuaString p = LuaString.i3("__metatable");
    public static final LuaString q = LuaString.i3("__add");
    public static final LuaString r = LuaString.i3("__sub");
    public static final LuaString s = LuaString.i3("__div");
    public static final LuaString t = LuaString.i3("__mul");
    public static final LuaString u = LuaString.i3("__pow");
    public static final LuaString v = LuaString.i3("__mod");
    public static final LuaString w = LuaString.i3("__unm");
    public static final LuaString x = LuaString.i3("__len");
    public static final LuaString y = LuaString.i3("__eq");
    public static final LuaString z = LuaString.i3("__lt");
    public static final LuaString A = LuaString.i3("__le");
    public static final LuaString B = LuaString.i3("__tostring");
    public static final LuaString C = LuaString.i3("__concat");
    public static final LuaString D = LuaString.i3("__idiv");
    public static final LuaString E = LuaString.i3("__bnot");
    public static final LuaString F = LuaString.i3("__band");
    public static final LuaString G = LuaString.i3("__bor");
    public static final LuaString H = LuaString.i3("__bxor");
    public static final LuaString I = LuaString.i3("__shl");
    public static final LuaString J = LuaString.i3("__shr");
    public static final LuaString K = LuaString.i3("__name");
    public static final LuaString L = LuaString.i3("");
    public static final LuaString M = LuaString.i3("0");
    public static final LuaString N = LuaString.i3("1");
    public static final LuaValue[] O = new LuaValue[250];

    private static final class None extends LuaNil {
        private None() {
        }

        @Override // luaj.Varargs
        void L(LuaValue[] luaValueArr, int i, int i2) {
            while (i2 > 0) {
                luaValueArr[i] = LuaValue.f1673c;
                i2--;
                i++;
            }
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public int U() {
            return 0;
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public Varargs e0(int i) {
            return i > 0 ? this : LuaValue.k0(1, "start must be > 0");
        }

        @Override // luaj.LuaNil, luaj.LuaValue, luaj.Varargs
        public String g0() {
            return "none";
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public LuaValue v(int i) {
            return LuaValue.f1673c;
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public LuaValue w() {
            return LuaValue.f1673c;
        }
    }

    static {
        for (int i2 = 0; i2 < 250; i2++) {
            O[i2] = f1673c;
        }
    }

    public static LuaNumber C1(String str) {
        if (str.length() <= 20 && str.indexOf(46) == -1 && str.indexOf(101) == -1 && str.indexOf(69) == -1) {
            try {
                return LuaLong.I2(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
        return LuaDouble.J2(Double.parseDouble(str));
    }

    public static LuaBoolean H2(boolean z2) {
        return z2 ? f1674d : f1675e;
    }

    public static LuaLong I2(long j2) {
        return LuaLong.I2(j2);
    }

    public static LuaNumber J2(double d2) {
        return LuaDouble.J2(d2);
    }

    public static LuaString K2(String str) {
        return LuaString.K2(str);
    }

    public static LuaString L2(byte[] bArr, int i2, int i3) {
        return LuaString.L2(bArr, i2, i3);
    }

    public static Varargs M2(LuaValue luaValue, LuaValue luaValue2, Varargs varargs) {
        return varargs.U() != 0 ? new Varargs.a(new LuaValue[]{luaValue, luaValue2}, 0, 2, varargs) : new Varargs.c(luaValue, luaValue2);
    }

    public static LuaValue N1(CharSequence charSequence) {
        char cCharAt;
        boolean z2;
        char cCharAt2;
        char cCharAt3;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && ggg.g.P0(charSequence.charAt(i2))) {
            i2++;
        }
        double d2 = 1.0d;
        if (i2 < length && ((cCharAt3 = charSequence.charAt(i2)) == '-' || cCharAt3 == '+')) {
            d2 = cCharAt3 == '-' ? -1.0d : 1.0d;
            i2++;
        }
        if (i2 + 2 >= length) {
            return null;
        }
        int i3 = i2 + 1;
        if (charSequence.charAt(i2) != '0') {
            return null;
        }
        char cCharAt4 = charSequence.charAt(i3);
        if (cCharAt4 != 'x' && cCharAt4 != 'X') {
            return null;
        }
        int i4 = i2 + 2;
        double d3 = 0.0d;
        long j2 = 0;
        double dH0 = 0.0d;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            char cCharAt5 = charSequence.charAt(i4);
            if (!ggg.g.Q0(cCharAt5)) {
                break;
            }
            int iH0 = ggg.g.H0(cCharAt5);
            if (i5 != 0 || iH0 != 0) {
                if (i5 < 30) {
                    dH0 = (dH0 * 16.0d) + ((double) iH0);
                } else {
                    i6 += 4;
                }
                j2 = (j2 * 16) + ((long) iH0);
                i5++;
            }
            i4++;
        }
        if (i4 < length && charSequence.charAt(i4) == '.') {
            i5 += 8388608;
            i4++;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MAX_VALUE;
            while (i4 < length) {
                char cCharAt6 = charSequence.charAt(i4);
                if (!ggg.g.Q0(cCharAt6)) {
                    break;
                }
                if (i8 == i7 && dH0 != d3) {
                    i8 = i4 + 30;
                }
                if (i4 < i8) {
                    dH0 = (dH0 * 16.0d) + ((double) ggg.g.H0(cCharAt6));
                    i6 -= 4;
                    i5++;
                }
                i4++;
                i7 = Integer.MAX_VALUE;
                d3 = 0.0d;
            }
        }
        if ((8388607 & i5) == 0) {
            return null;
        }
        if (i4 < length && ((cCharAt = charSequence.charAt(i4)) == 'p' || cCharAt == 'P')) {
            i5 += 16777216;
            int i9 = i4 + 1;
            if (i9 >= length || !((cCharAt2 = charSequence.charAt(i9)) == '-' || cCharAt2 == '+')) {
                z2 = false;
            } else {
                i9 = i4 + 2;
                z2 = cCharAt2 == '-';
            }
            int i10 = i9;
            int i11 = 0;
            boolean z3 = false;
            while (i10 < length) {
                char cCharAt7 = charSequence.charAt(i10);
                if (!ggg.g.O0(cCharAt7)) {
                    break;
                }
                i11 = ((i11 * 10) + cCharAt7) - 48;
                i10++;
                z3 = true;
            }
            if (!z3) {
                return null;
            }
            if (z2) {
                i11 = -i11;
            }
            i6 += i11;
            i4 = i10;
        }
        while (i4 < length && ggg.g.P0(charSequence.charAt(i4))) {
            i4++;
        }
        if (i4 != length) {
            return null;
        }
        if (i5 >= 8388608) {
            return J2(d2 * dH0 * Math.pow(2.0d, i6));
        }
        if (d2 <= 0.0d) {
            j2 = -j2;
        }
        return LuaLong.I2(j2);
    }

    public static Varargs N2(LuaValue luaValue, Varargs varargs) {
        return varargs.U() != 0 ? new Varargs.c(luaValue, varargs) : luaValue;
    }

    public static LuaValue O1(String str) {
        return (str.indexOf(120) >= 0 || str.indexOf(88) >= 0) ? N1(str) : C1(str.trim());
    }

    public static Varargs O2(LuaValue[] luaValueArr) {
        int length = luaValueArr.length;
        if (length == 0) {
            return f1676f;
        }
        if (length != 1) {
            return length != 2 ? new Varargs.b(luaValueArr, f1676f) : new Varargs.c(luaValueArr[0], luaValueArr[1]);
        }
        return luaValueArr[0];
    }

    public static LuaValue P1(String str, LuaValue luaValue) {
        LuaValue luaValueO1;
        try {
            luaValueO1 = O1(str);
        } catch (NumberFormatException unused) {
            luaValueO1 = null;
        }
        return luaValueO1 == null ? luaValue : luaValueO1;
    }

    public static Varargs P2(LuaValue[] luaValueArr, int i2, int i3) {
        if (i3 == 0) {
            return f1676f;
        }
        if (i3 != 1) {
            return i3 != 2 ? new Varargs.a(luaValueArr, i2, i3, f1676f) : new Varargs.c(luaValueArr[i2], luaValueArr[i2 + 1]);
        }
        return luaValueArr[i2];
    }

    public static final boolean Q0(LuaValue luaValue, LuaValue luaValue2) {
        LuaValue luaValueV0;
        LuaValue luaValueV1 = f1673c;
        LuaValue luaValueV2 = luaValue.V0();
        if (luaValueV2 != null) {
            luaValueV1 = luaValueV2.V1(y);
        }
        if (luaValueV1.l1() && (luaValueV0 = luaValue2.V0()) != null) {
            luaValueV1 = luaValueV0.V1(y);
        }
        if (luaValueV1.l1()) {
            return false;
        }
        return luaValueV1.call(luaValue, luaValue2).w2();
    }

    public static Varargs Q2(LuaValue[] luaValueArr, int i2, int i3, Varargs varargs) {
        if (i3 == 0) {
            return varargs;
        }
        if (i3 == 1) {
            return varargs.U() > 0 ? new Varargs.c(luaValueArr[i2], varargs) : luaValueArr[i2];
        }
        if (i3 == 2 && varargs.U() <= 0) {
            return new Varargs.c(luaValueArr[i2], luaValueArr[i2 + 1]);
        }
        return new Varargs.a(luaValueArr, i2, i3, varargs);
    }

    public static LuaValue R0(String str) {
        throw new d(str);
    }

    public static Varargs R2(LuaValue[] luaValueArr, Varargs varargs) {
        int length = luaValueArr.length;
        if (length == 0) {
            return varargs;
        }
        if (length == 1) {
            return varargs.U() > 0 ? new Varargs.c(luaValueArr[0], varargs) : luaValueArr[0];
        }
        if (length == 2 && varargs.U() <= 0) {
            return new Varargs.c(luaValueArr[0], luaValueArr[1]);
        }
        return new Varargs.b(luaValueArr, varargs);
    }

    public static LuaValue S0(String str, Throwable th) {
        throw new d(str, th);
    }

    protected static LuaValue W0(LuaValue luaValue, LuaValue luaValue2) {
        LuaValue luaValueX1;
        LuaValue luaValueV1;
        int i2 = 0;
        while (true) {
            if (luaValue.o1()) {
                luaValueV1 = luaValue.V1(luaValue2);
                if (!luaValueV1.l1()) {
                    break;
                }
                LuaValue luaValueX2 = luaValue.x1(l);
                if (luaValueX2.l1()) {
                    break;
                }
                luaValueX1 = luaValueX2;
            } else {
                luaValueX1 = luaValue.x1(l);
                if (luaValueX1.l1()) {
                    luaValue.b1(luaValue2.g0());
                }
            }
            if (luaValueX1.g1()) {
                return luaValueX1.call(luaValue, luaValue2);
            }
            i2++;
            if (i2 >= 100) {
                R0("loop in gettable");
                return f1673c;
            }
            luaValue = luaValueX1;
        }
        return luaValueV1;
    }

    private void b1(String str) {
        R0("attempt to index ? (a " + D2() + " value) with key '" + str + '\'');
    }

    public static LuaValue k0(int i2, String str) {
        throw new c(i2, null, str);
    }

    public static LuaValue l0(int i2, String str, String str2) {
        throw new c(i2, str, str2);
    }

    protected static boolean l2(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        LuaValue luaValueX1;
        int i2 = 0;
        while (true) {
            if (!luaValue.o1()) {
                luaValueX1 = luaValue.x1(m);
                if (luaValueX1.l1()) {
                    throw new d("table expected for set index ('" + luaValue2 + "') value, got " + luaValue.D2());
                }
            } else {
                if (!luaValue.V1(luaValue2).l1()) {
                    break;
                }
                luaValueX1 = luaValue.x1(m);
                if (luaValueX1.l1()) {
                    break;
                }
            }
            if (luaValueX1.g1()) {
                luaValueX1.call(luaValue, luaValue2, luaValue3);
                return true;
            }
            i2++;
            if (i2 >= 100) {
                R0("loop in settable");
                return false;
            }
            luaValue = luaValueX1;
        }
        luaValue.d2(luaValue2, luaValue3);
        return true;
    }

    public static LuaValue n0(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        LuaValue luaValueX1 = luaValue2.x1(luaValue);
        if (luaValueX1.l1()) {
            luaValueX1 = luaValue3.x1(luaValue);
            if (luaValueX1.l1()) {
                R0("attempt to perform arithmetic " + luaValue + " on a " + luaValue2.E2() + " value and a " + luaValue3.E2() + " value");
            }
        }
        return luaValueX1.call(luaValue2, luaValue3);
    }

    public static LuaValue p0(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        LuaValue luaValue4;
        LuaValue luaValueX1 = luaValue2.x1(luaValue);
        if (luaValueX1.l1()) {
            luaValueX1 = luaValue3.x1(luaValue);
            if (luaValueX1.l1()) {
                if (!luaValue2.m1() || luaValue2.k1()) {
                    luaValue4 = (!luaValue3.m1() || luaValue3.k1()) ? null : luaValue3;
                } else {
                    luaValue4 = luaValue2;
                }
                String strV2 = v2(luaValue);
                if (luaValue4 != null) {
                    throw new d("number '" + luaValue4.g0() + "' has no integer representation (for bitwise operation '" + luaValue2.g0() + " " + strV2 + " " + luaValue3.g0() + "')");
                }
                R0("attempt to perform bitwise operation " + strV2 + " on a " + luaValue2.D2() + " value and a " + luaValue3.D2() + " value");
            }
        }
        return luaValueX1.call(luaValue2, luaValue3);
    }

    public static LuaTable s2() {
        return new LuaTable();
    }

    public static LuaTable t2(Varargs varargs, int i2) {
        return new LuaTable(varargs, i2);
    }

    public static LuaTable u2(LuaValue[] luaValueArr) {
        return new LuaTable(luaValueArr, null, null);
    }

    public static String v2(LuaValue luaValue) {
        if (luaValue == F) {
            return "&";
        }
        if (luaValue == G) {
            return "|";
        }
        if (luaValue == H) {
            return "~";
        }
        if (luaValue == I) {
            return "<<";
        }
        return luaValue == J ? ">>" : luaValue.g0();
    }

    protected static e w1(LuaValue luaValue) {
        if (luaValue == null || !luaValue.o1()) {
            if (luaValue != null) {
                return new f(luaValue);
            }
            return null;
        }
        LuaValue luaValueV1 = luaValue.V1(o);
        if (luaValueV1.n1()) {
            String strG0 = luaValueV1.g0();
            boolean z2 = strG0.indexOf(107) >= 0;
            boolean z3 = strG0.indexOf(118) >= 0;
            if (z2 || z3) {
                return new WeakTable(z2, z3, luaValue);
            }
        }
        return (LuaTable) luaValue;
    }

    public int A0() {
        m0("int");
        return 0;
    }

    public LuaValue A1() {
        return D0(w, "attempt to perform arithmetic on ").call(this);
    }

    public LuaValue A2() {
        return f1673c;
    }

    public String B0() {
        m0("string");
        return null;
    }

    public LuaValue B1() {
        return f1675e;
    }

    public LuaValue B2() {
        return f1673c;
    }

    public long C0() {
        m0("long");
        return 0L;
    }

    public abstract int C2();

    protected LuaValue D0(LuaValue luaValue, String str) {
        LuaValue luaValueX1 = x1(luaValue);
        if (!luaValueX1.l1()) {
            return luaValueX1;
        }
        if (luaValue == E && m1()) {
            throw new d("number has no integer representation (for bitwise operation '~" + g0() + "')");
        }
        throw new d(str + "a " + E2() + " value");
    }

    public Varargs D1(Varargs varargs, boolean z2) {
        return invoke(varargs);
    }

    public abstract String D2();

    public LuaNumber E0() {
        m0("number");
        return null;
    }

    public boolean E1(boolean z2) {
        m0("boolean");
        return false;
    }

    public String E2() {
        LuaValue luaValueX1 = x1(K);
        return luaValueX1.n1() ? luaValueX1.g0() : D2();
    }

    public LuaNumber F0(String str) {
        throw new d(str);
    }

    public double F1(double d2) {
        m0("number");
        return 0.0d;
    }

    protected LuaValue F2(String str) {
        throw new d(str + " expected, got " + E2());
    }

    public LuaString G0() {
        m0("string");
        return null;
    }

    public LuaFunction G1(LuaFunction luaFunction) {
        m0("function");
        return null;
    }

    protected LuaValue G2(String str) {
        throw new d('\'' + str + "' not implemented for " + D2());
    }

    public LuaTable H0() {
        m0("table");
        return null;
    }

    public int H1(int i2) {
        m0("int");
        return 0;
    }

    public LuaThread I0() {
        m0("thread");
        return null;
    }

    public String I1(String str) {
        m0("String");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r0.l1() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public luaj.LuaValue J0(luaj.LuaValue r3, luaj.LuaValue r4) {
        /*
            r2 = this;
            luaj.LuaValue r0 = r2.x1(r3)
            boolean r1 = r0.l1()
            if (r1 == 0) goto L8b
            luaj.LuaValue r0 = r4.x1(r3)
            boolean r1 = r0.l1()
            if (r1 != 0) goto L15
            goto L8b
        L15:
            luaj.LuaString r0 = luaj.LuaValue.A
            boolean r3 = r0.T1(r3)
            if (r3 == 0) goto L3c
            luaj.LuaString r3 = luaj.LuaValue.z
            luaj.LuaValue r0 = r2.x1(r3)
            boolean r1 = r0.l1()
            if (r1 == 0) goto L33
            luaj.LuaValue r0 = r4.x1(r3)
            boolean r3 = r0.l1()
            if (r3 != 0) goto L3c
        L33:
            luaj.LuaValue r3 = r0.call(r4, r2)
            luaj.LuaValue r3 = r3.B1()
            return r3
        L3c:
            java.lang.String r3 = r2.E2()
            java.lang.String r4 = r4.E2()
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "two "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = " values"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L75
        L61:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " with "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        L75:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "attempt to compare "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            luaj.LuaValue r3 = R0(r3)
            return r3
        L8b:
            luaj.LuaValue r3 = r0.call(r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: luaj.LuaValue.J0(luaj.LuaValue, luaj.LuaValue):luaj.LuaValue");
    }

    public long J1(long j2) {
        m0("long");
        return 0L;
    }

    public LuaValue K0(LuaValue luaValue) {
        return N0(luaValue);
    }

    public LuaString K1(LuaString luaString) {
        m0("string");
        return null;
    }

    public LuaValue L0(LuaNumber luaNumber) {
        return luaNumber.N0(this);
    }

    public LuaTable L1(LuaTable luaTable) {
        m0("table");
        return null;
    }

    public LuaValue M0(LuaString luaString) {
        return luaString.N0(this);
    }

    public LuaValue M1(LuaValue luaValue) {
        return this;
    }

    public LuaValue N0(LuaValue luaValue) {
        LuaValue luaValue2;
        LuaString luaString = C;
        LuaValue luaValueX1 = x1(luaString);
        if (luaValueX1.l1()) {
            luaValueX1 = luaValue.x1(luaString);
            if (luaValueX1.l1()) {
                if (n1()) {
                    luaValue2 = !luaValue.n1() ? luaValue : null;
                } else {
                    luaValue2 = this;
                }
                if (luaValue2 != null) {
                    throw new d("attempt to concatenate a " + luaValue2.D2() + " value");
                }
                R0("attempt to concatenate " + D2() + " and " + luaValue.D2());
            }
        }
        return luaValueX1.call(this, luaValue);
    }

    public LuaValue O0(LuaValue luaValue) {
        return n0(s, this, luaValue);
    }

    public boolean P0(LuaValue luaValue) {
        return this == luaValue;
    }

    public LuaValue Q1(LuaValue luaValue) {
        return n0(u, this, luaValue);
    }

    public void R1(int i2) {
        F2("table");
    }

    public boolean S1(LuaString luaString) {
        return false;
    }

    public LuaValue T0(String str) {
        return U0(K2(str));
    }

    public boolean T1(LuaValue luaValue) {
        return this == luaValue;
    }

    @Override // luaj.Varargs
    public int U() {
        return 1;
    }

    public LuaValue U0(LuaValue luaValue) {
        return W0(this, luaValue);
    }

    public LuaValue U1(String str) {
        return V1(K2(str));
    }

    public LuaValue V0() {
        return null;
    }

    public LuaValue V1(LuaValue luaValue) {
        return G2("rawget");
    }

    public int W1() {
        F2("table or string");
        return 0;
    }

    public boolean X0(LuaValue luaValue) {
        return luaValue.J0(A, this).w2();
    }

    public void X1(int i2, String str) {
        if (str != null) {
            Y1(i2, K2(str));
        }
    }

    public boolean Y0(LuaValue luaValue) {
        return luaValue.J0(z, this).w2();
    }

    public void Y1(int i2, LuaValue luaValue) {
        if (luaValue != null) {
            d2(I2(i2), luaValue);
        }
    }

    public LuaValue Z0(LuaValue luaValue) {
        return n0(D, this, luaValue);
    }

    public void Z1(String str, double d2) {
        if (str != null) {
            d2(K2(str), J2(d2));
        }
    }

    protected LuaValue a1(String str, String str2) {
        throw new d("illegal operation '" + str + "' for " + str2);
    }

    public void a2(String str, int i2) {
        if (str != null) {
            d2(K2(str), I2(i2));
        }
    }

    public void b2(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        d2(K2(str), K2(str2));
    }

    public void c1(LuaValue luaValue) {
    }

    public void c2(String str, LuaValue luaValue) {
        if (str == null || luaValue == null) {
            return;
        }
        d2(K2(str), luaValue);
    }

    public LuaValue call() {
        return u0().call(this);
    }

    public boolean d1() {
        return false;
    }

    public void d2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue == null || luaValue2 == null) {
            return;
        }
        G2("rawset");
    }

    @Override // luaj.Varargs
    public Varargs e0(int i2) {
        if (i2 == 1) {
            return this;
        }
        return i2 > 1 ? f1676f : k0(1, "start must be > 0");
    }

    public boolean e1() {
        return false;
    }

    public void e2(int i2, LuaValue luaValue) {
        if (luaValue != null) {
            j2(LuaLong.I2(i2), luaValue);
        }
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public boolean f1() {
        return false;
    }

    public void f2(String str, double d2) {
        if (str != null) {
            j2(K2(str), J2(d2));
        }
    }

    @Override // luaj.Varargs
    public String g0() {
        return E2() + ": " + Integer.toHexString(hashCode());
    }

    public boolean g1() {
        return false;
    }

    public void g2(String str, int i2) {
        if (str != null) {
            j2(K2(str), I2(i2));
        }
    }

    public boolean h1() {
        return false;
    }

    public void h2(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        j2(K2(str), K2(str2));
    }

    public boolean i1() {
        return false;
    }

    public void i2(String str, LuaValue luaValue) {
        if (str == null || luaValue == null) {
            return;
        }
        j2(K2(str), luaValue);
    }

    public Varargs invoke() {
        return invoke(f1676f);
    }

    public LuaValue j0(LuaValue luaValue) {
        return n0(q, this, luaValue);
    }

    public boolean j1() {
        return false;
    }

    public void j2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue == null || luaValue2 == null) {
            return;
        }
        l2(this, luaValue, luaValue2);
    }

    public boolean k1() {
        return false;
    }

    public LuaValue k2(LuaValue luaValue) {
        return m0("table");
    }

    public boolean l1() {
        return false;
    }

    protected LuaValue m0(String str) {
        throw new d("bad argument: " + str + " expected, got " + E2());
    }

    public boolean m1() {
        return false;
    }

    public LuaValue m2(LuaValue luaValue) {
        return p0(I, this, luaValue);
    }

    public boolean n1() {
        return false;
    }

    public LuaValue n2(LuaValue luaValue) {
        return p0(J, this, luaValue);
    }

    public LuaValue o0(LuaValue luaValue) {
        return p0(F, this, luaValue);
    }

    public boolean o1() {
        return false;
    }

    public int o2(LuaString luaString) {
        R0("attempt to compare " + D2());
        return 0;
    }

    public boolean p1() {
        return false;
    }

    public LuaValue p2() {
        return this;
    }

    public LuaValue q0() {
        return D0(E, "attempt to perform bitwise on ").call(this);
    }

    public boolean q1() {
        return true;
    }

    public LuaString q2() {
        F2("string or number");
        return null;
    }

    public LuaValue r0(LuaValue luaValue) {
        return p0(G, this, luaValue);
    }

    public LuaValue r1() {
        return D0(x, "attempt to get length of ").call(this);
    }

    public LuaValue r2(LuaValue luaValue) {
        return n0(r, this, luaValue);
    }

    public ggf.a s0() {
        return new ggf.a(this);
    }

    public int s1() {
        return r1().y2();
    }

    public LuaValue t0(LuaValue luaValue) {
        return p0(H, this, luaValue);
    }

    public LuaValue t1(LuaValue luaValue) {
        return luaValue.call(L, this);
    }

    @Override // luaj.Varargs
    public String toString() {
        return g0();
    }

    protected LuaValue u0() {
        return D0(n, "attempt to call ");
    }

    public boolean u1(LuaValue luaValue) {
        return J0(z, luaValue).w2();
    }

    @Override // luaj.Varargs
    public LuaValue v(int i2) {
        return i2 == 1 ? this : f1673c;
    }

    public boolean v0() {
        m0("boolean");
        return false;
    }

    public boolean v1(LuaValue luaValue) {
        return J0(A, luaValue).w2();
    }

    @Override // luaj.Varargs
    public LuaValue w() {
        return this;
    }

    public LuaClosure w0() {
        m0("closure");
        return null;
    }

    public boolean w2() {
        return true;
    }

    public double x0() {
        m0("number");
        return 0.0d;
    }

    public LuaValue x1(LuaValue luaValue) {
        LuaValue luaValueV0 = V0();
        return luaValueV0 == null ? f1673c : luaValueV0.V1(luaValue);
    }

    public double x2() {
        return 0.0d;
    }

    public LuaFunction y0() {
        m0("function");
        return null;
    }

    public LuaValue y1(LuaValue luaValue) {
        return n0(v, this, luaValue);
    }

    public int y2() {
        return 0;
    }

    public Globals z0() {
        m0("globals");
        return null;
    }

    public LuaValue z1(LuaValue luaValue) {
        return n0(t, this, luaValue);
    }

    public long z2() {
        return 0L;
    }

    public LuaValue call(String str) {
        return call(K2(str));
    }

    public Varargs invoke(LuaValue luaValue, LuaValue luaValue2, Varargs varargs) {
        return invoke(M2(luaValue, luaValue2, varargs));
    }

    public LuaValue call(LuaValue luaValue) {
        return u0().call(this, luaValue);
    }

    public Varargs invoke(LuaValue luaValue, Varargs varargs) {
        return invoke(N2(luaValue, varargs));
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return u0().call(this, luaValue, luaValue2);
    }

    public Varargs invoke(Varargs varargs) {
        return u0().invoke(this, varargs);
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return u0().invoke(new LuaValue[]{this, luaValue, luaValue2, luaValue3}).w();
    }

    public Varargs invoke(LuaValue[] luaValueArr) {
        return invoke(O2(luaValueArr));
    }

    public Varargs invoke(LuaValue[] luaValueArr, Varargs varargs) {
        return invoke(R2(luaValueArr, varargs));
    }
}
