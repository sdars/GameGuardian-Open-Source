/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.ext.Config;
import android.ext.FloatPanel;
import android.ext.MainService;
import android.ext.TimeJumpPanel;
import android.ext.Tools;
import android.ext.e1;
import android.ext.g2;
import android.ext.m2;
import android.ext.n2;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class HotPoint
extends FloatPanel
implements View.OnClickListener,
View.OnLongClickListener {
    private static volatile HotPoint D;
    private boolean A;
    ImageView B;
    ImageView C;
    int p;
    int q;
    private final Runnable r = new Runnable(this){
        final HotPoint a;
        {
            this.a = hotPoint;
        }

        @Override
        public void run() {
            this.a.q();
            Tools.y1(this.a.s, 0.0f);
        }
    };
    ImageView s;
    View t;
    View u;
    TextView v;
    ProgressBar w;
    ProgressBar x;
    TextView y;
    private WindowManager.LayoutParams z;

    public HotPoint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static HotPoint getInstance() {
        HotPoint hotPoint;
        HotPoint hotPoint2 = hotPoint = D;
        if (hotPoint == null) {
            hotPoint2 = (HotPoint)d.f(2131099653, null);
            hotPoint2.r();
            D = hotPoint2;
        }
        return hotPoint2;
    }

    private void r() {
        n2.i(new Runnable(this){
            final HotPoint a;
            {
                this.a = hotPoint;
            }

            @Override
            public void run() {
                HotPoint hotPoint = this.a;
                hotPoint.t = hotPoint.findViewById(2131034287);
                this.a.t.setOnClickListener((View.OnClickListener)MainService.instance);
                hotPoint = this.a;
                hotPoint.s = (ImageView)hotPoint.findViewById(2131034288);
                hotPoint = this.a;
                hotPoint.u = hotPoint.findViewById(2131034361);
                hotPoint = this.a;
                hotPoint.v = (TextView)hotPoint.findViewById(2131034360);
                hotPoint = this.a;
                hotPoint.w = (ProgressBar)hotPoint.findViewById(2131034357);
                hotPoint = this.a;
                hotPoint.x = (ProgressBar)hotPoint.findViewById(2131034358);
                hotPoint = this.a;
                hotPoint.y = (TextView)Tools.O0(hotPoint.findViewById(2131034412));
                hotPoint = this.a;
                hotPoint.B = (ImageView)hotPoint.findViewById(2131034411);
                hotPoint = this.a;
                hotPoint.C = (ImageView)hotPoint.findViewById(2131034410);
                hotPoint = this.a;
                hotPoint.B.setOnClickListener((View.OnClickListener)hotPoint);
                hotPoint = this.a;
                hotPoint.C.setOnClickListener((View.OnClickListener)hotPoint);
                hotPoint = this.a;
                hotPoint.y.setOnLongClickListener((View.OnLongClickListener)hotPoint);
                this.a.y.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this){
                    final b a;
                    {
                        this.a = b4;
                    }

                    public void onLayoutChange(View view, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
                        this.a.a.o();
                    }
                });
                this.a.t((byte)2, -1L, 1L, 0, 1, "");
                this.a.s();
                this.a.q();
            }
        });
    }

    private void setVisibilitySpeedhack(int n3) {
        n2.i(new Runnable(this, n3){
            final int a;
            final HotPoint b;
            {
                this.b = hotPoint;
                this.a = n3;
            }

            @Override
            public void run() {
                int n3;
                int n4 = n3 = this.a;
                if (n3 == -1) {
                    n4 = this.b.B.getVisibility() == 8 ? 0 : 8;
                }
                this.b.B.setVisibility(n4);
                this.b.C.setVisibility(n4);
                this.b.setSpeedPanelVisibility(true);
                this.b.o();
                if (n4 == 0) {
                    HotPoint hotPoint = this.b;
                    if (hotPoint.p >= 0) {
                        hotPoint.v(true);
                    }
                }
            }
        });
    }

    private void w() {
        int n3;
        if (this.t == null) {
            return;
        }
        int n4 = this.getMarginX();
        View view = this.t;
        int n5 = 0;
        while (true) {
            n3 = n5;
            if (view == this) break;
            n3 = n5;
            if (view == null) break;
            n5 -= view.getLeft();
            if ((view = view.getParent()) instanceof View) continue;
            n3 = n5;
            break;
        }
        if (n4 != n3) {
            this.setMarginX(n3);
            this.l();
            this.o();
        }
    }

    public void A(String string2) {
        n2.i(new Runnable(this, string2){
            final String a;
            final HotPoint b;
            {
                this.b = hotPoint;
                this.a = string2;
            }

            @Override
            public void run() {
                this.b.y.setText((CharSequence)this.a);
                this.b.o();
            }
        });
    }

    @Override
    protected String d(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.d(string2));
        stringBuilder.append(' ');
        stringBuilder.append(this.p);
        stringBuilder.append(' ');
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    @Override
    protected String getPrefName() {
        return "pos";
    }

    public int getSize() {
        return this.q;
    }

    public int getSizePx() {
        return (int)Tools.G(48 - this.q * 2);
    }

    public int getVanishingTime() {
        return this.p;
    }

    @Override
    protected void h(SharedPreferences sharedPreferences) {
        super.h(sharedPreferences);
        this.p = sharedPreferences.getInt("vanishing-time", -1);
        this.q = Math.max(0, Math.min(12, sharedPreferences.getInt("icon-size", 0)));
    }

    @Override
    protected void i() {
        super.i();
        this.v(false);
        this.setSpeedPanelVisibility(false);
        TimeJumpPanel.s(false);
    }

    @Override
    protected void j() {
        super.j();
        int n3 = this.getSizePx();
        Config.q(this.B, n3);
        Config.q(this.C, n3);
        Config.q(this.s, n3);
        this.t.setMinimumWidth(n3);
        this.t.setMinimumHeight(n3);
        TextView textView = this.v;
        float f4 = n3;
        Tools.G1((View)textView, f4);
        Tools.x1((View)this.v, n3 * 20 / 48);
        Tools.G1((View)this.w, f4);
        textView = this.w;
        float f5 = n3 * 14 / 48;
        Tools.x1((View)textView, f5);
        Tools.G1((View)this.x, f4);
        Tools.x1((View)this.x, f5);
        textView = this.v;
        f5 = n3 * 18 / 48;
        textView.setTextSize(0, f5);
        this.y.setTextSize(0, f5);
        if (this.p < 0) {
            Tools.y1(this.s, 255.0f);
        } else {
            this.v(true);
        }
        this.setSpeedPanelVisibility(true);
        TimeJumpPanel.s(true);
    }

    @Override
    public void o() {
        super.o();
        if (this.A) {
            int n3;
            int n4;
            int n5;
            Point point = new Point(0, 0);
            WindowManager.LayoutParams layoutParams = this.a;
            layoutParams = this.a(new Point(layoutParams.x, layoutParams.y), false, point);
            if (layoutParams.x < 0) {
                layoutParams.x = 0;
            }
            if (layoutParams.x > point.x + this.getMarginX()) {
                layoutParams.x = point.x + this.getMarginX();
            }
            this.z.x = layoutParams.x + this.getWidth() / 2 - this.y.getWidth() / 2;
            this.z.y = layoutParams.y + this.getHeight();
            if (point.y != 0 && (n5 = point.y) < (n4 = layoutParams.y) + (n3 = this.y.getHeight())) {
                this.z.y = n4 - n3;
            }
            Tools.V1((View)this.y, this.z);
        }
    }

    public void onClick(View view) {
        if (view == this.B) {
            MainService.instance.T();
        } else if (view == this.C) {
            MainService.instance.u0();
        }
    }

    protected void onLayout(boolean bl, int n3, int n4, int n5, int n6) {
        super.onLayout(bl, n3, n4, n5, n6);
        this.w();
    }

    public boolean onLongClick(View view) {
        MainService.instance.K0();
        return true;
    }

    public void q() {
        this.setVisibilitySpeedhack(8);
    }

    void s() {
        WindowManager.LayoutParams layoutParams;
        this.z = layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.type = m2.b();
        layoutParams = this.z;
        layoutParams.format = -2;
        layoutParams.flags = m2.a() | 0x200;
        layoutParams = this.z;
        layoutParams.alpha = 1.0f;
        layoutParams.width = -2;
        layoutParams.height = -2;
    }

    @Override
    public void setLayoutAlpha(float f4) {
        this.z.alpha = f4;
        super.setLayoutAlpha(f4);
        TimeJumpPanel timeJumpPanel = MainService.instance.k;
        if (timeJumpPanel != null) {
            timeJumpPanel.setLayoutAlpha(f4);
        }
    }

    public void setSize(int n3) {
        if (this.q == (n3 = Math.max(0, Math.min(12, n3)))) {
            return;
        }
        new g2().g("icon-size", n3, 0).commit();
        this.q = n3;
    }

    void setSpeedPanelVisibility(boolean bl) {
        boolean bl2 = this.B.getVisibility() == 0;
        if (this.A) {
            try {
                Tools.n1((View)this.y);
            }
            catch (Throwable throwable) {
                e1.s("Failed hide speed panel", throwable);
            }
            this.A = false;
        }
        if (bl && bl2) {
            this.A = true;
            try {
                Tools.g((View)this.y, this.z);
            }
            catch (Throwable throwable) {
                e1.s("Failed add speed panel", throwable);
            }
        }
    }

    public void setVanishingTime(int n3) {
        if (this.p == n3) {
            return;
        }
        new g2().g("vanishing-time", n3, -1).commit();
        this.p = n3;
    }

    public void t(byte by, long l3, long l4, int n3, int n4, String string2) {
        if (n2.e()) {
            this.u(by, l3, l4, n3, n4, string2);
        } else {
            n2.i(new Runnable(this, by, l3, l4, n3, n4, string2){
                final byte a;
                final long b;
                final long c;
                final int d;
                final int e;
                final String f;
                final HotPoint g;
                {
                    this.g = hotPoint;
                    this.a = by;
                    this.b = l3;
                    this.c = l4;
                    this.d = n3;
                    this.e = n4;
                    this.f = string2;
                }

                @Override
                public void run() {
                    this.g.u(this.a, this.b, this.c, this.d, this.e, this.f);
                }
            });
        }
    }

    void u(byte by, long l3, long l4, int n3, int n4, String string2) {
        if (by != 0) {
            View view = this.u;
            by = by == 1 ? (byte)0 : (byte)8;
            view.setVisibility((int)by);
        }
        if (l3 >= 0L && l4 != 0L) {
            this.w.setIndeterminate(false);
            this.w.setMax((int)l4);
            this.w.setProgress((int)l3);
            this.v.setText((CharSequence)string2);
        } else {
            this.v.setText((CharSequence)string2);
            this.w.setIndeterminate(true);
        }
        if (n3 >= 0) {
            string2 = this.x;
            if (n4 <= 1) {
                string2.setVisibility(8);
            } else {
                string2.setMax(n4);
                this.x.setProgress(n3);
                this.x.setVisibility(0);
            }
        }
    }

    void v(boolean bl) {
        try {
            n2.d().removeCallbacks(this.r);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
        if (bl) {
            Tools.y1(this.s, 255.0f);
            try {
                n2.d().postDelayed(this.r, (long)(this.p * 1000));
            }
            catch (Throwable throwable) {
                e1.a(throwable);
                Tools.y1(this.s, 0.0f);
            }
        }
    }

    public void x() {
        this.setVisibilitySpeedhack(-1);
    }

    public void y(Drawable drawable2) {
        n2.i(new Runnable(this, drawable2){
            final Drawable a;
            final HotPoint b;
            {
                this.b = hotPoint;
                this.a = drawable2;
            }

            @Override
            public void run() {
                HotPoint hotPoint = this.b;
                Tools.c(hotPoint.y, this.a, 24 - hotPoint.q);
            }
        });
    }

    public void z() {
        TimeJumpPanel.s(this.g());
    }
}

