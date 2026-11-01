package g;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f1585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f1586b;

    public d(int[] iArr, int i) {
        this.f1585a = iArr;
        this.f1586b = i;
    }

    int a() {
        return this.f1585a[this.f1586b];
    }

    void b(int i) {
        this.f1585a[this.f1586b] = i;
    }
}
