package f;

import luaj.LuaString;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LuaString f1563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f1565c;

    public d(LuaString luaString, boolean z, int i) {
        this.f1563a = luaString;
        this.f1564b = z;
        this.f1565c = (short) i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f1564b ? 'v' : 'u'));
        sb.append((int) this.f1565c);
        sb.append(" \"");
        sb.append(String.valueOf(this.f1563a));
        sb.append("\"");
        return sb.toString();
    }
}
