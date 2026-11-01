package luaj;

import android.ext.Script;
import android.ext.e1;
import android.ext.t2;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class LuaTable extends LuaValue implements luaj.e {
    private static final LuaString T = LuaValue.K2("n");
    private static final m[] U = new m[0];
    private static volatile Set V = null;
    private static volatile int W = 0;
    private LuaValue[] P;
    private m[] Q;
    protected int R;
    protected luaj.e S;

    private static class b extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1648c;

        b(LuaValue luaValue, boolean z) {
            super(luaValue);
            this.f1648c = z;
        }

        @Override // luaj.LuaTable.e
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                this.f1648c = luaValue == LuaValue.f1674d;
                return this;
            }
            if (luaValue instanceof LuaLong) {
                long jZ2 = luaValue.z2();
                int i = (int) jZ2;
                return ((long) i) == jZ2 ? new h(this.f1664b, i) : new k(this.f1664b, jZ2);
            }
            if (!(luaValue instanceof LuaDouble)) {
                return new l(this.f1664b, luaValue);
            }
            double dX2 = luaValue.x2();
            float f2 = (float) dX2;
            return ((double) f2) == dX2 ? new f(this.f1664b, f2) : new d(this.f1664b, dX2);
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public LuaValue t() {
            return LuaValue.H2(this.f1648c);
        }
    }

    private static class c implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f1649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m f1650b;

        private c(LuaValue luaValue, m mVar) {
            this.f1649a = LuaTable.r3(luaValue) ? new WeakReference(luaValue) : luaValue;
            this.f1650b = mVar;
        }

        private LuaValue i() {
            Object obj = this.f1649a;
            if (obj instanceof WeakReference) {
                obj = ((WeakReference) obj).get();
            }
            return (LuaValue) obj;
        }

        @Override // luaj.LuaTable.m
        public m a() {
            return this.f1650b;
        }

        @Override // luaj.LuaTable.m
        public int b(int i) {
            return 0;
        }

        @Override // luaj.LuaTable.m
        public m d(m mVar) {
            m mVar2 = this.f1650b;
            return mVar2 != null ? mVar2.d(mVar) : mVar;
        }

        @Override // luaj.LuaTable.m
        public n f(LuaValue luaValue) {
            return null;
        }

        @Override // luaj.LuaTable.m
        public m h(n nVar) {
            if (i() == null) {
                return this.f1650b;
            }
            this.f1650b = this.f1650b.h(nVar);
            return this;
        }

        @Override // luaj.LuaTable.m
        public m j(n nVar, LuaValue luaValue) {
            m mVar = this.f1650b;
            m mVarJ = mVar != null ? mVar.j(nVar, luaValue) : null;
            if (i() == null) {
                return mVarJ;
            }
            this.f1650b = mVarJ;
            return this;
        }

        @Override // luaj.LuaTable.m
        public n l() {
            return null;
        }

        @Override // luaj.LuaTable.m
        public m n(m mVar) {
            return mVar;
        }

        @Override // luaj.LuaTable.m
        public int r(int i) {
            return -1;
        }

        @Override // luaj.LuaTable.m
        public boolean s(LuaValue luaValue) {
            LuaValue luaValueI = i();
            return luaValueI != null && luaValue.T1(luaValueI);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("<dead");
            LuaValue luaValueI = i();
            if (luaValueI != null) {
                sb.append(": ");
                sb.append(luaValueI.toString());
            }
            sb.append('>');
            if (this.f1650b != null) {
                sb.append("; ");
                sb.append(this.f1650b.toString());
            }
            return sb.toString();
        }
    }

    private static class d extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f1651c;

        d(LuaValue luaValue, double d2) {
            super(luaValue);
            this.f1651c = d2;
        }

        @Override // luaj.LuaTable.e
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                return new b(this.f1664b, luaValue.w2());
            }
            LuaValue luaValueA2 = luaValue.A2();
            if (luaValueA2.l1()) {
                return new l(this.f1664b, luaValue);
            }
            if (luaValueA2 instanceof LuaLong) {
                long jZ2 = luaValueA2.z2();
                int i = (int) jZ2;
                return ((long) i) == jZ2 ? new h(this.f1664b, i) : new k(this.f1664b, jZ2);
            }
            double dX2 = luaValueA2.x2();
            float f2 = (float) dX2;
            if (f2 == dX2) {
                return new f(this.f1664b, f2);
            }
            this.f1651c = dX2;
            return this;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public LuaValue t() {
            return LuaValue.J2(this.f1651c);
        }
    }

    static abstract class e extends Varargs implements n {
        e() {
        }

        @Override // luaj.Varargs
        public int U() {
            return 2;
        }

        @Override // luaj.LuaTable.m
        public m a() {
            return null;
        }

        @Override // luaj.LuaTable.m
        public abstract int b(int i);

        @Override // luaj.LuaTable.n
        public Varargs c() {
            return this;
        }

        @Override // luaj.LuaTable.m
        public m d(m mVar) {
            return new j(this, mVar);
        }

        @Override // luaj.Varargs
        public Varargs e0(int i) {
            if (i != 1) {
                return i != 2 ? LuaValue.f1676f : t();
            }
            return this;
        }

        @Override // luaj.LuaTable.m
        public n f(LuaValue luaValue) {
            if (s(luaValue)) {
                return this;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // luaj.LuaTable.m
        public m h(n nVar) {
            return new c(i(), null);
        }

        @Override // luaj.LuaTable.n
        public abstract LuaValue i();

        @Override // luaj.LuaTable.m
        public m j(n nVar, LuaValue luaValue) {
            return j0(luaValue);
        }

        abstract e j0(LuaValue luaValue);

        @Override // luaj.LuaTable.m
        public n l() {
            return this;
        }

        @Override // luaj.LuaTable.m
        public m n(m mVar) {
            return mVar != null ? new j(this, mVar) : this;
        }

        @Override // luaj.LuaTable.m
        public int r(int i) {
            return 0;
        }

        @Override // luaj.LuaTable.m
        public abstract boolean s(LuaValue luaValue);

        public abstract LuaValue t();

        @Override // luaj.Varargs
        public LuaValue v(int i) {
            if (i != 1) {
                return i != 2 ? LuaValue.f1673c : t();
            }
            return i();
        }

        @Override // luaj.Varargs
        public LuaValue w() {
            return i();
        }
    }

    private static class f extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f1652c;

        f(LuaValue luaValue, float f2) {
            super(luaValue);
            this.f1652c = f2;
        }

        @Override // luaj.LuaTable.e
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                return new b(this.f1664b, luaValue.w2());
            }
            LuaValue luaValueA2 = luaValue.A2();
            if (luaValueA2.l1()) {
                return new l(this.f1664b, luaValue);
            }
            if (luaValueA2 instanceof LuaLong) {
                long jZ2 = luaValueA2.z2();
                int i = (int) jZ2;
                return ((long) i) == jZ2 ? new h(this.f1664b, i) : new k(this.f1664b, jZ2);
            }
            double dX2 = luaValueA2.x2();
            float f2 = (float) dX2;
            if (f2 != dX2) {
                return new d(this.f1664b, dX2);
            }
            this.f1652c = f2;
            return this;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public LuaValue t() {
            return LuaValue.J2(this.f1652c);
        }
    }

    private static class g extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LuaValue f1654c;

        g(int i, LuaValue luaValue) {
            this.f1653b = i;
            this.f1654c = luaValue;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public int b(int i) {
            return LuaTable.l3(LuaLong.V2(this.f1653b), i);
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public LuaValue i() {
            return LuaValue.I2(this.f1653b);
        }

        @Override // luaj.LuaTable.e
        public e j0(LuaValue luaValue) {
            this.f1654c = luaValue;
            return this;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public int r(int i) {
            int i2 = this.f1653b;
            if (i2 < 1 || i2 > i) {
                return 0;
            }
            return i2;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public boolean s(LuaValue luaValue) {
            return luaValue.m1() && this.f1653b == luaValue.y2();
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public LuaValue t() {
            return this.f1654c;
        }
    }

    private static class h extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1655c;

        h(LuaValue luaValue, int i) {
            super(luaValue);
            this.f1655c = i;
        }

        @Override // luaj.LuaTable.e
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                return new b(this.f1664b, luaValue.w2());
            }
            LuaValue luaValueA2 = luaValue.A2();
            if (luaValueA2.l1()) {
                return new l(this.f1664b, luaValue);
            }
            if (!(luaValueA2 instanceof LuaLong)) {
                double dX2 = luaValueA2.x2();
                float f2 = (float) dX2;
                return ((double) f2) == dX2 ? new f(this.f1664b, f2) : new d(this.f1664b, dX2);
            }
            long jZ2 = luaValueA2.z2();
            int i = (int) jZ2;
            if (i != jZ2) {
                return new k(this.f1664b, jZ2);
            }
            this.f1655c = i;
            return this;
        }

        int k0() {
            return this.f1655c;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public LuaValue t() {
            return LuaValue.I2(this.f1655c);
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1656a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m f1657b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f1658c = null;

        public i() {
        }

        public int a() {
            if (this.f1658c == null) {
                return this.f1656a + 1;
            }
            return 0;
        }

        public LuaValue b() {
            n nVar = this.f1658c;
            return nVar != null ? nVar.i() : LuaLong.I2(this.f1656a + 1);
        }

        public boolean c() {
            LuaTable luaTable;
            luaj.e eVar;
            n nVarL;
            m mVarA = this.f1657b;
            while (mVarA != null) {
                mVarA = mVarA.a();
                if (mVarA != null && (nVarL = mVarA.l()) != null) {
                    this.f1657b = mVarA;
                    this.f1658c = nVarL;
                    return true;
                }
            }
            this.f1657b = null;
            this.f1658c = null;
            int i = this.f1656a + 1;
            while (i < LuaTable.this.P.length) {
                if (LuaTable.this.P[i] != null && ((eVar = (luaTable = LuaTable.this).S) == null || eVar.o(luaTable.P, i) != null)) {
                    this.f1656a = i;
                    return true;
                }
                i++;
            }
            for (int length = i - LuaTable.this.P.length; length < LuaTable.this.Q.length; length++) {
                for (m mVarA2 = LuaTable.this.Q[length]; mVarA2 != null; mVarA2 = mVarA2.a()) {
                    n nVarL2 = mVarA2.l();
                    if (nVarL2 != null) {
                        this.f1656a = length + LuaTable.this.P.length;
                        this.f1657b = mVarA2;
                        this.f1658c = nVarL2;
                        return true;
                    }
                }
            }
            return false;
        }

        public LuaValue d() {
            n nVar = this.f1658c;
            if (nVar != null) {
                return nVar.t();
            }
            LuaTable luaTable = LuaTable.this;
            luaj.e eVar = luaTable.S;
            LuaValue[] luaValueArr = luaTable.P;
            return eVar == null ? luaValueArr[this.f1656a] : eVar.o(luaValueArr, this.f1656a);
        }
    }

    private static class j implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f1660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m f1661b;

        j(e eVar, m mVar) {
            this.f1660a = eVar;
            this.f1661b = mVar;
        }

        private m e(m mVar) {
            if (mVar == null) {
                return this.f1660a;
            }
            this.f1661b = mVar;
            return this;
        }

        @Override // luaj.LuaTable.m
        public m a() {
            return this.f1661b;
        }

        @Override // luaj.LuaTable.m
        public int b(int i) {
            return this.f1660a.b(i);
        }

        @Override // luaj.LuaTable.n
        public Varargs c() {
            return this.f1660a.c();
        }

        @Override // luaj.LuaTable.m
        public m d(m mVar) {
            return e(this.f1661b.d(mVar));
        }

        @Override // luaj.LuaTable.m
        public n f(LuaValue luaValue) {
            if (this.f1660a.s(luaValue)) {
                return this;
            }
            return null;
        }

        @Override // luaj.LuaTable.m
        public m h(n nVar) {
            if (this == nVar) {
                return new c(i(), this.f1661b);
            }
            this.f1661b = this.f1661b.h(nVar);
            return this;
        }

        @Override // luaj.LuaTable.n
        public LuaValue i() {
            return this.f1660a.i();
        }

        @Override // luaj.LuaTable.m
        public m j(n nVar, LuaValue luaValue) {
            if (nVar != this) {
                return e(this.f1661b.j(nVar, luaValue));
            }
            this.f1660a = this.f1660a.j0(luaValue);
            return this;
        }

        @Override // luaj.LuaTable.m
        public n l() {
            return this.f1660a;
        }

        @Override // luaj.LuaTable.m
        public m n(m mVar) {
            return mVar != null ? new j(this.f1660a, mVar) : this.f1660a;
        }

        @Override // luaj.LuaTable.m
        public int r(int i) {
            return this.f1660a.r(i);
        }

        @Override // luaj.LuaTable.m
        public boolean s(LuaValue luaValue) {
            return this.f1660a.s(luaValue);
        }

        @Override // luaj.LuaTable.n
        public LuaValue t() {
            return this.f1660a.t();
        }

        public String toString() {
            return this.f1660a + "; " + this.f1661b;
        }
    }

    private static class k extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f1662c;

        k(LuaValue luaValue, long j) {
            super(luaValue);
            this.f1662c = j;
        }

        @Override // luaj.LuaTable.e
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                return new b(this.f1664b, luaValue.w2());
            }
            LuaValue luaValueA2 = luaValue.A2();
            if (luaValueA2.l1()) {
                return new l(this.f1664b, luaValue);
            }
            if (!(luaValueA2 instanceof LuaLong)) {
                double dX2 = luaValueA2.x2();
                float f2 = (float) dX2;
                return ((double) f2) == dX2 ? new f(this.f1664b, f2) : new d(this.f1664b, dX2);
            }
            long jZ2 = luaValueA2.z2();
            int i = (int) jZ2;
            if (i == jZ2) {
                return new h(this.f1664b, i);
            }
            this.f1662c = jZ2;
            return this;
        }

        long k0() {
            return this.f1662c;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public LuaValue t() {
            return LuaValue.I2(this.f1662c);
        }
    }

    static class l extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LuaValue f1663c;

        l(LuaValue luaValue, LuaValue luaValue2) {
            super(luaValue);
            this.f1663c = luaValue2;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public Varargs c() {
            return this;
        }

        @Override // luaj.LuaTable.e
        public e j0(LuaValue luaValue) {
            if (luaValue instanceof LuaBoolean) {
                return new b(this.f1664b, luaValue.w2());
            }
            if (luaValue instanceof LuaLong) {
                long jZ2 = luaValue.z2();
                int i = (int) jZ2;
                return ((long) i) == jZ2 ? new h(this.f1664b, i) : new k(this.f1664b, jZ2);
            }
            if (!(luaValue instanceof LuaDouble)) {
                this.f1663c = luaValue;
                return this;
            }
            double dX2 = luaValue.x2();
            float f2 = (float) dX2;
            return ((double) f2) == dX2 ? new f(this.f1664b, f2) : new d(this.f1664b, dX2);
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public LuaValue t() {
            return this.f1663c;
        }
    }

    interface m {
        m a();

        int b(int i);

        m d(m mVar);

        n f(LuaValue luaValue);

        m h(n nVar);

        m j(n nVar, LuaValue luaValue);

        n l();

        m n(m mVar);

        int r(int i);

        boolean s(LuaValue luaValue);
    }

    interface n extends m {
        Varargs c();

        LuaValue i();

        LuaValue t();
    }

    private static abstract class o extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final LuaValue f1664b;

        o(LuaValue luaValue) {
            this.f1664b = luaValue;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public final int b(int i) {
            return LuaTable.j3(this.f1664b, i);
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public final LuaValue i() {
            return this.f1664b;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public final boolean s(LuaValue luaValue) {
            return luaValue.T1(this.f1664b);
        }
    }

    public LuaTable() {
        this.P = LuaValue.j;
        this.Q = U;
    }

    private static LuaValue[] A3(LuaValue[] luaValueArr, int i2) {
        LuaValue[] luaValueArr2 = new LuaValue[i2];
        System.arraycopy(luaValueArr, 0, luaValueArr2, 0, luaValueArr.length);
        return luaValueArr2;
    }

    private void B3(int i2, int i3, LuaValue luaValue) {
        while (true) {
            int i4 = i2 * 2;
            if (i4 > i3) {
                return;
            }
            if (i4 < i3) {
                int i5 = i4 + 1;
                if (V2(i4, i5, luaValue)) {
                    i4 = i5;
                }
            }
            if (!V2(i2, i4, luaValue)) {
                return;
            }
            LuaValue luaValueC3 = c3(i2);
            e2(i2, c3(i4));
            e2(i4, luaValueC3);
            i2 = i4;
        }
    }

    private n C3(LuaValue luaValue) {
        if (this.R <= 0) {
            return null;
        }
        for (m mVarA = this.Q[i3(luaValue)]; mVarA != null; mVarA = mVarA.a()) {
            n nVarF = mVarA.f(luaValue);
            if (nVarF != null) {
                return nVarF;
            }
        }
        return null;
    }

    private boolean U2(int i2, LuaValue luaValue) {
        if (i2 <= 0) {
            return false;
        }
        LuaValue[] luaValueArr = this.P;
        if (i2 > luaValueArr.length) {
            return false;
        }
        int i3 = i2 - 1;
        if (luaValue.l1()) {
            luaValue = null;
        } else {
            luaj.e eVar = this.S;
            if (eVar != null) {
                luaValue = eVar.g(luaValue);
            }
        }
        luaValueArr[i3] = luaValue;
        return true;
    }

    private boolean V2(int i2, int i3, LuaValue luaValue) {
        LuaValue luaValueC3 = c3(i2);
        LuaValue luaValueC4 = c3(i3);
        if (luaValueC3 == null || luaValueC4 == null) {
            return false;
        }
        return luaValue != null ? luaValue.call(luaValueC3, luaValueC4).w2() : luaValueC3.u1(luaValueC4);
    }

    private int X2() {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            m[] mVarArr = this.Q;
            if (i2 >= mVarArr.length) {
                return i3;
            }
            for (m mVarA = mVarArr[i2]; mVarA != null; mVarA = mVarA.a()) {
                if (mVarA.l() != null) {
                    i3++;
                }
            }
            i2++;
        }
    }

    private int Y2(int[] iArr) {
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 < 31; i5++) {
            LuaValue[] luaValueArr = this.P;
            if (i3 > luaValueArr.length) {
                break;
            }
            int iMin = Math.min(luaValueArr.length, 1 << i5);
            int i6 = 0;
            while (i3 <= iMin) {
                int i7 = i3 + 1;
                if (this.P[i3 - 1] != null) {
                    i6++;
                }
                i3 = i7;
            }
            iArr[i5] = i6;
            i4 += i6;
        }
        while (true) {
            m[] mVarArr = this.Q;
            if (i2 >= mVarArr.length) {
                return i4;
            }
            for (m mVarA = mVarArr[i2]; mVarA != null; mVarA = mVarA.a()) {
                int iR = mVarA.r(Integer.MAX_VALUE);
                if (iR > 0) {
                    int iU3 = u3(iR);
                    iArr[iU3] = iArr[iU3] + 1;
                    i4++;
                }
            }
            i2++;
        }
    }

    protected static e Z2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue.i1()) {
            return new g(luaValue.y2(), luaValue2);
        }
        if (luaValue2 instanceof LuaBoolean) {
            return new b(luaValue, luaValue2.w2());
        }
        if (luaValue2 instanceof LuaLong) {
            long jZ2 = luaValue2.z2();
            int i2 = (int) jZ2;
            return ((long) i2) == jZ2 ? new h(luaValue, i2) : new k(luaValue, jZ2);
        }
        if (!(luaValue2 instanceof LuaDouble)) {
            return new l(luaValue, luaValue2);
        }
        double dX2 = luaValue2.x2();
        float f2 = (float) dX2;
        return ((double) f2) == dX2 ? new f(luaValue, f2) : new d(luaValue, dX2);
    }

    private void a3() {
        int i2 = 0;
        while (true) {
            LuaValue[] luaValueArr = this.P;
            if (i2 >= luaValueArr.length) {
                return;
            }
            this.S.o(luaValueArr, i2);
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:113:0x0217  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0223  */
    /* JADX WARN: Code duplicated, block: B:118:0x022c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0233 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0235  */
    /* JADX WARN: Code duplicated, block: B:123:0x0238  */
    /* JADX WARN: Code duplicated, block: B:125:0x023c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0240  */
    /* JADX WARN: Code duplicated, block: B:129:0x0244  */
    /* JADX WARN: Code duplicated, block: B:131:0x0248  */
    /* JADX WARN: Code duplicated, block: B:132:0x024a  */
    /* JADX WARN: Code duplicated, block: B:133:0x024d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0250  */
    /* JADX WARN: Code duplicated, block: B:135:0x0253  */
    /* JADX WARN: Code duplicated, block: B:136:0x0256  */
    /* JADX WARN: Code duplicated, block: B:137:0x0259  */
    /* JADX WARN: Code duplicated, block: B:138:0x025c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0260  */
    /* JADX WARN: Code duplicated, block: B:142:0x0268  */
    /* JADX WARN: Code duplicated, block: B:144:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0271 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0273  */
    /* JADX WARN: Code duplicated, block: B:149:0x0277  */
    /* JADX WARN: Code duplicated, block: B:150:0x027a  */
    /* JADX WARN: Code duplicated, block: B:151:0x027d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0280  */
    /* JADX WARN: Code duplicated, block: B:155:0x0288  */
    /* JADX WARN: Code duplicated, block: B:157:0x0294  */
    /* JADX WARN: Code duplicated, block: B:160:0x029a  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:169:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d2  */
    private Appendable b3(String str, Appendable appendable, Map map) throws IOException {
        String strG0;
        boolean z;
        int iY2;
        String str2;
        int iY3;
        String strG1;
        int i2;
        ArrayList arrayList;
        Appendable appendable2 = appendable;
        Set set = V;
        if (set != null) {
            set.add(this);
        }
        appendable2.append("{ -- ");
        appendable2.append(E2());
        appendable2.append("(");
        appendable2.append(Integer.toHexString(hashCode()));
        appendable2.append(")\n");
        int iS1 = s1();
        int i3 = W + iS1;
        W = i3;
        int iMax = iS1 == 0 ? 1 : (int) Math.max(1.0d, Math.min(10.0d, Math.log10(Math.abs(iS1)) + 1.0d));
        i iVarS3 = s3();
        boolean z2 = str.length() > 0;
        boolean z3 = str.length() == 1;
        boolean z4 = i3 < 10000;
        int i4 = 1;
        ArrayList arrayList2 = null;
        boolean z5 = true;
        String str3 = null;
        while (iVarS3.c()) {
            LuaValue luaValueB = iVarS3.b();
            if (!z3 || map == null || map.get(luaValueB) != null) {
                if (z4 && z5) {
                    if (luaValueB.i1()) {
                        int i5 = i4 + 1;
                        if (luaValueB.y2() != i4) {
                            i4 = i5;
                            z5 = false;
                        } else {
                            i4 = i5;
                        }
                    } else {
                        z5 = false;
                    }
                }
                if (!luaValueB.d1()) {
                    LuaValue luaValueD = iVarS3.d();
                    if (!luaValueD.d1()) {
                        Appendable sb = z5 ? appendable2 : new StringBuilder();
                        if (z2) {
                            sb.append(str);
                        }
                        boolean z6 = z4;
                        sb.append("\t[");
                        i iVar = iVarS3;
                        boolean z7 = z3;
                        int i6 = iS1;
                        int i7 = i4;
                        ArrayList arrayList3 = arrayList2;
                        if (luaValueB.i1()) {
                            t2.a(sb, iMax, ' ', Integer.toString(luaValueB.y2()));
                        } else {
                            if (set == null || !(luaValueB instanceof LuaTable)) {
                                iMax = iMax;
                                if (luaValueB instanceof LuaString) {
                                    sb.append('\'');
                                    strG0 = luaValueB.g0();
                                    if (strG0.indexOf(39) >= 0) {
                                        strG0 = strG0.replace("'", "\\'");
                                    }
                                    sb.append(strG0);
                                    sb.append('\'');
                                } else {
                                    sb.append(luaValueB.g0());
                                }
                                sb.append("] = ");
                                if (set == null && (luaValueD instanceof LuaTable)) {
                                    LuaTable luaTable = (LuaTable) luaValueD;
                                    if (set.contains(luaTable)) {
                                        sb.append("{ -- table(");
                                        sb.append(Integer.toHexString(luaTable.hashCode()));
                                        sb.append(")\n");
                                        if (z2) {
                                            sb.append(str);
                                        }
                                        sb.append("\t\t-- *** RECURSION ***\n");
                                        if (z2) {
                                            sb.append(str);
                                        }
                                        sb.append("\t}");
                                    } else {
                                        if (str3 == null) {
                                            str3 = str + '\t';
                                        }
                                        String str4 = str3;
                                        luaTable.b3(str4, sb, map);
                                        str3 = str4;
                                    }
                                    sb.append(',');
                                    str2 = null;
                                } else {
                                    if (luaValueD instanceof LuaString) {
                                        sb.append('\'');
                                        strG1 = luaValueD.g0();
                                        if (strG1.indexOf(39) >= 0) {
                                            strG1 = strG1.replace("'", "\\'");
                                        }
                                        sb.append(strG1);
                                        sb.append("',");
                                    } else if (luaValueD instanceof LuaLong) {
                                        if (strG0 == null && (luaValueB instanceof LuaString)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z || !strG0.equals("address")) {
                                            sb.append(luaValueD.g0());
                                            if (z) {
                                                if (strG0.equals("flags")) {
                                                    iY3 = luaValueD.y2();
                                                    if (iY3 == 1) {
                                                        str2 = "gg.TYPE_BYTE";
                                                    } else if (iY3 == 2) {
                                                        str2 = "gg.TYPE_WORD";
                                                    } else if (iY3 == 4) {
                                                        str2 = "gg.TYPE_DWORD";
                                                    } else if (iY3 == 8) {
                                                        str2 = "gg.TYPE_XOR";
                                                    } else if (iY3 == 16) {
                                                        str2 = "gg.TYPE_FLOAT";
                                                    } else if (iY3 == 32) {
                                                        str2 = "gg.TYPE_QWORD";
                                                    } else if (iY3 != 64) {
                                                        str2 = null;
                                                    } else {
                                                        str2 = "gg.TYPE_DOUBLE";
                                                    }
                                                } else {
                                                    if (strG0.equals("freezeType")) {
                                                        iY2 = luaValueD.y2();
                                                        if (iY2 == 0) {
                                                            str2 = "gg.FREEZE_NORMAL";
                                                        } else if (iY2 == 1) {
                                                            str2 = "gg.FREEZE_MAY_INCREASE";
                                                        } else if (iY2 == 2) {
                                                            str2 = "gg.FREEZE_MAY_DECREASE";
                                                        } else if (iY2 == 3) {
                                                            str2 = "gg.FREEZE_IN_RANGE";
                                                        }
                                                    }
                                                    str2 = null;
                                                }
                                            }
                                            sb.append(',');
                                        } else {
                                            sb.append("0x");
                                            sb.append(Long.toHexString(luaValueD.z2()));
                                        }
                                        str2 = null;
                                        sb.append(',');
                                    } else {
                                        sb.append(luaValueD.g0());
                                        if (!(luaValueD instanceof Script.ApiFunction)) {
                                            sb.append(',');
                                        }
                                    }
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    sb.append(" -- ");
                                    sb.append(str2);
                                }
                                sb.append('\n');
                                if (z5) {
                                    arrayList2 = arrayList3;
                                } else {
                                    if (arrayList3 == null) {
                                        i2 = i6 - (i7 - 1);
                                        if (i2 < 0) {
                                            arrayList = new ArrayList();
                                        } else {
                                            arrayList = new ArrayList(i2);
                                        }
                                        arrayList2 = arrayList;
                                    } else {
                                        arrayList2 = arrayList3;
                                    }
                                    arrayList2.add(sb.toString());
                                }
                                appendable2 = appendable;
                                z4 = z6;
                                iVarS3 = iVar;
                                z3 = z7;
                                iS1 = i6;
                                i4 = i7;
                                iMax = iMax;
                            } else {
                                LuaTable luaTable2 = (LuaTable) luaValueB;
                                if (set.contains(luaTable2)) {
                                    sb.append("{ -- table(");
                                    sb.append(Integer.toHexString(luaTable2.hashCode()));
                                    sb.append(")\n");
                                    if (z2) {
                                        sb.append(str);
                                    }
                                    sb.append("\t\t-- *** RECURSION ***\n");
                                    if (z2) {
                                        sb.append(str);
                                    }
                                    sb.append("\t}");
                                } else {
                                    if (str3 == null) {
                                        str3 = str + '\t';
                                    }
                                    String str5 = str3;
                                    luaTable2.b3(str5, sb, map);
                                    str3 = str5;
                                }
                            }
                            strG0 = null;
                            sb.append("] = ");
                            if (set == null) {
                                if (luaValueD instanceof LuaString) {
                                    sb.append('\'');
                                    strG1 = luaValueD.g0();
                                    if (strG1.indexOf(39) >= 0) {
                                        strG1 = strG1.replace("'", "\\'");
                                    }
                                    sb.append(strG1);
                                    sb.append("',");
                                } else if (luaValueD instanceof LuaLong) {
                                    if (strG0 == null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    } else {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    }
                                    sb.append(',');
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (!(luaValueD instanceof Script.ApiFunction)) {
                                        sb.append(',');
                                    }
                                }
                                str2 = null;
                            } else {
                                if (luaValueD instanceof LuaString) {
                                    sb.append('\'');
                                    strG1 = luaValueD.g0();
                                    if (strG1.indexOf(39) >= 0) {
                                        strG1 = strG1.replace("'", "\\'");
                                    }
                                    sb.append(strG1);
                                    sb.append("',");
                                } else if (luaValueD instanceof LuaLong) {
                                    if (strG0 == null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    } else {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    }
                                    sb.append(',');
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (!(luaValueD instanceof Script.ApiFunction)) {
                                        sb.append(',');
                                    }
                                }
                                str2 = null;
                            }
                            if (str2 != null) {
                                sb.append(" -- ");
                                sb.append(str2);
                            }
                            sb.append('\n');
                            if (z5) {
                                if (arrayList3 == null) {
                                    i2 = i6 - (i7 - 1);
                                    if (i2 < 0) {
                                        arrayList = new ArrayList();
                                    } else {
                                        arrayList = new ArrayList(i2);
                                    }
                                    arrayList2 = arrayList;
                                } else {
                                    arrayList2 = arrayList3;
                                }
                                arrayList2.add(sb.toString());
                            } else {
                                arrayList2 = arrayList3;
                            }
                            appendable2 = appendable;
                            z4 = z6;
                            iVarS3 = iVar;
                            z3 = z7;
                            iS1 = i6;
                            i4 = i7;
                            iMax = iMax;
                        }
                        iMax = iMax;
                        strG0 = null;
                        sb.append("] = ");
                        if (set == null) {
                            if (luaValueD instanceof LuaString) {
                                sb.append('\'');
                                strG1 = luaValueD.g0();
                                if (strG1.indexOf(39) >= 0) {
                                    strG1 = strG1.replace("'", "\\'");
                                }
                                sb.append(strG1);
                                sb.append("',");
                            } else if (luaValueD instanceof LuaLong) {
                                if (strG0 == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                }
                                sb.append(',');
                            } else {
                                sb.append(luaValueD.g0());
                                if (!(luaValueD instanceof Script.ApiFunction)) {
                                    sb.append(',');
                                }
                            }
                            str2 = null;
                        } else {
                            if (luaValueD instanceof LuaString) {
                                sb.append('\'');
                                strG1 = luaValueD.g0();
                                if (strG1.indexOf(39) >= 0) {
                                    strG1 = strG1.replace("'", "\\'");
                                }
                                sb.append(strG1);
                                sb.append("',");
                            } else if (luaValueD instanceof LuaLong) {
                                if (strG0 == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                }
                                sb.append(',');
                            } else {
                                sb.append(luaValueD.g0());
                                if (!(luaValueD instanceof Script.ApiFunction)) {
                                    sb.append(',');
                                }
                            }
                            str2 = null;
                        }
                        if (str2 != null) {
                            sb.append(" -- ");
                            sb.append(str2);
                        }
                        sb.append('\n');
                        if (z5) {
                            if (arrayList3 == null) {
                                i2 = i6 - (i7 - 1);
                                if (i2 < 0) {
                                    arrayList = new ArrayList();
                                } else {
                                    arrayList = new ArrayList(i2);
                                }
                                arrayList2 = arrayList;
                            } else {
                                arrayList2 = arrayList3;
                            }
                            arrayList2.add(sb.toString());
                        } else {
                            arrayList2 = arrayList3;
                        }
                        appendable2 = appendable;
                        z4 = z6;
                        iVarS3 = iVar;
                        z3 = z7;
                        iS1 = i6;
                        i4 = i7;
                        iMax = iMax;
                    }
                }
            }
        }
        ArrayList arrayList4 = arrayList2;
        if (arrayList4 != null) {
            try {
                Collections.sort(arrayList4);
            } catch (Throwable th) {
                e1.a(th);
            }
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                appendable.append((String) it.next());
            }
        }
        if (z2) {
            appendable.append(str);
        }
        appendable.append('}');
        return appendable;
    }

    private void h3(LuaValue luaValue) {
        if (this.Q.length > 0) {
            int iI3 = i3(luaValue);
            for (m mVarA = this.Q[iI3]; mVarA != null; mVarA = mVarA.a()) {
                n nVarF = mVarA.f(luaValue);
                if (nVarF != null) {
                    m[] mVarArr = this.Q;
                    mVarArr[iI3] = mVarArr[iI3].h(nVarF);
                    this.R--;
                    return;
                }
            }
        }
    }

    private int i3(LuaValue luaValue) {
        return luaValue.hashCode() & (this.Q.length - 1);
    }

    public static int j3(LuaValue luaValue, int i2) {
        return luaValue.hashCode() & i2;
    }

    public static int l3(int i2, int i3) {
        return i2 & i3;
    }

    private void n3(int i2, LuaValue luaValue) {
        o3(i2, luaValue);
        while (i2 > 1) {
            LuaValue luaValueC3 = c3(i2);
            e2(i2, c3(1));
            e2(1, luaValueC3);
            i2--;
            B3(1, i2, luaValue);
        }
    }

    private void o3(int i2, LuaValue luaValue) {
        for (int i3 = i2 / 2; i3 > 0; i3--) {
            B3(i3, i2, luaValue);
        }
    }

    protected static boolean r3(LuaValue luaValue) {
        int iC2 = luaValue.C2();
        if (iC2 == 1 || iC2 == 3) {
            return false;
        }
        return iC2 != 4 || luaValue.W1() > 32;
    }

    static int u3(int i2) {
        int i3;
        int i4 = i2 - 1;
        if (i4 < 0) {
            return Integer.MIN_VALUE;
        }
        if (((-65536) & i4) != 0) {
            i4 >>>= 16;
            i3 = 16;
        } else {
            i3 = 0;
        }
        if ((65280 & i4) != 0) {
            i3 += 8;
            i4 >>>= 8;
        }
        if ((i4 & 240) != 0) {
            i3 += 4;
            i4 >>>= 4;
        }
        switch (i4) {
            case 0:
                return 0;
            case 1:
                return i3 + 1;
            case 2:
            case 3:
                return i3 + 2;
            case 4:
            case 5:
            case 6:
            case 7:
                return i3 + 3;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i3 + 4;
            default:
                return i3;
        }
    }

    private void y3(int i2) {
        LuaValue[] luaValueArr;
        m[] mVarArr;
        int i3;
        m mVarZ2;
        luaj.e eVar = this.S;
        if (eVar != null && (eVar.q() || this.S.p())) {
            this.R = X2();
            if (this.S.p()) {
                a3();
            }
        }
        int[] iArr = new int[32];
        int iY2 = Y2(iArr);
        if (i2 > 0) {
            iY2++;
            int iU3 = u3(i2);
            iArr[iU3] = iArr[iU3] + 1;
        }
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = 0;
        while (true) {
            if (i5 >= 32) {
                break;
            }
            i4 += iArr[i5];
            int i7 = 1 << i5;
            if (iY2 * 2 < i7) {
                break;
            }
            if (i4 >= (1 << (i5 - 1))) {
                i6 = i7;
            }
            i5++;
        }
        LuaValue[] luaValueArr2 = this.P;
        m[] mVarArr2 = this.Q;
        int i8 = (i2 <= 0 || i2 > i6) ? 0 : -1;
        if (i6 != luaValueArr2.length) {
            luaValueArr = new LuaValue[i6];
            if (i6 > luaValueArr2.length) {
                int iU4 = u3(i6) + 1;
                for (int iU5 = u3(luaValueArr2.length + 1); iU5 < iU4; iU5++) {
                    i8 += iArr[iU5];
                }
            } else if (luaValueArr2.length > i6) {
                int iU6 = u3(luaValueArr2.length) + 1;
                for (int iU7 = u3(i6 + 1); iU7 < iU6; iU7++) {
                    i8 -= iArr[iU7];
                }
            }
            System.arraycopy(luaValueArr2, 0, luaValueArr, 0, Math.min(luaValueArr2.length, i6));
        } else {
            luaValueArr = luaValueArr2;
        }
        int i9 = (this.R - i8) + ((i2 < 0 || i2 > i6) ? 1 : 0);
        if (i9 > 0) {
            int iU8 = i9 >= 2 ? 1 << u3(i9) : 2;
            i3 = iU8 - 1;
            mVarArr = new m[iU8];
        } else {
            mVarArr = U;
            i3 = 0;
        }
        for (m mVarA : mVarArr2) {
            for (; mVarA != null; mVarA = mVarA.a()) {
                int iR = mVarA.r(i6);
                if (iR > 0) {
                    n nVarL = mVarA.l();
                    if (nVarL != null) {
                        luaValueArr[iR - 1] = nVarL.t();
                    }
                } else if (!(mVarA instanceof c)) {
                    int iB = mVarA.b(i3);
                    mVarArr[iB] = mVarA.n(mVarArr[iB]);
                }
            }
        }
        while (i6 < luaValueArr2.length) {
            int i10 = i6 + 1;
            LuaValue luaValue = luaValueArr2[i6];
            if (luaValue != null) {
                long j2 = i10;
                int iL3 = l3(LuaLong.V2(j2), i3);
                luaj.e eVar2 = this.S;
                LuaLong luaLongI2 = LuaValue.I2(j2);
                if (eVar2 != null) {
                    mVarZ2 = eVar2.k(luaLongI2, luaValue);
                    if (mVarZ2 == null) {
                    }
                } else {
                    mVarZ2 = Z2(luaLongI2, luaValue);
                }
                m mVar = mVarArr[iL3];
                if (mVar != null) {
                    mVarZ2 = mVar.d(mVarZ2);
                }
                mVarArr[iL3] = mVarZ2;
            }
            i6 = i10;
        }
        this.Q = mVarArr;
        this.P = luaValueArr;
        this.R -= i8;
    }

    @Override // luaj.LuaValue
    public int C2() {
        return 5;
    }

    @Override // luaj.LuaValue
    public String D2() {
        return "table";
    }

    public void D3(LuaValue luaValue) {
        int iS1 = s1();
        if (iS1 >= 16777215) {
            throw new luaj.d("array too big: " + iS1 + " >= 16777215");
        }
        luaj.e eVar = this.S;
        if (eVar != null && eVar.p()) {
            a3();
        }
        if (iS1 > 1) {
            if (luaValue.l1()) {
                luaValue = null;
            }
            n3(iS1, luaValue);
        }
    }

    public String E3(Appendable appendable, Map map) {
        if (V != null) {
            return b3("", appendable, map).toString();
        }
        V = new HashSet();
        W = 0;
        String string = b3("", appendable, map).toString();
        W = 0;
        V = null;
        return string;
    }

    public Varargs F3(long j2, long j3) {
        if (j3 < j2) {
            return LuaValue.f1676f;
        }
        long j4 = j3 - j2;
        if (j4 < 0) {
            throw new luaj.d("too many results to unpack: greater 9223372036854775807");
        }
        if (j4 >= 16777215) {
            throw new luaj.d("too many results to unpack: " + j4 + " (max is 16777215)");
        }
        int i2 = (int) (j4 + 1);
        int i3 = (int) j2;
        boolean z = ((long) i3) == j2 && ((long) ((int) j3)) == j3;
        if (i2 <= 0) {
            return LuaValue.f1676f;
        }
        if (i2 == 1) {
            return z ? c3(i3) : U0(LuaLong.I2(j2));
        }
        if (i2 == 2) {
            LuaValue luaValueC3 = z ? c3(i3) : U0(LuaLong.I2(j2));
            long j5 = j2 + 1;
            return LuaValue.N2(luaValueC3, z ? c3((int) j5) : U0(LuaLong.I2(j5)));
        }
        try {
            LuaValue[] luaValueArr = new LuaValue[i2];
            while (true) {
                i2--;
                if (i2 < 0) {
                    return LuaValue.O2(luaValueArr);
                }
                long j6 = ((long) i2) + j2;
                luaValueArr[i2] = z ? c3((int) j6) : U0(LuaLong.I2(j6));
            }
        } catch (OutOfMemoryError e2) {
            e1.l("OOM on unpack: " + i2, e2);
            throw new luaj.d("too many results to unpack [out of memory]: " + i2);
        }
    }

    public void G3(int i2, LuaString luaString, double d2) {
        m[] mVarArr = this.Q;
        float f2 = (float) d2;
        m fVar = ((double) f2) == d2 ? new f(luaString, f2) : new d(luaString, d2);
        m mVar = mVarArr[i2];
        if (mVar != null) {
            fVar = mVar.d(fVar);
        }
        mVarArr[i2] = fVar;
        this.R++;
    }

    @Override // luaj.LuaValue
    public LuaTable H0() {
        return this;
    }

    public void H3(int i2, LuaString luaString, float f2) {
        m[] mVarArr = this.Q;
        m fVar = new f(luaString, f2);
        m mVar = mVarArr[i2];
        if (mVar != null) {
            fVar = mVar.d(fVar);
        }
        mVarArr[i2] = fVar;
        this.R++;
    }

    public void I3(int i2, LuaString luaString, int i3) {
        m[] mVarArr = this.Q;
        m hVar = new h(luaString, i3);
        m mVar = mVarArr[i2];
        if (mVar != null) {
            hVar = mVar.d(hVar);
        }
        mVarArr[i2] = hVar;
        this.R++;
    }

    public void J3(int i2, LuaString luaString, long j2) {
        m[] mVarArr = this.Q;
        int i3 = (int) j2;
        m hVar = ((long) i3) == j2 ? new h(luaString, i3) : new k(luaString, j2);
        m mVar = mVarArr[i2];
        if (mVar != null) {
            hVar = mVar.d(hVar);
        }
        mVarArr[i2] = hVar;
        this.R++;
    }

    public void K3(int i2, LuaString luaString, boolean z) {
        m[] mVarArr = this.Q;
        m bVar = new b(luaString, z);
        m mVar = mVarArr[i2];
        if (mVar != null) {
            bVar = mVar.d(bVar);
        }
        mVarArr[i2] = bVar;
        this.R++;
    }

    @Override // luaj.LuaValue
    public LuaTable L1(LuaTable luaTable) {
        return this;
    }

    @Override // luaj.LuaValue
    public boolean P0(LuaValue luaValue) {
        if (this == luaValue) {
            return true;
        }
        if (luaValue.o1()) {
            return LuaValue.Q0(this, luaValue);
        }
        return false;
    }

    @Override // luaj.LuaValue
    public void R1(int i2) {
        LuaValue[] luaValueArr = this.P;
        if (i2 > luaValueArr.length) {
            this.P = A3(luaValueArr, 1 << u3(i2));
        }
    }

    @Override // luaj.LuaValue
    public LuaValue U0(LuaValue luaValue) {
        LuaValue luaValueV1 = V1(luaValue);
        return (!luaValueV1.l1() || this.S == null) ? luaValueV1 : LuaValue.W0(this, luaValue);
    }

    @Override // luaj.LuaValue
    public LuaValue V0() {
        luaj.e eVar = this.S;
        if (eVar != null) {
            return eVar.e();
        }
        return null;
    }

    @Override // luaj.LuaValue
    public LuaValue V1(LuaValue luaValue) {
        int iY2;
        if (luaValue.i1() && (iY2 = luaValue.y2()) > 0) {
            LuaValue[] luaValueArr = this.P;
            if (iY2 <= luaValueArr.length) {
                luaj.e eVar = this.S;
                int i2 = iY2 - 1;
                LuaValue luaValueO = eVar == null ? luaValueArr[i2] : eVar.o(luaValueArr, i2);
                return luaValueO != null ? luaValueO : LuaValue.f1673c;
            }
        }
        return k3(luaValue);
    }

    @Override // luaj.LuaValue
    public int W1() {
        int i2;
        int iD3 = d3();
        if (iD3 == 0 || !x3(iD3).l1()) {
            int iF3 = iD3 + 1;
            int i3 = iD3;
            while (!x3(iF3).l1()) {
                i3 = iF3;
                iF3 = f3() + iD3 + 1 + iF3;
            }
            iD3 = iF3;
            i2 = i3;
        } else {
            i2 = 0;
        }
        while (iD3 > i2 + 1) {
            int i4 = (i2 + iD3) / 2;
            if (x3(i4).l1()) {
                iD3 = i4;
            } else {
                i2 = i4;
            }
        }
        return i2;
    }

    public LuaValue W2(LuaString luaString, int i2, int i3) {
        ggf.a aVar = new ggf.a();
        if (i2 <= i3) {
            while (true) {
                aVar.c(c3(i2).G0());
                if (i2 >= Integer.MAX_VALUE || (i2 = i2 + 1) > i3) {
                    break;
                }
                aVar.c(luaString);
            }
        }
        return aVar.l();
    }

    @Override // luaj.LuaValue
    public void Y1(int i2, LuaValue luaValue) {
        if (luaValue == null || U2(i2, luaValue)) {
            return;
        }
        m3(LuaLong.I2(i2), luaValue);
    }

    public LuaValue c3(int i2) {
        LuaValue luaValueX3 = x3(i2);
        return (!luaValueX3.l1() || this.S == null) ? luaValueX3 : LuaValue.W0(this, LuaValue.I2(i2));
    }

    @Override // luaj.LuaValue
    public void d2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue == null || luaValue2 == null) {
            return;
        }
        if (luaValue.i1() && U2(luaValue.y2(), luaValue2)) {
            return;
        }
        m3(luaValue, luaValue2);
    }

    public int d3() {
        return this.P.length;
    }

    @Override // luaj.e
    public LuaValue e() {
        return this;
    }

    @Override // luaj.LuaValue
    public void e2(int i2, LuaValue luaValue) {
        if (this.S != null && x3(i2).l1() && LuaValue.l2(this, LuaLong.I2(i2), luaValue)) {
            return;
        }
        Y1(i2, luaValue);
    }

    public int e3() {
        return this.R;
    }

    public int f3() {
        return this.Q.length;
    }

    @Override // luaj.e
    public LuaValue g(LuaValue luaValue) {
        return luaValue;
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String g0() {
        try {
            return E3(new StringBuilder(), null);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public long g3(LuaValue luaValue) {
        n nVarC3 = C3(luaValue);
        if (nVarC3 == null) {
            return (this.S != null ? LuaValue.W0(this, luaValue) : LuaValue.f1673c).C0();
        }
        if (nVarC3 instanceof h) {
            return ((h) nVarC3).k0();
        }
        return nVarC3 instanceof k ? ((k) nVarC3).k0() : nVarC3.t().C0();
    }

    @Override // luaj.LuaValue
    public void j2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue == null || !(luaValue.q1() || x1(LuaValue.m).g1())) {
            throw new luaj.d("value ('" + luaValue + "') can not be used as a table index");
        }
        if (this.S != null && V1(luaValue).l1() && LuaValue.l2(this, luaValue, luaValue2)) {
            return;
        }
        d2(luaValue, luaValue2);
    }

    @Override // luaj.e
    public m k(LuaValue luaValue, LuaValue luaValue2) {
        return Z2(luaValue, luaValue2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x003d  */
    @Override // luaj.LuaValue
    public LuaValue k2(LuaValue luaValue) {
        luaj.e eVar = this.S;
        boolean z = eVar != null && eVar.q();
        luaj.e eVar2 = this.S;
        boolean z2 = eVar2 != null && eVar2.p();
        luaj.e eVarW1 = LuaValue.w1(luaValue);
        this.S = eVarW1;
        if (z != (eVarW1 != null && eVarW1.q())) {
            y3(0);
        } else {
            luaj.e eVar3 = this.S;
            if (z2 != (eVar3 != null && eVar3.p())) {
                y3(0);
            }
        }
        return this;
    }

    protected LuaValue k3(LuaValue luaValue) {
        n nVarC3 = C3(luaValue);
        return nVarC3 == null ? LuaValue.f1673c : nVarC3.t();
    }

    public void m3(LuaValue luaValue, LuaValue luaValue2) {
        int iI3;
        if (luaValue2.l1()) {
            h3(luaValue);
            return;
        }
        if (this.Q.length > 0) {
            iI3 = i3(luaValue);
            for (m mVarA = this.Q[iI3]; mVarA != null; mVarA = mVarA.a()) {
                n nVarF = mVarA.f(luaValue);
                if (nVarF != null) {
                    m[] mVarArr = this.Q;
                    mVarArr[iI3] = mVarArr[iI3].j(nVarF, luaValue2);
                    return;
                }
            }
        } else {
            iI3 = 0;
        }
        if (this.R >= this.Q.length) {
            luaj.e eVar = this.S;
            if ((eVar == null || !eVar.p()) && luaValue.i1() && luaValue.y2() > 0) {
                y3(luaValue.y2());
                if (U2(luaValue.y2(), luaValue2)) {
                    return;
                }
            } else {
                y3(-1);
            }
            iI3 = i3(luaValue);
        }
        luaj.e eVar2 = this.S;
        m mVarK = eVar2 != null ? eVar2.k(luaValue, luaValue2) : Z2(luaValue, luaValue2);
        m[] mVarArr2 = this.Q;
        m mVar = mVarArr2[iI3];
        if (mVar != null) {
            mVarK = mVar.d(mVarK);
        }
        mVarArr2[iI3] = mVarK;
        this.R++;
    }

    @Override // luaj.e
    public LuaValue o(LuaValue[] luaValueArr, int i2) {
        return luaValueArr[i2];
    }

    @Override // luaj.LuaValue
    public boolean o1() {
        return true;
    }

    @Override // luaj.e
    public boolean p() {
        return false;
    }

    public Varargs p3(LuaValue luaValue) {
        int iA0 = luaValue.A0() + 1;
        LuaValue luaValueC3 = c3(iA0);
        return luaValueC3.l1() ? LuaValue.f1676f : LuaValue.N2(LuaLong.I2(iA0), luaValueC3);
    }

    @Override // luaj.e
    public boolean q() {
        return false;
    }

    public void q3(int i2, LuaValue luaValue) {
        while (!luaValue.l1()) {
            LuaValue luaValueC3 = c3(i2);
            e2(i2, luaValue);
            luaValue = luaValueC3;
            i2++;
        }
    }

    @Override // luaj.LuaValue
    public LuaValue r1() {
        LuaValue luaValueX1 = x1(LuaValue.x);
        return luaValueX1.w2() ? luaValueX1.call(this) : LuaLong.I2(W1());
    }

    @Override // luaj.LuaValue
    public int s1() {
        if (this.S == null) {
            return W1();
        }
        LuaValue luaValueR1 = r1();
        if (luaValueR1.i1()) {
            return luaValueR1.y2();
        }
        throw new luaj.d("table length is not an integer: " + luaValueR1);
    }

    public i s3() {
        return new i();
    }

    public LuaValue[] t3() {
        ArrayList arrayList = new ArrayList();
        i iVarS3 = s3();
        while (iVarS3.c()) {
            arrayList.add(iVarS3.b());
        }
        LuaValue[] luaValueArr = new LuaValue[arrayList.size()];
        arrayList.toArray(luaValueArr);
        return luaValueArr;
    }

    public Varargs v3(LuaValue luaValue) {
        int iY2;
        int length = 0;
        if (!luaValue.l1()) {
            if (!luaValue.i1() || (iY2 = luaValue.y2()) <= 0 || iY2 > this.P.length) {
                if (this.Q.length == 0) {
                    LuaValue.R0("invalid key to 'next' 1: " + luaValue);
                }
                int iI3 = i3(luaValue);
                for (m mVarA = this.Q[iI3]; mVarA != null; mVarA = mVarA.a()) {
                    if (length != 0) {
                        n nVarL = mVarA.l();
                        if (nVarL != null) {
                            return nVarL.c();
                        }
                    } else if (mVarA.s(luaValue)) {
                        length = 1;
                    }
                }
                if (length == 0) {
                    LuaValue.R0("invalid key to 'next' 2: " + luaValue);
                }
                length = iI3 + this.P.length + 1;
            } else {
                length = iY2;
            }
        }
        while (true) {
            LuaValue[] luaValueArr = this.P;
            if (length < luaValueArr.length) {
                LuaValue luaValueO = luaValueArr[length];
                if (luaValueO != null) {
                    luaj.e eVar = this.S;
                    if (eVar != null) {
                        luaValueO = eVar.o(luaValueArr, length);
                    }
                    if (luaValueO != null) {
                        return LuaValue.N2(LuaLong.I2(length + 1), luaValueO);
                    }
                }
                length++;
            } else {
                int length2 = length - luaValueArr.length;
                while (true) {
                    m[] mVarArr = this.Q;
                    if (length2 >= mVarArr.length) {
                        return LuaValue.f1673c;
                    }
                    for (m mVarA2 = mVarArr[length2]; mVarA2 != null; mVarA2 = mVarA2.a()) {
                        n nVarL2 = mVarA2.l();
                        if (nVarL2 != null) {
                            return nVarL2.c();
                        }
                    }
                    length2++;
                }
            }
        }
    }

    public void w3(int i2, int i3) {
        if (i3 > 0 && i3 < 2) {
            i3 = 2;
        }
        this.P = i2 > 0 ? new LuaValue[1 << u3(i2)] : LuaValue.j;
        this.Q = i3 > 0 ? new m[1 << u3(i3)] : U;
        this.R = 0;
    }

    public LuaValue x3(int i2) {
        if (i2 > 0) {
            LuaValue[] luaValueArr = this.P;
            if (i2 <= luaValueArr.length) {
                luaj.e eVar = this.S;
                int i3 = i2 - 1;
                LuaValue luaValueO = eVar == null ? luaValueArr[i3] : eVar.o(luaValueArr, i3);
                return luaValueO != null ? luaValueO : LuaValue.f1673c;
            }
        }
        return k3(LuaLong.I2(i2));
    }

    public LuaValue z3(int i2, int i3) {
        if (i2 == 0) {
            i2 = i3;
        } else if (i2 > i3) {
            return LuaValue.f1676f;
        }
        LuaValue luaValueC3 = c3(i2);
        LuaValue luaValue = luaValueC3;
        while (!luaValue.l1()) {
            int i4 = i2 + 1;
            LuaValue luaValueC4 = c3(i4);
            e2(i2, luaValueC4);
            i2 = i4;
            luaValue = luaValueC4;
        }
        return luaValueC3.l1() ? LuaValue.f1676f : luaValueC3;
    }

    public LuaTable(int i2, int i3) {
        w3(i2, i3);
    }

    public LuaTable(Varargs varargs, int i2) {
        int i3 = i2 - 1;
        int iMax = Math.max(varargs.U() - i3, 0);
        w3(iMax, 1);
        j2(T, LuaValue.I2(iMax));
        for (int i4 = 1; i4 <= iMax; i4++) {
            e2(i4, varargs.v(i4 + i3));
        }
    }

    public LuaTable(LuaValue[] luaValueArr, LuaValue[] luaValueArr2, Varargs varargs) {
        int length = luaValueArr != null ? luaValueArr.length : 0;
        int length2 = luaValueArr2 != null ? luaValueArr2.length : 0;
        w3((varargs != null ? varargs.U() : 0) + length2, length >> 1);
        int i2 = 0;
        while (i2 < length2) {
            int i3 = i2 + 1;
            Y1(i3, luaValueArr2[i2]);
            i2 = i3;
        }
        if (varargs != null) {
            int iU = varargs.U();
            for (int i4 = 1; i4 <= iU; i4++) {
                Y1(length2 + i4, varargs.v(i4));
            }
        }
        for (int i5 = 0; i5 < length; i5 += 2) {
            int i6 = i5 + 1;
            if (!luaValueArr[i6].l1()) {
                d2(luaValueArr[i5], luaValueArr[i6]);
            }
        }
    }
}
