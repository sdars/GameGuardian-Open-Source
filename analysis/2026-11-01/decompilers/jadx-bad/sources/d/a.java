package d;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f1505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f1506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean[] f1507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1508d;

    public a() {
        this(0);
    }

    private void g() {
        int i = this.f1508d;
        h(i + (i < 6 ? 12 : i >> 1));
    }

    private void h(int i) {
        boolean[] zArr;
        long[] jArr;
        int[] iArr;
        if (i == 0) {
            jArr = b.f1513e;
            iArr = b.f1512d;
            zArr = b.f1515g;
        } else {
            int[] iArr2 = new int[i];
            zArr = new boolean[i];
            jArr = new long[i * 2];
            iArr = iArr2;
        }
        int i2 = this.f1508d;
        if (i2 != 0) {
            System.arraycopy(this.f1505a, 0, jArr, 0, i2 * 2);
            System.arraycopy(this.f1506b, 0, iArr, 0, i2);
            System.arraycopy(this.f1507c, 0, zArr, 0, i2);
        }
        this.f1505a = jArr;
        this.f1506b = iArr;
        this.f1507c = zArr;
    }

    static IndexOutOfBoundsException j(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    public void a(long j, long j2, int i, boolean z) {
        int i2 = this.f1508d;
        if (i2 == this.f1506b.length) {
            g();
        }
        long[] jArr = this.f1505a;
        int i3 = i2 * 2;
        jArr[i3] = j;
        jArr[i3 + 1] = j2;
        this.f1506b[i2] = i;
        this.f1507c[i2] = z;
        this.f1508d = i2 + 1;
    }

    public void b(int i, boolean z) {
        this.f1507c[i] = z;
    }

    public boolean c(int i) {
        return this.f1507c[i];
    }

    public void d() {
        this.f1508d = 0;
    }

    public void e(int i) {
        if (this.f1506b.length < i) {
            h(i);
        }
    }

    public android.ext.c f(int i, android.ext.c cVar) {
        int i2 = this.f1508d;
        if (i >= i2) {
            j(i, i2);
        }
        if (cVar == null) {
            long[] jArr = this.f1505a;
            int i3 = i * 2;
            return new android.ext.c(jArr[i3], jArr[i3 + 1], this.f1506b[i]);
        }
        long[] jArr2 = this.f1505a;
        int i4 = i * 2;
        cVar.f672a = jArr2[i4];
        cVar.f673b = jArr2[i4 + 1];
        cVar.f674c = this.f1506b[i];
        return cVar;
    }

    public int i() {
        return this.f1508d;
    }

    public void k() {
        int i = this.f1508d;
        if (i == this.f1507c.length) {
            return;
        }
        h(i);
    }

    public a(int i) {
        h(b.c(i));
    }
}
