package android.lang;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class ProcessEnvironment$c extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f1463a;

    public ProcessEnvironment$c(Set set) {
        this.f1463a = set;
    }

    private static Map$Entry b(Object obj) {
        return obj instanceof ProcessEnvironment$b ? ((ProcessEnvironment$b) obj).f1462a : new ProcessEnvironment$c$b(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f1463a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f1463a.contains(b(obj));
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return (obj instanceof ProcessEnvironment$c) && this.f1463a.equals(((ProcessEnvironment$c) obj).f1463a);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f1463a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1463a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new ProcessEnvironment$c$a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f1463a.remove(b(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f1463a.size();
    }
}
