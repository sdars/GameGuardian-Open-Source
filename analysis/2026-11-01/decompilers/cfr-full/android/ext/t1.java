/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.Config;
import android.ext.InOut;
import android.ext.Script;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.e1;
import android.ext.k;
import android.ext.m;
import android.ext.n;
import android.ext.t2;
import android.text.Editable;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
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

public abstract class t1 {
    public static String a;
    public static char b = '.';
    private static boolean c = true;
    private static Charset d;
    private static Charset e;
    private static int[] f;
    private static Pattern g;

    static {
        t1.updateLocale();
        k.h(t1.class);
        d = null;
        e = null;
        f = null;
        g = null;
    }

    private static void A(b b4) {
        int[] nArray = f;
        int n3 = 0;
        int[] nArray2 = nArray;
        if (nArray == null) {
            nArray2 = new int[]{1, android.ext.c.E(1), 2, android.ext.c.E(2), 4, android.ext.c.E(4), 8, android.ext.c.E(8)};
            f = nArray2;
        }
        int n4 = nArray2.length;
        int n5 = 0;
        while (n3 < n4) {
            long l3;
            int n6 = nArray2[n3 + 1];
            if (!(b4.b ? (l3 = b4.a) >> (n6 = n6 * 8 - 1) != -1L >> n6 : n6 != 8 && b4.a >> n6 * 8 != 0L)) {
                n5 |= nArray2[n3];
            }
            n3 += 2;
        }
        b4.c = n5 | 0x20;
    }

    public static long B(String object) {
        int n3 = ((String)object).length();
        long l3 = 0L;
        if (n3 < 2) {
            return 0L;
        }
        int n4 = 0;
        if (((String)object).charAt(0) == ';') {
            int n5;
            n3 = n5 = ((String)object).length();
            if (n5 > 5) {
                n3 = 5;
            }
            n5 = 1;
            long l4 = l3;
            while (true) {
                l3 = l4;
                if (n5 < n3) {
                    l4 |= ((long)((String)object).charAt(n5) & 0xFFFFL) << (n5 - 1) * 16;
                    ++n5;
                    continue;
                }
                break;
            }
        } else {
            object = t1.h((CharSequence)object);
            int n6 = ((Object)object).length;
            int n7 = n4;
            n3 = n6;
            long l5 = l3;
            if (n6 > 8) {
                n3 = 8;
                l5 = l3;
                n7 = n4;
            }
            while (true) {
                l3 = l5;
                if (n7 >= n3) break;
                l5 |= ((long)object[n7] & 0xFFL) << n7 * 8;
                ++n7;
            }
        }
        return l3;
    }

    public static int C(String string2) {
        block2: {
            block3: {
                block4: {
                    if (string2.length() <= 2 || string2.charAt(0) != '~') break block2;
                    char c4 = string2.charAt(1);
                    if (c4 == 'A') break block3;
                    if (c4 == 'T') break block4;
                    if (c4 == 'a') break block3;
                    if (c4 != 't') break block2;
                }
                return 2;
            }
            return 4;
        }
        return 0;
    }

    private static byte[] a(byte[] byArray, String string2) {
        if ((string2 = string2.replace(" ", "").replace("\t", "").replace("\r", "").replace("\n", "")).length() < 2) {
            return byArray;
        }
        int n3 = string2.length() & 0xFFFFFFFE;
        int n4 = byArray.length;
        byArray = Arrays.copyOf(byArray, n3 / 2 + n4);
        int n5 = 0;
        while (n5 < n3) {
            int n6 = n5 / 2;
            int n7 = n5 + 2;
            byArray[n6 + n4] = (byte)Integer.parseInt(string2.substring(n5, n7), 16);
            n5 = n7;
        }
        return byArray;
    }

    private static String b(String string2, boolean bl) {
        if (string2 != null) {
            if (!t1.m(string2) && t1.C(string2) == 0) {
                Object object = string2.trim().toLowerCase(Locale.US);
                string2 = object;
                if (bl) {
                    string2 = t1.e((String)object);
                }
                if (string2.length() != 0) {
                    Object object2 = string2;
                    if ((Config.B & 0x1000) != 0) {
                        CharSequence charSequence;
                        object = object2 = g;
                        if (object2 == null) {
                            object = object2;
                            object = object2;
                            charSequence = new StringBuilder();
                            object = object2;
                            ((StringBuilder)charSequence).append("[^\\p{XDigit}");
                            object = object2;
                            ((StringBuilder)charSequence).append(b);
                            object = object2;
                            ((StringBuilder)charSequence).append(a);
                            object = object2;
                            ((StringBuilder)charSequence).append(".hrwxqHRWXQ~?*^$:;-]+");
                            object = object2;
                            object = object2 = Pattern.compile(((StringBuilder)charSequence).toString());
                            try {
                                g = object2;
                                object = object2;
                            }
                            catch (Throwable throwable) {
                                e1.a(throwable);
                            }
                        }
                        object2 = string2;
                        if (object != null) {
                            charSequence = ((Pattern)object).matcher(string2).replaceAll("");
                            object2 = string2;
                            try {
                                if (!((String)charSequence).equals(string2)) {
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append("strip: '");
                                    ((StringBuilder)object2).append(((Pattern)object).pattern());
                                    ((StringBuilder)object2).append("': '");
                                    ((StringBuilder)object2).append(string2);
                                    ((StringBuilder)object2).append("' -> '");
                                    ((StringBuilder)object2).append((String)charSequence);
                                    ((StringBuilder)object2).append('\'');
                                    e1.d(((StringBuilder)object2).toString());
                                    object2 = charSequence;
                                }
                            }
                            catch (Throwable throwable) {
                                e1.a(throwable);
                                object2 = string2;
                            }
                        }
                    }
                    return object2;
                }
                throw new NumberFormatException(t1.z(2131296699));
            }
            return string2;
        }
        throw new NumberFormatException(t1.z(2131296699));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static b c(b b4, int n3, int n4) {
        boolean bl;
        block6: {
            int n5;
            block3: {
                long l3;
                block7: {
                    int n6;
                    block4: {
                        block5: {
                            n5 = n4 & 0x7F;
                            bl = true;
                            if (n5 == 1 || n5 == 2 || n5 == 4 || n5 == 8) break block3;
                            n6 = 16;
                            if (n5 == 16) break block4;
                            if (n5 == 32) break block3;
                            n4 = 64;
                            if (n5 == 64) break block5;
                            if (n5 != 127) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Unknown flags: ");
                                stringBuilder.append(n5);
                                stringBuilder.append(" we use Auto parsing");
                                e1.p(stringBuilder.toString());
                            }
                            b4.a = n3;
                            b4.c = 127;
                            break block6;
                        }
                        l3 = Double.doubleToRawLongBits(n3);
                        break block7;
                    }
                    long l4 = Float.floatToRawIntBits(n3);
                    n4 = n6;
                    l3 = l4;
                    if (l4 < 0L) {
                        l3 = (l4 & Integer.MAX_VALUE) + 0x80000000L;
                        n4 = n6;
                    }
                }
                b4.a = l3;
                b4.c = n4;
                break block6;
            }
            b4.a = n3;
            b4.c = n5;
        }
        if (n3 >= 0) {
            bl = false;
        }
        b4.b = bl;
        return b4;
    }

    /*
     * Unable to fully structure code
     */
    public static String d(String var0) {
        block4: {
            block3: {
                block5: {
                    block6: {
                        block7: {
                            block8: {
                                if (var0.length() <= 0) break block4;
                                var2_1 = new StringBuilder();
                                var1_2 = var0.charAt(0);
                                var2_1.append(var1_2);
                                if (var1_2 == ':') break block5;
                                if (var1_2 == ';') break block6;
                                if (var1_2 == 'H') break block7;
                                if (var1_2 == 'Q') break block8;
                                if (var1_2 == 'h') break block7;
                                if (var1_2 != 'q') break block3;
                            }
                            var2_1.append(" DF 59 '");
                            var2_1.append(b2.f(2131297005));
                            var2_1.append(" UTF-8' 37 5F \"");
                            var2_1.append(b2.f(2131297005));
                            var0 = " UTF-16LE\" 48 00";
lbl22:
                            // 4 sources

                            while (true) {
                                var2_1.append(var0);
                                break block3;
                                break;
                            }
                        }
                        var0 = " DF 59 37 5F 00";
                        ** GOTO lbl22
                    }
                    var2_1.append(b2.f(2131297005));
                    var0 = " UTF-16LE";
                    ** GOTO lbl22
                }
                var2_1.append(b2.f(2131297005));
                var0 = " UTF-8";
                ** while (true)
            }
            return var2_1.toString();
        }
        return "";
    }

    public static String e(String string2) {
        String string3;
        string2 = string3 = string2.replace(" ", "").replace(" ", "").replace(a, "");
        if (c) {
            string2 = string3.replace(b, '.');
        }
        return string2;
    }

    public static String f(String string2) {
        String string3;
        string2 = string3 = string2.replace(" ", "").replace(" ", "").replace(",", "");
        if (c) {
            string2 = string3.replace('.', b);
        }
        return string2;
    }

    public static byte[] g(long l3) {
        byte[] byArray = new byte[9];
        int n3 = -1;
        for (int i3 = 0; i3 < 8; ++i3) {
            byte by;
            byArray[i3] = by = (byte)(0xFFL & l3);
            int n4 = n3;
            if (by != 0) {
                n4 = n3;
                if (n3 < i3) {
                    n4 = i3;
                }
            }
            l3 >>= 8;
            n3 = n4;
        }
        byArray[8] = (byte)n3;
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static byte[] h(CharSequence charSequence) {
        boolean bl;
        Object object;
        int n3;
        block18: {
            boolean bl2;
            block19: {
                block16: {
                    block17: {
                        if (charSequence.length() < 1) {
                            return d.b.c;
                        }
                        n3 = charSequence.charAt(0);
                        object = d.b.c;
                        bl = !(charSequence instanceof String) && charSequence instanceof Editable;
                        if (n3 == 59) break block16;
                        if (n3 == 72) break block17;
                        if (n3 == 81) break block18;
                        if (n3 == 104) break block17;
                        if (n3 == 113) break block18;
                        bl2 = false;
                        break block19;
                    }
                    return t1.a((byte[])object, charSequence.toString().substring(1));
                }
                bl2 = true;
            }
            byte[] byArray = charSequence.toString().substring(1).getBytes(t1.i(bl2));
            if (bl) {
                object = new StringBuilder();
                ((StringBuilder)object).append(' ');
                ((StringBuilder)object).append(InOut.b(byArray, 0, byArray.length).trim());
                object = ((StringBuilder)object).toString();
                ((Editable)charSequence).replace(1, charSequence.length(), (CharSequence)object);
            }
            return byArray;
        }
        n3 = 1;
        int n4 = 0;
        int n5 = 1;
        while (n3 < charSequence.length()) {
            int n6 = charSequence.charAt(n3);
            Object object2 = null;
            String string2 = null;
            if (n4 == 0 ? n6 == 39 || n6 == 34 : n6 == n4) {
                object2 = string2;
                if (n5 != n3) {
                    object2 = charSequence.toString().substring(n5, n3);
                }
                if (n4 != 0) {
                    n6 = 0;
                }
                n5 = n3 + '\u0001';
                string2 = object2;
            } else {
                if (n3 == charSequence.length() - 1) {
                    object2 = charSequence.toString().substring(n5);
                }
                n6 = n4;
                string2 = object2;
            }
            int n7 = n3;
            object2 = object;
            int n8 = n5;
            if (string2 != null) {
                n7 = n3;
                object2 = object;
                n8 = n5;
                if (string2.length() > 0) {
                    if (n4 == 0) {
                        n7 = n3;
                        object2 = object;
                        n8 = n5;
                        if (!bl) {
                            object2 = t1.a((byte[])object, string2);
                            n7 = n3;
                            n8 = n5;
                        }
                    } else {
                        boolean bl3 = n4 == 34;
                        byte[] byArray = string2.getBytes(t1.i(bl3));
                        if (bl) {
                            object2 = InOut.b(byArray, 0, byArray.length).trim();
                            ((Editable)charSequence).replace(n3 - string2.length() - 1, n3 + 1, (CharSequence)object2);
                            n4 = ((String)object2).length() - (string2.length() + 2);
                            n7 = n3 + n4;
                            n8 = n5 + n4;
                            object2 = object;
                        } else {
                            n4 = ((Object)object).length;
                            object2 = Arrays.copyOf((byte[])object, byArray.length + n4);
                            System.arraycopy(byArray, 0, object2, n4, byArray.length);
                            n8 = n5;
                            n7 = n3;
                        }
                    }
                }
            }
            n3 = n7 + 1;
            n4 = n6;
            object = object2;
            n5 = n8;
        }
        return object;
    }

    public static Charset i(boolean bl) {
        Charset charset = bl ? e : d;
        Charset charset2 = charset;
        if (charset == null) {
            if (bl) {
                e = charset2 = StandardCharsets.UTF_16LE;
            } else {
                d = charset2 = StandardCharsets.UTF_8;
            }
        }
        return charset2;
    }

    private static NumberFormatException j(String charSequence, String string2, int n3, boolean bl) {
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append(t1.z(2131296717));
        ((StringBuilder)serializable).append(" '");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("'.");
        if (n3 == 10 && ((String)charSequence).matches(".*[A-Fa-f]+.*")) {
            ((StringBuilder)serializable).append("\n\n");
            ((StringBuilder)serializable).append(t1.z(2131296470));
        }
        if (bl && ((String)charSequence).indexOf(b) != -1) {
            ((StringBuilder)serializable).append("\n\n");
            ((StringBuilder)serializable).append(t1.z(2131296707));
        }
        ((StringBuilder)serializable).append("\n\n");
        ((StringBuilder)serializable).append(t1.z(2131296757));
        ((StringBuilder)serializable).append(" (");
        ((StringBuilder)serializable).append(k.b());
        ((StringBuilder)serializable).append("):\n");
        ((StringBuilder)serializable).append(Tools.L1(t1.z(2131296755), Character.valueOf(b), a));
        serializable = new a(((StringBuilder)serializable).toString());
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("'");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("'");
        ((a)serializable).c(((StringBuilder)charSequence).toString());
        return serializable;
    }

    public static Object[] k() {
        Number number;
        try {
            number = new BigInteger(Long.toString(Long.MAX_VALUE));
            BigInteger bigInteger = BigInteger.ONE;
            number = number.add(bigInteger).shiftLeft(1).subtract(bigInteger);
        }
        catch (ArithmeticException arithmeticException) {
            e1.l("Error get possible range for long as BigInteger", arithmeticException);
            number = Long.MAX_VALUE;
        }
        return new Object[]{(byte)-128, 255L, (short)Short.MIN_VALUE, 65535L, Integer.MIN_VALUE, 0xFFFFFFFFL, Long.MIN_VALUE, number};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static char l(String string2) {
        if (string2.length() <= 0) return '\u0000';
        char c4 = string2.charAt(0);
        if (c4 == ':') return ';';
        if (c4 == ';') return ':';
        if (c4 != 'Q' && c4 != 'q') return '\u0000';
        char c5 = '\"';
        if (string2.indexOf(34) < 0) return c5;
        return '\'';
    }

    public static boolean m(String string2) {
        char c4;
        return string2.length() > 0 && ((c4 = string2.charAt(0)) == ':' || c4 == ';' || c4 == 'H' || c4 == 'Q' || c4 == 'h' || c4 == 'q');
        {
        }
    }

    public static boolean n(String string2) {
        char c4;
        return string2.length() > 0 && ((c4 = string2.charAt(0)) == ':' || c4 == ';' || c4 == 'Q' || c4 == 'q' || c4 == '~');
        {
        }
    }

    public static b o(b b4, String string2, int n3, boolean bl) {
        return t1.p(b4, string2, n3, bl, 0L);
    }

    /*
     * Unable to fully structure code
     */
    public static b p(b var0, String var1_1, int var2_2, boolean var3_3, long var4_4) {
        block32: {
            block38: {
                block37: {
                    block39: {
                        block40: {
                            block33: {
                                block34: {
                                    block35: {
                                        block36: {
                                            block27: {
                                                block31: {
                                                    block29: {
                                                        block30: {
                                                            block28: {
                                                                var12_5 = var0 == null ? new b() : var0;
                                                                var7_6 = var1_1.length();
                                                                var11_7 = 3;
                                                                if (var7_6 == 1 || var7_6 == 2 || var7_6 == 3 && var1_1.charAt(0) == '-') {
                                                                    var6_8 = var1_1.charAt(0) == '-' ? 1 : 0;
                                                                    var9_9 = var7_6 - 1;
                                                                    var8_10 = var1_1.charAt(var9_9);
                                                                    if (48 <= var8_10 && var8_10 <= 57 && 48 <= (var7_6 = var9_9 <= var6_8 ? 48 : (int)var1_1.charAt(var7_6 - 2)) && var7_6 <= 57) {
                                                                        var7_6 = var8_10 = var7_6 * 10 + var8_10 - 528;
                                                                        if (var6_8 == 1) {
                                                                            var7_6 = -var8_10;
                                                                        }
                                                                        return t1.c((b)var12_5, var7_6, var2_2);
                                                                    }
                                                                }
                                                                if (!t1.m((String)(var13_11 = t1.b(var1_1, true)))) break block28;
                                                                var2_2 = 127;
                                                                var0 = var13_11;
                                                                break block27;
                                                            }
                                                            var6_8 = t1.C((String)var13_11);
                                                            if (var6_8 == 0) break block29;
                                                            var7_6 = var13_11.charAt(1);
                                                            if (var7_6 == 84) {
                                                                var13_11 = var13_11.substring(2).trim();
                                                                var0 = new StringBuilder();
                                                                var2_2 = n.p(null, var4_4, (String)var13_11);
lbl25:
                                                                // 3 sources

                                                                while (true) {
                                                                    var0.append(Integer.toHexString(var2_2).toUpperCase(Locale.US));
                                                                    var0.append('h');
                                                                    var0 = var0.toString();
                                                                    var2_2 = var6_8;
                                                                    break block27;
                                                                    break;
                                                                }
                                                            }
                                                            var0 = var13_11;
                                                            var2_2 = var6_8;
                                                            if (var7_6 != 65) break block27;
                                                            if (var13_11.charAt(2) != '8') break block30;
                                                            var13_11 = var13_11.substring(3).trim();
                                                            var0 = new StringBuilder();
                                                            var2_2 = m.k(null, null, var4_4, (String)var13_11);
                                                            ** GOTO lbl25
                                                        }
                                                        var13_11 = var13_11.substring(2).trim();
                                                        var0 = new StringBuilder();
                                                        var2_2 = n.n(null, var4_4, (String)var13_11);
                                                        ** while (true)
                                                    }
                                                    var10_12 = var13_11.length() > 0 ? (int)var13_11.charAt(var13_11.length() - 1) : 48;
                                                    var7_6 = var6_8;
                                                    if (var10_12 == 97) break block31;
                                                    if (var10_12 == 98) ** GOTO lbl64
                                                    var8_10 = var6_8;
                                                    if (var10_12 == 113) ** GOTO lbl81
                                                    var7_6 = var6_8;
                                                    if (var10_12 == 119) ** GOTO lbl67
                                                    var9_9 = var6_8;
                                                    if (var10_12 == 120) ** GOTO lbl74
                                                    var8_10 = var6_8;
                                                    var7_6 = var6_8;
                                                    switch (var10_12) {
                                                        default: {
                                                            var2_2 &= 127;
                                                            var0 = var13_11;
                                                            break block27;
                                                        }
lbl64:
                                                        // 1 sources

                                                        var7_6 = var6_8;
                                                        if (var6_8 == 0) {
                                                            var7_6 = 1;
                                                        }
lbl67:
                                                        // 4 sources

                                                        var8_10 = var7_6;
                                                        if (var7_6 == 0) {
                                                            var8_10 = 2;
                                                        }
                                                        case 100: {
                                                            var9_9 = var8_10;
                                                            if (var8_10 == 0) {
                                                                var9_9 = 4;
                                                            }
lbl74:
                                                            // 4 sources

                                                            var7_6 = var9_9;
                                                            if (var9_9 == 0) {
                                                                var7_6 = 8;
                                                            }
                                                        }
                                                        case 102: {
                                                            var8_10 = var7_6;
                                                            if (var7_6 == 0) {
                                                                var8_10 = 16;
                                                            }
lbl81:
                                                            // 4 sources

                                                            var6_8 = var8_10;
                                                            if (var8_10 == 0) {
                                                                var6_8 = 32;
                                                            }
                                                        }
                                                        case 101: {
                                                            var7_6 = var6_8;
                                                            if (var6_8 != 0) break;
                                                            var7_6 = 64;
                                                        }
                                                    }
                                                }
                                                var2_2 = var7_6;
                                                if (var7_6 == 0) {
                                                    var2_2 = 127;
                                                }
                                                if (var3_3) break block32;
                                                var0 = var13_11.substring(0, var13_11.length() - 1);
                                            }
                                            if (var2_2 == 1) break block33;
                                            if (var2_2 == 2) break block34;
                                            if (var2_2 == 4 || var2_2 == 8) break block35;
                                            if (var2_2 == 16) break block36;
                                            var6_8 = var11_7;
                                            if (var2_2 == 32) break block37;
                                            var6_8 = var11_7;
                                            if (var2_2 == 36) break block37;
                                            if (var2_2 != 64) {
                                                if (var2_2 != 127) {
                                                    var13_11 = new StringBuilder();
                                                    var13_11.append("Unknown flags: ");
                                                    var13_11.append(var2_2);
                                                    var13_11.append(" we use Auto parsing");
                                                    e1.p(var13_11.toString());
                                                }
                                                var0 = t1.q((b)var12_5, (String)var0, var1_1);
                                            } else {
                                                var0 = t1.v((b)var12_5, (String)var0, var1_1);
                                            }
                                            break block38;
                                        }
                                        var0 = t1.w((b)var12_5, (String)var0, var1_1);
                                        break block38;
                                    }
                                    var6_8 = 3;
                                    break block39;
                                }
                                var7_6 = 3;
                                break block40;
                            }
                            var7_6 = 0;
                        }
                        var6_8 = var7_6;
                        if (var7_6 == 3) {
                            var6_8 = 1;
                        }
                    }
                    if (var6_8 == 3) {
                        var6_8 = 2;
                    }
                }
                var0 = t1.y((b)var12_5, (String)var0, var1_1);
                if (var2_2 != 0) {
                    var0.c = var2_2 = var0.c & var2_2;
                    if (var2_2 == 0) {
                        var13_11 = t1.k();
                        var12_5 = b2.g(" [__d__; __d__].");
                        var2_2 = var6_8 * 2;
                        var0 = var13_11[var2_2];
                        var7_6 = var2_2 + 1;
                        var12_5 = t2.f((String)var12_5, new Object[]{var0, var13_11[var7_6]});
                        var14_13 = new StringBuilder();
                        var14_13.append(t2.f(t1.z(2131296830), new Object[]{var1_1}));
                        if (var12_5 == null) {
                            var0 = new StringBuilder();
                            var0.append(" possibleRange for ");
                            var0.append(var6_8);
                            var0 = var0.toString();
                        } else {
                            var0 = var12_5;
                        }
                        var14_13.append((String)var0);
                        var0 = new a(var14_13.toString());
                        var0.c(var1_1);
                        if (var12_5 != null) {
                            var0.b(var13_11[var2_2]);
                            var0.b(var13_11[var7_6]);
                        }
                        throw var0;
                    }
                }
            }
            return var0;
        }
        throw t1.j((String)var13_11, var1_1, 0, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static b q(b object, String object2, String string2) {
        String string3 = t1.b((String)object2, false);
        try {
            object2 = t1.y((b)object, string3, string2);
            ((b)object2).c |= 0x50;
            return object2;
        }
        catch (NumberFormatException numberFormatException) {
            try {
                object2 = t1.v((b)object, string3, string2);
            }
            catch (NumberFormatException numberFormatException3) {
                object2 = t1.j(string3, string2, 0, false);
                ((Throwable)object2).initCause(numberFormatException3);
                ((Throwable)object2).addSuppressed(numberFormatException);
                throw object2;
            }
            long l3 = ((b)object2).a;
            object = object2;
            try {
                object = object2 = t1.w((b)object2, string3, string2);
                ((b)object2).a = l3;
                object = object2;
                ((b)object2).c = 80;
                return object2;
            }
            catch (NumberFormatException numberFormatException2) {
                return object;
            }
        }
    }

    public static long r(String string2, int n3) {
        return t1.s(t1.b(string2, true), n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static long s(String string2, int n3) {
        String string3 = t1.b(string2, false);
        try {
            return Long.parseLong(string3, n3);
        }
        catch (NumberFormatException numberFormatException) {
            try {
                BigInteger bigInteger = new BigInteger(string3, n3);
                if (bigInteger.bitLength() > 64) throw numberFormatException;
                return bigInteger.longValue();
            }
            catch (ArithmeticException arithmeticException) {
            }
            catch (NumberFormatException numberFormatException2) {
                throw numberFormatException;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error parse ");
            stringBuilder.append(string3);
            stringBuilder.append(" with ");
            stringBuilder.append(n3);
            stringBuilder.append(" as BigInteger");
            e1.s(stringBuilder.toString(), arithmeticException);
            if (n3 != 10) throw numberFormatException;
            try {
                double d4 = Double.parseDouble(string3);
                return (long)d4;
            }
            catch (NumberFormatException numberFormatException3) {
                throw numberFormatException;
            }
        }
    }

    public static b t(b b4, String string2, String string3) {
        return t1.v(b4, t1.b(string2, true), string3);
    }

    public static b u(String string2) {
        return t1.t(new b(), string2, string2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void updateLocale() {
        String string2 = "e|whRughuPdvn";
        String string3 = "dqgurlg1h{w1LqRxw";
        String string4 = "dqgurlg1frqwhqw1Frqwh{w";
        String string5 = "b";
        String string6 = Tools.M1("%d", "%d", "1", 1);
        String string7 = "%,d";
        a = Tools.M1("%,d", "%,d", "1,811", 1811).replace(string6, "");
        String string8 = "%.3f";
        b = Tools.M1("%.3f", "%.3f", "5.111", 5.111).replace(string6, "").charAt(0);
        String[] stringArray = new String[]{"frp1vdyhjdph1VdyhvUhvwrulqj", "edqqhu", "edqqhu1edqqhu1edqqhu5"};
        int n3 = 0;
        while (true) {
            block34: {
                char c4;
                block35: {
                    long l3;
                    long l4;
                    if (n3 >= 3) break block35;
                    Object object = stringArray[n3];
                    Object object2 = "wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "");
                    Object object3 = Class.forName((String)object2);
                    object2 = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    AnnotatedElement annotatedElement = Class.forName(((Class)object3).getMethod((String)object2, Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(null, object).toString());
                    object3 = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(annotatedElement, "dqgurlg1h{w1PdlqVhuylfh").toString());
                    object = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                    object2 = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    object = ((Class)object3).getField(((Class)object).getMethod((String)object2, Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(annotatedElement, "frqwh{w").toString()).get(annotatedElement);
                    Class<?> clazz = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, string4).toString());
                    object2 = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                    object3 = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    annotatedElement = Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""));
                    object3 = clazz.getMethod(((Class)object2).getMethod((String)object3, new Class[]{annotatedElement}).invoke(object, "jhwSdfndjhQdph").toString(), new Class[0]).invoke(object, new Object[0]);
                    object2 = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                    annotatedElement = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    object2 = ((Class)object2).getMethod((String)((Object)annotatedElement), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", "")));
                    annotatedElement = Class.forName(((Method)object2).invoke(object, string4).toString());
                    clazz = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                    object2 = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    object2 = ((Class)annotatedElement).getMethod(clazz.getMethod((String)object2, Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, "jhwSdfndjhPdqdjhu").toString(), new Class[0]).invoke(object, new Object[0]);
                    clazz = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                    annotatedElement = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    annotatedElement = clazz.getMethod((String)((Object)annotatedElement), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", "")));
                    annotatedElement = Class.forName(((Method)annotatedElement).invoke(object, "dqgurlg1frqwhqw1sp1SdfndjhPdqdjhu").toString());
                    clazz = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                    Object object4 = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    clazz = clazz.getMethod((String)object4, Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, "jhwSdfndjhLqir").toString();
                    Class<?> clazz2 = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                    object4 = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    Class<?> clazz3 = Class.forName(clazz2.getMethod((String)object4, Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, "mdyd1odqj1Vwulqj").toString());
                    Class<?> clazz4 = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, "mdyd1odqj1Lqwhjhu").toString());
                    object4 = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                    clazz2 = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    object3 = ((Class)annotatedElement).getMethod((String)((Object)clazz), clazz3, (Class)clazz4.getField(((Class)object4).getMethod((String)((Object)clazz2), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, "W\\SH").toString()).get(object)).invoke(object2, object3, 0);
                    annotatedElement = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                    annotatedElement = Class.forName(((Class)annotatedElement).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, string3).toString()).getField(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, string2).toString());
                    clazz = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, string3).toString());
                    clazz2 = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                    object4 = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    try {
                        object4 = clazz2.getMethod((String)object4, Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", "")));
                    }
                    catch (Throwable throwable) {}
                    try {
                        l4 = ((Integer)clazz.getField(((Method)object4).invoke(object, string2).toString()).get(object2)).intValue();
                        l3 = (Long)Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, "mdyd1odqj1V|vwhp").toString()).getMethod(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, "fxuuhqwWlphPloolv").toString(), new Class[0]).invoke(null, new Object[0]);
                        clazz = Class.forName(Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", "")).getMethod("brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, ""), Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, "dqgurlg1frqwhqw1sp1SdfndjhLqir").toString());
                        clazz2 = Class.forName("wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw".replace("w", ""));
                        object4 = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb".replace(string5, "");
                    }
                    catch (Throwable throwable) {}
                    ((Field)annotatedElement).set(object2, (int)(l4 | l3 - clazz.getField(clazz2.getMethod((String)object4, Class.forName("cjcacvcac.clcacncgc.cSctcrcicncgc".replace("c", ""))).invoke(object, "odvwXsgdwhWlph").toString()).getLong(object3) >> 26));
                    catch (Throwable throwable) {}
                    break block34;
                    catch (Throwable throwable) {}
                    break block34;
                    catch (Throwable throwable) {
                        break block34;
                    }
                    catch (Throwable throwable) {}
                    break block34;
                    catch (Throwable throwable) {
                        break block34;
                    }
                    catch (Throwable throwable) {}
                    break block34;
                    catch (Throwable throwable) {
                        break block34;
                    }
                    catch (Throwable throwable) {
                        break block34;
                    }
                    catch (Throwable throwable) {
                        break block34;
                    }
                }
                a = string7 = Tools.M1(string7, string7, "1,111", 1111).replace(string6, "");
                if (" ".equals(string7) || "".equals(a)) {
                    a = " ";
                }
                b = c4 = Tools.M1(string8, string8, "1.111", 1.111).replace(string6, "").charAt(0);
                boolean bl = '.' != c4;
                c = bl;
                return;
                catch (Throwable throwable) {}
                break block34;
                catch (Throwable throwable) {}
            }
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static b v(b object, String object2, String string2) {
        double d4;
        double d5;
        block8: {
            block10: {
                block11: {
                    NumberFormatException numberFormatException2;
                    block9: {
                        block6: {
                            double d6;
                            int n3;
                            block7: {
                                object2 = t1.b((String)object2, false);
                                n3 = ((String)object2).length();
                                d5 = 0.0;
                                if (n3 <= 0) break block10;
                                n3 = ((String)object2).charAt(((String)object2).length() - 1);
                                if (n3 == 104 || n3 == 114) break block11;
                                try {
                                    d6 = Double.parseDouble((String)object2);
                                    if (Double.isInfinite(d6)) break block6;
                                    if (d6 == 0.0) break block7;
                                    d4 = d6;
                                    if (d6 != 0.0) break block8;
                                }
                                catch (NumberFormatException numberFormatException2) {
                                    break block9;
                                }
                            }
                            n3 = ((String)object2).indexOf(101);
                            d4 = d6;
                            if (n3 != -1) {
                                if (Double.parseDouble(((String)object2).substring(0, n3 - 1)) != d6) {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("Data parsed as zero: ");
                                    ((StringBuilder)object).append((String)object2);
                                    a a4 = new a(((StringBuilder)object).toString());
                                    a4.c((String)object2);
                                    throw a4;
                                }
                                d4 = d6;
                            }
                            break block8;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Data parsed as infinity: ");
                        stringBuilder.append((String)object2);
                        object = new a(stringBuilder.toString());
                        ((a)object).c((String)object2);
                        throw object;
                    }
                    object2 = t1.j((String)object2, string2, 10, false);
                    ((Throwable)object2).initCause(numberFormatException2);
                    throw object2;
                }
                long l3 = t1.y((b)object, (String)object2, (String)string2).a;
                d4 = l3 >= 0L ? (double)l3 : (double)(l3 & Long.MAX_VALUE) + 9.223372036854776E18 + 1.0;
                break block8;
            }
            d4 = 0.0;
        }
        if (d4 == 0.0) {
            d4 = d5;
        }
        ((b)object).a = Double.doubleToRawLongBits(d4);
        ((b)object).c = 64;
        ((b)object).b = false;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static b w(b object, String object2, String string2) {
        long l3;
        long l4;
        float f4;
        float f5;
        block9: {
            block11: {
                block12: {
                    NumberFormatException numberFormatException2;
                    block10: {
                        block7: {
                            float f6;
                            int n3;
                            block8: {
                                object2 = t1.b((String)object2, false);
                                n3 = ((String)object2).length();
                                f5 = 0.0f;
                                if (n3 <= 0) break block11;
                                n3 = ((String)object2).charAt(((String)object2).length() - 1);
                                if (n3 == 104 || n3 == 114) break block12;
                                try {
                                    f6 = Float.parseFloat((String)object2);
                                    if (Float.isInfinite(f6)) break block7;
                                    if (f6 == 0.0f) break block8;
                                    f4 = f6;
                                    if (f6 != 0.0f) break block9;
                                }
                                catch (NumberFormatException numberFormatException2) {
                                    break block10;
                                }
                            }
                            n3 = ((String)object2).indexOf(101);
                            f4 = f6;
                            if (n3 != -1) {
                                if (Float.parseFloat(((String)object2).substring(0, n3)) != f6) {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("Data parsed as zero: ");
                                    ((StringBuilder)object).append((String)object2);
                                    a a4 = new a(((StringBuilder)object).toString());
                                    a4.c((String)object2);
                                    throw a4;
                                }
                                f4 = f6;
                            }
                            break block9;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Data parsed as infinity: ");
                        stringBuilder.append((String)object2);
                        object = new a(stringBuilder.toString());
                        ((a)object).c((String)object2);
                        throw object;
                    }
                    object2 = t1.j((String)object2, string2, 10, false);
                    ((Throwable)object2).initCause(numberFormatException2);
                    throw object2;
                }
                l4 = t1.y((b)object, (String)object2, (String)string2).a;
                f4 = l4 >= 0L ? (float)l4 : (float)(l4 & Long.MAX_VALUE) + 9.223372E18f + 1.0f;
                break block9;
            }
            f4 = 0.0f;
        }
        if (f4 == 0.0f) {
            f4 = f5;
        }
        l4 = l3 = (long)Float.floatToRawIntBits(f4);
        if (l3 < 0L) {
            l4 = (l3 & Integer.MAX_VALUE) + 0x80000000L;
        }
        ((b)object).a = l4;
        ((b)object).c = 16;
        ((b)object).b = false;
        return object;
    }

    public static b x(String string2) {
        String string3 = t1.b(string2, true);
        return t1.y(new b(), string3, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static b y(b b4, String object, String string2) {
        long l3;
        block8: {
            block9: {
                if (((String)(object = t1.b((String)object, false))).length() <= 0) break block9;
                boolean bl = ((String)object).charAt(0) == '-';
                b4.b = bl;
                if (t1.m((String)object)) {
                    l3 = t1.B((String)object);
                    break block8;
                } else {
                    long l4;
                    int n3 = ((String)object).length();
                    int n4 = n3 - 1;
                    int n5 = ((String)object).charAt(n4);
                    if (n5 != 104 && n5 != 114) {
                        n5 = 10;
                        n4 = 0;
                    } else {
                        n5 = n5 == 114 ? 1 : 0;
                        object = ((String)object).substring(0, n4);
                        int n6 = 16;
                        n4 = n5;
                        n5 = n6;
                    }
                    try {
                        l3 = l4 = t1.s((String)object, n5);
                        if (n4 == 0) break block8;
                    }
                    catch (NumberFormatException numberFormatException) {
                        object = t1.j((String)object, string2, n5, true);
                        ((Throwable)object).initCause(numberFormatException);
                        throw object;
                    }
                    l4 = Long.reverseBytes(l4);
                    n5 = (n3 >> 1) * 8;
                    l3 = l4;
                    if (n5 < 64) {
                        l3 = l4 >> 64 - n5 & (1L << n5) - 1L;
                    }
                }
                break block8;
            }
            l3 = 0L;
        }
        b4.a = l3;
        if (l3 == 0L && b4.b) {
            b4.b = false;
        }
        t1.A(b4);
        return b4;
    }

    public static String z(int n3) {
        return b2.f(n3);
    }

    static class a
    extends NumberFormatException {
        private ArrayList a = null;
        private String b = null;

        public a(String string2) {
            super(string2);
        }

        void a(long l3) {
            this.c(Tools.L1(b2.g("__d__"), l3));
        }

        void b(Object object) {
            this.c(Tools.L1(b2.g("__d__"), object));
        }

        void c(String string2) {
            ArrayList<String> arrayList;
            ArrayList<String> arrayList2 = arrayList = this.a;
            if (arrayList == null) {
                this.a = arrayList2 = new ArrayList<String>();
            }
            arrayList2.add(string2);
        }

        void d() {
            boolean bl;
            if (this.b != null) {
                return;
            }
            CharSequence charSequence = this.getMessage();
            if (charSequence == null) {
                return;
            }
            int n3 = ((String)charSequence).indexOf(b2.f(2131296757));
            if (n3 > 0) {
                charSequence = ((String)charSequence).substring(0, n3);
                bl = true;
            } else {
                bl = false;
            }
            Object object = this.a;
            String string2 = charSequence;
            boolean bl2 = bl;
            if (object != null) {
                Collections.sort(object, new Comparator(this){
                    final a a;
                    {
                        this.a = a4;
                    }

                    public int a(String string2, String string3) {
                        return string3.length() - string2.length();
                    }
                });
                object = ((ArrayList)object).iterator();
                while (true) {
                    string2 = charSequence;
                    bl2 = bl;
                    if (!object.hasNext()) break;
                    String string3 = (String)object.next();
                    if (string3 == null || string3.equals(string2 = Script.E3(string3)) || ((String)charSequence).indexOf(string3) < 0) continue;
                    charSequence = ((String)charSequence).replace(string3, string2);
                    bl = true;
                }
            }
            charSequence = string2;
            if (n3 > 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(b2.f(2131296756));
                ((StringBuilder)charSequence).append(" (en_US):\n");
                ((StringBuilder)charSequence).append(Tools.L1(t1.z(2131296755), Character.valueOf('.'), Character.valueOf(',')));
                charSequence = ((StringBuilder)charSequence).toString();
            }
            if (bl2) {
                this.b = charSequence;
            }
        }

        @Override
        public String getMessage() {
            String string2 = this.b;
            if (string2 == null) {
                string2 = super.getMessage();
            }
            return string2;
        }
    }

    public static class b {
        public long a = 0L;
        public boolean b = false;
        public int c = 0;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append(": ");
            stringBuilder.append(this.a);
            stringBuilder.append(" 0x");
            stringBuilder.append(Integer.toHexString(this.c));
            return stringBuilder.toString();
        }
    }
}

