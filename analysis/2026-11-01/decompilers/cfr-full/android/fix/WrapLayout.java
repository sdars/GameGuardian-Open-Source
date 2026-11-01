/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.Context;
import android.content.res.Configuration;
import android.ext.e1;
import android.fix.ToolbarButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import d.b;

public class WrapLayout
extends ViewGroup {
    private int[] a = d.b.d;
    private int b = -1;

    public WrapLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /*
     * Unable to fully structure code
     */
    private int a(boolean var1_1, int var2_2, int var3_3) {
        var23_4 = this.getChildCount();
        if (!var1_1 && this.a.length == var23_4 * 2) {
            return 0;
        }
        var4_5 = this.b;
        var19_6 = var4_5 == 0;
        var5_7 = var4_5 > 0 ? 1 : 0;
        var30_8 = new int[var23_4 * 2];
        var29_9 = new int[var23_4];
        var27_10 = var5_7 != 0 ? new int[var23_4] : null;
        if (var5_7 != 0) {
            var6_11 = this.getPaddingLeft();
            var4_5 = this.getPaddingRight();
        } else {
            var6_11 = this.getPaddingRight();
            var4_5 = this.getPaddingLeft();
        }
        var25_12 = var2_2 - var6_11;
        var24_13 = var25_12 - var4_5;
        var8_14 = this.getPaddingTop();
        var12_15 = var4_5;
        var11_16 = 0;
        var6_11 = 0;
        var9_18 = 0;
        var13_19 = 0;
        var10_20 = 0;
        var20_21 = var5_7;
        for (var7_17 = 0; var7_17 < var23_4; ++var7_17) {
            try {
                var28_30 = this.getChildAt(var7_17);
            }
            catch (ArrayIndexOutOfBoundsException var28_31) {
                var28_30 = null;
            }
            if (var28_30 == null) ** GOTO lbl36
            if (var28_30.getVisibility() == 8) {
                if (var28_30 instanceof ToolbarButton) {
                    ((ToolbarButton)var28_30).setIcon(false);
                }
lbl36:
                // 4 sources

                var5_7 = var11_16;
            } else {
                var31_32 = var28_30.getLayoutParams();
                var5_7 = var31_32.width;
                var5_7 = var5_7 == -1 ? View.MeasureSpec.makeMeasureSpec((int)var24_13, (int)0x40000000) : (var5_7 > 0 ? View.MeasureSpec.makeMeasureSpec((int)var5_7, (int)0x40000000) : View.MeasureSpec.makeMeasureSpec((int)var24_13, (int)-2147483648));
                var14_22 = var31_32.height;
                var14_22 = var14_22 > 0 ? View.MeasureSpec.makeMeasureSpec((int)var14_22, (int)0x40000000) : View.MeasureSpec.makeMeasureSpec((int)var3_3, (int)0);
                var28_30.measure(var5_7, var14_22);
                var26_29 = var28_30.getMeasuredWidth();
                var21_27 = var28_30.getMeasuredHeight();
                if (var12_15 > var4_5 && var12_15 + var26_29 > var25_12) {
                    for (var5_7 = var6_11; var5_7 < var7_17; ++var5_7) {
                        var6_11 = var23_4 + var5_7;
                        var30_8[var6_11] = var30_8[var6_11] + (var11_16 - var29_9[var5_7]) / 2;
                        if (!var19_6) continue;
                        var30_8[var5_7] = var30_8[var5_7] + (var4_5 + (var24_13 - var12_15) / 2 - var9_18);
                    }
                    var15_23 = var10_20 + 1;
                    var14_22 = var8_14 + var11_16;
                    var22_28 = var4_5;
                    var17_25 = var7_17;
                    var5_7 = var21_27;
                    var16_24 = 0;
                    var18_26 = 0;
                } else {
                    var5_7 = var11_16;
                    var22_28 = var12_15;
                    var14_22 = var8_14;
                    var16_24 = var9_18;
                    var18_26 = var13_19;
                    var15_23 = var10_20;
                    var17_25 = var6_11;
                    if (var11_16 < var21_27) {
                        var5_7 = var21_27;
                        var17_25 = var6_11;
                        var15_23 = var10_20;
                        var18_26 = var13_19;
                        var16_24 = var9_18;
                        var14_22 = var8_14;
                        var22_28 = var12_15;
                    }
                }
                if (var19_6) {
                    if ((var7_17 - var17_25) % 2 != 0) {
                        var30_8[var7_17] = var18_26;
                        var18_26 += var26_29;
                    } else {
                        var30_8[var7_17] = var16_24 -= var26_29;
                    }
                } else {
                    var30_8[var7_17] = var22_28;
                }
                var30_8[var23_4 + var7_17] = var14_22;
                var29_9[var7_17] = var21_27;
                if (var20_21 != 0) {
                    var27_10[var7_17] = var26_29;
                }
                var12_15 = var22_28 + var26_29;
                if (var28_30 instanceof ToolbarButton) {
                    var28_30 = (ToolbarButton)var28_30;
                    var1_1 = var15_23 == 0;
                    var28_30.setIcon(var1_1);
                }
                var6_11 = var17_25;
                var10_20 = var15_23;
                var13_19 = var18_26;
                var9_18 = var16_24;
                var8_14 = var14_22;
            }
            var11_16 = var5_7;
        }
        while (var6_11 < var23_4) {
            var3_3 = var23_4 + var6_11;
            var30_8[var3_3] = var30_8[var3_3] + (var11_16 - var29_9[var6_11]) / 2;
            if (var19_6) {
                var30_8[var6_11] = var30_8[var6_11] + ((var24_13 - var12_15) / 2 + var4_5 - var9_18);
            }
            ++var6_11;
        }
        if (var20_21 != 0) {
            for (var3_3 = 0; var3_3 < var23_4; ++var3_3) {
                var30_8[var3_3] = var2_2 - var30_8[var3_3] - var27_10[var3_3];
            }
        }
        this.a = var30_8;
        return var8_14 + var11_16 + this.getPaddingBottom();
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.LayoutParams;
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int n3 = this.getChildCount();
        boolean bl = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            try {
                configuration = this.getChildAt(i3);
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                configuration = null;
            }
            if (configuration == null || !(configuration instanceof ToolbarButton)) continue;
            ((ToolbarButton)configuration).setIcon(false);
            bl = true;
        }
        if (bl) {
            this.requestLayout();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onLayout(boolean bl, int n3, int n4, int n5, int n6) {
        int n7 = this.getChildCount();
        int n8 = 0;
        this.a(false, n5 - n3, n6 - n4);
        int[] nArray = this.a;
        n3 = n8;
        while (true) {
            block5: {
                View view;
                if (n3 >= n7) {
                    return;
                }
                try {
                    view = this.getChildAt(n3);
                    if (view == null || view.getVisibility() == 8) break block5;
                    n6 = view.getMeasuredWidth();
                    n5 = view.getMeasuredHeight();
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
                n4 = nArray[n3];
                n8 = nArray[n7 + n3];
                view.layout(n4, n8, n6 + n4, n5 + n8);
            }
            ++n3;
        }
    }

    protected void onMeasure(int n3, int n4) {
        int n5;
        block3: {
            int n6;
            block2: {
                n5 = View.MeasureSpec.getSize((int)n3);
                int n7 = View.MeasureSpec.getSize((int)n4);
                n6 = this.a(true, n5, n7);
                if (View.MeasureSpec.getMode((int)n4) == 0) break block2;
                n3 = n7;
                if (View.MeasureSpec.getMode((int)n4) != Integer.MIN_VALUE) break block3;
                n3 = n7;
                if (n6 > n7) break block3;
            }
            n3 = n6;
        }
        this.setMeasuredDimension(n5, n3);
    }

    public void playSoundEffect(int n3) {
        try {
            super.playSoundEffect(n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void sendAccessibilityEvent(int n3) {
        try {
            super.sendAccessibilityEvent(n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void setFill(int n3) {
        int n4 = this.b;
        this.b = n3;
        if (n4 != n3) {
            this.requestLayout();
            this.postInvalidate();
        }
    }
}

