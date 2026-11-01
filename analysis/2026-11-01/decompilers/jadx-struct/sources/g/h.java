package g;

import java.io.InputStream;
import luaj.Globals;
import luaj.Globals$a;
import luaj.Globals$b;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
public class h extends a implements Globals$a, Globals$b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f1631b = new h();

    protected h() {
    }

    public static void M(Globals globals) {
        h hVar = f1631b;
        globals.k0 = hVar;
        globals.j0 = hVar;
    }

    @Override // luaj.Globals$b
    public LuaFunction a(luaj.h hVar, String str, LuaValue luaValue) {
        return new LuaClosure(hVar, luaValue, true);
    }

    @Override // luaj.Globals$a
    public luaj.h b(InputStream inputStream, String str) {
        return new h$a().b(inputStream, str);
    }
}
