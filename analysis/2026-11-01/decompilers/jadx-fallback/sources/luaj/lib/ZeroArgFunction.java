package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class ZeroArgFunction extends luaj.lib.LibFunction {
    public ZeroArgFunction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public abstract luaj.LuaValue call();

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r1) {
            r0 = this;
            luaj.LuaValue r1 = r0.call()
            return r1
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2) {
            r0 = this;
            luaj.LuaValue r1 = r0.call()
            return r1
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2, luaj.LuaValue r3) {
            r0 = this;
            luaj.LuaValue r1 = r0.call()
            return r1
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.Varargs invoke(luaj.Varargs r1) {
            r0 = this;
            luaj.LuaValue r1 = r0.call()
            return r1
    }
}
