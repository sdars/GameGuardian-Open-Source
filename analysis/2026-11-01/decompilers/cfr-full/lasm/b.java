/*
 * Decompiled with CFR 0.152.
 */
package lasm;

import d.d;
import e.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import lasm.LasmBase;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.h;

public class b
extends h {
    a[] A;
    g.f B;
    HashMap C;
    HashMap D;
    HashMap E;
    int p = 0;
    int q = 0;
    int r = 0;
    int s = 0;
    int t = 0;
    int u = 0;
    int v = 0;
    a[] w;
    int x = 0;
    a[] y;
    int z = 0;

    b() {
        this.a = new LuaValue[8];
        this.b = new int[8];
        this.c = new h[8];
        this.d = new int[8];
        this.e = new f.b[8];
        this.f = new f.d[8];
        this.w = new a[8];
        this.y = new a[8];
        this.C = new HashMap();
        this.D = new HashMap();
        this.E = new HashMap();
        this.B = new g.f(this);
    }

    int c(LuaValue luaValue) {
        int n3 = luaValue instanceof LasmBase.Internal ? luaValue.C2() : luaj.b.l(this.m(luaValue));
        return n3;
    }

    void d(f objectArray, b object) {
        String string2 = objectArray.f.toLowerCase(Locale.ENGLISH);
        a a4 = (a)this.E.get(string2);
        if (a4 == null) {
            this.E.put(string2, new a((f)objectArray, this.s));
            objectArray = this.c;
            int n3 = this.s;
            this.s = n3 + 1;
            this.c = (h[])d.d.b(objectArray, n3, object);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Duplicate function name '");
        ((StringBuilder)object).append(objectArray.f);
        ((StringBuilder)object).append("' (used at line ");
        ((StringBuilder)object).append(a4.a.b);
        ((StringBuilder)object).append(")");
        throw new e.b((f)objectArray, ((StringBuilder)object).toString());
    }

    void e(f f4) {
        CharSequence charSequence = f4.f.toLowerCase(Locale.ENGLISH);
        a a4 = (a)this.D.get(charSequence);
        if (a4 == null) {
            this.D.put(charSequence, new a(f4, this.q));
            return;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Try redefine label '");
        ((StringBuilder)charSequence).append(f4.f);
        ((StringBuilder)charSequence).append("' (already defined at line ");
        ((StringBuilder)charSequence).append(a4.a.b);
        ((StringBuilder)charSequence).append(")");
        throw new e.b(f4, ((StringBuilder)charSequence).toString());
    }

    void f(f f4) {
        this.r = LasmBase.e(f4);
    }

    public int g(int n3) {
        int n4;
        int[] nArray;
        if (this.r != 0) {
            nArray = this.d;
            n4 = nArray.length;
            int n5 = this.q;
            if (n4 <= n5) {
                this.d = Arrays.copyOf(nArray, d.d.c(n5 + 1));
            }
            nArray = this.d;
            n4 = this.q;
            nArray[n4] = this.r;
            this.t = n4 + 1;
        }
        nArray = this.b;
        n4 = this.q;
        this.q = n4 + 1;
        this.b = d.d.a(nArray, n4, n3);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void h(f f4, LuaValue object, LuaValue object2, LuaValue object3, f f5, f f6) {
        Throwable throwable2;
        block82: {
            block81: {
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                int n15;
                int n16;
                int n17;
                int n18;
                int n19;
                int n20;
                int n21;
                int n22;
                int n23;
                int n24;
                int n25;
                int n26;
                int n27;
                int n28;
                int n29;
                int n30;
                int n31;
                int n32;
                int n33;
                int n34;
                int n35;
                int n36;
                int n37;
                int n38;
                this.k((LuaValue)object);
                this.k((LuaValue)object2);
                this.k((LuaValue)object3);
                try {
                    n38 = f4.a;
                    if (n38 == 79) break block81;
                    n37 = 1;
                    n36 = 1;
                    n35 = 1;
                    n34 = 0;
                    n33 = 0;
                    n31 = n32 = -1;
                    n30 = n32;
                    n29 = n32;
                    n28 = n32;
                    n27 = n32;
                    n26 = n32;
                    n25 = n32;
                    n24 = n32;
                    n23 = n32;
                    n22 = n32;
                    n21 = n32;
                    n20 = n32;
                    n19 = n32;
                    n18 = n32;
                    n17 = n32;
                    n16 = n32;
                    n15 = n32;
                    n14 = n32;
                    n13 = n32;
                    n12 = n32;
                    n11 = n32;
                    n10 = n32;
                    n9 = n32;
                    n8 = n32;
                    n7 = n32;
                    n6 = n32;
                    n5 = n32;
                    n4 = n32;
                    n3 = n32;
                }
                catch (Throwable throwable2) {
                    break block82;
                }
                switch (n38) {
                    default: {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Unknow token for OP: '");
                        ((StringBuilder)object2).append(f4.f);
                        ((StringBuilder)object2).append("'");
                        object = new e.b(f4, ((StringBuilder)object2).toString());
                        throw object;
                    }
                    case 41: {
                        this.B.U(37, ((LuaValue)object).C2(), this.o(f5));
                        return;
                    }
                    case 40: {
                        object3 = object2;
                        if (object2 == null) {
                            object3 = object;
                        }
                        this.B.o1(((LuaValue)object).C2(), ((LuaValue)object3).C2() - ((LuaValue)object).C2(), LasmBase.e(f5));
                        return;
                    }
                    case 38: {
                        this.B.T(34, ((LuaValue)object).C2(), 0, ((LuaValue)object2).C2() - ((LuaValue)object).C2() - 2);
                        return;
                    }
                    case 35: {
                        n8 = object != null ? ((LuaValue)object).C2() : 0;
                        n32 = object == null ? n35 : (object2 == null ? 0 : ((LuaValue)object2).C2() - ((LuaValue)object).C2() + 2);
                        this.B.T(31, n8, n32, 0);
                        return;
                    }
                    case 34: {
                        n31 = 30;
                    }
                    case 42: {
                        n32 = n31;
                        if (n31 < 0) {
                            n32 = 38;
                        }
                        object3 = this.B;
                        n25 = ((LuaValue)object).C2();
                        n8 = object2 == null ? 0 : ((LuaValue)object2).C2() - ((LuaValue)object).C2() + 1;
                        ((g.f)object3).T(n32, n25, n8, 0);
                        return;
                    }
                    case 33: {
                        n8 = object2 == null ? 0 : ((LuaValue)object2).C2() - ((LuaValue)object).C2() + 1;
                        n32 = f5 != null ? 0 : (object3 == null ? n37 : ((LuaValue)object3).C2() - ((LuaValue)object).C2() + 2);
                        this.B.T(29, ((LuaValue)object).C2(), n8, n32);
                        return;
                    }
                    case 31: {
                        n30 = 27;
                    }
                    case 32: {
                        n32 = n30;
                        if (n30 < 0) {
                            n32 = 28;
                        }
                        object3 = this.B;
                        n25 = ((LuaValue)object).C2();
                        n8 = object2 == null ? n33 : ((LuaValue)object2).C2();
                        ((g.f)object3).T(n32, n25, n8, LasmBase.e(f5));
                        return;
                    }
                    case 28: {
                        n29 = 24;
                    }
                    case 29: {
                        n28 = n29;
                        if (n29 < 0) {
                            n28 = 25;
                        }
                    }
                    case 30: {
                        n32 = n28;
                        if (n28 < 0) {
                            n32 = 26;
                        }
                        this.B.T(n32, LasmBase.e(f5), this.c((LuaValue)object), this.c((LuaValue)object2));
                        return;
                    }
                    case 27: {
                        n27 = 23;
                    }
                    case 36: {
                        n26 = n27;
                        if (n27 < 0) {
                            n26 = 32;
                        }
                    }
                    case 37: {
                        n25 = n26;
                        if (n26 < 0) {
                            n25 = 33;
                        }
                    }
                    case 39: {
                        n8 = n25;
                        if (n25 < 0) {
                            n8 = 35;
                        }
                        object2 = this.B;
                        n32 = n8 != 23 ? ((LuaValue)object).C2() : (object == null ? n34 : ((LuaValue)object).C2() + 1);
                        ((g.f)object2).V(n8, n32, this.n(f5));
                        return;
                    }
                    case 15: {
                        this.B.T(11, ((LuaValue)object).C2(), LasmBase.e(f5), LasmBase.e(f6));
                        return;
                    }
                    case 10: {
                        n24 = 6;
                    }
                    case 11: {
                        n23 = n24;
                        if (n24 < 0) {
                            n23 = 7;
                        }
                    }
                    case 16: {
                        n22 = n23;
                        if (n23 < 0) {
                            n22 = 12;
                        }
                    }
                    case 12: {
                        n21 = n22;
                        if (n22 < 0) {
                            n21 = 8;
                        }
                    }
                    case 17: {
                        n20 = n21;
                        if (n21 < 0) {
                            n20 = 13;
                        }
                    }
                    case 18: {
                        n19 = n20;
                        if (n20 < 0) {
                            n19 = 14;
                        }
                    }
                    case 19: {
                        n18 = n19;
                        if (n19 < 0) {
                            n18 = 15;
                        }
                    }
                    case 20: {
                        n17 = n18;
                        if (n18 < 0) {
                            n17 = 16;
                        }
                    }
                    case 21: {
                        n16 = n17;
                        if (n17 < 0) {
                            n16 = 17;
                        }
                    }
                    case 22: {
                        n15 = n16;
                        if (n16 < 0) {
                            n15 = 18;
                        }
                    }
                    case 43: {
                        n14 = n15;
                        if (n15 < 0) {
                            n14 = 40;
                        }
                    }
                    case 45: {
                        n13 = n14;
                        if (n14 < 0) {
                            n13 = 42;
                        }
                    }
                    case 46: {
                        n12 = n13;
                        if (n13 < 0) {
                            n12 = 43;
                        }
                    }
                    case 47: {
                        n11 = n12;
                        if (n12 < 0) {
                            n11 = 44;
                        }
                    }
                    case 48: {
                        n10 = n11;
                        if (n11 < 0) {
                            n10 = 45;
                        }
                    }
                    case 49: {
                        n9 = n10;
                        if (n10 < 0) {
                            n9 = 46;
                        }
                    }
                    case 14: {
                        n8 = n9;
                        if (n9 < 0) {
                            n8 = 10;
                        }
                    }
                    case 26: {
                        n32 = n8;
                        if (n8 < 0) {
                            n32 = 22;
                        }
                        this.B.T(n32, ((LuaValue)object).C2(), this.c((LuaValue)object2), this.c((LuaValue)object3));
                        return;
                    }
                    case 9: {
                        n7 = 5;
                    }
                    case 13: {
                        n6 = n7;
                        if (n7 < 0) {
                            n6 = 9;
                        }
                    }
                    case 23: {
                        n5 = n6;
                        if (n6 < 0) {
                            n5 = 19;
                        }
                    }
                    case 24: {
                        n4 = n5;
                        if (n5 < 0) {
                            n4 = 20;
                        }
                    }
                    case 25: {
                        n3 = n4;
                        if (n4 < 0) {
                            n3 = 21;
                        }
                    }
                    case 44: {
                        n32 = n3;
                        if (n3 >= 0) break;
                        n32 = 41;
                        break;
                    }
                    case 8: {
                        this.B.T(4, ((LuaValue)object).C2(), ((LuaValue)object2).C2() - ((LuaValue)object).C2(), 0);
                        return;
                    }
                    case 7: {
                        object2 = this.B;
                        n8 = ((LuaValue)object).C2();
                        n25 = LasmBase.e(f5);
                        n32 = f6 != null ? n36 : 0;
                        ((g.f)object2).T(3, n8, n25, n32);
                        return;
                    }
                    case 6: {
                        this.B.W(((LuaValue)object).C2(), this.m((LuaValue)object2));
                        return;
                    }
                    case 5: 
                }
                n8 = n32;
                if (n32 < 0) {
                    n8 = 0;
                }
                this.B.T(n8, ((LuaValue)object).C2(), ((LuaValue)object2).C2(), 0);
                return;
            }
            this.g(LasmBase.d(f5));
            return;
        }
        if (throwable2 instanceof e.b) {
            throw throwable2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed assemble OP '");
        ((StringBuilder)object).append(f4.f);
        ((StringBuilder)object).append("'");
        throw new e.b(f4, ((StringBuilder)object).toString(), throwable2);
    }

    void i(LasmBase.Internal internal, f f4) {
        Object[] objectArray = this.f;
        int n3 = this.v;
        this.v = n3 + 1;
        this.f = (f.d[])d.d.b(objectArray, n3, new f.d(LasmBase.j(f4), internal instanceof LasmBase.V, internal.P));
    }

    b j() {
        Object object;
        Object object2 = this.a;
        int n3 = ((LuaValue[])object2).length;
        int n4 = this.p;
        if (n3 != n4) {
            this.a = Arrays.copyOf(object2, n4);
        }
        if ((n3 = ((LuaValue[])(object2 = (Object)this.b)).length) != (n4 = this.q)) {
            this.b = Arrays.copyOf((int[])object2, n4);
        }
        if ((n4 = ((LuaValue[])(object2 = this.c)).length) != (n3 = this.s)) {
            this.c = (h[])Arrays.copyOf(object2, n3);
        }
        if ((n3 = ((LuaValue[])(object2 = (Object)this.d)).length) != (n4 = this.t)) {
            this.d = Arrays.copyOf((int[])object2, n4);
        }
        if ((n3 = ((LuaValue[])(object2 = this.e)).length) != (n4 = this.u)) {
            this.e = (f.b[])Arrays.copyOf(object2, n4);
        }
        if ((n3 = ((LuaValue[])(object2 = this.f)).length) != (n4 = this.v)) {
            this.f = (f.d[])Arrays.copyOf(object2, n4);
        }
        int n5 = this.x;
        n4 = 0;
        for (n3 = 0; n3 < n5; ++n3) {
            object2 = this.w[n3];
            object = (a)this.D.get(object2.a.f.toLowerCase(Locale.ENGLISH));
            if (object != null) {
                g.a.A(new g.d(this.b, object2.b), ((a)object).b - object2.b - 1);
                continue;
            }
            object = object2.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The label ");
            stringBuilder.append(object2.a.f);
            stringBuilder.append(" is missing");
            throw new e.b((f)object, stringBuilder.toString());
        }
        n5 = this.z;
        for (n3 = 0; n3 < n5; ++n3) {
            object2 = this.y[n3];
            object = (a)this.E.get(object2.a.f.toLowerCase(Locale.ENGLISH));
            if (object != null) {
                g.a.y(new g.d(this.b, object2.b), ((a)object).b);
                continue;
            }
            object = object2.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The function ");
            stringBuilder.append(object2.a.f);
            stringBuilder.append(" is missing");
            throw new e.b((f)object, stringBuilder.toString());
        }
        n5 = this.A.length;
        for (n3 = n4; n3 < n5; ++n3) {
            object2 = this.A[n3];
            if (object2 == null) {
                continue;
            }
            object2 = object2.a;
            object = new StringBuilder();
            ((StringBuilder)object).append("No '.end local' for local variable v");
            ((StringBuilder)object).append(n3);
            throw new e.b((f)object2, ((StringBuilder)object).toString());
        }
        this.w = null;
        this.y = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.B = null;
        this.A = null;
        return this;
    }

    void k(LuaValue luaValue) {
    }

    void l(LasmBase.V object, f aArray, int n3) {
        this.k((LuaValue)object);
        int n4 = ((LasmBase.Internal)object).C2();
        a a4 = this.A[n4];
        if (a4 != null) {
            if (a4.a.f.equals(aArray.f)) {
                object = this.e;
                aArray = this.A;
                object[aArray[n4].b].c = this.q + n3;
                aArray[n4] = null;
                return;
            }
            aArray = ((LasmBase.Internal)object).Q;
            object = new StringBuilder();
            ((StringBuilder)object).append("Try end local variable v");
            ((StringBuilder)object).append(n4);
            ((StringBuilder)object).append(" with different name (v");
            ((StringBuilder)object).append(n4);
            ((StringBuilder)object).append(" defined at line ");
            ((StringBuilder)object).append(this.A[n4].a.b);
            ((StringBuilder)object).append(" as '");
            ((StringBuilder)object).append(this.A[n4].a.f);
            ((StringBuilder)object).append("')");
            throw new e.b((f)aArray, ((StringBuilder)object).toString());
        }
        aArray = ((LasmBase.Internal)object).Q;
        object = new StringBuilder();
        ((StringBuilder)object).append("Try end not defined local variable v");
        ((StringBuilder)object).append(n4);
        throw new e.b((f)aArray, ((StringBuilder)object).toString());
    }

    int m(LuaValue luaValue) {
        Object[] objectArray;
        if (luaValue instanceof LasmBase.Const) {
            return luaValue.C2();
        }
        Object[] objectArray2 = objectArray = (Object[])this.C.get(luaValue);
        if (objectArray == null) {
            objectArray2 = this.p;
            this.C.put(luaValue, objectArray2);
            objectArray = this.a;
            int n3 = this.p;
            this.p = n3 + 1;
            this.a = (LuaValue[])d.d.b(objectArray, n3, luaValue);
        }
        return objectArray2.intValue();
    }

    int n(f f4) {
        int n3 = f4.a == 60 ? LasmBase.e(f4) : -1;
        int n4 = n3;
        if (f4.a != 60) {
            Object[] objectArray = (Object[])this.D.get(f4.f.toLowerCase(Locale.ENGLISH));
            if (objectArray != null) {
                n4 = objectArray.b - this.q - 1;
            } else {
                objectArray = this.w;
                n4 = this.x;
                this.x = n4 + 1;
                this.w = (a[])d.d.b(objectArray, n4, new a(f4, this.q));
                n4 = n3;
            }
        }
        return n4;
    }

    int o(f f4) {
        if (f4.a == 79) {
            return LasmBase.e(f4);
        }
        Object[] objectArray = this.y;
        int n3 = this.z;
        this.z = n3 + 1;
        this.y = (a[])d.d.b(objectArray, n3, new a(f4, this.q));
        return 262143;
    }

    void p(f f4) {
        int n3;
        this.l = n3 = Math.max(2, LasmBase.g(f4, 255));
        if (n3 >= this.j) {
            this.A = new a[n3];
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".maxstacksize (");
        stringBuilder.append(this.l);
        stringBuilder.append(") must be not less .numparams (");
        stringBuilder.append(this.j);
        stringBuilder.append(")");
        throw new e.b(f4, stringBuilder.toString());
    }

    void q(LasmBase.V objectArray, f object) {
        this.k((LuaValue)objectArray);
        int n3 = objectArray.C2();
        a[] aArray = this.A;
        if (aArray[n3] == null) {
            aArray[n3] = new a((f)object, this.u);
            objectArray = this.e;
            n3 = this.u;
            this.u = n3 + 1;
            object = LasmBase.j((f)object);
            int n4 = this.q;
            this.e = (f.b[])d.d.b(objectArray, n3, new f.b((LuaString)object, n4, n4 + 1));
            return;
        }
        object = objectArray.Q;
        objectArray = new StringBuilder();
        objectArray.append("Try redefine not ended local variable v");
        objectArray.append(n3);
        objectArray.append(" (v");
        objectArray.append(n3);
        objectArray.append(" defined at line ");
        objectArray.append(this.A[n3].a.b);
        objectArray.append(" as '");
        objectArray.append(this.A[n3].a.f);
        objectArray.append("')");
        throw new e.b((f)object, objectArray.toString());
    }

    static class a {
        f a;
        int b;

        a(f f4, int n3) {
            this.a = f4;
            this.b = n3;
        }
    }
}

