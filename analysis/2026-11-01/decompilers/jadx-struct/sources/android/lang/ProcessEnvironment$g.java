package android.lang;

/* JADX INFO: loaded from: classes.dex */
class ProcessEnvironment$g extends ProcessEnvironment$a implements Comparable {
    protected ProcessEnvironment$g(String str, byte[] bArr) {
        super(str, bArr);
    }

    public static ProcessEnvironment$g c(String str) {
        ProcessEnvironment.k(str);
        return f(str);
    }

    public static ProcessEnvironment$g d(byte[] bArr) {
        return new ProcessEnvironment$g(new String(bArr), bArr);
    }

    public static ProcessEnvironment$g e(Object obj) {
        return f((String) obj);
    }

    public static ProcessEnvironment$g f(String str) {
        return new ProcessEnvironment$g(str, str.getBytes());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(ProcessEnvironment$g processEnvironment$g) {
        return ProcessEnvironment.f(a(), processEnvironment$g.a());
    }

    @Override // android.lang.ProcessEnvironment$a
    public boolean equals(Object obj) {
        return (obj instanceof ProcessEnvironment$g) && super.equals(obj);
    }
}
