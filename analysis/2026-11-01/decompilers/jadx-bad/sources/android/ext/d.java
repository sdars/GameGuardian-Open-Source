package android.ext;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d.f[] f700a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f702b;
    }

    public d() {
        this(10);
    }

    public void a(long j, int i, a aVar) {
        boolean z;
        d.f fVar;
        int iB;
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
        if (iNumberOfTrailingZeros >= 7 || (iB = (fVar = this.f700a[iNumberOfTrailingZeros]).b(j)) < 0) {
            z = false;
        } else {
            aVar.f701a = fVar.g(iB);
            z = true;
        }
        aVar.f702b = z;
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        d.f[] fVarArr = this.f700a;
        for (int i = 0; i < 7; i++) {
            d.f fVar = fVarArr[i];
            int iE = fVar.e();
            if (iE > 0) {
                int i2 = 1 << i;
                for (int i3 = 0; i3 < iE; i3++) {
                    try {
                        c cVar = new c();
                        cVar.f674c = i2;
                        cVar.f672a = fVar.c(i3);
                        cVar.f673b = fVar.g(i3);
                        arrayList.add(cVar);
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        e1.s("Concurent modification for " + i, e2);
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean c(long j, int i, long j2) {
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
        if (iNumberOfTrailingZeros < 7) {
            return this.f700a[iNumberOfTrailingZeros].d(j, j2);
        }
        return false;
    }

    public void d() {
        d.f[] fVarArr = this.f700a;
        boolean z = false;
        for (int i = 0; i < 7; i++) {
            d.f fVar = fVarArr[i];
            int iE = fVar.e();
            if (iE > 0) {
                if (!z) {
                    z = true;
                }
                int i2 = (1 << i) | 16777216;
                for (int i3 = 0; i3 < iE; i3++) {
                    try {
                        c cVar = new c();
                        cVar.f674c = i2;
                        cVar.f672a = fVar.c(i3);
                        cVar.f673b = fVar.g(i3);
                        cVar.a();
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        e1.s("Concurent modification for " + i, e2);
                    }
                }
            }
        }
        if (z) {
            MainService.instance.e0();
        }
    }

    public int e() {
        d.f[] fVarArr = this.f700a;
        int iE = 0;
        for (int i = 0; i < 7; i++) {
            iE += fVarArr[i].e();
        }
        return iE;
    }

    public void f() {
        d.f[] fVarArr = this.f700a;
        for (int i = 0; i < 7; i++) {
            fVarArr[i].f();
        }
    }

    public d(int i) {
        d.f[] fVarArr = new d.f[7];
        for (int i2 = 0; i2 < 7; i2++) {
            fVarArr[i2] = new d.f(i);
        }
        this.f700a = fVarArr;
    }
}
