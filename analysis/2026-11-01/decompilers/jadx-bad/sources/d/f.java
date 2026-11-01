package d;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class f implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f1523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f1524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1525c;

    public f(int i) {
        if (i == 0) {
            long[] jArr = b.f1513e;
            this.f1523a = jArr;
            this.f1524b = jArr;
        } else {
            int iC = b.c(i);
            this.f1523a = new long[iC];
            this.f1524b = new long[iC];
        }
        this.f1525c = 0;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f clone() {
        f fVar = null;
        try {
            f fVar2 = (f) super.clone();
            try {
                fVar2.f1523a = (long[]) this.f1523a.clone();
                fVar2.f1524b = (long[]) this.f1524b.clone();
                return fVar2;
            } catch (CloneNotSupportedException unused) {
                fVar = fVar2;
                return fVar;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public int b(long j) {
        return b.a(this.f1523a, this.f1525c, j);
    }

    public long c(int i) {
        return this.f1523a[i];
    }

    public boolean d(long j, long j2) {
        int iA = b.a(this.f1523a, this.f1525c, j);
        if (iA >= 0) {
            long[] jArr = this.f1524b;
            if (jArr[iA] == j2) {
                return false;
            }
            jArr[iA] = j2;
        } else {
            int i = ~iA;
            this.f1523a = d.d(this.f1523a, this.f1525c, i, j);
            this.f1524b = d.d(this.f1524b, this.f1525c, i, j2);
            this.f1525c++;
        }
        return true;
    }

    public int e() {
        return this.f1525c;
    }

    public void f() {
        this.f1523a = new long[16];
        this.f1524b = new long[16];
        this.f1525c = 0;
    }

    public long g(int i) {
        return this.f1524b[i];
    }

    public String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1525c * 28);
        sb.append('{');
        for (int i = 0; i < this.f1525c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(c(i));
            sb.append('=');
            sb.append(g(i));
        }
        sb.append('}');
        return sb.toString();
    }
}
