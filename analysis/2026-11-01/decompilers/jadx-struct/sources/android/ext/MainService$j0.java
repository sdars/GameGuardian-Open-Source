package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class MainService$j0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ MainService f251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainService$j0(MainService mainService) {
        super(R$string.calculate_offset_xor, R$drawable.ic_vector_difference_white_24dp);
        this.f251f = mainService;
    }

    private void h() {
        int i;
        int i2;
        Object objZ = this.f251f.z();
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        if (objZ instanceof d.a) {
            d.a aVar = (d.a) objZ;
            c cVar = new c();
            int i3 = aVar.i();
            i = 0;
            i2 = 0;
            for (int i4 = 0; i4 < i3; i4++) {
                if (aVar.c(i4)) {
                    if (i < 10) {
                        aVar.f(i4, cVar);
                        jArr[i] = cVar.f672a;
                        jArr2[i] = cVar.f673b & c.f668d[cVar.D()];
                        i++;
                    }
                    i2++;
                    if (i2 > 10) {
                        break;
                    }
                }
            }
        } else if (objZ instanceof d.e) {
            d.e eVar = (d.e) objZ;
            int iL = eVar.l();
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < iL; i7++) {
                if (eVar.a(i7)) {
                    h2 h2Var = (h2) eVar.n(i7);
                    if (h2Var instanceof h2) {
                        if (i5 < 10) {
                            jArr[i5] = h2Var.f672a;
                            jArr2[i5] = h2Var.f673b & c.f668d[h2Var.D()];
                            i5++;
                        }
                        i6++;
                        if (i6 > 10) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            i2 = i6;
            i = i5;
        } else if (objZ instanceof boolean[]) {
            n1 n1Var = this.f251f.N;
            boolean[] zArr = (boolean[]) objZ;
            int length = zArr.length - 1;
            i = 0;
            i2 = 0;
            for (int i8 = 1; i8 < length; i8++) {
                if (zArr[i8]) {
                    if (i < 10) {
                        jArr[i] = n1Var.e(i8);
                        c cVar2 = (c) n1Var.getItem(i8);
                        jArr2[i] = cVar2.f673b & c.f668d[cVar2.D()];
                        i++;
                    }
                    i2++;
                    if (i2 > 10) {
                        break;
                    }
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        if (i < 2) {
            Tools.J1(Tools.L1(b2.f(R$string.need_select_more), 2));
            return;
        }
        if (i2 > i) {
            Tools.J1(Tools.L1(b2.f(R$string.used_only_first), Integer.valueOf(i)));
        }
        f.o(f.b().setAdapter(new ArrayAdapter(MainService.context, new String[]{Tools.N1(R$string.offset), "XOR"}), new MainService$j0$a(this, jArr, jArr2, i)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null));
    }

    void i(long[] jArr, long[] jArr2, int i, int i2) {
        int i3 = i - 1;
        int i4 = (i * i3) / 2;
        String[] strArr = new String[i4];
        String[] strArr2 = new String[i4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            int i7 = i5 + 1;
            for (int i8 = i7; i8 < i; i8++) {
                long j = jArr[i5];
                long j2 = jArr[i8];
                String upperCase = i2 == 0 ? Long.toHexString(j2 - j).toUpperCase(Locale.US) : Tools.L1("%,d", Long.valueOf(jArr2[i5] ^ jArr2[i8]));
                strArr2[i6] = upperCase;
                strArr[i6] = t2.e(8, j) + " - " + t2.e(8, j2) + ": " + upperCase;
                i6++;
            }
            i5 = i7;
        }
        f.o(f.b().setCustomTitle(Tools.g0(R$string.select_copy_item)).setAdapter(new ArrayAdapter(MainService.context, strArr), new MainService$j0$b(this, strArr2)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null));
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        h();
    }
}
