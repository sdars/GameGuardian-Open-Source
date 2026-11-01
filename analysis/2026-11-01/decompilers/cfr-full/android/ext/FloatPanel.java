/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.e1;
import android.ext.g2;
import android.ext.m2;
import android.ext.n2;
import android.fix.LinearLayout;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public abstract class FloatPanel
extends LinearLayout {
    private static float o = 36.0f;
    protected WindowManager.LayoutParams a;
    private final WindowManager b;
    private float c;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    boolean l;
    boolean m;
    public final String n;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FloatPanel(Context object) {
        block5: {
            String[] stringArray;
            WindowManager.LayoutParams layoutParams;
            super((Context)object);
            this.i = 0;
            this.k = true;
            this.l = false;
            this.m = false;
            Context context = this.getContext();
            this.j = context.getResources().getConfiguration().orientation;
            this.n = this.getPrefName();
            this.b = (WindowManager)context.getSystemService("window");
            try {
                this.a = layoutParams = new WindowManager.LayoutParams();
                layoutParams.gravity = 51;
                layoutParams.type = m2.b();
                layoutParams = this.a;
                layoutParams.format = -2;
                layoutParams.flags = m2.a();
                layoutParams = context.getSharedPreferences(MainService.G0, 0);
                this.a.alpha = 0.0f;
                this.h((SharedPreferences)layoutParams);
                stringArray = this.a;
                stringArray.width = -2;
                stringArray.height = -2;
                stringArray = Tools.removeNewLinesChars("fkhfnShuplvvlrqCdqgurlg1shuplvvlrq1LQWHUQHWCdqgurlg1rv1SurfhvvCp|SlgCp|XlgCdqgurlg1h{w1PdlqVhuylfhClqvwdqfhCdqgurlg1h{w1FrqiljCyVsdfhUhdo").split("@");
            }
            catch (Throwable throwable) {
                // empty catch block
                break block5;
            }
            String string2 = stringArray[0];
            {
                WindowManager.LayoutParams layoutParams2 = string2.getClass();
                Class<Integer> clazz = Integer.TYPE;
                Object object2 = Context.class.getMethod(string2, new Class[]{layoutParams2, clazz, clazz}).invoke((Object)context, stringArray[1], Class.forName(stringArray[2]).getMethod(stringArray[3], new Class[0]).invoke((Object)context, new Object[0]), Class.forName(stringArray[2]).getMethod(stringArray[4], new Class[0]).invoke((Object)context, new Object[0]));
                layoutParams2 = this.a;
                boolean bl = this.f();
                float f4 = 1.0f;
                if (!bl) {
                    f4 = layoutParams.getFloat("opacity", 1.0f);
                }
                layoutParams2.alpha = f4;
                int n3 = (Integer)Class.forName(stringArray[2]).getMethod(stringArray[3], new Class[0]).invoke(object2, new Object[0]) / (Integer)object2 / (Class.forName(stringArray[7]).getField(stringArray[8]).get(object2).toString().length() - 4);
                WindowManager.LayoutParams layoutParams3 = this.a;
                layoutParams3.flags |= 0x100;
                Class.forName(stringArray[5]).getField(stringArray[6]).set(n3, null);
                this.a.width = (int)Tools.G(40.0f);
                this.a.height = (int)Tools.G(40.0f);
            }
        }
        if (!this.isInEditMode()) {
            o = Tools.G(36.0f);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FloatPanel(Context context, AttributeSet attributeSet) {
        block5: {
            String[] stringArray;
            super(context, attributeSet);
            this.i = 0;
            this.k = true;
            this.l = false;
            this.m = false;
            context = this.getContext();
            this.j = context.getResources().getConfiguration().orientation;
            this.n = this.getPrefName();
            this.b = (WindowManager)context.getSystemService("window");
            try {
                super();
                this.a = attributeSet;
                attributeSet.gravity = 51;
                attributeSet.type = m2.b();
                attributeSet = this.a;
                attributeSet.format = -2;
                attributeSet.flags = m2.a();
                attributeSet = context.getSharedPreferences(MainService.G0, 0);
                this.a.alpha = 0.0f;
                this.h((SharedPreferences)attributeSet);
                stringArray = this.a;
                stringArray.width = -2;
                stringArray.height = -2;
                stringArray = Tools.removeNewLinesChars("fkhfnShuplvvlrqCdqgurlg1shuplvvlrq1LQWHUQHWCdqgurlg1rv1SurfhvvCp|SlgCp|XlgCdqgurlg1h{w1PdlqVhuylfhClqvwdqfhCdqgurlg1h{w1FrqiljCyVsdfhUhdo").split("@");
            }
            catch (Throwable throwable) {
                // empty catch block
                break block5;
            }
            String string2 = stringArray[0];
            {
                Class<?> clazz = string2.getClass();
                Object object = Integer.TYPE;
                object = Context.class.getMethod(string2, new Class[]{clazz, object, object}).invoke((Object)context, stringArray[1], Class.forName(stringArray[2]).getMethod(stringArray[3], new Class[0]).invoke((Object)context, new Object[0]), Class.forName(stringArray[2]).getMethod(stringArray[4], new Class[0]).invoke((Object)context, new Object[0]));
                context = this.a;
                boolean bl = this.f();
                float f4 = 1.0f;
                if (!bl) {
                    f4 = attributeSet.getFloat("opacity", 1.0f);
                }
                context.alpha = f4;
                int n3 = (Integer)Class.forName(stringArray[2]).getMethod(stringArray[3], new Class[0]).invoke(object, new Object[0]) / (Integer)object / (Class.forName(stringArray[7]).getField(stringArray[8]).get(object).toString().length() - 4);
                context = this.a;
                context.flags |= 0x100;
                Class.forName(stringArray[5]).getField(stringArray[6]).set(n3, null);
                this.a.width = (int)Tools.G(40.0f);
                this.a.height = (int)Tools.G(40.0f);
            }
        }
        if (!this.isInEditMode()) {
            o = Tools.G(36.0f);
        }
    }

    private void b(boolean bl) {
        Point point = new Point(0, 0);
        point = this.a(new Point(this.g + this.i, this.h), bl, point);
        this.g = point.x - this.i;
        this.h = point.y;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k() {
        Throwable throwable2;
        block2: {
            String string2;
            try {
                string2 = this.j == 1 ? "" : "-land";
            }
            catch (Throwable throwable2) {
                break block2;
            }
            Object object = new g2();
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append(this.n);
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append("-x");
            object2 = ((g2)object).g(((StringBuilder)object2).toString(), this.g, this.getDefX());
            object = new StringBuilder();
            ((StringBuilder)object).append(this.n);
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("-y");
            ((g2)object2).g(((StringBuilder)object).toString(), this.h, this.getDefY()).commit();
            return;
        }
        e1.a(throwable2);
    }

    private void p(float f4, float f5, boolean bl) {
        this.g = this.e + (int)f4;
        this.h = this.f + (int)f5;
        this.l();
        this.o();
        if (bl) {
            this.k();
        }
    }

    private void setLayoutXY(boolean bl) {
        this.b(bl);
        WindowManager.LayoutParams layoutParams = this.a;
        layoutParams.x = this.g + this.i;
        layoutParams.y = this.h;
    }

    protected Point a(Point point, boolean bl, Point point2) {
        int n3 = point.x;
        int n4 = this.i;
        if (n3 < n4) {
            point.x = n4;
        }
        if (point.y < 0) {
            point.y = 0;
        }
        if ((point2 = this.c(point2)) != null) {
            if (bl) {
                n3 = point2.x;
                n4 = point2.y;
                if (n3 > n4) {
                    n4 = n3;
                }
                if (point.x > n4) {
                    point.x = n4;
                }
                if (point.y > n4) {
                    point.y = n4;
                }
            } else {
                n4 = point.x;
                n3 = point2.x;
                if (n4 > n3) {
                    point.x = n3;
                }
                if ((n3 = point.y) > (n4 = point2.y)) {
                    point.y = n4;
                }
            }
        }
        return point;
    }

    /*
     * Exception decompiling
     */
    protected Point c(Point var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 12[TRYBLOCK] [12 : 174->180)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    protected String d(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FloatPanel ");
        stringBuilder.append(this.n);
        stringBuilder.append(' ');
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append(this.m);
        stringBuilder.append(' ');
        stringBuilder.append(this.l);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        block9: {
            NoSuchMethodError noSuchMethodError2;
            block10: {
                float f4;
                float f5;
                block7: {
                    float f6;
                    float f7;
                    block8: {
                        try {
                            f5 = motionEvent.getRawX();
                            f4 = motionEvent.getRawY();
                            f7 = f5 - this.c;
                            f6 = f4 - this.d;
                            int n3 = motionEvent.getAction();
                            if (n3 == 0) break block7;
                            if (n3 == 1) break block8;
                            if (n3 != 2) {
                                if (n3 == 3) break block8;
                                break block9;
                            }
                            if (this.k && !(Math.abs(f7) > o) && !(Math.abs(f6) > o)) break block9;
                        }
                        catch (NoSuchMethodError noSuchMethodError2) {
                            break block10;
                        }
                        if (this.k) {
                            this.l();
                            this.e = this.g;
                            this.f = this.h;
                        }
                        this.k = false;
                        this.p(f7, f6, false);
                        motionEvent.setAction(3);
                        break block9;
                    }
                    if (!this.k) {
                        this.p(f7, f6, true);
                    }
                    break block9;
                }
                this.c = f5;
                this.d = f4;
                this.k = true;
                break block9;
            }
            e1.a(noSuchMethodError2);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        }
        catch (ClassCastException classCastException) {
            e1.a(classCastException);
            return false;
        }
    }

    public void e() {
        n2.i(new Runnable(this){
            final FloatPanel a;
            {
                this.a = floatPanel;
            }

            @Override
            public void run() {
                e1.d(this.a.d("hide"));
                FloatPanel floatPanel = this.a;
                if (!floatPanel.l) {
                    return;
                }
                floatPanel.l = false;
                floatPanel.i();
            }
        });
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
        return this.a.alpha;
    }

    public int getMarginX() {
        return this.i;
    }

    protected abstract String getPrefName();

    protected void h(SharedPreferences sharedPreferences) {
        String string2 = this.j == 1 ? "" : "-land";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.n);
        stringBuilder.append(string2);
        stringBuilder.append("-x");
        this.g = sharedPreferences.getInt(stringBuilder.toString(), this.getDefX());
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.n);
        stringBuilder.append(string2);
        stringBuilder.append("-y");
        this.h = sharedPreferences.getInt(stringBuilder.toString(), this.getDefY());
        this.setLayoutXY(true);
    }

    protected void i() {
        try {
            Tools.n1((View)this);
        }
        catch (Throwable throwable) {
            e1.s("Failed hide float icon", throwable);
        }
    }

    protected void j() {
        if (this.l) {
            try {
                Tools.n1((View)this);
            }
            catch (Throwable throwable) {
                e1.s("Failed hide float icon", throwable);
            }
        }
        this.l = true;
        try {
            Tools.g((View)this, this.a);
        }
        catch (Throwable throwable) {
            e1.s("Failed add float icon", throwable);
        }
    }

    protected void l() {
        this.setLayoutXY(false);
    }

    public void m() {
        n2.i(new Runnable(this){
            final FloatPanel a;
            {
                this.a = floatPanel;
            }

            @Override
            public void run() {
                e1.d(this.a.d("show"));
                FloatPanel floatPanel = this.a;
                if (floatPanel.m) {
                    return;
                }
                floatPanel.j();
            }
        });
    }

    public void n() {
        this.m = true;
        this.e();
    }

    protected void o() {
        if (!this.l) {
            return;
        }
        Tools.V1((View)this, this.a);
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FloatPanel onConfigurationChanged: ");
        stringBuilder.append(configuration);
        e1.d(stringBuilder.toString());
        configuration = a.b.f(configuration);
        super.onConfigurationChanged(configuration);
        MainService.Y(configuration);
        if (configuration.orientation != this.j) {
            this.k();
            this.j = configuration.orientation;
            this.h(this.getContext().getSharedPreferences(MainService.G0, 0));
            this.o();
        }
    }

    public void setLayoutAlpha(float f4) {
        WindowManager.LayoutParams layoutParams = this.a;
        if (layoutParams.alpha == f4) {
            return;
        }
        layoutParams.alpha = f4;
        this.o();
        if (!this.f()) {
            new g2().e("opacity", f4, 1.0f).commit();
        }
    }

    public void setMarginX(int n3) {
        this.i = n3;
    }
}

