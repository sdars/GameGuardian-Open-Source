package luaj.lib;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$dump extends VarArgFunction {
    StringLib$dump() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaFunction luaFunctionC = varargs.C(1);
        if (!(luaFunctionC instanceof LuaClosure)) {
            throw new luaj.d("unable to dump given function");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g.b.a(((LuaClosure) luaFunctionC).R, byteArrayOutputStream, varargs.V(2, false), varargs.V(3, false));
            return LuaString.o3(byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            return LuaValue.R0(e2.getMessage());
        }
    }
}
