package android.ext;

/* JADX INFO: loaded from: classes.dex */
class Tools$b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f502a = new Tools$b0$a();

    private Tools$b0() {
    }

    /* synthetic */ Tools$b0(Tools$j tools$j) {
        this();
    }

    public void a(int i) {
        ThreadLocal threadLocal = f502a;
        threadLocal.set(Integer.valueOf((~i) & ((Integer) threadLocal.get()).intValue()));
    }

    public boolean b(int i) {
        ThreadLocal threadLocal = f502a;
        int iIntValue = ((Integer) threadLocal.get()).intValue();
        if ((iIntValue & i) != 0) {
            return false;
        }
        threadLocal.set(Integer.valueOf(i | iIntValue));
        return true;
    }
}
