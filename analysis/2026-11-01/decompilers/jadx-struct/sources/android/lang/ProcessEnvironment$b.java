package android.lang;

import java.util.Map$Entry;

/* JADX INFO: loaded from: classes.dex */
class ProcessEnvironment$b implements Map$Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map$Entry f1462a;

    public ProcessEnvironment$b(Map$Entry map$Entry) {
        this.f1462a = map$Entry;
    }

    @Override // java.util.Map$Entry
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return ((ProcessEnvironment$h) this.f1462a.getKey()).toString();
    }

    @Override // java.util.Map$Entry
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return ((ProcessEnvironment$g) this.f1462a.getValue()).toString();
    }

    @Override // java.util.Map$Entry
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String setValue(String str) {
        return ((ProcessEnvironment$g) this.f1462a.setValue(ProcessEnvironment$g.c(str))).toString();
    }

    @Override // java.util.Map$Entry
    public boolean equals(Object obj) {
        return (obj instanceof ProcessEnvironment$b) && this.f1462a.equals(((ProcessEnvironment$b) obj).f1462a);
    }

    @Override // java.util.Map$Entry
    public int hashCode() {
        return this.f1462a.hashCode();
    }

    public String toString() {
        return getKey() + '=' + getValue();
    }
}
