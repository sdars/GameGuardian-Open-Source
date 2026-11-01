package android.ext;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class b1$h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f624b;

    static {
        int[] iArr = new int[b1$y.values().length];
        f624b = iArr;
        try {
            iArr[b1$y.ROOT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f624b[b1$y.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f624b[b1$y.REFUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[b1$r.values().length];
        f623a = iArr2;
        try {
            iArr2[b1$r.PROCEED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f623a[b1$r.OPEN_SETTINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
