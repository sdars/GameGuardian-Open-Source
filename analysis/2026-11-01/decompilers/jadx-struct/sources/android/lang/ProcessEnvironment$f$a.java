package android.lang;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class ProcessEnvironment$f$a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Iterator f1472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ProcessEnvironment$f f1473b;

    ProcessEnvironment$f$a(ProcessEnvironment$f processEnvironment$f) {
        this.f1473b = processEnvironment$f;
        this.f1472a = processEnvironment$f.f1471a.iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        return ((ProcessEnvironment$g) this.f1472a.next()).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1472a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f1472a.remove();
    }
}
