package f;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public luaj.LuaString f1563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f1565c;

    public d(luaj.LuaString r1, boolean r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f1563a = r1
            r0.f1564b = r2
            short r1 = (short) r3
            r0.f1565c = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f1564b
            if (r1 == 0) goto Lc
            r1 = 118(0x76, float:1.65E-43)
            goto Le
        Lc:
            r1 = 117(0x75, float:1.64E-43)
        Le:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            short r1 = r2.f1565c
            r0.append(r1)
            java.lang.String r1 = " \""
            r0.append(r1)
            luaj.LuaString r1 = r2.f1563a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
