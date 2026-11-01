package f;

import luaj.Globals;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.DebugLib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c extends Varargs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LuaValue f1559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Varargs f1560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Varargs f1561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Globals f1562e;

    public c(Globals globals, LuaValue luaValue, Varargs varargs) {
        this.f1562e = globals;
        this.f1559b = luaValue;
        this.f1560c = varargs;
    }

    @Override // luaj.Varargs
    public Varargs N() {
        Varargs varargs = this.f1561d;
        if (varargs == null) {
            Globals globals = this.f1562e;
            DebugLib debugLib = globals != null ? globals.i0 : null;
            LuaValue luaValue = this.f1559b;
            Varargs varargs2 = this.f1560c;
            while (varargs == null) {
                if (debugLib != null && !luaValue.f1() && luaValue.g1()) {
                    debugLib.j3(luaValue.y0(), true);
                }
                Varargs varargsD1 = luaValue.D1(varargs2, true);
                if (varargsD1.O()) {
                    c cVar = (c) varargsD1;
                    luaValue = cVar.f1559b;
                    this.f1559b = luaValue;
                    varargs2 = cVar.f1560c;
                    this.f1560c = varargs2;
                } else {
                    this.f1561d = varargsD1;
                    this.f1559b = null;
                    this.f1560c = null;
                    varargs = varargsD1;
                }
            }
        }
        return varargs;
    }

    @Override // luaj.Varargs
    public boolean O() {
        return true;
    }

    @Override // luaj.Varargs
    public int U() {
        if (this.f1561d == null) {
            N();
        }
        return this.f1561d.U();
    }

    @Override // luaj.Varargs
    public Varargs e0(int i) {
        if (this.f1561d == null) {
            N();
        }
        return this.f1561d.e0(i);
    }

    @Override // luaj.Varargs
    public LuaValue v(int i) {
        if (this.f1561d == null) {
            N();
        }
        return this.f1561d.v(i);
    }

    @Override // luaj.Varargs
    public LuaValue w() {
        if (this.f1561d == null) {
            N();
        }
        return this.f1561d.w();
    }
}
