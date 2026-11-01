package ggg;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Hashtable;
import luaj.LuaDouble;
import luaj.LuaLong;
import luaj.LuaString;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
public class g extends g.a {
    protected static final String[] r = {"(for control)", "(for generator)", "(for index)", "(for limit)", "(for state)", "(for step)", "break"};
    private static final Hashtable s = new Hashtable();
    static final String[] t;
    static final Hashtable u;
    static C0027g[] v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final i f1593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final i f1594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    g.c f1595g;
    g.h.a h;
    InputStream i;
    int k;
    LuaString m;
    LuaString n;
    byte o;
    d l = new d();
    private b p = new b();
    private final int[] q = new int[24];
    char[] j = new char[32];

    static class b implements CharSequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        char[] f1596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1597b;

        b() {
        }

        @Override // java.lang.CharSequence
        public char charAt(int i) {
            return this.f1596a[i];
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f1597b;
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i, int i2) {
            return null;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        k f1598a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        k f1599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1602e;

        c() {
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        j[] f1603a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        f[] f1605c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        f[] f1607e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1604b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1606d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1608f = 0;

        d() {
        }

        public String toString() {
            return "Dyndata [actvar=" + Arrays.toString(this.f1603a) + ", n_actvar=" + this.f1604b + ", gt=" + Arrays.toString(this.f1605c) + ", n_gt=" + this.f1606d + ", label=" + Arrays.toString(this.f1607e) + ", n_label=" + this.f1608f + ']';
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f1609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        k f1610b = new k();

        e() {
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        LuaString f1611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        short f1614d;

        public f(LuaString luaString, int i, int i2, short s) {
            this.f1611a = luaString;
            this.f1612b = i;
            this.f1613c = i2;
            this.f1614d = s;
        }

        public String toString() {
            return "Labeldesc [name=" + this.f1611a + ", pc=" + this.f1612b + ", line=" + this.f1613c + ", nactvar=" + ((int) this.f1614d) + ']';
        }
    }

    /* JADX INFO: renamed from: g.g$g, reason: collision with other inner class name */
    static class C0027g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte f1615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte f1616b;

        public C0027g(int i, int i2) {
            this.f1615a = (byte) i;
            this.f1616b = (byte) i2;
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        LuaValue f1617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LuaString f1618b;

        private h() {
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final h f1620b;

        private i() {
            this.f1620b = new h();
        }

        public void a(i iVar) {
            this.f1619a = iVar.f1619a;
            h hVar = this.f1620b;
            h hVar2 = iVar.f1620b;
            hVar.f1617a = hVar2.f1617a;
            hVar.f1618b = hVar2.f1618b;
        }
    }

    static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final short f1621a;

        j(int i) {
            this.f1621a = (short) i;
        }

        public String toString() {
            return "Vardesc [idx=" + ((int) this.f1621a) + ']';
        }
    }

    static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f1623b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final g.e f1624c = new g.e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final g.e f1625d = new g.e();

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            short f1626a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            short f1627b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            short f1628c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            LuaValue f1629d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f1630e;

            a() {
            }

            public LuaValue a() {
                LuaValue luaValue = this.f1629d;
                return luaValue == null ? LuaLong.I2(this.f1630e) : luaValue;
            }

            public void b(LuaValue luaValue) {
                this.f1629d = luaValue;
            }
        }

        k() {
        }

        boolean a() {
            return this.f1624c.f1589a != this.f1625d.f1589a;
        }

        void b(int i, int i2) {
            this.f1625d.f1589a = -1;
            this.f1624c.f1589a = -1;
            this.f1622a = i;
            this.f1623b.f1630e = i2;
        }

        boolean c() {
            return this.f1622a == 5 && this.f1624c.f1589a == -1 && this.f1625d.f1589a == -1;
        }

        public void d(k kVar) {
            this.f1625d.f1589a = kVar.f1625d.f1589a;
            this.f1622a = kVar.f1622a;
            this.f1624c.f1589a = kVar.f1624c.f1589a;
            a aVar = this.f1623b;
            a aVar2 = kVar.f1623b;
            aVar.f1629d = aVar2.f1629d;
            aVar.f1626a = aVar2.f1626a;
            aVar.f1627b = aVar2.f1627b;
            aVar.f1628c = aVar2.f1628c;
            aVar.f1630e = aVar2.f1630e;
        }
    }

    static {
        int i2 = 0;
        while (true) {
            String[] strArr = r;
            if (i2 >= strArr.length) {
                break;
            }
            s.put(strArr[i2], Boolean.TRUE);
            i2++;
        }
        t = new String[]{"and", "break", "do", "else", "elseif", "end", "false", "for", "function", "goto", "if", "in", "local", "nil", "not", "or", "repeat", "return", "then", "true", "until", "while", "//", "..", "...", "==", ">=", "<=", "~=", "<<", ">>", "::", "<eof>", "<number>", "<integer>", "<name>", "<string>"};
        u = new Hashtable();
        for (int i3 = 0; i3 < 22; i3++) {
            u.put(LuaValue.K2(t[i3]), Integer.valueOf(i3 + 257));
        }
        v = new C0027g[]{new C0027g(60, 60), new C0027g(60, 60), new C0027g(70, 70), new C0027g(70, 70), new C0027g(70, 70), new C0027g(100, 90), new C0027g(50, 40), new C0027g(30, 30), new C0027g(30, 30), new C0027g(30, 30), new C0027g(30, 30), new C0027g(30, 30), new C0027g(30, 30), new C0027g(20, 20), new C0027g(10, 10), new C0027g(70, 70), new C0027g(36, 36), new C0027g(32, 32), new C0027g(34, 34), new C0027g(38, 38), new C0027g(38, 38)};
    }

    public g(g.h.a aVar, InputStream inputStream) {
        this.f1593e = new i();
        this.f1594f = new i();
        this.i = inputStream;
        this.h = aVar;
    }

    private void B1() {
        if (this.f1590b == 35) {
            while (!j0() && this.f1590b != -1) {
                h1();
            }
        }
    }

    public static int H0(int i2) {
        if (i2 <= 57) {
            return i2 - 48;
        }
        return i2 <= 70 ? i2 - 55 : i2 - 87;
    }

    public static boolean K0(String str) {
        return s.containsKey(str);
    }

    public static boolean L0(int i2) {
        return (i2 >= 48 && i2 <= 57) || (i2 >= 97 && i2 <= 122) || ((i2 >= 65 && i2 <= 90) || i2 == 95);
    }

    private static final String M(Object obj) {
        return N(String.valueOf(obj));
    }

    public static boolean M0(int i2) {
        return (i2 >= 97 && i2 <= 122) || (i2 >= 65 && i2 <= 90);
    }

    private static final String N(String str) {
        return '\'' + str + '\'';
    }

    private static boolean N0(int i2) {
        return i2 < 32 || i2 == 255;
    }

    public static boolean O0(int i2) {
        return i2 >= 48 && i2 <= 57;
    }

    public static boolean P0(int i2) {
        return i2 >= 0 && i2 <= 32;
    }

    public static boolean Q0(int i2) {
        return (i2 >= 48 && i2 <= 57) || (i2 >= 97 && i2 <= 102) || (i2 >= 65 && i2 <= 70);
    }

    static int Z0(int i2) {
        int i3 = 0;
        while (i2 >= 16) {
            i2 = (i2 + 1) >> 1;
            i3++;
        }
        if (i2 < 8) {
            return i2;
        }
        return (i2 - 8) | ((i3 + 1) << 3);
    }

    void A0(k kVar, int i2) {
        int i3;
        g.c cVar = this.f1595g;
        k kVar2 = new k();
        i iVar = this.f1593e;
        int i4 = iVar.f1619a;
        if (i4 == 40) {
            g1();
            if (this.f1593e.f1619a == 41) {
                kVar2.f1622a = 0;
            } else {
                q0(kVar2);
                cVar.h1(kVar2);
            }
            Z(41, 40, i2);
        } else if (i4 == 123) {
            i0(kVar2);
        } else if (i4 != 293) {
            J1("function arguments expected");
            return;
        } else {
            g0(kVar2, iVar.f1620b.f1618b);
            g1();
        }
        g.a.C(kVar.f1622a == 6);
        int i5 = kVar.f1623b.f1630e;
        if (G0(kVar2.f1622a)) {
            i3 = -1;
        } else {
            if (kVar2.f1622a != 0) {
                cVar.o0(kVar2);
            }
            i3 = cVar.p - (i5 + 1);
        }
        kVar.b(12, cVar.T(29, i5, i3 + 1, 2));
        cVar.s0(i2);
        cVar.p = (short) (i5 + 1);
    }

    void A1(k kVar) {
        LuaString luaStringG1 = G1();
        g.c cVar = this.f1595g;
        boolean z = true;
        if (g.c.k1(cVar, luaStringG1, kVar, 1) == 0) {
            k kVar2 = new k();
            g.c.k1(cVar, this.n, kVar, 1);
            int i2 = kVar.f1622a;
            if (i2 != 7 && i2 != 8) {
                z = false;
            }
            g.a.C(z);
            g0(kVar2, luaStringG1);
            cVar.E0(kVar, kVar2);
        }
    }

    boolean B0(k kVar) {
        int i2;
        A1(kVar);
        while (true) {
            i2 = this.f1593e.f1619a;
            if (i2 != 46) {
                break;
            }
            t0(kVar);
        }
        if (i2 != 58) {
            return false;
        }
        t0(kVar);
        return true;
    }

    void C0(int i2) {
        k kVar = new k();
        k kVar2 = new k();
        g1();
        U(kVar2, B0(kVar), i2);
        this.f1595g.l1(kVar, kVar2);
        this.f1595g.s0(i2);
    }

    int C1() {
        int i2;
        int i3 = this.f1590b;
        w1();
        int i4 = 0;
        while (true) {
            i2 = this.f1590b;
            if (i2 != 61) {
                break;
            }
            w1();
            i4++;
        }
        return i2 == i3 ? i4 : (-i4) - 1;
    }

    int D0(int i2) {
        if (i2 == 37) {
            return 4;
        }
        if (i2 == 38) {
            return 16;
        }
        if (i2 == 42) {
            return 2;
        }
        if (i2 == 43) {
            return 0;
        }
        if (i2 == 45) {
            return 1;
        }
        if (i2 == 47) {
            return 3;
        }
        if (i2 == 60) {
            return 9;
        }
        if (i2 == 62) {
            return 11;
        }
        if (i2 == 94) {
            return 5;
        }
        if (i2 == 124) {
            return 17;
        }
        if (i2 == 126) {
            return 18;
        }
        if (i2 == 257) {
            return 13;
        }
        if (i2 == 272) {
            return 14;
        }
        if (i2 == 279) {
            return 15;
        }
        if (i2 == 280) {
            return 6;
        }
        switch (i2) {
            case 282:
                return 8;
            case 283:
                return 12;
            case 284:
                return 10;
            case 285:
                return 7;
            case 286:
                return 19;
            case 287:
                return 20;
            default:
                return 21;
        }
    }

    void D1() {
        while (true) {
            int i2 = this.f1593e.f1619a;
            if (i2 != 59 && i2 != 288) {
                return;
            } else {
                E1();
            }
        }
    }

    int E0(int i2) {
        if (i2 == 35) {
            return 2;
        }
        if (i2 == 45) {
            return 0;
        }
        if (i2 != 126) {
            return i2 != 271 ? 3 : 1;
        }
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    void E1() {
        int i2 = this.f1591c;
        k0();
        int i3 = this.f1593e.f1619a;
        if (i3 == 59) {
            g1();
        } else if (i3 == 269) {
            g1();
            if (L1(265)) {
                W0();
            } else {
                X0();
            }
        } else if (i3 == 278) {
            P1(i2);
        } else if (i3 == 288) {
            g1();
            R0(G1(), i2);
        } else if (i3 == 258) {
            F0(this.f1595g.H0());
        } else if (i3 == 259) {
            g1();
            S();
            Z(262, 259, i2);
        } else if (i3 == 273) {
            t1(i2);
        } else if (i3 != 274) {
            switch (i3) {
                case 264:
                    z0(i2);
                    break;
                case 265:
                    C0(i2);
                    break;
                case 266:
                    F0(this.f1595g.H0());
                    break;
                case 267:
                    I0(i2);
                    break;
                default:
                    s0();
                    break;
            }
        } else {
            g1();
            u1();
        }
        g.c cVar = this.f1595g;
        int i4 = cVar.f1575b.l;
        short s2 = cVar.p;
        g.a.C(i4 >= s2 && s2 >= cVar.n);
        g.c cVar2 = this.f1595g;
        cVar2.p = cVar2.n;
        S0();
    }

    void F0(int i2) {
        LuaString luaStringK2;
        int i3 = this.f1591c;
        if (L1(266)) {
            luaStringK2 = G1();
        } else {
            g1();
            luaStringK2 = LuaString.K2("break");
        }
        LuaString luaString = luaStringK2;
        d dVar = this.l;
        f[] fVarArrD = g.a.D(dVar.f1605c, dVar.f1606d + 1);
        dVar.f1605c = fVarArrD;
        d dVar2 = this.l;
        int i4 = dVar2.f1606d;
        dVar2.f1606d = i4 + 1;
        v0(d1(fVarArrD, i4, luaString, i3, i2));
    }

    void F1() {
        while (!T(true)) {
            int i2 = this.f1593e.f1619a;
            E1();
            if (i2 == 274) {
                return;
            }
        }
    }

    boolean G0(int i2) {
        return i2 == 12 || i2 == 13;
    }

    LuaString G1() {
        W(292);
        LuaString luaString = this.f1593e.f1620b.f1618b;
        g1();
        return luaString;
    }

    int H1(k kVar, int i2) {
        k0();
        int iE0 = E0(this.f1593e.f1619a);
        if (iE0 != 3) {
            int i3 = this.f1591c;
            g1();
            H1(kVar, 80);
            this.f1595g.Y0(iE0, kVar, i3);
        } else {
            z1(kVar);
        }
        int iD0 = D0(this.f1593e.f1619a);
        while (iD0 != 21 && v[iD0].f1615a > i2) {
            k kVar2 = new k();
            int i4 = this.f1591c;
            g1();
            this.f1595g.F0(iD0, kVar);
            int iH1 = H1(kVar2, v[iD0].f1616b);
            this.f1595g.X0(iD0, kVar, kVar2, i4);
            iD0 = iH1;
        }
        S0();
        return iD0;
    }

    void I0(int i2) {
        g.e eVar = new g.e(-1);
        do {
            K1(eVar);
        } while (this.f1593e.f1619a == 261);
        if (L1(260)) {
            S();
        }
        Z(262, 267, i2);
        this.f1595g.W0(eVar.f1589a);
    }

    void I1(k kVar) {
        int i2 = this.f1591c;
        k1(kVar);
        while (true) {
            int i3 = this.f1593e.f1619a;
            if (i3 != 40) {
                if (i3 == 46) {
                    t0(kVar);
                } else if (i3 == 58) {
                    k kVar2 = new k();
                    g1();
                    b0(kVar2);
                    this.f1595g.f1(kVar, kVar2);
                    A0(kVar, i2);
                } else if (i3 == 91) {
                    k kVar3 = new k();
                    this.f1595g.n0(kVar);
                    Q1(kVar3);
                    this.f1595g.E0(kVar, kVar3);
                } else if (i3 != 123 && i3 != 293) {
                    return;
                }
            }
            this.f1595g.o0(kVar);
            A0(kVar, i2);
        }
    }

    void J0() {
        int i2 = this.f1590b;
        g.a.C(j0());
        h1();
        if (j0() && this.f1590b != i2) {
            h1();
        }
        int i3 = this.f1591c + 1;
        this.f1591c = i3;
        if (i3 >= 2147483645) {
            J1("chunk has too many lines (> 2147483645)");
        }
    }

    void J1(String str) {
        T0(str, this.f1593e.f1619a);
    }

    void K1(g.e eVar) {
        int iH0;
        k kVar = new k();
        g.c.a aVar = new g.c.a();
        g1();
        r0(kVar);
        c0(275);
        int i2 = this.f1593e.f1619a;
        if (i2 == 266 || i2 == 258) {
            this.f1595g.B0(kVar);
            this.f1595g.j0(aVar, false);
            F0(kVar.f1624c.f1589a);
            D1();
            if (T(false)) {
                this.f1595g.K0();
                return;
            }
            iH0 = this.f1595g.H0();
        } else {
            this.f1595g.C0(kVar);
            this.f1595g.j0(aVar, false);
            iH0 = kVar.f1625d.f1589a;
        }
        F1();
        this.f1595g.K0();
        int i3 = this.f1593e.f1619a;
        if (i3 == 260 || i3 == 261) {
            g.c cVar = this.f1595g;
            cVar.c0(eVar, cVar.H0());
        }
        this.f1595g.W0(iH0);
    }

    boolean L1(int i2) {
        if (this.f1593e.f1619a != i2) {
            return false;
        }
        g1();
        return true;
    }

    String M1(int i2) {
        g.h.a aVar;
        String strValueOf;
        if (i2 >= 257) {
            String str = t[i2 - 257];
            switch (i2) {
                case 289:
                case 290:
                case 291:
                case 292:
                case 293:
                    return str;
                default:
                    return '\'' + str + '\'';
            }
        }
        if (N0(i2)) {
            aVar = this.h;
            strValueOf = "'<\\" + i2 + ">' (symbol with decimal code " + i2 + " or 0x" + Integer.toHexString(i2) + ")";
        } else {
            aVar = this.h;
            strValueOf = String.valueOf((char) i2);
        }
        return aVar.e(strValueOf);
    }

    String N1(int i2) {
        switch (i2) {
            case 290:
            case 291:
            case 292:
            case 293:
                return '\'' + new String(this.j, 0, this.k) + '\'';
            default:
                return M1(i2);
        }
    }

    luaj.h O() {
        g.c cVar = this.f1595g;
        luaj.h hVar = cVar.f1575b;
        luaj.h[] hVarArr = hVar.f1725c;
        if (hVarArr == null || cVar.k >= hVarArr.length) {
            hVar.f1725c = g.a.L(hVarArr, Math.max(1, cVar.k * 2));
        }
        luaj.h[] hVarArr2 = hVar.f1725c;
        g.c cVar2 = this.f1595g;
        int i2 = cVar2.k;
        cVar2.k = i2 + 1;
        luaj.h hVar2 = new luaj.h();
        hVarArr2[i2] = hVar2;
        return hVar2;
    }

    void O1(f fVar, g.c cVar, g.c.a aVar) {
        StringBuilder sb;
        LuaString luaString;
        this.f1591c = fVar.f1613c;
        String strG0 = fVar.f1611a.g0();
        boolean zK0 = K0(strG0);
        g.h.a aVar2 = this.h;
        if (zK0) {
            sb = new StringBuilder();
            sb.append("<");
            sb.append(fVar.f1611a);
            sb.append("> at line ");
            sb.append(fVar.f1613c);
            sb.append(" not inside a loop");
        } else {
            sb = new StringBuilder();
            sb.append("no visible label '");
            sb.append(fVar.f1611a);
            sb.append("' for <goto> at line ");
            sb.append(fVar.f1613c);
        }
        String strE = aVar2.e(sb.toString());
        if (!zK0) {
            d dVar = this.l;
            for (int i2 = aVar.f1582b; i2 < dVar.f1608f; i2++) {
                f fVar2 = dVar.f1607e[i2];
                if (fVar2 != null && (luaString = fVar2.f1611a) != null) {
                    String strG1 = luaString.g0();
                    if (strG1.equalsIgnoreCase(strG0)) {
                        strE = strE + "\ndid you mean label '" + strG1 + "' at line " + fVar2.f1613c + '?';
                    }
                }
            }
        }
        x1(strE);
    }

    void P(int i2, int i3, k kVar) {
        g.c cVar = this.f1595g;
        int i4 = i2 - i3;
        if (G0(kVar.f1622a)) {
            int i5 = i4 + 1;
            if (i5 < 0) {
                i5 = 0;
            }
            cVar.j1(kVar, i5);
            if (i5 > 1) {
                cVar.b1(i5 - 1);
                return;
            }
            return;
        }
        if (kVar.f1622a != 0) {
            cVar.o0(kVar);
        }
        if (i4 > 0) {
            short s2 = cVar.p;
            cVar.b1(i4);
            cVar.P0(s2, i4);
        }
    }

    void P1(int i2) {
        g.c cVar = this.f1595g;
        g.c.a aVar = new g.c.a();
        g1();
        int iZ0 = cVar.z0();
        int iH0 = h0();
        cVar.j0(aVar, true);
        c0(259);
        S();
        cVar.T0(cVar.H0(), iZ0);
        Z(262, 278, i2);
        cVar.K0();
        cVar.W0(iH0);
    }

    void Q(int i2) {
        g.c cVar = this.f1595g;
        cVar.n = (short) (cVar.n + i2);
        while (i2 > 0) {
            cVar.A0(cVar.n - i2).f1559b = cVar.f1580g;
            i2--;
        }
    }

    void Q1(k kVar) {
        g1();
        r0(kVar);
        this.f1595g.q0(kVar);
        c0(93);
    }

    void R(e eVar, int i2) {
        k kVar = new k();
        int i3 = eVar.f1610b.f1622a;
        X(7 <= i3 && i3 <= 9, "syntax error");
        if (!L1(44)) {
            c0(61);
            int iQ0 = q0(kVar);
            if (iQ0 != i2) {
                P(i2, iQ0, kVar);
                if (iQ0 > i2) {
                    g.c cVar = this.f1595g;
                    cVar.p = (short) (cVar.p - (iQ0 - i2));
                }
            } else {
                this.f1595g.i1(kVar);
            }
            this.f1595g.l1(eVar.f1610b, kVar);
        }
        e eVar2 = new e();
        eVar2.f1609a = eVar;
        I1(eVar2.f1610b);
        k kVar2 = eVar2.f1610b;
        if (kVar2.f1622a != 9) {
            Y(eVar, kVar2);
        }
        R(eVar2, i2 + 1);
        kVar.b(6, this.f1595g.p - 1);
        this.f1595g.l1(eVar.f1610b, kVar);
    }

    void R0(LuaString luaString, int i2) {
        g.c cVar = this.f1595g;
        d dVar = this.l;
        cVar.P(dVar.f1607e, dVar.f1608f, luaString);
        c0(288);
        d dVar2 = this.l;
        f[] fVarArrD = g.a.D(dVar2.f1607e, dVar2.f1608f + 1);
        dVar2.f1607e = fVarArrD;
        d dVar3 = this.l;
        int i3 = dVar3.f1608f;
        dVar3.f1608f = i3 + 1;
        int iD1 = d1(fVarArrD, i3, luaString, i2, this.f1595g.z0());
        D1();
        if (T(false)) {
            this.l.f1607e[iD1].f1614d = this.f1595g.f1579f.f1584d;
        }
        u0(this.l.f1607e[iD1]);
    }

    void S() {
        g.c cVar = this.f1595g;
        cVar.j0(new g.c.a(), false);
        F1();
        cVar.K0();
    }

    void S0() {
        this.h.f1632a--;
    }

    boolean T(boolean z) {
        int i2 = this.f1593e.f1619a;
        if (i2 == 277) {
            return z;
        }
        if (i2 != 289) {
            switch (i2) {
                case 260:
                case 261:
                case 262:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    void T0(String str, int i2) {
        String strM = luaj.b.m(this.m.g0());
        this.h.e(strM + ':' + this.f1591c + ": " + str);
        if (i2 != 0) {
            str = str + " near " + N1(i2);
            this.h.e("syntax error: " + str);
        }
        throw new luaj.d(strM, this.f1591c, str);
    }

    void U(k kVar, boolean z, int i2) {
        g.c cVar = new g.c();
        g.c.a aVar = new g.c.a();
        luaj.h hVarO = O();
        cVar.f1575b = hVarO;
        hVarO.h = i2;
        i1(cVar, aVar);
        c0(40);
        if (z) {
            c1("self");
            Q(1);
        }
        j1();
        c0(41);
        F1();
        cVar.f1575b.i = this.f1591c;
        Z(262, 265, i2);
        f0(kVar);
        d0();
    }

    void U0(c cVar) {
        r0(cVar.f1598a);
        this.f1595g.O(cVar.f1601d, 2147483645, "items in a constructor");
        cVar.f1601d++;
        cVar.f1602e++;
    }

    void V() {
        LuaString luaStringK2 = LuaString.K2("break");
        d dVar = this.l;
        f[] fVarArrD = g.a.D(dVar.f1607e, dVar.f1608f + 1);
        dVar.f1607e = fVarArrD;
        d dVar2 = this.l;
        int i2 = dVar2.f1608f;
        dVar2.f1608f = i2 + 1;
        u0(this.l.f1607e[d1(fVarArrD, i2, luaStringK2, 0, this.f1595g.f1580g)]);
    }

    int V0(h hVar) {
        int i2;
        while (true) {
            this.k = 0;
            while (true) {
                int i3 = this.f1590b;
                if (i3 == -1) {
                    return 289;
                }
                if (i3 != 32) {
                    if (i3 == 34 || i3 == 39) {
                        n1(i3, hVar);
                        return 293;
                    }
                    if (i3 != 91) {
                        if (i3 == 126) {
                            h1();
                            if (this.f1590b != 61) {
                                return 126;
                            }
                            h1();
                            return 285;
                        }
                        switch (i3) {
                            case 9:
                            case 11:
                            case 12:
                                break;
                            case 10:
                            case 13:
                                J0();
                                break;
                            default:
                                switch (i3) {
                                    case 45:
                                        h1();
                                        if (this.f1590b != 45) {
                                            return 45;
                                        }
                                        h1();
                                        if (this.f1590b == 91) {
                                            int iC1 = C1();
                                            this.k = 0;
                                            if (iC1 >= 0) {
                                                l1(null, iC1);
                                            }
                                        }
                                        while (!j0() && this.f1590b != -1) {
                                            h1();
                                        }
                                        break;
                                    case 46:
                                        w1();
                                        if (a0(".")) {
                                            return a0(".") ? 281 : 280;
                                        }
                                        if (!O0(this.f1590b)) {
                                            return 46;
                                        }
                                        m1(hVar, false);
                                        return 290;
                                    case 47:
                                        h1();
                                        if (this.f1590b != 47) {
                                            return 47;
                                        }
                                        h1();
                                        return 279;
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                        m1(hVar, true);
                                        return 290;
                                    case 58:
                                        h1();
                                        if (this.f1590b != 58) {
                                            return 58;
                                        }
                                        h1();
                                        return 288;
                                    default:
                                        switch (i3) {
                                            case 60:
                                                h1();
                                                int i4 = this.f1590b;
                                                if (i4 == 61) {
                                                    h1();
                                                    return 284;
                                                }
                                                if (i4 != 60) {
                                                    return 60;
                                                }
                                                h1();
                                                return 286;
                                            case 61:
                                                break;
                                            case 62:
                                                h1();
                                                int i5 = this.f1590b;
                                                if (i5 == 61) {
                                                    h1();
                                                    return 283;
                                                }
                                                if (i5 != 62) {
                                                    return 62;
                                                }
                                                h1();
                                                return 287;
                                            default:
                                                if (!M0(i3) && (i2 = this.f1590b) != 95) {
                                                    h1();
                                                    return i2;
                                                }
                                                do {
                                                    w1();
                                                } while (L0(this.f1590b));
                                                LuaString luaStringF1 = f1(this.j, 0, this.k);
                                                Integer num = (Integer) u.get(luaStringF1);
                                                if (num != null) {
                                                    return num.intValue();
                                                }
                                                hVar.f1618b = luaStringF1;
                                                return 292;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        int iC2 = C1();
                        if (iC2 == -1) {
                            return 91;
                        }
                        if (iC2 >= 0) {
                            l1(hVar, iC2);
                            return 293;
                        }
                        T0("invalid long string delimiter", 293);
                    }
                }
                h1();
            }
        }
        h1();
        if (this.f1590b != 61) {
            return 61;
        }
        h1();
        return 282;
    }

    void W(int i2) {
        if (this.f1593e.f1619a != i2) {
            l0(i2);
        }
    }

    void W0() {
        k kVar = new k();
        g.c cVar = this.f1595g;
        b1(G1());
        Q(1);
        U(kVar, false, this.f1591c);
        cVar.A0(cVar.n - 1).f1559b = cVar.f1580g;
    }

    void X(boolean z, String str) {
        if (z) {
            return;
        }
        J1(str);
    }

    void X0() {
        k kVar = new k();
        int iQ0 = 0;
        int i2 = 0;
        do {
            b1(G1());
            i2++;
        } while (L1(44));
        if (L1(61)) {
            iQ0 = q0(kVar);
        } else {
            kVar.f1622a = 0;
        }
        P(i2, iQ0, kVar);
        Q(i2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void Y(e eVar, k kVar) {
        g.c cVar = this.f1595g;
        short s2 = cVar.p;
        boolean z = false;
        while (eVar != null) {
            k kVar2 = eVar.f1610b;
            if (kVar2.f1622a == 9) {
                k.a aVar = kVar2.f1623b;
                short s3 = aVar.f1628c;
                int i2 = kVar.f1622a;
                if (s3 == i2 && aVar.f1627b == kVar.f1623b.f1630e) {
                    aVar.f1628c = (short) 7;
                    aVar.f1627b = s2;
                    z = true;
                }
                if (i2 == 7 && aVar.f1626a == kVar.f1623b.f1630e) {
                    aVar.f1626a = s2;
                    z = true;
                }
            }
            eVar = eVar.f1609a;
        }
        if (z) {
            cVar.T(kVar.f1622a == 7 ? 0 : 5, s2, kVar.f1623b.f1630e, 0);
            cVar.b1(1);
        }
    }

    void Y0() {
        g.a.C(this.f1594f.f1619a == 289);
        i iVar = this.f1594f;
        iVar.f1619a = V0(iVar.f1620b);
    }

    void Z(int i2, int i3, int i4) {
        if (L1(i2)) {
            return;
        }
        if (i4 == this.f1591c) {
            l0(i2);
            return;
        }
        J1(this.h.e(N(M1(i2)) + " expected (to close " + N(M1(i3)) + " at line " + i4 + ')'));
    }

    boolean a0(String str) {
        if (str.indexOf(this.f1590b) < 0) {
            return false;
        }
        w1();
        return true;
    }

    public void a1(g.c cVar) {
        i1(cVar, new g.c.a());
        this.f1595g.f1575b.k = 1;
        k kVar = new k();
        kVar.b(7, 0);
        this.f1595g.O0(this.n, kVar);
        g1();
        F1();
        W(289);
        d0();
    }

    void b0(k kVar) {
        g0(kVar, G1());
    }

    void b1(LuaString luaString) {
        int iS1 = s1(luaString);
        this.f1595g.O(this.l.f1604b + 1, 200, "local variables");
        d dVar = this.l;
        j[] jVarArr = dVar.f1603a;
        if (jVarArr == null || dVar.f1604b + 1 > jVarArr.length) {
            dVar.f1603a = g.a.J(jVarArr, Math.max(1, dVar.f1604b * 2));
        }
        d dVar2 = this.l;
        j[] jVarArr2 = dVar2.f1603a;
        int i2 = dVar2.f1604b;
        dVar2.f1604b = i2 + 1;
        jVarArr2[i2] = new j(iS1);
    }

    void c0(int i2) {
        W(i2);
        g1();
    }

    void c1(String str) {
        b1(e1(str));
    }

    void d0() {
        g.c cVar = this.f1595g;
        luaj.h hVar = cVar.f1575b;
        cVar.c1(0, 0);
        cVar.K0();
        hVar.f1724b = g.a.F(hVar.f1724b, cVar.f1580g);
        hVar.f1726d = g.a.F(hVar.f1726d, cVar.f1580g);
        hVar.f1723a = g.a.K(hVar.f1723a, cVar.j);
        hVar.f1725c = g.a.L(hVar.f1725c, cVar.k);
        hVar.f1727e = g.a.G(hVar.f1727e, cVar.m);
        hVar.f1728f = g.a.H(hVar.f1728f, cVar.o);
        g.a.C(cVar.f1579f == null);
        this.f1595g = cVar.f1577d;
    }

    int d1(f[] fVarArr, int i2, LuaString luaString, int i3, int i4) {
        fVarArr[i2] = new f(luaString, i4, i3, this.f1595g.n);
        return i2;
    }

    void e0(int i2, f fVar) {
        g.c cVar = this.f1595g;
        f[] fVarArr = this.l.f1605c;
        f fVar2 = fVarArr[i2];
        g.a.C(fVar2.f1611a.P0(fVar.f1611a));
        short s2 = fVar2.f1614d;
        if (s2 < fVar.f1614d) {
            LuaString luaString = cVar.A0(s2).f1558a;
            x1(this.h.e("<goto " + fVar2.f1611a + "> at line " + fVar2.f1613c + " jumps into the scope of local '" + luaString.g0() + '\''));
        }
        cVar.T0(fVar2.f1612b, fVar.f1612b);
        System.arraycopy(fVarArr, i2 + 1, fVarArr, i2, (this.l.f1606d - i2) - 1);
        d dVar = this.l;
        int i3 = dVar.f1606d - 1;
        dVar.f1606d = i3;
        fVarArr[i3] = null;
    }

    LuaString e1(String str) {
        return this.h.c(str);
    }

    void f0(k kVar) {
        g.c cVar = this.f1595g.f1577d;
        kVar.b(11, cVar.U(37, 0, cVar.k - 1));
        cVar.o0(kVar);
    }

    LuaString f1(char[] cArr, int i2, int i3) {
        return this.h.c(new String(cArr, i2, i3));
    }

    void g0(k kVar, LuaString luaString) {
        kVar.b(4, this.f1595g.m1(luaString));
    }

    void g1() {
        this.f1592d = this.f1591c;
        i iVar = this.f1594f;
        if (iVar.f1619a != 289) {
            this.f1593e.a(iVar);
            this.f1594f.f1619a = 289;
        } else {
            i iVar2 = this.f1593e;
            iVar2.f1619a = V0(iVar2.f1620b);
        }
    }

    int h0() {
        k kVar = new k();
        r0(kVar);
        if (kVar.f1622a == 1) {
            kVar.f1622a = 3;
        }
        this.f1595g.C0(kVar);
        return kVar.f1625d.f1589a;
    }

    void h1() {
        try {
            this.f1590b = this.i.read();
        } catch (IOException e2) {
            e2.printStackTrace();
            this.f1590b = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    void i0(k kVar) {
        g.c cVar = this.f1595g;
        int i2 = this.f1591c;
        int iT = cVar.T(11, 0, 0, 0);
        c cVar2 = new c();
        cVar2.f1602e = 0;
        cVar2.f1600c = 0;
        cVar2.f1601d = 0;
        cVar2.f1599b = kVar;
        kVar.b(11, iT);
        cVar2.f1598a.b(0, 0);
        cVar.o0(kVar);
        c0(123);
        while (true) {
            g.a.C(cVar2.f1598a.f1622a == 0 || cVar2.f1602e > 0);
            if (this.f1593e.f1619a != 125) {
                cVar.R(cVar2);
                int i3 = this.f1593e.f1619a;
                if (i3 == 91) {
                    r1(cVar2);
                } else {
                    if (i3 == 292) {
                        Y0();
                        if (this.f1594f.f1619a == 61) {
                            r1(cVar2);
                        }
                    }
                    U0(cVar2);
                }
                if (!L1(44) && !L1(59)) {
                    break;
                }
            } else {
                break;
            }
        }
        Z(125, 123, i2);
        cVar.J0(cVar2);
        g.d dVar = new g.d(cVar.f1575b.f1724b, iT);
        g.a.x(dVar, Z0(cVar2.f1601d));
        g.a.z(dVar, Z0(cVar2.f1600c));
    }

    void i1(g.c cVar, g.c.a aVar) {
        cVar.f1577d = this.f1595g;
        cVar.f1578e = this;
        this.f1595g = cVar;
        cVar.f1580g = 0;
        cVar.h = -1;
        cVar.i = new g.e(-1);
        cVar.p = (short) 0;
        cVar.j = 0;
        cVar.k = 0;
        cVar.o = (short) 0;
        cVar.m = (short) 0;
        cVar.n = (short) 0;
        cVar.l = this.l.f1604b;
        cVar.f1579f = null;
        luaj.h hVar = cVar.f1575b;
        hVar.f1729g = this.m;
        hVar.l = 2;
        cVar.j0(aVar, false);
    }

    boolean j0() {
        int i2 = this.f1590b;
        return i2 == 10 || i2 == 13;
    }

    void j1() {
        g.c cVar = this.f1595g;
        luaj.h hVar = cVar.f1575b;
        int i2 = 0;
        hVar.k = 0;
        if (this.f1593e.f1619a != 41) {
            do {
                int i3 = this.f1593e.f1619a;
                if (i3 == 281) {
                    g1();
                    hVar.k = 1;
                } else if (i3 != 292) {
                    J1("<name> or " + M("...") + " expected");
                } else {
                    b1(G1());
                    i2++;
                }
                if (hVar.k != 0) {
                    break;
                }
            } while (L1(44));
        }
        Q(i2);
        short s2 = cVar.n;
        hVar.j = s2;
        cVar.b1(s2);
    }

    void k0() {
        g.h.a aVar = this.h;
        int i2 = aVar.f1632a + 1;
        aVar.f1632a = i2;
        if (i2 > 200) {
            T0("chunk has too many syntax levels", 0);
        }
    }

    void k1(k kVar) {
        int i2 = this.f1593e.f1619a;
        if (i2 != 40) {
            if (i2 != 292) {
                J1("unexpected symbol");
                return;
            } else {
                A1(kVar);
                return;
            }
        }
        int i3 = this.f1591c;
        g1();
        r0(kVar);
        Z(41, 40, i3);
        this.f1595g.i0(kVar);
    }

    void l0(int i2) {
        J1(this.h.e(N(M1(i2)) + " expected"));
    }

    void l1(h hVar, int i2) {
        String str;
        int i3;
        w1();
        if (j0()) {
            J0();
        }
        boolean z = false;
        while (!z) {
            int i4 = this.f1590b;
            if (i4 == -1) {
                str = hVar != null ? "unfinished long string" : "unfinished long comment";
                i3 = 289;
            } else if (i4 == 10 || i4 == 13) {
                v1(10);
                J0();
                if (hVar == null) {
                    this.k = 0;
                }
            } else {
                i3 = 91;
                if (i4 != 91) {
                    if (i4 != 93) {
                        if (hVar != null) {
                            w1();
                        } else {
                            h1();
                        }
                    } else if (C1() == i2) {
                        w1();
                        z = true;
                    }
                } else if (C1() == i2) {
                    w1();
                    if (i2 == 0) {
                        str = "nesting of [[...]] is deprecated";
                    }
                }
            }
            T0(str, i3);
        }
        if (hVar != null) {
            int i5 = i2 + 2;
            hVar.f1618b = this.h.d(LuaString.n3(this.j, i5, this.k - (i5 * 2)));
        }
    }

    void m0(int i2, String str) {
        v1(92);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.q[i3];
            if (i4 == -1) {
                break;
            }
            v1(i4);
        }
        T0(str, 293);
    }

    void m1(h hVar, boolean z) {
        double d2;
        LuaValue luaValueJ2;
        int i2 = this.f1590b;
        w1();
        boolean z2 = i2 == 48 && a0("Xx");
        String str = z2 ? "Pp" : "Ee";
        while (true) {
            if (a0(str)) {
                a0("+-");
                z = false;
            }
            int i3 = this.f1590b;
            if ((i3 >= 48 && i3 <= 57) || (z2 && ((i3 >= 97 && i3 <= 102) || (i3 >= 65 && i3 <= 70)))) {
                w1();
            } else {
                if (i3 != 46) {
                    break;
                }
                w1();
                z = false;
            }
        }
        if (!z2 && z && this.k > 19) {
            z = false;
        }
        try {
            if (z2) {
                b bVar = this.p;
                bVar.f1596a = this.j;
                bVar.f1597b = this.k;
                luaValueJ2 = LuaValue.N1(bVar);
            } else {
                if (z) {
                    char[] cArr = this.j;
                    int i4 = this.k;
                    long j2 = 0;
                    if (i4 != 19) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            j2 = (j2 * 10) + ((long) (cArr[i5] - '0'));
                        }
                        luaValueJ2 = LuaLong.I2(j2);
                    } else {
                        for (int i6 = 0; i6 < 18; i6++) {
                            j2 = (j2 * 10) + ((long) (cArr[i6] - '0'));
                        }
                        long j3 = (10 * j2) + ((long) (cArr[18] - '0'));
                        if (j3 < j2) {
                            d2 = Double.parseDouble(new String(cArr, 0, i4));
                        } else {
                            luaValueJ2 = LuaLong.I2(j3);
                        }
                    }
                } else {
                    d2 = Double.parseDouble(new String(this.j, 0, this.k));
                }
                luaValueJ2 = LuaDouble.J2(d2);
            }
            hVar.f1617a = luaValueJ2;
        } catch (NumberFormatException e2) {
            T0("malformed number (" + e2.getMessage() + ")", 290);
        }
    }

    void n0(int i2, int i3, String str) {
        int[] iArr = this.q;
        iArr[0] = 117;
        iArr[1] = i2;
        m0(i3, str);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:5:0x0008  */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x001f. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:3:0x0003 for B:15:0x001f already processed. Defaulting to fallback option. */
    void n1(int i2, h hVar) {
        int i3;
        while (true) {
            w1();
            while (true) {
                int i4 = this.f1590b;
                if (i4 != i2) {
                    w1();
                    hVar.f1618b = this.h.d(LuaString.n3(this.j, 1, this.k - 2));
                    return;
                }
                if (i4 != -1) {
                    int iP1 = 10;
                    if (i4 != 10 || i4 == 13) {
                        i3 = 293;
                    } else {
                        if (i4 != 92) {
                            break;
                        }
                        h1();
                        int i5 = this.f1590b;
                        switch (i5) {
                            case -1:
                                break;
                            case 10:
                            case 13:
                                v1(10);
                                J0();
                                break;
                            case 34:
                            case 39:
                            case 92:
                                break;
                            case 97:
                                iP1 = 7;
                                v1(iP1);
                                h1();
                                break;
                            case 98:
                                iP1 = 8;
                                v1(iP1);
                                h1();
                                break;
                            case 102:
                                iP1 = 12;
                                v1(iP1);
                                h1();
                                break;
                            case 110:
                                v1(iP1);
                                h1();
                                break;
                            case 114:
                                iP1 = 13;
                                v1(iP1);
                                h1();
                                break;
                            case 116:
                                iP1 = 9;
                                v1(iP1);
                                h1();
                                break;
                            case 117:
                                q1();
                                break;
                            case 118:
                                iP1 = 11;
                                v1(iP1);
                                h1();
                                break;
                            case 120:
                                iP1 = p1();
                                v1(iP1);
                                h1();
                                break;
                            case 122:
                                while (true) {
                                    h1();
                                    while (true) {
                                        if (P0(this.f1590b)) {
                                            if (j0()) {
                                                J0();
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                if (!O0(i5)) {
                                    this.q[0] = this.f1590b;
                                    m0(1, "invalid escape sequence");
                                } else {
                                    v1(o1());
                                }
                                break;
                        }
                        int i6 = this.f1590b;
                        if (i6 != i2) {
                            w1();
                            hVar.f1618b = this.h.d(LuaString.n3(this.j, 1, this.k - 2));
                            return;
                        } else if (i6 != -1) {
                            int iP2 = 10;
                            if (i6 != 10) {
                            }
                            i3 = 293;
                        } else {
                            i3 = 289;
                        }
                    }
                } else {
                    i3 = 289;
                }
                T0("unfinished string", i3);
            }
        }
    }

    void o0(int i2, String str) {
        n0(123, i2, str);
    }

    int o1() {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 3 && O0(this.f1590b)) {
            int[] iArr = this.q;
            int i4 = this.f1590b;
            iArr[i2] = i4;
            i3 = ((i3 * 10) + i4) - 48;
            h1();
            i2++;
        }
        if (i3 > 255) {
            this.q[i2] = this.f1590b;
            m0(i2 + 1, "decimal escape too large");
        }
        return i3;
    }

    int p0() {
        k kVar = new k();
        r0(kVar);
        int i2 = kVar.f1622a;
        this.f1595g.o0(kVar);
        return i2;
    }

    int p1() {
        int iH0 = 0;
        for (int i2 = 1; i2 < 3; i2++) {
            h1();
            int[] iArr = this.q;
            int i3 = this.f1590b;
            iArr[i2] = i3;
            if (!Q0(i3)) {
                this.q[0] = 120;
                m0(i2 + 1, "hexadecimal digit expected");
            }
            iH0 = (iH0 << 4) + H0(i3);
        }
        return iH0;
    }

    int q0(k kVar) {
        r0(kVar);
        int i2 = 1;
        while (L1(44)) {
            this.f1595g.o0(kVar);
            r0(kVar);
            i2++;
        }
        return i2;
    }

    void q1() {
        int i2;
        h1();
        int i3 = this.f1590b;
        if (i3 != 123) {
            n0(i3, 2, "missing '{', got '" + ((char) i3) + "'");
        }
        int i4 = 2;
        int iH0 = 0;
        while (true) {
            h1();
            if (i4 == 23) {
                o0(i4, "unicode escape too long");
            }
            int[] iArr = this.q;
            i2 = this.f1590b;
            iArr[i4] = i2;
            if (!Q0(i2)) {
                break;
            }
            iH0 = (iH0 << 4) + H0(i2);
            if (iH0 > 1114111) {
                o0(i4 + 1, "UTF-8 value too large: 0x" + Integer.toHexString(iH0) + " (max allowed = 0x" + Integer.toHexString(1114111) + ")");
            }
            i4++;
        }
        if (i4 == 2) {
            o0(3, "hexadecimal digit expected, got '" + ((char) i2) + "'");
        }
        if (i2 != 125) {
            o0(i4 + 1, "missing '}', got '" + ((char) i2) + "'");
        }
        for (byte b2 : new String(Character.toChars(iH0)).getBytes()) {
            v1(b2);
        }
        h1();
    }

    void r0(k kVar) {
        H1(kVar, 0);
    }

    void r1(c cVar) {
        g.c cVar2 = this.f1595g;
        short s2 = cVar2.p;
        k kVar = new k();
        k kVar2 = new k();
        if (this.f1593e.f1619a == 292) {
            cVar2.O(cVar.f1600c, 2147483645, "items in a constructor");
            b0(kVar);
        } else {
            Q1(kVar);
        }
        cVar.f1600c++;
        c0(61);
        int iL0 = cVar2.l0(kVar);
        r0(kVar2);
        cVar2.T(10, cVar.f1599b.f1623b.f1630e, iL0, cVar2.l0(kVar2));
        cVar2.p = s2;
    }

    void s0() {
        g.c cVar = this.f1595g;
        e eVar = new e();
        I1(eVar.f1610b);
        int i2 = this.f1593e.f1619a;
        if (i2 == 61 || i2 == 44) {
            eVar.f1609a = null;
            R(eVar, 1);
        } else {
            X(eVar.f1610b.f1622a == 12, "syntax error");
            g.a.z(cVar.w0(eVar.f1610b), 1);
        }
    }

    int s1(LuaString luaString) {
        g.c cVar = this.f1595g;
        luaj.h hVar = cVar.f1575b;
        ggf.b[] bVarArr = hVar.f1727e;
        if (bVarArr == null || cVar.m + 1 > bVarArr.length) {
            hVar.f1727e = g.a.G(bVarArr, (cVar.m * 2) + 1);
        }
        hVar.f1727e[cVar.m] = new ggf.b(luaString, 0, 0);
        short s2 = cVar.m;
        cVar.m = (short) (s2 + 1);
        return s2;
    }

    void t0(k kVar) {
        g.c cVar = this.f1595g;
        k kVar2 = new k();
        cVar.n0(kVar);
        g1();
        b0(kVar2);
        cVar.E0(kVar, kVar2);
    }

    void t1(int i2) {
        g.c cVar = this.f1595g;
        int iZ0 = cVar.z0();
        g.c.a aVar = new g.c.a();
        g.c.a aVar2 = new g.c.a();
        cVar.j0(aVar, true);
        cVar.j0(aVar2, false);
        g1();
        F1();
        Z(277, 273, i2);
        int iH0 = h0();
        if (aVar2.f1585e) {
            cVar.S0(iH0, aVar2.f1584d);
        }
        cVar.K0();
        cVar.T0(iH0, iZ0);
        cVar.K0();
    }

    void u0(f fVar) {
        f[] fVarArr = this.l.f1605c;
        int i2 = this.f1595g.f1579f.f1583c;
        while (i2 < this.l.f1606d) {
            if (fVarArr[i2].f1611a.P0(fVar.f1611a)) {
                e0(i2, fVar);
            } else {
                i2++;
            }
        }
    }

    void u1() {
        int iQ0;
        g.c cVar = this.f1595g;
        k kVar = new k();
        int iM0 = 0;
        if (T(true) || this.f1593e.f1619a == 59) {
            iQ0 = 0;
        } else {
            iQ0 = q0(kVar);
            if (G0(kVar.f1622a)) {
                cVar.h1(kVar);
                if (kVar.f1622a == 12 && iQ0 == 1) {
                    g.a.B(cVar.w0(kVar), 30);
                    g.a.C(luaj.b.c(cVar.v0(kVar)) == cVar.n);
                }
                iM0 = cVar.n;
                iQ0 = -1;
            } else if (iQ0 == 1) {
                iM0 = cVar.m0(kVar);
            } else {
                cVar.o0(kVar);
                short s2 = cVar.n;
                g.a.C(iQ0 == cVar.p - s2);
                iM0 = s2;
            }
        }
        cVar.c1(iM0, iQ0);
        L1(59);
    }

    boolean v0(int i2) {
        g.c.a aVar = this.f1595g.f1579f;
        d dVar = this.l;
        f fVar = dVar.f1605c[i2];
        for (int i3 = aVar.f1582b; i3 < dVar.f1608f; i3++) {
            f fVar2 = dVar.f1607e[i3];
            if (fVar2.f1611a.P0(fVar.f1611a)) {
                short s2 = fVar.f1614d;
                short s3 = fVar2.f1614d;
                if (s2 > s3 && (aVar.f1585e || dVar.f1608f > aVar.f1582b)) {
                    this.f1595g.S0(fVar.f1612b, s3);
                }
                e0(i2, fVar2);
                return true;
            }
        }
        return false;
    }

    void v1(int i2) {
        char[] cArrE = this.j;
        int i3 = this.k;
        if (cArrE == null || i3 + 1 > cArrE.length) {
            cArrE = g.a.E(cArrE, (i3 * 2) + 1);
            this.j = cArrE;
        }
        cArrE[i3] = (char) i2;
        this.k = i3 + 1;
    }

    void w0(int i2, int i3, int i4, boolean z) {
        int i5;
        g.c.a aVar = new g.c.a();
        g.c cVar = this.f1595g;
        Q(3);
        c0(259);
        int iV = z ? cVar.V(33, i2, -1) : cVar.H0();
        cVar.j0(aVar, false);
        Q(i4);
        cVar.b1(i4);
        S();
        cVar.K0();
        cVar.W0(iV);
        if (z) {
            i5 = 32;
        } else {
            cVar.T(34, i2, 0, i4);
            cVar.s0(i3);
            i2 += 2;
            i5 = 35;
        }
        cVar.T0(cVar.V(i5, i2, -1), iV + 1);
        cVar.s0(i3);
    }

    void w1() {
        v1(this.f1590b);
        h1();
    }

    void x0(LuaString luaString) {
        g.c cVar = this.f1595g;
        k kVar = new k();
        short s2 = cVar.p;
        c1("(for generator)");
        c1("(for state)");
        c1("(for control)");
        b1(luaString);
        int i2 = 4;
        while (L1(44)) {
            b1(G1());
            i2++;
        }
        c0(268);
        int i3 = this.f1591c;
        P(3, q0(kVar), kVar);
        cVar.Q(3);
        w0(s2, i3, i2 - 3, false);
    }

    void x1(String str) {
        this.f1593e.f1619a = 0;
        J1(str);
    }

    void y0(LuaString luaString, int i2) {
        g.c cVar = this.f1595g;
        short s2 = cVar.p;
        c1("(for index)");
        c1("(for limit)");
        c1("(for step)");
        b1(luaString);
        c0(61);
        p0();
        c0(44);
        p0();
        if (L1(44)) {
            p0();
        } else {
            cVar.W(cVar.p, cVar.R0(LuaLong.I2(1L)));
            cVar.b1(1);
        }
        w0(s2, i2, 1, true);
    }

    void y1(g.h.a aVar, int i2, InputStream inputStream, LuaString luaString) {
        this.o = (byte) 46;
        this.h = aVar;
        this.f1594f.f1619a = 289;
        this.i = inputStream;
        this.f1595g = null;
        this.f1591c = 1;
        this.f1592d = 1;
        this.m = luaString;
        this.n = LuaValue.k;
        this.k = 0;
        this.f1590b = i2;
        B1();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    void z0(int i2) {
        g.c cVar = this.f1595g;
        cVar.j0(new g.c.a(), true);
        g1();
        LuaString luaStringG1 = G1();
        int i3 = this.f1593e.f1619a;
        if (i3 == 44) {
            x0(luaStringG1);
        } else if (i3 == 61) {
            y0(luaStringG1, i2);
        } else if (i3 != 268) {
            J1(M("=") + " or " + M("in") + " expected");
        } else {
            x0(luaStringG1);
        }
        Z(262, 264, i2);
        cVar.K0();
    }

    void z1(k kVar) {
        int i2;
        i iVar = this.f1593e;
        int i3 = iVar.f1619a;
        if (i3 == 123) {
            i0(kVar);
            return;
        }
        if (i3 != 263) {
            if (i3 == 265) {
                g1();
                U(kVar, false, this.f1591c);
                return;
            }
            if (i3 == 270) {
                kVar.b(1, 0);
            } else if (i3 == 276) {
                i2 = 2;
            } else if (i3 == 281) {
                g.c cVar = this.f1595g;
                X(cVar.f1575b.k != 0, "cannot use " + M("...") + " outside a vararg function");
                kVar.b(13, cVar.T(38, 0, 1, 0));
            } else if (i3 == 290) {
                kVar.b(5, 0);
                kVar.f1623b.b(this.f1593e.f1620b.f1617a);
            } else {
                if (i3 != 293) {
                    I1(kVar);
                    return;
                }
                g0(kVar, iVar.f1620b.f1618b);
            }
            g1();
        }
        i2 = 3;
        kVar.b(i2, 0);
        g1();
    }
}
