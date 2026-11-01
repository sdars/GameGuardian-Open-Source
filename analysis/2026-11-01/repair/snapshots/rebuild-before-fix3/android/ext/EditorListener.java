package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AdapterView;
import catch_.me_.if_.you_.can_.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EditorListener extends p1 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f123f;

    private class b implements View.OnClickListener, AdapterView.OnItemClickListener, DialogInterface.OnClickListener, DialogInterface.OnShowListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AlertDialog f124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f130g;
        private l0 h;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                b bVar = ggb.this;
                bVar.f129f = i;
                bVar.b(null);
            }
        }

        /* JADX INFO: renamed from: android.ext.EditorListener$b$b, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0005b implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0005b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                b bVar = ggb.this;
                bVar.f130g = i;
                bVar.b(null);
            }
        }

        class c implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.c f133a;

            c(android.ext.c cVar) {
                this.f133a = cVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                android.ext.c cVar = this.f133a;
                cVar.f674c = i;
                ggb.this.d(cVar);
            }
        }

        private b() {
            this.f126c = false;
            this.f127d = 0;
            this.f128e = null;
            this.f129f = 0;
            this.f130g = 0;
        }

        private boolean a(View view) {
            StringBuilder sb;
            int i;
            String str;
            long j = 1;
            switch (view.getId()) {
                case R.id.fill_hex /* 2131034255 */:
                    sb = new StringBuilder();
                    sb.append('h');
                    int size = this.f128e.size();
                    char[] cArr = x0.f1306a;
                    long j2 = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        android.ext.c cVar = (android.ext.c) this.f128e.get(i2);
                        if (j2 != 0 && j2 + 1 != cVar.f672a) {
                        }
                        j2 = cVar.f672a;
                        sb.append(' ');
                        int i3 = (int) cVar.f673b;
                        sb.append(cArr[(i3 & 240) >> 4]);
                        sb.append(cArr[i3 & 15]);
                        break;
                    }
                    break;
                case R.id.fill_hex_utf16le /* 2131034256 */:
                case R.id.fill_hex_utf8 /* 2131034257 */:
                case R.id.fill_hex_utf8_utf16le /* 2131034258 */:
                    sb = new StringBuilder();
                    sb.append('Q');
                    sb.append(' ');
                    int id = view.getId();
                    int size2 = this.f128e.size();
                    byte[] bArr = new byte[size2];
                    long j3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            android.ext.c cVar2 = (android.ext.c) this.f128e.get(i4);
                            if (j3 == 0 || j3 + 1 == cVar2.f672a) {
                                j3 = cVar2.f672a;
                                bArr[i4] = (byte) cVar2.f673b;
                                i4++;
                            } else {
                                i = i4;
                            }
                        } else {
                            i = size2;
                        }
                    }
                    x0.b(sb, 0, bArr, i, id == R.id.fill_hex_utf8 || id == R.id.fill_hex_utf8_utf16le, id == R.id.fill_hex_utf16le || id == R.id.fill_hex_utf8_utf16le, null);
                    break;
                case R.id.fill_utf16le /* 2131034259 */:
                case R.id.fill_utf8 /* 2131034260 */:
                    sb = new StringBuilder();
                    boolean z = view.getId() == R.id.fill_utf8;
                    sb.append(z ? ':' : ';');
                    if (z || this.h.c().f674c == 1) {
                        int size3 = this.f128e.size();
                        byte[] bArr2 = new byte[size3];
                        long j4 = 0;
                        int i5 = 0;
                        while (i5 < size3) {
                            android.ext.c cVar3 = (android.ext.c) this.f128e.get(i5);
                            if (j4 == 0 || j4 + j == cVar3.f672a) {
                                j4 = cVar3.f672a;
                                bArr2[i5] = (byte) cVar3.f673b;
                                i5++;
                                j = 1;
                            } else {
                                size3 = i5;
                                str = new String(bArr2, 0, size3, t1.i(!z));
                            }
                        }
                        str = new String(bArr2, 0, size3, t1.i(!z));
                    } else if (this.h.c().f674c == 2) {
                        int size4 = this.f128e.size();
                        char[] cArr2 = new char[size4];
                        long j5 = 0;
                        for (int i6 = 0; i6 < size4; i6++) {
                            android.ext.c cVar4 = (android.ext.c) this.f128e.get(i6);
                            if (j5 == 0 || j5 + 2 == cVar4.f672a) {
                                j5 = cVar4.f672a;
                                cArr2[i6] = (char) cVar4.f673b;
                            } else {
                                size4 = i6;
                                sb.append(new String(cArr2, 0, size4));
                            }
                            break;
                        }
                        sb.append(new String(cArr2, 0, size4));
                    } else if (this.h.c().f674c == 4) {
                        int size5 = this.f128e.size();
                        char[] cArr3 = new char[size5 * 2];
                        long j6 = 0;
                        for (int i7 = 0; i7 < size5; i7++) {
                            android.ext.c cVar5 = (android.ext.c) this.f128e.get(i7);
                            if (j6 == 0 || j6 + 4 == cVar5.f672a) {
                                j6 = cVar5.f672a;
                                int i8 = i7 * 2;
                                long j7 = cVar5.f673b;
                                cArr3[i8] = (char) j7;
                                cArr3[i8 + 1] = (char) (j7 >> 16);
                            } else {
                                size5 = i7;
                                str = new String(cArr3, 0, size5 * 2);
                            }
                        }
                        str = new String(cArr3, 0, size5 * 2);
                    }
                    sb.append(str);
                    break;
                case R.id.fill_values /* 2131034261 */:
                    sb = new StringBuilder();
                    int size6 = this.f128e.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        android.ext.c cVar6 = (android.ext.c) this.f128e.get(i9);
                        if (i9 != 0) {
                            sb.append(';');
                        }
                        sb.append(cVar6.J());
                    }
                    break;
                default:
                    sb = null;
                    break;
            }
            if (sb != null) {
                this.h.s(sb.toString());
            }
            return sb != null;
        }

        private void c(boolean z, boolean z2, String str) {
            c2 c2Var;
            String string;
            if (z) {
                int iH = MainService.instance.H();
                if (iH == 1 && MainService.instance.p0 == 1) {
                    this.f127d = 1;
                } else if (iH != 2 || MainService.instance.t0.getCount() != 1) {
                    return;
                } else {
                    this.f127d = 2;
                }
            }
            int i = this.f127d;
            if ((i == 1 || i == 2) && (c2Var = MainService.instance.f216f) != null) {
                h2 h2VarG = this.h.g();
                if (this.f127d != 2 && !z2) {
                    c2Var.write("revert = ");
                    b0.n(c2Var, true);
                    int i2 = h2VarG.f674c;
                    if ((i2 & 1073741824) == 1073741824) {
                        h2VarG.f674c = i2 & (-1073741825);
                        c2Var.write("local t = ");
                        b0.n(c2Var, true);
                        c2Var.write("for i, v in ipairs(t) do\n");
                        c2Var.write("\tif v.flags == ");
                        Script.Consts.a(c2Var, c2Var.f697c.f372b, h2VarG.f674c);
                        c2Var.write(" then\n");
                        c2Var.write("\t\tv.value = ");
                        c2Var.write("v.value + ");
                        Script.Consts.c(c2Var, str);
                        c2Var.write("\n");
                        c2Var.write("\tend\n");
                        c2Var.write("end\n");
                        c2Var.write("gg.setValues(t)\n");
                        c2Var.write("t = nil\n\n");
                    } else {
                        c2Var.write("gg.editAll(");
                        Script.Consts.c(c2Var, str);
                        c2Var.write(", ");
                        Script.Consts.a(c2Var, c2Var.f697c.f372b, h2VarG.f674c);
                        c2Var.write(")\n");
                    }
                    return;
                }
                c2Var.write("\nrevert = ");
                if (this.f127d == 1) {
                    b0.n(c2Var, true);
                } else {
                    c2Var.write("gg.getListItems()\n");
                }
                c2Var.write("local t = ");
                if (this.f127d == 1) {
                    b0.n(c2Var, true);
                } else {
                    c2Var.write("gg.getListItems()\n");
                }
                c2Var.write("for i, v in ipairs(t) do\n");
                c2Var.write("\tif v.flags == ");
                Script.Consts.a(c2Var, c2Var.f697c.f372b, h2VarG.f674c);
                c2Var.write(" then\n");
                c2Var.write("\t\tv.value = ");
                int i3 = h2VarG.f674c;
                if ((i3 & 1073741824) == 1073741824) {
                    h2VarG.f674c = i3 & (-1073741825);
                    c2Var.write("v.value + ");
                }
                Script.Consts.c(c2Var, str);
                c2Var.write("\n");
                if (this.f127d == 2 || h2VarG.m) {
                    c2Var.write("\t\tv.freeze = ");
                    c2Var.write(Boolean.toString(h2VarG.m));
                    c2Var.write("\n");
                    if (this.f127d == 2 || h2VarG.n != 0) {
                        byte b2 = h2VarG.n;
                        if (b2 == 0) {
                            string = "gg.FREEZE_NORMAL";
                        } else if (b2 == 1) {
                            string = "gg.FREEZE_MAY_INCREASE";
                        } else if (b2 != 2) {
                            string = b2 != 3 ? Integer.toString(b2) : "gg.FREEZE_IN_RANGE";
                        } else {
                            string = "gg.FREEZE_MAY_DECREASE";
                        }
                        c2Var.write("\t\tv.freezeType = ");
                        c2Var.write(string);
                        c2Var.write("\n");
                        if (h2VarG.n == 3) {
                            c2Var.write("\t\tv.freezeFrom = ");
                            Script.Consts.c(c2Var, h2VarG.c0(true));
                            c2Var.write("\n");
                            c2Var.write("\t\tv.freezeTo = ");
                            Script.Consts.c(c2Var, h2VarG.c0(false));
                            c2Var.write("\n");
                        }
                    }
                }
                c2Var.write("\tend\n");
                c2Var.write("end\n");
                c2Var.write("gg.addListItems(t)\n");
                c2Var.write("t = nil\n\n");
            }
        }

        void b(android.ext.c cVar) {
            android.ext.c cVarC;
            int size;
            h2 h2Var;
            int i = 0;
            this.f125b = false;
            this.f126c = false;
            if (cVar == null) {
                this.f125b = true;
                Object objZ = MainService.instance.z();
                if (Tools.L0(objZ) == 0) {
                    Tools.H1(R.string.nothing_selected);
                    return;
                }
                if (this.f128e == null) {
                    this.f128e = new ArrayList();
                    if (objZ instanceof boolean[]) {
                        this.f127d = 3;
                        if (this.f129f == 0) {
                            this.f128e = null;
                            SparseIntArray sparseIntArray = new SparseIntArray();
                            new u2(android.ext.c.o(MainService.instance.N.q((boolean[]) objZ, sparseIntArray)), sparseIntArray, "0", b2.f(R.string.type_change_request), new a());
                            return;
                        }
                        n1 n1Var = MainService.instance.N;
                        boolean[] zArr = (boolean[]) objZ;
                        int length = zArr.length - 1;
                        for (int i2 = 1; i2 < length; i2++) {
                            if (zArr[i2]) {
                                android.ext.c cVar2 = new android.ext.c(n1Var.e(i2), 0L, this.f129f);
                                if (cVar2.V()) {
                                    cVar2.f673b = MainService.instance.B(cVar2.f672a, cVar2.f674c);
                                    this.f128e.add(cVar2);
                                }
                            }
                        }
                        this.f129f = 0;
                    } else if (objZ instanceof ggd.e) {
                        this.f127d = 2;
                        ggd.e eVar = (ggd.e) objZ;
                        int iL = eVar.l();
                        for (int i3 = 0; i3 < iL; i3++) {
                            if (eVar.a(i3)) {
                                this.f128e.add((android.ext.c) eVar.n(i3));
                            }
                        }
                    } else {
                        if (!(objZ instanceof ggd.a)) {
                            throw new IllegalArgumentException("Obj is unknown: " + objZ);
                        }
                        this.f127d = 1;
                        ggd.a aVar = (ggd.a) objZ;
                        int i4 = aVar.i();
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (aVar.c(i5)) {
                                this.f128e.add(aVar.f(i5, null));
                            }
                        }
                    }
                }
                List list = this.f128e;
                if (list == null) {
                    cVarC = cVar;
                    size = 0;
                } else {
                    if (list.size() == 0) {
                        Tools.H1(R.string.nothing_selected);
                        e1.d("It must never happen.");
                        return;
                    }
                    if (this.f130g == 0) {
                        SparseIntArray sparseIntArray2 = new SparseIntArray();
                        Iterator it = this.f128e.iterator();
                        while (it.hasNext()) {
                            int i6 = ((android.ext.c) it.next()).f674c;
                            i |= i6;
                            sparseIntArray2.put(i6, sparseIntArray2.get(i6) + 1);
                        }
                        new u2(android.ext.c.o(i), sparseIntArray2, "0", b2.f(R.string.type_change_request), new DialogInterfaceOnClickListenerC0005b());
                        return;
                    }
                    int i7 = 0;
                    while (i7 < this.f128e.size()) {
                        if (((android.ext.c) this.f128e.get(i7)).f674c != this.f130g) {
                            this.f128e.remove(i7);
                            i7--;
                        }
                        i7++;
                    }
                    this.f130g = 0;
                    if (this.f128e.size() == 0) {
                        Tools.H1(R.string.no_items_for_editing);
                        e1.d("It must never happen. " + this.f130g);
                        return;
                    }
                    cVarC = ((android.ext.c) this.f128e.get(0)).c();
                    size = this.f128e.size();
                    if (size == 1) {
                        this.f125b = false;
                    }
                }
                if (cVarC == null) {
                    throw new NullPointerException("Something going wrong");
                }
            } else {
                cVarC = cVar;
                size = 0;
            }
            if (!this.f125b) {
                h2 h2VarE = MainService.instance.t0.e(cVarC.f672a);
                if (h2VarE == null || h2VarE.Q() != cVarC.Q()) {
                    h2Var = new h2(cVarC);
                } else {
                    h2Var = h2VarE.c();
                    h2Var.f673b = cVarC.f673b;
                    this.f126c = true;
                }
                cVarC = h2Var;
            }
            if (this.f125b) {
                cVarC.f674c = cVarC.Q();
            }
            l0 l0Var = new l0(this.f125b ? 2 : this.f126c ? 0 : 1, cVarC);
            this.h = l0Var;
            if (this.f125b) {
                String strJ = i2.l;
                if (strJ == null || this.f127d != 1) {
                    strJ = cVarC.J();
                }
                this.h.s(strJ);
                this.h.q(this);
            } else if (this.f126c) {
                l0Var.l();
            }
            CharSequence charSequenceU = cVarC.u();
            this.h.r(Tools.v(new SpannableString(this.f125b ? Tools.L1(b2.f(R.string.edit_all_info), Integer.valueOf(size), charSequenceU) : Tools.L1(b2.f(R.string.edit_info), cVarC.F(), charSequenceU)), charSequenceU, cVarC.m()));
            AlertDialog alertDialogCreate = ggf.b().setView(this.h.j()).setPositiveButton(b2.f(R.string.yes), this).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null).create();
            this.f124a = alertDialogCreate;
            if (!this.f125b) {
                alertDialogCreate.setButton(-3, b2.f(R.string.goto1), this);
            }
            ggf.l(alertDialogCreate, this);
            ggf.k(alertDialogCreate, this);
            ggf.n(alertDialogCreate, this.h.f());
        }

        void d(android.ext.c cVar) {
            this.f128e = null;
            this.f129f = 0;
            this.f130g = 0;
            this.f127d = 0;
            b(cVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1 || i == -2 || i != -3 || this.f125b) {
                return;
            }
            android.ext.c cVarC = this.h.c();
            MainService mainService = MainService.instance;
            Long lValueOf = !EditorListener.this.f123f ? null : Long.valueOf(cVarC.f672a);
            mainService.L(lValueOf, cVarC.F(), Tools.N1(R.string.from_item) + ": (" + cVarC + ')');
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            try {
                this.h.k();
            } catch (Throwable th) {
                e1.a(th);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            if (itemAtPosition instanceof v0) {
                v0 v0Var = (v0) itemAtPosition;
                MainService.instance.L(Long.valueOf(v0Var.b()), v0Var.a(), Tools.N1(R.string.from_boundary));
                return;
            }
            android.ext.c cVar = itemAtPosition instanceof android.ext.c ? (android.ext.c) itemAtPosition : null;
            if (cVar == null) {
                return;
            }
            if (adapterView.getId() != R.id.mem_listview || ((Config.B & 1024) != 0 && Integer.bitCount(cVar.f674c) == 1)) {
                d(cVar);
            } else {
                new u2(android.ext.c.p(127, cVar.f672a), "0", b2.f(R.string.type_change_request), new c(cVar));
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.t1(dialogInterface, -1, null, this, this.h.f());
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            char[] charArray;
            byte[] bArrH;
            String[] strArr;
            String str;
            SavedListAdapter savedListAdapter;
            byte[] bArr;
            int i2;
            long j;
            int i3;
            long j2;
            long j3;
            String str2 = "Exception in EditorListener";
            t1.b bVarW = null;
            if (view == null || (view.getTag() instanceof p1)) {
                d(null);
                return;
            }
            try {
                if (!this.f125b) {
                    String strH = j2.h(this.h.e());
                    i2.c cVarX = i2.x(strH, false);
                    int i4 = cVarX != null ? cVarX.f1018b : 0;
                    if (cVarX != null) {
                        strH = cVarX.f1017a;
                    }
                    h2 h2VarG = this.h.g();
                    h2VarG.X(strH);
                    h2VarG.b(i4);
                    boolean zN = this.h.n();
                    if (zN || this.f126c) {
                        MainService.instance.t0.a(h2VarG);
                    }
                    Tools.D(this.f124a);
                    c(true, zN, strH);
                    MainService.instance.e0();
                    return;
                }
                if (a(view)) {
                    return;
                }
                try {
                    try {
                        try {
                            String strH2 = j2.h(this.h.e());
                            i2.c cVarX2 = i2.x(strH2, false);
                            if (cVarX2 != null) {
                                try {
                                    i = cVarX2.f1018b;
                                } catch (Throwable th) {
                                    th = th;
                                    e1.l(str2, th);
                                    return;
                                }
                            } else {
                                i = 0;
                            }
                            String str3 = cVarX2 != null ? cVarX2.f1017a : strH2;
                            boolean zN2 = this.h.n();
                            String strH3 = j2.h(this.h.b());
                            int size = this.f128e.size();
                            boolean zO = this.h.o();
                            int i5 = this.h.c().f674c;
                            if (i5 == 1 && t1.m(str3)) {
                                charArray = null;
                                strArr = null;
                                bArrH = t1.h(str3);
                            } else if ((i5 & 6) != 0 && t1.m(str3) && str3.charAt(0) == ';') {
                                bArrH = null;
                                strArr = null;
                                charArray = str3.substring(1).toCharArray();
                            } else if (str3.indexOf(59) != -1) {
                                String[] strArrSplit = str3.split(";");
                                if (strArrSplit.length == 0) {
                                    charArray = null;
                                    bArrH = null;
                                    strArr = null;
                                } else {
                                    charArray = null;
                                    bArrH = null;
                                    strArr = strArrSplit;
                                }
                            } else {
                                charArray = null;
                                bArrH = null;
                                strArr = null;
                            }
                            SavedListAdapter savedListAdapter2 = MainService.instance.t0;
                            t1.b[] bVarArr = strArr == null ? null : new t1.b[strArr.length];
                            android.ext.c.b bVarF = null;
                            long j4 = 0;
                            int i6 = 0;
                            int length = 0;
                            int i7 = 0;
                            while (i6 < size) {
                                android.ext.c cVar = (android.ext.c) this.f128e.get(i6);
                                str = str2;
                                String str4 = strH2;
                                try {
                                    h2 h2VarE = MainService.instance.t0.e(cVar.f672a);
                                    boolean z = h2VarE != null && h2VarE.Q() == cVar.Q();
                                    h2 h2VarH = this.h.h(cVar);
                                    if (zO) {
                                        if (bArrH != null) {
                                            long j5 = j4 + 1;
                                            long j6 = cVar.f672a;
                                            int i8 = j5 != j6 ? 0 : length;
                                            if (i8 < bArrH.length) {
                                                length = i8 + 1;
                                                j3 = ((long) bArrH[i8]) & 255;
                                            } else {
                                                length = i8;
                                                j3 = 0;
                                            }
                                            h2VarH.f673b = j3;
                                            savedListAdapter = savedListAdapter2;
                                            bArr = bArrH;
                                            i2 = size;
                                            j4 = j6;
                                        } else if (charArray != null) {
                                            SavedListAdapter savedListAdapter3 = savedListAdapter2;
                                            boolean z2 = cVar.f674c == 2;
                                            byte[] bArr2 = bArrH;
                                            int i9 = size;
                                            long j7 = j4 + ((long) (z2 ? 2 : 4));
                                            long j8 = cVar.f672a;
                                            int i10 = j7 != j8 ? 0 : length;
                                            if (i10 < charArray.length) {
                                                j = ((long) charArray[i10]) & 65535;
                                                i10++;
                                            } else {
                                                j = 0;
                                            }
                                            h2VarH.f673b = j;
                                            if (!z2) {
                                                if (i10 < charArray.length) {
                                                    i3 = i10 + 1;
                                                    j2 = (((long) charArray[i10]) & 65535) << 16;
                                                } else {
                                                    i3 = i10;
                                                    j2 = 0;
                                                }
                                                h2VarH.f673b = j2 | j;
                                                i10 = i3;
                                            }
                                            length = i10;
                                            j4 = j8;
                                            savedListAdapter = savedListAdapter3;
                                            i2 = i9;
                                            bArr = bArr2;
                                        } else {
                                            SavedListAdapter savedListAdapter4 = savedListAdapter2;
                                            byte[] bArr3 = bArrH;
                                            int i11 = size;
                                            if (strArr != null) {
                                                length = i6 % strArr.length;
                                                str3 = strArr[length];
                                                bVarW = bVarArr[length];
                                                if (bVarW == null) {
                                                    bVarW = android.ext.c.W(null, str3, h2VarH.f674c, R.string.number_name, cVar.f672a);
                                                    bVarArr[length] = bVarW;
                                                }
                                            } else if (bVarW == null) {
                                                bVarW = android.ext.c.W(null, str3, h2VarH.f674c, R.string.number_name, cVar.f672a);
                                            }
                                            int i12 = length;
                                            i7++;
                                            savedListAdapter = savedListAdapter4;
                                            bArr = bArr3;
                                            i2 = i11;
                                            bVarF = h2VarH.f(bVarF, bVarW, str3, cVar.f672a, strH3, i7);
                                            length = i12;
                                        }
                                        h2VarH.b(i);
                                    } else {
                                        i6 = i6;
                                        savedListAdapter = savedListAdapter2;
                                        charArray = charArray;
                                        bArr = bArrH;
                                        i2 = size;
                                        strArr = strArr;
                                    }
                                    if (zN2 || z) {
                                        savedListAdapter.b(h2VarH, (byte) 0, false);
                                    }
                                    i6++;
                                    strH2 = str4;
                                    savedListAdapter2 = savedListAdapter;
                                    charArray = charArray;
                                    bArrH = bArr;
                                    size = i2;
                                    strArr = strArr;
                                    str2 = str;
                                } catch (NumberFormatException e2) {
                                    e = e2;
                                    j2.i(e, this.h.f());
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    str2 = str;
                                    e1.l(str2, th);
                                    return;
                                }
                            }
                            str = str2;
                            String str5 = strH2;
                            char[] cArr = charArray;
                            byte[] bArr4 = bArrH;
                            savedListAdapter2.notifyDataSetChanged();
                            MainService.instance.e0();
                            Tools.D(this.f124a);
                            if (i2.l != null && this.f127d == 1 && (bArr4 != null || cArr != null)) {
                                i2.l = str5;
                            }
                            c(false, zN2, str5);
                        } catch (NumberFormatException e3) {
                            e = e3;
                        }
                    } catch (NumberFormatException e4) {
                        e = e4;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (NumberFormatException e5) {
                j2.i(e5, this.h.f());
            } catch (Throwable th4) {
                e1.l("Exception in EditorListener", th4);
            }
        }
    }

    public EditorListener() {
        this(false);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        new b().onItemClick(adapterView, view, i, j);
    }

    public EditorListener(boolean z) {
        super(R.string.edit_selected, R.drawable.ic_tooltip_edit_white_24dp);
        this.f123f = z;
    }
}
