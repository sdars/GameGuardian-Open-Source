package g;

/* JADX INFO: loaded from: classes.dex */
class g$b implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    char[] f1596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1597b;

    g$b() {
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f1596a[i];
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f1597b;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return null;
    }
}
