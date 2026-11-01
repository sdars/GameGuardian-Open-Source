package android.lang;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class ProcessEnvironment$f extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f1471a;

    public ProcessEnvironment$f(Collection collection) {
        this.f1471a = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f1471a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f1471a.contains(ProcessEnvironment$g.e(obj));
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof ProcessEnvironment$f) && this.f1471a.equals(((ProcessEnvironment$f) obj).f1471a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f1471a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f1471a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new ProcessEnvironment$f$a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f1471a.remove(ProcessEnvironment$g.e(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f1471a.size();
    }
}
