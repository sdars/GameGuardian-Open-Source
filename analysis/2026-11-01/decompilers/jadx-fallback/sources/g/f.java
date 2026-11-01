package g;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class f extends g.c {
    final lasm.b q;

    public f(lasm.b r2) {
            r1 = this;
            r1.<init>()
            r1.q = r2
            g.g r2 = new g.g
            r0 = 0
            r2.<init>(r0, r0)
            r1.f1576e = r2
            return
    }

    @Override // g.c
    int S(int r1, int r2) {
            r0 = this;
            lasm.b r2 = r0.q
            int r1 = r2.g(r1)
            return r1
    }

    @Override // g.c
    public int T(int r1, int r2, int r3, int r4) {
            r0 = this;
            int r1 = super.T(r1, r2, r3, r4)
            return r1
    }

    @Override // g.c
    public int U(int r1, int r2, int r3) {
            r0 = this;
            int r1 = super.U(r1, r2, r3)
            return r1
    }

    @Override // g.c
    public int V(int r1, int r2, int r3) {
            r0 = this;
            int r1 = super.V(r1, r2, r3)
            return r1
    }

    @Override // g.c
    public int W(int r1, int r2) {
            r0 = this;
            int r1 = super.W(r1, r2)
            return r1
    }

    public void o1(int r3, int r4, int r5) {
            r2 = this;
            r0 = 511(0x1ff, float:7.16E-43)
            r1 = 36
            if (r5 > r0) goto La
            r2.T(r1, r3, r4, r5)
            goto L15
        La:
            r0 = 0
            r2.T(r1, r3, r4, r0)
            g.g r3 = r2.f1576e
            int r3 = r3.f1590d
            r2.S(r5, r3)
        L15:
            return
    }
}
