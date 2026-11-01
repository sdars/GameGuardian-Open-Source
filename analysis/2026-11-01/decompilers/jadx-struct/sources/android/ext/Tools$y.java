package android.ext;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class Tools$y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class f550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Class[] f552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object[] f554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Method f555f = null;

    public Tools$y(Class cls, String str, Class[] clsArr, Object obj, Object[] objArr) {
        this.f550a = cls;
        this.f551b = str;
        this.f552c = clsArr;
        this.f553d = obj;
        this.f554e = objArr;
    }

    public Tools$y a() {
        this.f555f = this.f550a.getMethod(this.f551b, this.f552c);
        return this;
    }

    public Object b() {
        return this.f555f.invoke(this.f553d, this.f554e);
    }
}
