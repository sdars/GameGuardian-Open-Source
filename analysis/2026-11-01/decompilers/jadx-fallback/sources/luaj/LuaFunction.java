package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class LuaFunction extends luaj.LuaValue {
    public static luaj.LuaValue P;
    private static final java.lang.String Q = null;

    static {
            java.lang.Class<android.ext.Script> r0 = android.ext.Script.class
            java.lang.String r0 = r0.getName()
            luaj.LuaFunction.Q = r0
            return
    }

    public LuaFunction() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String U2(java.lang.String r7) {
            r0 = 36
            int r0 = r7.lastIndexOf(r0)
            r1 = 46
            int r2 = r7.lastIndexOf(r1)
            int r3 = java.lang.Math.max(r2, r0)
            int r4 = r3 + 1
            char r5 = r7.charAt(r4)
            r6 = 95
            if (r5 != r6) goto L1c
            int r4 = r3 + 2
        L1c:
            java.lang.String r3 = r7.substring(r4)
            java.lang.String r4 = luaj.LuaFunction.Q
            boolean r4 = r7.startsWith(r4)
            if (r4 == 0) goto L2b
            java.lang.String r7 = "gg."
            goto L5c
        L2b:
            if (r0 <= r2) goto L5b
            java.lang.String r4 = "Lib$"
            boolean r4 = r7.contains(r4)
            if (r4 == 0) goto L5b
            java.lang.String r4 = "BaseLib$"
            boolean r4 = r7.contains(r4)
            if (r4 != 0) goto L5b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r2 = r2 + 1
            int r0 = r0 + (-3)
            java.lang.String r7 = r7.substring(r2, r0)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r7 = r7.toLowerCase(r0)
            r4.append(r7)
            r4.append(r1)
            java.lang.String r7 = r4.toString()
            goto L5c
        L5b:
            r7 = 0
        L5c:
            if (r7 != 0) goto L5f
            goto L6e
        L5f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L6e:
            return r3
    }

    @Override // luaj.LuaValue
    public int C2() {
            r1 = this;
            r0 = 6
            return r0
    }

    @Override // luaj.LuaValue
    public java.lang.String D2() {
            r1 = this;
            java.lang.String r0 = "function"
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaFunction G1(luaj.LuaFunction r1) {
            r0 = this;
            return r0
    }

    public java.lang.String S2() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = U2(r0)
            return r0
    }

    public java.lang.String T2() {
            r1 = this;
            java.lang.String r0 = r1.S2()
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue V0() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaFunction.P
            return r0
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "function: "
            r0.append(r1)
            java.lang.String r1 = r2.S2()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // luaj.LuaValue
    public boolean g1() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaString q2() {
            r1 = this;
            java.lang.String r0 = r1.g0()
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaFunction y0() {
            r0 = this;
            return r0
    }
}
