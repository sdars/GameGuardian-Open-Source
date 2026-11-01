package ggf;

import luaj.Globals;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.DebugLib;

/* JADX INFO: loaded from: classes.dex */
public class c extends Varargs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LuaValue f1561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Varargs f1562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Varargs f1563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Globals f1564e;

    public c(Globals globals, LuaValue luaValue, Varargs varargs) {
        this.f1564e = globals;
        this.f1561b = luaValue;
        this.f1562c = varargs;
    }

    @Override // luaj.Varargs
    public Varargs N() {
        Varargs varargs = this.f1563d;
        if (varargs == null) {
            Globals globals = this.f1564e;
            DebugLib debugLib = globals != null ? globals.i0 : null;
            LuaValue luaValue = this.f1561b;
            Varargs varargs2 = this.f1562c;
            while (varargs == null) {
                if (debugLib != null && !luaValue.f1() && luaValue.g1()) {
                    debugLib.j3(luaValue.y0(), true);
                }
                Varargs varargsD1 = luaValue.D1(varargs2, true);
                if (varargsD1.O()) {
                    c cVar = (c) varargsD1;
                    luaValue = cVar.f1561b;
                    this.f1561b = luaValue;
                    varargs2 = cVar.f1562c;
                    this.f1562c = varargs2;
                } else {
                    this.f1563d = varargsD1;
                    this.f1561b = null;
                    this.f1562c = null;
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
        if (this.f1563d == null) {
            N();
        }
        return this.f1563d.U();
    }

    @Override // luaj.Varargs
    public Varargs e0(int i) {
        if (this.f1563d == null) {
            N();
        }
        return this.f1563d.e0(i);
    }

    @Override // luaj.Varargs
    public LuaValue v(int i) {
        if (this.f1563d == null) {
            N();
        }
        return this.f1563d.v(i);
    }

    @Override // luaj.Varargs
    public LuaValue w() {
        if (this.f1563d == null) {
            N();
        }
        return this.f1563d.w();
    }
}
