package f;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public luaj.LuaString f1556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1558c;

    public b(luaj.LuaString r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f1556a = r1
            r0.f1557b = r2
            r0.f1558c = r3
            return
    }

    public java.lang.String a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            luaj.LuaString r1 = r2.f1556a
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            int r1 = r2.f1557b
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            int r1 = r2.f1558c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a()
            return r0
    }
}
