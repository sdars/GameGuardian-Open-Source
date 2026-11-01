package lasm;

import e.f;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
class LasmBase$Internal extends LuaValue {
    int P;
    f Q;

    LasmBase$Internal(f fVar, int i) {
        this.Q = fVar;
        this.P = i;
    }

    @Override // luaj.LuaValue
    public int C2() {
        return this.P;
    }

    @Override // luaj.LuaValue
    public String D2() {
        return null;
    }
}
