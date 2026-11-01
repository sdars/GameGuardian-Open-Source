package g;

import java.util.Hashtable;
import luaj.LuaString;
import luaj.LuaValue;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c extends g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    luaj.h f1573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Hashtable f1574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    c f1575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f1576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    a f1577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1578g;
    int h;
    e i;
    int j;
    int k;
    int l;
    short m;
    short n;
    short o;
    short p;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f1579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        short f1580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        short f1581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        short f1582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f1583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f1584f;

        a() {
        }

        public String toString() {
            return "BlockCnt [firstlabel=" + ((int) this.f1580b) + ", firstgoto=" + ((int) this.f1581c) + ", nactvar=" + ((int) this.f1582d) + ", upval=" + this.f1583e + ", isloop=" + this.f1584f + ']';
        }
    }

    c() {
    }

    static int k1(c cVar, LuaString luaString, g.k kVar, int i) {
        if (cVar == null) {
            return 0;
        }
        int iE1 = cVar.e1(luaString);
        if (iE1 >= 0) {
            kVar.b(7, iE1);
            if (i == 0) {
                cVar.L0(iE1);
            }
            return 7;
        }
        int iD1 = cVar.d1(luaString);
        if (iD1 < 0) {
            if (k1(cVar.f1575d, luaString, kVar, 0) == 0) {
                return 0;
            }
            iD1 = cVar.O0(luaString, kVar);
        }
        kVar.b(8, iD1);
        return 8;
    }

    static boolean n1(int i) {
        return i == 6 || i == 7;
    }

    f.b A0(int i) {
        short s = this.f1576e.l.f1601a[this.l + i].f1619a;
        g.a.C(s < this.m);
        return this.f1573b.f1725e[s];
    }

    void B0(g.k kVar) {
        int iI0;
        i0(kVar);
        int i = kVar.f1620a;
        if (i == 1 || i == 3) {
            iI0 = -1;
        } else {
            iI0 = i != 10 ? I0(kVar, 1) : kVar.f1621b.f1628e;
        }
        c0(kVar.f1622c, iI0);
        W0(kVar.f1623d.f1587a);
        kVar.f1623d.f1587a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    void C0(g.k kVar) {
        int iI0;
        i0(kVar);
        int i = kVar.f1620a;
        if (i == 2) {
            iI0 = -1;
        } else if (i == 10) {
            G0(kVar);
            iI0 = kVar.f1621b.f1628e;
        } else if (i == 4 || i == 5) {
            iI0 = -1;
        } else {
            iI0 = I0(kVar, 0);
        }
        c0(kVar.f1623d, iI0);
        W0(kVar.f1622c.f1587a);
        kVar.f1622c.f1587a = -1;
    }

    boolean D0(int i) {
        return i == 12 || i == 13;
    }

    void E0(g.k kVar, g.k kVar2) {
        g.k.a aVar = kVar.f1621b;
        aVar.f1625b = (short) aVar.f1628e;
        aVar.f1624a = (short) l0(kVar2);
        int i = kVar.f1620a;
        g.a.C(i == 8 || n1(i));
        kVar.f1621b.f1626c = (short) (kVar.f1620a != 8 ? 7 : 8);
        kVar.f1620a = 9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    void F0(int i, g.k kVar) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (kVar.c()) {
                }
                l0(kVar);
                break;
            case 6:
                o0(kVar);
                break;
            default:
                switch (i) {
                    case 13:
                        C0(kVar);
                        break;
                    case 14:
                        B0(kVar);
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        if (kVar.c()) {
                        }
                        break;
                }
                l0(kVar);
                break;
        }
    }

    void G0(g.k kVar) {
        d dVarY0 = y0(kVar.f1621b.f1628e);
        g.a.C((!luaj.b.r(luaj.b.i(dVarY0.a())) || luaj.b.i(dVarY0.a()) == 28 || luaj.b.i(dVarY0.a()) == 27) ? false : true);
        g.a.v(dVarY0, luaj.b.c(dVarY0.a()) == 0 ? 1 : 0);
    }

    int H0() {
        e eVar = this.i;
        int i = eVar.f1587a;
        eVar.f1587a = -1;
        e eVar2 = new e(V(23, 0, -1));
        c0(eVar2, i);
        return eVar2.f1587a;
    }

    int I0(g.k kVar, int i) {
        if (kVar.f1620a == 11) {
            int iV0 = v0(kVar);
            if (luaj.b.i(iV0) == 20) {
                this.f1578g--;
                return d0(27, luaj.b.e(iV0), 0, i != 0 ? 0 : 1);
            }
        }
        f0(kVar);
        t0(kVar);
        return d0(28, 255, kVar.f1621b.f1628e, i);
    }

    void J0(g.c cVar) {
        if (cVar.f1600e == 0) {
            return;
        }
        if (D0(cVar.f1596a.f1620a)) {
            h1(cVar.f1596a);
            g1(cVar.f1597b.f1621b.f1628e, cVar.f1599d, -1);
            cVar.f1599d--;
        } else {
            g.k kVar = cVar.f1596a;
            if (kVar.f1620a != 0) {
                o0(kVar);
            }
            g1(cVar.f1597b.f1621b.f1628e, cVar.f1599d, cVar.f1600e);
        }
    }

    void K0() {
        a aVar = this.f1577f;
        if (aVar.f1579a != null && aVar.f1583e) {
            int iH0 = H0();
            S0(iH0, aVar.f1582d);
            W0(iH0);
        }
        if (aVar.f1584f) {
            this.f1576e.V();
        }
        this.f1577f = aVar.f1579a;
        a1(aVar.f1582d);
        g.a.C(aVar.f1582d == this.n);
        this.p = this.n;
        g gVar = this.f1576e;
        g.d dVar = gVar.l;
        dVar.f1606f = aVar.f1580b;
        if (aVar.f1579a != null) {
            M0(aVar);
            return;
        }
        short s = aVar.f1581c;
        if (s < dVar.f1604d) {
            gVar.O1(dVar.f1603c[s], this, aVar);
        }
    }

    void L0(int i) {
        a aVar = this.f1577f;
        while (aVar.f1582d > i) {
            aVar = aVar.f1579a;
        }
        aVar.f1583e = true;
    }

    int M(LuaValue luaValue) {
        Hashtable hashtable = this.f1574c;
        if (hashtable == null) {
            hashtable = new Hashtable();
            this.f1574c = hashtable;
        } else {
            Integer num = (Integer) hashtable.get(luaValue);
            if (num != null) {
                return num.intValue();
            }
        }
        int i = this.j;
        hashtable.put(luaValue, Integer.valueOf(i));
        luaj.h hVar = this.f1573b;
        LuaValue[] luaValueArr = hVar.f1721a;
        if (luaValueArr == null || this.j + 1 >= luaValueArr.length) {
            hVar.f1721a = g.a.K(luaValueArr, (this.j * 2) + 1);
        }
        LuaValue[] luaValueArr2 = hVar.f1721a;
        int i2 = this.j;
        this.j = i2 + 1;
        luaValueArr2[i2] = luaValue;
        return i;
    }

    void M0(a aVar) {
        int i = aVar.f1581c;
        g.f[] fVarArr = this.f1576e.l.f1603c;
        while (i < this.f1576e.l.f1604d) {
            g.f fVar = fVarArr[i];
            short s = fVar.f1612d;
            short s2 = aVar.f1582d;
            if (s > s2) {
                if (aVar.f1583e) {
                    S0(fVar.f1610b, s2);
                }
                fVar.f1612d = aVar.f1582d;
            }
            if (!this.f1576e.v0(i)) {
                i++;
            }
        }
    }

    int N(boolean z) {
        return M(z ? LuaValue.f1672d : LuaValue.f1673e);
    }

    boolean N0(int i) {
        while (i != -1) {
            if (luaj.b.i(y0(i).a()) != 28) {
                return true;
            }
            i = x0(i);
        }
        return false;
    }

    void O(int i, int i2, String str) {
        if (i > i2) {
            k0(i2, str);
        }
    }

    int O0(LuaString luaString, g.k kVar) {
        O(this.o + 1, 255, "upvalues");
        luaj.h hVar = this.f1573b;
        f.d[] dVarArr = hVar.f1726f;
        if (dVarArr == null || this.o + 1 > dVarArr.length) {
            short s = this.o;
            hVar.f1726f = g.a.H(dVarArr, s > 0 ? s * 2 : 1);
        }
        this.f1573b.f1726f[this.o] = new f.d(luaString, kVar.f1620a == 7, kVar.f1621b.f1628e);
        short s2 = this.o;
        this.o = (short) (s2 + 1);
        return s2;
    }

    void P(g.f[] fVarArr, int i, LuaString luaString) {
        for (int i2 = this.f1577f.f1580b; i2 < i; i2++) {
            if (luaString.P0(fVarArr[i2].f1609a)) {
                this.f1576e.x1(this.f1576e.h.e("label '" + luaString + "' already defined on line " + fVarArr[i2].f1611c));
            }
        }
    }

    void P0(int i, int i2) {
        int i3 = i + i2;
        int i4 = i3 - 1;
        int i5 = this.f1578g;
        if (i5 > this.h && i5 > 0) {
            int i6 = this.f1573b.f1722b[i5 - 1];
            if (luaj.b.i(i6) == 4) {
                int iC = luaj.b.c(i6);
                int iE = luaj.b.e(i6) + iC;
                if ((iC <= i && i <= iE + 1) || (i <= iC && iC <= i3)) {
                    if (iC < i) {
                        i = iC;
                    }
                    if (iE > i4) {
                        i4 = iE;
                    }
                    d dVar = new d(this.f1573b.f1722b, this.f1578g - 1);
                    g.a.v(dVar, i);
                    g.a.x(dVar, i4 - i);
                    return;
                }
            }
        }
        T(4, i, i2 - 1, 0);
    }

    void Q(int i) {
        int i2 = this.p + i;
        if (i2 > this.f1573b.l) {
            if (i2 >= 250) {
                this.f1576e.J1("function or expression needs too many registers");
            }
            this.f1573b.l = i2;
        }
    }

    int Q0() {
        return M(LuaValue.f1671c);
    }

    void R(g.c cVar) {
        g.k kVar = cVar.f1596a;
        if (kVar.f1620a == 0) {
            return;
        }
        o0(kVar);
        cVar.f1596a.f1620a = 0;
        int i = cVar.f1600e;
        if (i == 50) {
            g1(cVar.f1597b.f1621b.f1628e, cVar.f1599d, i);
            cVar.f1600e = 0;
        }
    }

    int R0(LuaValue luaValue) {
        return M(luaValue);
    }

    int S(int i, int i2) {
        luaj.h hVar = this.f1573b;
        h0();
        int[] iArr = hVar.f1722b;
        if (iArr == null || this.f1578g + 1 > iArr.length) {
            hVar.f1722b = g.a.F(iArr, (this.f1578g * 2) + 1);
        }
        int[] iArr2 = hVar.f1722b;
        int i3 = this.f1578g;
        iArr2[i3] = i;
        int[] iArr3 = hVar.f1724d;
        if (iArr3 == null || i3 + 1 > iArr3.length) {
            hVar.f1724d = g.a.F(iArr3, (i3 * 2) + 1);
        }
        int[] iArr4 = hVar.f1724d;
        int i4 = this.f1578g;
        iArr4[i4] = i2;
        this.f1578g = i4 + 1;
        return i4;
    }

    void S0(int i, int i2) {
        int i3 = i2 + 1;
        while (i != -1) {
            int iX0 = x0(i);
            g.a.C(luaj.b.i(this.f1573b.f1722b[i]) == 23 && (luaj.b.c(this.f1573b.f1722b[i]) == 0 || luaj.b.c(this.f1573b.f1722b[i]) >= i3));
            g.a.w(this.f1573b.f1722b, i, i3);
            i = iX0;
        }
    }

    int T(int i, int i2, int i3, int i4) {
        g.a.C(luaj.b.p(i) == 0);
        g.a.C(luaj.b.n(i) != 0 || i3 == 0);
        g.a.C(luaj.b.o(i) != 0 || i4 == 0);
        return S(g.a.s(i, i2, i3, i4), this.f1576e.f1590d);
    }

    void T0(int i, int i2) {
        int i3 = this.f1578g;
        if (i2 == i3) {
            W0(i);
        } else {
            g.a.C(i2 < i3);
            U0(i, i2, 255, i2);
        }
    }

    int U(int i, int i2, int i3) {
        boolean z = false;
        g.a.C(luaj.b.p(i) == 1 || luaj.b.p(i) == 2);
        g.a.C(luaj.b.o(i) == 0);
        if (i3 >= 0 && i3 <= 262143) {
            z = true;
        }
        g.a.C(z);
        return S(g.a.t(i, i2, i3), this.f1576e.f1590d);
    }

    void U0(int i, int i2, int i3, int i4) {
        while (i != -1) {
            int iX0 = x0(i);
            if (V0(i, i3)) {
                r0(i, i2);
            } else {
                r0(i, i4);
            }
            i = iX0;
        }
    }

    int V(int i, int i2, int i3) {
        return U(i, i2, i3 + 131071);
    }

    boolean V0(int i, int i2) {
        d dVarY0 = y0(i);
        if (luaj.b.i(dVarY0.a()) != 28) {
            return false;
        }
        if (i2 == 255 || i2 == luaj.b.e(dVarY0.a())) {
            dVarY0.b(g.a.s(27, luaj.b.e(dVarY0.a()), 0, luaj.b.g(dVarY0.a())));
            return true;
        }
        g.a.v(dVarY0, i2);
        return true;
    }

    int W(int i, int i2) {
        if (i2 <= 262143) {
            return U(1, i, i2);
        }
        int iU = U(2, i, 0);
        a0(i2);
        return iU;
    }

    void W0(int i) {
        z0();
        c0(this.i, i);
    }

    int X(int i, int i2, int i3) {
        z0();
        return T(3, i, i2, i3);
    }

    void X0(int i, g.k kVar, g.k kVar2, int i2) {
        int i3;
        e eVar;
        e eVar2;
        switch (i) {
            case 0:
                i3 = 13;
                Y(i3, kVar, kVar2, i2);
                break;
            case 1:
                i3 = 14;
                Y(i3, kVar, kVar2, i2);
                break;
            case 2:
                i3 = 15;
                Y(i3, kVar, kVar2, i2);
                break;
            case 3:
                i3 = 16;
                Y(i3, kVar, kVar2, i2);
                break;
            case 4:
                i3 = 17;
                Y(i3, kVar, kVar2, i2);
                break;
            case 5:
                i3 = 18;
                Y(i3, kVar, kVar2, i2);
                break;
            case 6:
                q0(kVar2);
                if (kVar2.f1620a == 11 && luaj.b.i(v0(kVar2)) == 22) {
                    g.a.C(kVar.f1621b.f1628e == luaj.b.e(v0(kVar2)) - 1);
                    t0(kVar);
                    g.a.x(w0(kVar2), kVar.f1621b.f1628e);
                    kVar.f1620a = 11;
                    kVar.f1621b.f1628e = kVar2.f1621b.f1628e;
                } else {
                    o0(kVar2);
                    Y(22, kVar, kVar2, i2);
                }
                break;
            case 7:
                Z(24, 0, kVar, kVar2);
                break;
            case 8:
                Z(24, 1, kVar, kVar2);
                break;
            case 9:
                Z(25, 1, kVar, kVar2);
                break;
            case 10:
                Z(26, 1, kVar, kVar2);
                break;
            case 11:
                Z(25, 0, kVar, kVar2);
                break;
            case 12:
                Z(26, 0, kVar, kVar2);
                break;
            case 13:
                g.a.C(kVar.f1622c.f1587a == -1);
                i0(kVar2);
                eVar = kVar2.f1623d;
                eVar2 = kVar.f1623d;
                c0(eVar, eVar2.f1587a);
                kVar.d(kVar2);
                break;
            case 14:
                g.a.C(kVar.f1623d.f1587a == -1);
                i0(kVar2);
                eVar = kVar2.f1622c;
                eVar2 = kVar.f1622c;
                c0(eVar, eVar2.f1587a);
                kVar.d(kVar2);
                break;
            case 15:
                i3 = 40;
                Y(i3, kVar, kVar2, i2);
                break;
            case 16:
                i3 = 42;
                Y(i3, kVar, kVar2, i2);
                break;
            case 17:
                i3 = 43;
                Y(i3, kVar, kVar2, i2);
                break;
            case 18:
                i3 = 44;
                Y(i3, kVar, kVar2, i2);
                break;
            case 19:
                i3 = 45;
                Y(i3, kVar, kVar2, i2);
                break;
            case 20:
                i3 = 46;
                Y(i3, kVar, kVar2, i2);
                break;
            default:
                g.a.C(false);
                break;
        }
    }

    void Y(int i, g.k kVar, g.k kVar2, int i2) {
        if (e0(i, kVar, kVar2)) {
            return;
        }
        int iL0 = (i == 19 || i == 21 || i == 41) ? 0 : l0(kVar2);
        int iL1 = l0(kVar);
        if (iL1 > iL0) {
            t0(kVar);
            t0(kVar2);
        } else {
            t0(kVar2);
            t0(kVar);
        }
        kVar.f1621b.f1628e = T(i, 0, iL1, iL0);
        kVar.f1620a = 11;
        s0(i2);
    }

    void Y0(int i, g.k kVar, int i2) {
        int i3;
        g.k.a aVar;
        LuaValue luaValueA1;
        g.k kVar2 = new g.k();
        kVar2.b(5, 0);
        if (i == 0) {
            if (kVar.c()) {
                aVar = kVar.f1621b;
                luaValueA1 = aVar.a().A1();
                aVar.b(luaValueA1);
                return;
            } else {
                m0(kVar);
                i3 = 19;
                Y(i3, kVar, kVar2, i2);
            }
        }
        if (i == 1) {
            b0(kVar);
            return;
        }
        if (i == 2) {
            m0(kVar);
            i3 = 21;
        } else if (i != 4) {
            g.a.C(false);
            return;
        } else {
            if (kVar.c()) {
                aVar = kVar.f1621b;
                luaValueA1 = aVar.a().q0();
                aVar.b(luaValueA1);
                return;
            }
            m0(kVar);
            i3 = 41;
        }
        Y(i3, kVar, kVar2, i2);
    }

    void Z(int i, int i2, g.k kVar, g.k kVar2) {
        int iL0 = l0(kVar);
        int iL1 = l0(kVar2);
        t0(kVar2);
        t0(kVar);
        if (i2 == 0 && i != 24) {
            i2 = 1;
            iL1 = iL0;
            iL0 = iL1;
        }
        kVar.f1621b.f1628e = d0(i, i2, iL0, iL1);
        kVar.f1620a = 10;
    }

    void Z0(int i) {
        while (i != -1) {
            V0(i, 255);
            i = x0(i);
        }
    }

    int a0(int i) {
        g.a.C(i <= 67108863);
        return S(g.a.u(39, i), this.f1576e.f1590d);
    }

    void a1(int i) {
        this.f1576e.l.f1602b -= this.n - i;
        while (true) {
            short s = this.n;
            if (s <= i) {
                return;
            }
            short s2 = (short) (s - 1);
            this.n = s2;
            A0(s2).f1558c = this.f1578g;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    void b0(g.k kVar) {
        int i;
        i0(kVar);
        int i2 = kVar.f1620a;
        if (i2 == 10) {
            G0(kVar);
        } else if (i2 != 11) {
            switch (i2) {
                case 1:
                case 3:
                    i = 2;
                    kVar.f1620a = i;
                    break;
                case 2:
                case 4:
                case 5:
                    i = 3;
                    kVar.f1620a = i;
                    break;
                case 6:
                    f0(kVar);
                    t0(kVar);
                    g.k.a aVar = kVar.f1621b;
                    aVar.f1628e = T(20, 0, aVar.f1628e, 0);
                    kVar.f1620a = 11;
                    break;
                default:
                    g.a.C(false);
                    break;
            }
        } else {
            f0(kVar);
            t0(kVar);
            g.k.a aVar2 = kVar.f1621b;
            aVar2.f1628e = T(20, 0, aVar2.f1628e, 0);
            kVar.f1620a = 11;
        }
        e eVar = kVar.f1623d;
        int i3 = eVar.f1587a;
        e eVar2 = kVar.f1622c;
        eVar.f1587a = eVar2.f1587a;
        eVar2.f1587a = i3;
        Z0(eVar.f1587a);
        Z0(kVar.f1622c.f1587a);
    }

    void b1(int i) {
        Q(i);
        this.p = (short) (this.p + i);
    }

    void c0(e eVar, int i) {
        if (i == -1) {
            return;
        }
        int i2 = eVar.f1587a;
        if (i2 == -1) {
            eVar.f1587a = i;
            return;
        }
        while (true) {
            int iX0 = x0(i2);
            if (iX0 == -1) {
                r0(i2, i);
                return;
            }
            i2 = iX0;
        }
    }

    void c1(int i, int i2) {
        T(31, i, i2 + 1, 0);
    }

    int d0(int i, int i2, int i3, int i4) {
        T(i, i2, i3, i4);
        return H0();
    }

    int d1(LuaString luaString) {
        f.d[] dVarArr = this.f1573b.f1726f;
        for (int i = 0; i < this.o; i++) {
            if (dVarArr[i].f1563a.P0(luaString)) {
                return i;
            }
        }
        return -1;
    }

    boolean e0(int i, g.k kVar, g.k kVar2) {
        LuaValue luaValueJ0;
        if (!kVar.c() || !kVar2.c() || ((i == 16 || i == 40 || i == 17) && kVar2.f1621b.a().P0(LuaValue.f1675g))) {
            return false;
        }
        LuaValue luaValueA = kVar.f1621b.a();
        LuaValue luaValueA2 = kVar2.f1621b.a();
        if (i != 21) {
            switch (i) {
                case 13:
                    luaValueJ0 = luaValueA.j0(luaValueA2);
                    break;
                case 14:
                    luaValueJ0 = luaValueA.r2(luaValueA2);
                    break;
                case 15:
                    luaValueJ0 = luaValueA.z1(luaValueA2);
                    break;
                case 16:
                    luaValueJ0 = luaValueA.O0(luaValueA2);
                    break;
                case 17:
                    luaValueJ0 = luaValueA.y1(luaValueA2);
                    break;
                case 18:
                    luaValueJ0 = luaValueA.Q1(luaValueA2);
                    break;
                case 19:
                    luaValueJ0 = luaValueA.A1();
                    break;
                default:
                    switch (i) {
                        case 40:
                            luaValueJ0 = luaValueA.Z0(luaValueA2);
                            break;
                        case 41:
                            if (!luaValueA.k1()) {
                                return false;
                            }
                            luaValueJ0 = luaValueA.q0();
                            break;
                            break;
                        case 42:
                            if (!luaValueA.k1() || !luaValueA2.k1()) {
                                return false;
                            }
                            luaValueJ0 = luaValueA.o0(luaValueA2);
                            break;
                            break;
                        case 43:
                            if (!luaValueA.k1() || !luaValueA2.k1()) {
                                return false;
                            }
                            luaValueJ0 = luaValueA.r0(luaValueA2);
                            break;
                            break;
                        case 44:
                            if (!luaValueA.k1() || !luaValueA2.k1()) {
                                return false;
                            }
                            luaValueJ0 = luaValueA.t0(luaValueA2);
                            break;
                            break;
                        case 45:
                            if (!luaValueA.k1() || !luaValueA2.k1()) {
                                return false;
                            }
                            luaValueJ0 = luaValueA.m2(luaValueA2);
                            break;
                            break;
                        case 46:
                            if (!luaValueA.k1() || !luaValueA2.k1()) {
                                return false;
                            }
                            luaValueJ0 = luaValueA.n2(luaValueA2);
                            break;
                            break;
                        default:
                            g.a.C(false);
                            luaValueJ0 = null;
                            break;
                    }
                    break;
            }
            if (luaValueJ0 != null && !Double.isNaN(luaValueJ0.x2())) {
                kVar.f1621b.b(luaValueJ0);
                return true;
            }
        }
        return false;
    }

    int e1(LuaString luaString) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (luaString.P0(A0(i).f1556a)) {
                return i;
            }
        }
        return -1;
    }

    void f0(g.k kVar) {
        if (kVar.f1620a != 6) {
            b1(1);
            g0(kVar, this.p - 1);
        }
    }

    void f1(g.k kVar, g.k kVar2) {
        m0(kVar);
        t0(kVar);
        short s = this.p;
        b1(2);
        T(12, s, kVar.f1621b.f1628e, l0(kVar2));
        t0(kVar2);
        kVar.f1621b.f1628e = s;
        kVar.f1620a = 6;
    }

    void g0(g.k kVar, int i) {
        int iR0;
        i0(kVar);
        int i2 = kVar.f1620a;
        if (i2 != 11) {
            z = true;
            boolean z = true;
            switch (i2) {
                case 1:
                    P0(i, 1);
                    break;
                case 2:
                case 3:
                    T(3, i, i2 != 2 ? 0 : 1, 0);
                    break;
                case 4:
                    iR0 = kVar.f1621b.f1628e;
                    W(i, iR0);
                    break;
                case 5:
                    iR0 = R0(kVar.f1621b.a());
                    W(i, iR0);
                    break;
                case 6:
                    int i3 = kVar.f1621b.f1628e;
                    if (i != i3) {
                        T(0, i, i3, 0);
                    }
                    break;
                default:
                    if (i2 != 0 && i2 != 10) {
                        z = false;
                    }
                    g.a.C(z);
                    break;
            }
            return;
        }
        g.a.v(w0(kVar), i);
        kVar.f1621b.f1628e = i;
        kVar.f1620a = 6;
    }

    void g1(int i, int i2, int i3) {
        int i4 = ((i2 - 1) / 50) + 1;
        if (i3 == -1) {
            i3 = 0;
        }
        if (i4 <= 511) {
            T(36, i, i3, i4);
        } else {
            T(36, i, i3, 0);
            S(i4, this.f1576e.f1590d);
        }
        this.p = (short) (i + 1);
    }

    void h0() {
        int i = this.i.f1587a;
        int i2 = this.f1578g;
        U0(i, i2, 255, i2);
        this.i.f1587a = -1;
    }

    void h1(g.k kVar) {
        j1(kVar, -1);
    }

    void i0(g.k kVar) {
        g.k.a aVar;
        int iT;
        int i = kVar.f1620a;
        int i2 = 6;
        if (i == 7) {
            kVar.f1620a = 6;
            return;
        }
        if (i == 8) {
            aVar = kVar.f1621b;
            iT = T(5, 0, aVar.f1628e, 0);
        } else {
            if (i != 9) {
                if (i == 12 || i == 13) {
                    i1(kVar);
                    return;
                }
                return;
            }
            u0(kVar.f1621b.f1624a);
            g.k.a aVar2 = kVar.f1621b;
            if (aVar2.f1626c == 7) {
                u0(aVar2.f1625b);
                i2 = 7;
            }
            aVar = kVar.f1621b;
            iT = T(i2, 0, aVar.f1625b, aVar.f1624a);
        }
        aVar.f1628e = iT;
        kVar.f1620a = 11;
    }

    void i1(g.k kVar) {
        int i = kVar.f1620a;
        if (i == 12) {
            kVar.f1620a = 6;
            kVar.f1621b.f1628e = luaj.b.c(v0(kVar));
        } else if (i == 13) {
            g.a.x(w0(kVar), 2);
            kVar.f1620a = 11;
        }
    }

    void j0(a aVar, boolean z) {
        aVar.f1584f = z;
        short s = this.n;
        aVar.f1582d = s;
        g.d dVar = this.f1576e.l;
        aVar.f1580b = (short) dVar.f1606f;
        aVar.f1581c = (short) dVar.f1604d;
        aVar.f1583e = false;
        aVar.f1579a = this.f1577f;
        this.f1577f = aVar;
        g.a.C(this.p == s);
    }

    void j1(g.k kVar, int i) {
        int i2 = kVar.f1620a;
        if (i2 == 12) {
            g.a.z(w0(kVar), i + 1);
        } else if (i2 == 13) {
            g.a.x(w0(kVar), i + 1);
            g.a.v(w0(kVar), this.p);
            b1(1);
        }
    }

    void k0(int i, String str) {
        h.a aVar;
        StringBuilder sb;
        String str2;
        if (this.f1573b.h == 0) {
            aVar = this.f1576e.h;
            sb = new StringBuilder();
            str2 = "main function has more than ";
        } else {
            aVar = this.f1576e.h;
            sb = new StringBuilder();
            sb.append("function at line ");
            sb.append(this.f1573b.h);
            str2 = " has more than ";
        }
        sb.append(str2);
        sb.append(i);
        sb.append(' ');
        sb.append(str);
        this.f1576e.T0(aVar.e(sb.toString()), 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    int l0(g.k kVar) {
        int iN;
        int i;
        q0(kVar);
        int i2 = kVar.f1620a;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            if (this.j <= 255) {
                g.k.a aVar = kVar.f1621b;
                if (i2 == 1) {
                    iN = Q0();
                } else {
                    iN = N(i2 == 2);
                }
                aVar.f1628e = iN;
                kVar.f1620a = 4;
                return luaj.b.l(kVar.f1621b.f1628e);
            }
        } else if (i2 == 4) {
            i = kVar.f1621b.f1628e;
            if (i <= 255) {
                return luaj.b.l(i);
            }
        } else if (i2 == 5) {
            g.k.a aVar2 = kVar.f1621b;
            aVar2.f1628e = R0(aVar2.a());
            kVar.f1620a = 4;
            i = kVar.f1621b.f1628e;
            if (i <= 255) {
                return luaj.b.l(i);
            }
        }
        return m0(kVar);
    }

    void l1(g.k kVar, g.k kVar2) {
        int i = kVar.f1620a;
        if (i == 7) {
            t0(kVar2);
            p0(kVar2, kVar.f1621b.f1628e);
            return;
        }
        if (i == 8) {
            T(9, m0(kVar2), kVar.f1621b.f1628e, 0);
        } else if (i != 9) {
            g.a.C(false);
        } else {
            int i2 = kVar.f1621b.f1626c == 7 ? 10 : 8;
            int iL0 = l0(kVar2);
            g.k.a aVar = kVar.f1621b;
            T(i2, aVar.f1625b, aVar.f1624a, iL0);
        }
        t0(kVar2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    int m0(g.k kVar) {
        i0(kVar);
        if (kVar.f1620a != 6) {
            o0(kVar);
        } else if (kVar.a()) {
            int i = kVar.f1621b.f1628e;
            if (i >= this.n) {
                p0(kVar, i);
            } else {
                o0(kVar);
            }
        }
        return kVar.f1621b.f1628e;
    }

    int m1(LuaString luaString) {
        return M(luaString);
    }

    void n0(g.k kVar) {
        if (kVar.f1620a != 8 || kVar.a()) {
            m0(kVar);
        }
    }

    void o0(g.k kVar) {
        i0(kVar);
        t0(kVar);
        b1(1);
        p0(kVar, this.p - 1);
    }

    void p0(g.k kVar, int i) {
        int iX;
        int iX2;
        g0(kVar, i);
        if (kVar.f1620a == 10) {
            c0(kVar.f1622c, kVar.f1621b.f1628e);
        }
        if (kVar.a()) {
            if (N0(kVar.f1622c.f1587a) || N0(kVar.f1623d.f1587a)) {
                int iH0 = kVar.f1620a == 10 ? -1 : H0();
                iX = X(i, 0, 1);
                iX2 = X(i, 1, 0);
                W0(iH0);
            } else {
                iX2 = -1;
                iX = -1;
            }
            int iZ0 = z0();
            U0(kVar.f1623d.f1587a, iZ0, i, iX);
            U0(kVar.f1622c.f1587a, iZ0, i, iX2);
        }
        e eVar = kVar.f1623d;
        kVar.f1622c.f1587a = -1;
        eVar.f1587a = -1;
        kVar.f1621b.f1628e = i;
        kVar.f1620a = 6;
    }

    void q0(g.k kVar) {
        if (kVar.a()) {
            m0(kVar);
        } else {
            i0(kVar);
        }
    }

    void r0(int i, int i2) {
        d dVar = new d(this.f1573b.f1722b, i);
        int i3 = i2 - (i + 1);
        g.a.C(i2 != -1);
        if (Math.abs(i3) > 131071) {
            this.f1576e.J1("control structure too long");
        }
        g.a.A(dVar, i3);
    }

    void s0(int i) {
        this.f1573b.f1724d[this.f1578g - 1] = i;
    }

    void t0(g.k kVar) {
        if (kVar.f1620a == 6) {
            u0(kVar.f1621b.f1628e);
        }
    }

    public String toString() {
        return "FuncState [pc=" + this.f1578g + ", lasttarget=" + this.h + ", nk=" + this.j + ", np=" + this.k + ", firstlocal=" + this.l + ", nlocvars=" + ((int) this.m) + ", nactvar=" + ((int) this.n) + ", nups=" + ((int) this.o) + ", freereg=" + ((int) this.p) + ']';
    }

    void u0(int i) {
        if (luaj.b.k(i) || i < this.n) {
            return;
        }
        short s = (short) (this.p - 1);
        this.p = s;
        g.a.C(i == s);
    }

    int v0(g.k kVar) {
        return this.f1573b.f1722b[kVar.f1621b.f1628e];
    }

    d w0(g.k kVar) {
        return new d(this.f1573b.f1722b, kVar.f1621b.f1628e);
    }

    int x0(int i) {
        int iH = luaj.b.h(this.f1573b.f1722b[i]);
        if (iH == -1) {
            return -1;
        }
        return i + 1 + iH;
    }

    d y0(int i) {
        d dVar = new d(this.f1573b.f1722b, i);
        return (i < 1 || !luaj.b.r(luaj.b.i(dVar.f1585a[dVar.f1586b - 1]))) ? dVar : new d(dVar.f1585a, dVar.f1586b - 1);
    }

    int z0() {
        int i = this.f1578g;
        this.h = i;
        return i;
    }
}
