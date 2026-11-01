package a;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class e extends android.util.SparseArray {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a() {
            r5 = this;
            java.lang.Class<android.util.SparseArray> r0 = android.util.SparseArray.class
            java.lang.String r1 = "mKeys"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L40
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "mValues"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L40
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "mSize"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L40
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L40
            int r2 = r0.getInt(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L40
            int[] r1 = (int[]) r1     // Catch: java.lang.Throwable -> L40
            int r1 = r1.length     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> L40
            int r3 = r3.length     // Catch: java.lang.Throwable -> L40
            if (r2 > r1) goto L34
            if (r2 <= r3) goto L46
        L34:
            int r1 = java.lang.Math.min(r2, r1)     // Catch: java.lang.Throwable -> L40
            int r1 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> L40
            r0.setInt(r5, r1)     // Catch: java.lang.Throwable -> L40
            goto L46
        L40:
            r0 = move-exception
            java.lang.String r1 = "Failed fix"
            android.ext.e1.s(r1, r0)
        L46:
            return
    }

    public synchronized java.lang.Object b(int r1) {
            r0 = this;
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized void c(int r1, java.lang.Object r2) {
            r0 = this;
            monitor-enter(r0)
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return
        L6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // android.util.SparseArray
    public void clear() {
            r1 = this;
            super.clear()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
            goto Le
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
            r1.a()
            super.clear()
        Le:
            return
    }

    @Override // android.util.SparseArray
    public void delete(int r2) {
            r1 = this;
            super.delete(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
            goto Le
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
            r1.a()
            super.delete(r2)
        Le:
            return
    }

    @Override // android.util.SparseArray
    public java.lang.Object get(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object r2 = super.get(r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            return r2
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            r1.a()
            java.lang.Object r2 = super.get(r2, r3)
            return r2
    }

    @Override // android.util.SparseArray
    public int indexOfKey(int r2) {
            r1 = this;
            int r2 = super.indexOfKey(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            return r2
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            r1.a()
            int r2 = super.indexOfKey(r2)
            return r2
    }

    @Override // android.util.SparseArray
    public void put(int r2, java.lang.Object r3) {
            r1 = this;
            super.put(r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
            goto Le
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
            r1.a()
            super.put(r2, r3)
        Le:
            return
    }

    @Override // android.util.SparseArray
    public void removeAt(int r1) {
            r0 = this;
            super.removeAt(r1)
            return
    }

    @Override // android.util.SparseArray
    public int size() {
            r1 = this;
            int r0 = super.size()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            return r0
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            r1.a()
            int r0 = super.size()
            return r0
    }
}
