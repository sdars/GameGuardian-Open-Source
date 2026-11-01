package android.lang;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class ProcessEnvironment$d extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f1467a;

    public ProcessEnvironment$d(Map map) {
        this.f1467a = map;
    }

    private static String e(ProcessEnvironment$g processEnvironment$g) {
        if (processEnvironment$g == null) {
            return null;
        }
        return processEnvironment$g.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String get(Object obj) {
        return e((ProcessEnvironment$g) this.f1467a.get(ProcessEnvironment$h.e(obj)));
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String put(String str, String str2) {
        return e((ProcessEnvironment$g) this.f1467a.put(ProcessEnvironment$h.c(str), ProcessEnvironment$g.c(str2)));
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String remove(Object obj) {
        return e((ProcessEnvironment$g) this.f1467a.remove(ProcessEnvironment$h.e(obj)));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f1467a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f1467a.containsKey(ProcessEnvironment$h.e(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return this.f1467a.containsValue(ProcessEnvironment$g.e(obj));
    }

    public byte[] d(int[] iArr) {
        int size = this.f1467a.size() * 2;
        for (Map$Entry map$Entry : this.f1467a.entrySet()) {
            size = size + ((ProcessEnvironment$h) map$Entry.getKey()).a().length + ((ProcessEnvironment$g) map$Entry.getValue()).a().length;
        }
        byte[] bArr = new byte[size];
        int length = 0;
        for (Map$Entry map$Entry2 : this.f1467a.entrySet()) {
            byte[] bArrA = ((ProcessEnvironment$h) map$Entry2.getKey()).a();
            byte[] bArrA2 = ((ProcessEnvironment$g) map$Entry2.getValue()).a();
            System.arraycopy(bArrA, 0, bArr, length, bArrA.length);
            int length2 = length + bArrA.length;
            int i = length2 + 1;
            bArr[length2] = 61;
            System.arraycopy(bArrA2, 0, bArr, i, bArrA2.length);
            length = bArrA2.length + 1 + i;
        }
        iArr[0] = this.f1467a.size();
        return bArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return new ProcessEnvironment$c(this.f1467a.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f1467a.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return new ProcessEnvironment$e(this.f1467a.keySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f1467a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        return new ProcessEnvironment$f(this.f1467a.values());
    }
}
