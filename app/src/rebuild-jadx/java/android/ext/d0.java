package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends android.ext.p1 {

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f703a;

        a(boolean[] zArr) {
            this.f703a = zArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            int i2 = 0;
            if (i == -1) {
                int i3 = 0;
                while (true) {
                    boolean[] zArr = this.f703a;
                    if (i2 >= zArr.length) {
                        break;
                    }
                    i3 = zArr[i2] ? i3 | (1 << i2) : i3 & (~(1 << i2));
                    i2++;
                }
                i2 = i3;
            }
            android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_copy_params).f42d = i2;
            android.ext.Config.k();
            android.ext.d0.this.i(i2);
        }
    }

    class b implements android.content.DialogInterface.OnMultiChoiceClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f705a;

        b(boolean[] zArr) {
            this.f705a = zArr;
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i, boolean z) {
            this.f705a[i] = z;
            if (!z) {
                return;
            }
            if (i < 4) {
                i = 0;
            }
            android.widget.ListView listView = ((android.app.AlertDialog) dialogInterface).getListView();
            if (listView == null) {
                return;
            }
            int i2 = 0;
            while (true) {
                boolean[] zArr = this.f705a;
                if (i2 >= zArr.length) {
                    return;
                }
                if (i != (i2 >= 4 ? i2 : 0)) {
                    zArr[i2] = false;
                    listView.setItemChecked(i2, false);
                }
                i2++;
            }
        }
    }

    class c implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f707a;

        c(java.lang.String str) {
            this.f707a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            if (i == -1) {
                android.ext.Tools.A(this.f707a, true);
            } else {
                android.ext.MainService.instance.m.setCurrentTab(1);
                android.ext.MainService.instance.W.u(this.f707a);
            }
        }
    }

    class d implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.DialogInterface.OnClickListener f710b;

        d(java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener) {
            this.f709a = str;
            this.f710b = onClickListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.d0.this.j(this.f709a, this.f710b);
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte[] f712a = new byte[800];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f713b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f714c = 0;

        e() {
        }
    }

    public d0() {
        super(catch_.me_.if_.you_.can_.R.string.copy_as_search, catch_.me_.if_.you_.can_.R.drawable.ic_content_copy_white_24dp);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    private void h(android.ext.d0.e eVar, java.lang.StringBuilder sb, android.ext.c cVar, int i) {
        char c2;
        if (eVar != null) {
            if (eVar.f714c == 0) {
                eVar.f714c = cVar.f672a;
            }
            int iD = cVar.D();
            long j = cVar.f673b;
            for (int i2 = 0; i2 < iD; i2++) {
                long j2 = cVar.f672a + ((long) i2);
                if (eVar.f714c <= j2) {
                    byte[] bArr = eVar.f712a;
                    int i3 = eVar.f713b;
                    eVar.f713b = i3 + 1;
                    bArr[i3] = (byte) (255 & j);
                    eVar.f714c = j2;
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
        java.lang.Object objZ = android.ext.MainService.instance.z();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i & 1008);
        android.ext.d0.e eVar = iNumberOfTrailingZeros != 32 ? new android.ext.d0.e() : null;
        long j3 = 0;
        if (objZ instanceof ggd.a) {
            ggd.a aVar = (ggd.a) objZ;
            android.ext.c cVar = new android.ext.c();
            int i4 = aVar.i();
            j2 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                if (aVar.c(i7)) {
                    if (i5 < 100) {
                        aVar.f(i7, cVar);
                        h(eVar, sb, cVar, i);
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
            if (objZ instanceof ggd.e) {
                ggd.e eVar2 = (ggd.e) objZ;
                int iL = eVar2.l();
                long j4 = 0;
                i2 = 0;
                i3 = 0;
                for (int i9 = 0; i9 < iL; i9++) {
                    if (eVar2.a(i9)) {
                        android.ext.h2 h2Var = (android.ext.h2) eVar2.n(i9);
                        if (h2Var instanceof android.ext.h2) {
                            if (i2 < 100) {
                                h(eVar, sb, h2Var, i);
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
                android.ext.n1 n1Var = android.ext.MainService.instance.N;
                boolean[] zArr = (boolean[]) objZ;
                int length = zArr.length - 1;
                long j5 = 0;
                i2 = 0;
                i3 = 0;
                for (int i10 = 1; i10 < length; i10++) {
                    if (zArr[i10]) {
                        if (i2 < 100) {
                            android.ext.c cVar2 = (android.ext.c) n1Var.getItem(i10);
                            h(eVar, sb, cVar2, i);
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
        int i11 = eVar == null ? 2 : 1;
        if (i2 < i11) {
            android.ext.Tools.J1(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.need_select_more), java.lang.Integer.valueOf(i11)));
            return;
        }
        if (i3 > i2) {
            android.ext.Tools.J1(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.used_only_first), java.lang.Integer.valueOf(i2)));
        }
        if (eVar != null) {
            if (iNumberOfTrailingZeros == 4 || iNumberOfTrailingZeros == 5) {
                boolean z = iNumberOfTrailingZeros == 5;
                sb.append(z ? ';' : ':');
                sb.append(new java.lang.String(eVar.f712a, 0, eVar.f713b, android.ext.t1.i(z)));
            } else if (iNumberOfTrailingZeros == 6) {
                sb.append('h');
                char[] cArr = android.ext.x0.f1306a;
                byte[] bArr = eVar.f712a;
                int i12 = eVar.f713b;
                for (int i13 = 0; i13 < i12; i13++) {
                    sb.append(' ');
                    byte b2 = bArr[i13];
                    sb.append(cArr[(b2 & 240) >> 4]);
                    sb.append(cArr[b2 & 15]);
                }
            } else {
                sb.append('Q');
                sb.append(' ');
                android.ext.x0.b(sb, 0, eVar.f712a, eVar.f713b, iNumberOfTrailingZeros == 7 || iNumberOfTrailingZeros == 9, iNumberOfTrailingZeros == 8 || iNumberOfTrailingZeros == 9, null);
            }
        } else if ((i & 8) != 0) {
            sb.append(':');
            sb.append((j + 1) - j2);
        }
        java.lang.String string = sb.toString();
        android.ext.d0.c cVar3 = new android.ext.d0.c(string);
        if (eVar != null || j - j2 < 65535) {
            j(string, cVar3);
        } else {
            android.ext.f.o(android.ext.f.b().setMessage(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.too_far), java.lang.Long.valueOf((j + 1) - j2), 65535)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), new android.ext.d0.d(string, cVar3)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null));
        }
    }

    void j(java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener) {
        android.ext.f.o(android.ext.f.b().setMessage(str).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.copy), onClickListener).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.search), onClickListener).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null));
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.CharSequence[] charSequenceArr = {android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.format_hex), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.format_rhex), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.add_types), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.add_size), "UTF-8", "UTF-16LE", "HEX", "HEX + UTF-8", "HEX + UTF-16LE", "HEX + UTF-8 + UTF-16LE"};
        int i = android.ext.Config.y;
        boolean[] zArr = new boolean[10];
        for (int i2 = 0; i2 < 10; i2++) {
            zArr[i2] = ((1 << i2) & i) != 0;
        }
        android.ext.f.o(android.ext.f.c(android.ext.Tools.k0()).setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.copy_as_search)).setMultiChoiceItems(charSequenceArr, zArr, new android.ext.d0.b(zArr)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes), new android.ext.d0.a(zArr)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no), (android.content.DialogInterface.OnClickListener) null));
    }
}
