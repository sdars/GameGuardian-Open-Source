package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
class Bit32Lib$a implements LibFunction$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bit32Lib f1747a;

    Bit32Lib$a(Bit32Lib bit32Lib) {
        this.f1747a = bit32Lib;
    }

    @Override // luaj.lib.LibFunction$a
    public LibFunction a() {
        return new Bit32Lib$Bit32LibV();
    }
}
