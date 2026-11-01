package android.lang;

import java.util.Iterator;
import java.util.Map$Entry;

/* JADX INFO: loaded from: classes.dex */
class ProcessEnvironment$c$a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Iterator f1464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ProcessEnvironment$c f1465b;

    ProcessEnvironment$c$a(ProcessEnvironment$c processEnvironment$c) {
        this.f1465b = processEnvironment$c;
        this.f1464a = processEnvironment$c.f1463a.iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map$Entry next() {
        return new ProcessEnvironment$b((Map$Entry) this.f1464a.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1464a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f1464a.remove();
    }
}
