package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class LuaNumber extends luaj.LuaValue {
    public static luaj.LuaValue P;

    public LuaNumber() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue A2() {
            r0 = this;
            return r0
    }

    @Override // luaj.LuaValue
    public int C2() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // luaj.LuaValue
    public java.lang.String D2() {
            r1 = this;
            java.lang.String r0 = "number"
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaNumber E0() {
            r0 = this;
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaNumber F0(java.lang.String r1) {
            r0 = this;
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue K0(luaj.LuaValue r1) {
            r0 = this;
            luaj.LuaValue r1 = r1.L0(r0)
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue L0(luaj.LuaNumber r2) {
            r1 = this;
            luaj.LuaString r0 = r1.q2()
            luaj.LuaString r2 = r2.q2()
            luaj.LuaValue r2 = r0.M0(r2)
            return r2
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue M0(luaj.LuaString r2) {
            r1 = this;
            luaj.LuaString r0 = r1.q2()
            luaj.LuaValue r2 = r0.M0(r2)
            return r2
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue V0() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaNumber.P
            return r0
    }

    @Override // luaj.LuaValue
    public boolean m1() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // luaj.LuaValue
    public boolean n1() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // luaj.LuaValue
    public int o2(luaj.LuaString r4) {
            r3 = this;
            java.lang.String r4 = r4.toString()
            int r0 = r4.length()
            r1 = 50
            if (r0 <= r1) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
            java.lang.String r4 = r4.substring(r2, r1)
            r0.append(r4)
            java.lang.String r4 = "..."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L22:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "attempt to compare number with string ("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " with '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "')"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
