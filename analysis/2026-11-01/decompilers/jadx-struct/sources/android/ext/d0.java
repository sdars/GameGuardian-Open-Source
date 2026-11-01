package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends p1 {
    public d0() {
        super(R$string.copy_as_search, R$drawable.ic_content_copy_white_24dp);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    private void h(d0$e d0_e, StringBuilder sb, c cVar, int i) {
        char c2;
        if (d0_e != null) {
            if (d0_e.f714c == 0) {
                d0_e.f714c = cVar.f672a;
            }
            int iD = cVar.D();
            long j = cVar.f673b;
            for (int i2 = 0; i2 < iD; i2++) {
                long j2 = cVar.f672a + ((long) i2);
                if (d0_e.f714c <= j2) {
                    byte[] bArr = d0_e.f712a;
                    int i3 = d0_e.f713b;
                    d0_e.f713b = i3 + 1;
                    bArr[i3] = (byte) (255 & j);
                    d0_e.f714c = j2;
                }
                j >>= 8;
            }
            return;
        }
        if (sb.length() != 0) {
            sb.append(';');
        }
        if ((i & 2) == 0) {
            if ((i & 1) != 0) {
                sb.append(cVar.L());
                c2 = 'h';
            } else {
                sb.append(cVar.J());
            }
            if ((i & 4) != 0) {
                sb.append(cVar.z());
            }
        }
        sb.append(cVar.O());
        c2 = 'r';
        sb.append(c2);
        if ((i & 4) != 0) {
            sb.append(cVar.z());
        }
    }

    void i(int i) {
        long j;
        long j2;
        int i2;
        int i3;
        Object objZ = MainService.instance.z();
        StringBuilder sb = new StringBuilder();
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i & 1008);
        d0$e d0_e = iNumberOfTrailingZeros != 32 ? new d0$e() : null;
        long j3 = 0;
        if (objZ instanceof d.a) {
            d.a aVar = (d.a) objZ;
            c cVar = new c();
            int i4 = aVar.i();
            j2 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                if (aVar.c(i7)) {
                    if (i5 < 100) {
                        aVar.f(i7, cVar);
                        h(d0_e, sb, cVar, i);
                        j3 = cVar.f672a;
                        if (i5 == 0) {
                            j2 = j3;
                        }
                        i5++;
                    }
                    int i8 = i6 + 1;
                    i6 = i8;
                    if (i8 > 100) {
                        break;
                    }
                }
            }
            i2 = i5;
            j = j3;
            i3 = i6;
        } else {
            if (objZ instanceof d.e) {
                d.e eVar = (d.e) objZ;
                int iL = eVar.l();
                long j4 = 0;
                i2 = 0;
                i3 = 0;
                for (int i9 = 0; i9 < iL; i9++) {
                    if (eVar.a(i9)) {
                        h2 h2Var = (h2) eVar.n(i9);
                        if (h2Var instanceof h2) {
                            if (i2 < 100) {
                                h(d0_e, sb, h2Var, i);
                                j3 = h2Var.f672a;
                                if (i2 == 0) {
                                    j4 = j3;
                                }
                                i2++;
                            }
                            i3++;
                            if (i3 > 100) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                j2 = j4;
            } else if (objZ instanceof boolean[]) {
                n1 n1Var = MainService.instance.N;
                boolean[] zArr = (boolean[]) objZ;
                int length = zArr.length - 1;
                long j5 = 0;
                i2 = 0;
                i3 = 0;
                for (int i10 = 1; i10 < length; i10++) {
                    if (zArr[i10]) {
                        if (i2 < 100) {
                            c cVar2 = (c) n1Var.getItem(i10);
                            h(d0_e, sb, cVar2, i);
                            j3 = cVar2.f672a;
                            if (i2 == 0) {
                                j5 = j3;
                            }
                            i2++;
                        }
                        i3++;
                        if (i3 > 100) {
                            break;
                        }
                    }
                }
                j2 = j5;
            } else {
                j = 0;
                j2 = 0;
                i2 = 0;
                i3 = 0;
            }
            j = j3;
        }
        int i11 = d0_e == null ? 2 : 1;
        if (i2 < i11) {
            Tools.J1(Tools.L1(b2.f(R$string.need_select_more), Integer.valueOf(i11)));
            return;
        }
        if (i3 > i2) {
            Tools.J1(Tools.L1(b2.f(R$string.used_only_first), Integer.valueOf(i2)));
        }
        if (d0_e != null) {
            if (iNumberOfTrailingZeros == 4 || iNumberOfTrailingZeros == 5) {
                boolean z = iNumberOfTrailingZeros == 5;
                sb.append(z ? ';' : ':');
                sb.append(new String(d0_e.f712a, 0, d0_e.f713b, t1.i(z)));
            } else if (iNumberOfTrailingZeros == 6) {
                sb.append('h');
                char[] cArr = x0.f1306a;
                byte[] bArr = d0_e.f712a;
                int i12 = d0_e.f713b;
                for (int i13 = 0; i13 < i12; i13++) {
                    sb.append(' ');
                    byte b2 = bArr[i13];
                    sb.append(cArr[(b2 & 240) >> 4]);
                    sb.append(cArr[b2 & 15]);
                }
            } else {
                sb.append('Q');
                sb.append(' ');
                x0.b(sb, 0, d0_e.f712a, d0_e.f713b, iNumberOfTrailingZeros == 7 || iNumberOfTrailingZeros == 9, iNumberOfTrailingZeros == 8 || iNumberOfTrailingZeros == 9, null);
            }
        } else if ((i & 8) != 0) {
            sb.append(':');
            sb.append((j + 1) - j2);
        }
        String string = sb.toString();
        d0$c d0_c = new d0$c(this, string);
        if (d0_e != null || j - j2 < 65535) {
            j(string, d0_c);
        } else {
            f.o(f.b().setMessage(Tools.L1(b2.f(R$string.too_far), Long.valueOf((j + 1) - j2), 65535)).setPositiveButton(b2.f(R$string.ok), new d0$d(this, string, d0_c)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null));
        }
    }

    void j(String str, DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        f.o(f.b().setMessage(str).setPositiveButton(b2.f(R$string.copy), dialogInterface$OnClickListener).setNeutralButton(b2.f(R$string.search), dialogInterface$OnClickListener).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null));
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        CharSequence[] charSequenceArr = {b2.f(R$string.format_hex), b2.f(R$string.format_rhex), b2.f(R$string.add_types), b2.f(R$string.add_size), "UTF-8", "UTF-16LE", "HEX", "HEX + UTF-8", "HEX + UTF-16LE", "HEX + UTF-8 + UTF-16LE"};
        int i = Config.y;
        boolean[] zArr = new boolean[10];
        for (int i2 = 0; i2 < 10; i2++) {
            zArr[i2] = ((1 << i2) & i) != 0;
        }
        f.o(f.c(Tools.k0()).setCustomTitle(Tools.g0(R$string.copy_as_search)).setMultiChoiceItems(charSequenceArr, zArr, new d0$b(this, zArr)).setPositiveButton(b2.f(R$string.yes), new d0$a(this, zArr)).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null));
    }
}
