package android.ext;

import java.io.Writer;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class Script$searchNumber extends Script$BusyApiFunction {
    final /* synthetic */ Script f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$searchNumber(Script script) {
        super(script);
        this.f0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected final int Y2() {
        return 7;
    }

    @Override // android.ext.Script$ApiFunction
    public final Varargs c3(Varargs varargs) {
        this.f0.y3();
        if ((this instanceof Script$refineNumber) && MainService.instance.p0 == 0) {
            return LuaValue.f1674d;
        }
        try {
            if (i2.n(this.f0.t3(), Script.D3(varargs.E(1)), Script.f3(varargs.Y(2, 127)), varargs.V(3, false), Script.e3(varargs.Y(4, 536870912)), varargs.a0(5, 0L), varargs.a0(6, -1L), false, varargs.a0(7, 0L))) {
                return LuaValue.f1674d;
            }
            return null;
        } catch (NumberFormatException e2) {
            return LuaValue.K2(Script.V3(e2));
        }
    }

    @Override // android.ext.Script$ApiFunction
    protected final boolean d3(Writer writer, int i, LuaValue luaValue) {
        if (i != 2) {
            if (i != 4) {
                if ((i == 5 || i == 6) && luaValue.j1()) {
                    return Script$ApiFunction.h3(writer, luaValue);
                }
            } else if (luaValue.h1()) {
                return Script$ApiFunction.g3(writer, this.f0.g0.f374d, luaValue);
            }
        } else if (luaValue.h1()) {
            return Script$ApiFunction.g3(writer, this.f0.g0.f372b, luaValue);
        }
        return super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    final String k3() {
        return this instanceof Script$refineNumber ? "gg.searchNumber(string text [, int type = gg.TYPE_AUTO [, bool encrypted = false [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error".replace("searchNumber", "refineNumber") : "gg.searchNumber(string text [, int type = gg.TYPE_AUTO [, bool encrypted = false [, int sign = gg.SIGN_EQUAL [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]]]) -> true || string with error";
    }
}
