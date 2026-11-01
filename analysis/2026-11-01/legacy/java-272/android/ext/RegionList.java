package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.fix.ImageButtonView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ListView;
import catch_.me_.if_.you_.can_.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RegionList extends ImageButtonView implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile List f342a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f343b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile SparseIntArray f344c = new SparseIntArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static CharSequence[] f346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static int[] f347f;

    class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EditText f348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f351d;

        a(EditText editText, boolean z, List list, SparseIntArray sparseIntArray) {
            this.f348a = editText;
            this.f349b = z;
            this.f350c = list;
            this.f351d = sparseIntArray;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                this.f348a.setText(c.G(this.f349b ? ((b) this.f350c.get(this.f351d.get(i))).f357c - 1 : ((b) this.f350c.get(this.f351d.get(i))).f356b, 4));
                this.f348a.requestFocus();
            } catch (Throwable th) {
                e1.g("RegionList failed with " + i, th);
            }
            Tools.D(dialogInterface);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static SparseIntArray f353f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f354g = 16777215;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f359e;

        public b(int i, long j, long j2) {
            this.f355a = i;
            this.f356b = j;
            this.f357c = j2;
        }

        public static int c(b bVar) {
            try {
                SparseIntArray sparseIntArray = f353f;
                if (sparseIntArray == null) {
                    sparseIntArray = new SparseIntArray(8);
                    sparseIntArray.append(4, Tools.d0(R.color.pointer_unknown));
                    sparseIntArray.append(1, Tools.d0(R.color.pointer_executable_writable));
                    sparseIntArray.append(2, Tools.d0(R.color.pointer_executable));
                    sparseIntArray.append(16, Tools.d0(R.color.pointer_writable));
                    sparseIntArray.append(8, Tools.d0(R.color.pointer_readable));
                    f353f = sparseIntArray;
                    f354g = Tools.d0(R.color.pointer_unknown);
                }
                int i = bVar != null ? sparseIntArray.get(bVar.d()) : 4;
                return i == 4 ? f354g : i;
            } catch (Throwable th) {
                e1.l("Failed getPointerColor for: " + bVar, th);
                return f354g;
            }
        }

        private int d() {
            int i = this.f355a;
            if ((i & 1536) == 1536) {
                return 1;
            }
            if ((i & 1024) == 1024) {
                return 2;
            }
            if ((i & 512) == 512) {
                return 16;
            }
            return (i & 256) == 256 ? 8 : 4;
        }

        public String a() {
            if (this.f359e == null) {
                return this.f358d;
            }
            return this.f359e + ":bss";
        }

        public String b() {
            return this.f358d;
        }

        public CharSequence e() {
            return RegionList.f346e[this.f355a & 255];
        }

        public String f() {
            int i = this.f355a;
            StringBuilder sb = new StringBuilder();
            sb.append((i & 256) == 256 ? "r" : "-");
            sb.append((i & 512) == 512 ? "w" : "-");
            sb.append((i & 1024) == 1024 ? "x" : "-");
            sb.append((i & 2048) == 2048 ? "s" : "p");
            return sb.toString();
        }

        public CharSequence g() {
            return Tools.t(toString(), RegionList.f347f[this.f355a & 255]);
        }

        public String toString() {
            return ((Object) RegionList.f346e[this.f355a & 255]) + ": " + c.G(this.f356b, 4) + '-' + c.G(this.f357c, 4) + ' ' + f() + " '" + this.f358d + '\'';
        }
    }

    public RegionList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public static CharSequence a(long j) {
        b bVarB = b(j);
        return bVarB == null ? "?" : bVarB.e();
    }

    public static b b(long j) {
        long jA = e.a(j, e0.m());
        b bVar = f343b;
        if (bVar != null && Tools.T1(bVar.f356b, jA) && Tools.S1(jA, bVar.f357c)) {
            return bVar;
        }
        List list = f342a;
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            b bVar2 = (b) list.get(i2);
            if (Tools.T1(bVar2.f357c, jA)) {
                i = i2 + 1;
            } else {
                if (!Tools.S1(jA, bVar2.f356b)) {
                    f343b = bVar2;
                    return bVar2;
                }
                size = i2 - 1;
            }
        }
        return null;
    }

    public static b c(String str, String str2, long j) {
        int i;
        String strTrim = str.trim();
        String strTrim2 = str2.trim();
        if (strTrim2.length() > 0 && j >= 0) {
            List list = f342a;
            b[] bVarArr = new b[6];
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
                b bVar = (b) it.next();
                if (bVar != null) {
                    String strA = bVar.a();
                    if (strA.length() != 0 && bVar.f357c - bVar.f356b > j) {
                        int iBitCount = (bVar.f355a ^ iF) & 3840;
                        if (iBitCount != 0) {
                            iBitCount = Integer.bitCount(iBitCount);
                        }
                        if (strA.equals(strTrim2)) {
                            if (iBitCount == 0) {
                                bVarArr[0] = bVar;
                                break;
                            }
                            if (bVarArr[1] == null || iArr[1] > iBitCount) {
                                bVarArr[1] = bVar;
                                iArr[1] = iBitCount;
                            }
                        }
                        if (str4 != null && strA.endsWith(str4)) {
                            if (iBitCount == 0) {
                                bVarArr[2] = bVar;
                            } else if (bVarArr[3] == null || iArr[3] > iBitCount) {
                                bVarArr[3] = bVar;
                                iArr[3] = iBitCount;
                            }
                        }
                        if (strA.endsWith(str3)) {
                            if (iBitCount == 0) {
                                bVarArr[4] = bVar;
                            } else if (bVarArr[5] == null || iArr[5] > iBitCount) {
                                bVarArr[5] = bVar;
                                iArr[5] = iBitCount;
                            }
                        }
                    }
                }
            }
            for (i = 0; i < 6; i++) {
                b bVar2 = bVarArr[i];
                if (bVar2 != null) {
                    return bVar2;
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
        setImageResource(R.drawable.ic_arrow_down_drop_circle_white_24dp);
        Config.m(this);
    }

    public static List<b> getList() {
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
                        b bVarB = b(jH);
                        String strIntern = wVar.i(iF3, bVarB == null ? null : bVarB.f358d).trim().intern();
                        if (bVarB == null || bVarB.f355a != iF2 || bVarB.f356b != jH || bVarB.f357c != jH2) {
                            bVarB = new b(iF2, jH, jH2);
                        }
                        bVarB.f358d = strIntern;
                        bVarB.f359e = str;
                        arrayList.add(bVarB);
                        long j = (bVarB.f357c - bVarB.f356b) / 4096;
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
        Config.b(R.id.config_ranges).a();
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
            boolean z = (view == null ? this : view).getId() == R.id.region_to;
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
                b bVar = (b) list.get(i3);
                if (i != 0) {
                    int i4 = bVar.f355a & 255;
                    int[] iArr = f345d;
                    if (i4 >= iArr.length || (iArr[i4] & i) != 0) {
                        sparseIntArray.append(arrayList.size(), i3);
                        arrayList.add(bVar.g());
                        if (Tools.T1(bVar.f356b, jR)) {
                            i2 = i3;
                        }
                    }
                } else {
                    sparseIntArray.append(arrayList.size(), i3);
                    arrayList.add(bVar.g());
                    if (Tools.T1(bVar.f356b, jR)) {
                        i2 = i3;
                    }
                }
            }
            if (arrayList.size() != 0) {
                AlertDialog alertDialogCreate = f.b().setSingleChoiceItems((CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]), i2, new a(editText, z, list, sparseIntArray)).create();
                ListView listView = alertDialogCreate.getListView();
                if (listView != null) {
                    Tools.C1(listView, R.style.SmallText);
                    FastScrollerFix.a(listView, true);
                }
                f.m(alertDialogCreate);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b2.f(R.string.no_regions));
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        j(view, this instanceof RegionListFiltered ? Config.i : 0);
    }
}
