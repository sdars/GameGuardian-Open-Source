package android.ext;

import luaj.LuaClosure;

/* JADX INFO: loaded from: classes.dex */
public abstract class Script$DebugFunction extends Script$ApiFunction {
    protected LuaClosure e0 = null;

    public void l3(LuaClosure luaClosure) {
        this.e0 = luaClosure;
    }
}
