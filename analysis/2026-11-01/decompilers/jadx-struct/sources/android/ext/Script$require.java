package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$require extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$require(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 2;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        String strZ = varargs.Z(1, "0");
        int iY = varargs.Y(2, 0);
        int iE = h0.e(strZ);
        if (iE > 80000) {
            iE -= 80000;
        }
        if (h0.d() >= iE && ((int) (((1 * 17671.8f) - 1516.8f) + 0.5f)) >= iY) {
            return LuaValue.f1673c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        float f2 = 1;
        sb.append((116.200005f * f2) - 14.8f);
        String string = sb.toString();
        if (iY > 0) {
            string = string + " (" + ((int) (((f2 * 19632.9f) - 3477.9f) + 0.5f)) + ')';
            strZ = strZ + " (" + iY + ')';
        }
        this.e0.T.c0.println(Tools.L1(b2.f(R$string.need_update_to), strZ, string));
        throw new Script$OsExit(0);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.require([string version = nil [, int build = 0]]) -> nil";
    }
}
