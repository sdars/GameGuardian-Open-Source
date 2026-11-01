package android.ext;

import android.text.Editable;
import catch_.me_.if_.you_.can_.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f1251a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char f1252b = '.';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f1253c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Charset f1254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Charset f1255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int[] f1256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Pattern f1257g;

    static class a extends NumberFormatException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList f1258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1259b;

        /* JADX INFO: renamed from: android.ext.t1$a$a, reason: collision with other inner class name */
        class C0021a implements Comparator {
            C0021a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        }

        public a(String str) {
            super(str);
            this.f1258a = null;
            this.f1259b = null;
        }

        void a(long j) {
            c(Tools.L1(b2.g("__d__"), Long.valueOf(j)));
        }

        void b(Object obj) {
            c(Tools.L1(b2.g("__d__"), obj));
        }

        void c(String str) {
            ArrayList arrayList = this.f1258a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1258a = arrayList;
            }
            arrayList.add(str);
        }

        void d() {
            String message;
            boolean z;
            if (this.f1259b == null && (message = getMessage()) != null) {
                int iIndexOf = message.indexOf(b2.f(R.string.locale_ui));
                if (iIndexOf > 0) {
                    message = message.substring(0, iIndexOf);
                    z = true;
                } else {
                    z = false;
                }
                ArrayList<String> arrayList = this.f1258a;
                if (arrayList != null) {
                    Collections.sort(arrayList, new C0021a());
                    for (String str : arrayList) {
                        if (str != null) {
                            String strE3 = Script.E3(str);
                            if (!str.equals(strE3) && message.indexOf(str) >= 0) {
                                message = message.replace(str, strE3);
                                z = true;
                            }
                        }
                    }
                }
                if (iIndexOf > 0) {
                    message = message + b2.f(R.string.locale_script) + " (en_US):\n" + Tools.L1(t1.z(R.string.locale_desc), '.', ',');
                }
                if (z) {
                    this.f1259b = message;
                }
            }
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String str = this.f1259b;
            return str != null ? str : super.getMessage();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1261a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1262b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1263c = 0;

        public String toString() {
            return super.toString() + ": " + this.f1261a + " 0x" + Integer.toHexString(this.f1263c);
        }
    }

    static {
        updateLocale();
        k.h(t1.class);
        f1254d = null;
        f1255e = null;
        f1256f = null;
        f1257g = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    private static void A(b bVar) {
        int[] iArr = f1256f;
        if (iArr == null) {
            iArr = new int[]{1, c.E(1), 2, c.E(2), 4, c.E(4), 8, c.E(8)};
            f1256f = iArr;
        }
        int length = iArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 2) {
            int i3 = iArr[i2 + 1];
            if (bVar.f1262b) {
                int i4 = (i3 * 8) - 1;
                if ((bVar.f1261a >> i4) == ((-1) >> i4)) {
                    i |= iArr[i2];
                }
            } else if (i3 == 8 || (bVar.f1261a >> (i3 * 8)) == 0) {
                i |= iArr[i2];
            }
        }
        bVar.f1263c = i | 32;
    }

    public static long B(String str) {
        long jCharAt = 0;
        if (str.length() < 2) {
            return 0L;
        }
        if (str.charAt(0) == ';') {
            int length = str.length();
            if (length > 5) {
                length = 5;
            }
            for (int i = 1; i < length; i++) {
                jCharAt |= (((long) str.charAt(i)) & 65535) << ((i - 1) * 16);
            }
        } else {
            byte[] bArrH = h(str);
            int length2 = bArrH.length;
            if (length2 > 8) {
                length2 = 8;
            }
            for (int i2 = 0; i2 < length2; i2++) {
                jCharAt |= (((long) bArrH[i2]) & 255) << (i2 * 8);
            }
        }
        return jCharAt;
    }

    public static int C(String str) {
        if (str.length() > 2 && str.charAt(0) == '~') {
            char cCharAt = str.charAt(1);
            if (cCharAt == 'A') {
                return 4;
            }
            if (cCharAt != 'T') {
                if (cCharAt == 'a') {
                    return 4;
                }
                if (cCharAt != 't') {
                }
            }
            return 2;
        }
        return 0;
    }

    private static byte[] a(byte[] bArr, String str) {
        String strReplace = str.replace(" ", "").replace("\t", "").replace("\r", "").replace("\n", "");
        if (strReplace.length() < 2) {
            return bArr;
        }
        int length = strReplace.length() & (-2);
        int length2 = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, (length / 2) + length2);
        int i = 0;
        while (i < length) {
            int i2 = i + 2;
            bArrCopyOf[(i / 2) + length2] = (byte) Integer.parseInt(strReplace.substring(i, i2), 16);
            i = i2;
        }
        return bArrCopyOf;
    }

    private static String b(String str, boolean z) {
        if (str == null) {
            throw new NumberFormatException(z(R.string.input_number));
        }
        if (m(str) || C(str) != 0) {
            return str;
        }
        String lowerCase = str.trim().toLowerCase(Locale.US);
        if (z) {
            lowerCase = e(lowerCase);
        }
        if (lowerCase.length() == 0) {
            throw new NumberFormatException(z(R.string.input_number));
        }
        if ((Config.B & 4096) == 0) {
            return lowerCase;
        }
        Pattern patternCompile = f1257g;
        if (patternCompile == null) {
            try {
                patternCompile = Pattern.compile("[^\\p{XDigit}" + f1252b + f1251a + ".hrwxqHRWXQ~?*^$:;-]+");
                f1257g = patternCompile;
            } catch (Throwable th) {
                e1.a(th);
            }
        }
        if (patternCompile == null) {
            return lowerCase;
        }
        try {
            String strReplaceAll = patternCompile.matcher(lowerCase).replaceAll("");
            if (strReplaceAll.equals(lowerCase)) {
                return lowerCase;
            }
            e1.d("strip: '" + patternCompile.pattern() + "': '" + lowerCase + "' -> '" + strReplaceAll + '\'');
            return strReplaceAll;
        } catch (Throwable th2) {
            e1.a(th2);
            return lowerCase;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    private static b c(b bVar, int i, int i2) {
        long jFloatToRawIntBits;
        int i3 = i2 & 127;
        if (i3 == 1 || i3 == 2 || i3 == 4 || i3 == 8) {
            bVar.f1261a = i;
            bVar.f1263c = i3;
        } else {
            int i4 = 16;
            if (i3 == 16) {
                jFloatToRawIntBits = Float.floatToRawIntBits(i);
                if (jFloatToRawIntBits < 0) {
                    jFloatToRawIntBits = (jFloatToRawIntBits & 2147483647L) + 2147483648L;
                }
            } else if (i3 != 32) {
                i4 = 64;
                if (i3 != 64) {
                    if (i3 != 127) {
                        e1.p("Unknown flags: " + i3 + " we use Auto parsing");
                    }
                    bVar.f1261a = i;
                    bVar.f1263c = 127;
                } else {
                    jFloatToRawIntBits = Double.doubleToRawLongBits(i);
                }
            } else {
                bVar.f1261a = i;
                bVar.f1263c = i3;
            }
            bVar.f1261a = jFloatToRawIntBits;
            bVar.f1263c = i4;
        }
        bVar.f1262b = i < 0;
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r3 != 'q') goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(String str) {
        String str2;
        if (str.length() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append(cCharAt);
        if (cCharAt == ':') {
            sb.append(b2.f(R.string.text));
            str2 = " UTF-8";
        } else {
            if (cCharAt != ';') {
                if (cCharAt == 'H') {
                    str2 = " DF 59 37 5F 00";
                } else {
                    if (cCharAt != 'Q') {
                        if (cCharAt == 'h') {
                            str2 = " DF 59 37 5F 00";
                        }
                    }
                    sb.append(" DF 59 '");
                    sb.append(b2.f(R.string.text));
                    sb.append(" UTF-8' 37 5F \"");
                    sb.append(b2.f(R.string.text));
                    str2 = " UTF-16LE\" 48 00";
                }
                return sb.toString();
            }
            sb.append(b2.f(R.string.text));
            str2 = " UTF-16LE";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String e(String str) {
        String strReplace = str.replace(" ", "").replace(" ", "").replace(f1251a, "");
        return f1253c ? strReplace.replace(f1252b, '.') : strReplace;
    }

    public static String f(String str) {
        String strReplace = str.replace(" ", "").replace(" ", "").replace(",", "");
        return f1253c ? strReplace.replace('.', f1252b) : strReplace;
    }

    public static byte[] g(long j) {
        byte[] bArr = new byte[9];
        int i = -1;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b2 = (byte) (255 & j);
            bArr[i2] = b2;
            if (b2 != 0 && i < i2) {
                i = i2;
            }
            j >>= 8;
        }
        bArr[8] = (byte) i;
        return bArr;
    }

    public static byte[] h(CharSequence charSequence) {
        boolean z;
        String strSubstring;
        if (charSequence.length() < 1) {
            return d.b.f1513c;
        }
        char cCharAt = charSequence.charAt(0);
        byte[] bArrCopyOf = d.b.f1513c;
        boolean z2 = !(charSequence instanceof String) && (charSequence instanceof Editable);
        if (cCharAt != ';') {
            if (cCharAt != 'H') {
                if (cCharAt != 'Q') {
                    if (cCharAt != 'h') {
                        z = cCharAt == 'q';
                    }
                }
                int i = 1;
                char c2 = 0;
                int i2 = 1;
                while (i < charSequence.length()) {
                    char cCharAt2 = charSequence.charAt(i);
                    if (c2 != 0 ? cCharAt2 != c2 : !(cCharAt2 == '\'' || cCharAt2 == '\"')) {
                        strSubstring = i == charSequence.length() - 1 ? charSequence.toString().substring(i2) : null;
                        cCharAt2 = c2;
                    } else {
                        strSubstring = i2 != i ? charSequence.toString().substring(i2, i) : null;
                        if (c2 != 0) {
                            cCharAt2 = 0;
                        }
                        i2 = i + 1;
                    }
                    if (strSubstring != null && strSubstring.length() > 0) {
                        if (c2 != 0) {
                            byte[] bytes = strSubstring.getBytes(i(c2 == '\"'));
                            if (z2) {
                                String strTrim = InOut.b(bytes, 0, bytes.length).trim();
                                ((Editable) charSequence).replace((i - strSubstring.length()) - 1, i + 1, strTrim);
                                int length = strTrim.length() - (strSubstring.length() + 2);
                                i += length;
                                i2 += length;
                            } else {
                                int length2 = bArrCopyOf.length;
                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bytes.length + length2);
                                System.arraycopy(bytes, 0, bArrCopyOf, length2, bytes.length);
                            }
                        } else if (!z2) {
                            bArrCopyOf = a(bArrCopyOf, strSubstring);
                        }
                    }
                    i++;
                    c2 = cCharAt2;
                }
                return bArrCopyOf;
            }
            return a(bArrCopyOf, charSequence.toString().substring(1));
        }
        byte[] bytes2 = charSequence.toString().substring(1).getBytes(i(z));
        if (z2) {
            ((Editable) charSequence).replace(1, charSequence.length(), ' ' + InOut.b(bytes2, 0, bytes2.length).trim());
        }
        return bytes2;
    }

    public static Charset i(boolean z) {
        Charset charset = z ? f1255e : f1254d;
        if (charset != null) {
            return charset;
        }
        if (z) {
            Charset charset2 = StandardCharsets.UTF_16LE;
            f1255e = charset2;
            return charset2;
        }
        Charset charset3 = StandardCharsets.UTF_8;
        f1254d = charset3;
        return charset3;
    }

    private static NumberFormatException j(String str, String str2, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(z(R.string.invalid_number));
        sb.append(" '");
        sb.append(str2);
        sb.append("'.");
        if (i == 10 && str.matches(".*[A-Fa-f]+.*")) {
            sb.append("\n\n");
            sb.append(z(R.string.forgot_h));
        }
        if (z && str.indexOf(f1252b) != -1) {
            sb.append("\n\n");
            sb.append(z(R.string.integer_type));
        }
        sb.append("\n\n");
        sb.append(z(R.string.locale_ui));
        sb.append(" (");
        sb.append(k.b());
        sb.append("):\n");
        sb.append(Tools.L1(z(R.string.locale_desc), Character.valueOf(f1252b), f1251a));
        a aVar = new a(sb.toString());
        aVar.c("'" + str2 + "'");
        return aVar;
    }

    public static Object[] k() {
        Object objSubtract;
        try {
            BigInteger bigInteger = new BigInteger(Long.toString(Long.MAX_VALUE));
            BigInteger bigInteger2 = BigInteger.ONE;
            objSubtract = bigInteger.add(bigInteger2).shiftLeft(1).subtract(bigInteger2);
        } catch (ArithmeticException e2) {
            e1.l("Error get possible range for long as BigInteger", e2);
            objSubtract = Long.MAX_VALUE;
        }
        return new Object[]{(byte) -128, 255L, Short.MIN_VALUE, 65535L, Integer.MIN_VALUE, 4294967295L, Long.MIN_VALUE, objSubtract};
    }

    public static char l(String str) {
        if (str.length() > 0) {
            char cCharAt = str.charAt(0);
            if (cCharAt == ':') {
                return ';';
            }
            if (cCharAt == ';') {
                return ':';
            }
            if (cCharAt == 'Q' || cCharAt == 'q') {
                return str.indexOf(34) >= 0 ? '\'' : '\"';
            }
        }
        return (char) 0;
    }

    public static boolean m(String str) {
        char cCharAt;
        return str.length() > 0 && ((cCharAt = str.charAt(0)) == ':' || cCharAt == ';' || cCharAt == 'H' || cCharAt == 'Q' || cCharAt == 'h' || cCharAt == 'q');
    }

    public static boolean n(String str) {
        char cCharAt;
        return str.length() > 0 && ((cCharAt = str.charAt(0)) == ':' || cCharAt == ';' || cCharAt == 'Q' || cCharAt == 'q' || cCharAt == '~');
    }

    public static b o(b bVar, String str, int i, boolean z) {
        return p(bVar, str, i, z, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0177  */
    /* JADX WARN: Code duplicated, block: B:104:0x0179  */
    /* JADX WARN: Code duplicated, block: B:107:0x0180  */
    /* JADX WARN: Code duplicated, block: B:109:0x0187  */
    /* JADX WARN: Code duplicated, block: B:111:0x01be  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:121:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    /* JADX WARN: Code duplicated, block: B:76:0x0119  */
    /* JADX WARN: Code duplicated, block: B:78:0x011d  */
    /* JADX WARN: Instruction removed from duplicated block: B:111:0x01be, please report this as an issue */
    public static b p(b bVar, String str, int i, boolean z, long j) {
        int iC;
        StringBuilder sb;
        int iN;
        int i2;
        b bVarY;
        int i3;
        Object[] objArrK;
        int i4;
        int i5;
        String strF;
        a aVar;
        String str2;
        b bVar2 = bVar == null ? new b() : bVar;
        int length = str.length();
        int i6 = 3;
        if (length == 1 || length == 2 || (length == 3 && str.charAt(0) == '-')) {
            int i7 = str.charAt(0) == '-' ? 1 : 0;
            int i8 = length - 1;
            char cCharAt = str.charAt(i8);
            if ('0' <= cCharAt && cCharAt <= '9') {
                char cCharAt2 = i8 <= i7 ? '0' : str.charAt(length - 2);
                if ('0' <= cCharAt2 && cCharAt2 <= '9') {
                    int i9 = ((cCharAt2 * '\n') + cCharAt) - 528;
                    if (i7 == 1) {
                        i9 = -i9;
                    }
                    return c(bVar2, i9, i);
                }
            }
        }
        String strB = b(str, true);
        if (m(strB)) {
            iC = 127;
        } else {
            iC = C(strB);
            if (iC != 0) {
                char cCharAt3 = strB.charAt(1);
                if (cCharAt3 == 'T') {
                    String strTrim = strB.substring(2).trim();
                    sb = new StringBuilder();
                    iN = n.p(null, j, strTrim);
                } else if (cCharAt3 == 'A') {
                    if (strB.charAt(2) == '8') {
                        String strTrim2 = strB.substring(3).trim();
                        sb = new StringBuilder();
                        iN = m.k(null, null, j, strTrim2);
                    } else {
                        String strTrim3 = strB.substring(2).trim();
                        sb = new StringBuilder();
                        iN = n.n(null, j, strTrim3);
                    }
                }
                sb.append(Integer.toHexString(iN).toUpperCase(Locale.US));
                sb.append('h');
                strB = sb.toString();
            } else {
                char cCharAt4 = strB.length() > 0 ? strB.charAt(strB.length() - 1) : '0';
                if (cCharAt4 == 'a') {
                    if (iC == 0) {
                        iC = 127;
                    }
                    if (z) {
                        throw j(strB, str, 0, false);
                    }
                    strB = strB.substring(0, strB.length() - 1);
                } else {
                    if (cCharAt4 != 'b') {
                        if (cCharAt4 != 'q') {
                            if (cCharAt4 != 'w') {
                                if (cCharAt4 != 'x') {
                                    switch (cCharAt4) {
                                        case 'd':
                                            break;
                                        case 'e':
                                            break;
                                        case 'f':
                                            break;
                                        default:
                                            iC = i & 127;
                                            break;
                                    }
                                } else if (iC == 0) {
                                    iC = 8;
                                }
                                if (iC == 0) {
                                    iC = 16;
                                }
                                if (iC == 0) {
                                    iC = 32;
                                }
                            }
                            if (iC == 0) {
                                iC = 4;
                            }
                            if (iC == 0) {
                                iC = 8;
                            }
                            if (iC == 0) {
                                iC = 16;
                            }
                            if (iC == 0) {
                                iC = 32;
                            }
                        } else if (iC == 0) {
                            iC = 32;
                        }
                        if (iC == 0) {
                            iC = 64;
                        }
                        if (iC == 0) {
                            iC = 127;
                        }
                        if (z) {
                            throw j(strB, str, 0, false);
                        }
                        strB = strB.substring(0, strB.length() - 1);
                    } else if (iC == 0) {
                        iC = 1;
                    }
                    if (iC == 0) {
                        iC = 2;
                    }
                    if (iC == 0) {
                        iC = 4;
                    }
                    if (iC == 0) {
                        iC = 8;
                    }
                    if (iC == 0) {
                        iC = 16;
                    }
                    if (iC == 0) {
                        iC = 32;
                    }
                    if (iC == 0) {
                        iC = 64;
                    }
                    if (iC == 0) {
                        iC = 127;
                    }
                    if (z) {
                        throw j(strB, str, 0, false);
                    }
                    strB = strB.substring(0, strB.length() - 1);
                }
            }
        }
        if (iC != 1) {
            if (iC == 2) {
                i2 = 3;
            } else if (iC == 4 || iC == 8) {
                i2 = 3;
                if (i2 == 3) {
                    i6 = 2;
                } else {
                    i6 = i2;
                }
            } else {
                if (iC == 16) {
                    return w(bVar2, strB, str);
                }
                if (iC != 32 && iC != 36) {
                    if (iC == 64) {
                        return v(bVar2, strB, str);
                    }
                    if (iC != 127) {
                        e1.p("Unknown flags: " + iC + " we use Auto parsing");
                    }
                    return q(bVar2, strB, str);
                }
            }
            bVarY = y(bVar2, strB, str);
            if (iC != 0) {
                i3 = bVarY.f1263c & iC;
                bVarY.f1263c = i3;
                if (i3 == 0) {
                    objArrK = k();
                    i4 = i6 * 2;
                    i5 = i4 + 1;
                    strF = t2.f(b2.g(" [__d__; __d__]."), objArrK[i4], objArrK[i5]);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(t2.f(z(R.string.number_out_of_range), str));
                    if (strF == null) {
                        str2 = " possibleRange for " + i6;
                    } else {
                        str2 = strF;
                    }
                    sb2.append(str2);
                    aVar = new a(sb2.toString());
                    aVar.c(str);
                    if (strF != null) {
                        throw aVar;
                    }
                    aVar.b(objArrK[i4]);
                    aVar.b(objArrK[i5]);
                    throw aVar;
                }
            }
            return bVarY;
        }
        i2 = 0;
        if (i2 == 3) {
            i2 = 1;
        }
        if (i2 == 3) {
            i6 = 2;
        } else {
            i6 = i2;
        }
        bVarY = y(bVar2, strB, str);
        if (iC != 0) {
            i3 = bVarY.f1263c & iC;
            bVarY.f1263c = i3;
            if (i3 == 0) {
                objArrK = k();
                i4 = i6 * 2;
                i5 = i4 + 1;
                strF = t2.f(b2.g(" [__d__; __d__]."), objArrK[i4], objArrK[i5]);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(t2.f(z(R.string.number_out_of_range), str));
                if (strF == null) {
                    str2 = " possibleRange for " + i6;
                } else {
                    str2 = strF;
                }
                sb3.append(str2);
                aVar = new a(sb3.toString());
                aVar.c(str);
                if (strF != null) {
                    throw aVar;
                }
                aVar.b(objArrK[i4]);
                aVar.b(objArrK[i5]);
                throw aVar;
            }
        }
        return bVarY;
    }

    private static b q(b bVar, String str, String str2) {
        String strB = b(str, false);
        try {
            b bVarY = y(bVar, strB, str2);
            bVarY.f1263c |= 80;
            return bVarY;
        } catch (NumberFormatException e2) {
            try {
                b bVarV = v(bVar, strB, str2);
                long j = bVarV.f1261a;
                try {
                    bVarV = w(bVarV, strB, str2);
                    bVarV.f1261a = j;
                    bVarV.f1263c = 80;
                    return bVarV;
                } catch (NumberFormatException unused) {
                    return bVarV;
                }
            } catch (NumberFormatException e3) {
                NumberFormatException numberFormatExceptionJ = j(strB, str2, 0, false);
                numberFormatExceptionJ.initCause(e3);
                numberFormatExceptionJ.addSuppressed(e2);
                throw numberFormatExceptionJ;
            }
        }
    }

    public static long r(String str, int i) {
        return s(b(str, true), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long s(String str, int i) {
        String strB = b(str, false);
        try {
            return Long.parseLong(strB, i);
        } catch (NumberFormatException e2) {
            try {
                BigInteger bigInteger = new BigInteger(strB, i);
                if (bigInteger.bitLength() <= 64) {
                    return bigInteger.longValue();
                }
                throw e2;
            } catch (ArithmeticException e3) {
                e1.s("Error parse " + strB + " with " + i + " as BigInteger", e3);
                if (i != 10) {
                    throw e2;
                }
                try {
                    return (long) Double.parseDouble(strB);
                } catch (NumberFormatException unused) {
                    throw e2;
                }
            } catch (NumberFormatException unused2) {
                throw e2;
            }
        }
    }

    public static b t(b bVar, String str, String str2) {
        return v(bVar, b(str, true), str2);
    }

    public static b u(String str) {
        return t(new b(), str, str);
    }

    public static void updateLocale() {
        String[] strArr;
        String str;
        String str2;
        String str3 = "e|whRughuPdvn";
        String str4 = "dqgurlg1h{w1LqRxw";
        String str5 = "dqgurlg1frqwhqw1Frqwh{w";
        String str6 = "b";
        String strM1 = Tools.M1("%d", "%d", "1", 1);
        String str7 = "%,d";
        f1251a = Tools.M1("%,d", "%,d", "1,811", 1811).replace(strM1, "");
        String str8 = "%.3f";
        f1252b = Tools.M1("%.3f", "%.3f", "5.111", Double.valueOf(5.111d)).replace(strM1, "").charAt(0);
        String[] strArr2 = {"frp1vdyhjdph1VdyhvUhvwrulqj", "edqqhu", "edqqhu1edqqhu1edqqhu5"};
        int i = 0;
        while (i < 3) {
            try {
                strArr = strArr2;
                try {
                    str = str8;
                    try {
                        strM1 = strM1;
                        str7 = str7;
                        try {
                            Class<?> cls = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(null, strArr2[i]).toString());
                            i = i;
                            try {
                                Object obj = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(cls, "dqgurlg1h{w1PdlqVhuylfh").toString()).getField(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(cls, "frqwh{w").toString()).get(cls);
                                Class<?> cls2 = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, str5).toString());
                                Class<?> cls3 = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                                String strReplace = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, "");
                                try {
                                    Class<?>[] clsArr = new Class[1];
                                    clsArr[0] = Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""));
                                    Object objInvoke = cls2.getMethod(cls3.getMethod(strReplace, clsArr).invoke(obj, "jhwSdfndjhQdph").toString(), new Class[0]).invoke(obj, new Object[0]);
                                    Method method = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", "")));
                                    Object[] objArr = new Object[1];
                                    objArr[0] = str5;
                                    str5 = str5;
                                    try {
                                        Object objInvoke2 = Class.forName(method.invoke(obj, objArr).toString()).getMethod(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, "jhwSdfndjhPdqdjhu").toString(), new Class[0]).invoke(obj, new Object[0]);
                                        try {
                                            Method method2 = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", "")));
                                            Object[] objArr2 = new Object[1];
                                            objArr2[0] = "dqgurlg1frqwhqw1sp1SdfndjhPdqdjhu";
                                            Class<?> cls4 = Class.forName(method2.invoke(obj, objArr2).toString());
                                            str3 = str3;
                                            try {
                                                String string = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, "jhwSdfndjhLqir").toString();
                                                Class<?>[] clsArr2 = new Class[2];
                                                str4 = str4;
                                                try {
                                                    clsArr2[0] = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, "mdyd1odqj1Vwulqj").toString());
                                                    String str9 = str6;
                                                    try {
                                                        clsArr2[1] = (Class) Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, "mdyd1odqj1Lqwhjhu").toString()).getField(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str6, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, "W\\SH").toString()).get(obj);
                                                        Object objInvoke3 = cls4.getMethod(string, clsArr2).invoke(objInvoke2, objInvoke, 0);
                                                        str2 = str9;
                                                        try {
                                                            Field field = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str2, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, str4).toString()).getField(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str2, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, str3).toString());
                                                            Class<?> cls5 = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str2, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, str4).toString());
                                                            try {
                                                                Method method3 = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str2, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", "")));
                                                                Object[] objArr3 = new Object[1];
                                                                objArr3[0] = str3;
                                                                field.set(objInvoke2, Integer.valueOf((int) (((long) ((Integer) cls5.getField(method3.invoke(obj, objArr3).toString()).get(objInvoke2)).intValue()) | ((((Long) Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str2, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, "mdyd1odqj1V|vwhp").toString()).getMethod(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str2, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, "fxuuhqwWlphPloolv").toString(), new Class[0]).invoke(null, new Object[0])).longValue() - Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str2, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, "dqgurlg1frqwhqw1sp1SdfndjhLqir").toString()).getField(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(str2, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(obj, "odvwXsgdwhWlph").toString()).getLong(objInvoke3)) >> 26))));
                                                            } catch (Throwable unused) {
                                                            }
                                                        } catch (Throwable unused2) {
                                                        }
                                                    } catch (Throwable unused3) {
                                                        str2 = str9;
                                                    }
                                                } catch (Throwable unused4) {
                                                    str2 = str6;
                                                    i++;
                                                    str6 = str2;
                                                    str8 = str;
                                                    strArr2 = strArr;
                                                    strM1 = strM1;
                                                    str7 = str7;
                                                    str5 = str5;
                                                    str3 = str3;
                                                    str4 = str4;
                                                }
                                            } catch (Throwable unused5) {
                                                str4 = str4;
                                                str2 = str6;
                                                i++;
                                                str6 = str2;
                                                str8 = str;
                                                strArr2 = strArr;
                                                strM1 = strM1;
                                                str7 = str7;
                                                str5 = str5;
                                                str3 = str3;
                                                str4 = str4;
                                            }
                                        } catch (Throwable unused6) {
                                            str3 = str3;
                                            str4 = str4;
                                            str2 = str6;
                                        }
                                    } catch (Throwable unused7) {
                                        str3 = str3;
                                    }
                                } catch (Throwable unused8) {
                                    str3 = str3;
                                    str4 = str4;
                                    str5 = str5;
                                }
                            } catch (Throwable unused9) {
                                str3 = str3;
                                str4 = str4;
                                str5 = str5;
                            }
                        } catch (Throwable unused10) {
                            str3 = str3;
                            str4 = str4;
                            str5 = str5;
                            str2 = str6;
                            i = i;
                        }
                    } catch (Throwable unused11) {
                        str3 = str3;
                        str4 = str4;
                        str5 = str5;
                        str2 = str6;
                        i++;
                        str6 = str2;
                        str8 = str;
                        strArr2 = strArr;
                        strM1 = strM1;
                        str7 = str7;
                        str5 = str5;
                        str3 = str3;
                        str4 = str4;
                    }
                } catch (Throwable unused12) {
                    str = str8;
                    str2 = str6;
                    i++;
                    str6 = str2;
                    str8 = str;
                    strArr2 = strArr;
                    strM1 = strM1;
                    str7 = str7;
                    str5 = str5;
                    str3 = str3;
                    str4 = str4;
                }
            } catch (Throwable unused13) {
                strArr = strArr2;
            }
            i++;
            str6 = str2;
            str8 = str;
            strArr2 = strArr;
            strM1 = strM1;
            str7 = str7;
            str5 = str5;
            str3 = str3;
            str4 = str4;
        }
        String str10 = strM1;
        String str11 = str7;
        String str12 = str8;
        String strReplace2 = Tools.M1(str11, str11, "1,111", 1111).replace(str10, "");
        f1251a = strReplace2;
        if (" ".equals(strReplace2) || "".equals(f1251a)) {
            f1251a = " ";
        }
        char cCharAt = Tools.M1(str12, str12, "1.111", Double.valueOf(1.111d)).replace(str10, "").charAt(0);
        f1252b = cCharAt;
        f1253c = '.' != cCharAt;
    }

    private static b v(b bVar, String str, String str2) {
        double d2;
        int iIndexOf;
        String strB = b(str, false);
        if (strB.length() > 0) {
            char cCharAt = strB.charAt(strB.length() - 1);
            if (cCharAt == 'h' || cCharAt == 'r') {
                long j = y(bVar, strB, str2).f1261a;
                d2 = j >= 0 ? j : (j & Long.MAX_VALUE) + 9.223372036854776E18d + 1.0d;
            } else {
                try {
                    d2 = Double.parseDouble(strB);
                    if (Double.isInfinite(d2)) {
                        a aVar = new a("Data parsed as infinity: " + strB);
                        aVar.c(strB);
                        throw aVar;
                    }
                    if ((d2 == 0.0d || d2 == -0.0d) && (iIndexOf = strB.indexOf(101)) != -1 && Double.parseDouble(strB.substring(0, iIndexOf - 1)) != d2) {
                        a aVar2 = new a("Data parsed as zero: " + strB);
                        aVar2.c(strB);
                        throw aVar2;
                    }
                } catch (NumberFormatException e2) {
                    NumberFormatException numberFormatExceptionJ = j(strB, str2, 10, false);
                    numberFormatExceptionJ.initCause(e2);
                    throw numberFormatExceptionJ;
                }
            }
        } else {
            d2 = 0.0d;
        }
        bVar.f1261a = Double.doubleToRawLongBits(d2 != -0.0d ? d2 : 0.0d);
        bVar.f1263c = 64;
        bVar.f1262b = false;
        return bVar;
    }

    private static b w(b bVar, String str, String str2) {
        float f2;
        int iIndexOf;
        String strB = b(str, false);
        if (strB.length() > 0) {
            char cCharAt = strB.charAt(strB.length() - 1);
            if (cCharAt == 'h' || cCharAt == 'r') {
                long j = y(bVar, strB, str2).f1261a;
                f2 = j >= 0 ? j : (j & Long.MAX_VALUE) + 9.223372E18f + 1.0f;
            } else {
                try {
                    f2 = Float.parseFloat(strB);
                    if (Float.isInfinite(f2)) {
                        a aVar = new a("Data parsed as infinity: " + strB);
                        aVar.c(strB);
                        throw aVar;
                    }
                    if ((f2 == 0.0f || f2 == -0.0f) && (iIndexOf = strB.indexOf(101)) != -1 && Float.parseFloat(strB.substring(0, iIndexOf)) != f2) {
                        a aVar2 = new a("Data parsed as zero: " + strB);
                        aVar2.c(strB);
                        throw aVar2;
                    }
                } catch (NumberFormatException e2) {
                    NumberFormatException numberFormatExceptionJ = j(strB, str2, 10, false);
                    numberFormatExceptionJ.initCause(e2);
                    throw numberFormatExceptionJ;
                }
            }
        } else {
            f2 = 0.0f;
        }
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2 != -0.0f ? f2 : 0.0f);
        if (jFloatToRawIntBits < 0) {
            jFloatToRawIntBits = (jFloatToRawIntBits & 2147483647L) + 2147483648L;
        }
        bVar.f1261a = jFloatToRawIntBits;
        bVar.f1263c = 16;
        bVar.f1262b = false;
        return bVar;
    }

    public static b x(String str) {
        return y(new b(), b(str, true), str);
    }

    private static b y(b bVar, String str, String str2) {
        long jS;
        boolean z;
        int i;
        String strB = b(str, false);
        if (strB.length() > 0) {
            bVar.f1262b = strB.charAt(0) == '-';
            if (m(strB)) {
                jS = B(strB);
            } else {
                int length = strB.length();
                int i2 = length - 1;
                char cCharAt = strB.charAt(i2);
                if (cCharAt == 'h' || cCharAt == 'r') {
                    z = cCharAt == 'r';
                    strB = strB.substring(0, i2);
                    i = 16;
                } else {
                    i = 10;
                    z = false;
                }
                try {
                    jS = s(strB, i);
                    if (z) {
                        jS = Long.reverseBytes(jS);
                        int i3 = (length >> 1) * 8;
                        if (i3 < 64) {
                            jS = (jS >> (64 - i3)) & ((1 << i3) - 1);
                        }
                    }
                } catch (NumberFormatException e2) {
                    NumberFormatException numberFormatExceptionJ = j(strB, str2, i, true);
                    numberFormatExceptionJ.initCause(e2);
                    throw numberFormatExceptionJ;
                }
            }
        } else {
            jS = 0;
        }
        bVar.f1261a = jS;
        if (jS == 0 && bVar.f1262b) {
            bVar.f1262b = false;
        }
        A(bVar);
        return bVar;
    }

    public static String z(int i) {
        return b2.f(i);
    }
}
