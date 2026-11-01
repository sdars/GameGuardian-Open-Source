package android.ext;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import android.view.WindowManager$LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$layout;

/* JADX INFO: loaded from: classes.dex */
public class HotPoint extends FloatPanel implements View$OnClickListener, View$OnLongClickListener {
    private static volatile HotPoint D;
    private boolean A;
    ImageView B;
    ImageView C;
    int p;
    int q;
    private final Runnable r;
    ImageView s;
    View t;
    View u;
    TextView v;
    ProgressBar w;
    ProgressBar x;
    TextView y;
    private WindowManager$LayoutParams z;

    public HotPoint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new HotPoint$a(this);
    }

    public static HotPoint getInstance() {
        HotPoint hotPoint = D;
        if (hotPoint != null) {
            return hotPoint;
        }
        HotPoint hotPoint2 = (HotPoint) a.d.f(R$layout.hot_point_view, null);
        hotPoint2.r();
        D = hotPoint2;
        return hotPoint2;
    }

    private void r() {
        n2.i(new HotPoint$b(this));
    }

    private void setVisibilitySpeedhack(int i) {
        n2.i(new HotPoint$d(this, i));
    }

    private void w() {
        if (this.t == null) {
            return;
        }
        int marginX = getMarginX();
        View view = this.t;
        int left = 0;
        while (view != this && view != null) {
            left -= view.getLeft();
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            } else {
                view = (View) parent;
            }
        }
        if (marginX != left) {
            setMarginX(left);
            l();
            o();
        }
    }

    public void A(String str) {
        n2.i(new HotPoint$f(this, str));
    }

    @Override // android.ext.FloatPanel
    protected String d(String str) {
        return super.d(str) + ' ' + this.p + ' ' + this.q;
    }

    @Override // android.ext.FloatPanel
    protected String getPrefName() {
        return "pos";
    }

    public int getSize() {
        return this.q;
    }

    public int getSizePx() {
        return (int) Tools.G(48 - (this.q * 2));
    }

    public int getVanishingTime() {
        return this.p;
    }

    @Override // android.ext.FloatPanel
    protected void h(SharedPreferences sharedPreferences) {
        super.h(sharedPreferences);
        this.p = sharedPreferences.getInt("vanishing-time", -1);
        this.q = Math.max(0, Math.min(12, sharedPreferences.getInt("icon-size", 0)));
    }

    @Override // android.ext.FloatPanel
    protected void i() {
        super.i();
        v(false);
        setSpeedPanelVisibility(false);
        TimeJumpPanel.s(false);
    }

    @Override // android.ext.FloatPanel
    protected void j() {
        super.j();
        int sizePx = getSizePx();
        Config.q(this.B, sizePx);
        Config.q(this.C, sizePx);
        Config.q(this.s, sizePx);
        this.t.setMinimumWidth(sizePx);
        this.t.setMinimumHeight(sizePx);
        float f2 = sizePx;
        Tools.G1(this.v, f2);
        Tools.x1(this.v, (sizePx * 20) / 48);
        Tools.G1(this.w, f2);
        float f3 = (sizePx * 14) / 48;
        Tools.x1(this.w, f3);
        Tools.G1(this.x, f2);
        Tools.x1(this.x, f3);
        float f4 = (sizePx * 18) / 48;
        this.v.setTextSize(0, f4);
        this.y.setTextSize(0, f4);
        if (this.p < 0) {
            Tools.y1(this.s, 255.0f);
        } else {
            v(true);
        }
        setSpeedPanelVisibility(true);
        TimeJumpPanel.s(true);
    }

    @Override // android.ext.FloatPanel
    public void o() {
        super.o();
        if (this.A) {
            Point point = new Point(0, 0);
            WindowManager$LayoutParams windowManager$LayoutParams = this.f137a;
            Point pointA = a(new Point(windowManager$LayoutParams.x, windowManager$LayoutParams.y), false, point);
            if (pointA.x < 0) {
                pointA.x = 0;
            }
            if (pointA.x > point.x + getMarginX()) {
                pointA.x = point.x + getMarginX();
            }
            this.z.x = (pointA.x + (getWidth() / 2)) - (this.y.getWidth() / 2);
            this.z.y = pointA.y + getHeight();
            if (point.y != 0) {
                int height = this.y.getHeight();
                int i = point.y;
                int i2 = pointA.y;
                if (i < i2 + height) {
                    this.z.y = i2 - height;
                }
            }
            Tools.V1(this.y, this.z);
        }
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        if (view == this.B) {
            MainService.instance.T();
        } else if (view == this.C) {
            MainService.instance.u0();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        w();
    }

    @Override // android.view.View$OnLongClickListener
    public boolean onLongClick(View view) {
        MainService.instance.K0();
        return true;
    }

    public void q() {
        setVisibilitySpeedhack(8);
    }

    void s() {
        WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams();
        this.z = windowManager$LayoutParams;
        windowManager$LayoutParams.gravity = 51;
        windowManager$LayoutParams.type = m2.b();
        WindowManager$LayoutParams windowManager$LayoutParams2 = this.z;
        windowManager$LayoutParams2.format = -2;
        windowManager$LayoutParams2.flags = m2.a() | 512;
        WindowManager$LayoutParams windowManager$LayoutParams3 = this.z;
        windowManager$LayoutParams3.alpha = 1.0f;
        windowManager$LayoutParams3.width = -2;
        windowManager$LayoutParams3.height = -2;
    }

    @Override // android.ext.FloatPanel
    public void setLayoutAlpha(float f2) {
        this.z.alpha = f2;
        super.setLayoutAlpha(f2);
        TimeJumpPanel timeJumpPanel = MainService.instance.k;
        if (timeJumpPanel != null) {
            timeJumpPanel.setLayoutAlpha(f2);
        }
    }

    public void setSize(int i) {
        int iMax = Math.max(0, Math.min(12, i));
        if (this.q == iMax) {
            return;
        }
        new g2().g("icon-size", iMax, 0).commit();
        this.q = iMax;
    }

    void setSpeedPanelVisibility(boolean z) {
        boolean z2 = this.B.getVisibility() == 0;
        if (this.A) {
            try {
                Tools.n1(this.y);
            } catch (Throwable th) {
                e1.s("Failed hide speed panel", th);
            }
            this.A = false;
        }
        if (z && z2) {
            this.A = true;
            try {
                Tools.g(this.y, this.z);
            } catch (Throwable th2) {
                e1.s("Failed add speed panel", th2);
            }
        }
    }

    public void setVanishingTime(int i) {
        if (this.p == i) {
            return;
        }
        new g2().g("vanishing-time", i, -1).commit();
        this.p = i;
    }

    public void t(byte b2, long j, long j2, int i, int i2, String str) {
        if (n2.e()) {
            u(b2, j, j2, i, i2, str);
        } else {
            n2.i(new HotPoint$c(this, b2, j, j2, i, i2, str));
        }
    }

    void u(byte b2, long j, long j2, int i, int i2, String str) {
        if (b2 != 0) {
            this.u.setVisibility(b2 == 1 ? 0 : 8);
        }
        if (j < 0 || j2 == 0) {
            this.v.setText(str);
            this.w.setIndeterminate(true);
        } else {
            this.w.setIndeterminate(false);
            this.w.setMax((int) j2);
            this.w.setProgress((int) j);
            this.v.setText(str);
        }
        if (i >= 0) {
            ProgressBar progressBar = this.x;
            if (i2 <= 1) {
                progressBar.setVisibility(8);
                return;
            }
            progressBar.setMax(i2);
            this.x.setProgress(i);
            this.x.setVisibility(0);
        }
    }

    void v(boolean z) {
        try {
            n2.d().removeCallbacks(this.r);
        } catch (Throwable th) {
            e1.a(th);
        }
        if (z) {
            Tools.y1(this.s, 255.0f);
            try {
                n2.d().postDelayed(this.r, this.p * 1000);
            } catch (Throwable th2) {
                e1.a(th2);
                Tools.y1(this.s, 0.0f);
            }
        }
    }

    public void x() {
        setVisibilitySpeedhack(-1);
    }

    public void y(Drawable drawable) {
        n2.i(new HotPoint$e(this, drawable));
    }

    public void z() {
        TimeJumpPanel.s(g());
    }
}
