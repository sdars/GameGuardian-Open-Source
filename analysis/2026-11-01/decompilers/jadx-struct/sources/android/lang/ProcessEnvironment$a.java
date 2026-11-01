package android.lang;

/* JADX INFO: loaded from: classes.dex */
abstract class ProcessEnvironment$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f1460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final byte[] f1461b;

    protected ProcessEnvironment$a(String str, byte[] bArr) {
        this.f1460a = str;
        this.f1461b = bArr;
    }

    public byte[] a() {
        return this.f1461b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ProcessEnvironment$a) && ProcessEnvironment.g(a(), ((ProcessEnvironment$a) obj).a());
    }

    public int hashCode() {
        return ProcessEnvironment.h(a());
    }

    public String toString() {
        return this.f1460a;
    }
}
