package a;

import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static Object a(Object obj) {
        return (obj == null || !b.e() || !(obj instanceof LayoutInflater) || (obj instanceof d)) ? obj : new d((LayoutInflater) obj);
    }
}
