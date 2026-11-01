package g;

import java.io.InputStream;
import java.util.Hashtable;
import luaj.Globals;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaValue;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class h extends g.a implements Globals.a, Globals.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f1629b = new h();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1630a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Hashtable f1631b = new Hashtable();

        protected a() {
        }

        public LuaString a(LuaString luaString) {
            LuaString luaString2 = (LuaString) this.f1631b.get(luaString);
            if (luaString2 != null) {
                return luaString2;
            }
            this.f1631b.put(luaString, luaString);
            return luaString;
        }

        luaj.h b(InputStream inputStream, String str) {
            g gVar = new g(this, inputStream);
            c cVar = new c();
            gVar.f1593g = cVar;
            gVar.y1(this, inputStream.read(), inputStream, LuaValue.K2(str));
            luaj.h hVar = new luaj.h();
            cVar.f1573b = hVar;
            hVar.f1727g = LuaValue.K2(str);
            gVar.a1(cVar);
            boolean z = false;
            g.a.C(cVar.f1575d == null);
            g.d dVar = gVar.l;
            if (dVar == null || (dVar.f1602b == 0 && dVar.f1604d == 0 && dVar.f1606f == 0)) {
                z = true;
            }
            g.a.C(z);
            return cVar.f1573b;
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

    protected h() {
    }

    public static void M(Globals globals) {
        h hVar = f1629b;
        globals.k0 = hVar;
        globals.j0 = hVar;
    }

    @Override // luaj.Globals.b
    public LuaFunction a(luaj.h hVar, String str, LuaValue luaValue) {
        return new LuaClosure(hVar, luaValue, true);
    }

    @Override // luaj.Globals.a
    public luaj.h b(InputStream inputStream, String str) {
        return new a().b(inputStream, str);
    }
}
