package g;

/* JADX INFO: loaded from: classes.dex */
class h$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1632a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.Hashtable f1633b = new java.util.Hashtable();

    protected h$a() {
    }

    public luaj.LuaString a(luaj.LuaString luaString) {
        luaj.LuaString luaString2 = (luaj.LuaString) this.f1633b.get(luaString);
        if (luaString2 != null) {
            return luaString2;
        }
        this.f1633b.put(luaString, luaString);
        return luaString;
    }

    luaj.h b(java.io.InputStream inputStream, java.lang.String str) {
        g.g gVar = new g.g(this, inputStream);
        g.c cVar = new g.c();
        gVar.f1595g = cVar;
        gVar.y1(this, inputStream.read(), inputStream, luaj.LuaValue.K2(str));
        luaj.h hVar = new luaj.h();
        cVar.f1575b = hVar;
        hVar.f1729g = luaj.LuaValue.K2(str);
        gVar.a1(cVar);
        boolean z = false;
        g.a.C(cVar.f1577d == null);
        g.g$d g_d = gVar.l;
        if (g_d == null || (g_d.f1604b == 0 && g_d.f1606d == 0 && g_d.f1608f == 0)) {
            z = true;
        }
        g.a.C(z);
        return cVar.f1575b;
    }

    public luaj.LuaString c(java.lang.String str) {
        return a(luaj.LuaString.K2(str));
    }

    public luaj.LuaString d(luaj.LuaString luaString) {
        return a(luaString);
    }

    public java.lang.String e(java.lang.String str) {
        return str;
    }
}
