package android.ext;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import luaj.LuaClosure;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$internal2 extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$internal2(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 2;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        LuaClosure luaClosureA = varargs.A(1);
        String strE = varargs.E(2);
        Varargs varargsK2 = LuaValue.f1674d;
        PrintStream printStream = luaj.g.f1716b;
        try {
            luaj.g.f1716b = new PrintStream(new BufferedOutputStream(new FileOutputStream(strE), 65536));
            luaj.g.A(luaClosureA.R);
            luaj.g.f1716b.close();
            luaj.g.M(luaClosureA, strE + ".tail");
        } catch (Throwable th) {
            e1.l("Failed dump " + luaClosureA + " into '" + strE + '\'', th);
            varargsK2 = LuaValue.K2(Script.V3(th));
        }
        luaj.g.f1716b = printStream;
        return varargsK2;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "do not use";
    }
}
