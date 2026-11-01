/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.b;
import a.d;
import android.view.LayoutInflater;

public abstract class f {
    public static Object a(Object object) {
        Object object2 = object;
        if (object != null) {
            object2 = object;
            if (b.e()) {
                object2 = object;
                if (object instanceof LayoutInflater) {
                    object2 = object;
                    if (!(object instanceof d)) {
                        object2 = new d((LayoutInflater)object);
                    }
                }
            }
        }
        return object2;
    }
}

