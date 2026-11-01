/*
 * Decompiled with CFR 0.152.
 */
package g;

import g.c;
import g.g;
import java.io.InputStream;
import java.util.Hashtable;
import luaj.Globals;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaValue;

public class h
extends g.a
implements Globals.a,
Globals.b {
    public static final h b = new h();

    protected h() {
    }

    public static void M(Globals globals) {
        h h4 = b;
        globals.k0 = h4;
        globals.j0 = h4;
    }

    @Override
    public LuaFunction a(luaj.h h4, String string2, LuaValue luaValue) {
        return new LuaClosure(h4, luaValue, true);
    }

    @Override
    public luaj.h b(InputStream inputStream, String string2) {
        return new a().b(inputStream, string2);
    }

    static class a {
        int a = 0;
        private Hashtable b = new Hashtable();

        protected a() {
        }

        public LuaString a(LuaString luaString) {
            LuaString luaString2 = (LuaString)this.b.get(luaString);
            if (luaString2 != null) {
                return luaString2;
            }
            this.b.put(luaString, luaString);
            return luaString;
        }

        luaj.h b(InputStream object, String string2) {
            boolean bl;
            c c4;
            block3: {
                block2: {
                    g g4 = new g(this, (InputStream)object);
                    g4.g = c4 = new c();
                    g4.y1(this, ((InputStream)object).read(), (InputStream)object, LuaValue.K2(string2));
                    c4.b = object = new luaj.h();
                    ((luaj.h)object).g = LuaValue.K2(string2);
                    g4.a1(c4);
                    object = c4.d;
                    boolean bl2 = false;
                    bl = object == null;
                    g.a.C(bl);
                    object = g4.l;
                    if (object == null) break block2;
                    bl = bl2;
                    if (((g.d)object).b != 0) break block3;
                    bl = bl2;
                    if (((g.d)object).d != 0) break block3;
                    bl = bl2;
                    if (((g.d)object).f != 0) break block3;
                }
                bl = true;
            }
            g.a.C(bl);
            return c4.b;
        }

        public LuaString c(String string2) {
            return this.a(LuaString.K2(string2));
        }

        public LuaString d(LuaString luaString) {
            return this.a(luaString);
        }

        public String e(String string2) {
            return string2;
        }
    }
}

