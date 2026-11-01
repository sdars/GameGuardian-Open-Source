package d;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class e implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f1517f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f1519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f1520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean[] f1521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1522e;

    public e() {
        this(16);
    }

    private void d() {
        int i = this.f1522e;
        long[] jArr = this.f1519b;
        Object[] objArr = this.f1520c;
        boolean[] zArr = this.f1521d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1517f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    zArr[i2] = zArr[i3];
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1518a = false;
        this.f1522e = i2;
    }

    public boolean a(int i) {
        if (this.f1518a) {
            d();
        }
        return this.f1521d[i];
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e clone() {
        e eVar = null;
        try {
            e eVar2 = (e) super.clone();
            try {
                eVar2.f1519b = (long[]) this.f1519b.clone();
                eVar2.f1520c = (Object[]) this.f1520c.clone();
                eVar2.f1521d = (boolean[]) this.f1521d.clone();
                return eVar2;
            } catch (CloneNotSupportedException unused) {
                eVar = eVar2;
                return eVar;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public Object c(long j) {
        Object[] objArr;
        Object obj;
        Object obj2;
        int iA = b.a(this.f1519b, this.f1522e, j);
        if (iA < 0 || (obj = (objArr = this.f1520c)[iA]) == (obj2 = f1517f)) {
            return null;
        }
        objArr[iA] = obj2;
        this.f1518a = true;
        return obj;
    }

    public Object e(long j) {
        return f(j, null);
    }

    public Object f(long j, Object obj) {
        Object obj2;
        int iA = b.a(this.f1519b, this.f1522e, j);
        return (iA < 0 || (obj2 = this.f1520c[iA]) == f1517f) ? obj : obj2;
    }

    public int g(long j) {
        if (this.f1518a) {
            d();
        }
        return b.a(this.f1519b, this.f1522e, j);
    }

    public long h(int i) {
        if (this.f1518a) {
            d();
        }
        return this.f1519b[i];
    }

    public Object i(long j, Object obj, byte b2) {
        int iA = b.a(this.f1519b, this.f1522e, j);
        if (iA >= 0) {
            Object[] objArr = this.f1520c;
            Object obj2 = objArr[iA];
            objArr[iA] = obj;
            if (b2 != 0) {
                this.f1521d[iA] = b2 == 1;
            }
            return obj2;
        }
        int i = ~iA;
        int i2 = this.f1522e;
        if (i < i2) {
            Object[] objArr2 = this.f1520c;
            if (objArr2[i] == f1517f) {
                this.f1519b[i] = j;
                objArr2[i] = obj;
                if (b2 != 0) {
                    this.f1521d[i] = b2 == 1;
                }
                return null;
            }
        }
        if (this.f1518a && i2 >= this.f1519b.length) {
            d();
            i = ~b.a(this.f1519b, this.f1522e, j);
        }
        this.f1519b = d.d(this.f1519b, this.f1522e, i, j);
        this.f1520c = d.e(this.f1520c, this.f1522e, i, obj);
        this.f1521d = d.f(this.f1521d, this.f1522e, i, b2 == 1);
        this.f1522e++;
        return null;
    }

    public Object j(int i) {
        Object[] objArr = this.f1520c;
        Object obj = objArr[i];
        Object obj2 = f1517f;
        if (obj == obj2) {
            return null;
        }
        objArr[i] = obj2;
        this.f1518a = true;
        return obj;
    }

    public void k(int i, boolean z) {
        if (this.f1518a) {
            d();
        }
        this.f1521d[i] = z;
    }

    public int l() {
        if (this.f1518a) {
            d();
        }
        return this.f1522e;
    }

    public void m() {
        this.f1519b = new long[16];
        this.f1520c = new Object[16];
        this.f1521d = new boolean[16];
        this.f1522e = 0;
        this.f1518a = false;
    }

    public Object n(int i) {
        if (this.f1518a) {
            d();
        }
        return this.f1520c[i];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1522e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1522e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(h(i));
            sb.append('=');
            Object objN = n(i);
            if (objN != this) {
                sb.append(objN);
            } else {
                sb.append("(this Map)");
            }
            sb.append(" [");
            sb.append(a(i));
            sb.append("]");
        }
        sb.append('}');
        return sb.toString();
    }

    public e(int i) {
        this.f1518a = false;
        if (i == 0) {
            this.f1519b = b.f1513e;
            this.f1520c = b.f1514f;
            this.f1521d = b.f1515g;
        } else {
            int iC = b.c(i);
            this.f1519b = new long[iC];
            this.f1520c = new Object[iC];
            this.f1521d = new boolean[iC];
        }
        this.f1522e = 0;
    }
}
