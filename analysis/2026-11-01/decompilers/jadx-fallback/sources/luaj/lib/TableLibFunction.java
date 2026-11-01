package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class TableLibFunction extends luaj.lib.LibFunction {
    TableLibFunction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call() {
            r2 = this;
            r0 = 1
            java.lang.String r1 = "table expected, got no value"
            luaj.LuaValue r0 = luaj.LuaValue.k0(r0, r1)
            return r0
    }
}
