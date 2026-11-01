/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.f;
import android.R;
import android.content.Context;
import android.ext.Config;
import android.ext.Tools;
import android.ext.e1;
import android.view.ContextThemeWrapper;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class d
extends LayoutInflater {
    private static final int[] c;
    private Context a;
    private LayoutInflater b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n3 = 0;
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(16974120);
        arrayList.add(16974372);
        arrayList.add(16973931);
        arrayList.add(16973829);
        arrayList.add(16973832);
        Field[] fieldArray = R.class.getFields();
        int n4 = fieldArray.length;
        int n5 = 0;
        while (true) {
            block5: {
                block6: {
                    if (n5 >= n4) break block6;
                    Field field = fieldArray[n5];
                    int n6 = field.getModifiers();
                    if (!Modifier.isStatic(n6) || !Modifier.isFinal(n6) || !field.getName().startsWith("Theme") || !field.getType().equals(Integer.TYPE)) break block5;
                    try {
                        arrayList.add(field.getInt(null));
                        break block5;
                    }
                    catch (IllegalAccessException | IllegalArgumentException exception) {}
                }
                c = new int[arrayList.size()];
                n4 = arrayList.size();
                n5 = n3;
                while (true) {
                    if (n5 >= n4) {
                        return;
                    }
                    d.c[n5] = (Integer)arrayList.get(n5);
                    ++n5;
                }
            }
            ++n5;
        }
    }

    public d(LayoutInflater layoutInflater) {
        super(layoutInflater, layoutInflater.getContext());
        this.b = layoutInflater;
        this.a = layoutInflater.getContext();
    }

    private void a(int n3) {
        if (n3 != 0 && this.d(this.b.getContext()) != n3) {
            this.b = this.b.cloneInContext(this.b(n3));
        }
    }

    private Context b(int n3) {
        Object object = n3 == 1 ? this.a : new ContextThemeWrapper(this.a, n3);
        return object;
    }

    public static d c() {
        return (d)((Object)f.a(LayoutInflater.from((Context)Tools.f0())));
    }

    private int d(Context object) {
        int n3;
        block6: {
            if (object == this.a) {
                n3 = 1;
            } else {
                block5: {
                    if (object instanceof ContextThemeWrapper) {
                        try {
                            object = ContextThemeWrapper.class.getDeclaredMethod("getThemeResId", new Class[0]).invoke(object, new Object[0]);
                            if (!(object instanceof Integer)) break block5;
                            n3 = (Integer)object;
                            break block6;
                        }
                        catch (Throwable throwable) {
                            e1.l("getThemeResId failed call", throwable);
                        }
                    }
                }
                n3 = 0;
            }
        }
        return n3;
    }

    private View e(int n3, XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean bl) {
        if (this.b == null) {
            xmlPullParser = xmlPullParser == null ? super.inflate(n3, viewGroup, bl) : super.inflate(xmlPullParser, viewGroup, bl);
            return xmlPullParser;
        }
        try {
            xmlPullParser = this.h(n3, xmlPullParser, viewGroup, bl);
            return xmlPullParser;
        }
        catch (InflateException inflateException) {
            if (!this.i(inflateException, "tab_indicator_holo") && !this.i(inflateException, "tab_selected_holo")) {
                throw inflateException;
            }
            e1.l("Try fix", inflateException);
            return this.h(2131099687, null, viewGroup, bl);
        }
    }

    public static View f(int n3, ViewGroup viewGroup) {
        return d.c().inflate(n3, viewGroup);
    }

    public static View g(int n3, ViewGroup viewGroup, boolean bl) {
        return d.c().inflate(n3, viewGroup, bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private View h(int n3, XmlPullParser object, ViewGroup viewGroup, boolean bl) {
        int[] nArray = c;
        int n4 = nArray.length;
        Object object2 = null;
        int n5 = 0;
        while (true) {
            Exception exception2;
            Object object3;
            LayoutInflater layoutInflater;
            int n6;
            Object object4;
            block11: {
                object4 = object2;
                if (n5 >= n4) throw object4;
                n6 = nArray[n5];
                layoutInflater = this.b;
                try {
                    this.a(n6);
                    if (object == null) {
                        object3 = this.b.inflate(n3, viewGroup, bl);
                        return object3;
                    }
                }
                catch (Exception exception2) {
                    break block11;
                }
                object3 = this.b.inflate(object, viewGroup, bl);
                return object3;
            }
            object3 = object2;
            if (object2 == null) {
                object3 = exception2 instanceof RuntimeException ? (RuntimeException)exception2 : new RuntimeException(exception2);
            }
            if (!(exception2 instanceof InflateException)) {
                object4 = object3;
                if (!(exception2 instanceof InvocationTargetException)) throw object4;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Exception on inflate with theme: ");
            ((StringBuilder)object2).append(n6);
            e1.l(((StringBuilder)object2).toString(), exception2);
            if (Config.vSpaceReal && !this.getContext().getPackageName().equals(Config.E)) {
                InflateException inflateException2;
                object2 = this.b;
                object2 = object2.cloneInContext(Config.a(object2.getContext()));
                this.b = object2;
                if (object == null) {
                    try {
                        object2 = object2.inflate(n3, viewGroup, bl);
                        return object2;
                    }
                    catch (InflateException inflateException2) {}
                } else {
                    object2 = object2.inflate(object, viewGroup, bl);
                    return object2;
                }
                object4 = new StringBuilder();
                ((StringBuilder)object4).append("Exception on inflate with theme: ");
                ((StringBuilder)object4).append(n6);
                e1.l(((StringBuilder)object4).toString(), inflateException2);
            }
            this.b = layoutInflater;
            ++n5;
            object2 = object3;
        }
    }

    private boolean i(Throwable throwable, String string2) {
        if (string2 != null && throwable != null) {
            String string3 = throwable.getMessage();
            if (string3 != null && string3.contains(string2)) {
                return true;
            }
            return this.i(throwable.getCause(), string2);
        }
        return false;
    }

    public LayoutInflater cloneInContext(Context context) {
        return new d(this.b.cloneInContext(context));
    }

    public boolean equals(Object object) {
        LayoutInflater layoutInflater = this.b;
        if (layoutInflater == null) {
            return super.equals(object);
        }
        return layoutInflater.equals(object);
    }

    public Context getContext() {
        LayoutInflater layoutInflater = this.b;
        if (layoutInflater == null) {
            return super.getContext();
        }
        return layoutInflater.getContext();
    }

    public LayoutInflater.Filter getFilter() {
        LayoutInflater layoutInflater = this.b;
        if (layoutInflater == null) {
            return super.getFilter();
        }
        return layoutInflater.getFilter();
    }

    public int hashCode() {
        LayoutInflater layoutInflater = this.b;
        if (layoutInflater == null) {
            return super.hashCode();
        }
        return layoutInflater.hashCode();
    }

    public View inflate(int n3, ViewGroup viewGroup) {
        boolean bl = viewGroup != null;
        return this.inflate(n3, viewGroup, bl);
    }

    public View inflate(int n3, ViewGroup viewGroup, boolean bl) {
        return this.e(n3, null, viewGroup, bl);
    }

    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup) {
        boolean bl = viewGroup != null;
        return this.inflate(xmlPullParser, viewGroup, bl);
    }

    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean bl) {
        return this.e(0, xmlPullParser, viewGroup, bl);
    }

    public void setFactory(LayoutInflater.Factory factory) {
        LayoutInflater layoutInflater = this.b;
        if (layoutInflater == null) {
            super.setFactory(factory);
        } else {
            layoutInflater.setFactory(factory);
        }
    }

    public void setFactory2(LayoutInflater.Factory2 factory2) {
        LayoutInflater layoutInflater = this.b;
        if (layoutInflater == null) {
            super.setFactory2(factory2);
        } else {
            layoutInflater.setFactory2(factory2);
        }
    }

    public void setFilter(LayoutInflater.Filter filter) {
        LayoutInflater layoutInflater = this.b;
        if (layoutInflater == null) {
            super.setFilter(filter);
        } else {
            layoutInflater.setFilter(filter);
        }
    }

    public String toString() {
        LayoutInflater layoutInflater = this.b;
        if (layoutInflater == null) {
            return super.toString();
        }
        return layoutInflater.toString();
    }
}

