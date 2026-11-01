package a;

import android.ext.e1;
import android.util.SparseArray;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class e extends SparseArray {
    private void a() {
        try {
            Field declaredField = SparseArray.class.getDeclaredField("mKeys");
            declaredField.setAccessible(true);
            Field declaredField2 = SparseArray.class.getDeclaredField("mValues");
            declaredField2.setAccessible(true);
            Field declaredField3 = SparseArray.class.getDeclaredField("mSize");
            declaredField3.setAccessible(true);
            int i = declaredField3.getInt(this);
            int length = ((int[]) declaredField.get(this)).length;
            int length2 = ((Object[]) declaredField2.get(this)).length;
            if (i > length || i > length2) {
                declaredField3.setInt(this, Math.min(Math.min(i, length), length2));
            }
        } catch (Throwable th) {
            e1.s("Failed fix", th);
        }
    }

    public synchronized Object b(int i) {
        return get(i);
    }

    public synchronized void c(int i, Object obj) {
        put(i, obj);
    }

    @Override // android.util.SparseArray
    public void clear() {
        try {
            super.clear();
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
            a();
            super.clear();
        }
    }

    @Override // android.util.SparseArray
    public void delete(int i) {
        try {
            super.delete(i);
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
            a();
            super.delete(i);
        }
    }

    @Override // android.util.SparseArray
    public Object get(int i, Object obj) {
        try {
            return super.get(i, obj);
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
            a();
            return super.get(i, obj);
        }
    }

    @Override // android.util.SparseArray
    public int indexOfKey(int i) {
        try {
            return super.indexOfKey(i);
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
            a();
            return super.indexOfKey(i);
        }
    }

    @Override // android.util.SparseArray
    public void put(int i, Object obj) {
        try {
            super.put(i, obj);
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
            a();
            super.put(i, obj);
        }
    }

    @Override // android.util.SparseArray
    public void removeAt(int i) {
        super.removeAt(i);
    }

    @Override // android.util.SparseArray
    public int size() {
        try {
            return super.size();
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
            a();
            return super.size();
        }
    }
}
