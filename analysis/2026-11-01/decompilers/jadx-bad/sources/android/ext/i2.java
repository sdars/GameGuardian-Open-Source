package android.ext;

import android.content.DialogInterface;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class i2 extends j2 implements View.OnClickListener {
    public static String l;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long[] f1009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long[] f1010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f1011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1012d = 2;

        public a(int i) {
            this.f1009a = new long[i];
            this.f1010b = new long[i];
            this.f1011c = new int[i];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1013a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f1014b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1015c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1016d = 536870912;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(": ");
            sb.append(this.f1013a);
            sb.append(this.f1016d == 536870912 ? "~" : "~~");
            sb.append(this.f1014b);
            sb.append(' ');
            sb.append(this.f1015c);
            return sb.toString();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1018b;
    }

    public i2() {
        super(2131296945, 2130968628);
    }

    private static boolean A(byte b2, long j, long j2, int i, int i2, long j3, long j4, boolean z, long j5) {
        MainService mainService = MainService.instance;
        if (!mainService.a1()) {
            throw new NumberFormatException(b2.f(2131296305));
        }
        if (mainService.p0 != 0 && z) {
            mainService.n(b2);
        }
        if (mainService.p0 == 0) {
            mainService.q0 = false;
            mainService.i.x0(b2);
        }
        mainService.R(b2);
        mainService.r0 = false;
        mainService.i.r0(b2, j, j2, i, i2, j3, j4, j5);
        MainService.N0(i2, b2);
        return false;
    }

    private static boolean k(byte b2, String str, int i, boolean z, boolean z2, int i2, long j, long j2, boolean z3, long j3) {
        a aVarV = v(str.trim(), i, z);
        int i3 = z ? 4194304 : 0;
        String str2 = "";
        if (z2) {
            str2 = "" + Tools.L1(b2.f(2131296384), b2.f(2131296630), b2.f(2131296780)) + '\n';
        }
        if (i2 == 536870912 || i2 == 268435456) {
            i3 |= i2;
        } else {
            str2 = str2 + Tools.L1(b2.f(2131296384), b2.f(2131296630), android.ext.c.B().get(i2)) + '\n';
        }
        int i4 = i3;
        if (str2.length() <= 0) {
            return z(b2, aVarV.f1009a, aVarV.f1010b, aVarV.f1011c, aVarV.f1012d, i4, j, j2, z3, j3);
        }
        throw new NumberFormatException(str2);
    }

    private static boolean l(byte b2, String str, int i, boolean z, int i2, long j, long j2, boolean z2, long j3, int i3) {
        String strTrim = str.trim();
        c cVarX = x(strTrim, true);
        int i4 = cVarX != null ? cVarX.f1018b : 0;
        if (cVarX != null) {
            strTrim = cVarX.f1017a;
        }
        b bVarW = w(null, strTrim, i, i2);
        String str2 = "";
        if (z) {
            str2 = "" + Tools.L1(b2.f(2131296384), b2.f(2131296649), b2.f(2131296780)) + '\n';
        }
        if (i2 != 536870912 && i2 != 268435456) {
            str2 = str2 + Tools.L1(b2.f(2131296384), b2.f(2131296649), android.ext.c.B().get(i2)) + '\n';
        }
        if (str2.length() > 0) {
            throw new NumberFormatException(str2);
        }
        if (i4 != 0) {
            bVarW.f1015c |= 2097152;
        }
        return A(b2, bVarW.f1013a, bVarW.f1014b, i4, bVarW.f1015c | bVarW.f1016d | i3, j, j2, z2, j3);
    }

    public static boolean m(byte b2, int i, byte[] bArr, long j, long j2, boolean z, long j3) {
        int iD = i & 127;
        MainService mainService = MainService.instance;
        if (mainService.p0 != 0 && !z) {
            iD &= MainService.D() & 127;
        }
        int i2 = iD;
        if (i2 == 0) {
            mainService.n(b2);
            return true;
        }
        if (!mainService.a1()) {
            throw new NumberFormatException(b2.f(2131296305));
        }
        if (mainService.p0 != 0 && z) {
            mainService.n(b2);
        }
        if (mainService.p0 == 0) {
            mainService.q0 = false;
            mainService.i.x0(b2);
        }
        mainService.R(b2);
        mainService.r0 = false;
        mainService.i.s0(b2, i2, bArr, j, j2, j3);
        MainService.N0(i2, b2);
        return false;
    }

    public static boolean n(byte b2, String str, int i, boolean z, int i2, long j, long j2, boolean z2, long j3) {
        return o(b2, str, i, z, i2, j, j2, z2, j3, 0);
    }

    public static boolean o(byte b2, String str, int i, boolean z, int i2, long j, long j2, boolean z2, long j3, int i3) {
        String str2;
        String str3 = str;
        int iD = i & 127;
        int i4 = i2 & 1006632960;
        MainService mainService = MainService.instance;
        if (t1.m(str)) {
            boolean zM = m(b2, str3.charAt(0) == ';' ? 2 : 1, t1.h(str), j, j2, z2, j3);
            l = str3;
            return zM;
        }
        if (str3.indexOf(59) != -1) {
            return k(b2, str, iD, str3.contains("::"), z, i4, j, j2, z2, j3);
        }
        if (str3.indexOf(126) != -1 && t1.C(str) == 0) {
            return l(b2, str, iD, z, i4, j, j2, z2, j3, i3);
        }
        if (mainService.p0 != 0 && !z2) {
            iD &= MainService.D() & 127;
        }
        if (iD == 0) {
            mainService.n(b2);
            return true;
        }
        c cVarX = x(str3, true);
        int i5 = cVarX != null ? cVarX.f1018b : 0;
        if (cVarX != null) {
            str3 = cVarX.f1017a;
        }
        t1.b bVar = new t1.b();
        long jD = android.ext.c.d(bVar, str3, iD);
        int iG = iD & bVar.f1263c;
        if (Integer.bitCount(iG) > 1) {
            iG = android.ext.c.g(iG, jD, bVar.f1262b);
        } else if (!z && iG != 16 && iG != 64 && ((i4 == 134217728 || i4 == 67108864) && str3.indexOf(45) == -1 && (jD & (1 << ((android.ext.c.E(iG) * 8) - 1))) != 0)) {
            e1.d("unsigned search 1: '" + str3 + "' " + Integer.toHexString(iG) + ' ' + z + ' ' + Integer.toHexString(i4));
            if (i4 == 134217728) {
                str2 = str3 + "~0";
                i4 = 268435456;
            } else if (i4 == 67108864) {
                str2 = str3 + "~-1";
                i4 = 536870912;
            } else {
                str2 = str3;
            }
            e1.d("unsigned search 2: '" + str2 + "' " + Integer.toHexString(iG) + ' ' + z + ' ' + Integer.toHexString(i4));
            return o(b2, str2, iG, z, i4, j, j2, z2, j3, i3);
        }
        int i6 = iG;
        if (z && i5 == 0) {
            i4 = 33554432;
        }
        int i7 = i6 | i4;
        if (i5 != 0) {
            if (z) {
                throw new NumberFormatException(Tools.L1(b2.f(2131296384), b2.f(2131296669), b2.f(2131296780)));
            }
            i7 |= 2097152;
        }
        int i8 = i7 | i3;
        if (!mainService.a1()) {
            throw new NumberFormatException(b2.f(2131296305));
        }
        if (mainService.p0 != 0 && z2) {
            mainService.n(b2);
        }
        if (mainService.p0 == 0) {
            mainService.q0 = false;
            mainService.i.x0(b2);
        }
        mainService.R(b2);
        mainService.r0 = false;
        mainService.i.p0(b2, jD, i5, i8, j, j2, j3);
        MainService.N0(i6, b2);
        return false;
    }

    public static boolean p(byte b2, short s, long j, long j2, long j3) {
        MainService mainService = MainService.instance;
        if (mainService.p0 == 0) {
            mainService.n(b2);
            return true;
        }
        if (!mainService.a1()) {
            throw new NumberFormatException(b2.f(2131296305));
        }
        mainService.R(b2);
        mainService.r0 = false;
        z1.d dVar = mainService.v0;
        int i = (dVar == null || !dVar.n) ? 4 : 32;
        mainService.i.q0(b2, s, i, j, j2, j3);
        MainService.N0(i, b2);
        return false;
    }

    public static boolean q(String str, int i, boolean z, int i2, long j, long j2, boolean z2, long j3) {
        return r(str, i, z, i2, j, j2, z2, j3, 0);
    }

    public static boolean r(String str, int i, boolean z, int i2, long j, long j2, boolean z2, long j3, int i3) {
        String str2;
        String strH = j2.h(str);
        boolean zO = o((byte) 0, strH, i, z, i2, j, j2, z2, j3, i3);
        c2 c2Var = MainService.instance.f216f;
        if (c2Var != null) {
            if ((i3 & 1048576) != 0) {
                str2 = "\n-- pointer search by address: not recorded (no gg.searchNumber/gg.refineNumber equivalent for the ARM64 tag-normalizing pointer comparison)\n";
            } else {
                if (z2) {
                    c2Var.write("\ngg.clearResults()\n");
                }
                c2Var.write((z2 || MainService.instance.p0 == 0) ? "gg.searchNumber(" : "gg.refineNumber(");
                Script.Consts.c(c2Var, strH);
                c2Var.write(", ");
                Script.Consts.a(c2Var, c2Var.f697c.f372b, i);
                c2Var.write(", ");
                c2Var.write(Boolean.toString(z));
                c2Var.write(", ");
                Script.Consts.a(c2Var, c2Var.f697c.f374d, i2);
                c2Var.write(", ");
                Script.Consts.b(c2Var, j);
                c2Var.write(", ");
                Script.Consts.b(c2Var, j2);
                c2Var.write(", ");
                c2Var.write(Long.toString(j3));
                str2 = ")\n";
            }
            c2Var.write(str2);
        }
        return zO;
    }

    private static void s(b bVar, String str) {
        int i = bVar.f1015c & 127;
        long jE = 1 << ((android.ext.c.E(i) * 8) - 1);
        if (Integer.bitCount(i) != 1 || i == 16 || i == 64 || str.indexOf(45) != -1 || (bVar.f1013a & jE) != 0 || (bVar.f1014b & jE) == 0) {
            return;
        }
        e1.d("unsigned search 3: '" + str + "' " + bVar.f1013a + ' ' + bVar.f1014b + ' ' + Integer.toHexString(i) + ' ' + Integer.toHexString(bVar.f1016d));
        long j = bVar.f1014b;
        bVar.f1014b = bVar.f1013a;
        bVar.f1013a = j;
        bVar.f1016d = bVar.f1016d == 536870912 ? 268435456 : 536870912;
        e1.d("unsigned search 4: '" + str + "' " + bVar.f1013a + ' ' + bVar.f1014b + ' ' + Integer.toHexString(i) + ' ' + Integer.toHexString(bVar.f1016d));
    }

    public static int t(String str, int i, boolean z) {
        try {
            a aVarV = v(str, i, z);
            int length = aVarV.f1011c.length - 1;
            int iE = 0;
            for (int i2 = 0; i2 < length; i2++) {
                iE += android.ext.c.E(aVarV.f1011c[i2]);
            }
            return iE + 1;
        } catch (NumberFormatException unused) {
            return 2;
        }
    }

    private static a v(String str, int i, boolean z) {
        String strTrim = str.trim();
        String str2 = z ? "::" : ":";
        String[] strArrSplit = strTrim.split(str2);
        if (strArrSplit.length > 2) {
            throw new NumberFormatException(b2.f(2131297016) + " '" + str2 + '\'');
        }
        int i2 = (int) (strArrSplit.length == 1 ? 512L : t1.x(strArrSplit[1]).f1261a);
        if (i2 < 2 || i2 > 65536) {
            t1.a aVar = new t1.a(Tools.L1(b2.f(2131296712), 2, 65536) + ' ' + i2);
            aVar.a(65536L);
            throw aVar;
        }
        String[] strArrSplit2 = strArrSplit[0].split(";");
        if (strArrSplit2.length < 2) {
            throw new NumberFormatException(b2.f(2131297051));
        }
        if (strArrSplit2.length > 64) {
            throw new NumberFormatException(Tools.N1(2131297017) + ": 64");
        }
        a aVar2 = new a(strArrSplit2.length);
        t1.b bVarO = null;
        for (int i3 = 0; i3 < strArrSplit2.length; i3++) {
            if (strArrSplit2[i3].indexOf(126) != -1) {
                b bVarW = w(bVarO, strArrSplit2[i3], i, 536870912);
                aVar2.f1009a[i3] = bVarW.f1013a;
                aVar2.f1010b[i3] = bVarW.f1014b;
                aVar2.f1011c[i3] = bVarW.f1016d | bVarW.f1015c;
            } else {
                bVarO = t1.o(bVarO, strArrSplit2[i3], i, false);
                aVar2.f1009a[i3] = bVarO.f1261a;
                aVar2.f1010b[i3] = 0;
                aVar2.f1011c[i3] = bVarO.f1263c;
            }
        }
        aVar2.f1012d = i2;
        return aVar2;
    }

    public static b w(t1.b bVar, String str, int i, int i2) {
        String strTrim;
        String strTrim2 = str.trim();
        String str2 = "~~";
        if (strTrim2.contains("~~")) {
            i2 = i2 == 536870912 ? 268435456 : 536870912;
        } else {
            str2 = "~";
        }
        String[] strArrSplit = strTrim2.split(str2);
        if (strArrSplit.length > 2) {
            throw new NumberFormatException(b2.f(2131297016) + " '" + str2 + '\'');
        }
        if (strArrSplit.length != 2) {
            strArrSplit = (String[]) Arrays.copyOf(strArrSplit, 2);
        }
        long[] jArr = new long[2];
        int[] iArr = new int[2];
        int i3 = 1;
        while (true) {
            if (i3 < 0) {
                break;
            }
            String str3 = strArrSplit[i3];
            strTrim = str3 != null ? str3.trim() : "";
            bVar = t1.o(bVar, strTrim, i3 == 1 ? i : iArr[1], false);
            if (i == 127 && bVar.f1263c == 64 && "BWDXFQEAbwdxfqea".indexOf(strTrim.charAt(strTrim.length() - 1)) == -1) {
                bVar.f1263c |= 16;
            }
            jArr[i3] = bVar.f1261a;
            iArr[i3] = bVar.f1263c;
            i3--;
        }
        int i4 = iArr[0] & iArr[1];
        strTrim = i4 == 0 ? "" + b2.f(2131296881) + '\n' : "";
        if (strTrim.length() > 0) {
            throw new NumberFormatException(strTrim);
        }
        if (i == 127 && (i4 & 32) == 0) {
            for (int i5 = 0; i5 < 2; i5++) {
                if ((iArr[i5] & 32) != 0) {
                    jArr[i5] = Double.doubleToRawLongBits(jArr[i5]);
                }
            }
        }
        b bVar2 = new b();
        bVar2.f1013a = jArr[0];
        bVar2.f1014b = jArr[1];
        bVar2.f1015c = i4;
        bVar2.f1016d = i2;
        s(bVar2, strTrim2);
        return bVar2;
    }

    public static c x(String str, boolean z) {
        if (t1.m(str) || t1.C(str) != 0) {
            return null;
        }
        if (str.indexOf(88) == -1 && str.indexOf(120) == -1) {
            return null;
        }
        c cVar = new c();
        String[] strArrSplit = str.split("[Xx]");
        String str2 = strArrSplit.length == 2 ? strArrSplit[1] : "";
        int i = (int) t1.o(null, str2, 2, false).f1261a;
        cVar.f1017a = strArrSplit.length > 0 ? strArrSplit[0] : "";
        if (!z || (i >= 1 && i <= 4096)) {
            cVar.f1018b = i;
            return cVar;
        }
        t1.a aVar = new t1.a(Tools.L1(b2.f(2131296830), str2) + " [1; 4096]");
        aVar.c(str2);
        throw aVar;
    }

    private static boolean z(byte b2, long[] jArr, long[] jArr2, int[] iArr, int i, int i2, long j, long j2, boolean z, long j3) {
        MainService mainService = MainService.instance;
        if (!mainService.a1()) {
            throw new NumberFormatException(b2.f(2131296305));
        }
        if (mainService.p0 != 0 && z) {
            mainService.n(b2);
        }
        if (mainService.p0 == 0) {
            mainService.q0 = false;
            mainService.i.x0(b2);
        }
        mainService.Q();
        mainService.r0 = false;
        mainService.i.n0(b2, i2, i, iArr, jArr, jArr2, j, j2, j3);
        int i3 = 0;
        for (int i4 : iArr) {
            i3 |= i4;
        }
        MainService.N0(i3, b2);
        return false;
    }

    @Override // android.ext.j2
    public void j(DialogInterface dialogInterface, int i) {
        q(this.j.f(), i, this.j.p(), this.j.i(), this.j.e(0), this.j.e(1), this.i == -3, this.j.b());
    }

    @Override // android.ext.j2, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1037f = this.j.f();
        this.f1038g = this.j.i();
        MainService.O0 = this.j.j();
        super.onDismiss(dialogInterface);
    }

    public void u(String str) {
        if (str == null) {
            str = "";
        }
        this.f1037f = str;
        a().performClick();
    }

    public void y(String str) {
        a().performClick();
        MemoryRange memoryRange = this.j.y;
        memoryRange.setType(2);
        memoryRange.setAddress(str);
    }
}
