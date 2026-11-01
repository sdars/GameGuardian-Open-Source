package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
class IoLib$a implements LibFunction$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ IoLib f1769a;

    IoLib$a(IoLib ioLib) {
        this.f1769a = ioLib;
    }

    @Override // luaj.lib.LibFunction$a
    public LibFunction a() {
        return new IoLib$IoLibV();
    }
}
