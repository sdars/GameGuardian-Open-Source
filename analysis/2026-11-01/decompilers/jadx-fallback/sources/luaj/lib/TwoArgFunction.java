package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class TwoArgFunction extends luaj.lib.LibFunction {
    public TwoArgFunction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public final luaj.LuaValue call() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
            luaj.LuaValue r0 = r1.call(r0, r0)
            return r0
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public final luaj.LuaValue call(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
            luaj.LuaValue r2 = r1.call(r2, r0)
            return r2
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public abstract luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2);

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2, luaj.LuaValue r3) {
            r0 = this;
            luaj.LuaValue r1 = r0.call(r1, r2)
            return r1
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.Varargs invoke(luaj.Varargs r3) {
            r2 = this;
            luaj.LuaValue r0 = r3.w()
            r1 = 2
            luaj.LuaValue r3 = r3.v(r1)
            luaj.LuaValue r3 = r2.call(r0, r3)
            return r3
    }
}
