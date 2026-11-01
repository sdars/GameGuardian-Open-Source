package android.fix;

import android.content.Context;
import android.content.res.Configuration;
import android.ext.e1;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ggd.b;

/* JADX INFO: loaded from: classes.dex */
public class WrapLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f1452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1453b;

    public WrapLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1452a = ggb.f1514d;
        this.f1453b = -1;
    }

    private int a(boolean z, int i, int i2) {
        int paddingRight;
        int paddingLeft;
        View childAt;
        boolean z2;
        int[] iArr;
        WrapLayout wrapLayout = this;
        int childCount = getChildCount();
        if (!z && wrapLayout.f1452a.length == childCount * 2) {
            return 0;
        }
        int i3 = wrapLayout.f1453b;
        boolean z3 = i3 == 0;
        boolean z4 = i3 > 0;
        int[] iArr2 = new int[childCount * 2];
        int[] iArr3 = new int[childCount];
        int[] iArr4 = z4 ? new int[childCount] : null;
        if (z4) {
            paddingRight = getPaddingLeft();
            paddingLeft = getPaddingRight();
        } else {
            paddingRight = getPaddingRight();
            paddingLeft = getPaddingLeft();
        }
        int i4 = i - paddingRight;
        int i5 = i4 - paddingLeft;
        int paddingTop = getPaddingTop();
        int i6 = paddingLeft;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i8 < childCount) {
            try {
                childAt = wrapLayout.getChildAt(i8);
            } catch (ArrayIndexOutOfBoundsException unused) {
                childAt = null;
            }
            int i13 = i9;
            if (childAt == null) {
                z2 = z4;
                iArr = iArr4;
                i9 = i13;
            } else if (childAt.getVisibility() == 8) {
                if (childAt instanceof ToolbarButton) {
                    ((ToolbarButton) childAt).setIcon(false);
                }
                z2 = z4;
                iArr = iArr4;
                i9 = i13;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i14 = layoutParams.width;
                iArr = iArr4;
                z2 = z4;
                int iMakeMeasureSpec = i14 == -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
                int i15 = layoutParams.height;
                childAt.measure(iMakeMeasureSpec, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, 0));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i6 > paddingLeft && i6 + measuredWidth > i4) {
                    for (int i16 = i13; i16 < i8; i16++) {
                        int i17 = childCount + i16;
                        iArr2[i17] = iArr2[i17] + ((i7 - iArr3[i16]) / 2);
                        if (z3) {
                            iArr2[i16] = iArr2[i16] + ((paddingLeft + ((i5 - i6) / 2)) - i10);
                        }
                    }
                    i12++;
                    paddingTop += i7;
                    i6 = paddingLeft;
                    i13 = i8;
                    i7 = measuredHeight;
                    i10 = 0;
                    i11 = 0;
                } else if (i7 < measuredHeight) {
                    i7 = measuredHeight;
                }
                if (!z3) {
                    iArr2[i8] = i6;
                } else if ((i8 - i13) % 2 != 0) {
                    iArr2[i8] = i11;
                    i11 += measuredWidth;
                } else {
                    i10 -= measuredWidth;
                    iArr2[i8] = i10;
                }
                iArr2[childCount + i8] = paddingTop;
                iArr3[i8] = measuredHeight;
                if (z2) {
                    iArr[i8] = measuredWidth;
                }
                i6 += measuredWidth;
                if (childAt instanceof ToolbarButton) {
                    ((ToolbarButton) childAt).setIcon(i12 == 0);
                }
                i9 = i13;
            }
            i8++;
            wrapLayout = this;
            iArr4 = iArr;
            z4 = z2;
        }
        boolean z5 = z4;
        int[] iArr5 = iArr4;
        while (i9 < childCount) {
            int i18 = childCount + i9;
            iArr2[i18] = iArr2[i18] + ((i7 - iArr3[i9]) / 2);
            if (z3) {
                iArr2[i9] = iArr2[i9] + ((((i5 - i6) / 2) + paddingLeft) - i10);
            }
            i9++;
        }
        if (z5) {
            for (int i19 = 0; i19 < childCount; i19++) {
                iArr2[i19] = (i - iArr2[i19]) - iArr5[i19];
            }
        }
        this.f1452a = iArr2;
        return paddingTop + i7 + getPaddingBottom();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.LayoutParams;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        View childAt;
        super.onConfigurationChanged(configuration);
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            try {
                childAt = getChildAt(i);
            } catch (ArrayIndexOutOfBoundsException unused) {
                childAt = null;
            }
            if (childAt != null && (childAt instanceof ToolbarButton)) {
                ((ToolbarButton) childAt).setIcon(false);
                z = true;
            }
        }
        if (z) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        a(false, i3 - i, i4 - i2);
        int[] iArr = this.f1452a;
        for (int i5 = 0; i5 < childCount; i5++) {
            try {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i6 = iArr[i5];
                    int i7 = iArr[childCount + i5];
                    childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iA = a(true, size, size2);
        if (View.MeasureSpec.getMode(i2) == 0 || (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && iA <= size2)) {
            size2 = iA;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void playSoundEffect(int i) {
        try {
            super.playSoundEffect(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        try {
            super.sendAccessibilityEvent(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    public void setFill(int i) {
        int i2 = this.f1453b;
        this.f1453b = i;
        if (i2 != i) {
            requestLayout();
            postInvalidate();
        }
    }
}
