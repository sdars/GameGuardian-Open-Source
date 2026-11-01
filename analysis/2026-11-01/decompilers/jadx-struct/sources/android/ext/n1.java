package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.SectionIndexer;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$color;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class n1 extends BaseAdapterLC implements b3$a, SectionIndexer, Filterable {
    private static n t;
    private static int[] u;
    private static volatile CharSequence[] v;
    private static volatile int[] w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f1118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f1119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f1120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1121g;
    volatile int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f1115a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Filter f1116b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    short[] f1117c = null;
    private int h = -1;
    private boolean[] i = null;
    private n1$f k = null;
    private int l = 2;
    private long m = 0;
    private final d$a n = new d$a();
    private final CharSequence[] o = new CharSequence[2];
    private long p = 1;
    private int q = 0;
    private int r = 0;
    private n1$d s = null;

    public n1() {
        this.j = -15999;
        this.j = Tools.M0().getInt("memory-editor-format", -15999);
        a();
        byte[] bArr = new byte[8200];
        this.f1118d = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f1120f = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        this.f1121g = 0L;
        this.f1119e = 0L;
        MainService.instance.u.setText(A());
    }

    private CharSequence A() {
        return B(this.j);
    }

    static CharSequence B(int i) {
        CharSequence[] charSequenceArrV = v();
        CharSequence[] charSequenceArr = new CharSequence[charSequenceArrV.length * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < charSequenceArrV.length; i3++) {
            if (((1 << i3) & i) != 0) {
                if (i2 > 0) {
                    charSequenceArr[i2] = ",";
                    i2++;
                }
                charSequenceArr[i2] = charSequenceArrV[i3];
                i2++;
            }
        }
        return Tools.x((CharSequence[]) Arrays.copyOf(charSequenceArr, i2));
    }

    private int C(int i) {
        return D(i, this.f1117c);
    }

    private static int D(int i, short[] sArr) {
        if (sArr == null) {
            return i;
        }
        int iBinarySearch = Arrays.binarySearch(sArr, (short) i);
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        int i2 = (-iBinarySearch) - 2;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public static String H(long j, int i) {
        byte[] bArrG = t1.g(j);
        byte b2 = bArrG[8];
        if (b2 <= i) {
            i = b2;
        }
        if ((i & 1) == 0) {
            i++;
        }
        return new String(bArrG, 0, i + 1, t1.i(true));
    }

    public static String I(long j, int i) {
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (255 & j);
        bArr[1] = (byte) ((65280 & j) >> 8);
        bArr[2] = (byte) ((16711680 & j) >> 16);
        bArr[3] = (byte) ((4278190080L & j) >> 24);
        bArr[4] = (byte) ((1095216660480L & j) >> 32);
        bArr[5] = (byte) ((280375465082880L & j) >> 40);
        bArr[6] = (byte) ((71776119061217280L & j) >> 48);
        bArr[7] = (byte) ((j & (-72057594037927936L)) >> 56);
        for (int i2 = 0; i2 < 8; i2++) {
            if (bArr[i2] < 32) {
                bArr[i2] = 46;
            }
        }
        return new String(bArr).substring(0, i);
    }

    private int J(int i) {
        return K(i, this.f1117c, u());
    }

    private static int K(int i, short[] sArr, int i2) {
        if (sArr == null || i < 0) {
            return i;
        }
        return i >= sArr.length ? (i - sArr.length) + (8192 >> i2) : sArr[i];
    }

    private static int N(TextView textView, CharSequence charSequence, int i, int i2) {
        O(textView, charSequence);
        return (charSequence == null || i >= i2) ? i : i2;
    }

    private static void O(TextView textView, CharSequence charSequence) {
        if (charSequence == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    private void Q(c3 c3Var, int i) {
        c3Var.f661a.getLayoutParams().height = (Config.q & (1 << (Tools.d1() + 4))) != 0 ? -2 : Tools.H();
        boolean z = false;
        if (i != 0 && i != getCount() - 1) {
            c3Var.f661a.setVisibility(0);
            c3Var.f662b.setVisibility(0);
            c3Var.j.setVisibility(0);
            c3Var.m = i;
            long jE = e(i);
            c3Var.j.setText(t(jE));
            c3Var.f662b.setText(c.G(jE, 32));
            try {
                z = this.i[i];
            } catch (IndexOutOfBoundsException e2) {
                e1.l("ArrayAdapter getView failed", e2);
            }
            c3Var.f661a.setChecked(z);
            c3Var.a(z, this.h);
            long j = this.f1120f.getLong(n(jE));
            boolean zE = E();
            d dVar = MainService.instance.u0;
            int iX = x(zE, dVar, jE, j, x(zE, dVar, jE, j, x(zE, dVar, jE, j, x(zE, dVar, jE, j, x(zE, dVar, jE, j, x(zE, dVar, jE, j, x(zE, dVar, jE, j, 0, c3Var.p, 9, 64, 8, 4), c3Var.s, 12, 32, 8, 4), c3Var.o, 8, 16, 4, 4), c3Var.n, 7, 4, 4, 4), c3Var.t, 13, 8, 4, 4), c3Var.q, 10, 2, 2, 2), c3Var.r, 11, 1, 1, 1);
            if (iX == 0) {
                iX = 1 << u();
            }
            c(c3Var, jE, j, this.j, zE, iX);
            return;
        }
        c3Var.f661a.setVisibility(4);
        c3Var.f662b.setVisibility(8);
        c3Var.f663c.setVisibility(8);
        c3Var.f664d.setVisibility(8);
        c3Var.f665e.setVisibility(0);
        c3Var.f666f.setVisibility(8);
        c3Var.f667g.setVisibility(8);
        c3Var.h.setVisibility(8);
        c3Var.i.setVisibility(8);
        c3Var.n.setVisibility(8);
        c3Var.o.setVisibility(8);
        c3Var.p.setVisibility(8);
        c3Var.q.setVisibility(8);
        c3Var.r.setVisibility(8);
        c3Var.s.setVisibility(8);
        c3Var.t.setVisibility(8);
        c3Var.j.setVisibility(8);
        c3Var.a(false, -2);
        long[] jArrY = y(i != 0);
        c3Var.f665e.setText(b2.f(R$string.goto_address) + ' ' + c.G(jArrY[0], 32));
    }

    private void a() {
        int i;
        int count = getCount();
        boolean[] zArr = this.i;
        n1$f n1_f = this.k;
        int iU = u();
        short[] sArr = this.f1117c;
        if (zArr == null || count != zArr.length || n1_f == null || iU != n1_f.f1135a) {
            boolean[] zArr2 = new boolean[count];
            this.i = zArr2;
            if (n1_f != null) {
                int i2 = n1_f.f1135a;
                short[] sArr2 = n1_f.f1136b;
                int i3 = (1 << i2) - 1;
                int i4 = count - 1;
                for (int i5 = 1; i5 < i4; i5++) {
                    int iK = K(i5 - 1, sArr, iU) << iU;
                    if ((iK & i3) == 0) {
                        int i6 = iK >> i2;
                        int iD = D(i6, sArr2);
                        if (i6 == K(iD, sArr2, i2) && (i = iD + 1) >= 0 && i < zArr.length && zArr[i]) {
                            zArr2[i5] = true;
                        }
                    }
                }
            }
            this.k = new n1$f(iU, sArr, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    static void c(b3 b3Var, long j, long j2, int i, boolean z, int i2) {
        String string;
        String string2;
        String string3;
        long j3;
        String str;
        String str2;
        String str3;
        RegionList$b regionList$bB;
        TextView textView = b3Var.h;
        String str4 = null;
        if ((j & 1) != 0 || (i & 32) == 0) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            n nVar = t;
            if (nVar == null) {
                nVar = new n();
                t = nVar;
            }
            sb.append(n.q(nVar, j, j2));
            sb.append(';');
            string = sb.toString();
        }
        int iN = N(textView, string, i2, 2);
        TextView textView2 = b3Var.f667g;
        long j4 = 3 & j;
        if (j4 != 0 || (i & 16) == 0) {
            string2 = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            n nVar2 = t;
            if (nVar2 == null) {
                nVar2 = new n();
                t = nVar2;
            }
            sb2.append(n.o(nVar2, j, j2));
            sb2.append(';');
            string2 = sb2.toString();
        }
        int iN2 = N(textView2, string2, iN, 4);
        TextView textView3 = b3Var.i;
        if (j4 != 0 || (i & 64) == 0) {
            string3 = null;
        } else {
            int[] iArrD = u;
            if (iArrD == null) {
                iArrD = m.d();
                u = iArrD;
            }
            StringBuilder sbG = m.g(iArrD, j, (int) j2, new StringBuilder());
            sbG.append(';');
            string3 = sbG.toString();
        }
        int iN3 = N(textView3, string3, iN2, 4);
        boolean z2 = false;
        if ((i & 1) != 0) {
            if (z) {
                j3 = iN3 != 8 ? j2 & ((1 << (iN3 * 8)) - 1) : j2;
                str3 = t2.e(iN3 * 2, j3) + "h;";
                z1$d z1_d = MainService.instance.v0;
                if (iN3 == 4 || (z1_d != null && z1_d.n && iN3 == 8)) {
                    regionList$bB = RegionList.b(j3);
                }
                O(b3Var.f663c, str3);
                b3Var.f663c.setTextColor(RegionList$b.c(regionList$bB));
                if (iN3 == 1) {
                    z2 = true;
                }
            } else {
                j3 = j2;
                str3 = "?";
            }
            regionList$bB = null;
            O(b3Var.f663c, str3);
            b3Var.f663c.setTextColor(RegionList$b.c(regionList$bB));
            if (iN3 == 1) {
                z2 = true;
            }
        } else {
            O(b3Var.f663c, null);
            j3 = j2;
        }
        if (z2 || (i & 2) == 0) {
            O(b3Var.f664d, null);
        } else {
            if (z) {
                int i3 = iN3 * 8;
                long jReverseBytes = Long.reverseBytes(j3) >> (64 - i3);
                if (iN3 != 8) {
                    jReverseBytes &= (1 << i3) - 1;
                }
                str2 = t2.e(iN3 * 2, jReverseBytes) + "r;";
            } else {
                str2 = "?";
            }
            O(b3Var.f664d, str2);
        }
        TextView textView4 = b3Var.f665e;
        if ((i & 4) == 0) {
            str = null;
        } else if (z) {
            str = '\'' + I(j3, iN3) + "';";
        } else {
            str = "?";
        }
        O(textView4, str);
        TextView textView5 = b3Var.f666f;
        if ((i & 8) != 0) {
            if (z) {
                str4 = '\"' + H(j3, iN3) + "\";";
            } else {
                str4 = "?";
            }
        }
        O(textView5, str4);
    }

    static int[] g() {
        if (w != null) {
            return w;
        }
        int iD0 = Tools.d0(R$color.region_code);
        int[] iArr = {-1, -1, -1, -1, iD0, Tools.d0(R$color.region_system_code), iD0, c.n(4), c.n(16), c.n(64), c.n(2), c.n(1), c.n(32), c.n(8)};
        w = iArr;
        return iArr;
    }

    private int h() {
        short[] sArr = this.f1117c;
        return sArr == null ? s() : sArr.length;
    }

    private int j() {
        int i = this.j;
        if (i != this.r) {
            int[] iArr = {0, 0, 0, 0, 4, 2, 4, 4, 16, 64, 2, 1, 32, 8};
            int i2 = 0;
            for (int i3 = 0; i3 < 14; i3++) {
                if (((1 << i3) & i) != 0) {
                    i2 |= iArr[i3];
                }
            }
            this.r = i;
            this.q = i2;
        }
        return this.q;
    }

    private int k(long j) {
        int iP = p(j);
        this.h = iP;
        return iP;
    }

    static CharSequence[] l() {
        return new CharSequence[]{b2.f(R$string.format_hex), b2.f(R$string.format_rhex), b2.f(R$string.format_string), "UTF-16LE", Tools.L1(b2.f(R$string.format_asm_opcodes), "ARM (x32)"), Tools.L1(b2.f(R$string.format_asm_opcodes), "Thumb"), Tools.L1(b2.f(R$string.format_asm_opcodes), "ARM (x64)"), b2.f(R$string.type_dword), b2.f(R$string.type_float), b2.f(R$string.type_double), b2.f(R$string.type_word), b2.f(R$string.type_byte), b2.f(R$string.type_qword), b2.f(R$string.type_xor)};
    }

    private View m(ViewGroup viewGroup) {
        View viewG = a.d.g(R$layout.service_memory_item, viewGroup, false);
        c3 c3Var = new c3(viewG, this);
        c3Var.n = (TextView) viewG.findViewById(R$id.value_dword);
        c3Var.o = (TextView) viewG.findViewById(R$id.value_float);
        c3Var.p = (TextView) viewG.findViewById(R$id.value_double);
        c3Var.q = (TextView) viewG.findViewById(R$id.value_word);
        c3Var.r = (TextView) viewG.findViewById(R$id.value_byte);
        c3Var.s = (TextView) viewG.findViewById(R$id.value_qword);
        c3Var.t = (TextView) viewG.findViewById(R$id.value_xor);
        return viewG;
    }

    private int n(long j) {
        return (int) (j & 8191);
    }

    private long o() {
        return this.f1121g;
    }

    private CharSequence t(long j) {
        CharSequence[] charSequenceArr = this.o;
        long jO = o();
        int i = 0;
        if (this.p != jO) {
            this.p = jO;
            for (int i2 = 0; i2 < charSequenceArr.length; i2++) {
                charSequenceArr[i2] = RegionList.a((((long) i2) * 4096) + jO);
            }
        }
        while (i < charSequenceArr.length) {
            int i3 = i + 1;
            if (Tools.T1(j, ((((long) i3) * 4096) + jO) - 1)) {
                return charSequenceArr[i];
            }
            i = i3;
        }
        return "??";
    }

    private int u() {
        int i = this.l;
        int i2 = this.j;
        long j = 17179869184L | ((long) i2);
        if (j != this.m) {
            if ((i2 & 2048) != 0) {
                i = 0;
            } else {
                i = (i2 & 1056) != 0 ? 1 : 2;
            }
            this.l = i;
            this.m = j;
        }
        return i;
    }

    private static CharSequence[] v() {
        if (v != null) {
            return v;
        }
        CharSequence[] charSequenceArr = new CharSequence[14];
        charSequenceArr[0] = b2.f(R$string.hex);
        charSequenceArr[1] = b2.f(R$string.rhex);
        charSequenceArr[2] = "S";
        charSequenceArr[3] = "J";
        charSequenceArr[4] = "A";
        charSequenceArr[5] = "T";
        charSequenceArr[6] = "A8";
        charSequenceArr[7] = b2.f(R$string.type_dword_short);
        charSequenceArr[8] = b2.f(R$string.type_float_short);
        charSequenceArr[9] = b2.f(R$string.type_double_short);
        charSequenceArr[10] = b2.f(R$string.type_word_short);
        charSequenceArr[11] = b2.f(R$string.type_byte_short);
        charSequenceArr[12] = b2.f(R$string.type_qword_short);
        charSequenceArr[13] = b2.f(R$string.type_xor_short);
        int[] iArrG = g();
        for (int i = 0; i < 14; i++) {
            charSequenceArr[i] = Tools.t(charSequenceArr[i], iArrG[i]);
        }
        v = charSequenceArr;
        return charSequenceArr;
    }

    private int w(long j, long j2, int i, StringBuilder sb, int i2, int i3, int i4, int i5) {
        if ((((long) (i5 - 1)) & j) != 0) {
            return i;
        }
        if (((1 << i2) & this.j) == 0) {
            return i;
        }
        sb.append(c.K(j, j2, i3));
        sb.append("\n");
        return i == 0 ? i4 : i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006c  */
    private int x(boolean z, d dVar, long j, long j2, int i, TextView textView, int i2, int i3, int i4, int i5) {
        String str;
        if ((((long) (i5 - 1)) & j) == 0) {
            if (((1 << i2) & this.j) != 0) {
                if (z) {
                    String strK = c.K(j, j2, i3);
                    d$a d_a = this.n;
                    dVar.a(j, i3, d_a);
                    if (d_a.f702b) {
                        strK = strK + " (" + c.I(j, d_a.f701a, i3) + ')';
                    }
                    str = strK + ((Object) c.A(i3)) + ';';
                } else {
                    str = "?";
                }
                O(textView, str);
                if (i == 0) {
                    return i4;
                }
            } else {
                O(textView, null);
            }
        } else {
            O(textView, null);
        }
        return i;
    }

    private long[] y(boolean z) {
        long j;
        long jO = o();
        if (z) {
            long j2 = 8192 + jO;
            j = j2 == 0 ? jO + 8191 : j2;
            jO = j2;
        } else {
            j = jO == 0 ? jO : jO - 1;
        }
        return new long[]{j, jO};
    }

    boolean E() {
        return this.f1119e == o();
    }

    public void F() {
        MainService.instance.Q();
        MainService.instance.i.O(o(), 8196);
    }

    public void G(w wVar) {
        long jO = o();
        try {
            wVar.j();
            long jG = wVar.g();
            int iF = wVar.f();
            if (jG != jO) {
                StringBuilder sb = new StringBuilder();
                sb.append("Offset mismatch: ");
                sb.append(jG);
                sb.append(" (");
                String hexString = Long.toHexString(jG);
                Locale locale = Locale.US;
                sb.append(hexString.toUpperCase(locale));
                sb.append(") != ");
                sb.append(jO);
                sb.append(" (");
                sb.append(Long.toHexString(jO).toUpperCase(locale));
                sb.append(")");
                throw new RuntimeException(sb.toString());
            }
            if (iF >= 8192) {
                wVar.d(this.f1118d, 0, iF);
                this.f1119e = jO;
                MainService.instance.M.post(new n1$a(this));
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Size mismatch: ");
            sb2.append(iF);
            sb2.append(" (");
            String hexString2 = Integer.toHexString(iF);
            Locale locale2 = Locale.US;
            sb2.append(hexString2.toUpperCase(locale2));
            sb2.append(") != ");
            sb2.append(8192);
            sb2.append(" (");
            sb2.append(Integer.toHexString(8192).toUpperCase(locale2));
            sb2.append(")");
            throw new RuntimeException(sb2.toString());
        } catch (IOException e2) {
            e = e2;
            e1.s("Failed load data to memory editor", e);
            Arrays.fill(this.f1118d, (byte) 0);
        } catch (RuntimeException e3) {
            e = e3;
            e1.s("Failed load data to memory editor", e);
            Arrays.fill(this.f1118d, (byte) 0);
        }
    }

    public void L() {
        F();
    }

    public void M(long j, int i) {
        long j2 = (-8192) & j;
        if (j2 != this.f1121g) {
            this.f1121g = j2;
            Arrays.fill(this.i, false);
            notifyDataSetChanged();
        }
        Tools.B1(MainService.instance.M, k(j), i);
    }

    void P() {
        a();
        super.notifyDataSetChanged();
    }

    void R(int i) {
        if (i == this.j) {
            return;
        }
        int iU = u();
        Tools$a0 tools$a0J0 = Tools.J0(MainService.instance.M);
        long jE = e(tools$a0J0.f498a);
        int i2 = this.h;
        long jE2 = i2 < 0 ? -1L : e(i2);
        this.j = i;
        new g2().g("memory-editor-format", this.j, -15999).commit();
        notifyDataSetChanged();
        if (iU != u()) {
            tools$a0J0.f498a = p(jE);
            Tools.A1(MainService.instance.M, tools$a0J0);
            if (this.h >= 0) {
                this.h = p(jE2);
            }
        }
        MainService.instance.u.setText(A());
    }

    public void b() {
        boolean z = MainService.instance.H() == 2;
        CharSequence[] charSequenceArrL = l();
        int i = this.j;
        if (z) {
            charSequenceArrL = (CharSequence[]) Arrays.copyOf(charSequenceArrL, 7);
            i = SavedListAdapter.f360c;
        }
        boolean[] zArr = new boolean[charSequenceArrL.length];
        CharSequence[] charSequenceArrV = v();
        int[] iArrG = g();
        for (int i2 = 0; i2 < charSequenceArrL.length; i2++) {
            charSequenceArrL[i2] = Tools.t(((Object) charSequenceArrV[i2]) + ": " + ((Object) charSequenceArrL[i2]), iArrG[i2]);
            zArr[i2] = ((1 << i2) & i) != 0;
        }
        n1$b n1_b = new n1$b(this, z, zArr);
        f.o(f.c(Tools.k0()).setCustomTitle(Tools.g0(R$string.value_format)).setMultiChoiceItems(charSequenceArrL, zArr, new n1$c(this, zArr)).setPositiveButton(b2.f(R$string.yes), n1_b).setNeutralButton(b2.f(R$string.reset_button), n1_b).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null));
    }

    public void d() {
        long jO = o();
        this.p = jO;
        boolean z = false;
        for (int i = 0; i < this.o.length; i++) {
            CharSequence charSequenceA = RegionList.a((((long) i) * 4096) + jO);
            if (!charSequenceA.equals(this.o[i])) {
                this.o[i] = charSequenceA;
                z = true;
            }
        }
        if (z) {
            notifyDataSetChanged();
        }
    }

    public long e(int i) {
        return r(J(i - 1));
    }

    public boolean[] f() {
        return this.i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return h() + 2;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        Filter filter = this.f1116b;
        if (filter != null) {
            return filter;
        }
        n1$e n1_e = new n1$e(this, null);
        this.f1116b = n1_e;
        return n1_e;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i == 0 || i == getCount() - 1) {
            long[] jArrY = y(i != 0);
            return new v0(jArrY[0], jArrY[1]);
        }
        long jE = e(i);
        int iS = c.S(jE, false) & j();
        if (iS == 0) {
            iS = c.S(jE, true);
        }
        return new c(jE, this.f1120f.getLong(n(jE)), iS);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return e(i);
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        return p(this.f1121g + (((long) i) * 256));
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        int iE = (int) ((e(i) - o()) / 256);
        if (iE < 0) {
            iE = 0;
        }
        if (iE >= 32) {
            return 31;
        }
        return iE;
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        Object[] objArr = new Object[32];
        for (int i = 0; i < 32; i++) {
            objArr[i] = c.G(this.f1121g + (((long) i) * 256), 4);
        }
        return objArr;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null || !(view.getTag() instanceof c3)) {
            view = m(viewGroup);
        }
        c3 c3Var = (c3) view.getTag();
        if (c3Var.b()) {
            view = m(viewGroup);
            c3Var = (c3) view.getTag();
        }
        Q(c3Var, i);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public p1 i() {
        n1$d n1_d = this.s;
        if (n1_d != null) {
            return n1_d;
        }
        n1$d n1_d2 = new n1$d(this);
        this.s = n1_d2;
        return n1_d2;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        getFilter().filter(this.f1115a);
        P();
    }

    @Override // android.widget.CompoundButton$OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        b3 b3Var = (b3) compoundButton.getTag();
        if (b3Var == null) {
            return;
        }
        try {
            this.i[b3Var.m] = z;
            MainService.instance.p1();
        } catch (IndexOutOfBoundsException e2) {
            e1.l("ArrayAdapter onCheckedChanged failed", e2);
        }
        b3Var.a(z, this.h);
    }

    public int p(long j) {
        return C((int) ((j - o()) >> u())) + 1;
    }

    public int q(boolean[] zArr, SparseIntArray sparseIntArray) {
        int i;
        int length = zArr.length - 1;
        int iT = 0;
        for (int i2 = 1; i2 < length; i2++) {
            if (zArr[i2]) {
                iT |= c.T(e(i2), false, sparseIntArray);
            }
        }
        if ((Config.B & 1024) == 0) {
            return iT;
        }
        int iJ = j();
        return (Integer.bitCount(iJ) != 1 || (i = iJ & iT) == 0) ? iT : i;
    }

    public long r(long j) {
        return (j << u()) + o();
    }

    int s() {
        return 8192 >> u();
    }

    String z(n nVar, int[] iArr, int i) {
        StringBuilder sb;
        long j;
        if (!E()) {
            return "";
        }
        long jR = r(i);
        long j2 = this.f1120f.getLong(n(jR));
        StringBuilder sb2 = new StringBuilder();
        int iW = w(jR, j2, w(jR, j2, w(jR, j2, w(jR, j2, w(jR, j2, w(jR, j2, w(jR, j2, 0, sb2, 9, 64, 8, 4), sb2, 12, 32, 8, 4), sb2, 8, 16, 4, 4), sb2, 7, 4, 4, 4), sb2, 13, 8, 4, 4), sb2, 10, 2, 2, 2), sb2, 11, 1, 1, 1);
        if (iW == 0) {
            iW = 1 << u();
        }
        boolean z = false;
        if ((this.j & 1) != 0) {
            if (iW != 8) {
                j2 &= (1 << (iW * 8)) - 1;
            }
            j = j2;
            sb = sb2;
            sb.append(t2.e(iW * 2, j));
            sb.append("\n");
            z = iW == 1;
        } else {
            j = j2;
        }
        if (!z) {
            sb = sb2;
            if ((this.j & 2) != 0) {
                int i2 = iW * 8;
                long jReverseBytes = Long.reverseBytes(j) >> (64 - i2);
                if (iW != 8) {
                    jReverseBytes &= (1 << i2) - 1;
                }
                sb.append(t2.e(iW * 2, jReverseBytes));
                sb.append("\n");
            }
        }
        sb = sb2;
        if ((this.j & 4) != 0) {
            sb.append(I(j, iW));
            sb.append("\n");
        }
        if ((this.j & 8) != 0) {
            sb.append(H(j, iW));
            sb.append("\n");
        }
        if ((this.j & 16) != 0) {
            sb.append(n.o(nVar, jR, j));
            sb.append("\n");
        }
        if ((this.j & 32) != 0) {
            sb.append(n.q(nVar, jR, j));
            sb.append("\n");
        }
        if ((this.j & 64) != 0) {
            m.g(iArr, jR, (int) j, sb);
            sb.append("\n");
        }
        return sb.toString();
    }
}
