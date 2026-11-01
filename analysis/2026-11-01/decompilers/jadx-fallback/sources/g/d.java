package g;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f1585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f1586b;

    public d(int[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f1585a = r1
            r0.f1586b = r2
            return
    }

    int a() {
            r2 = this;
            int[] r0 = r2.f1585a
            int r1 = r2.f1586b
            r0 = r0[r1]
            return r0
    }

    void b(int r3) {
            r2 = this;
            int[] r0 = r2.f1585a
            int r1 = r2.f1586b
            r0[r1] = r3
            return
    }
}
