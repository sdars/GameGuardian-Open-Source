/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import java.lang.ref.WeakReference;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.e;

public class WeakTable
implements e {
    private final boolean a;
    private final boolean b;
    private final LuaValue c;

    public WeakTable(boolean bl, boolean bl2, LuaValue luaValue) {
        this.a = bl;
        this.b = bl2;
        this.c = luaValue;
    }

    protected static LuaValue a(Object object) {
        Object object2 = object;
        if (object instanceof WeakReference) {
            object2 = ((WeakReference)object).get();
        }
        if (object2 instanceof WeakValue) {
            return ((WeakValue)object2).p2();
        }
        return (LuaValue)object2;
    }

    protected static LuaValue b(LuaValue luaValue) {
        int n3 = luaValue.C2();
        if (n3 != 5 && n3 != 6 && n3 != 7 && n3 != 8) {
            return luaValue;
        }
        return new WeakValue(luaValue);
    }

    @Override
    public LuaValue e() {
        return this.c;
    }

    @Override
    public LuaValue g(LuaValue luaValue) {
        LuaValue luaValue2 = luaValue;
        if (this.b) {
            luaValue2 = WeakTable.b(luaValue);
        }
        return luaValue2;
    }

    @Override
    public LuaTable.m k(LuaValue luaValue, LuaValue luaValue2) {
        if ((luaValue2 = luaValue2.p2()) == null) {
            return null;
        }
        if (this.a && !luaValue.m1() && !luaValue.n1() && !luaValue.e1()) {
            if (this.b && !luaValue2.m1() && !luaValue2.n1() && !luaValue2.e1()) {
                return new a(luaValue, luaValue2, null);
            }
            return new b(luaValue, luaValue2, null);
        }
        if (this.b && !luaValue2.m1() && !luaValue2.n1() && !luaValue2.e1()) {
            return new d(luaValue, luaValue2, null);
        }
        return LuaTable.Z2(luaValue, luaValue2);
    }

    @Override
    public LuaValue o(LuaValue[] luaValueArray, int n3) {
        LuaValue luaValue;
        LuaValue luaValue2 = luaValue = luaValueArray[n3];
        if (luaValue != null) {
            luaValue2 = luaValue = WeakTable.a(luaValue);
            if (luaValue == null) {
                luaValueArray[n3] = null;
                luaValue2 = luaValue;
            }
        }
        return luaValue2;
    }

    @Override
    public boolean p() {
        return this.b;
    }

    @Override
    public boolean q() {
        return this.a;
    }

    static class WeakValue
    extends LuaValue {
        WeakReference P;

        protected WeakValue(LuaValue luaValue) {
            this.P = new WeakReference<LuaValue>(luaValue);
        }

        @Override
        public int C2() {
            this.a1("type", "weak value");
            return 0;
        }

        @Override
        public String D2() {
            this.a1("typename", "weak value");
            return null;
        }

        @Override
        public boolean T1(LuaValue luaValue) {
            Object t3 = this.P.get();
            boolean bl = t3 != null && luaValue.T1((LuaValue)t3);
            return bl;
        }

        @Override
        public LuaValue p2() {
            return (LuaValue)this.P.get();
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("weak<");
            stringBuilder.append(this.P.get());
            stringBuilder.append('>');
            return stringBuilder.toString();
        }
    }

    static class a
    extends c {
        private final int d;

        protected a(LuaValue luaValue, LuaValue luaValue2, LuaTable.m m3) {
            super(WeakTable.b(luaValue), WeakTable.b(luaValue2), m3);
            this.d = luaValue.hashCode();
        }

        protected a(a a4, LuaTable.m m3) {
            super(a4.a, a4.b, m3);
            this.d = a4.d;
        }

        @Override
        public int b(int n3) {
            return LuaTable.l3(this.d, n3);
        }

        @Override
        protected c e(LuaTable.m m3) {
            return new a(this, m3);
        }

        @Override
        public LuaTable.m g(LuaValue luaValue) {
            this.b = WeakTable.b(luaValue);
            return this;
        }

        @Override
        public LuaValue k() {
            return WeakTable.a(this.a);
        }

        @Override
        public LuaValue m() {
            return WeakTable.a(this.b);
        }
    }

    static class b
    extends c {
        private final int d;

        protected b(LuaValue luaValue, LuaValue luaValue2, LuaTable.m m3) {
            super(WeakTable.b(luaValue), luaValue2, m3);
            this.d = luaValue.hashCode();
        }

        protected b(b b4, LuaTable.m m3) {
            super(b4.a, b4.b, m3);
            this.d = b4.d;
        }

        @Override
        public int b(int n3) {
            return LuaTable.l3(this.d, n3);
        }

        @Override
        protected c e(LuaTable.m m3) {
            return new b(this, m3);
        }

        @Override
        public LuaTable.m g(LuaValue luaValue) {
            this.b = luaValue;
            return this;
        }

        @Override
        public LuaValue k() {
            return WeakTable.a(this.a);
        }
    }

    public static abstract class c
    implements LuaTable.m {
        protected Object a;
        protected Object b;
        protected LuaTable.m c;

        protected c(Object object, Object object2, LuaTable.m m3) {
            this.a = object;
            this.b = object2;
            this.c = m3;
        }

        @Override
        public LuaTable.m a() {
            return this.c;
        }

        @Override
        public LuaTable.m d(LuaTable.m m3) {
            LuaTable.m m4 = this.c;
            LuaTable.m m5 = m3;
            if (m4 != null) {
                m5 = m4.d(m3);
            }
            this.c = m5;
            if (this.k() != null && this.m() != null) {
                return this;
            }
            return this.c;
        }

        protected abstract c e(LuaTable.m var1);

        @Override
        public LuaTable.n f(LuaValue object) {
            LuaTable.n n3 = this.l();
            object = n3 != null ? n3.f((LuaValue)object) : null;
            return object;
        }

        public abstract LuaTable.m g(LuaValue var1);

        @Override
        public LuaTable.m h(LuaTable.n n3) {
            LuaValue luaValue = this.k();
            if (luaValue == null) {
                return this.c.h(n3);
            }
            if (n3.s(luaValue)) {
                this.b = null;
                return this;
            }
            this.c = this.c.h(n3);
            return this;
        }

        @Override
        public LuaTable.m j(LuaTable.n n3, LuaValue luaValue) {
            LuaValue luaValue2 = this.k();
            if (luaValue2 != null && n3.f(luaValue2) != null) {
                return this.g(luaValue);
            }
            if (luaValue2 != null) {
                this.c = this.c.j(n3, luaValue);
                return this;
            }
            return this.c.j(n3, luaValue);
        }

        public LuaValue k() {
            return (LuaValue)this.a;
        }

        @Override
        public LuaTable.n l() {
            LuaValue luaValue = this.k();
            LuaValue luaValue2 = this.m();
            if (luaValue != null && luaValue2 != null) {
                return new LuaTable.l(luaValue, luaValue2);
            }
            this.a = null;
            this.b = null;
            return null;
        }

        public LuaValue m() {
            return (LuaValue)this.b;
        }

        @Override
        public LuaTable.m n(LuaTable.m m3) {
            LuaTable.m m4 = m3;
            if (this.k() != null) {
                m4 = m3;
                if (this.m() != null) {
                    if (m3 == null && this.c == null) {
                        return this;
                    }
                    m4 = this.e(m3);
                }
            }
            return m4;
        }

        @Override
        public int r(int n3) {
            return 0;
        }

        @Override
        public boolean s(LuaValue luaValue) {
            LuaTable.n n3 = this.l();
            boolean bl = n3 != null && n3.s(luaValue);
            return bl;
        }
    }

    static class d
    extends c {
        protected d(LuaValue luaValue, LuaValue luaValue2, LuaTable.m m3) {
            super(luaValue, WeakTable.b(luaValue2), m3);
        }

        protected d(d d4, LuaTable.m m3) {
            super(d4.a, d4.b, m3);
        }

        @Override
        public int b(int n3) {
            return LuaTable.j3(this.k(), n3);
        }

        @Override
        protected c e(LuaTable.m m3) {
            return new d(this, m3);
        }

        @Override
        public LuaTable.m g(LuaValue luaValue) {
            this.b = WeakTable.b(luaValue);
            return this;
        }

        @Override
        public LuaValue m() {
            return WeakTable.a(this.b);
        }
    }
}

