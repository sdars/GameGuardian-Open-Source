package android.ext;

import java.io.Writer;
import luaj.Globals;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.VarArgFunction;

/* JADX INFO: loaded from: classes.dex */
final class Script$wrap extends VarArgFunction {
    final LuaValue T;
    final String U;
    final int V;
    final /* synthetic */ Script W;

    Script$wrap(Script script, String str, LuaValue luaValue, int i) {
        this.W = script;
        this.T = luaValue;
        this.U = str;
        this.V = i;
    }

    @Override // luaj.lib.LibFunction, luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
    public String g0() {
        return this.T.g0();
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        Script$DebugLog script$DebugLog = Script.w0;
        Writer writer = script$DebugLog == null ? null : script$DebugLog.f378a;
        if (writer != null) {
            long jNanoTime = System.nanoTime();
            try {
                writer.write(this.U);
                writer.write("(");
                int iU = varargs.U();
                int i = this.V;
                if (i >= 0 && iU > i) {
                    iU = i;
                }
                for (int i2 = 1; i2 <= iU; i2++) {
                    if (i2 != 1) {
                        writer.write(", ");
                    }
                    Script$ApiFunction.e3(null, writer, i2, varargs.v(i2));
                }
                writer.write(")\n");
            } catch (Throwable th) {
                e1.s("Failed write log for " + this.U, th);
            }
            Globals globals = script$DebugLog.f379b;
            globals.b0 = (int) (((long) globals.b0) + ((System.nanoTime() - jNanoTime) / 1000000));
        }
        return this.T.invoke(varargs);
    }
}
