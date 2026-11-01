package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
class IoLib$b implements LibFunction$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ IoLib f1770a;

    IoLib$b(IoLib ioLib) {
        this.f1770a = ioLib;
    }

    @Override // luaj.lib.LibFunction$a
    public LibFunction a() {
        return new IoLib$IoLibV();
    }
}
