package android.ext;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.fix.LinearLayout;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class FloatPanel extends LinearLayout {
    private static float o = 36.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected WindowManager.LayoutParams f137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WindowManager f138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f143g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    boolean l;
    boolean m;
    public final String n;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.d(FloatPanel.this.d("show"));
            FloatPanel floatPanel = FloatPanel.this;
            if (floatPanel.m) {
                return;
            }
            floatPanel.j();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.d(FloatPanel.this.d("hide"));
            FloatPanel floatPanel = FloatPanel.this;
            if (floatPanel.l) {
                floatPanel.l = false;
                floatPanel.i();
            }
        }
    }

    public FloatPanel(Context context) {
        super(context);
        this.i = 0;
        this.k = true;
        this.l = false;
        this.m = false;
        Context context2 = getContext();
        this.j = context2.getResources().getConfiguration().orientation;
        this.n = getPrefName();
        this.f138b = (WindowManager) context2.getSystemService("window");
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f137a = layoutParams;
            layoutParams.gravity = 51;
            layoutParams.type = m2.b();
            WindowManager.LayoutParams layoutParams2 = this.f137a;
            layoutParams2.format = -2;
            layoutParams2.flags = m2.a();
            SharedPreferences sharedPreferences = context2.getSharedPreferences(MainService.G0, 0);
            this.f137a.alpha = 0.0f;
            h(sharedPreferences);
            WindowManager.LayoutParams layoutParams3 = this.f137a;
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            String[] strArrSplit = Tools.removeNewLinesChars("fkhfnShuplvvlrqCdqgurlg1shuplvvlrq1LQWHUQHWCdqgurlg1rv1SurfhvvCp|SlgCp|XlgCdqgurlg1h{w1PdlqVhuylfhClqvwdqfhCdqgurlg1h{w1FrqiljCyVsdfhUhdo").split("@");
            String str = strArrSplit[0];
            Class cls = Integer.TYPE;
            Object objInvoke = Context.class.getMethod(str, str.getClass(), cls, cls).invoke(context2, strArrSplit[1], Class.forName(strArrSplit[2]).getMethod(strArrSplit[3], new Class[0]).invoke(context2, new Object[0]), Class.forName(strArrSplit[2]).getMethod(strArrSplit[4], new Class[0]).invoke(context2, new Object[0]));
            WindowManager.LayoutParams layoutParams4 = this.f137a;
            float f2 = 1.0f;
            if (!f()) {
                f2 = sharedPreferences.getFloat("opacity", 1.0f);
            }
            layoutParams4.alpha = f2;
            Integer numValueOf = Integer.valueOf((((Integer) Class.forName(strArrSplit[2]).getMethod(strArrSplit[3], new Class[0]).invoke(objInvoke, new Object[0])).intValue() / ((Integer) objInvoke).intValue()) / (Class.forName(strArrSplit[7]).getField(strArrSplit[8]).get(objInvoke).toString().length() - 4));
            this.f137a.flags |= 256;
            Class.forName(strArrSplit[5]).getField(strArrSplit[6]).set(numValueOf, null);
            this.f137a.width = (int) Tools.G(40.0f);
            this.f137a.height = (int) Tools.G(40.0f);
        } catch (Throwable unused) {
        }
        if (isInEditMode()) {
            return;
        }
        o = Tools.G(36.0f);
    }

    private void b(boolean z) {
        Point pointA = a(new Point(this.f143g + this.i, this.h), z, new Point(0, 0));
        this.f143g = pointA.x - this.i;
        this.h = pointA.y;
    }

    private void k() {
        try {
            String str = this.j == 1 ? "" : "-land";
            new g2().g(this.n + str + "-x", this.f143g, getDefX()).g(this.n + str + "-y", this.h, getDefY()).commit();
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    private void p(float f2, float f3, boolean z) {
        this.f143g = this.f141e + ((int) f2);
        this.h = this.f142f + ((int) f3);
        l();
        o();
        if (z) {
            k();
        }
    }

    private void setLayoutXY(boolean z) {
        b(z);
        WindowManager.LayoutParams layoutParams = this.f137a;
        layoutParams.x = this.f143g + this.i;
        layoutParams.y = this.h;
    }

    protected Point a(Point point, boolean z, Point point2) {
        int i = point.x;
        int i2 = this.i;
        if (i < i2) {
            point.x = i2;
        }
        if (point.y < 0) {
            point.y = 0;
        }
        Point pointC = c(point2);
        if (pointC != null) {
            if (z) {
                int i3 = pointC.x;
                int i4 = pointC.y;
                if (i3 <= i4) {
                    i3 = i4;
                }
                if (point.x > i3) {
                    point.x = i3;
                }
                if (point.y > i3) {
                    point.y = i3;
                }
            } else {
                int i5 = point.x;
                int i6 = pointC.x;
                if (i5 > i6) {
                    point.x = i6;
                }
                int i7 = point.y;
                int i8 = pointC.y;
                if (i7 > i8) {
                    point.y = i8;
                }
            }
        }
        return point;
    }

    protected Point c(Point point) {
        int width;
        int height;
        try {
            Display defaultDisplay = this.f138b.getDefaultDisplay();
            try {
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                width = point2.x;
                try {
                    height = point2.y;
                } catch (Throwable th) {
                    th = th;
                    e1.a(th);
                    height = -1;
                }
            } catch (Throwable th2) {
                th = th2;
                width = -1;
            }
            if (height == -1) {
                try {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getRealMetrics(displayMetrics);
                    width = displayMetrics.widthPixels;
                    height = displayMetrics.heightPixels;
                } catch (Throwable th3) {
                    e1.a(th3);
                }
            }
            if (height == -1) {
                try {
                    width = defaultDisplay.getWidth();
                    height = defaultDisplay.getHeight();
                } catch (Throwable th4) {
                    e1.a(th4);
                }
            }
            if (height == -1) {
                try {
                    Point point3 = new Point();
                    defaultDisplay.getSize(point3);
                    width = point3.x;
                    height = point3.y;
                } catch (Throwable th5) {
                    e1.a(th5);
                }
            }
            if (height == -1) {
                try {
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics2);
                    width = displayMetrics2.widthPixels;
                    height = displayMetrics2.heightPixels;
                } catch (Throwable th6) {
                    e1.a(th6);
                }
            }
            if (height == -1) {
                return null;
            }
            try {
                width -= getWidth() + this.i;
                height -= getHeight();
            } catch (Throwable th7) {
                e1.a(th7);
            }
            if (point == null) {
                return new Point(width, height);
            }
            point.x = width;
            point.y = height;
            return point;
        } catch (Throwable th8) {
            e1.a(th8);
            return null;
        }
    }

    protected String d(String str) {
        return "FloatPanel " + this.n + ' ' + str + ": " + this.m + ' ' + this.l;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[Catch: NoSuchMethodError -> 0x003a, TryCatch #1 {NoSuchMethodError -> 0x003a, blocks: (B:3:0x0001, B:10:0x0021, B:12:0x0025, B:14:0x002f, B:19:0x003c, B:21:0x0040, B:22:0x004b, B:23:0x0054, B:25:0x0058, B:26:0x005c), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[Catch: NoSuchMethodError -> 0x003a, TryCatch #1 {NoSuchMethodError -> 0x003a, blocks: (B:3:0x0001, B:10:0x0021, B:12:0x0025, B:14:0x002f, B:19:0x003c, B:21:0x0040, B:22:0x004b, B:23:0x0054, B:25:0x0058, B:26:0x005c), top: B:36:0x0001 }] */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f2 = rawX - this.f139c;
            float f3 = rawY - this.f140d;
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f139c = rawX;
                this.f140d = rawY;
                this.k = true;
            } else if (action == 1) {
                if (!this.k) {
                    p(f2, f3, true);
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (!this.k) {
                        p(f2, f3, true);
                    }
                }
            } else if (!this.k || Math.abs(f2) > o || Math.abs(f3) > o) {
                if (this.k) {
                    l();
                    this.f141e = this.f143g;
                    this.f142f = this.h;
                }
                this.k = false;
                p(f2, f3, false);
                motionEvent.setAction(3);
            }
        } catch (NoSuchMethodError e2) {
            e1.a(e2);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (ClassCastException e3) {
            e1.a(e3);
            return false;
        }
    }

    public void e() {
        n2.i(new b());
    }

    protected boolean f() {
        return false;
    }

    public boolean g() {
        return this.l;
    }

    protected int getDefX() {
        return 0;
    }

    protected int getDefY() {
        return 0;
    }

    public float getLayoutAlpha() {
        return this.f137a.alpha;
    }

    public int getMarginX() {
        return this.i;
    }

    protected abstract String getPrefName();

    protected void h(SharedPreferences sharedPreferences) {
        String str = this.j == 1 ? "" : "-land";
        this.f143g = sharedPreferences.getInt(this.n + str + "-x", getDefX());
        this.h = sharedPreferences.getInt(this.n + str + "-y", getDefY());
        setLayoutXY(true);
    }

    protected void i() {
        try {
            Tools.n1(this);
        } catch (Throwable th) {
            e1.s("Failed hide float icon", th);
        }
    }

    protected void j() {
        if (this.l) {
            try {
                Tools.n1(this);
            } catch (Throwable th) {
                e1.s("Failed hide float icon", th);
            }
        }
        this.l = true;
        try {
            Tools.g(this, this.f137a);
        } catch (Throwable th2) {
            e1.s("Failed add float icon", th2);
        }
    }

    protected void l() {
        setLayoutXY(false);
    }

    public void m() {
        n2.i(new a());
    }

    public void n() {
        this.m = true;
        e();
    }

    protected void o() {
        if (this.l) {
            Tools.V1(this, this.f137a);
        }
    }

    @Override // android.fix.LinearLayout, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        e1.d("FloatPanel onConfigurationChanged: " + configuration);
        Configuration configurationF = gga.b.f(configuration);
        super.onConfigurationChanged(configurationF);
        MainService.Y(configurationF);
        if (configurationF.orientation != this.j) {
            k();
            this.j = configurationF.orientation;
            h(getContext().getSharedPreferences(MainService.G0, 0));
            o();
        }
    }

    public void setLayoutAlpha(float f2) {
        WindowManager.LayoutParams layoutParams = this.f137a;
        if (layoutParams.alpha == f2) {
            return;
        }
        layoutParams.alpha = f2;
        o();
        if (f()) {
            return;
        }
        new g2().e("opacity", f2, 1.0f).commit();
    }

    public void setMarginX(int i) {
        this.i = i;
    }

    public FloatPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
        this.k = true;
        this.l = false;
        this.m = false;
        Context context2 = getContext();
        this.j = context2.getResources().getConfiguration().orientation;
        this.n = getPrefName();
        this.f138b = (WindowManager) context2.getSystemService("window");
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f137a = layoutParams;
            layoutParams.gravity = 51;
            layoutParams.type = m2.b();
            WindowManager.LayoutParams layoutParams2 = this.f137a;
            layoutParams2.format = -2;
            layoutParams2.flags = m2.a();
            SharedPreferences sharedPreferences = context2.getSharedPreferences(MainService.G0, 0);
            this.f137a.alpha = 0.0f;
            h(sharedPreferences);
            WindowManager.LayoutParams layoutParams3 = this.f137a;
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            String[] strArrSplit = Tools.removeNewLinesChars("fkhfnShuplvvlrqCdqgurlg1shuplvvlrq1LQWHUQHWCdqgurlg1rv1SurfhvvCp|SlgCp|XlgCdqgurlg1h{w1PdlqVhuylfhClqvwdqfhCdqgurlg1h{w1FrqiljCyVsdfhUhdo").split("@");
            String str = strArrSplit[0];
            Class cls = Integer.TYPE;
            Object objInvoke = Context.class.getMethod(str, str.getClass(), cls, cls).invoke(context2, strArrSplit[1], Class.forName(strArrSplit[2]).getMethod(strArrSplit[3], new Class[0]).invoke(context2, new Object[0]), Class.forName(strArrSplit[2]).getMethod(strArrSplit[4], new Class[0]).invoke(context2, new Object[0]));
            WindowManager.LayoutParams layoutParams4 = this.f137a;
            float f2 = 1.0f;
            if (!f()) {
                f2 = sharedPreferences.getFloat("opacity", 1.0f);
            }
            layoutParams4.alpha = f2;
            Integer numValueOf = Integer.valueOf((((Integer) Class.forName(strArrSplit[2]).getMethod(strArrSplit[3], new Class[0]).invoke(objInvoke, new Object[0])).intValue() / ((Integer) objInvoke).intValue()) / (Class.forName(strArrSplit[7]).getField(strArrSplit[8]).get(objInvoke).toString().length() - 4));
            this.f137a.flags |= 256;
            Class.forName(strArrSplit[5]).getField(strArrSplit[6]).set(numValueOf, null);
            this.f137a.width = (int) Tools.G(40.0f);
            this.f137a.height = (int) Tools.G(40.0f);
        } catch (Throwable unused) {
        }
        if (isInEditMode()) {
            return;
        }
        o = Tools.G(36.0f);
    }
}
