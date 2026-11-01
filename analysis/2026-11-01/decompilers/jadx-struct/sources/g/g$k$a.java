package g;

import luaj.LuaLong;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
class g$k$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    short f1626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    short f1627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    short f1628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    LuaValue f1629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f1630e;

    g$k$a() {
    }

    public LuaValue a() {
        LuaValue luaValue = this.f1629d;
        return luaValue == null ? LuaLong.I2(this.f1630e) : luaValue;
    }

    public void b(LuaValue luaValue) {
        this.f1629d = luaValue;
    }
}
