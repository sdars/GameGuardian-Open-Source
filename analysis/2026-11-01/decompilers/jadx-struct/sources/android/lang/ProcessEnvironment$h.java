package android.lang;

/* JADX INFO: loaded from: classes.dex */
class ProcessEnvironment$h extends ProcessEnvironment$a implements Comparable {
    protected ProcessEnvironment$h(String str, byte[] bArr) {
        super(str, bArr);
    }

    public static ProcessEnvironment$h c(String str) {
        ProcessEnvironment.l(str);
        return f(str);
    }

    public static ProcessEnvironment$h d(byte[] bArr) {
        return new ProcessEnvironment$h(new String(bArr), bArr);
    }

    public static ProcessEnvironment$h e(Object obj) {
        return f((String) obj);
    }

    public static ProcessEnvironment$h f(String str) {
        return new ProcessEnvironment$h(str, str.getBytes());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(ProcessEnvironment$h processEnvironment$h) {
        return ProcessEnvironment.f(a(), processEnvironment$h.a());
    }

    @Override // android.lang.ProcessEnvironment$a
    public boolean equals(Object obj) {
        return (obj instanceof ProcessEnvironment$h) && super.equals(obj);
    }
}
