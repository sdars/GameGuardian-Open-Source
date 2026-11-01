package android.lang;

import java.util.Map$Entry;

/* JADX INFO: loaded from: classes.dex */
class ProcessEnvironment$c$b implements Map$Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f1466a;

    ProcessEnvironment$c$b(Object obj) {
        this.f1466a = obj;
    }

    @Override // java.util.Map$Entry
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ProcessEnvironment$h getKey() {
        return ProcessEnvironment$h.e(((Map$Entry) this.f1466a).getKey());
    }

    @Override // java.util.Map$Entry
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ProcessEnvironment$g getValue() {
        return ProcessEnvironment$g.e(((Map$Entry) this.f1466a).getValue());
    }

    @Override // java.util.Map$Entry
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProcessEnvironment$g setValue(ProcessEnvironment$g processEnvironment$g) {
        throw new UnsupportedOperationException();
    }
}
