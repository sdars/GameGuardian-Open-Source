package android.ext;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class z1$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ List f1422d;

    z1$b(int i, int i2, int i3, List list) {
        this.f1419a = i;
        this.f1420b = i2;
        this.f1421c = i3;
        this.f1422d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f1419a != z1.f1416g) {
            return;
        }
        int iMin = Math.min(this.f1420b + 8, this.f1421c);
        for (int i = this.f1420b; i < iMin; i++) {
            if (this.f1419a != z1.f1416g) {
                return;
            }
            z1$d z1_d = (z1$d) this.f1422d.get(i);
            if (z1_d != null && !z1_d.p) {
                z1_d.i(this.f1419a);
            }
        }
        if (iMin < this.f1421c) {
            n2.c().post(new z1$b$a(this, iMin));
        }
    }
}
