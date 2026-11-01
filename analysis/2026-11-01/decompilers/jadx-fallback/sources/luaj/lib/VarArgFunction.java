package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class VarArgFunction extends luaj.lib.LibFunction {
    public VarArgFunction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaValue.f1674f
            luaj.Varargs r0 = r1.invoke(r0)
            luaj.LuaValue r0 = r0.w()
            return r0
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r1) {
            r0 = this;
            luaj.Varargs r1 = r0.invoke(r1)
            luaj.LuaValue r1 = r1.w()
            return r1
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2) {
            r0 = this;
            luaj.Varargs r1 = luaj.LuaValue.N2(r1, r2)
            luaj.Varargs r1 = r0.invoke(r1)
            luaj.LuaValue r1 = r1.w()
            return r1
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2, luaj.LuaValue r3) {
            r0 = this;
            luaj.Varargs r1 = luaj.LuaValue.M2(r1, r2, r3)
            luaj.Varargs r1 = r0.invoke(r1)
            luaj.LuaValue r1 = r1.w()
            return r1
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public abstract luaj.Varargs invoke(luaj.Varargs r1);
}
