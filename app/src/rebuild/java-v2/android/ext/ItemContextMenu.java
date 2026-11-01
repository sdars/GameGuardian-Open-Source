package android.ext;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ItemContextMenu implements AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f196f = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f201e;

    class a extends ArrayAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, List list2) {
            super(context, list);
            this.f202b = list2;
        }

        @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            Drawable drawableO0 = Tools.o0(((Integer) this.f202b.get(i)).intValue());
            TextView textView = (TextView) view2.findViewById(R.id.text1);
            if (textView != null) {
                Tools.D1(textView, catch_.me_.if_.you_.can_.R.style.ListItemText);
                Tools.c(textView, drawableO0, Config.d());
            }
            return view2;
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f206c;

        b(List list, ArrayList arrayList, c cVar) {
            this.f204a = list;
            this.f205b = arrayList;
            this.f206c = cVar;
        }

        private Long a() {
            c cVar;
            if (ItemContextMenu.this.f197a != 3 || (cVar = this.f206c) == null) {
                return null;
            }
            return Long.valueOf(cVar.f672a);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i < 0 || i >= this.f204a.size()) {
                e1.i("Unknown index in menu: " + i + " for " + this.f204a.size());
                return;
            }
            switch (((Integer) this.f204a.get(i)).intValue()) {
                case catch_.me_.if_.you_.can_.R.drawable.ic_calculator_white_24dp /* 2130968592 */:
                    new OffsetCalculator(a()).j((String) this.f205b.get(i));
                    break;
                case catch_.me_.if_.you_.can_.R.drawable.ic_code_braces_white_24dp /* 2130968597 */:
                    h.h((String) this.f205b.get(i));
                    break;
                case catch_.me_.if_.you_.can_.R.drawable.ic_content_copy_white_24dp /* 2130968598 */:
                    Tools.z((String) this.f205b.get(i));
                    break;
                case catch_.me_.if_.you_.can_.R.drawable.ic_cursor_mover_white_24dp /* 2130968601 */:
                    android.ext.b.h((String) this.f205b.get(i));
                    break;
                case catch_.me_.if_.you_.can_.R.drawable.ic_forward_white_24dp /* 2130968618 */:
                    MainService.instance.L(a(), (String) this.f205b.get(i), Tools.N1(catch_.me_.if_.you_.can_.R.string.from_context) + ": (" + this.f206c + ')');
                    break;
                case catch_.me_.if_.you_.can_.R.drawable.ic_pointer_white_24dp /* 2130968640 */:
                    new w1().l((String) this.f205b.get(i));
                    break;
                case catch_.me_.if_.you_.can_.R.drawable.ic_search_nearby_white_24dp /* 2130968646 */:
                    MainService.instance.W.y((String) this.f205b.get(i));
                    break;
                default:
                    e1.i("Unknown icon in menu: " + Integer.toHexString(((Integer) this.f204a.get(i)).intValue()));
                    break;
            }
            if (dialogInterface != null) {
                Tools.D(dialogInterface);
            }
        }
    }

    public ItemContextMenu(int i) {
        this.f197a = i;
        int[] iArr = {0, 4, 16, 64, 2, 1, 32, 8};
        this.f198b = iArr;
        this.f199c = new String[iArr.length];
        this.f200d = new String[iArr.length];
        this.f201e = new String[iArr.length];
    }

    public static long b(long j) {
        f196f.set(Long.valueOf(j));
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x047f  */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        String str;
        long j2;
        String str2;
        String str3;
        String strO;
        String strQ;
        String string;
        String str4;
        int i3;
        String str5;
        String str6;
        int i4;
        long j3;
        int[] iArr;
        int i5;
        String str7;
        int i6;
        String str8;
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if (!(itemAtPosition instanceof c)) {
            return false;
        }
        c cVar = (c) itemAtPosition;
        h2 h2Var = new h2(cVar);
        String strF = h2Var.F();
        long j4 = h2Var.f672a;
        int i7 = h2Var.f674c;
        int i8 = i7 & 127;
        long j5 = h2Var.f673b;
        z1.d dVar = MainService.instance.v0;
        int iE = this.f197a == 3 ? 8 : c.E(i8);
        long j6 = 3 & j4;
        int i9 = (j6 != 0 || iE < 4) ? 0 : (dVar == null || !dVar.n || iE != 8 || ((-4294967296L) & j5) == 0) ? 1 : 2;
        boolean z = (i7 & 47) != 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(strF);
        arrayList2.add(b2.f(catch_.me_.if_.you_.can_.R.string.offset_calculator));
        arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_calculator_white_24dp));
        arrayList.add(strF);
        arrayList2.add(b2.f(catch_.me_.if_.you_.can_.R.string.help_pointer_search_title));
        arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_pointer_white_24dp));
        arrayList.add(strF);
        arrayList2.add(b2.f(catch_.me_.if_.you_.can_.R.string.search_nearby));
        arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_search_nearby_white_24dp));
        int i10 = 32;
        if (adapterView != MainService.instance.M) {
            arrayList.add(strF);
            arrayList2.add(b2.f(catch_.me_.if_.you_.can_.R.string.goto_address) + ' ' + strF);
            arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_forward_white_24dp));
        }
        int i11 = 0;
        while (i11 < i9) {
            int i12 = i9;
            if (i11 == 0) {
                i10 = 4;
            }
            String strM = c.M(j4, j5, i10);
            arrayList.add(strM);
            StringBuilder sb = new StringBuilder();
            boolean z2 = z;
            sb.append(b2.f(catch_.me_.if_.you_.can_.R.string.goto_pointer));
            sb.append(' ');
            sb.append(strM);
            arrayList2.add(sb.toString());
            arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_forward_white_24dp));
            int i13 = i8;
            long j7 = j5 & (-4096);
            if (j7 != 0 && RegionList.b(j7) == null) {
                String strM2 = c.M(j4, j7, i10);
                arrayList.add(strM2);
                arrayList2.add(Tools.N1(catch_.me_.if_.you_.can_.R.string.allocate_page) + ": " + strM2);
                arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_code_braces_white_24dp));
            }
            i11++;
            i8 = i13;
            i9 = i12;
            z = z2;
            i10 = 32;
        }
        boolean z3 = z;
        int i14 = i8;
        long j8 = j4 & (-4096);
        if (j8 != 0 && RegionList.b(j8) == null) {
            String strG = c.G(j8, 4);
            arrayList.add(strG);
            arrayList2.add(Tools.N1(catch_.me_.if_.you_.can_.R.string.allocate_page) + ": " + strG);
            arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_code_braces_white_24dp));
        }
        arrayList.add(strF);
        arrayList2.add(b2.f(catch_.me_.if_.you_.can_.R.string.copy_address) + ' ' + strF);
        arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_content_copy_white_24dp));
        int iH = MainService.instance.H();
        if (iH == 1) {
            i2 = AddressArrayAdapter.f23d;
        } else if (iH == 3) {
            i2 = MainService.instance.N.j;
        } else {
            i2 = iH == 2 ? SavedListAdapter.f360c : 0;
        }
        String str9 = "ARM (x64)";
        String str10 = "Thumb";
        if (i2 != 0) {
            int i15 = 0;
            strO = null;
            strQ = null;
            string = null;
            for (int i16 = 3; i15 < i16; i16 = 3) {
                if ((i15 != 0 || (j6 == 0 && (i2 & 16) != 0)) && ((i15 != 1 || ((j4 & 1) == 0 && (i2 & 32) != 0)) && (i15 != 2 || (j6 == 0 && (i2 & 64) != 0)))) {
                    ThreadLocal threadLocal = f196f;
                    i5 = i2;
                    threadLocal.set(0L);
                    if (i15 == 0) {
                        strO = n.o(null, j4, j5);
                    }
                    str7 = str9;
                    if (i15 == 1) {
                        strQ = n.q(null, j4, j5);
                    }
                    if (i15 == 2) {
                        string = m.g(m.d(), j4, (int) j5, new StringBuilder()).toString();
                    }
                    long jLongValue = ((Long) threadLocal.get()).longValue();
                    if (jLongValue != 0) {
                        if (i15 == 0) {
                            str8 = "ARM (x32)";
                            i6 = 1;
                        } else {
                            i6 = 1;
                            str8 = null;
                        }
                        if (i15 == i6) {
                            str8 = str10;
                        }
                        if (i15 == 2) {
                            str8 = str7;
                        }
                        String str11 = str8 + ": ";
                        strF = strF;
                        String strG2 = c.G(jLongValue, 4);
                        arrayList.add(strG2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str11);
                        j4 = j4;
                        sb2.append(b2.f(catch_.me_.if_.you_.can_.R.string.goto_address));
                        sb2.append(' ');
                        sb2.append(strG2);
                        arrayList2.add(sb2.toString());
                        arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_forward_white_24dp));
                        arrayList.add(strG2);
                        arrayList2.add(str11 + b2.f(catch_.me_.if_.you_.can_.R.string.copy_address) + ' ' + strG2);
                        arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_content_copy_white_24dp));
                        long j9 = jLongValue & (-4096);
                        if (j9 != 0 && RegionList.b(j9) == null) {
                            String strG3 = c.G(j9, 4);
                            arrayList.add(strG3);
                            arrayList2.add(str11 + Tools.N1(catch_.me_.if_.you_.can_.R.string.allocate_page) + ": " + strG3);
                            arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_code_braces_white_24dp));
                        }
                    }
                    i15++;
                    i2 = i5;
                    str9 = str7;
                    str10 = str10;
                    strF = strF;
                    j4 = j4;
                } else {
                    i5 = i2;
                    str7 = str9;
                    str10 = str10;
                }
                i15++;
                i2 = i5;
                str9 = str7;
                str10 = str10;
                strF = strF;
                j4 = j4;
            }
            str = strF;
            j2 = j4;
            str2 = str9;
            str3 = str10;
        } else {
            str = strF;
            j2 = j4;
            str2 = "ARM (x64)";
            str3 = "Thumb";
            strO = null;
            strQ = null;
            string = null;
        }
        int[] iArr2 = this.f198b;
        String[] strArr = this.f199c;
        String[] strArr2 = this.f200d;
        String[] strArr3 = this.f201e;
        int i17 = 0;
        int i18 = 0;
        while (i17 < iArr2.length) {
            int i19 = iArr2[i17];
            if (i19 == 0 || (i14 & i19) != 0) {
                if (i19 == 0) {
                    i19 = i14;
                    i4 = i19;
                } else {
                    i4 = i14;
                }
                int[] iArr3 = iArr2;
                j3 = j2;
                String strK = c.K(j3, j5, i19);
                iArr = iArr3;
                int i20 = 0;
                while (true) {
                    if (i20 >= i18) {
                        strArr[i18] = strK;
                        if (z3) {
                            int i21 = i19 & (-81);
                            strArr2[i18] = i21 == 0 ? null : c.M(j3, j5, i19);
                            strArr3[i18] = i21 == 0 ? null : c.P(j3, j5, i19);
                        }
                        i18++;
                        break;
                    }
                    if (strArr[i20].equals(strK)) {
                        break;
                    }
                    i20++;
                }
            } else {
                i4 = i14;
                iArr = iArr2;
                j3 = j2;
            }
            i17++;
            j2 = j3;
            i14 = i4;
            iArr2 = iArr;
        }
        if (i18 > 0) {
            for (int i22 = 0; i22 < i18; i22++) {
                arrayList.add(strArr[i22]);
                arrayList2.add(b2.f(catch_.me_.if_.you_.can_.R.string.copy_value) + ' ' + strArr[i22]);
                arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_content_copy_white_24dp));
                if (z3 && (str6 = strArr2[i22]) != null) {
                    arrayList.add(str6);
                    arrayList2.add(b2.f(catch_.me_.if_.you_.can_.R.string.copy_hex_value) + ' ' + strArr2[i22]);
                    arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_content_copy_white_24dp));
                    arrayList.add(strArr3[i22]);
                    arrayList2.add(b2.f(catch_.me_.if_.you_.can_.R.string.copy_rhex_value) + ' ' + strArr3[i22]);
                    arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_content_copy_white_24dp));
                }
            }
        }
        for (int i23 = 0; i23 < 3; i23++) {
            if (i23 == 0) {
                str4 = "ARM (x32)";
                str5 = strO;
                i3 = 1;
            } else {
                str4 = null;
                i3 = 1;
                str5 = null;
            }
            if (i23 == i3) {
                str5 = strQ;
                str4 = str3;
            }
            if (i23 == 2) {
                str5 = string;
                str4 = str2;
            }
            if (str5 != null) {
                String strTrim = str5.trim();
                int iIndexOf = strTrim.indexOf(59);
                if (iIndexOf != -1) {
                    strTrim = strTrim.substring(0, iIndexOf).trim();
                }
                if (strTrim.length() > 0) {
                    arrayList.add(strTrim);
                    arrayList2.add(Tools.L1(b2.f(catch_.me_.if_.you_.can_.R.string.copy_opcode), str4) + ' ' + strTrim);
                    arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_content_copy_white_24dp));
                }
            }
        }
        if (adapterView == MainService.instance.L) {
            arrayList.add(str);
            arrayList2.add(b2.f(catch_.me_.if_.you_.can_.R.string.change_address_type));
            arrayList3.add(Integer.valueOf(catch_.me_.if_.you_.can_.R.drawable.ic_cursor_mover_white_24dp));
        }
        f.o(ggf.c(Tools.k0()).setAdapter(new a(MainService.context, arrayList2, arrayList3), new b(arrayList3, arrayList, cVar)).setNegativeButton(b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (DialogInterface.OnClickListener) null));
        return true;
    }
}
