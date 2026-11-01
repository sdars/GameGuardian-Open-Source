package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.fix.ImageButtonView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.ListView;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$string;
import catch_.me_.if_.you_.can_.R$style;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RegionList extends ImageButtonView implements View$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile List f342a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile RegionList$b f343b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile SparseIntArray f344c = new SparseIntArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static CharSequence[] f346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static int[] f347f;

    public RegionList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public static CharSequence a(long j) {
        RegionList$b regionList$bB = b(j);
        return regionList$bB == null ? "?" : regionList$bB.e();
    }

    public static RegionList$b b(long j) {
        long jA = e.a(j, e0.m());
        RegionList$b regionList$b = f343b;
        if (regionList$b != null && Tools.T1(regionList$b.f356b, jA) && Tools.S1(jA, regionList$b.f357c)) {
            return regionList$b;
        }
        List list = f342a;
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            RegionList$b regionList$b2 = (RegionList$b) list.get(i2);
            if (Tools.T1(regionList$b2.f357c, jA)) {
                i = i2 + 1;
            } else {
                if (!Tools.S1(jA, regionList$b2.f356b)) {
                    f343b = regionList$b2;
                    return regionList$b2;
                }
                size = i2 - 1;
            }
        }
        return null;
    }

    public static RegionList$b c(String str, String str2, long j) {
        int i;
        String strTrim = str.trim();
        String strTrim2 = str2.trim();
        if (strTrim2.length() > 0 && j >= 0) {
            List list = f342a;
            RegionList$b[] regionList$bArr = new RegionList$b[6];
            int[] iArr = new int[6];
            File file = new File(strTrim2);
            String str3 = '/' + file.getName();
            String str4 = file.getParentFile() != null ? '/' + file.getParentFile().getName() + str3 : null;
            int iF = f(strTrim);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RegionList$b regionList$b = (RegionList$b) it.next();
                if (regionList$b != null) {
                    String strA = regionList$b.a();
                    if (strA.length() != 0 && regionList$b.f357c - regionList$b.f356b > j) {
                        int iBitCount = (regionList$b.f355a ^ iF) & 3840;
                        if (iBitCount != 0) {
                            iBitCount = Integer.bitCount(iBitCount);
                        }
                        if (strA.equals(strTrim2)) {
                            if (iBitCount == 0) {
                                regionList$bArr[0] = regionList$b;
                                break;
                            }
                            if (regionList$bArr[1] == null || iArr[1] > iBitCount) {
                                regionList$bArr[1] = regionList$b;
                                iArr[1] = iBitCount;
                            }
                        }
                        if (str4 != null && strA.endsWith(str4)) {
                            if (iBitCount == 0) {
                                regionList$bArr[2] = regionList$b;
                            } else if (regionList$bArr[3] == null || iArr[3] > iBitCount) {
                                regionList$bArr[3] = regionList$b;
                                iArr[3] = iBitCount;
                            }
                        }
                        if (strA.endsWith(str3)) {
                            if (iBitCount == 0) {
                                regionList$bArr[4] = regionList$b;
                            } else if (regionList$bArr[5] == null || iArr[5] > iBitCount) {
                                regionList$bArr[5] = regionList$b;
                                iArr[5] = iBitCount;
                            }
                        }
                    }
                }
            }
            for (i = 0; i < 6; i++) {
                RegionList$b regionList$b2 = regionList$bArr[i];
                if (regionList$b2 != null) {
                    return regionList$b2;
                }
            }
        }
        return null;
    }

    public static long d(int i) {
        return ((long) f344c.get(i)) * 4096;
    }

    private static int e(int i) {
        int length = f345d.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if ((f345d[i3] & i) == i) {
                i2 = i3;
            }
        }
        return i2;
    }

    public static int f(String str) {
        if (str.length() != 4) {
            return 0;
        }
        int i = str.charAt(0) == 'r' ? 256 : 0;
        if (str.charAt(1) == 'w') {
            i |= 512;
        }
        if (str.charAt(2) == 'x') {
            i |= 1024;
        }
        return str.charAt(3) == 's' ? i | 2048 : i;
    }

    private void g() {
        setOnClickListener(this);
        if (isInEditMode()) {
            return;
        }
        setImageResource(R$drawable.ic_arrow_down_drop_circle_white_24dp);
        Config.m(this);
    }

    public static List<RegionList$b> getList() {
        return f342a;
    }

    public static void h(w wVar) {
        wVar.j();
        ArrayList arrayList = new ArrayList();
        SparseIntArray sparseIntArray = new SparseIntArray();
        List list = f342a;
        if (list != null) {
            arrayList.ensureCapacity(list.size());
        }
        i();
        String str = "";
        while (true) {
            try {
                int iF = wVar.f();
                if (iF != 0) {
                    int iE = e(iF);
                    long jH = wVar.h();
                    long jH2 = wVar.h();
                    int iF2 = iE | (wVar.f() << 8);
                    if ((iF & 2064) == 0) {
                        str = null;
                    }
                    int iF3 = wVar.f();
                    if (iF3 >= 0 && iF3 <= 1024) {
                        RegionList$b regionList$bB = b(jH);
                        String strIntern = wVar.i(iF3, regionList$bB == null ? null : regionList$bB.f358d).trim().intern();
                        if (regionList$bB == null || regionList$bB.f355a != iF2 || regionList$bB.f356b != jH || regionList$bB.f357c != jH2) {
                            regionList$bB = new RegionList$b(iF2, jH, jH2);
                        }
                        regionList$bB.f358d = strIntern;
                        regionList$bB.f359e = str;
                        arrayList.add(regionList$bB);
                        long j = (regionList$bB.f357c - regionList$bB.f356b) / 4096;
                        if (j < 0) {
                            j = 0;
                        }
                        sparseIntArray.put(iE, sparseIntArray.get(iE) + ((int) j));
                        str = strIntern;
                    }
                    e1.l("Bad name length: " + iF3, new RuntimeException());
                    break;
                }
                break;
            } catch (IOException e2) {
                e1.l("???", e2);
            }
        }
        f342a = arrayList;
        f344c = sparseIntArray;
        f343b = null;
        MainService.instance.N.d();
    }

    private static void i() {
        Config.b(R$id.config_ranges).a();
    }

    public static void k(int[] iArr, CharSequence[] charSequenceArr, int[] iArr2) {
        f345d = iArr;
        f346e = charSequenceArr;
        f347f = iArr2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b A[SYNTHETIC] */
    public void j(View view, int i) {
        long jR;
        Object tag = getTag();
        if (tag instanceof EditText) {
            EditText editText = (EditText) tag;
            editText.requestFocus();
            boolean z = (view == null ? this : view).getId() == 2131034378;
            String strTrim = editText.getText().toString().trim();
            if (strTrim.length() > 0) {
                try {
                    jR = t1.r(strTrim, 16);
                } catch (NumberFormatException e2) {
                    e1.s("RegionList failed parse: " + strTrim, e2);
                    jR = 0;
                }
            } else {
                jR = 0;
            }
            List list = f342a;
            ArrayList arrayList = new ArrayList(list.size());
            SparseIntArray sparseIntArray = new SparseIntArray();
            int i2 = -1;
            for (int i3 = 0; i3 < list.size(); i3++) {
                RegionList$b regionList$b = (RegionList$b) list.get(i3);
                if (i != 0) {
                    int i4 = regionList$b.f355a & 255;
                    int[] iArr = f345d;
                    if (i4 >= iArr.length || (iArr[i4] & i) != 0) {
                        sparseIntArray.append(arrayList.size(), i3);
                        arrayList.add(regionList$b.g());
                        if (Tools.T1(regionList$b.f356b, jR)) {
                            i2 = i3;
                        }
                    }
                } else {
                    sparseIntArray.append(arrayList.size(), i3);
                    arrayList.add(regionList$b.g());
                    if (Tools.T1(regionList$b.f356b, jR)) {
                        i2 = i3;
                    }
                }
            }
            if (arrayList.size() != 0) {
                AlertDialog alertDialogCreate = f.b().setSingleChoiceItems((CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]), i2, new RegionList$a(this, editText, z, list, sparseIntArray)).create();
                ListView listView = alertDialogCreate.getListView();
                if (listView != null) {
                    Tools.C1(listView, R$style.SmallText);
                    FastScrollerFix.a(listView, true);
                }
                f.m(alertDialogCreate);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b2.f(R$string.no_regions));
            if (i != 0) {
                int[] iArr2 = f345d;
                CharSequence[] charSequenceArr = f346e;
                int length = iArr2.length;
                boolean z2 = false;
                for (int i5 = 0; i5 < length; i5++) {
                    if ((i & iArr2[i5]) != 0) {
                        sb.append(z2 ? ", " : "\n[");
                        sb.append(charSequenceArr[i5]);
                        z2 = true;
                    }
                }
                if (z2) {
                    sb.append(']');
                }
            }
            Tools.J1(sb.toString());
        }
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        j(view, this instanceof RegionListFiltered ? Config.i : 0);
    }
}
