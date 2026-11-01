package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public final class LuaBoolean extends luaj.LuaValue {
    public static luaj.LuaValue Q;
    public final boolean P;

    LuaBoolean(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.P = r1
            return
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue B1() {
            r1 = this;
            boolean r0 = r1.P
            if (r0 == 0) goto L7
            luaj.LuaBoolean r0 = luaj.LuaValue.f1673e
            goto L9
        L7:
            luaj.LuaBoolean r0 = luaj.LuaValue.f1672d
        L9:
            return r0
    }

    @Override // luaj.LuaValue
    public int C2() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // luaj.LuaValue
    public java.lang.String D2() {
            r1 = this;
            java.lang.String r0 = "boolean"
            return r0
    }

    @Override // luaj.LuaValue
    public boolean E1(boolean r1) {
            r0 = this;
            boolean r1 = r0.P
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue V0() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaBoolean.Q
            return r0
    }

    @Override // luaj.LuaValue
    public boolean e1() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
            r1 = this;
            boolean r0 = r1.P
            if (r0 == 0) goto L7
            java.lang.String r0 = "true"
            goto L9
        L7:
            java.lang.String r0 = "false"
        L9:
            return r0
    }

    @Override // luaj.LuaValue
    public boolean v0() {
            r1 = this;
            boolean r0 = r1.P
            return r0
    }

    @Override // luaj.LuaValue
    public boolean w2() {
            r1 = this;
            boolean r0 = r1.P
            return r0
    }
}
