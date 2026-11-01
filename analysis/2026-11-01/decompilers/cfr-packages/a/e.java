/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package a;

import android.ext.e1;
import android.util.SparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class e
extends SparseArray {
    private void a() {
        block3: {
            Field field = SparseArray.class.getDeclaredField("mKeys");
            ((AccessibleObject)field).setAccessible(true);
            Field field2 = SparseArray.class.getDeclaredField("mValues");
            ((AccessibleObject)field2).setAccessible(true);
            Field field3 = SparseArray.class.getDeclaredField("mSize");
            ((AccessibleObject)field3).setAccessible(true);
            int n3 = field3.getInt((Object)this);
            int n4 = ((int[])field.get((Object)this)).length;
            int n5 = ((Object[])field2.get((Object)this)).length;
            if (n3 <= n4 && n3 <= n5) break block3;
            try {
                field3.setInt((Object)this, Math.min(Math.min(n3, n4), n5));
            }
            catch (Throwable throwable) {
                e1.s("Failed fix", throwable);
            }
        }
    }

    public Object b(int n3) {
        synchronized (this) {
            Object object = this.get(n3);
            return object;
        }
    }

    public void c(int n3, Object object) {
        synchronized (this) {
            this.put(n3, object);
            return;
        }
    }

    public void clear() {
        try {
            super.clear();
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
            this.a();
            super.clear();
        }
    }

    public void delete(int n3) {
        try {
            super.delete(n3);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
            this.a();
            super.delete(n3);
        }
    }

    public Object get(int n3, Object object) {
        try {
            Object object2 = super.get(n3, object);
            return object2;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
            this.a();
            return super.get(n3, object);
        }
    }

    public int indexOfKey(int n3) {
        try {
            int n4 = super.indexOfKey(n3);
            return n4;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
            this.a();
            return super.indexOfKey(n3);
        }
    }

    public void put(int n3, Object object) {
        try {
            super.put(n3, object);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
            this.a();
            super.put(n3, object);
        }
    }

    public void removeAt(int n3) {
        super.removeAt(n3);
    }

    public int size() {
        try {
            int n3 = super.size();
            return n3;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
            this.a();
            return super.size();
        }
    }
}

