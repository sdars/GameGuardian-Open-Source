/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.f;
import android.ext.h2;
import android.ext.p1;
import android.ext.t1;
import android.ext.x0;
import android.view.View;
import d.a;

public class d0
extends p1 {
    public d0() {
        super(2131296340, 2130968598);
    }

    /*
     * Unable to fully structure code
     */
    private void h(e var1_1, StringBuilder var2_2, c var3_3, int var4_4) {
        if (var1_1 != null) {
            if (var1_1.c == 0L) {
                var1_1.c = var3_3.a;
            }
            var6_5 = var3_3.D();
            var8_6 = var3_3.b;
            for (var4_4 = 0; var4_4 < var6_5; ++var4_4) {
                var10_8 = var3_3.a + (long)var4_4;
                if (var1_1.c <= var10_8) {
                    var2_2 = var1_1.a;
                    var7_7 = var1_1.b;
                    var1_1.b = var7_7 + 1;
                    var2_2[var7_7] = (byte)(255L & var8_6);
                    var1_1.c = var10_8;
                }
                var8_6 >>= 8;
            }
            return;
        }
        if (var2_2.length() != 0) {
            var2_2.append(';');
        }
        if ((var4_4 & 2) != 0) {
            var2_2.append(var3_3.O());
            var5_9 = 114;
lbl24:
            // 2 sources

            while (true) {
                var2_2.append((char)var5_9);
                break;
            }
        } else {
            if ((var4_4 & 1) != 0) {
                var2_2.append(var3_3.L());
                var5_9 = 104;
                ** continue;
            }
            var2_2.append(var3_3.J());
        }
        if ((var4_4 & 4) != 0) {
            var2_2.append(var3_3.z());
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void i(int var1_1) {
        block37: {
            block39: {
                block38: {
                    var23_2 = MainService.instance.z();
                    var22_3 = new StringBuilder();
                    var9_4 = Integer.numberOfTrailingZeros(var1_1 & 1008);
                    var21_5 = var9_4 != 32 ? new e() : null;
                    var19_6 = var23_2 instanceof a;
                    var13_7 = 0L;
                    if (!var19_6) break block38;
                    var24_8 = (a)var23_2;
                    var23_2 = new c();
                    var10_9 = var24_8.i();
                    var11_10 = 0L;
                    var4_11 /* !! */  = 0;
                    var7_12 = 0;
                    var5_13 = 0;
                    while (true) {
                        var3_14 = var4_11 /* !! */ ;
                        var17_18 = var13_7;
                        var15_17 = var11_10;
                        var6_15 = var5_13;
                        if (var7_12 >= var10_9) break;
                        if (!var24_8.c(var7_12)) {
                            var6_15 = var4_11 /* !! */ ;
                            var17_18 = var13_7;
                        } else {
                            var3_14 = var4_11 /* !! */ ;
                            var15_17 = var13_7;
                            var13_7 = var11_10;
                            if (var4_11 /* !! */  < 100) {
                                var24_8.f(var7_12, (c)var23_2);
                                this.h(var21_5, (StringBuilder)var22_3, (c)var23_2, var1_1);
                                var15_17 = var23_2.a;
                                if (var4_11 /* !! */  == 0) {
                                    var11_10 = var15_17;
                                }
                                var3_14 = var4_11 /* !! */  + 1;
                                var13_7 = var11_10;
                            }
                            var4_11 /* !! */  = var8_16 = var5_13 + 1;
                            var6_15 = var3_14;
                            var17_18 = var15_17;
                            var11_10 = var13_7;
                            var5_13 = var4_11 /* !! */ ;
                            if (var8_16 > 100) {
                                var17_18 = var15_17;
                                var15_17 = var13_7;
                                var6_15 = var4_11 /* !! */ ;
                                break;
                            }
                        }
                        ++var7_12;
                        var4_11 /* !! */  = var6_15;
                        var13_7 = var17_18;
                    }
                    var13_7 = var17_18;
                    var4_11 /* !! */  = var6_15;
                    var11_10 = var15_17;
                    break block37;
                }
                if (var23_2 instanceof d.e) {
                    var23_2 = (d.e)var23_2;
                    var8_16 = var23_2.l();
                    var11_10 = 0L;
                    var7_12 = 0;
                    var3_14 = 0;
                    var5_13 = 0;
                    while (true) {
                        var15_17 = var13_7;
                        var4_11 /* !! */  = var3_14;
                        var6_15 = var5_13;
                        var17_18 = var11_10;
                        if (var7_12 >= var8_16) break;
                        if (!var23_2.a(var7_12)) {
                            var17_18 = var13_7;
                        } else {
                            var24_8 = (h2)var23_2.n(var7_12);
                            if (!(var24_8 instanceof h2)) {
                                var17_18 = var13_7;
                            } else {
                                var15_17 = var13_7;
                                var4_11 /* !! */  = var3_14;
                                var13_7 = var11_10;
                                if (var3_14 < 100) {
                                    this.h(var21_5, (StringBuilder)var22_3, (c)var24_8, var1_1);
                                    var15_17 = var24_8.a;
                                    if (var3_14 == 0) {
                                        var11_10 = var15_17;
                                    }
                                    var4_11 /* !! */  = var3_14 + 1;
                                    var13_7 = var11_10;
                                }
                                var6_15 = var5_13 + 1;
                                var17_18 = var15_17;
                                var3_14 = var4_11 /* !! */ ;
                                var5_13 = var6_15;
                                var11_10 = var13_7;
                                if (var6_15 > 100) {
                                    var17_18 = var13_7;
                                    break;
                                }
                            }
                        }
                        ++var7_12;
                        var13_7 = var17_18;
                    }
                    var11_10 = var17_18;
                    var3_14 = var4_11 /* !! */ ;
                    var13_7 = var15_17;
lbl100:
                    // 2 sources

                    while (true) {
                        var4_11 /* !! */  = var6_15;
                        break block37;
                        break;
                    }
                }
                if (!(var23_2 instanceof boolean[])) break block39;
                var24_8 = MainService.instance.N;
                var25_19 = (boolean[])var23_2;
                var8_16 = var25_19.length;
                var11_10 = 0L;
                var7_12 = 1;
                var3_14 = 0;
                var5_13 = 0;
                var15_17 = var13_7;
                while (true) {
                    block42: {
                        block40: {
                            block41: {
                                var13_7 = var15_17;
                                var4_11 /* !! */  = var3_14;
                                var6_15 = var5_13;
                                var17_18 = var11_10;
                                if (var7_12 >= var8_16 - 1) break block40;
                                if (var25_19[var7_12]) break block41;
                                var17_18 = var15_17;
                                break block42;
                            }
                            var4_11 /* !! */  = var3_14;
                            var13_7 = var11_10;
                            if (var3_14 < 100) {
                                var23_2 = (c)var24_8.getItem(var7_12);
                                this.h(var21_5, (StringBuilder)var22_3, (c)var23_2, var1_1);
                                var15_17 = var23_2.a;
                                if (var3_14 == 0) {
                                    var11_10 = var15_17;
                                }
                                var4_11 /* !! */  = var3_14 + 1;
                                var13_7 = var11_10;
                            }
                            var6_15 = var5_13 + 1;
                            var17_18 = var15_17;
                            var3_14 = var4_11 /* !! */ ;
                            var5_13 = var6_15;
                            var11_10 = var13_7;
                            if (var6_15 <= 100) break block42;
                            var17_18 = var13_7;
                            var13_7 = var15_17;
                        }
                        var11_10 = var17_18;
                        var3_14 = var4_11 /* !! */ ;
                        ** continue;
                    }
                    ++var7_12;
                    var15_17 = var17_18;
                }
            }
            var13_7 = 0L;
            var11_10 = 0L;
            var3_14 = 0;
            var4_11 /* !! */  = 0;
        }
        var5_13 = var21_5 == null ? 2 : 1;
        if (var3_14 < var5_13) {
            Tools.J1(Tools.L1(b2.f(2131296798), new Object[]{var5_13}));
        } else {
            if (var4_11 /* !! */  > var3_14) {
                Tools.J1(Tools.L1(b2.f(2131297077), new Object[]{var3_14}));
            }
            var2_20 = ':';
            if (var21_5 != null) {
                if (var9_4 != 4 && var9_4 != 5) {
                    if (var9_4 == 6) {
                        var22_3.append('h');
                        var24_8 = x0.a;
                        var23_2 = var21_5.a;
                        var3_14 = var21_5.b;
                        for (var1_1 = 0; var1_1 < var3_14; ++var1_1) {
                            var22_3.append(' ');
                            var4_11 /* !! */  = (int)var23_2[var1_1];
                            var22_3.append((char)var24_8[(var4_11 /* !! */  & 240) >> 4]);
                            var22_3.append((char)var24_8[var4_11 /* !! */  & 15]);
                        }
                    } else {
                        var22_3.append('Q');
                        var22_3.append(' ');
                        var23_2 = var21_5.a;
                        var1_1 = var21_5.b;
                        var19_6 = var9_4 == 7 || var9_4 == 9;
                        var20_21 = var9_4 == 8 || var9_4 == 9;
                        x0.b((StringBuilder)var22_3, 0, (byte[])var23_2, var1_1, var19_6, var20_21, null);
                    }
                } else {
                    var19_6 = var9_4 == 5;
                    if (var19_6) {
                        var2_20 = ';';
                    }
                    var22_3.append(var2_20);
                    var22_3.append(new String(var21_5.a, 0, var21_5.b, t1.i(var19_6)));
                }
            } else if ((var1_1 & 8) != 0) {
                var22_3.append(':');
                var22_3.append(var13_7 + 1L - var11_10);
            }
            var23_2 = var22_3.toString();
            var22_3 = new DialogInterface.OnClickListener(this, (String)var23_2){
                final String a;
                final d0 b;
                {
                    this.b = d02;
                    this.a = string2;
                }

                public void onClick(DialogInterface dialogInterface, int n3) {
                    if (n3 == -1) {
                        Tools.A(this.a, true);
                    } else {
                        MainService.instance.m.setCurrentTab(1);
                        MainService.instance.W.u(this.a);
                    }
                }
            };
            if (var21_5 == null && var13_7 - var11_10 >= 65535L) {
                f.o(f.b().setMessage((CharSequence)Tools.L1(b2.f(2131297015), new Object[]{var13_7 + 1L - var11_10, 65535})).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(this, (String)var23_2, (DialogInterface.OnClickListener)var22_3){
                    final String a;
                    final DialogInterface.OnClickListener b;
                    final d0 c;
                    {
                        this.c = d02;
                        this.a = string2;
                        this.b = onClickListener;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        this.c.j(this.a, this.b);
                    }
                }).setNegativeButton((CharSequence)b2.f(2131296311), null));
            } else {
                this.j((String)var23_2, (DialogInterface.OnClickListener)var22_3);
            }
        }
    }

    void j(String string2, DialogInterface.OnClickListener onClickListener) {
        f.o(f.b().setMessage((CharSequence)string2).setPositiveButton((CharSequence)b2.f(2131296338), onClickListener).setNeutralButton((CharSequence)b2.f(2131296942), onClickListener).setNegativeButton((CharSequence)b2.f(2131296311), null));
    }

    @Override
    public void onClick(View object) {
        String string2 = b2.f(2131296472);
        String string3 = b2.f(2131296473);
        String string4 = b2.f(2131296263);
        String string5 = b2.f(2131296262);
        int n3 = Config.y;
        boolean[] blArray = new boolean[10];
        for (int i3 = 0; i3 < 10; ++i3) {
            boolean bl = (1 << i3 & n3) != 0;
            blArray[i3] = bl;
        }
        object = new DialogInterface.OnClickListener(this, blArray){
            final boolean[] a;
            final d0 b;
            {
                this.b = d02;
                this.a = blArray;
            }

            public void onClick(DialogInterface object, int n3) {
                int n4 = 0;
                int n5 = 0;
                if (n3 == -1) {
                    n3 = 0;
                    for (n4 = n5; n4 < ((DialogInterface)(object = (Object)this.a)).length; ++n4) {
                        if (object[n4] != false) {
                            n3 |= 1 << n4;
                            continue;
                        }
                        n3 &= ~(1 << n4);
                    }
                    n4 = n3;
                }
                Config.b((int)2131034158).d = n4;
                Config.k();
                this.b.i(n4);
            }
        };
        AlertDialog.Builder builder = f.c(Tools.k0()).setCustomTitle(Tools.g0(2131296340));
        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener(this, blArray){
            final boolean[] a;
            final d0 b;
            {
                this.b = d02;
                this.a = blArray;
            }

            public void onClick(DialogInterface dialogInterface, int n3, boolean bl) {
                this.a[n3] = bl;
                if (bl) {
                    int n4 = n3 >= 4 ? n3 : 0;
                    if ((dialogInterface = ((AlertDialog)dialogInterface).getListView()) != null) {
                        boolean[] blArray;
                        for (n3 = 0; n3 < (blArray = this.a).length; ++n3) {
                            int n5 = n3 >= 4 ? n3 : 0;
                            if (n4 == n5) continue;
                            blArray[n3] = false;
                            dialogInterface.setItemChecked(n3, false);
                        }
                    }
                }
            }
        };
        f.o(builder.setMultiChoiceItems(new CharSequence[]{string2, string3, string4, string5, "UTF-8", "UTF-16LE", "HEX", "HEX + UTF-8", "HEX + UTF-16LE", "HEX + UTF-8 + UTF-16LE"}, blArray, onMultiChoiceClickListener).setPositiveButton((CharSequence)b2.f(2131297115), (DialogInterface.OnClickListener)object).setNegativeButton((CharSequence)b2.f(2131296805), null));
    }

    static class e {
        byte[] a = new byte[800];
        int b = 0;
        long c = 0L;

        e() {
        }
    }
}

