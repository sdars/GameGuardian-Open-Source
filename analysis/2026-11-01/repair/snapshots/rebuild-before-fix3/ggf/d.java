package ggf;

import luaj.LuaString;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LuaString f1565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f1567c;

    public d(LuaString luaString, boolean z, int i) {
        this.f1565a = luaString;
        this.f1566b = z;
        this.f1567c = (short) i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f1566b ? 'v' : 'u'));
        sb.append((int) this.f1567c);
        sb.append(" \"");
        sb.append(String.valueOf(this.f1565a));
        sb.append("\"");
        return sb.toString();
    }
}
