package g;

import java.io.InputStream;
import java.util.Hashtable;
import luaj.LuaString;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
class h$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1632a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Hashtable f1633b = new Hashtable();

    protected h$a() {
    }

    public LuaString a(LuaString luaString) {
        LuaString luaString2 = (LuaString) this.f1633b.get(luaString);
        if (luaString2 != null) {
            return luaString2;
        }
        this.f1633b.put(luaString, luaString);
        return luaString;
    }

    luaj.h b(InputStream inputStream, String str) {
        g gVar = new g(this, inputStream);
        c cVar = new c();
        gVar.f1595g = cVar;
        gVar.y1(this, inputStream.read(), inputStream, LuaValue.K2(str));
        luaj.h hVar = new luaj.h();
        cVar.f1575b = hVar;
        hVar.f1729g = LuaValue.K2(str);
        gVar.a1(cVar);
        boolean z = false;
        a.C(cVar.f1577d == null);
        g$d g_d = gVar.l;
        if (g_d == null || (g_d.f1604b == 0 && g_d.f1606d == 0 && g_d.f1608f == 0)) {
            z = true;
        }
        a.C(z);
        return cVar.f1575b;
    }

    public LuaString c(String str) {
        return a(LuaString.K2(str));
    }

    public LuaString d(LuaString luaString) {
        return a(luaString);
    }

    public String e(String str) {
        return str;
    }
}
