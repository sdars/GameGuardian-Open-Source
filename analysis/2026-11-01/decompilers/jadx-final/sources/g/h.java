package g;

/* JADX INFO: loaded from: classes.dex */
public class h extends g.a implements luaj.Globals$a, luaj.Globals$b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g.h f1631b = new g.h();

    protected h() {
    }

    public static void M(luaj.Globals globals) {
        g.h hVar = f1631b;
        globals.k0 = hVar;
        globals.j0 = hVar;
    }

    @Override // luaj.Globals$b
    public luaj.LuaFunction a(luaj.h hVar, java.lang.String str, luaj.LuaValue luaValue) {
        return new luaj.LuaClosure(hVar, luaValue, true);
    }

    @Override // luaj.Globals$a
    public luaj.h b(java.io.InputStream inputStream, java.lang.String str) {
        return new g.h$a().b(inputStream, str);
    }
}
