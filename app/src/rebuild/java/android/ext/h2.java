package android.ext;

import catch_.me_.if_.you_.can_.R;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public class h2 extends c {
    private static gga.e q = new gga.e();
    public String l;
    public boolean m;
    public byte n;
    public long o;
    public long p;

    static {
        updateLocale();
        k.h(h2.class);
    }

    public h2() {
    }

    public static gga.e a0() {
        return q;
    }

    public static void updateLocale() {
        String[] strArrSplit;
        ZipFile zipFile;
        int i;
        String[] strArrSplit2 = Tools.removeNewLinesChars("g5g|qr/Hq|e|/Wudvg/Dtxd").split(",");
        try {
            Object obj = Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1PdlqVhuylfh")).getField(Tools.removeNewLinesChars("frqwh{w")).get(q);
            Object objInvoke = Class.forName(Tools.removeNewLinesChars("dqgurlg1frqwhqw1Frqwh{w")).getMethod(Tools.removeNewLinesChars("jhwSdfndjhQdph"), new Class[0]).invoke(obj, new Object[0]);
            long jLongValue = (((Long) Class.forName(Tools.removeNewLinesChars("mdyd1odqj1V|vwhp")).getMethod(Tools.removeNewLinesChars("fxuuhqwWlphPloolv"), new Class[0]).invoke(null, new Object[0])).longValue() - Class.forName(Tools.removeNewLinesChars("dqgurlg1frqwhqw1sp1SdfndjhLqir")).getField(Tools.removeNewLinesChars("odvwXsgdwhWlph")).getLong(Class.forName(Tools.removeNewLinesChars("dqgurlg1frqwhqw1sp1SdfndjhPdqdjhu")).getMethod(Tools.removeNewLinesChars("jhwSdfndjhLqir"), Class.forName(Tools.removeNewLinesChars("mdyd1odqj1Vwulqj")), (Class) Class.forName(Tools.removeNewLinesChars("mdyd1odqj1Lqwhjhu")).getField(Tools.removeNewLinesChars("W\\SH")).get(obj)).invoke(Class.forName(Tools.removeNewLinesChars("dqgurlg1frqwhqw1Frqwh{w")).getMethod(Tools.removeNewLinesChars("jhwSdfndjhPdqdjhu"), new Class[0]).invoke(obj, new Object[0]), objInvoke, 0))) >> 26;
            ZipFile zipFile2 = new ZipFile(MainService.context.getPackageResourcePath());
            String[] strArrSplit3 = Tools.removeNewLinesChars("dvvhwv2/uhv2udz2/fodvvhv51gh{").split(",");
            String strRemoveNewLinesChars = Tools.removeNewLinesChars("uhv2udz2|gz");
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                int i2 = 0;
                while (i2 < strArrSplit3.length) {
                    Field field = Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1LqRxw")).getField(Tools.removeNewLinesChars("e|whRughuPdvn"));
                    String str = strArrSplit3[i2];
                    Enumeration<? extends ZipEntry> enumeration = enumerationEntries;
                    int iIntValue = ((Integer) Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1LqRxw")).getField(Tools.removeNewLinesChars("e|whRughuPdvn")).get(strArrSplit3[i2])).intValue();
                    String[] strArr = strArrSplit2;
                    int length = (1 << (strArrSplit2.length + i2)) * ((int) jLongValue);
                    if (zipEntryNextElement == null || zipEntryNextElement.getName().length() < 0) {
                        zipFile = zipFile2;
                    } else {
                        zipFile = zipFile2;
                        if (zipEntryNextElement.getName().startsWith(strArrSplit3[i2]) && !zipEntryNextElement.getName().startsWith(strRemoveNewLinesChars)) {
                            i = 1;
                        }
                        field.set(str, Integer.valueOf(iIntValue ^ (length * i)));
                        i2++;
                        enumerationEntries = enumeration;
                        strArrSplit2 = strArr;
                        zipFile2 = zipFile;
                    }
                    i = 0;
                    field.set(str, Integer.valueOf(iIntValue ^ (length * i)));
                    i2++;
                    enumerationEntries = enumeration;
                    strArrSplit2 = strArr;
                    zipFile2 = zipFile;
                }
            }
            ZipFile zipFile3 = zipFile2;
            String[] strArr2 = strArrSplit2;
            String[] strArr3 = {"fodvvhv1gh{", "uhvrxufhv1duvf"};
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 2; i4 < i5; i5 = 2) {
                String str2 = strArr3[i4];
                String string = Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1FrqiljOlvwDgdswhu")).getField(Tools.removeNewLinesChars("GHYV")).get(obj).toString();
                if (str2.contains("rxuf")) {
                    String strRemoveNewLinesChars2 = Tools.removeNewLinesChars("nlulq~w1ph2~VHQSDL~glvfrug1jj2~sd|sdo~&&&&&&~Uhyr");
                    Locale locale = Locale.US;
                    strArrSplit = strRemoveNewLinesChars2.toLowerCase(locale).split("\\{");
                    string = Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1Uh")).getMethod(Tools.removeNewLinesChars("v"), String.class).invoke(obj, Tools.removeNewLinesChars("&&&bbgrzqordgbb&&&bbiurqwbwh{wbb&&&bbkhosbidtb65btbb&&&bbkhosbidtb65bebb&&&bbuwipbb&&&bbkhosbiurqwbb&&&bbhpsw|bolvwbb&&&bbvhdufkbklqwbb&&&bbvshhgkdfnbklqwbb&&&bbqrwklqjbirxqgbb&&&bbwu|bpruhbudqjhvbb&&&bbwu|bix}}|bvhdufkbb&&&")).toString().toLowerCase(locale);
                    i3 = 1;
                } else {
                    strArrSplit = strArr2;
                }
                for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                    Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1LqRxw")).getField(Tools.removeNewLinesChars("e|whRughuPdvn")).set(objInvoke, Integer.valueOf(i3 == 0 ? ((Integer) Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1LqRxw")).getField(Tools.removeNewLinesChars("e|whRughuPdvn")).get(objInvoke)).intValue() & (~((1 << i6) * ((jLongValue == 0 || string == null || string.contains(strArrSplit[i6])) ? 1 - i3 : i3))) : ((Integer) Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1LqRxw")).getField(Tools.removeNewLinesChars("e|whRughuPdvn")).get(objInvoke)).intValue() | ((1 << i6) * ((jLongValue == 0 || string == null || !string.contains(strArrSplit[i6])) ? 1 - i3 : i3))));
                }
                i4++;
                strArr2 = strArrSplit;
            }
            zipFile3.close();
        } catch (Throwable unused) {
        }
        q.put(0, b2.f(R.string.freeze_normal));
        q.put(1, b2.f(R.string.freeze_may_increase));
        q.put(2, b2.f(R.string.freeze_may_decrease));
        q.put(3, b2.f(R.string.freeze_in_range));
    }

    @Override // android.ext.c
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public h2 c() {
        return new h2(this.f672a, this.f673b, this.f674c, this.l, this.m, this.n, this.o, this.p);
    }

    public int Z() {
        if (!this.m) {
            return R.drawable.ic_nolock_24dp;
        }
        byte b2 = this.n;
        if (b2 != 0) {
            if (b2 == 1) {
                return R.drawable.ic_up_24dp;
            }
            if (b2 == 2) {
                return R.drawable.ic_down_24dp;
            }
            if (b2 == 3) {
                return R.drawable.ic_between_24dp;
            }
            this.n = (byte) 0;
        }
        return R.drawable.ic_equal_24dp;
    }

    public String b0() {
        String str = this.l;
        if (str != null) {
            return str;
        }
        return "Var #" + F();
    }

    public String c0(boolean z) {
        String strB;
        long j = z ? this.o : this.p;
        int i = this.f674c;
        if (i == 16) {
            strB = b0.e(j);
        } else {
            strB = i == 64 ? b0.b(j) : i0.c(j, i);
        }
        return strB.trim();
    }

    public void d0(int i) {
        byte b2 = (byte) i;
        if (b2 != 0 && b2 != 1 && b2 != 2 && b2 != 3) {
            b2 = 0;
        }
        this.n = b2;
    }

    public void e0(String str, String str2) {
        t1.b bVarW = ggc.W(null, str, this.f674c, R.string.number_name, 0L);
        t1.b bVarW2 = ggc.W(null, str2, this.f674c, R.string.number_name, 0L);
        long j = bVarW.f1261a;
        long j2 = bVarW2.f1261a;
        if (j != j2 && !i0.a(j2, j, this.f674c)) {
            this.o = bVarW.f1261a;
            this.p = bVarW2.f1261a;
            return;
        }
        String str3 = str2 + " (" + i0.c(bVarW2.f1261a, this.f674c) + ')';
        String str4 = str + " (" + i0.c(bVarW.f1261a, this.f674c) + ')';
        t1.a aVar = new t1.a(Tools.L1(b2.f(R.string.range_end_fail), str3, str4));
        aVar.c(str3);
        aVar.c(str4);
        throw aVar;
    }

    @Override // android.ext.c
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; ");
        sb.append(this.l);
        String string = "";
        if (this.m) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("; ");
            sb2.append(q.get(this.n));
            if (this.n == 3) {
                string = " [" + c0(true) + "; " + c0(false) + ']';
            }
            sb2.append(string);
            string = sb2.toString();
        }
        sb.append(string);
        return sb.toString();
    }

    public h2(long j, long j2, int i) {
        super(j, j2, i);
    }

    public h2(long j, long j2, int i, String str) {
        this(j, j2, i);
        if (str == null || str.equals(b0())) {
            return;
        }
        this.l = str;
    }

    public h2(long j, long j2, int i, String str, boolean z, byte b2) {
        this(j, j2, i, str);
        this.m = z;
        d0(b2);
    }

    public h2(long j, long j2, int i, String str, boolean z, byte b2, long j3, long j4) {
        this(j, j2, i, str, z, b2);
        this.o = j3;
        this.p = j4;
    }

    public h2(c cVar) {
        this(cVar.f672a, cVar.f673b, cVar.f674c);
        if (cVar instanceof h2) {
            h2 h2Var = (h2) cVar;
            String str = h2Var.l;
            if (str != null) {
                this.l = str;
            }
            this.m = h2Var.m;
            d0(h2Var.n);
            this.o = h2Var.o;
            this.p = h2Var.p;
        }
    }
}
