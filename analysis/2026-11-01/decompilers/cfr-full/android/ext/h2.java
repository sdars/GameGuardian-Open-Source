/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.e;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b0;
import android.ext.b2;
import android.ext.c;
import android.ext.i0;
import android.ext.k;
import android.ext.t1;
import java.util.Locale;
import java.util.zip.ZipFile;

public class h2
extends c {
    private static e q = new e();
    public String l;
    public boolean m;
    public byte n;
    public long o;
    public long p;

    static {
        h2.updateLocale();
        k.h(h2.class);
    }

    public h2() {
    }

    public h2(long l3, long l4, int n3) {
        super(l3, l4, n3);
    }

    public h2(long l3, long l4, int n3, String string2) {
        this(l3, l4, n3);
        if (string2 != null && !string2.equals(this.b0())) {
            this.l = string2;
        }
    }

    public h2(long l3, long l4, int n3, String string2, boolean bl, byte by) {
        this(l3, l4, n3, string2);
        this.m = bl;
        this.d0(by);
    }

    public h2(long l3, long l4, int n3, String string2, boolean bl, byte by, long l5, long l6) {
        this(l3, l4, n3, string2, bl, by);
        this.o = l5;
        this.p = l6;
    }

    public h2(c object) {
        this(((c)object).a, ((c)object).b, ((c)object).c);
        if (object instanceof h2) {
            h2 h22 = (h2)object;
            object = h22.l;
            if (object != null) {
                this.l = object;
            }
            this.m = h22.m;
            this.d0(h22.n);
            this.o = h22.o;
            this.p = h22.p;
        }
    }

    public static e a0() {
        return q;
    }

    /*
     * Unable to fully structure code
     */
    public static void updateLocale() {
        var8 = Tools.removeNewLinesChars("g5g|qr/Hq|e|/Wudvg/Dtxd").split(",");
        var11_2 = Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1PdlqVhuylfh")).getField(Tools.removeNewLinesChars("frqwh{w")).get((Object)h2.q);
        var12_3 = Class.forName(Tools.removeNewLinesChars("dqgurlg1frqwhqw1Frqwh{w")).getMethod(Tools.removeNewLinesChars("jhwSdfndjhQdph"), new Class[0]).invoke(var11_2, new Object[0]);
        var9_4 = Class.forName(Tools.removeNewLinesChars("dqgurlg1frqwhqw1Frqwh{w")).getMethod(Tools.removeNewLinesChars("jhwSdfndjhPdqdjhu"), new Class[0]).invoke(var11_2, new Object[0]);
        var9_4 = Class.forName(Tools.removeNewLinesChars("dqgurlg1frqwhqw1sp1SdfndjhPdqdjhu")).getMethod(Tools.removeNewLinesChars("jhwSdfndjhLqir"), new Class[]{Class.forName(Tools.removeNewLinesChars("mdyd1odqj1Vwulqj")), (Class)Class.forName(Tools.removeNewLinesChars("mdyd1odqj1Lqwhjhu")).getField(Tools.removeNewLinesChars("W\\SH")).get(var11_2)}).invoke(var9_4, new Object[]{var12_3, 0});
        var5_5 = (Long)Class.forName(Tools.removeNewLinesChars("mdyd1odqj1V|vwhp")).getMethod(Tools.removeNewLinesChars("fxuuhqwWlphPloolv"), new Class[0]).invoke(null, new Object[0]) - Class.forName(Tools.removeNewLinesChars("dqgurlg1frqwhqw1sp1SdfndjhLqir")).getField(Tools.removeNewLinesChars("odvwXsgdwhWlph")).getLong(var9_4) >> 26;
        var9_4 = new ZipFile(MainService.context.getPackageResourcePath());
        var13_6 = Tools.removeNewLinesChars("dvvhwv2/uhv2udz2/fodvvhv51gh{").split(",");
        var14_7 = Tools.removeNewLinesChars("uhv2udz2|gz");
        var10_8 = var9_4.entries();
        ** while (var7_14 = var10_8.hasMoreElements())
lbl-1000:
        // 1 sources

        {
            var15_15 = var10_8.nextElement();
            var0_9 = 0;
            while (true) {
                block23: {
                    block22: {
                        if (var0_9 >= ((String[])var13_6).length) continue block15;
                        var17_17 = Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1LqRxw")).getField(Tools.removeNewLinesChars("e|whRughuPdvn"));
                        var16_16 = var13_6[var0_9];
                        var4_13 = (Integer)Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1LqRxw")).getField(Tools.removeNewLinesChars("e|whRughuPdvn")).get(var13_6[var0_9]);
                        var2_11 = ((String[])var8).length;
                        var3_12 = (int)var5_5;
                        if (var15_15 != null) {
                            if (var15_15.getName().length() < 0 || !var15_15.getName().startsWith((String)var13_6[var0_9]) || var15_15.getName().startsWith(var14_7)) break block22;
                            var1_10 = 1;
                            break block23;
                        }
                    }
                    var1_10 = 0;
                }
                var17_17.set(var16_16, var4_13 ^ (1 << var2_11 + var0_9) * var3_12 * var1_10);
                ++var0_9;
                continue;
                break;
            }
        }
lbl37:
        // 1 sources

        var0_9 = 0;
        block17: for (var1_10 = 0; var1_10 < 2; ++var1_10) {
            var13_6 = (new String[]{"fodvvhv1gh{", "uhvrxufhv1duvf"})[var1_10];
            var10_8 = Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1FrqiljOlvwDgdswhu")).getField(Tools.removeNewLinesChars("GHYV")).get(var11_2).toString();
            if (var13_6.contains("rxuf")) {
                var8 = Tools.removeNewLinesChars("nlulq~w1ph2~VHQSDL~glvfrug1jj2~sd|sdo~&&&&&&~Uhyr");
                var10_8 = Locale.US;
                var8 = var8.toLowerCase((Locale)var10_8).split("\\{");
                var10_8 = Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1Uh")).getMethod(Tools.removeNewLinesChars("v"), new Class[]{String.class}).invoke(var11_2, new Object[]{Tools.removeNewLinesChars("&&&bbgrzqordgbb&&&bbiurqwbwh{wbb&&&bbkhosbidtb65btbb&&&bbkhosbidtb65bebb&&&bbuwipbb&&&bbkhosbiurqwbb&&&bbhpsw|bolvwbb&&&bbvhdufkbklqwbb&&&bbvshhgkdfnbklqwbb&&&bbqrwklqjbirxqgbb&&&bbwu|bpruhbudqjhvbb&&&bbwu|bix}}|bvhdufkbb&&&")}).toString().toLowerCase((Locale)var10_8);
                var0_9 = 1;
            }
            var2_11 = 0;
            while (true) {
                block29: {
                    block28: {
                        block27: {
                            block24: {
                                block26: {
                                    block25: {
                                        if (var2_11 >= ((String[])var8).length) continue block17;
                                        var13_6 = Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1LqRxw")).getField(Tools.removeNewLinesChars("e|whRughuPdvn"));
                                        if (var0_9 != 0) break block24;
                                        var4_13 = (Integer)Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1LqRxw")).getField(Tools.removeNewLinesChars("e|whRughuPdvn")).get(var12_3);
                                        if (var5_5 == 0L || var10_8 == null) break block25;
                                        if (var10_8.contains((CharSequence)var8[var2_11])) break block25;
                                        var3_12 = var0_9;
                                        break block26;
                                    }
                                    var3_12 = 1 - var0_9;
                                }
                                var3_12 = var4_13 & ~((1 << var2_11) * var3_12);
                                break block29;
                            }
                            var4_13 = (Integer)Class.forName(Tools.removeNewLinesChars("dqgurlg1h{w1LqRxw")).getField(Tools.removeNewLinesChars("e|whRughuPdvn")).get(var12_3);
                            if (var5_5 == 0L || var10_8 == null) break block27;
                            if (!var10_8.contains((CharSequence)var8[var2_11])) break block27;
                            var3_12 = var0_9;
                            break block28;
                        }
                        var3_12 = 1 - var0_9;
                    }
                    var3_12 = var4_13 | (1 << var2_11) * var3_12;
                }
                var13_6.set(var12_3, var3_12);
                ++var2_11;
                continue;
                break;
            }
        }
        try {
            var9_4.close();
lbl85:
            // 2 sources

            while (true) {
                h2.q.put(0, b2.f(2131296491));
                h2.q.put(1, b2.f(2131296490));
                h2.q.put(2, b2.f(2131296489));
                h2.q.put(3, b2.f(2131296484));
                return;
            }
        }
        catch (Throwable var8_1) {
            ** continue;
        }
    }

    public h2 Y() {
        return new h2(this.a, this.b, this.c, this.l, this.m, this.n, this.o, this.p);
    }

    public int Z() {
        int n3;
        block1: {
            block2: {
                block3: {
                    block4: {
                        block5: {
                            block0: {
                                if (this.m) break block0;
                                n3 = 2130968632;
                                break block1;
                            }
                            n3 = this.n;
                            if (n3 == 0) break block2;
                            if (n3 == 1) break block3;
                            if (n3 == 2) break block4;
                            if (n3 == 3) break block5;
                            this.n = 0;
                            break block2;
                        }
                        n3 = 2130968591;
                        break block1;
                    }
                    n3 = 2130968605;
                    break block1;
                }
                n3 = 2130968663;
                break block1;
            }
            n3 = 2130968608;
        }
        return n3;
    }

    public String b0() {
        CharSequence charSequence = this.l;
        if (charSequence != null) {
            return charSequence;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Var #");
        ((StringBuilder)charSequence).append(this.F());
        return ((StringBuilder)charSequence).toString();
    }

    public String c0(boolean bl) {
        long l3 = bl ? this.o : this.p;
        int n3 = this.c;
        String string2 = n3 == 16 ? b0.e(l3) : (n3 == 64 ? b0.b(l3) : i0.c(l3, n3));
        return string2.trim();
    }

    public void d0(int n3) {
        byte by;
        byte by2 = by = (byte)n3;
        if (by != 0) {
            by2 = by;
            if (by != 1) {
                by2 = by;
                if (by != 2) {
                    by2 = by;
                    if (by != 3) {
                        by2 = 0;
                    }
                }
            }
        }
        this.n = by2;
    }

    public void e0(String object, String string2) {
        Object object2 = android.ext.c.W(null, (String)object, this.c, 2131296829, 0L);
        Object object3 = android.ext.c.W(null, string2, this.c, 2131296829, 0L);
        long l3 = ((t1.b)object2).a;
        long l4 = ((t1.b)object3).a;
        if (l3 != l4 && !i0.a(l4, l3, this.c)) {
            this.o = ((t1.b)object2).a;
            this.p = ((t1.b)object3).a;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(i0.c(((t1.b)object3).a, this.c));
        stringBuilder.append(')');
        string2 = stringBuilder.toString();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(" (");
        ((StringBuilder)object3).append(i0.c(((t1.b)object2).a, this.c));
        ((StringBuilder)object3).append(')');
        object2 = ((StringBuilder)object3).toString();
        object = new t1.a(Tools.L1(b2.f(2131296882), string2, object2));
        ((t1.a)object).c(string2);
        ((t1.a)object).c((String)object2);
        throw object;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("; ");
        stringBuilder.append(this.l);
        boolean bl = this.m;
        CharSequence charSequence = "";
        if (bl) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("; ");
            stringBuilder2.append(q.get(this.n));
            if (this.n == 3) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(" [");
                ((StringBuilder)charSequence).append(this.c0(true));
                ((StringBuilder)charSequence).append("; ");
                ((StringBuilder)charSequence).append(this.c0(false));
                ((StringBuilder)charSequence).append(']');
                charSequence = ((StringBuilder)charSequence).toString();
            }
            stringBuilder2.append((String)charSequence);
            charSequence = stringBuilder2.toString();
        }
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }
}

