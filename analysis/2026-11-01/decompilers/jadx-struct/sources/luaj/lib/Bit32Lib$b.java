package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
class Bit32Lib$b implements LibFunction$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bit32Lib f1748a;

    Bit32Lib$b(Bit32Lib bit32Lib) {
        this.f1748a = bit32Lib;
    }

    @Override // luaj.lib.LibFunction$a
    public LibFunction a() {
        return new Bit32Lib$Bit32Lib2();
    }
}
