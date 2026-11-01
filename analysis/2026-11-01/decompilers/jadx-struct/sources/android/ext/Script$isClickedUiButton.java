package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$isClickedUiButton extends Script$ApiFunction {
    Script$isClickedUiButton() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        MainService mainService = MainService.instance;
        LuaValue luaValue = LuaValue.f1673c;
        if (mainService.f214d == null) {
            return luaValue;
        }
        if (!mainService.f215e) {
            return LuaValue.f1675e;
        }
        mainService.f215e = false;
        return LuaValue.f1674d;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.isClickedUiButton() -> bool || nil";
    }
}
