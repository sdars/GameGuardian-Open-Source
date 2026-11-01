package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class LibFunction extends luaj.LuaFunction {
    protected int R;
    protected java.lang.String S;

    protected interface a {
        luaj.lib.LibFunction a();
    }

    protected LibFunction() {
            r0 = this;
            r0.<init>()
            return
    }

    protected void V2(luaj.LuaValue r2, luaj.lib.LibFunction.a r3, java.lang.String[] r4) {
            r1 = this;
            r0 = 0
            r1.W2(r2, r3, r4, r0)
            return
    }

    protected void W2(luaj.LuaValue r5, luaj.lib.LibFunction.a r6, java.lang.String[] r7, int r8) {
            r4 = this;
            int r0 = r7.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L16
            luaj.lib.LibFunction r2 = r6.a()
            int r3 = r8 + r1
            r2.R = r3
            r3 = r7[r1]
            r2.S = r3
            r5.i2(r3, r2)
            int r1 = r1 + 1
            goto L2
        L16:
            return
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue call() {
            r2 = this;
            r0 = 1
            java.lang.String r1 = "value expected"
            luaj.LuaValue r0 = luaj.LuaValue.k0(r0, r1)
            return r0
    }

    @Override // luaj.LuaValue
    public abstract luaj.LuaValue call(luaj.LuaValue r1);

    @Override // luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2) {
            r0 = this;
            luaj.LuaValue r1 = r0.call(r1)
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2, luaj.LuaValue r3) {
            r0 = this;
            luaj.LuaValue r1 = r0.call(r1, r2)
            return r1
    }

    public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2, luaj.LuaValue r3, luaj.LuaValue r4) {
            r0 = this;
            luaj.LuaValue r1 = r0.call(r1, r2, r3)
            return r1
    }

    @Override // luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
            r2 = this;
            java.lang.String r0 = r2.S
            if (r0 == 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "function: "
            r0.append(r1)
            java.lang.String r1 = r2.S
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L1c
        L18:
            java.lang.String r0 = super.g0()
        L1c:
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.Varargs invoke(luaj.Varargs r5) {
            r4 = this;
            int r0 = r5.U()
            if (r0 == 0) goto L4c
            r1 = 1
            if (r0 == r1) goto L43
            r1 = 2
            if (r0 == r1) goto L36
            r2 = 3
            if (r0 == r2) goto L25
            luaj.LuaValue r0 = r5.w()
            luaj.LuaValue r1 = r5.v(r1)
            luaj.LuaValue r2 = r5.v(r2)
            r3 = 4
            luaj.LuaValue r5 = r5.v(r3)
            luaj.LuaValue r5 = r4.call(r0, r1, r2, r5)
            return r5
        L25:
            luaj.LuaValue r0 = r5.w()
            luaj.LuaValue r1 = r5.v(r1)
            luaj.LuaValue r5 = r5.v(r2)
            luaj.LuaValue r5 = r4.call(r0, r1, r5)
            return r5
        L36:
            luaj.LuaValue r0 = r5.w()
            luaj.LuaValue r5 = r5.v(r1)
            luaj.LuaValue r5 = r4.call(r0, r5)
            return r5
        L43:
            luaj.LuaValue r5 = r5.w()
            luaj.LuaValue r5 = r4.call(r5)
            return r5
        L4c:
            luaj.LuaValue r5 = r4.call()
            return r5
    }
}
