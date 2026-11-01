/*
 * Decompiled with CFR 0.152.
 */
package f;

import luaj.Globals;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.DebugLib;

public class c
extends Varargs {
    private LuaValue b;
    private Varargs c;
    private Varargs d;
    private final Globals e;

    public c(Globals globals, LuaValue luaValue, Varargs varargs) {
        this.e = globals;
        this.b = luaValue;
        this.c = varargs;
    }

    @Override
    public Varargs N() {
        Varargs varargs;
        Varargs varargs2 = varargs = this.d;
        if (varargs == null) {
            LuaValue luaValue = this.e;
            luaValue = luaValue != null ? ((Globals)luaValue).i0 : null;
            LuaValue luaValue2 = this.b;
            Varargs varargs3 = this.c;
            while (true) {
                varargs2 = varargs;
                if (varargs != null) break;
                if (luaValue != null && !luaValue2.f1() && luaValue2.g1()) {
                    ((DebugLib)luaValue).j3(luaValue2.y0(), true);
                }
                if ((varargs2 = luaValue2.D1(varargs3, true)).O()) {
                    varargs3 = (c)varargs2;
                    this.b = luaValue2 = ((c)varargs3).b;
                    this.c = varargs3 = ((c)varargs3).c;
                    continue;
                }
                this.d = varargs2;
                this.b = null;
                this.c = null;
                varargs = varargs2;
            }
        }
        return varargs2;
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public int U() {
        if (this.d == null) {
            this.N();
        }
        return this.d.U();
    }

    @Override
    public Varargs e0(int n3) {
        if (this.d == null) {
            this.N();
        }
        return this.d.e0(n3);
    }

    @Override
    public LuaValue v(int n3) {
        if (this.d == null) {
            this.N();
        }
        return this.d.v(n3);
    }

    @Override
    public LuaValue w() {
        if (this.d == null) {
            this.N();
        }
        return this.d.w();
    }
}

