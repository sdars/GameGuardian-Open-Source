/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.n;
import java.util.Locale;

static class n.d {
    final String a;
    final int b;
    int c;
    int d = -1;
    int e = -1;

    n.d(String string) {
        this.a = string = string.toUpperCase(Locale.US);
        this.b = string.length();
        this.k();
    }

    boolean a(char c2) {
        if (this.c() != c2) {
            return false;
        }
        ++this.c;
        return true;
    }

    boolean b(String string) {
        String string2 = this.a;
        int n2 = this.c;
        int n3 = this.b - n2;
        if (n3 < 0) {
            return false;
        }
        int n4 = string.length();
        if (n4 == 0) {
            return true;
        }
        if (n4 > n3) {
            return false;
        }
        for (n3 = 0; n3 < n4; ++n3) {
            if (string2.charAt(n2 + n3) == string.charAt(n3)) continue;
            return false;
        }
        this.c = n2 + n4;
        return true;
    }

    char c() {
        int n2;
        block2: {
            int n3;
            String string = this.a;
            int n4 = this.c;
            int n5 = this.b;
            int n6 = n.g(string, n5, n4);
            int n7 = 32;
            n2 = n6;
            if (n6 == 0) {
                n2 = 32;
            }
            if (n4 >= n5 || n2 > 32) break block2;
            while (n4 < n5 && n.g(string, n5, n3 = n4 + 1) <= ' ') {
                n4 = n3;
            }
            this.c = n4;
            n2 = n7;
        }
        return (char)n2;
    }

    char d() {
        char c2 = this.c();
        ++this.c;
        return c2;
    }

    float e() {
        int n2 = this.c;
        String string = this.a;
        int n3 = string.length();
        if (n2 < n3) {
            int n4;
            int n5 = n4 = string.indexOf(59, n2);
            if (n4 == -1) {
                n5 = n3;
            }
            try {
                float f2 = Float.parseFloat(string.substring(n2, n5));
                this.c = n3;
                return f2;
            }
            catch (NumberFormatException numberFormatException) {
                throw h;
            }
        }
        throw h;
    }

    long f() {
        int n2 = this.d();
        if (n2 >= 48 && n2 <= 57 || n2 >= 65 && n2 <= 70) {
            long l;
            long l2 = 0L;
            while (true) {
                n2 = n2 >= 48 && n2 <= 57 ? (n2 -= 48) : (n2 -= 55);
                l = (l2 << 4) + (long)n2;
                char c2 = this.d();
                if (c2 >= '0') {
                    n2 = c2;
                    l2 = l;
                    if (c2 <= '9') continue;
                }
                if (c2 < 'A') break;
                n2 = c2;
                l2 = l;
                if (c2 > 'F') break;
            }
            --this.c;
            return l;
        }
        throw h;
    }

    long g() {
        long l = this.a('-') ? -1L : 1L;
        long l2 = this.b("0X") ? this.f() : (long)this.h();
        return l * l2;
    }

    int h() {
        boolean bl;
        int n2 = this.d();
        int n3 = 0;
        if (n2 == 45) {
            n2 = this.d();
            bl = true;
        } else {
            bl = false;
        }
        if (n2 >= 48 && n2 <= 57) {
            char c2;
            int n4 = n2;
            do {
                n2 = n3 * 10 + (n4 - 48);
                c2 = this.d();
                if (c2 < '0') break;
                n4 = c2;
                n3 = n2;
            } while (c2 <= '9');
            --this.c;
            n3 = n2;
            if (bl) {
                n3 = -n2;
            }
            return n3;
        }
        throw h;
    }

    /*
     * Unable to fully structure code
     */
    int i(String var1_1) {
        block10: {
            block7: {
                var11_2 = this.a;
                var9_3 = this.c;
                var10_4 = this.b - var9_3;
                if (var10_4 < 0) break block7;
                var7_5 = var1_1.length();
                var6_6 = 0;
                var5_7 = -1;
                var4_8 = -1;
                var3_9 = 0;
                while (var6_6 <= var7_5) {
                    block8: {
                        block9: {
                            var2_10 = var8_11 = var1_1.indexOf(0, var6_6);
                            if (var8_11 == -1) {
                                var2_10 = var7_5;
                            }
                            if (var6_6 == var2_10) break block8;
                            var12_12 = var1_1.substring(var6_6, var2_10);
                            var8_11 = var12_12.length();
                            if (var8_11 != 0) break block9;
                            if (var4_8 >= var8_11) ** GOTO lbl-1000
                            ** GOTO lbl-1000
                        }
                        if (var8_11 > var10_4) ** GOTO lbl-1000
                        for (var6_6 = 0; var6_6 < var8_11; ++var6_6) {
                            if (var11_2.charAt(var9_3 + var6_6) == var12_12.charAt(var6_6)) {
                                continue;
                            }
                            ** GOTO lbl-1000
                        }
                        if (var4_8 < var8_11) lbl-1000:
                        // 2 sources

                        {
                            var5_7 = var3_9;
                            var4_8 = var8_11;
                            var6_6 = var2_10;
                        } else lbl-1000:
                        // 4 sources

                        {
                            var6_6 = var2_10;
                        }
                    }
                    ++var6_6;
                    ++var3_9;
                }
                var2_10 = var4_8;
                break block10;
            }
            var2_10 = -1;
            var5_7 = -1;
        }
        if (var2_10 > 0) {
            this.c = var9_3 + var2_10;
        }
        return var5_7;
    }

    /*
     * Unable to fully structure code
     */
    int j(String[] var1_1) {
        block2: {
            var8_2 = this.a;
            var5_3 = this.c;
            var6_4 = this.b - var5_3;
            var4_6 = var3_5 = -1;
            if (var6_4 < 0) break block2;
            var2_7 = var1_1.length - 1;
            block0: while (true) {
                block3: {
                    var4_6 = var3_5;
                    if (var2_7 < 0) break block2;
                    var9_9 = var1_1[var2_7];
                    var7_8 = var9_9.length();
                    if (var7_8 != 0) break block3;
                    var3_5 = var2_7;
                    ** GOTO lbl19
                }
                if (var7_8 > var6_4) ** GOTO lbl19
                for (var4_6 = 0; var4_6 < var7_8; ++var4_6) {
                    if (var8_2.charAt(var5_3 + var4_6) == var9_9.charAt(var4_6)) continue;
lbl19:
                    // 3 sources

                    --var2_7;
                    continue block0;
                }
                break;
            }
            this.c = var5_3 + var7_8;
            return var2_7;
        }
        return var4_6;
    }

    void k() {
        int n2;
        String string = this.a;
        int n3 = this.b;
        for (n2 = 0; n2 < n3 && n.g(string, n3, n2) <= ' '; ++n2) {
        }
        this.c = n2;
    }
}
