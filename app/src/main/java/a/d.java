package a;

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

/* JADX INFO: loaded from: classes.dex */
public class d extends LayoutInflater {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f16c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f17a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f18b;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(Integer.valueOf(R.style.Theme.DeviceDefault));
        arrayList.add(Integer.valueOf(R.style.Theme.Material));
        arrayList.add(Integer.valueOf(R.style.Theme.Holo));
        arrayList.add(Integer.valueOf(R.style.Theme));
        arrayList.add(Integer.valueOf(R.style.Theme.Black));
        for (Field field : R.class.getFields()) {
            int modifiers = field.getModifiers();
            if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && field.getName().startsWith("Theme") && field.getType().equals(Integer.TYPE)) {
                try {
                    arrayList.add(Integer.valueOf(field.getInt(null)));
                } catch (IllegalAccessException | IllegalArgumentException unused) {
                }
            }
        }
        f16c = new int[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f16c[i] = ((Integer) arrayList.get(i)).intValue();
        }
    }

    public d(LayoutInflater layoutInflater) {
        super(layoutInflater, layoutInflater.getContext());
        this.f18b = layoutInflater;
        this.f17a = layoutInflater.getContext();
    }

    private void a(int i) {
        if (i == 0 || d(this.f18b.getContext()) == i) {
            return;
        }
        this.f18b = this.f18b.cloneInContext(b(i));
    }

    private Context b(int i) {
        return i == 1 ? this.f17a : new ContextThemeWrapper(this.f17a, i);
    }

    public static d c() {
        return (d) f.a(LayoutInflater.from(Tools.f0()));
    }

    private int d(Context context) {
        if (context == this.f17a) {
            return 1;
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                Object objInvoke = ContextThemeWrapper.class.getDeclaredMethod("getThemeResId", new Class[0]).invoke(context, new Object[0]);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
            } catch (Throwable th) {
                e1.l("getThemeResId failed call", th);
            }
        }
        return 0;
    }

    private View e(int i, XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        if (this.f18b == null) {
            return xmlPullParser == null ? super.inflate(i, viewGroup, z) : super.inflate(xmlPullParser, viewGroup, z);
        }
        try {
            return h(i, xmlPullParser, viewGroup, z);
        } catch (InflateException e2) {
            if (!i(e2, "tab_indicator_holo") && !i(e2, "tab_selected_holo")) {
                throw e2;
            }
            e1.l("Try fix", e2);
            return h(catch_.me_.if_.you_.can_.R.layout.tab_indicator_holo, null, viewGroup, z);
        }
    }

    public static View f(int i, ViewGroup viewGroup) {
        return c().inflate(i, viewGroup);
    }

    public static View g(int i, ViewGroup viewGroup, boolean z) {
        return c().inflate(i, viewGroup, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r10v9 */
    private View h(int i, XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        int[] iArr = f16c;
        int length = iArr.length;
        RuntimeException runtimeException = null;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            LayoutInflater layoutInflater = this.f18b;
            try {
                a(i3);
                return xmlPullParser == null ? this.f18b.inflate(i, viewGroup, z) : this.f18b.inflate(xmlPullParser, viewGroup, z);
            } catch (Exception e2) {
                if (runtimeException == null) {
                    runtimeException = e2 instanceof RuntimeException ? (RuntimeException) e2 : new RuntimeException(e2);
                }
                if (!(e2 instanceof InflateException) && !(e2 instanceof InvocationTargetException)) {
                    throw runtimeException;
                }
                e1.l("Exception on inflate with theme: " + i3, e2);
                if (Config.vSpaceReal) {
                    if (getContext().getPackageName().equals(Config.E)) {
                        continue;
                    } else {
                        LayoutInflater layoutInflater2 = this.f18b;
                        LayoutInflater layoutInflaterCloneInContext = layoutInflater2.cloneInContext(Config.a(layoutInflater2.getContext()));
                        this.f18b = layoutInflaterCloneInContext;
                        try {
                            return xmlPullParser == null ? layoutInflaterCloneInContext.inflate(i, viewGroup, z) : layoutInflaterCloneInContext.inflate(xmlPullParser, viewGroup, z);
                        } catch (InflateException e3) {
                            e1.l("Exception on inflate with theme: " + i3, e3);
                            this.f18b = layoutInflater;
                            i2++;
                        }
                    }
                }
                this.f18b = layoutInflater;
                i2++;
            }
        }
        throw runtimeException;
    }

    private boolean i(Throwable th, String str) {
        if (str == null || th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message == null || !message.contains(str)) {
            return i(th.getCause(), str);
        }
        return true;
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context context) {
        return new d(this.f18b.cloneInContext(context));
    }

    public boolean equals(Object obj) {
        LayoutInflater layoutInflater = this.f18b;
        return layoutInflater == null ? super.equals(obj) : layoutInflater.equals(obj);
    }

    @Override // android.view.LayoutInflater
    public Context getContext() {
        LayoutInflater layoutInflater = this.f18b;
        return layoutInflater == null ? super.getContext() : layoutInflater.getContext();
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater.Filter getFilter() {
        LayoutInflater layoutInflater = this.f18b;
        return layoutInflater == null ? super.getFilter() : layoutInflater.getFilter();
    }

    public int hashCode() {
        LayoutInflater layoutInflater = this.f18b;
        return layoutInflater == null ? super.hashCode() : layoutInflater.hashCode();
    }

    @Override // android.view.LayoutInflater
    public View inflate(int i, ViewGroup viewGroup) {
        return inflate(i, viewGroup, viewGroup != null);
    }

    @Override // android.view.LayoutInflater
    public void setFactory(LayoutInflater.Factory factory) {
        LayoutInflater layoutInflater = this.f18b;
        if (layoutInflater == null) {
            super.setFactory(factory);
        } else {
            layoutInflater.setFactory(factory);
        }
    }

    @Override // android.view.LayoutInflater
    public void setFactory2(LayoutInflater.Factory2 factory2) {
        LayoutInflater layoutInflater = this.f18b;
        if (layoutInflater == null) {
            super.setFactory2(factory2);
        } else {
            layoutInflater.setFactory2(factory2);
        }
    }

    @Override // android.view.LayoutInflater
    public void setFilter(LayoutInflater.Filter filter) {
        LayoutInflater layoutInflater = this.f18b;
        if (layoutInflater == null) {
            super.setFilter(filter);
        } else {
            layoutInflater.setFilter(filter);
        }
    }

    public String toString() {
        LayoutInflater layoutInflater = this.f18b;
        return layoutInflater == null ? super.toString() : layoutInflater.toString();
    }

    @Override // android.view.LayoutInflater
    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        return e(i, null, viewGroup, z);
    }

    @Override // android.view.LayoutInflater
    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup) {
        return inflate(xmlPullParser, viewGroup, viewGroup != null);
    }

    @Override // android.view.LayoutInflater
    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        return e(0, xmlPullParser, viewGroup, z);
    }
}
